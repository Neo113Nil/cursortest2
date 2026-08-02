package com.vk.dto.common.gift;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftType.kt */
/* loaded from: classes18.dex */
public final class GiftType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftType[] $VALUES;
    public static final a Companion;
    public static final GiftType GIFT_CARD;
    public static final GiftType IMAGE_STATUS;
    public static final GiftType IMAGE_STATUS_PACK;
    public static final GiftType RANDOM_STICKERS_PACK;
    public static final GiftType REGULAR;
    public static final GiftType STICKERS_PACK;
    public static final GiftType STICKERS_PACK_FOR_CHOICES;
    private final String value;

    /* compiled from: GiftType.kt */
    public static final class a {
        public static GiftType a(String str) {
            Object obj;
            Iterator<E> it = GiftType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GiftType) obj).i(), str)) {
                    break;
                }
            }
            GiftType giftType = (GiftType) obj;
            return giftType == null ? GiftType.REGULAR : giftType;
        }
    }

    static {
        GiftType giftType = new GiftType("IMAGE_STATUS", 0, "image_status");
        IMAGE_STATUS = giftType;
        GiftType giftType2 = new GiftType("IMAGE_STATUS_PACK", 1, "image_status_pack");
        IMAGE_STATUS_PACK = giftType2;
        GiftType giftType3 = new GiftType("REGULAR", 2, "regular");
        REGULAR = giftType3;
        GiftType giftType4 = new GiftType("STICKERS_PACK", 3, "stickers_pack");
        STICKERS_PACK = giftType4;
        GiftType giftType5 = new GiftType("RANDOM_STICKERS_PACK", 4, "random_stickers_pack");
        RANDOM_STICKERS_PACK = giftType5;
        GiftType giftType6 = new GiftType("STICKERS_PACK_FOR_CHOICES", 5, "stickers_pack_for_choice");
        STICKERS_PACK_FOR_CHOICES = giftType6;
        GiftType giftType7 = new GiftType("GIFT_CARD", 6, "gift_card");
        GIFT_CARD = giftType7;
        GiftType[] giftTypeArr = {giftType, giftType2, giftType3, giftType4, giftType5, giftType6, giftType7};
        $VALUES = giftTypeArr;
        $ENTRIES = new asp(giftTypeArr);
        Companion = new a();
    }

    public GiftType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<GiftType> h() {
        return $ENTRIES;
    }

    public static GiftType valueOf(String str) {
        return (GiftType) Enum.valueOf(GiftType.class, str);
    }

    public static GiftType[] values() {
        return (GiftType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
