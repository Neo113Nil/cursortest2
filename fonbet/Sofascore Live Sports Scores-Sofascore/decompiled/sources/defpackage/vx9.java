package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vx9 extends BannerAdEventListener implements MediationBannerAd {
    public final MediationAdLoadCallback a;
    public final zx9 b;
    public MediationBannerAdCallback c;
    public t9p d;
    public final sx9 e;

    public vx9(MediationAdLoadCallback mediationAdLoadCallback, zx9 zx9Var, sx9 sx9Var) {
        this.a = mediationAdLoadCallback;
        this.b = zx9Var;
        this.e = sx9Var;
    }

    public final void a(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        ux9.e();
        ux9.a(mediationBannerAdConfiguration.getMediationExtras());
        long d = ux9.d(mediationBannerAdConfiguration.getServerParameters());
        this.e.getClass();
        InMobiBanner inMobiBanner = new InMobiBanner(context, d);
        wx9 wx9Var = new wx9(inMobiBanner);
        inMobiBanner.setEnableAutoRefresh(false);
        inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        inMobiBanner.setListener(this);
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            inMobiBanner.setWatermarkData(new WatermarkData(watermark, 0.3f));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = new t9p(frameLayout);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        inMobiBanner.setLayoutParams(new LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        ((FrameLayout) this.d.a).addView(inMobiBanner);
        b(wx9Var, mediationBannerAdConfiguration);
    }

    public abstract void b(wx9 wx9Var, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return (FrameLayout) this.d.a;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public final void onAdDismissed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public final void onAdDisplayed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdImpression(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adError = new AdError(ux9.c(inMobiAdRequestStatus), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), "com.inmobi.sdk");
        adError.toString();
        this.a.onFailure(adError);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        this.c = (MediationBannerAdCallback) this.a.onSuccess(this);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public final void onUserLeftApplication(InMobiBanner inMobiBanner) {
        this.c.onAdLeftApplication();
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public final void onRewardsUnlocked(InMobiBanner inMobiBanner, Map map) {
    }
}
