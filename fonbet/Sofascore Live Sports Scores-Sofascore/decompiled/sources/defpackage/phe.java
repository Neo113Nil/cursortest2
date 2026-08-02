package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class phe implements kx4 {
    public boolean a;

    public static void g(phe pheVar, qhe qheVar, long j) {
        pheVar.d(qheVar);
        qheVar.b0(r6a.d(j, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
    }

    public static void h(phe pheVar, qhe qheVar, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (pheVar.b() == ema.a || pheVar.c() == 0) {
            pheVar.d(qheVar);
            qheVar.b0(r6a.d(j, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        } else {
            int c = (pheVar.c() - qheVar.a) - ((int) (j >> 32));
            pheVar.d(qheVar);
            qheVar.b0(r6a.d((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }
    }

    public static void i(phe pheVar, qhe qheVar, int i, int i2) {
        int i3 = rhe.b;
        tyd tydVar = tyd.k;
        long j = (i << 32) | (i2 & 4294967295L);
        if (pheVar.b() == ema.a || pheVar.c() == 0) {
            pheVar.d(qheVar);
            qheVar.b0(r6a.d(j, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tydVar);
        } else {
            int c = (pheVar.c() - qheVar.a) - ((int) (j >> 32));
            pheVar.d(qheVar);
            qheVar.b0(r6a.d((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tydVar);
        }
    }

    public static void k(phe pheVar, qhe qheVar, long j) {
        int i = rhe.b;
        tyd tydVar = tyd.k;
        if (pheVar.b() == ema.a || pheVar.c() == 0) {
            pheVar.d(qheVar);
            qheVar.b0(r6a.d(j, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tydVar);
        } else {
            int c = (pheVar.c() - qheVar.a) - ((int) (j >> 32));
            pheVar.d(qheVar);
            qheVar.b0(r6a.d((((int) (j & 4294967295L)) & 4294967295L) | (c << 32), qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tydVar);
        }
    }

    public static /* synthetic */ void m(phe pheVar, qhe qheVar, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = rhe.b;
            function1 = tyd.k;
        }
        pheVar.l(qheVar, i, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1);
    }

    public static void o(phe pheVar, qhe qheVar, long j) {
        int i = rhe.b;
        tyd tydVar = tyd.k;
        pheVar.d(qheVar);
        qheVar.b0(r6a.d(j, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tydVar);
    }

    public float a(gf9 gf9Var) {
        return Float.NaN;
    }

    public abstract ema b();

    public abstract int c();

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(qhe qheVar) {
        if (qheVar instanceof zvc) {
            ((zvc) qheVar).i(this.a);
        }
    }

    public final void e(qhe qheVar, int i, int i2, float f) {
        d(qheVar);
        qheVar.b0(r6a.d((i2 & 4294967295L) | (i << 32), qheVar.e), f, null);
    }

    public final void l(qhe qheVar, int i, int i2, float f, Function1 function1) {
        d(qheVar);
        qheVar.b0(r6a.d((i2 & 4294967295L) | (i << 32), qheVar.e), f, function1);
    }
}
