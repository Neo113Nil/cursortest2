package com.vk.newsfeed.common.domain.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostAction.kt */
/* loaded from: classes4.dex */
public final class LikableItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikableItemType[] $VALUES;
    public static final LikableItemType AUDIO;
    public static final LikableItemType COMMENT;
    public static final LikableItemType MARKET;
    public static final LikableItemType MARKET_COMMENT;
    public static final LikableItemType NOTE;
    public static final LikableItemType PHOTO;
    public static final LikableItemType PHOTO_COMMENT;
    public static final LikableItemType POST;
    public static final LikableItemType SITEPAGE;
    public static final LikableItemType TEXTPOST;
    public static final LikableItemType TOPIC_COMMENT;
    public static final LikableItemType VIDEO;
    public static final LikableItemType VIDEO_COMMENT;

    static {
        LikableItemType likableItemType = new LikableItemType("POST", 0);
        POST = likableItemType;
        LikableItemType likableItemType2 = new LikableItemType("COMMENT", 1);
        COMMENT = likableItemType2;
        LikableItemType likableItemType3 = new LikableItemType("PHOTO", 2);
        PHOTO = likableItemType3;
        LikableItemType likableItemType4 = new LikableItemType(SignalingProtocol.MEDIA_OPTION_AUDIO, 3);
        AUDIO = likableItemType4;
        LikableItemType likableItemType5 = new LikableItemType(SignalingProtocol.MEDIA_OPTION_VIDEO, 4);
        VIDEO = likableItemType5;
        LikableItemType likableItemType6 = new LikableItemType("NOTE", 5);
        NOTE = likableItemType6;
        LikableItemType likableItemType7 = new LikableItemType("MARKET", 6);
        MARKET = likableItemType7;
        LikableItemType likableItemType8 = new LikableItemType("PHOTO_COMMENT", 7);
        PHOTO_COMMENT = likableItemType8;
        LikableItemType likableItemType9 = new LikableItemType("VIDEO_COMMENT", 8);
        VIDEO_COMMENT = likableItemType9;
        LikableItemType likableItemType10 = new LikableItemType("TOPIC_COMMENT", 9);
        TOPIC_COMMENT = likableItemType10;
        LikableItemType likableItemType11 = new LikableItemType("MARKET_COMMENT", 10);
        MARKET_COMMENT = likableItemType11;
        LikableItemType likableItemType12 = new LikableItemType("SITEPAGE", 11);
        SITEPAGE = likableItemType12;
        LikableItemType likableItemType13 = new LikableItemType("TEXTPOST", 12);
        TEXTPOST = likableItemType13;
        LikableItemType[] likableItemTypeArr = {likableItemType, likableItemType2, likableItemType3, likableItemType4, likableItemType5, likableItemType6, likableItemType7, likableItemType8, likableItemType9, likableItemType10, likableItemType11, likableItemType12, likableItemType13};
        $VALUES = likableItemTypeArr;
        $ENTRIES = new asp(likableItemTypeArr);
    }

    public LikableItemType() {
        throw null;
    }

    public static LikableItemType valueOf(String str) {
        return (LikableItemType) Enum.valueOf(LikableItemType.class, str);
    }

    public static LikableItemType[] values() {
        return (LikableItemType[]) $VALUES.clone();
    }
}
