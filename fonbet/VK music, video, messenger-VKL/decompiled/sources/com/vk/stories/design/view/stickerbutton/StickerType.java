package com.vk.stories.design.view.stickerbutton;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickerType.kt */
/* loaded from: classes6.dex */
public final class StickerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerType[] $VALUES;
    public static final StickerType GIF;
    public static final StickerType HASHTAG;
    public static final StickerType LINK;
    public static final StickerType LOCATION;
    public static final StickerType MENTION;
    public static final StickerType MUSIC;
    public static final StickerType OPINION;
    public static final StickerType PHOTO;
    public static final StickerType PHOTO_SMALL;
    public static final StickerType POLL;
    public static final StickerType PRODUCT;
    public static final StickerType REACTION;
    public static final StickerType SERVICE;
    public static final StickerType TIME;
    public static final StickerType TIME_REGULAR;

    static {
        StickerType stickerType = new StickerType("MENTION", 0);
        MENTION = stickerType;
        StickerType stickerType2 = new StickerType("LINK", 1);
        LINK = stickerType2;
        StickerType stickerType3 = new StickerType("PHOTO", 2);
        PHOTO = stickerType3;
        StickerType stickerType4 = new StickerType("PHOTO_SMALL", 3);
        PHOTO_SMALL = stickerType4;
        StickerType stickerType5 = new StickerType("HASHTAG", 4);
        HASHTAG = stickerType5;
        StickerType stickerType6 = new StickerType("LOCATION", 5);
        LOCATION = stickerType6;
        StickerType stickerType7 = new StickerType("POLL", 6);
        POLL = stickerType7;
        StickerType stickerType8 = new StickerType("GIF", 7);
        GIF = stickerType8;
        StickerType stickerType9 = new StickerType("TIME", 8);
        TIME = stickerType9;
        StickerType stickerType10 = new StickerType("TIME_REGULAR", 9);
        TIME_REGULAR = stickerType10;
        StickerType stickerType11 = new StickerType("PRODUCT", 10);
        PRODUCT = stickerType11;
        StickerType stickerType12 = new StickerType("SERVICE", 11);
        SERVICE = stickerType12;
        StickerType stickerType13 = new StickerType("MUSIC", 12);
        MUSIC = stickerType13;
        StickerType stickerType14 = new StickerType("OPINION", 13);
        OPINION = stickerType14;
        StickerType stickerType15 = new StickerType("REACTION", 14);
        REACTION = stickerType15;
        StickerType[] stickerTypeArr = {stickerType, stickerType2, stickerType3, stickerType4, stickerType5, stickerType6, stickerType7, stickerType8, stickerType9, stickerType10, stickerType11, stickerType12, stickerType13, stickerType14, stickerType15};
        $VALUES = stickerTypeArr;
        $ENTRIES = new asp(stickerTypeArr);
    }

    public StickerType() {
        throw null;
    }

    public static StickerType valueOf(String str) {
        return (StickerType) Enum.valueOf(StickerType.class, str);
    }

    public static StickerType[] values() {
        return (StickerType[]) $VALUES.clone();
    }
}
