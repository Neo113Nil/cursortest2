package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class r97 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qug b;

    public /* synthetic */ r97(qug qugVar, int i) {
        this.a = i;
        this.b = qugVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc r;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String v = oea.v(R.string.fantasy_expected_fantasy_points_explained, av8Var);
                    yf8 yf8Var = xth.a;
                    udj.c(v, l98.f0(l98.d0(hkg.u0(utc.a, this.b, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131064);
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
                    View view = (View) av8Var2.k(nz.f);
                    ViewParent parent = view.getParent();
                    e25 e25Var = parent instanceof e25 ? (e25) parent : null;
                    Window window = e25Var != null ? e25Var.getWindow() : null;
                    if (window == null) {
                        av8Var2.d0(1184598543);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1184598544);
                        boolean i = av8Var2.i(window) | av8Var2.i(view);
                        Object O = av8Var2.O();
                        if (i || O == nf3.a) {
                            O = new n37(24, window, view);
                            av8Var2.n0(O);
                        }
                        hz8.t((Function0) O, av8Var2);
                        av8Var2.s(false);
                    }
                    r = m6k.r(utc.a, "IntroductionModal", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                    a.a(FantasySectionedInfoType.WhatIsFantasy.a, r, this.b, av8Var2, 6, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
