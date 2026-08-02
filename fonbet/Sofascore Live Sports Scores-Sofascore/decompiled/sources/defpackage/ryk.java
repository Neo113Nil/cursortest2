package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.vungle.ads.AdConfig;
import com.vungle.ads.RewardedAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ryk implements nyk {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ VungleMediationAdapter c;

    public ryk(VungleMediationAdapter vungleMediationAdapter, Context context, String str) {
        this.c = vungleMediationAdapter;
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.nyk
    public final void a(AdError adError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        adError.toString();
        mediationAdLoadCallback = this.c.mediationAdLoadCallback;
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // defpackage.nyk
    public final void b() {
        myk mykVar;
        AdConfig adConfig;
        RewardedAd rewardedAd;
        RewardedAd rewardedAd2;
        String str;
        RewardedAd rewardedAd3;
        RewardedAd rewardedAd4;
        String str2;
        VungleMediationAdapter vungleMediationAdapter = this.c;
        mykVar = vungleMediationAdapter.vungleFactory;
        adConfig = vungleMediationAdapter.adConfig;
        mykVar.getClass();
        Context context = this.a;
        context.getClass();
        String str3 = this.b;
        str3.getClass();
        adConfig.getClass();
        vungleMediationAdapter.rewardedAd = new RewardedAd(context, str3, adConfig);
        rewardedAd = vungleMediationAdapter.rewardedAd;
        rewardedAd.setAdListener(vungleMediationAdapter);
        rewardedAd2 = vungleMediationAdapter.rewardedAd;
        rewardedAd2.setAdapterAdFormat("VungleMediationAdapter-rewarded");
        str = vungleMediationAdapter.userId;
        if (!TextUtils.isEmpty(str)) {
            rewardedAd4 = vungleMediationAdapter.rewardedAd;
            str2 = vungleMediationAdapter.userId;
            rewardedAd4.setUserId(str2);
        }
        rewardedAd3 = vungleMediationAdapter.rewardedAd;
        rewardedAd3.load();
    }
}
