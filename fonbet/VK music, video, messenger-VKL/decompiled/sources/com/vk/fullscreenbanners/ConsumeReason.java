package com.vk.fullscreenbanners;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConsumeReason.kt */
/* loaded from: classes16.dex */
public final class ConsumeReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConsumeReason[] $VALUES;
    public static final ConsumeReason CLOSE;
    public static final ConsumeReason SWIPE;
    private final String value;

    static {
        ConsumeReason consumeReason = new ConsumeReason("SWIPE", 0, "swipe");
        SWIPE = consumeReason;
        ConsumeReason consumeReason2 = new ConsumeReason("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = consumeReason2;
        ConsumeReason[] consumeReasonArr = {consumeReason, consumeReason2};
        $VALUES = consumeReasonArr;
        $ENTRIES = new asp(consumeReasonArr);
    }

    public ConsumeReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static ConsumeReason valueOf(String str) {
        return (ConsumeReason) Enum.valueOf(ConsumeReason.class, str);
    }

    public static ConsumeReason[] values() {
        return (ConsumeReason[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
