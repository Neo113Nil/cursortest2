package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.Omid;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;

/* compiled from: AndroidOmidManager.kt */
/* loaded from: classes14.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdEvents createAdEvents(AdSession adSession) {
        return AdEvents.createAdEvents(adSession);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        return AdSession.createAdSession(adSessionConfiguration, adSessionContext);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        return AdSessionContext.createHtmlAdSessionContext(partner, webView, str, str2);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createJavaScriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        return AdSessionContext.createJavascriptAdSessionContext(partner, webView, str, str2);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        return Omid.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return Omid.isActive();
    }
}
