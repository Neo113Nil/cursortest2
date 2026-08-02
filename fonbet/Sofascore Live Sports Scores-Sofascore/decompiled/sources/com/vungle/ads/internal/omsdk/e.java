package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.ads.BuildConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements f {
    public static final long d = 1000;
    public final boolean a;
    public boolean b;
    public AdSession c;

    public e(boolean z) {
        this.a = z;
    }

    public final void a(WebView webView) {
        webView.getClass();
        if (this.b && this.c == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.c = createAdSession;
            if (createAdSession != null) {
                createAdSession.registerAdView(webView);
            }
            AdSession adSession = this.c;
            if (adSession != null) {
                adSession.start();
            }
        }
    }

    public final void a() {
        if (this.a && Omid.isActive()) {
            this.b = true;
        }
    }
}
