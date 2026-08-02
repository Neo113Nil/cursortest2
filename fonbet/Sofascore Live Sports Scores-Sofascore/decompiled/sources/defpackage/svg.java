package defpackage;

import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class svg {
    public jvg a;
    public myd b;
    public p78 c;
    public ewd d;
    public boolean e;
    public h9d f;
    public final ivg g;
    public final evg h;
    public boolean i;
    public int j = 1;
    public oug k = bvg.b;
    public final qvg l = new qvg(this);
    public final qfg m = new qfg(this, 9);

    public svg(jvg jvgVar, myd mydVar, p78 p78Var, ewd ewdVar, boolean z, h9d h9dVar, ivg ivgVar, evg evgVar) {
        this.a = jvgVar;
        this.b = mydVar;
        this.c = p78Var;
        this.d = ewdVar;
        this.e = z;
        this.f = h9dVar;
        this.g = ivgVar;
        this.h = evgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, sq3 sq3Var) {
        ovg ovgVar;
        int i;
        svg svgVar;
        Throwable th;
        esf esfVar;
        if (sq3Var instanceof ovg) {
            ovgVar = (ovg) sq3Var;
            int i2 = ovgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ovgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = ovgVar.s;
                lu3 lu3Var = lu3.a;
                i = ovgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    esf esfVar2 = new esf();
                    esfVar2.a = j;
                    this.i = true;
                    try {
                        m1d m1dVar = m1d.a;
                        svgVar = this;
                        try {
                            pvg pvgVar = new pvg(svgVar, esfVar2, j, null);
                            ovgVar.r = esfVar2;
                            ovgVar.u = 1;
                            if (svgVar.f(m1dVar, pvgVar, ovgVar) == lu3Var) {
                                return lu3Var;
                            }
                            esfVar = esfVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            svgVar.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        svgVar = this;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    esfVar = ovgVar.r;
                    try {
                        y6a.M(obj);
                        svgVar = this;
                    } catch (Throwable th4) {
                        th = th4;
                        svgVar = this;
                        svgVar.i = false;
                        throw th;
                    }
                }
                svgVar.i = false;
                return new vmk(esfVar.a);
            }
        }
        ovgVar = new ovg(this, sq3Var);
        Object obj2 = ovgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ovgVar.u;
        if (i != 0) {
        }
        svgVar.i = false;
        return new vmk(esfVar.a);
    }

    public final Object b(long j, boolean z, hoi hoiVar) {
        if (z) {
            p78 p78Var = this.c;
            vqg vqgVar = bvg.a;
            if (p78Var instanceof jp4) {
                return Unit.a;
            }
        }
        long a = vmk.a(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d == ewd.b ? 1 : 2);
        rvg rvgVar = new rvg(this, null);
        myd mydVar = this.b;
        if (mydVar != null && (this.a.d() || this.a.c())) {
            Object c = mydVar.c(a, rvgVar, hoiVar);
            return c == lu3.a ? c : Unit.a;
        }
        rvg rvgVar2 = new rvg((svg) rvgVar.v, hoiVar);
        rvgVar2.u = a;
        Object invokeSuspend = rvgVar2.invokeSuspend(Unit.a);
        return invokeSuspend == lu3.a ? invokeSuspend : Unit.a;
    }

    public final long c(oug ougVar, long j, int i) {
        m9d m9dVar = this.f.a;
        m9d l1 = m9dVar != null ? m9dVar.l1() : null;
        long P = l1 != null ? l1.P(i, j) : 0L;
        long h = dnd.h(j, P);
        long e = e(h(ougVar.a(g(e(this.d == ewd.b ? dnd.a(h, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : dnd.a(h, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))))));
        ivg ivgVar = this.g;
        if (ivgVar.n) {
            ViewTreeObserver viewTreeObserver = ((xy) c6o.d0(ivgVar)).getViewTreeObserver();
            try {
                Method method = xy.S0;
                if (method == null) {
                    method = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    method.setAccessible(true);
                    xy.S0 = method;
                }
                method.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long h2 = dnd.h(h, e);
        m9d m9dVar2 = this.f.a;
        m9d l12 = m9dVar2 != null ? m9dVar2.l1() : null;
        return dnd.i(dnd.i(P, e), l12 != null ? l12.b0(i, e, h2) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? dnd.j(j, -1.0f) : j;
    }

    public final Object f(m1d m1dVar, Function2 function2, sq3 sq3Var) {
        Object a = this.a.a(m1dVar, new v1f(this, function2, (rq3) null, 15), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == ewd.b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        if (this.d == ewd.b) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        ewd ewdVar = this.d;
        return atan2 >= 0.7853981633974483d ? ewdVar == ewd.a ? Float.intBitsToFloat(i) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ewdVar == ewd.b ? Float.intBitsToFloat(i2) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
