package com.ironsource.adapters.ironsource.nativeAd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.A8;
import com.ironsource.C4430z8;
import com.ironsource.C8;
import com.ironsource.D8;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {

    @NotNull
    private final C8 nativeAd;

    @NotNull
    private final NativeAdProperties nativeAdProperties;

    @Nullable
    private C4430z8 networkNativeAdView;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    public IronSourceNativeAdViewBinder(@NotNull C8 c8, @NotNull NativeAdProperties nativeAdProperties) {
        c8.getClass();
        nativeAdProperties.getClass();
        this.nativeAd = c8;
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
                zzl.b();
                return null;
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(@Nullable View view) {
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
            A8 c = this.nativeAd.c();
            c.getClass();
            WebView l = c.l();
            if (l != null) {
                mediaView.addView(l, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        A8 c2 = this.nativeAd.c();
        c2.getClass();
        View m = c2.m();
        m.setId(R.id.privacy_icon_button);
        m.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        context.getClass();
        C4430z8 c4430z8 = new C4430z8(context);
        c4430z8.addView(view);
        c4430z8.addView(m);
        this.networkNativeAdView = c4430z8;
        C4430z8 networkNativeAdView = getNetworkNativeAdView();
        networkNativeAdView.getClass();
        this.nativeAd.a(new D8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), m));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    @Nullable
    public C4430z8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
