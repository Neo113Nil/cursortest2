package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.e;
import com.google.firebase.perf.v1.f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.cqy;
import xsna.ght;
import xsna.gq4;
import xsna.hht;
import xsna.i3r0;
import xsna.iht;
import xsna.jht;
import xsna.kt80;
import xsna.m09;
import xsna.ra2;
import xsna.te9;
import xsna.txi;
import xsna.tyi;
import xsna.uyi;
import xsna.v220;
import xsna.wyi;
import xsna.xj3;
import xsna.xop0;
import xsna.xyi;
import xsna.z1r;
import xsna.z3k;

@Keep
/* loaded from: classes13.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final txi configResolver;
    private final cqy<z3k> cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final cqy<ScheduledExecutorService> gaugeManagerExecutor;

    @Nullable
    private jht gaugeMetadataManager;
    private final cqy<v220> memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final xop0 transportManager;
    private static final ra2 logger = ra2.d();
    private static final GaugeManager instance = new GaugeManager();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            a = iArr;
            try {
                iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GaugeManager() {
        this(new cqy(new ght()), xop0.t, txi.e(), null, new cqy(new hht()), new cqy(new iht()));
    }

    private static void collectGaugeMetricOnce(z3k z3kVar, v220 v220Var, Timer timer) {
        synchronized (z3kVar) {
            try {
                z3kVar.b.schedule(new gq4(3, z3kVar, timer), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                ra2 ra2Var = z3k.g;
                e.getMessage();
                ra2Var.h();
            }
        }
        synchronized (v220Var) {
            try {
                v220Var.a.schedule(new te9(5, v220Var, timer), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                ra2 ra2Var2 = v220.f;
                e2.getMessage();
                ra2Var2.h();
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        tyi tyiVar;
        long longValue;
        uyi uyiVar;
        int i = a.a[applicationProcessState.ordinal()];
        if (i == 1) {
            txi txiVar = this.configResolver;
            txiVar.getClass();
            synchronized (tyi.class) {
                try {
                    if (tyi.c == null) {
                        tyi.c = new tyi(0);
                    }
                    tyiVar = tyi.c;
                } finally {
                }
            }
            kt80<Long> j = txiVar.j(tyiVar);
            if (j.b() && txi.n(j.a().longValue())) {
                longValue = j.a().longValue();
            } else {
                kt80<Long> kt80Var = txiVar.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (kt80Var.b() && txi.n(kt80Var.a().longValue())) {
                    txiVar.c.e(kt80Var.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    longValue = kt80Var.a().longValue();
                } else {
                    kt80<Long> c = txiVar.c(tyiVar);
                    longValue = (c.b() && txi.n(c.a().longValue())) ? c.a().longValue() : 0L;
                }
            }
        } else if (i != 2) {
            longValue = -1;
        } else {
            txi txiVar2 = this.configResolver;
            txiVar2.getClass();
            synchronized (uyi.class) {
                try {
                    if (uyi.c == null) {
                        uyi.c = new uyi(0);
                    }
                    uyiVar = uyi.c;
                } finally {
                }
            }
            kt80<Long> j2 = txiVar2.j(uyiVar);
            if (j2.b() && txi.n(j2.a().longValue())) {
                longValue = j2.a().longValue();
            } else {
                kt80<Long> kt80Var2 = txiVar2.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (kt80Var2.b() && txi.n(kt80Var2.a().longValue())) {
                    txiVar2.c.e(kt80Var2.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    longValue = kt80Var2.a().longValue();
                } else {
                    kt80<Long> c2 = txiVar2.c(uyiVar);
                    longValue = (c2.b() && txi.n(c2.a().longValue())) ? c2.a().longValue() : 100L;
                }
            }
        }
        ra2 ra2Var = z3k.g;
        if (longValue <= 0) {
            return -1L;
        }
        return longValue;
    }

    private e getGaugeMetadata() {
        e.b m = e.m();
        jht jhtVar = this.gaugeMetadataManager;
        StorageUnit storageUnit = StorageUnit.BYTES;
        m.b(i3r0.b(storageUnit.a(jhtVar.c.totalMem)));
        m.c(i3r0.b(storageUnit.a(this.gaugeMetadataManager.a.maxMemory())));
        m.d(i3r0.b(StorageUnit.MEGABYTES.a(this.gaugeMetadataManager.b.getMemoryClass())));
        return m.build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        wyi wyiVar;
        long longValue;
        xyi xyiVar;
        int i = a.a[applicationProcessState.ordinal()];
        if (i == 1) {
            txi txiVar = this.configResolver;
            txiVar.getClass();
            synchronized (wyi.class) {
                try {
                    if (wyi.c == null) {
                        wyi.c = new wyi(0);
                    }
                    wyiVar = wyi.c;
                } finally {
                }
            }
            kt80<Long> j = txiVar.j(wyiVar);
            if (j.b() && txi.n(j.a().longValue())) {
                longValue = j.a().longValue();
            } else {
                kt80<Long> kt80Var = txiVar.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (kt80Var.b() && txi.n(kt80Var.a().longValue())) {
                    txiVar.c.e(kt80Var.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    longValue = kt80Var.a().longValue();
                } else {
                    kt80<Long> c = txiVar.c(wyiVar);
                    longValue = (c.b() && txi.n(c.a().longValue())) ? c.a().longValue() : 0L;
                }
            }
        } else if (i != 2) {
            longValue = -1;
        } else {
            txi txiVar2 = this.configResolver;
            txiVar2.getClass();
            synchronized (xyi.class) {
                try {
                    if (xyi.c == null) {
                        xyi.c = new xyi(0);
                    }
                    xyiVar = xyi.c;
                } finally {
                }
            }
            kt80<Long> j2 = txiVar2.j(xyiVar);
            if (j2.b() && txi.n(j2.a().longValue())) {
                longValue = j2.a().longValue();
            } else {
                kt80<Long> kt80Var2 = txiVar2.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (kt80Var2.b() && txi.n(kt80Var2.a().longValue())) {
                    txiVar2.c.e(kt80Var2.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    longValue = kt80Var2.a().longValue();
                } else {
                    kt80<Long> c2 = txiVar2.c(xyiVar);
                    longValue = (c2.b() && txi.n(c2.a().longValue())) ? c2.a().longValue() : 100L;
                }
            }
        }
        ra2 ra2Var = v220.f;
        if (longValue <= 0) {
            return -1L;
        }
        return longValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z3k lambda$new$1() {
        return new z3k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v220 lambda$new$2() {
        return new v220();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a();
            return false;
        }
        z3k z3kVar = this.cpuGaugeCollector.get();
        long j2 = z3kVar.d;
        if (j2 == -1 || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = z3kVar.e;
        if (scheduledFuture == null) {
            z3kVar.a(j, timer);
            return true;
        }
        if (z3kVar.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            z3kVar.e = null;
            z3kVar.f = -1L;
        }
        z3kVar.a(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a();
            return false;
        }
        v220 v220Var = this.memoryGaugeCollector.get();
        ra2 ra2Var = v220.f;
        if (j <= 0) {
            v220Var.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = v220Var.d;
        if (scheduledFuture == null) {
            v220Var.a(j, timer);
            return true;
        }
        if (v220Var.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            v220Var.d = null;
            v220Var.e = -1L;
        }
        v220Var.a(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$4(String str, ApplicationProcessState applicationProcessState) {
        f.b q = f.q();
        while (!this.cpuGaugeCollector.get().a.isEmpty()) {
            q.c(this.cpuGaugeCollector.get().a.poll());
        }
        while (!this.memoryGaugeCollector.get().b.isEmpty()) {
            q.b(this.memoryGaugeCollector.get().b.poll());
        }
        q.f(str);
        xop0 xop0Var = this.transportManager;
        xop0Var.j.execute(new xj3(xop0Var, q.build(), applicationProcessState, 6));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new jht(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        f.b q = f.q();
        q.f(str);
        q.d(getGaugeMetadata());
        f build = q.build();
        xop0 xop0Var = this.transportManager;
        xop0Var.j.execute(new xj3(xop0Var, build, applicationProcessState, 6));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.c);
        if (startCollectingGauges == -1) {
            logger.h();
            return;
        }
        String str = perfSession.b;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new m09(this, str, applicationProcessState), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            ra2 ra2Var = logger;
            e.getMessage();
            ra2Var.h();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        z3k z3kVar = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = z3kVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            z3kVar.e = null;
            z3kVar.f = -1L;
        }
        v220 v220Var = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = v220Var.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            v220Var.d = null;
            v220Var.e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new z1r(this, str, applicationProcessState, 1), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(cqy<ScheduledExecutorService> cqyVar, xop0 xop0Var, txi txiVar, jht jhtVar, cqy<z3k> cqyVar2, cqy<v220> cqyVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = cqyVar;
        this.transportManager = xop0Var;
        this.configResolver = txiVar;
        this.gaugeMetadataManager = jhtVar;
        this.cpuGaugeCollector = cqyVar2;
        this.memoryGaugeCollector = cqyVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
