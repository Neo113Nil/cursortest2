package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rbk implements MediationRewardedAd {
    public final MediationAdLoadCallback a;
    public final jbk b;
    public final fbk c;
    public MediationRewardedAdCallback d;
    public String e;
    public String f;
    public final String g;
    public final obk h = new obk(this);
    public final pbk i = new pbk(this);

    public rbk(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, jbk jbkVar, fbk fbkVar) {
        this.g = mediationRewardedAdConfiguration.getWatermark();
        this.a = mediationAdLoadCallback;
        this.b = jbkVar;
        this.c = fbkVar;
    }

    public final void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            this.b.a(context, string, new qbk(this, context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        } else {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            adError.toString();
            this.a.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        if (context instanceof Activity) {
            String str = this.f;
            this.c.getClass();
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(str);
            unityAdsShowOptions.set(MBridgeConstans.EXTRA_KEY_WM, this.g);
            UnityAds.show((Activity) context, this.e, unityAdsShowOptions, this.i);
            return;
        }
        AdError adError = new AdError(105, "Unity Ads requires an Activity context to load ads.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
