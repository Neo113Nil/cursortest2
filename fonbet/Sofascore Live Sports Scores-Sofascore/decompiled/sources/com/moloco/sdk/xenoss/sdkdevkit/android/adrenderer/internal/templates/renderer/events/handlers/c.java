package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.hof;
import defpackage.luj;
import defpackage.rq3;
import defpackage.un0;
import defpackage.w9h;
import defpackage.xw3;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public final /* synthetic */ int a;
    public final ad2 b;
    public final aeh c;
    public final hof d;

    public c(int i, ad2 ad2Var) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ad2Var;
                aeh b = beh.b(0, 0, null, 7);
                this.c = b;
                this.d = un0.t(b);
                break;
            case 2:
                this.b = ad2Var;
                aeh b2 = beh.b(0, 0, null, 7);
                this.c = b2;
                this.d = un0.t(b2);
                break;
            default:
                this.b = ad2Var;
                aeh b3 = beh.b(0, 0, null, 7);
                this.c = b3;
                this.d = un0.t(b3);
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        int i = this.a;
        ad2 ad2Var = this.b;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                if (!Intrinsics.c(jSONObject.getString("event"), CollectionsKt.X(w9h.b("closeButtonShown")))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CloseButtonEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "CloseButtonEventHandler", "Close button shown event received from JavaScript", null, false, 12, null);
                    xw3.L(ad2Var, null, null, new luj(this, rq3Var, 20), 3);
                    break;
                }
            case 1:
                if (!Intrinsics.c(jSONObject.getString("event"), CollectionsKt.X(w9h.b(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CloseHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    xw3.L(ad2Var, null, null, new luj(this, rq3Var, 21), 3);
                    break;
                }
            default:
                if (!Intrinsics.c(jSONObject.getString("event"), CollectionsKt.X(w9h.b("skipButtonShown")))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "SkipButtonEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "SkipButtonEventHandler", "Skip button shown event received from JavaScript", null, false, 12, null);
                    xw3.L(ad2Var, null, null, new luj(this, rq3Var, 22), 3);
                    break;
                }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.a) {
            case 0:
                return "CloseButtonEventHandler";
            case 1:
                return "CloseHandler";
            default:
                return "SkipButtonEventHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.a) {
            case 0:
                return w9h.b("closeButtonShown");
            case 1:
                return w9h.b(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            default:
                return w9h.b("skipButtonShown");
        }
    }
}
