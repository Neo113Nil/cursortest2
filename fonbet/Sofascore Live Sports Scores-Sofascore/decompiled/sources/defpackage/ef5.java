package defpackage;

import com.adsbynimbus.google.DynamicPriceRenderer;
import com.adsbynimbus.google.NimbusRewardCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ef5 implements OnUserEarnedRewardListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NimbusRewardCallback b;

    public /* synthetic */ ef5(NimbusRewardCallback nimbusRewardCallback, int i) {
        this.a = i;
        this.b = nimbusRewardCallback;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        int i = this.a;
        NimbusRewardCallback nimbusRewardCallback = this.b;
        switch (i) {
            case 0:
                DynamicPriceRenderer.showAd$lambda$7(nimbusRewardCallback, rewardItem);
                break;
            default:
                DynamicPriceRenderer.showAd$lambda$9(nimbusRewardCallback, rewardItem);
                break;
        }
    }
}
