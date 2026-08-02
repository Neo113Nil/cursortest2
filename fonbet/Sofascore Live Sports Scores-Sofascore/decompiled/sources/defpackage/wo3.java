package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wo3 extends wtc implements ug3, o1c {
    public ewd o;
    public final svg p;
    public boolean q;
    public a42 r;
    public final evg s;
    public boolean u;
    public boolean w;
    public final j0l t = new j0l(10);
    public long v = -1;

    public wo3(ewd ewdVar, svg svgVar, boolean z, a42 a42Var, evg evgVar) {
        this.o = ewdVar;
        this.p = svgVar;
        this.q = z;
        this.r = a42Var;
        this.s = evgVar;
    }

    public static boolean m1(wo3 wo3Var, oqf oqfVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = wo3Var.l1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long o1 = wo3Var.o1(oqfVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (o1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (o1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.o1c
    public final void c(long j) {
        int d;
        long l1 = l1();
        this.v = j;
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            d = Intrinsics.d((int) (j & 4294967295L), (int) (l1 & 4294967295L));
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            d = Intrinsics.d((int) (j >> 32), (int) (l1 >> 32));
        }
        if (d >= 0) {
            return;
        }
        long j2 = !this.q ? this.o == ewd.a ? (((int) (l1 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (l1 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        oqf oqfVar = (oqf) this.s.invoke();
        if (oqfVar == null || this.w || this.u || !m1(this, oqfVar, l1, 0L, 2) || m1(this, oqfVar, 0L, j2, 1)) {
            return;
        }
        this.u = true;
        n1(j2);
    }

    public final float k1(a42 a42Var, long j) {
        float f;
        oqf oqfVar;
        int compare;
        long j2 = this.v;
        i1d i1dVar = (i1d) this.t.b;
        int i = i1dVar.c - 1;
        Object[] objArr = i1dVar.a;
        if (i < objArr.length) {
            oqfVar = null;
            while (true) {
                if (i < 0) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                }
                oqf oqfVar2 = (oqf) ((to3) objArr[i]).a.invoke();
                if (oqfVar2 != null) {
                    long e = oqfVar2.e();
                    long I = d7a.I(l1());
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int ordinal = this.o.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (e & 4294967295L)), Float.intBitsToFloat((int) (I & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            zzl.b();
                            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (e >> 32)), Float.intBitsToFloat((int) (I >> 32)));
                    }
                    if (compare <= 0) {
                        oqfVar = oqfVar2;
                    } else if (oqfVar == null) {
                        oqfVar = oqfVar2;
                    }
                }
                i--;
            }
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            oqfVar = null;
        }
        if (oqfVar == null) {
            oqf oqfVar3 = this.u ? (oqf) this.s.invoke() : null;
            if (oqfVar3 == null) {
                return f;
            }
            oqfVar = oqfVar3;
        }
        long I2 = d7a.I(j2);
        int ordinal2 = this.o.ordinal();
        if (ordinal2 == 0) {
            float f2 = oqfVar.b;
            return a42Var.a(f2 - ((int) (j & 4294967295L)), oqfVar.d - f2, Float.intBitsToFloat((int) (I2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = oqfVar.a;
            return a42Var.a(f3 - ((int) (j >> 32)), oqfVar.c - f3, Float.intBitsToFloat((int) (I2 >> 32)));
        }
        zzl.b();
        return f;
    }

    public final long l1() {
        long j = this.v;
        if (c7a.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void n1(long j) {
        a42 a42Var = this.r;
        if (a42Var == null) {
            a42Var = (a42) tgj.x(this, d42.a);
        }
        a42 a42Var2 = a42Var;
        if (this.w) {
            u3a.c("launchAnimation called when previous animation was running");
        }
        a42 a42Var3 = this.r;
        if (a42Var3 == null) {
            a42Var3 = (a42) tgj.x(this, d42.a);
        }
        a42Var3.getClass();
        a42.a.getClass();
        xw3.L(Y0(), null, nu3.d, new vo3(this, new idk(z32.b), a42Var2, j, (rq3) null), 1);
    }

    public final long o1(oqf oqfVar, long j, long j2) {
        long I = d7a.I(j);
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            a42 a42Var = this.r;
            if (a42Var == null) {
                a42Var = (a42) tgj.x(this, d42.a);
            }
            float f = oqfVar.b;
            float a = a42Var.a(f - ((int) (j2 & 4294967295L)), oqfVar.d - f, Float.intBitsToFloat((int) (I & 4294967295L)));
            return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        }
        if (ordinal != 1) {
            zzl.b();
            return 0L;
        }
        a42 a42Var2 = this.r;
        if (a42Var2 == null) {
            a42Var2 = (a42) tgj.x(this, d42.a);
        }
        float f2 = oqfVar.a;
        return (Float.floatToRawIntBits(a42Var2.a(f2 - ((int) (j2 >> 32)), oqfVar.c - f2, Float.intBitsToFloat((int) (I >> 32)))) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
    }
}
