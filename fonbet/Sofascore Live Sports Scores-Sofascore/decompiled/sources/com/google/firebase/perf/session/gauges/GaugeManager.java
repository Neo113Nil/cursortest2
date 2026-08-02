package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import defpackage.aw3;
import defpackage.b0a;
import defpackage.fyj;
import defpackage.gj3;
import defpackage.hj3;
import defpackage.jj3;
import defpackage.jv8;
import defpackage.jvd;
import defpackage.kc3;
import defpackage.kdc;
import defpackage.kj3;
import defpackage.koa;
import defpackage.l10;
import defpackage.ljg;
import defpackage.lv8;
import defpackage.mv8;
import defpackage.nv8;
import defpackage.of0;
import defpackage.oi3;
import defpackage.p10;
import defpackage.pv8;
import defpackage.qec;
import defpackage.qv8;
import defpackage.rec;
import defpackage.wv3;
import defpackage.xv3;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private of0 applicationProcessState;
    private final oi3 configResolver;
    private final koa cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final koa gaugeManagerExecutor;

    @Nullable
    private nv8 gaugeMetadataManager;
    private final koa memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final fyj transportManager;
    private static final l10 logger = l10.c();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new koa(new kc3(6)), fyj.s, oi3.e(), null, new koa(new kc3(7)), new koa(new kc3(8)));
    }

    private static void collectGaugeMetricOnce(xv3 xv3Var, rec recVar, Timer timer) {
        int i;
        synchronized (xv3Var) {
            i = 1;
            try {
                xv3Var.b.schedule(new wv3(xv3Var, timer, i), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                l10 l10Var = xv3.g;
                e.getMessage();
                l10Var.getClass();
            }
        }
        synchronized (recVar) {
            try {
                recVar.a.schedule(new qec(recVar, timer, i), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                l10 l10Var2 = rec.f;
                e2.getMessage();
                l10Var2.getClass();
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(of0 of0Var) {
        hj3 hj3Var;
        long longValue;
        gj3 gj3Var;
        int ordinal = of0Var.ordinal();
        if (ordinal == 1) {
            oi3 oi3Var = this.configResolver;
            oi3Var.getClass();
            synchronized (hj3.class) {
                hj3Var = hj3.h;
                if (hj3Var == null) {
                    hj3Var = new hj3();
                    hj3.h = hj3Var;
                }
            }
            jvd j = oi3Var.j(hj3Var);
            if (j.b() && oi3.n(((Long) j.a()).longValue())) {
                longValue = ((Long) j.a()).longValue();
            } else {
                jvd jvdVar = oi3Var.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (jvdVar.b() && oi3.n(((Long) jvdVar.a()).longValue())) {
                    oi3Var.c.d(((Long) jvdVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    longValue = ((Long) jvdVar.a()).longValue();
                } else {
                    jvd c = oi3Var.c(hj3Var);
                    longValue = (c.b() && oi3.n(((Long) c.a()).longValue())) ? ((Long) c.a()).longValue() : oi3Var.a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        } else if (ordinal != 2) {
            longValue = -1;
        } else {
            oi3 oi3Var2 = this.configResolver;
            oi3Var2.getClass();
            synchronized (gj3.class) {
                gj3Var = gj3.h;
                if (gj3Var == null) {
                    gj3Var = new gj3();
                    gj3.h = gj3Var;
                }
            }
            jvd j2 = oi3Var2.j(gj3Var);
            if (j2.b() && oi3.n(((Long) j2.a()).longValue())) {
                longValue = ((Long) j2.a()).longValue();
            } else {
                jvd jvdVar2 = oi3Var2.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (jvdVar2.b() && oi3.n(((Long) jvdVar2.a()).longValue())) {
                    oi3Var2.c.d(((Long) jvdVar2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    longValue = ((Long) jvdVar2.a()).longValue();
                } else {
                    jvd c2 = oi3Var2.c(gj3Var);
                    longValue = (c2.b() && oi3.n(((Long) c2.a()).longValue())) ? ((Long) c2.a()).longValue() : 0L;
                }
            }
        }
        l10 l10Var = xv3.g;
        if (longValue <= 0) {
            return -1L;
        }
        return longValue;
    }

    private mv8 getGaugeMetadata() {
        lv8 j = mv8.j();
        j.d(b0a.O((ljg.b(5) * this.gaugeMetadataManager.c.totalMem) / 1024));
        j.h(b0a.O((ljg.b(5) * this.gaugeMetadataManager.a.maxMemory()) / 1024));
        j.i(b0a.O((ljg.b(3) * this.gaugeMetadataManager.b.getMemoryClass()) / 1024));
        return (mv8) j.build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(of0 of0Var) {
        kj3 kj3Var;
        long longValue;
        jj3 jj3Var;
        int ordinal = of0Var.ordinal();
        if (ordinal == 1) {
            oi3 oi3Var = this.configResolver;
            oi3Var.getClass();
            synchronized (kj3.class) {
                kj3Var = kj3.h;
                if (kj3Var == null) {
                    kj3Var = new kj3();
                    kj3.h = kj3Var;
                }
            }
            jvd j = oi3Var.j(kj3Var);
            if (j.b() && oi3.n(((Long) j.a()).longValue())) {
                longValue = ((Long) j.a()).longValue();
            } else {
                jvd jvdVar = oi3Var.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (jvdVar.b() && oi3.n(((Long) jvdVar.a()).longValue())) {
                    oi3Var.c.d(((Long) jvdVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    longValue = ((Long) jvdVar.a()).longValue();
                } else {
                    jvd c = oi3Var.c(kj3Var);
                    longValue = (c.b() && oi3.n(((Long) c.a()).longValue())) ? ((Long) c.a()).longValue() : oi3Var.a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        } else if (ordinal != 2) {
            longValue = -1;
        } else {
            oi3 oi3Var2 = this.configResolver;
            oi3Var2.getClass();
            synchronized (jj3.class) {
                jj3Var = jj3.h;
                if (jj3Var == null) {
                    jj3Var = new jj3();
                    jj3.h = jj3Var;
                }
            }
            jvd j2 = oi3Var2.j(jj3Var);
            if (j2.b() && oi3.n(((Long) j2.a()).longValue())) {
                longValue = ((Long) j2.a()).longValue();
            } else {
                jvd jvdVar2 = oi3Var2.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (jvdVar2.b() && oi3.n(((Long) jvdVar2.a()).longValue())) {
                    oi3Var2.c.d(((Long) jvdVar2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    longValue = ((Long) jvdVar2.a()).longValue();
                } else {
                    jvd c2 = oi3Var2.c(jj3Var);
                    longValue = (c2.b() && oi3.n(((Long) c2.a()).longValue())) ? ((Long) c2.a()).longValue() : 0L;
                }
            }
        }
        l10 l10Var = rec.f;
        if (longValue <= 0) {
            return -1L;
        }
        return longValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xv3 lambda$new$0() {
        return new xv3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rec lambda$new$1() {
        return new rec();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.getClass();
            return false;
        }
        xv3 xv3Var = (xv3) this.cpuGaugeCollector.get();
        long j2 = xv3Var.d;
        if (j2 == -1 || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = xv3Var.e;
        if (scheduledFuture == null) {
            xv3Var.a(j, timer);
            return true;
        }
        if (xv3Var.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            xv3Var.e = null;
            xv3Var.f = -1L;
        }
        xv3Var.a(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.getClass();
            return false;
        }
        rec recVar = (rec) this.memoryGaugeCollector.get();
        l10 l10Var = rec.f;
        if (j <= 0) {
            recVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = recVar.d;
        if (scheduledFuture == null) {
            recVar.a(j, timer);
            return true;
        }
        if (recVar.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            recVar.d = null;
            recVar.e = -1L;
        }
        recVar.a(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, of0 of0Var) {
        pv8 o = qv8.o();
        while (!((xv3) this.cpuGaugeCollector.get()).a.isEmpty()) {
            o.h((aw3) ((xv3) this.cpuGaugeCollector.get()).a.poll());
        }
        while (!((rec) this.memoryGaugeCollector.get()).b.isEmpty()) {
            o.d((p10) ((rec) this.memoryGaugeCollector.get()).b.poll());
        }
        o.j(str);
        fyj fyjVar = this.transportManager;
        fyjVar.i.execute(new kdc(17, fyjVar, (qv8) o.build(), of0Var));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new nv8(context);
    }

    public boolean logGaugeMetadata(String str, of0 of0Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        pv8 o = qv8.o();
        o.j(str);
        o.i(getGaugeMetadata());
        qv8 qv8Var = (qv8) o.build();
        fyj fyjVar = this.transportManager;
        fyjVar.i.execute(new kdc(17, fyjVar, qv8Var, of0Var));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, of0 of0Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(of0Var, perfSession.b);
        if (startCollectingGauges == -1) {
            logger.getClass();
            return;
        }
        String str = perfSession.a;
        this.sessionId = str;
        this.applicationProcessState = of0Var;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new jv8(this, str, of0Var, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            l10 l10Var = logger;
            e.getMessage();
            l10Var.getClass();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        of0 of0Var = this.applicationProcessState;
        xv3 xv3Var = (xv3) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = xv3Var.e;
        int i = 0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            xv3Var.e = null;
            xv3Var.f = -1L;
        }
        rec recVar = (rec) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = recVar.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            recVar.d = null;
            recVar.e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new jv8(this, str, of0Var, i), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = of0.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(koa koaVar, fyj fyjVar, oi3 oi3Var, nv8 nv8Var, koa koaVar2, koa koaVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = of0.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = koaVar;
        this.transportManager = fyjVar;
        this.configResolver = oi3Var;
        this.gaugeMetadataManager = nv8Var;
        this.cpuGaugeCollector = koaVar2;
        this.memoryGaugeCollector = koaVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((xv3) this.cpuGaugeCollector.get(), (rec) this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(of0 of0Var, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(of0Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(of0Var);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
