package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.pots.topLeagues.bottomSheet.POTSLeagueTopPlayersBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w1e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ POTSLeagueTopPlayersBottomSheet b;

    public /* synthetic */ w1e(POTSLeagueTopPlayersBottomSheet pOTSLeagueTopPlayersBottomSheet, int i) {
        this.a = i;
        this.b = pOTSLeagueTopPlayersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        POTSLeagueTopPlayersBottomSheet pOTSLeagueTopPlayersBottomSheet = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    e1d x = rfo.x(((y1e) pOTSLeagueTopPlayersBottomSheet.C.getValue()).f, av8Var, 0);
                    av8Var.d0(-1948146353);
                    ksa a = msa.a(0, 0, av8Var, 0, 3);
                    pOTSLeagueTopPlayersBottomSheet.F(a, null, av8Var, 0);
                    av8Var.s(false);
                    xtc x2 = gz8.x(bkh.d(utcVar, 1.0f), null, null, 3);
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    boolean g = av8Var.g(x);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new cl1(x, 13);
                        av8Var.n0(O);
                    }
                    v8a.a(x2, a, C, null, null, null, false, null, (Function1) O, av8Var, 384, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    l8g a2 = k8g.a(new ng0(12.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    td4.y(((y1e) pOTSLeagueTopPlayersBottomSheet.C.getValue()).g, 48, 12, av8Var2, bkh.l(utcVar, 48.0f), null, false);
                    goa goaVar = new goa(1.0f, true);
                    String str = (String) pOTSLeagueTopPlayersBottomSheet.D.getValue();
                    yf8 yf8Var = xth.a;
                    udj.c(str, goaVar, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var2, 0, 24960, 110584);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
