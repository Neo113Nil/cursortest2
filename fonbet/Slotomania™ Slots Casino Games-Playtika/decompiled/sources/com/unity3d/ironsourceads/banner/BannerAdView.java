package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BannerAdView extends FrameLayout implements Q2 {
    private P2 a;
    private BannerAdViewListener b;

    private BannerAdView(Context context) {
        super(context);
    }

    public final BannerAdInfo getAdInfo() {
        P2 p2 = this.a;
        if (p2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            p2 = null;
        }
        return p2.c();
    }

    public final BannerAdViewListener getListener() {
        return this.b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdView(P2 bannerAdViewInternal) {
        this(r0);
        Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this.a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
