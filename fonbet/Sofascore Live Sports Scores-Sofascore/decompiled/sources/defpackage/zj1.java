package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zj1 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;

    public /* synthetic */ zj1(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        gv9 gv9Var = this.b;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue2 & 1, (intValue2 & 145) != 144)) {
                    ek1.g((bm1) gv9Var.get(intValue), intValue == gv9Var.size() - 1, l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 384);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue4 & 1, (intValue4 & 145) != 144)) {
                    qt7 qt7Var = (qt7) gv9Var.get(intValue3);
                    if (qt7Var instanceof pt7) {
                        av8Var2.d0(1833054915);
                        pt7 pt7Var = (pt7) qt7Var;
                        String v = oea.v(pt7Var.a, av8Var2);
                        yf8 yf8Var = xth.a;
                        udj.c(v, l98.a0(utcVar, pt7Var.b), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var2, 0, 0, 131064);
                        av8Var2.s(false);
                    } else if (qt7Var instanceof ot7) {
                        av8Var2.d0(1833412872);
                        ot7 ot7Var = (ot7) qt7Var;
                        String v2 = oea.v(ot7Var.a, av8Var2);
                        yf8 yf8Var2 = xth.a;
                        udj.c(v2, l98.a0(utcVar, ot7Var.b), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131064);
                        av8Var2.s(false);
                    } else if (qt7Var instanceof lt7) {
                        av8Var2.d0(1833745099);
                        lt7 lt7Var = (lt7) qt7Var;
                        j72.b(lt7Var.a, 0, av8Var2, l98.a0(utcVar, lt7Var.b));
                        av8Var2.s(false);
                    } else if (qt7Var instanceof nt7) {
                        av8Var2.d0(1834015853);
                        nt7 nt7Var = (nt7) qt7Var;
                        wkn.k(haa.t(nt7Var.a, 0, av8Var2), null, l98.a0(bkh.d(utcVar, 1.0f), nt7Var.b), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
                        av8Var2.s(false);
                    } else {
                        if (!(qt7Var instanceof mt7)) {
                            throw dmi.h(av8Var2, -633607737, false);
                        }
                        av8Var2.d0(1834432896);
                        mt7 mt7Var = (mt7) qt7Var;
                        xtc a0 = l98.a0(bkh.d(utcVar, 1.0f), mt7Var.b);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, a0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c, hf3.g);
                        waa.K(av8Var2, m, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C, hf3.d);
                        mt7Var.a.invoke(av8Var2, 0);
                        av8Var2.s(true);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }
}
