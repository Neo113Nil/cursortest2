package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* compiled from: OMSDKWebMonitor.java */
/* loaded from: classes13.dex */
public class b {
    AdSession a;

    public b(AdSession adSession) {
        this.a = adSession;
    }

    public void a(WebView webView) {
        this.a.registerAdView(webView);
    }
}
