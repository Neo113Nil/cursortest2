package defpackage;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iuc implements MediationBannerAd, AdLoad.Listener, BannerAdShowListener {
    public final MediationAdLoadCallback a;
    public final AdSize b;
    public final String c;
    public final String d;
    public final String e;
    public Banner f;
    public MediationBannerAdCallback g;

    public iuc(MediationAdLoadCallback mediationAdLoadCallback, AdSize adSize, String str, String str2, String str3) {
        this.a = mediationAdLoadCallback;
        this.b = adSize;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        Banner banner = this.f;
        if (banner != null) {
            return banner;
        }
        Intrinsics.i("molocoAd");
        throw null;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationBannerAdCallback mediationBannerAdCallback = this.g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationBannerAdCallback mediationBannerAdCallback = this.g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onFailure(new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.g = (MediationBannerAdCallback) this.a.onSuccess(this);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onFailure(new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationBannerAdCallback mediationBannerAdCallback = this.g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
