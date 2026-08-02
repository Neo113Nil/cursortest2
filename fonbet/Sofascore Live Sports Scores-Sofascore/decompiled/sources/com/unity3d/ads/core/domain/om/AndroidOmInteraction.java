package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import defpackage.a70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "Lcom/unity3d/ads/core/domain/om/OmInteraction;", "<init>", "()V", "getWebview", "Landroid/webkit/WebView;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getOMidOptions", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "options", "Lorg/json/JSONObject;", "getImpressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "getCreativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "getVideoEventsOwner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "getMediaEventsOwner", "getImpressionsOwner", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final CreativeType getCreativeType(JSONObject options) {
        int optInt = options.optInt("creativeType");
        if (optInt == 1) {
            return CreativeType.DEFINED_BY_JAVASCRIPT;
        }
        if (optInt == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (optInt == 3) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (optInt == 4) {
            return CreativeType.VIDEO;
        }
        if (optInt == 5) {
            return CreativeType.AUDIO;
        }
        a70.p("Invalid creativeType");
        return null;
    }

    private final ImpressionType getImpressionType(JSONObject options) {
        switch (options.optInt("impressionType")) {
            case 1:
                return ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return ImpressionType.UNSPECIFIED;
            case 3:
                return ImpressionType.LOADED;
            case 4:
                return ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return ImpressionType.ONE_PIXEL;
            case 6:
                return ImpressionType.VIEWABLE;
            case 7:
                return ImpressionType.AUDIBLE;
            case 8:
                return ImpressionType.OTHER;
            default:
                a70.p("Invalid impressionType");
                return null;
        }
    }

    private final Owner getImpressionsOwner(JSONObject options) {
        try {
            int optInt = options.optInt("impressionOwner");
            if (optInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (optInt == 2) {
                return Owner.NATIVE;
            }
            if (optInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getMediaEventsOwner(JSONObject options) {
        try {
            int optInt = options.optInt("mediaEventsOwner");
            if (optInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (optInt == 2) {
                return Owner.NATIVE;
            }
            if (optInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getVideoEventsOwner(JSONObject options) {
        try {
            int optInt = options.optInt("videoEventsOwner");
            if (optInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (optInt == 2) {
                return Owner.NATIVE;
            }
            if (optInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    @NotNull
    public OmidOptions getOMidOptions(@NotNull JSONObject options) {
        options.getClass();
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    @Nullable
    public WebView getWebview(@NotNull AdObject adObject) {
        adObject.getClass();
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
