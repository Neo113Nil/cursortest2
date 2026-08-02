package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    AdSession a;

    public b(AdSession adSession) {
        this.a = adSession;
    }

    public void a(WebView webView) {
        this.a.registerAdView(webView);
    }
}
