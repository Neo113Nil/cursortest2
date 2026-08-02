package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b;
import defpackage.ad2;
import defpackage.c40;
import defpackage.rq3;
import defpackage.t3;
import defpackage.xw3;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final Context a;
    public final c40 b;

    public a(Context context, c40 c40Var) {
        this.a = context;
        this.b = c40Var;
    }

    @JavascriptInterface
    public final void close() {
        c40 c40Var = this.b;
        if (((c0) c40Var.h) == c0.Expanded) {
            c40Var.h = c0.Default;
        }
    }

    @JavascriptInterface
    public final void expand(@NotNull String str) {
        str.getClass();
    }

    @JavascriptInterface
    public final void open(@NotNull String str) {
        str.getClass();
        String string = new JSONObject(str).getString("url");
        string.getClass();
        c40 c40Var = this.b;
        com.facebook.c0 c0Var = (com.facebook.c0) c40Var.f;
        JSONObject jSONObject = new JSONObject();
        if (c.v(string, "itms-apps://", false)) {
            string = c.r(string, "itms-apps://", "https://", false);
        }
        jSONObject.put("event", "clickthrough");
        jSONObject.put("contentType", CampaignEx.JSON_KEY_MRAID);
        jSONObject.put("url", string);
        try {
            ((b) c40Var.d).a(jSONObject);
            c0Var.getClass();
            c0Var.b("mraidbridge.nativeCallComplete(" + JSONObject.quote("open") + ')');
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TAG", "Ad clicked: ".concat(string), false, 4, null);
        } catch (Exception unused) {
            c0Var.getClass();
            c0Var.b("mraidbridge.notifyErrorEvent(" + JSONObject.quote("open") + ", " + JSONObject.quote("Can't open links when mraid container is not visible to the user") + ')');
        }
    }

    @JavascriptInterface
    public final void resize(@NotNull String str) {
        str.getClass();
    }

    @JavascriptInterface
    public final void setOrientationProperties(@NotNull String str) {
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            String optString = jSONObject.optString("forceOrientation", "none");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Orientation Set from JSON: " + optBoolean + ", " + optString, false, 4, null);
            y.a.getClass();
            y a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a.a(optString);
            if (a != null) {
                c40 c40Var = this.b;
                xw3.L((ad2) c40Var.e, null, null, new t3(c40Var, optBoolean, a, (rq3) null, 15), 3);
            }
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Error parsing orientation properties JSON", e, false, 8, null);
        }
    }
}
