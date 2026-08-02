package com.vk.superapp.advertisement;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertisementWaterfallImpl.kt */
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TimeoutConfig a(SkippedSlot skippedSlot, AdvertisementType advertisementType) {
        int i = a.$EnumSwitchMapping$0[advertisementType.ordinal()];
        if (i == 1) {
            return skippedSlot.d();
        }
        if (i == 2) {
            return skippedSlot.b();
        }
        if (i == 3) {
            return skippedSlot.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
