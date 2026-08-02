package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$AttachmentInfo {

    @pmi0("attachment_item_id")
    private final long attachmentItemId;

    @pmi0("attachment_owner_id")
    private final long attachmentOwnerId;

    @pmi0("attachment_type")
    private final AttachmentType attachmentType;

    @pmi0("attachments_string_value")
    private final String attachmentsStringValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class AttachmentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AttachmentType[] $VALUES;

        @pmi0("action_button")
        public static final AttachmentType ACTION_BUTTON;

        @pmi0("album")
        public static final AttachmentType ALBUM;

        @pmi0("article")
        public static final AttachmentType ARTICLE;

        @pmi0("artist")
        public static final AttachmentType ARTIST;

        @pmi0("audio")
        public static final AttachmentType AUDIO;

        @pmi0("audio_playlist")
        public static final AttachmentType AUDIO_PLAYLIST;

        @pmi0("curator")
        public static final AttachmentType CURATOR;

        @pmi0("doc")
        public static final AttachmentType DOC;

        @pmi0("donut_link")
        public static final AttachmentType DONUT_LINK;

        @pmi0("geo")
        public static final AttachmentType GEO;

        @pmi0("geo_place")
        public static final AttachmentType GEO_PLACE;

        @pmi0("goods")
        public static final AttachmentType GOODS;

        @pmi0("graffiti")
        public static final AttachmentType GRAFFITI;

        @pmi0("group")
        public static final AttachmentType GROUP;

        @pmi0("link")
        public static final AttachmentType LINK;

        @pmi0("market")
        public static final AttachmentType MARKET;

        @pmi0("market_album")
        public static final AttachmentType MARKET_ALBUM;

        @pmi0("market_link")
        public static final AttachmentType MARKET_LINK;

        @pmi0("mask")
        public static final AttachmentType MASK;

        @pmi0("message_to_bc")
        public static final AttachmentType MESSAGE_TO_BC;

        @pmi0("narrative")
        public static final AttachmentType NARRATIVE;

        @pmi0("note")
        public static final AttachmentType NOTE;

        @pmi0("online_booking")
        public static final AttachmentType ONLINE_BOOKING;

        @pmi0("page")
        public static final AttachmentType PAGE;

        @pmi0("photo")
        public static final AttachmentType PHOTO;

        @pmi0("photos_list")
        public static final AttachmentType PHOTOS_LIST;

        @pmi0("podcast")
        public static final AttachmentType PODCAST;

        @pmi0("poll")
        public static final AttachmentType POLL;

        @pmi0("posted_photo")
        public static final AttachmentType POSTED_PHOTO;

        @pmi0("pretty_cards")
        public static final AttachmentType PRETTY_CARDS;

        @pmi0("situational_theme")
        public static final AttachmentType SITUATIONAL_THEME;

        @pmi0("stereo_room")
        public static final AttachmentType STEREO_ROOM;

        @pmi0("textlive")
        public static final AttachmentType TEXTLIVE;

        @pmi0("textpost")
        public static final AttachmentType TEXTPOST;

        @pmi0("textpost_publish")
        public static final AttachmentType TEXTPOST_PUBLISH;

        @pmi0("video")
        public static final AttachmentType VIDEO;

        @pmi0("video_playlist")
        public static final AttachmentType VIDEO_PLAYLIST;

        static {
            AttachmentType attachmentType = new AttachmentType("GEO_PLACE", 0);
            GEO_PLACE = attachmentType;
            AttachmentType attachmentType2 = new AttachmentType("PHOTOS_LIST", 1);
            PHOTOS_LIST = attachmentType2;
            AttachmentType attachmentType3 = new AttachmentType("GROUP", 2);
            GROUP = attachmentType3;
            AttachmentType attachmentType4 = new AttachmentType("POSTED_PHOTO", 3);
            POSTED_PHOTO = attachmentType4;
            AttachmentType attachmentType5 = new AttachmentType("GOODS", 4);
            GOODS = attachmentType5;
            AttachmentType attachmentType6 = new AttachmentType("MASK", 5);
            MASK = attachmentType6;
            AttachmentType attachmentType7 = new AttachmentType("VIDEO_PLAYLIST", 6);
            VIDEO_PLAYLIST = attachmentType7;
            AttachmentType attachmentType8 = new AttachmentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 7);
            VIDEO = attachmentType8;
            AttachmentType attachmentType9 = new AttachmentType("TEXTPOST_PUBLISH", 8);
            TEXTPOST_PUBLISH = attachmentType9;
            AttachmentType attachmentType10 = new AttachmentType("TEXTPOST", 9);
            TEXTPOST = attachmentType10;
            AttachmentType attachmentType11 = new AttachmentType("TEXTLIVE", 10);
            TEXTLIVE = attachmentType11;
            AttachmentType attachmentType12 = new AttachmentType("SITUATIONAL_THEME", 11);
            SITUATIONAL_THEME = attachmentType12;
            AttachmentType attachmentType13 = new AttachmentType("PRETTY_CARDS", 12);
            PRETTY_CARDS = attachmentType13;
            AttachmentType attachmentType14 = new AttachmentType("POLL", 13);
            POLL = attachmentType14;
            AttachmentType attachmentType15 = new AttachmentType("PODCAST", 14);
            PODCAST = attachmentType15;
            AttachmentType attachmentType16 = new AttachmentType("PHOTO", 15);
            PHOTO = attachmentType16;
            AttachmentType attachmentType17 = new AttachmentType("PAGE", 16);
            PAGE = attachmentType17;
            AttachmentType attachmentType18 = new AttachmentType("NOTE", 17);
            NOTE = attachmentType18;
            AttachmentType attachmentType19 = new AttachmentType("NARRATIVE", 18);
            NARRATIVE = attachmentType19;
            AttachmentType attachmentType20 = new AttachmentType("MARKET_ALBUM", 19);
            MARKET_ALBUM = attachmentType20;
            AttachmentType attachmentType21 = new AttachmentType("MARKET", 20);
            MARKET = attachmentType21;
            AttachmentType attachmentType22 = new AttachmentType("LINK", 21);
            LINK = attachmentType22;
            AttachmentType attachmentType23 = new AttachmentType("GRAFFITI", 22);
            GRAFFITI = attachmentType23;
            AttachmentType attachmentType24 = new AttachmentType("GEO", 23);
            GEO = attachmentType24;
            AttachmentType attachmentType25 = new AttachmentType("DONUT_LINK", 24);
            DONUT_LINK = attachmentType25;
            AttachmentType attachmentType26 = new AttachmentType("DOC", 25);
            DOC = attachmentType26;
            AttachmentType attachmentType27 = new AttachmentType("CURATOR", 26);
            CURATOR = attachmentType27;
            AttachmentType attachmentType28 = new AttachmentType("AUDIO_PLAYLIST", 27);
            AUDIO_PLAYLIST = attachmentType28;
            AttachmentType attachmentType29 = new AttachmentType(SignalingProtocol.MEDIA_OPTION_AUDIO, 28);
            AUDIO = attachmentType29;
            AttachmentType attachmentType30 = new AttachmentType("ARTIST", 29);
            ARTIST = attachmentType30;
            AttachmentType attachmentType31 = new AttachmentType("ARTICLE", 30);
            ARTICLE = attachmentType31;
            AttachmentType attachmentType32 = new AttachmentType("ALBUM", 31);
            ALBUM = attachmentType32;
            AttachmentType attachmentType33 = new AttachmentType("STEREO_ROOM", 32);
            STEREO_ROOM = attachmentType33;
            AttachmentType attachmentType34 = new AttachmentType("ONLINE_BOOKING", 33);
            ONLINE_BOOKING = attachmentType34;
            AttachmentType attachmentType35 = new AttachmentType("MARKET_LINK", 34);
            MARKET_LINK = attachmentType35;
            AttachmentType attachmentType36 = new AttachmentType("MESSAGE_TO_BC", 35);
            MESSAGE_TO_BC = attachmentType36;
            AttachmentType attachmentType37 = new AttachmentType("ACTION_BUTTON", 36);
            ACTION_BUTTON = attachmentType37;
            AttachmentType[] attachmentTypeArr = {attachmentType, attachmentType2, attachmentType3, attachmentType4, attachmentType5, attachmentType6, attachmentType7, attachmentType8, attachmentType9, attachmentType10, attachmentType11, attachmentType12, attachmentType13, attachmentType14, attachmentType15, attachmentType16, attachmentType17, attachmentType18, attachmentType19, attachmentType20, attachmentType21, attachmentType22, attachmentType23, attachmentType24, attachmentType25, attachmentType26, attachmentType27, attachmentType28, attachmentType29, attachmentType30, attachmentType31, attachmentType32, attachmentType33, attachmentType34, attachmentType35, attachmentType36, attachmentType37};
            $VALUES = attachmentTypeArr;
            $ENTRIES = new asp(attachmentTypeArr);
        }

        private AttachmentType(String str, int i) {
        }

        public static AttachmentType valueOf(String str) {
            return (AttachmentType) Enum.valueOf(AttachmentType.class, str);
        }

        public static AttachmentType[] values() {
            return (AttachmentType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$AttachmentInfo(AttachmentType attachmentType, long j, long j2, String str) {
        this.attachmentType = attachmentType;
        this.attachmentOwnerId = j;
        this.attachmentItemId = j2;
        this.attachmentsStringValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$AttachmentInfo)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo = (MobileOfficialAppsConPostingStat$AttachmentInfo) obj;
        return this.attachmentType == mobileOfficialAppsConPostingStat$AttachmentInfo.attachmentType && this.attachmentOwnerId == mobileOfficialAppsConPostingStat$AttachmentInfo.attachmentOwnerId && this.attachmentItemId == mobileOfficialAppsConPostingStat$AttachmentInfo.attachmentItemId && epx.f(this.attachmentsStringValue, mobileOfficialAppsConPostingStat$AttachmentInfo.attachmentsStringValue);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(this.attachmentType.hashCode() * 31, 31, this.attachmentOwnerId), 31, this.attachmentItemId);
        String str = this.attachmentsStringValue;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentInfo(attachmentType=");
        sb.append(this.attachmentType);
        sb.append(", attachmentOwnerId=");
        sb.append(this.attachmentOwnerId);
        sb.append(", attachmentItemId=");
        sb.append(this.attachmentItemId);
        sb.append(", attachmentsStringValue=");
        return ho8.a(sb, this.attachmentsStringValue, ')');
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$AttachmentInfo(AttachmentType attachmentType, long j, long j2, String str, int i, zcl zclVar) {
        this(attachmentType, j, j2, (i & 8) != 0 ? null : str);
    }
}
