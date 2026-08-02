package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.adsbynimbus.google.DynamicPriceRenderer;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g19 implements ksh {
    public final RewardedAd a;
    public final wcd b;
    public final String c;
    public final AdType.RewardedInterstitial d;
    public final String e;
    public t4g f;

    public g19(RewardedAd rewardedAd, wcd wcdVar, String str, AdType.RewardedInterstitial rewardedInterstitial) {
        rewardedInterstitial.getClass();
        this.a = rewardedAd;
        this.b = wcdVar;
        this.c = str;
        this.d = rewardedInterstitial;
        ru ruVar = ru.GOOGLE;
        String adUnitId = rewardedAd.getAdUnitId();
        adUnitId.getClass();
        this.e = adUnitId;
    }

    public final void a(FragmentActivity fragmentActivity) {
        nv.g(fragmentActivity, this.c, this.d, ru.GOOGLE, this.e);
        wcd wcdVar = this.b;
        RewardedAd rewardedAd = this.a;
        if (wcdVar != null) {
            DynamicPriceRenderer.showAd(rewardedAd, fragmentActivity, wcdVar, new jcd(), new t9d(this));
        } else {
            rewardedAd.show(fragmentActivity, new kt4(this, 28));
        }
    }
}
