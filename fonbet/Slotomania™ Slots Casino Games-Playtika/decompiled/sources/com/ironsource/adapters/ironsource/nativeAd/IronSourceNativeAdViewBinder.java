package com.ironsource.adapters.ironsource.nativeAd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.B8;
import com.ironsource.C8;
import com.ironsource.E8;
import com.ironsource.F8;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final E8 nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private B8 networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(E8 nativeAd, NativeAdProperties nativeAdProperties) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.c() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            C8 c = this.nativeAd.c();
            Intrinsics.checkNotNull(c);
            WebView l = c.l();
            if (l != null) {
                mediaView.addView(l, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        C8 c2 = this.nativeAd.c();
        Intrinsics.checkNotNull(c2);
        View m = c2.m();
        m.setId(R.id.privacy_icon_button);
        m.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        B8 b8 = new B8(context);
        b8.addView(view);
        b8.addView(m);
        this.networkNativeAdView = b8;
        B8 networkNativeAdView = getNetworkNativeAdView();
        Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.a(new F8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), m));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public B8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
