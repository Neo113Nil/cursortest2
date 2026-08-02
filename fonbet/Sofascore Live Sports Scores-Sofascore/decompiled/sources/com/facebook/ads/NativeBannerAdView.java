package com.facebook.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public class NativeBannerAdView {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    public enum Type {
        HEIGHT_50(4),
        HEIGHT_100(0),
        HEIGHT_120(1);

        private final int mEnumCode;

        @Nullable
        private NativeAdViewTypeApi mNativeAdViewTypeApi;

        Type(int i) {
            this.mEnumCode = i;
        }

        private NativeAdViewTypeApi getNativeAdViewTypeApi() {
            NativeAdViewTypeApi nativeAdViewTypeApi = this.mNativeAdViewTypeApi;
            if (nativeAdViewTypeApi != null) {
                return nativeAdViewTypeApi;
            }
            NativeAdViewTypeApi createNativeAdViewTypeApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(this.mEnumCode);
            this.mNativeAdViewTypeApi = createNativeAdViewTypeApi;
            return createNativeAdViewTypeApi;
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        public int getHeight() {
            return getNativeAdViewTypeApi().getHeight();
        }

        public int getValue() {
            return getNativeAdViewTypeApi().getValue();
        }

        public int getWidth() {
            return getNativeAdViewTypeApi().getWidth();
        }
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(type, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, null);
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(type, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, nativeAdViewAttributes);
    }
}
