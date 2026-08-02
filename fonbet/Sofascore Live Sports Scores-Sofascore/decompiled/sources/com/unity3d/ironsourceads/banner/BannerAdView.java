package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.N2;
import com.ironsource.O2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class BannerAdView extends FrameLayout implements O2 {
    private N2 a;

    @Nullable
    private BannerAdViewListener b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdView(@NotNull N2 n2) {
        this(r0);
        n2.getClass();
        Context context = n2.d().getContext();
        context.getClass();
        this.a = n2;
        n2.a(new WeakReference<>(this));
        n2.b(new WeakReference<>(this));
    }

    @NotNull
    public final BannerAdInfo getAdInfo() {
        N2 n2 = this.a;
        if (n2 != null) {
            return n2.c();
        }
        Intrinsics.i("bannerAdViewInternal");
        throw null;
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.b;
    }

    @Override // com.ironsource.O2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.O2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.b = bannerAdViewListener;
    }

    private BannerAdView(Context context) {
        super(context);
    }
}
