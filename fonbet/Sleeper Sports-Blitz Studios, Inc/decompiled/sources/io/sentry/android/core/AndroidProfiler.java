package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryUUID;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class AndroidProfiler {
    private static final int BUFFER_SIZE_BYTES = 3000000;
    private static final int PROFILING_TIMEOUT_MILLIS = 30000;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private String frameMetricsCollectorId;
    private final int intervalUs;
    private final ILogger logger;
    private final LazyEvaluator.Evaluator<ISentryExecutorService> timeoutExecutorServiceSupplier;
    private final File traceFilesDir;
    private long profileStartNanos = 0;
    private Future<?> scheduledFinish = null;
    private File traceFile = null;
    private final ArrayDeque<ProfileMeasurementValue> screenFrameRateMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> slowFrameRenderMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> frozenFrameRenderMeasurements = new ArrayDeque<>();
    private final Map<String, ProfileMeasurement> measurementsMap = new HashMap();
    private volatile boolean isRunning = false;
    protected final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;
        public final Date startTimestamp;

        public ProfileStartData(long j, long j2, Date date) {
            this.startNanos = j;
            this.startCpuMillis = j2;
            this.startTimestamp = date;
        }
    }

    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;
        public final Map<String, ProfileMeasurement> measurementsMap;
        public final File traceFile;

        public ProfileEndData(long j, long j2, boolean z, File file, Map<String, ProfileMeasurement> map) {
            this.endNanos = j;
            this.traceFile = file;
            this.endCpuMillis = j2;
            this.measurementsMap = map;
            this.didTimeout = z;
        }
    }

    public AndroidProfiler(String str, int i, SentryFrameMetricsCollector sentryFrameMetricsCollector, LazyEvaluator.Evaluator<ISentryExecutorService> evaluator, ILogger iLogger) {
        this.traceFilesDir = new File((String) Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.timeoutExecutorServiceSupplier = evaluator;
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
    }

    public ProfileStartData start() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.intervalUs == 0) {
                this.logger.log(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(this.intervalUs));
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            this.traceFile = new File(this.traceFilesDir, SentryUUID.generateSentryId() + ".trace");
            this.measurementsMap.clear();
            this.screenFrameRateMeasurements.clear();
            this.slowFrameRenderMeasurements.clear();
            this.frozenFrameRenderMeasurements.clear();
            this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
                float lastRefreshRate = 0.0f;

                @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
                public void onFrameMetricCollected(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
                    long nanoTimestamp = new SentryNanotimeDate().nanoTimestamp();
                    long nanoTime = ((j2 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - AndroidProfiler.this.profileStartNanos;
                    if (nanoTime < 0) {
                        return;
                    }
                    if (z2) {
                        AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(nanoTime), Long.valueOf(j3), nanoTimestamp));
                    } else if (z) {
                        AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(nanoTime), Long.valueOf(j3), nanoTimestamp));
                    }
                    if (f != this.lastRefreshRate) {
                        this.lastRefreshRate = f;
                        AndroidProfiler.this.screenFrameRateMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(nanoTime), Float.valueOf(f), nanoTimestamp));
                    }
                }
            });
            try {
                LazyEvaluator.Evaluator<ISentryExecutorService> evaluator = this.timeoutExecutorServiceSupplier;
                if (evaluator != null) {
                    this.scheduledFinish = evaluator.evaluate().schedule(new Runnable() { // from class: io.sentry.android.core.AndroidProfiler$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidProfiler.this.m13355lambda$start$0$iosentryandroidcoreAndroidProfiler();
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.logger.log(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.profileStartNanos = SystemClock.elapsedRealtimeNanos();
            Date currentDateTime = DateUtils.getCurrentDateTime();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.traceFile.getPath(), BUFFER_SIZE_BYTES, this.intervalUs);
                this.isRunning = true;
                ProfileStartData profileStartData = new ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
                if (acquire != null) {
                    acquire.close();
                }
                return profileStartData;
            } catch (Throwable th) {
                endAndCollect(false, null);
                this.logger.log(SentryLevel.ERROR, "Unable to start a profile: ", th);
                this.isRunning = false;
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
        } finally {
        }
    }

    /* renamed from: lambda$start$0$io-sentry-android-core-AndroidProfiler, reason: not valid java name */
    /* synthetic */ void m13355lambda$start$0$iosentryandroidcoreAndroidProfiler() {
        endAndCollect(true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #3 {all -> 0x00bb, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0020, B:13:0x002e, B:15:0x0041, B:19:0x0052, B:22:0x005c, B:23:0x006b, B:25:0x0073, B:26:0x0081, B:28:0x0089, B:29:0x0099, B:31:0x00a0, B:32:0x00a6, B:43:0x00b8, B:44:0x00ba, B:11:0x001d, B:39:0x0024), top: B:2:0x0006, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00bb, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0020, B:13:0x002e, B:15:0x0041, B:19:0x0052, B:22:0x005c, B:23:0x006b, B:25:0x0073, B:26:0x0081, B:28:0x0089, B:29:0x0099, B:31:0x00a0, B:32:0x00a6, B:43:0x00b8, B:44:0x00ba, B:11:0x001d, B:39:0x0024), top: B:2:0x0006, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfileEndData endAndCollect(boolean z, List<PerformanceCollectionData> list) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiler not running", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                    this.isRunning = false;
                    this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    if (this.traceFile != null) {
                    }
                } catch (Throwable th) {
                }
            }
            this.isRunning = false;
            this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime2 = Process.getElapsedCpuTime();
            if (this.traceFile != null) {
                this.logger.log(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (!this.slowFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SLOW_FRAME_RENDERS, new ProfileMeasurement("nanosecond", this.slowFrameRenderMeasurements));
            }
            if (!this.frozenFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_FROZEN_FRAME_RENDERS, new ProfileMeasurement("nanosecond", this.frozenFrameRenderMeasurements));
            }
            if (!this.screenFrameRateMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SCREEN_FRAME_RATES, new ProfileMeasurement(ProfileMeasurement.UNIT_HZ, this.screenFrameRateMeasurements));
            }
            putPerformanceCollectionDataInMeasurements(list);
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            ProfileEndData profileEndData = new ProfileEndData(elapsedRealtimeNanos2, elapsedCpuTime2, z, this.traceFile, this.measurementsMap);
            if (acquire != null) {
                acquire.close();
            }
            return profileEndData;
        } finally {
        }
    }

    public void close() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            if (this.isRunning) {
                endAndCollect(true, null);
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void putPerformanceCollectionDataInMeasurements(List<PerformanceCollectionData> list) {
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                for (PerformanceCollectionData performanceCollectionData : list) {
                    long nanoTimestamp = performanceCollectionData.getNanoTimestamp();
                    long j = nanoTimestamp + elapsedRealtimeNanos;
                    Double cpuUsagePercentage = performanceCollectionData.getCpuUsagePercentage();
                    Long usedHeapMemory = performanceCollectionData.getUsedHeapMemory();
                    Long usedNativeMemory = performanceCollectionData.getUsedNativeMemory();
                    if (cpuUsagePercentage != null) {
                        arrayDeque3.add(new ProfileMeasurementValue(Long.valueOf(j), cpuUsagePercentage, nanoTimestamp));
                    }
                    if (usedHeapMemory != null) {
                        arrayDeque.add(new ProfileMeasurementValue(Long.valueOf(j), usedHeapMemory, nanoTimestamp));
                    }
                    if (usedNativeMemory != null) {
                        arrayDeque2.add(new ProfileMeasurementValue(Long.valueOf(j), usedNativeMemory, nanoTimestamp));
                    }
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_CPU_USAGE, new ProfileMeasurement("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_FOOTPRINT, new ProfileMeasurement("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_NATIVE_FOOTPRINT, new ProfileMeasurement("byte", arrayDeque2));
        }
    }

    boolean isRunning() {
        return this.isRunning;
    }
}
