package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.ped;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/moloco/sdk/publisher/BannerActivitySample;", "Landroid/app/Activity;", "<init>", "()V", "bannerContainer", "Landroid/widget/FrameLayout;", "banner", "Lcom/moloco/sdk/publisher/Banner;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "onDestroy", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BannerActivitySample extends Activity {
    private Banner banner;

    @NotNull
    private final FrameLayout bannerContainer = new FrameLayout(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BannerActivitySample bannerActivitySample, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner == null) {
            bannerActivitySample.finish();
            return Unit.a;
        }
        bannerActivitySample.banner = banner;
        bannerActivitySample.bannerContainer.addView(banner);
        banner.setAdShowListener(new BannerAdShowListener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$1
            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdClicked(MolocoAd molocoAd) {
                molocoAd.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdHidden(MolocoAd molocoAd) {
                molocoAd.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowFailed(MolocoAdError molocoAdError) {
                molocoAdError.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowSuccess(MolocoAd molocoAd) {
                molocoAd.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }
        });
        banner.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$2
            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadFailed(MolocoAdError molocoAdError) {
                molocoAdError.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadSuccess(MolocoAd molocoAd) {
                molocoAd.getClass();
                throw new ped("An operation is not implemented: Not yet implemented");
            }
        });
        banner.isLoaded();
        banner.load("an_another_bid_response", null);
        bannerActivitySample.bannerContainer.removeView(banner);
        banner.load("", null);
        banner.load("some_other_bid_response", null);
        bannerActivitySample.bannerContainer.addView(banner);
        return Unit.a;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(this.bannerContainer);
        Moloco.createBanner$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new a(this, 0), 4, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Banner banner = this.banner;
        if (banner == null) {
            Intrinsics.i("banner");
            throw null;
        }
        banner.destroy();
        Banner banner2 = this.banner;
        if (banner2 == null) {
            Intrinsics.i("banner");
            throw null;
        }
        ViewParent parent = banner2.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Banner banner3 = this.banner;
            if (banner3 != null) {
                viewGroup.removeView(banner3);
            } else {
                Intrinsics.i("banner");
                throw null;
            }
        }
    }
}
