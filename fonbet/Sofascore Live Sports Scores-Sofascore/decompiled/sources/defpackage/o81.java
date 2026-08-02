package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o81(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u6h.s(i2, aba.K(1), (of3) obj);
                break;
            case 1:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    kq9.b(s6a.N(i2, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                ((Integer) obj).intValue();
                ku5 ku5Var = (ku5) obj2;
                ku5Var.getClass();
                break;
            case 3:
                ((Integer) obj2).getClass();
                tgj.c(i2, aba.K(1), (of3) obj);
                break;
            case 4:
                ((Integer) obj2).getClass();
                fsd.f(i2, aba.K(1), (of3) obj);
                break;
            case 5:
                ((Integer) obj2).getClass();
                fsd.f(i2, aba.K(1), (of3) obj);
                break;
            case 6:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, d0);
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
                    String valueOf = String.valueOf(i2);
                    yf8 yf8Var = xth.a;
                    q5a.w(valueOf, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.i(), av8Var2, 0, 0, 131066);
                    kq9.b(s6a.N(R.drawable.ic_pots_trophy, 6, av8Var2), null, ljg.i(utcVar, 4.0f, av8Var2, utcVar, 16.0f), lz.D(R.color.rating_90, av8Var2), av8Var2, 432, 0);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                u0a.b(i2, aba.K(1), (of3) obj);
                break;
            case 8:
                ((Integer) obj2).getClass();
                nce.d(i2, aba.K(1), (of3) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                g7a.a(i2, aba.K(1), (of3) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                gvd.r(i2, aba.K(1), (of3) obj);
                break;
            case 11:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String v = oea.v(i2, av8Var3);
                    long D = lz.D(R.color.n_lv_3, av8Var3);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var3, 0, 0, 131066);
                } else {
                    av8Var3.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                t6a.c(i2, aba.K(1), (of3) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                rpm.a(aba.K(i2 | 1), (of3) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o81(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
    }
}
