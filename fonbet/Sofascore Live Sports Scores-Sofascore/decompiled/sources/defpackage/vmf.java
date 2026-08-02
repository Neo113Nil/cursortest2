package defpackage;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vmf {
    public static final long i;
    public dy9 b;
    public final dy9 e;
    public final dy9 f;
    public final long g;
    public final long h;
    public long c = 500;
    public double d = 500.0d;
    public Timer a = new Timer();

    static {
        l10.c();
        i = 1000000L;
    }

    public vmf(dy9 dy9Var, wxf wxfVar, oi3 oi3Var, String str) {
        bj3 bj3Var;
        long longValue;
        aj3 aj3Var;
        long longValue2;
        mj3 mj3Var;
        nj3 nj3Var;
        this.b = dy9Var;
        long k = str == "Trace" ? oi3Var.k() : oi3Var.k();
        if (str == "Trace") {
            synchronized (nj3.class) {
                nj3Var = nj3.h;
                if (nj3Var == null) {
                    nj3Var = new nj3();
                    nj3.h = nj3Var;
                }
            }
            jvd jvdVar = oi3Var.a.getLong("fpr_rl_trace_event_count_fg");
            if (jvdVar.b() && oi3.l(((Long) jvdVar.a()).longValue())) {
                oi3Var.c.d(((Long) jvdVar.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                longValue = ((Long) jvdVar.a()).longValue();
            } else {
                jvd c = oi3Var.c(nj3Var);
                longValue = (c.b() && oi3.l(((Long) c.a()).longValue())) ? ((Long) c.a()).longValue() : 300L;
            }
        } else {
            synchronized (bj3.class) {
                bj3Var = bj3.h;
                if (bj3Var == null) {
                    bj3Var = new bj3();
                    bj3.h = bj3Var;
                }
            }
            jvd jvdVar2 = oi3Var.a.getLong("fpr_rl_network_event_count_fg");
            if (jvdVar2.b() && oi3.l(((Long) jvdVar2.a()).longValue())) {
                oi3Var.c.d(((Long) jvdVar2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                longValue = ((Long) jvdVar2.a()).longValue();
            } else {
                jvd c2 = oi3Var.c(bj3Var);
                longValue = (c2.b() && oi3.l(((Long) c2.a()).longValue())) ? ((Long) c2.a()).longValue() : 700L;
            }
        }
        long j = longValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new dy9(j, k, timeUnit);
        this.g = j;
        long k2 = str == "Trace" ? oi3Var.k() : oi3Var.k();
        if (str == "Trace") {
            synchronized (mj3.class) {
                mj3Var = mj3.h;
                if (mj3Var == null) {
                    mj3Var = new mj3();
                    mj3.h = mj3Var;
                }
            }
            jvd jvdVar3 = oi3Var.a.getLong("fpr_rl_trace_event_count_bg");
            if (jvdVar3.b() && oi3.l(((Long) jvdVar3.a()).longValue())) {
                oi3Var.c.d(((Long) jvdVar3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                longValue2 = ((Long) jvdVar3.a()).longValue();
            } else {
                jvd c3 = oi3Var.c(mj3Var);
                longValue2 = (c3.b() && oi3.l(((Long) c3.a()).longValue())) ? ((Long) c3.a()).longValue() : 30L;
            }
        } else {
            synchronized (aj3.class) {
                aj3Var = aj3.h;
                if (aj3Var == null) {
                    aj3Var = new aj3();
                    aj3.h = aj3Var;
                }
            }
            jvd jvdVar4 = oi3Var.a.getLong("fpr_rl_network_event_count_bg");
            if (jvdVar4.b() && oi3.l(((Long) jvdVar4.a()).longValue())) {
                oi3Var.c.d(((Long) jvdVar4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                longValue2 = ((Long) jvdVar4.a()).longValue();
            } else {
                jvd c4 = oi3Var.c(aj3Var);
                longValue2 = (c4.b() && oi3.l(((Long) c4.a()).longValue())) ? ((Long) c4.a()).longValue() : 70L;
            }
        }
        long j2 = longValue2;
        this.f = new dy9(j2, k2, timeUnit);
        this.h = j2;
    }

    public final synchronized void a(boolean z) {
        try {
            this.b = z ? this.e : this.f;
            this.c = z ? this.g : this.h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:10:0x0051, B:12:0x005c, B:13:0x006d, B:15:0x0075, B:22:0x0034, B:23:0x003c, B:24:0x003f, B:25:0x0048), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:10:0x0051, B:12:0x005c, B:13:0x006d, B:15:0x0075, B:22:0x0034, B:23:0x003c, B:24:0x003f, B:25:0x0048), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean b() {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            Timer timer = new Timer();
            Timer timer2 = this.a;
            timer2.getClass();
            double d6 = timer.b - timer2.b;
            dy9 dy9Var = this.b;
            long j = dy9Var.a;
            long j2 = dy9Var.b;
            int i2 = nmf.a[((TimeUnit) dy9Var.c).ordinal()];
            if (i2 == 1) {
                d = j / j2;
                d2 = 1.0E9d;
            } else if (i2 == 2) {
                d = j / j2;
                d2 = 1000000.0d;
            } else {
                if (i2 != 3) {
                    d3 = j / r3.toSeconds(j2);
                    d4 = (d6 * d3) / i;
                    if (d4 > 0.0d) {
                        this.d = Math.min(this.d + d4, this.c);
                        this.a = timer;
                    }
                    d5 = this.d;
                    if (d5 >= 1.0d) {
                        return false;
                    }
                    this.d = d5 - 1.0d;
                    return true;
                }
                d = j / j2;
                d2 = 1000.0d;
            }
            d3 = d * d2;
            d4 = (d6 * d3) / i;
            if (d4 > 0.0d) {
            }
            d5 = this.d;
            if (d5 >= 1.0d) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
