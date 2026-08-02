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
import com.ironsource.C4259pg;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J0\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "<init>", "()V", "isActive", "", "()Z", "version", "", C4259pg.b, "()Ljava/lang/String;", "activate", "", "context", "Landroid/content/Context;", "createHtmlAdSessionContext", "Lcom/iab/omid/library/unity3d/adsession/AdSessionContext;", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "adView", "Landroid/webkit/WebView;", "contentUrl", "customReferenceData", "createJavaScriptAdSessionContext", "createAdSessionConfiguration", "Lcom/iab/omid/library/unity3d/adsession/AdSessionConfiguration;", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "owner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "mediaEventsOwner", "isolateVerificationScripts", "createAdSession", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "adSessionConfiguration", "createAdEvents", "Lcom/iab/omid/library/unity3d/adsession/AdEvents;", "adSession", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@NotNull Context context) {
        context.getClass();
        Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdEvents createAdEvents(@NotNull AdSession adSession) {
        adSession.getClass();
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        createAdEvents.getClass();
        return createAdEvents;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSession createAdSession(@NotNull AdSessionConfiguration adSessionConfiguration, @NotNull AdSessionContext context) {
        adSessionConfiguration.getClass();
        context.getClass();
        AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, context);
        createAdSession.getClass();
        return createAdSession;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionConfiguration createAdSessionConfiguration(@NotNull CreativeType creativeType, @NotNull ImpressionType impressionType, @NotNull Owner owner, @NotNull Owner mediaEventsOwner, boolean isolateVerificationScripts) {
        creativeType.getClass();
        impressionType.getClass();
        owner.getClass();
        mediaEventsOwner.getClass();
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, mediaEventsOwner, isolateVerificationScripts);
        createAdSessionConfiguration.getClass();
        return createAdSessionConfiguration;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionContext createHtmlAdSessionContext(@Nullable Partner partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, adView, contentUrl, customReferenceData);
        createHtmlAdSessionContext.getClass();
        return createHtmlAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionContext createJavaScriptAdSessionContext(@Nullable Partner partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        AdSessionContext createJavascriptAdSessionContext = AdSessionContext.createJavascriptAdSessionContext(partner, adView, contentUrl, customReferenceData);
        createJavascriptAdSessionContext.getClass();
        return createJavascriptAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public String getVersion() {
        String version = Omid.getVersion();
        version.getClass();
        return version;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return Omid.isActive();
    }
}
