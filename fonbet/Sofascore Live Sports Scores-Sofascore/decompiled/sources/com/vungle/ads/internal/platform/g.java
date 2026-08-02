package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.yn3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class g {
    public static void a(WebView webView, f0 f0Var) {
        Boolean b;
        Boolean a;
        webView.getClass();
        WebSettings settings = webView.getSettings();
        settings.getClass();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((f0Var == null || (a = f0Var.a()) == null) ? false : a.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((f0Var == null || (b = f0Var.b()) == null) ? false : b.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public static void a(Context context, yn3 yn3Var) {
        Object u2gVar;
        context.getClass();
        yn3Var.getClass();
        try {
            p2g p2gVar = w2g.b;
            u2gVar = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            yn3Var.accept((String) u2gVar);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z = u.a;
            t.a("WebViewUtil", "Failed to get user agent", a);
            yn3Var.accept(null);
        }
    }
}
