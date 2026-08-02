package defpackage;

import android.app.Activity;
import com.google.ads.mediation.unity.UnityMediationBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nbk implements IUnityAdsInitializationListener {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ UnityBannerSize c;
    public final /* synthetic */ MediationBannerAdConfiguration d;
    public final /* synthetic */ String e;
    public final /* synthetic */ UnityMediationBannerAd f;

    public nbk(UnityMediationBannerAd unityMediationBannerAd, Activity activity, Activity activity2, UnityBannerSize unityBannerSize, MediationBannerAdConfiguration mediationBannerAdConfiguration, String str) {
        this.f = unityMediationBannerAd;
        this.a = activity;
        this.b = activity2;
        this.c = unityBannerSize;
        this.d = mediationBannerAdConfiguration;
        this.e = str;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        ibk ibkVar;
        ibk ibkVar2;
        fbk fbkVar;
        ibk ibkVar3;
        hbk hbkVar;
        String str;
        ebk.d(MobileAds.getRequestConfiguration(), new MetaData(this.a));
        UnityMediationBannerAd unityMediationBannerAd = this.f;
        ibkVar = unityMediationBannerAd.unityBannerViewWrapper;
        if (ibkVar == null) {
            hbkVar = unityMediationBannerAd.unityBannerViewFactory;
            str = unityMediationBannerAd.bannerPlacementId;
            hbkVar.getClass();
            unityMediationBannerAd.unityBannerViewWrapper = new ibk(new BannerView(this.b, str, this.c));
        }
        ibkVar2 = unityMediationBannerAd.unityBannerViewWrapper;
        ibkVar2.a.setListener(unityMediationBannerAd);
        String uuid = UUID.randomUUID().toString();
        fbkVar = unityMediationBannerAd.unityAdsLoader;
        fbkVar.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(uuid);
        unityAdsLoadOptions.set(MBridgeConstans.EXTRA_KEY_WM, this.d.getWatermark());
        String str2 = this.e;
        if (str2 != null) {
            unityAdsLoadOptions.setAdMarkup(str2);
        }
        ibkVar3 = unityMediationBannerAd.unityBannerViewWrapper;
        ibkVar3.a.load(unityAdsLoadOptions);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        String str2;
        MediationAdLoadCallback mediationAdLoadCallback;
        UnityMediationBannerAd unityMediationBannerAd = this.f;
        str2 = unityMediationBannerAd.gameId;
        AdError a = ebk.a(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + str2 + "' with error message: " + str);
        a.toString();
        mediationAdLoadCallback = unityMediationBannerAd.mediationBannerAdLoadCallback;
        mediationAdLoadCallback.onFailure(a);
    }
}
