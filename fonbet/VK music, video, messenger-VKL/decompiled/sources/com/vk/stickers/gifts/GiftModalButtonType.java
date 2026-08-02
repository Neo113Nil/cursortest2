package com.vk.stickers.gifts;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LimitedGiftModalPage.kt */
/* loaded from: classes6.dex */
public final class GiftModalButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftModalButtonType[] $VALUES;
    public static final GiftModalButtonType SEND;
    public static final GiftModalButtonType SEND_IN_RETURN;
    public static final GiftModalButtonType SEND_MORE;

    static {
        GiftModalButtonType giftModalButtonType = new GiftModalButtonType("SEND", 0);
        SEND = giftModalButtonType;
        GiftModalButtonType giftModalButtonType2 = new GiftModalButtonType("SEND_IN_RETURN", 1);
        SEND_IN_RETURN = giftModalButtonType2;
        GiftModalButtonType giftModalButtonType3 = new GiftModalButtonType("SEND_MORE", 2);
        SEND_MORE = giftModalButtonType3;
        GiftModalButtonType[] giftModalButtonTypeArr = {giftModalButtonType, giftModalButtonType2, giftModalButtonType3};
        $VALUES = giftModalButtonTypeArr;
        $ENTRIES = new asp(giftModalButtonTypeArr);
    }

    public GiftModalButtonType() {
        throw null;
    }

    public static GiftModalButtonType valueOf(String str) {
        return (GiftModalButtonType) Enum.valueOf(GiftModalButtonType.class, str);
    }

    public static GiftModalButtonType[] values() {
        return (GiftModalButtonType[]) $VALUES.clone();
    }
}
