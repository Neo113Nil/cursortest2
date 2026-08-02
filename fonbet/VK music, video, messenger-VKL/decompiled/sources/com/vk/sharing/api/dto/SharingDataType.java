package com.vk.sharing.api.dto;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingDataType.kt */
/* loaded from: classes5.dex */
public final class SharingDataType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SharingDataType[] $VALUES;
    public static final SharingDataType ALBUM;
    public static final SharingDataType ARTICLE;
    public static final SharingDataType ARTIST;
    public static final SharingDataType AUDIO;
    public static final SharingDataType CHAT_LINK;
    public static final SharingDataType CLIP;
    public static final SharingDataType COMMENT;
    public static final a Companion;
    public static final SharingDataType DOCUMENT;
    public static final SharingDataType GOOD;
    public static final SharingDataType LINK;
    public static final SharingDataType MINI_APP;
    public static final SharingDataType NARRATIVE;
    public static final SharingDataType OTHER;
    public static final SharingDataType PHOTO;
    public static final SharingDataType PLAYLIST;
    public static final SharingDataType POLL;
    public static final SharingDataType POST;
    public static final SharingDataType VIDEO;

    /* compiled from: SharingDataType.kt */
    public static final class a {
    }

    static {
        SharingDataType sharingDataType = new SharingDataType("PHOTO", 0);
        PHOTO = sharingDataType;
        SharingDataType sharingDataType2 = new SharingDataType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = sharingDataType2;
        SharingDataType sharingDataType3 = new SharingDataType("CLIP", 2);
        CLIP = sharingDataType3;
        SharingDataType sharingDataType4 = new SharingDataType("COMMENT", 3);
        COMMENT = sharingDataType4;
        SharingDataType sharingDataType5 = new SharingDataType("ALBUM", 4);
        ALBUM = sharingDataType5;
        SharingDataType sharingDataType6 = new SharingDataType("POLL", 5);
        POLL = sharingDataType6;
        SharingDataType sharingDataType7 = new SharingDataType(SignalingProtocol.MEDIA_OPTION_AUDIO, 6);
        AUDIO = sharingDataType7;
        SharingDataType sharingDataType8 = new SharingDataType("PLAYLIST", 7);
        PLAYLIST = sharingDataType8;
        SharingDataType sharingDataType9 = new SharingDataType("ARTIST", 8);
        ARTIST = sharingDataType9;
        SharingDataType sharingDataType10 = new SharingDataType("LINK", 9);
        LINK = sharingDataType10;
        SharingDataType sharingDataType11 = new SharingDataType("ARTICLE", 10);
        ARTICLE = sharingDataType11;
        SharingDataType sharingDataType12 = new SharingDataType("DOCUMENT", 11);
        DOCUMENT = sharingDataType12;
        SharingDataType sharingDataType13 = new SharingDataType("GOOD", 12);
        GOOD = sharingDataType13;
        SharingDataType sharingDataType14 = new SharingDataType("MINI_APP", 13);
        MINI_APP = sharingDataType14;
        SharingDataType sharingDataType15 = new SharingDataType("CHAT_LINK", 14);
        CHAT_LINK = sharingDataType15;
        SharingDataType sharingDataType16 = new SharingDataType("NARRATIVE", 15);
        NARRATIVE = sharingDataType16;
        SharingDataType sharingDataType17 = new SharingDataType("POST", 16);
        POST = sharingDataType17;
        SharingDataType sharingDataType18 = new SharingDataType(NativeAdContent.ViewTag.OTHER, 17);
        OTHER = sharingDataType18;
        SharingDataType[] sharingDataTypeArr = {sharingDataType, sharingDataType2, sharingDataType3, sharingDataType4, sharingDataType5, sharingDataType6, sharingDataType7, sharingDataType8, sharingDataType9, sharingDataType10, sharingDataType11, sharingDataType12, sharingDataType13, sharingDataType14, sharingDataType15, sharingDataType16, sharingDataType17, sharingDataType18};
        $VALUES = sharingDataTypeArr;
        $ENTRIES = new asp(sharingDataTypeArr);
        Companion = new a();
    }

    public SharingDataType() {
        throw null;
    }

    public static zrp<SharingDataType> h() {
        return $ENTRIES;
    }

    public static SharingDataType valueOf(String str) {
        return (SharingDataType) Enum.valueOf(SharingDataType.class, str);
    }

    public static SharingDataType[] values() {
        return (SharingDataType[]) $VALUES.clone();
    }
}
