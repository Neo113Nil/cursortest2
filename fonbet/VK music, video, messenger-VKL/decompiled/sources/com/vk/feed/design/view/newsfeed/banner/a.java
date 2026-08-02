package com.vk.feed.design.view.newsfeed.banner;

import com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkFeedLegoBannerDefaults.kt */
/* loaded from: classes18.dex */
public final class a {

    /* compiled from: VkFeedLegoBannerDefaults.kt */
    /* renamed from: com.vk.feed.design.view.newsfeed.banner.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1043a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkFeedLegoBanner.BackgroundMode.values().length];
            try {
                iArr[VkFeedLegoBanner.BackgroundMode.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkFeedLegoBanner.BackgroundMode.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static int a(VkFeedLegoBanner.BackgroundMode backgroundMode) {
        int i = C1043a.$EnumSwitchMapping$0[backgroundMode.ordinal()];
        if (i == 1) {
            return R.attr.vk_ui_text_primary_invariably;
        }
        if (i == 2) {
            return R.attr.vk_ui_text_contrast;
        }
        throw new NoWhenBranchMatchedException();
    }
}
