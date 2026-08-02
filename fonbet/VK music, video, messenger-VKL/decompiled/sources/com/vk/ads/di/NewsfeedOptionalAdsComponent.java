package com.vk.ads.di;

import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.ArrayList;
import xsna.aav0;
import xsna.bav0;

/* compiled from: NewsfeedOptionalAdsComponent.kt */
/* loaded from: classes14.dex */
public interface NewsfeedOptionalAdsComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: NewsfeedOptionalAdsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final NewsfeedOptionalAdsComponent STUB = new NewsfeedOptionalAdsComponent() { // from class: com.vk.ads.di.NewsfeedOptionalAdsComponent$Companion$STUB$1
            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final boolean T1(VkOptionalNativeAdType vkOptionalNativeAdType) {
                return false;
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final NativeAdUserLevelAnalyticsSender d5() {
                throw new UnsupportedOperationException("called provideNativeAdUserLevelAnalyticsSender on STUB");
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final aav0.a m5(VkOptionalNativeAdType vkOptionalNativeAdType) {
                return null;
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final bav0 q4(VkOptionalNativeAdType vkOptionalNativeAdType) {
                return null;
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final void Sc() {
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final void la() {
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final void Wa(ArrayList arrayList) {
            }

            @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
            public final void sa(NavigationDelegateActivity navigationDelegateActivity) {
            }
        };

        public final NewsfeedOptionalAdsComponent getSTUB() {
            return STUB;
        }
    }

    void Sc();

    boolean T1(VkOptionalNativeAdType vkOptionalNativeAdType);

    void Wa(ArrayList arrayList);

    NativeAdUserLevelAnalyticsSender d5();

    void la();

    aav0.a m5(VkOptionalNativeAdType vkOptionalNativeAdType);

    bav0 q4(VkOptionalNativeAdType vkOptionalNativeAdType);

    void sa(NavigationDelegateActivity navigationDelegateActivity);
}
