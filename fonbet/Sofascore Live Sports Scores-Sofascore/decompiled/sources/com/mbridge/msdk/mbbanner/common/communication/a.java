package com.mbridge.msdk.mbbanner.common.communication;

import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static void a(WebView webView, int i, int i2, int i3, int i4) {
        q0.b("BannerCallJS", "transInfoForMraid");
        try {
            int i5 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.n, i5 == 2 ? U3.i.C : i5 == 1 ? U3.i.D : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float n = m0.n(c.n().d());
            float m = m0.m(c.n().d());
            HashMap v = m0.v(c.n().d());
            int intValue = ((Integer) v.get("width")).intValue();
            int intValue2 = ((Integer) v.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "inline");
            hashMap.put("state", BuildConfig.FLAVOR);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, n, m);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            q0.b("BannerCallJS", "transInfoForMraid", th);
        }
    }

    public static void a(WebView webView, float f, float f2) {
        q0.b("BannerCallJS", "fireOnBannerWebViewShow");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", v0.d(c.n().d()));
            f.a().a(webView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            q0.b("BannerCallJS", "fireOnBannerWebViewShow", th);
        }
    }

    public static void a(WebView webView, int i, int i2) {
        q0.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(webView, i, i2);
        } catch (Throwable th) {
            q0.b("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    public static void a(WebView webView) {
        q0.b("BannerCallJS", "fireOnJSBridgeConnected");
        f.a().a(webView);
    }
}
