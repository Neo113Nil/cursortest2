package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o2e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ POTSPlayerAwardsBottomSheet b;

    public /* synthetic */ o2e(POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet, int i) {
        this.a = i;
        this.b = pOTSPlayerAwardsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = nf3.a;
        POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    Object x = rfo.x(((r2e) pOTSPlayerAwardsBottomSheet.C.getValue()).f, av8Var, 0);
                    av8Var.d0(651180217);
                    ksa a = msa.a(0, 0, av8Var, 0, 3);
                    pOTSPlayerAwardsBottomSheet.F(a, null, av8Var, 0);
                    av8Var.s(false);
                    xtc x2 = gz8.x(bkh.d(utc.a, 1.0f), null, null, 3);
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    boolean g = av8Var.g(x) | av8Var.i(pOTSPlayerAwardsBottomSheet);
                    Object O = av8Var.O();
                    if (g || O == obj3) {
                        O = new ord(5, x, pOTSPlayerAwardsBottomSheet);
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
                    boolean i2 = av8Var2.i(pOTSPlayerAwardsBottomSheet);
                    Object O2 = av8Var2.O();
                    if (i2 || O2 == obj3) {
                        O2 = new p2e(pOTSPlayerAwardsBottomSheet, 1);
                        av8Var2.n0(O2);
                    }
                    Function0 function0 = (Function0) O2;
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    l8g a2 = k8g.a(new ng0(12.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    Function0 function02 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function02);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    int i3 = ((r2e) pOTSPlayerAwardsBottomSheet.C.getValue()).g;
                    xtc l = bkh.l(utcVar, 48.0f);
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O3 = av8Var2.O();
                    if (O3 == obj3) {
                        O3 = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O3;
                    Object[] objArr = new Object[0];
                    Object O4 = av8Var2.O();
                    if (O4 == obj3) {
                        O4 = jxa.A;
                        av8Var2.n0(O4);
                    }
                    td4.C(i3, tol.y(l, true, false, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O4, av8Var2, 48), 22), av8Var2, 0), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 12);
                    long D2 = lz.D(R.color.n_lv_4, av8Var2);
                    Object O5 = av8Var2.O();
                    if (O5 == obj3) {
                        O5 = mz1.e(av8Var2);
                    }
                    wzc wzcVar2 = (wzc) O5;
                    Object[] objArr2 = new Object[0];
                    Object O6 = av8Var2.O();
                    if (O6 == obj3) {
                        O6 = jxa.B;
                        av8Var2.n0(O6);
                    }
                    xtc y = tol.y(utcVar, true, true, false, D2, wzcVar2, new p28(function0, (boh) o3a.N(objArr2, (Function0) O6, av8Var2, 48), 23), av8Var2, 0);
                    String str = (String) pOTSPlayerAwardsBottomSheet.D.getValue();
                    yf8 yf8Var = xth.a;
                    udj.c(str, y, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var2, 0, 24960, 110584);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
