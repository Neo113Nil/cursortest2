package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class ActivityFramesTracker {
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;
    private final LazyEvaluator<Boolean> androidXAvailable;
    private final Map<Activity, FrameCounts> frameCountAtStartSnapshots;
    private LazyEvaluator<FrameMetricsAggregator> frameMetricsAggregator;
    private final MainLooperHandler handler;
    protected AutoClosableReentrantLock lock;
    private final SentryAndroidOptions options;

    static /* synthetic */ FrameMetricsAggregator lambda$new$1(FrameMetricsAggregator frameMetricsAggregator) {
        return frameMetricsAggregator;
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler) {
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameCountAtStartSnapshots = new WeakHashMap();
        this.lock = new AutoClosableReentrantLock();
        this.androidXAvailable = loadClass.isClassAvailableLazy("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.frameMetricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda5
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return ActivityFramesTracker.lambda$new$0();
            }
        });
        this.options = sentryAndroidOptions;
        this.handler = mainLooperHandler;
    }

    static /* synthetic */ FrameMetricsAggregator lambda$new$0() {
        return new FrameMetricsAggregator();
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions) {
        this(loadClass, sentryAndroidOptions, new MainLooperHandler());
    }

    ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler, final FrameMetricsAggregator frameMetricsAggregator) {
        this(loadClass, sentryAndroidOptions, mainLooperHandler);
        this.frameMetricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda2
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return ActivityFramesTracker.lambda$new$1(FrameMetricsAggregator.this);
            }
        });
    }

    public boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable.getValue().booleanValue() && this.options.isEnableFramesTracking() && !this.options.isEnablePerformanceV2();
    }

    public void addActivity(final Activity activity) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire != null) {
                    acquire.close();
                }
            } else {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityFramesTracker.this.m13341x4345427d(activity);
                    }
                }, "FrameMetricsAggregator.add");
                snapshotFrameCountsAtStart(activity);
                if (acquire != null) {
                    acquire.close();
                }
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

    /* renamed from: lambda$addActivity$2$io-sentry-android-core-ActivityFramesTracker, reason: not valid java name */
    /* synthetic */ void m13341x4345427d(Activity activity) {
        this.frameMetricsAggregator.getValue().add(activity);
    }

    private void snapshotFrameCountsAtStart(Activity activity) {
        FrameCounts calculateCurrentFrameCounts = calculateCurrentFrameCounts();
        if (calculateCurrentFrameCounts != null) {
            this.frameCountAtStartSnapshots.put(activity, calculateCurrentFrameCounts);
        }
    }

    private FrameCounts calculateCurrentFrameCounts() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable() || !this.androidXAvailable.getValue().booleanValue()) {
            return null;
        }
        SparseIntArray[] metrics = this.frameMetricsAggregator.getValue().getMetrics();
        int i3 = 0;
        if (metrics == null || metrics.length <= 0 || (sparseIntArray = metrics[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                } else if (keyAt > 16) {
                    i += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new FrameCounts(i3, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMetrics(final Activity activity, SentryId sentryId) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire != null) {
                    acquire.close();
                    return;
                }
                return;
            }
            runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityFramesTracker.this.m13343lambda$setMetrics$3$iosentryandroidcoreActivityFramesTracker(activity);
                }
            }, null);
            FrameCounts diffFrameCountsAtEnd = diffFrameCountsAtEnd(activity);
            if (diffFrameCountsAtEnd != null && (diffFrameCountsAtEnd.totalFrames != 0 || diffFrameCountsAtEnd.slowFrames != 0 || diffFrameCountsAtEnd.frozenFrames != 0)) {
                MeasurementValue measurementValue = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.totalFrames), "none");
                MeasurementValue measurementValue2 = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.slowFrames), "none");
                MeasurementValue measurementValue3 = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.frozenFrames), "none");
                HashMap hashMap = new HashMap();
                hashMap.put(MeasurementValue.KEY_FRAMES_TOTAL, measurementValue);
                hashMap.put(MeasurementValue.KEY_FRAMES_SLOW, measurementValue2);
                hashMap.put(MeasurementValue.KEY_FRAMES_FROZEN, measurementValue3);
                this.activityMeasurements.put(sentryId, hashMap);
                if (acquire != null) {
                    acquire.close();
                }
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

    /* renamed from: lambda$setMetrics$3$io-sentry-android-core-ActivityFramesTracker, reason: not valid java name */
    /* synthetic */ void m13343lambda$setMetrics$3$iosentryandroidcoreActivityFramesTracker(Activity activity) {
        this.frameMetricsAggregator.getValue().remove(activity);
    }

    private FrameCounts diffFrameCountsAtEnd(Activity activity) {
        FrameCounts calculateCurrentFrameCounts;
        FrameCounts remove = this.frameCountAtStartSnapshots.remove(activity);
        if (remove == null || (calculateCurrentFrameCounts = calculateCurrentFrameCounts()) == null) {
            return null;
        }
        return new FrameCounts(calculateCurrentFrameCounts.totalFrames - remove.totalFrames, calculateCurrentFrameCounts.slowFrames - remove.slowFrames, calculateCurrentFrameCounts.frozenFrames - remove.frozenFrames);
    }

    public Map<String, MeasurementValue> takeMetrics(SentryId sentryId) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
            this.activityMeasurements.remove(sentryId);
            if (acquire != null) {
                acquire.close();
            }
            return map;
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

    public void stop() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityFramesTracker.this.m13344lambda$stop$4$iosentryandroidcoreActivityFramesTracker();
                    }
                }, "FrameMetricsAggregator.stop");
                this.frameMetricsAggregator.getValue().reset();
            }
            this.activityMeasurements.clear();
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

    /* renamed from: lambda$stop$4$io-sentry-android-core-ActivityFramesTracker, reason: not valid java name */
    /* synthetic */ void m13344lambda$stop$4$iosentryandroidcoreActivityFramesTracker() {
        this.frameMetricsAggregator.getValue().stop();
    }

    private void runSafelyOnUiThread(final Runnable runnable, final String str) {
        try {
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                runnable.run();
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityFramesTracker.this.m13342xbbf43808(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* renamed from: lambda$runSafelyOnUiThread$5$io-sentry-android-core-ActivityFramesTracker, reason: not valid java name */
    /* synthetic */ void m13342xbbf43808(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private static final class FrameCounts {
        private final int frozenFrames;
        private final int slowFrames;
        private final int totalFrames;

        private FrameCounts(int i, int i2, int i3) {
            this.totalFrames = i;
            this.slowFrames = i2;
            this.frozenFrames = i3;
        }
    }
}
