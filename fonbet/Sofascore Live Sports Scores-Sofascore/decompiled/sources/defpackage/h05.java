package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h05 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j05 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ h05(boolean z, j05 j05Var, Function1 function1, int i) {
        this.a = i;
        this.b = z;
        this.c = j05Var;
        this.d = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        Function1 function1 = this.d;
        j05 j05Var = this.c;
        boolean z = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    un0.a(xpa.a(xpaVar, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1307483065, av8Var, new h05(z, j05Var, function1, i2)), av8Var, 196608, 24);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    sha.a(6, 2, av8Var2, null, "Experiments");
                    boolean z2 = !z;
                    mi6 mi6Var = j05Var.h;
                    List list = j05Var.g;
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = new qz4(9);
                        av8Var2.n0(O);
                    }
                    Function1 function12 = (Function1) O;
                    boolean g = av8Var2.g(function1);
                    Object O2 = av8Var2.O();
                    if (g || O2 == a99Var) {
                        O2 = new vi(15, function1);
                        av8Var2.n0(O2);
                    }
                    t62.s("Experiment", mi6Var, function12, list, (Function1) O2, null, null, true, z2, av8Var2, 12583302, 96);
                    nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                    mi6 mi6Var2 = j05Var.h;
                    if (mi6Var2 == null) {
                        av8Var2.d0(-737866921);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-737866920);
                        ri6 ri6Var = j05Var.j;
                        List list2 = j05Var.i;
                        if (list2 == null) {
                            list2 = km5.a;
                        }
                        List list3 = list2;
                        Object O3 = av8Var2.O();
                        if (O3 == a99Var) {
                            O3 = new qz4(10);
                            av8Var2.n0(O3);
                        }
                        Function1 function13 = (Function1) O3;
                        boolean g2 = av8Var2.g(function1) | av8Var2.i(mi6Var2);
                        Object O4 = av8Var2.O();
                        if (g2 || O4 == a99Var) {
                            O4 = new r82(14, function1, mi6Var2);
                            av8Var2.n0(O4);
                        }
                        t62.s("Group", ri6Var, function13, list3, (Function1) O4, null, null, true, z2, av8Var2, 12583302, 96);
                        av8Var2.s(false);
                    }
                    if (z) {
                        bf3.r(8.0f, -736892838, av8Var2, av8Var2, utcVar);
                        long D = lz.D(R.color.n_lv_3, av8Var2);
                        yf8 yf8Var = xth.a;
                        udj.c("Please set a valid MCC to participate in an experiment.", null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 6, 0, 131066);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-736482491);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
