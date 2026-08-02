package com.appsflyer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b4h;
import defpackage.c69;
import defpackage.dl9;
import defpackage.efa;
import defpackage.efk;
import defpackage.gfk;
import defpackage.hpo;
import defpackage.njh;
import defpackage.ppd;
import defpackage.sx2;
import defpackage.wj2;
import defpackage.y3h;
import defpackage.yma;
import defpackage.zh9;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar) {
        this.a = 25;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit AFKeystoreWrapper;
        Unit registerClient;
        Unit AFLogger;
        Unit d;
        Unit unregisterClient;
        Unit e;
        Unit d2;
        switch (this.a) {
            case 0:
                AFKeystoreWrapper = AFa1qSDK.AFKeystoreWrapper(obj);
                break;
            case 1:
                registerClient = AFa1qSDK.registerClient(obj);
                break;
            case 2:
                AFLogger = AFa1qSDK.AFLogger(obj);
                break;
            case 3:
                d = AFa1qSDK.d(obj);
                break;
            case 4:
                unregisterClient = AFa1qSDK.unregisterClient(obj);
                break;
            case 5:
                e = AFa1qSDK.e(obj);
                break;
            case 6:
                d2 = AFc1dSDK.d((String) obj);
                break;
            case 7:
                zh9 zh9Var = (zh9) obj;
                zh9Var.getClass();
                zh9Var.a(gfk.b, new c69(29));
                zh9Var.a(dl9.b, new c69(29));
                break;
            case 8:
                efk efkVar = (efk) obj;
                efkVar.getClass();
                String str = (String) ((com.moloco.sdk.xenoss.sdkdevkit.android.core.b) com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a.getValue()).a.getValue();
                str.getClass();
                efkVar.a = str;
                break;
            case 9:
                com.moloco.sdk.internal.ortb.model.d dVar = (com.moloco.sdk.internal.ortb.model.d) obj;
                if (dVar == null) {
                    break;
                } else {
                    break;
                }
            case 10:
                com.moloco.sdk.internal.ortb.model.d dVar2 = (com.moloco.sdk.internal.ortb.model.d) obj;
                if (dVar2 == null) {
                    break;
                } else {
                    break;
                }
            case 11:
                efa efaVar = (efa) obj;
                efaVar.getClass();
                efaVar.d = true;
                efaVar.c = true;
                break;
            case 12:
                b4h b4hVar = (b4h) obj;
                b4hVar.getClass();
                y3h.e(b4hVar, "Watermark Overlay");
                y3h.l(b4hVar, "Watermark Overlay");
                break;
            case 13:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj).getClass();
                break;
            case 14:
                ((String) obj).getClass();
                break;
            case 15:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj).getClass();
                break;
            case 16:
                WeakReference weakReference = FullscreenWebviewActivity.j;
                ((ppd) obj).getClass();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Back press detected, but disabled", false, 4, null);
                break;
            case 17:
                b4h b4hVar2 = (b4h) obj;
                b4hVar2.getClass();
                y3h.e(b4hVar2, "Ad Badge");
                y3h.l(b4hVar2, "Ad Badge");
                break;
            case 18:
                b4h b4hVar3 = (b4h) obj;
                b4hVar3.getClass();
                y3h.e(b4hVar3, "rewarded_countdown_timer");
                y3h.l(b4hVar3, "rewarded_countdown_timer");
                break;
            case 19:
                b4h b4hVar4 = (b4h) obj;
                b4hVar4.getClass();
                y3h.e(b4hVar4, "rewarded_countdown_timer_custom");
                y3h.l(b4hVar4, "rewarded_countdown_timer_custom");
                break;
            case 20:
                b4h b4hVar5 = (b4h) obj;
                b4hVar5.getClass();
                y3h.e(b4hVar5, "custom_countdown_timer_text");
                y3h.l(b4hVar5, "custom_countdown_timer_text");
                break;
            case 21:
                b4h b4hVar6 = (b4h) obj;
                b4hVar6.getClass();
                y3h.e(b4hVar6, "custom_timer_container");
                y3h.l(b4hVar6, "custom_timer_container");
                break;
            case 22:
                b4h b4hVar7 = (b4h) obj;
                b4hVar7.getClass();
                y3h.e(b4hVar7, "timer_container");
                y3h.l(b4hVar7, "timer_container");
                break;
            case 23:
                b4h b4hVar8 = (b4h) obj;
                b4hVar8.getClass();
                y3h.e(b4hVar8, "countdown_timer_text");
                y3h.l(b4hVar8, "countdown_timer_text");
                break;
            case 24:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                wj2 wj2Var = ymaVar.a;
                float f = njh.f(wj2Var.n()) / 2.0f;
                float d3 = njh.d(wj2Var.n());
                sx2 sx2Var = wj2Var.b;
                long D = sx2Var.D();
                sx2Var.t().o();
                ((hpo) sx2Var.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, d3, 1);
                ymaVar.a();
                sx2Var.t().h();
                sx2Var.N(D);
                break;
            case 25:
                List list = (List) obj;
                list.getClass();
                break;
            case 26:
                b4h b4hVar9 = (b4h) obj;
                b4hVar9.getClass();
                y3h.e(b4hVar9, "mute_button");
                y3h.l(b4hVar9, "mute_button");
                break;
            default:
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a(int i) {
        this.a = i;
    }
}
