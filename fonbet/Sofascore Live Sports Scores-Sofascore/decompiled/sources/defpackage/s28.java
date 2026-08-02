package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s28 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s28(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 17) != 16)) {
                    utc utcVar = utc.a;
                    boolean z = this.c;
                    if (z) {
                        av8Var.d0(-1545067242);
                        tgj.c(i2, 0, av8Var);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1544967515);
                        kq9.b(s6a.N(R.drawable.ic_filter_tune, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                        av8Var.s(false);
                    }
                    String f = fc6.f(4.0f, R.string.filter, av8Var, av8Var, utcVar);
                    yf8 yf8Var = xth.a;
                    q5a.w(f, null, z ? ljg.f(av8Var, -1296746409, R.color.surface_1, av8Var, false) : ljg.f(av8Var, -1296745805, R.color.n_lv_1, av8Var, false), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 131066);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                l8g a = k8g.a(ww9.b, uxf.m, of3Var2, 48);
                av8 av8Var2 = (av8) of3Var2;
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                utc utcVar2 = utc.a;
                xtc C = fqj.C(of3Var2, utcVar2);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var3 = (av8) of3Var2;
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(of3Var2, a, hf3.g);
                waa.K(of3Var2, m, hf3.f);
                waa.K(of3Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(of3Var2, hf3.k);
                waa.K(of3Var2, C, hf3.d);
                String valueOf = String.valueOf(i2);
                long D = lz.D(R.color.n_lv_3, of3Var2);
                yf8 yf8Var2 = xth.a;
                udj.c(valueOf, l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), of3Var2, 48, 0, 131064);
                wnn.a(432, 0, of3Var2, bkh.l(utcVar2, 40.0f), this.c, false);
                av8Var3.s(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s28(boolean z, int i) {
        this.c = z;
        this.b = i;
    }
}
