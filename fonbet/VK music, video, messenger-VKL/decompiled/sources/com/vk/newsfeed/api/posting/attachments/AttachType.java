package com.vk.newsfeed.api.posting.attachments;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachType.kt */
/* loaded from: classes3.dex */
public final class AttachType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AttachType[] $VALUES;
    public static final AttachType ALBUM;
    public static final AttachType ARTICLE;
    public static final a Companion;
    public static final AttachType DOCUMENT;
    public static final AttachType GOOD;
    public static final AttachType MUSIC;
    public static final AttachType PHOTO;
    public static final AttachType PHOTO_VK;
    public static final AttachType PLACE;
    public static final AttachType POLL;
    public static final AttachType SERVICE;
    public static final AttachType TAKE_PHOTO;
    private static final AttachType[] VALUES;
    public static final AttachType VIDEO;
    private final int type;

    /* compiled from: AttachType.kt */
    public static final class a {
    }

    static {
        AttachType attachType = new AttachType("PHOTO", 0, 0);
        PHOTO = attachType;
        AttachType attachType2 = new AttachType("MUSIC", 1, 1);
        MUSIC = attachType2;
        AttachType attachType3 = new AttachType(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, 2);
        VIDEO = attachType3;
        AttachType attachType4 = new AttachType("DOCUMENT", 3, 3);
        DOCUMENT = attachType4;
        AttachType attachType5 = new AttachType("PLACE", 4, 4);
        PLACE = attachType5;
        AttachType attachType6 = new AttachType("POLL", 5, 6);
        POLL = attachType6;
        AttachType attachType7 = new AttachType("GOOD", 6, 7);
        GOOD = attachType7;
        AttachType attachType8 = new AttachType("SERVICE", 7, 8);
        SERVICE = attachType8;
        AttachType attachType9 = new AttachType("TAKE_PHOTO", 8, 9);
        TAKE_PHOTO = attachType9;
        AttachType attachType10 = new AttachType("PHOTO_VK", 9, 10);
        PHOTO_VK = attachType10;
        AttachType attachType11 = new AttachType("ARTICLE", 10, 11);
        ARTICLE = attachType11;
        AttachType attachType12 = new AttachType("ALBUM", 11, 12);
        ALBUM = attachType12;
        AttachType[] attachTypeArr = {attachType, attachType2, attachType3, attachType4, attachType5, attachType6, attachType7, attachType8, attachType9, attachType10, attachType11, attachType12};
        $VALUES = attachTypeArr;
        $ENTRIES = new asp(attachTypeArr);
        Companion = new a();
        VALUES = values();
    }

    public AttachType(String str, int i, int i2) {
        this.type = i2;
    }

    public static AttachType valueOf(String str) {
        return (AttachType) Enum.valueOf(AttachType.class, str);
    }

    public static AttachType[] values() {
        return (AttachType[]) $VALUES.clone();
    }

    public final int i() {
        return this.type;
    }
}
