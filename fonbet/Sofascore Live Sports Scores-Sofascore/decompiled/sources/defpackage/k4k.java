package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k4k implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ dt8 e;

    public /* synthetic */ k4k(int i, dt8 dt8Var, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = dt8Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        dt8 dt8Var = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ct8 ct8Var = (ct8) obj5;
                Function0 function0 = (Function0) dt8Var;
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var = (of3) obj3;
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                o4k o4kVar = (o4k) ((gv9) obj6).get(intValue);
                if (o4kVar instanceof m4k) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(-856259557);
                    x2a.q((m4k) o4kVar, bkh.c, av8Var, 48);
                    av8Var.s(false);
                } else if (o4kVar instanceof n4k) {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(-856098388);
                    x2a.r((n4k) o4kVar, bkh.c, this.b, ct8Var, function0, av8Var2, 48);
                    av8Var2.s(false);
                } else {
                    av8 av8Var3 = (av8) of3Var;
                    av8Var3.d0(-855817342);
                    av8Var3.s(false);
                }
                break;
            default:
                xva xvaVar = (xva) obj6;
                n52 n52Var = (n52) obj5;
                Function1 function1 = (Function1) dt8Var;
                ((Integer) obj2).getClass();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var2;
                if (av8Var4.T(intValue2 & 1, (intValue2 & 129) != 128)) {
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, c, hf3.g);
                    waa.K(av8Var4, m, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C, hf3.d);
                    gv9 gv9Var = xvaVar.l;
                    yva yvaVar = xvaVar.m;
                    boolean z = this.b;
                    lrh lrhVar = z ? frh.m : hrh.m;
                    av8Var4.d0(-2123873739);
                    xtc d = bkh.d(utcVar, 1.0f);
                    if (!z) {
                        d = d.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var4), oyn.e));
                    }
                    av8Var4.s(false);
                    if (n52Var != null) {
                        d = d.z(n9e.p(utcVar, n52Var, null, 6));
                    }
                    xtc xtcVar = d;
                    boolean g = av8Var4.g(function1);
                    Object O = av8Var4.O();
                    if (g || O == nf3.a) {
                        O = new uj8(6, function1);
                        av8Var4.n0(O);
                    }
                    trh.a(gv9Var, yvaVar, (Function1) O, xtcVar, null, null, lrhVar, false, false, false, null, null, av8Var4, 0, 4016);
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var4, n12.a.a(utcVar, uxf.j));
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
