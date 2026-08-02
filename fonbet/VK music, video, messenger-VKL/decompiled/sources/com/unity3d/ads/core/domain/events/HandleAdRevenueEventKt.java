package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HandleAdRevenueEvent.kt */
/* loaded from: classes14.dex */
public final class HandleAdRevenueEventKt {

    /* compiled from: HandleAdRevenueEvent.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRevenueOrigin.values().length];
            try {
                iArr[AdRevenueOrigin.AUTOMATIC_COLLECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueEventRequestOuterClass.AdRevenueOrigin toProto(AdRevenueOrigin adRevenueOrigin) {
        if (WhenMappings.$EnumSwitchMapping$0[adRevenueOrigin.ordinal()] == 1) {
            return AdRevenueEventRequestOuterClass.AdRevenueOrigin.AD_REVENUE_ORIGIN_AUTOMATIC_COLLECTION;
        }
        throw new NoWhenBranchMatchedException();
    }
}
