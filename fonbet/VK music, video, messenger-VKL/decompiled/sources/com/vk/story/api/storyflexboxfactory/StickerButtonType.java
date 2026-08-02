package com.vk.story.api.storyflexboxfactory;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryFlexboxFactory.kt */
/* loaded from: classes6.dex */
public final class StickerButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerButtonType[] $VALUES;
    public static final StickerButtonType GIF;
    public static final StickerButtonType HASHTAG;
    public static final StickerButtonType LINK;
    public static final StickerButtonType LOCATION;
    public static final StickerButtonType MENTION;
    public static final StickerButtonType MUSIC;
    public static final StickerButtonType OPINION;
    public static final StickerButtonType PHOTO;
    public static final StickerButtonType POLL;
    public static final StickerButtonType PRODUCT;
    public static final StickerButtonType REACTION;
    public static final StickerButtonType SERVICE;
    public static final StickerButtonType TIME;

    static {
        StickerButtonType stickerButtonType = new StickerButtonType("MENTION", 0);
        MENTION = stickerButtonType;
        StickerButtonType stickerButtonType2 = new StickerButtonType("LINK", 1);
        LINK = stickerButtonType2;
        StickerButtonType stickerButtonType3 = new StickerButtonType("PHOTO", 2);
        PHOTO = stickerButtonType3;
        StickerButtonType stickerButtonType4 = new StickerButtonType("HASHTAG", 3);
        HASHTAG = stickerButtonType4;
        StickerButtonType stickerButtonType5 = new StickerButtonType("LOCATION", 4);
        LOCATION = stickerButtonType5;
        StickerButtonType stickerButtonType6 = new StickerButtonType("POLL", 5);
        POLL = stickerButtonType6;
        StickerButtonType stickerButtonType7 = new StickerButtonType("OPINION", 6);
        OPINION = stickerButtonType7;
        StickerButtonType stickerButtonType8 = new StickerButtonType("GIF", 7);
        GIF = stickerButtonType8;
        StickerButtonType stickerButtonType9 = new StickerButtonType("TIME", 8);
        TIME = stickerButtonType9;
        StickerButtonType stickerButtonType10 = new StickerButtonType("PRODUCT", 9);
        PRODUCT = stickerButtonType10;
        StickerButtonType stickerButtonType11 = new StickerButtonType("SERVICE", 10);
        SERVICE = stickerButtonType11;
        StickerButtonType stickerButtonType12 = new StickerButtonType("MUSIC", 11);
        MUSIC = stickerButtonType12;
        StickerButtonType stickerButtonType13 = new StickerButtonType("REACTION", 12);
        REACTION = stickerButtonType13;
        StickerButtonType[] stickerButtonTypeArr = {stickerButtonType, stickerButtonType2, stickerButtonType3, stickerButtonType4, stickerButtonType5, stickerButtonType6, stickerButtonType7, stickerButtonType8, stickerButtonType9, stickerButtonType10, stickerButtonType11, stickerButtonType12, stickerButtonType13};
        $VALUES = stickerButtonTypeArr;
        $ENTRIES = new asp(stickerButtonTypeArr);
    }

    public StickerButtonType() {
        throw null;
    }

    public static StickerButtonType valueOf(String str) {
        return (StickerButtonType) Enum.valueOf(StickerButtonType.class, str);
    }

    public static StickerButtonType[] values() {
        return (StickerButtonType[]) $VALUES.clone();
    }
}
