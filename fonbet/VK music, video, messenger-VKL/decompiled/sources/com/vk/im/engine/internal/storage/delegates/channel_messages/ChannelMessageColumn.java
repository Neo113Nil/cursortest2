package com.vk.im.engine.internal.storage.delegates.channel_messages;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import xsna.asp;
import xsna.qgl0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelMessageColumn.kt */
/* loaded from: classes2.dex */
public final class ChannelMessageColumn implements qgl0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelMessageColumn[] $VALUES;
    public static final ChannelMessageColumn ACCESS_KEY;
    public static final ChannelMessageColumn ATTACH;
    public static final ChannelMessageColumn AUTHOR_AD_INFO_URL;
    public static final ChannelMessageColumn AUTHOR_AD_MARKER;
    public static final ChannelMessageColumn BODY_FORMAT;
    public static final ChannelMessageColumn CHANNEL_ID;
    public static final ChannelMessageColumn CNV_MSG_ID;
    public static final ChannelMessageColumn COMMENTS_CAN_CLOSE;
    public static final ChannelMessageColumn COMMENTS_CAN_OPEN;
    public static final ChannelMessageColumn COMMENTS_CAN_POST;
    public static final ChannelMessageColumn COMMENTS_CAN_VIEW;
    public static final ChannelMessageColumn COMMENTS_COUNT;
    public static final a Companion;
    public static final ChannelMessageColumn DELETED_DETAILS;
    public static final ChannelMessageColumn DELETED_REASON;
    public static final ChannelMessageColumn DONUT;
    public static final ChannelMessageColumn EXTERNAL_VIEW_TRACKING;
    public static final ChannelMessageColumn FROM_ID;
    public static final ChannelMessageColumn FROM_MEMBER_ID;
    public static final ChannelMessageColumn FROM_MEMBER_TYPE;
    public static final ChannelMessageColumn GUID;
    public static final ChannelMessageColumn HAS_SPACE_AFTER;
    public static final ChannelMessageColumn HAS_SPACE_BEFORE;
    public static final ChannelMessageColumn IS_ADVERTISEMENT;
    public static final ChannelMessageColumn IS_DONUT_PHOTOS;
    public static final ChannelMessageColumn IS_FAKE_NEWS;
    public static final ChannelMessageColumn IS_MSG_PINNED;
    public static final ChannelMessageColumn IS_MUTE_NOTIFICATION;
    public static final ChannelMessageColumn IS_VERIFIED;
    public static final ChannelMessageColumn IS_VIEWED;
    public static final ChannelMessageColumn ITEM_REACTIONS;
    public static final ChannelMessageColumn LOCAL_ID;
    public static final ChannelMessageColumn LOCAL_REACTION;
    public static final ChannelMessageColumn OWNER_ID;
    public static final ChannelMessageColumn PAID_REACTION;
    public static final ChannelMessageColumn PARENT_ID;
    public static final ChannelMessageColumn PHASE_ID;
    public static final ChannelMessageColumn POST_ID;
    public static final ChannelMessageColumn POST_TEXT;
    public static final ChannelMessageColumn POST_TYPE;
    public static final ChannelMessageColumn PUBLISH_DATE;
    public static final ChannelMessageColumn REPOSTS_COUNT;
    public static final ChannelMessageColumn SIGNER_ID;
    public static final ChannelMessageColumn SOURCE;
    public static final ChannelMessageColumn SOURCE_ID;
    public static final ChannelMessageColumn SOURCE_TYPE;
    public static final ChannelMessageColumn SYNC_CONFIG;
    public static final ChannelMessageColumn SYNC_STATE;
    public static final ChannelMessageColumn TEXT_LIVE_TITLE;
    public static final ChannelMessageColumn TEXT_LIVE_URL;
    public static final ChannelMessageColumn TIME;
    public static final ChannelMessageColumn TRACK_CODE;
    public static final ChannelMessageColumn TYPE;
    public static final ChannelMessageColumn UPDATE_TIME;
    public static final ChannelMessageColumn VIEWS_COUNT;
    public static final ChannelMessageColumn WEIGHT;
    public static final ChannelMessageColumn WEIGHT_AFTER;
    public static final ChannelMessageColumn WEIGHT_BEFORE;
    private static final ChannelMessageColumn[] allColumns;
    private final String key;

    /* compiled from: ChannelMessageColumn.kt */
    public static final class a {
    }

    static {
        ChannelMessageColumn channelMessageColumn = new ChannelMessageColumn("LOCAL_ID", 0, "local_id");
        LOCAL_ID = channelMessageColumn;
        ChannelMessageColumn channelMessageColumn2 = new ChannelMessageColumn("CHANNEL_ID", 1, "channel_id");
        CHANNEL_ID = channelMessageColumn2;
        ChannelMessageColumn channelMessageColumn3 = new ChannelMessageColumn("CNV_MSG_ID", 2, "cnv_msg_id");
        CNV_MSG_ID = channelMessageColumn3;
        ChannelMessageColumn channelMessageColumn4 = new ChannelMessageColumn("TIME", 3, "time");
        TIME = channelMessageColumn4;
        ChannelMessageColumn channelMessageColumn5 = new ChannelMessageColumn("WEIGHT", 4, "weight");
        WEIGHT = channelMessageColumn5;
        ChannelMessageColumn channelMessageColumn6 = new ChannelMessageColumn("FROM_MEMBER_TYPE", 5, "from_member_type");
        FROM_MEMBER_TYPE = channelMessageColumn6;
        ChannelMessageColumn channelMessageColumn7 = new ChannelMessageColumn("FROM_MEMBER_ID", 6, "from_member_id");
        FROM_MEMBER_ID = channelMessageColumn7;
        ChannelMessageColumn channelMessageColumn8 = new ChannelMessageColumn("UPDATE_TIME", 7, "update_time");
        UPDATE_TIME = channelMessageColumn8;
        ChannelMessageColumn channelMessageColumn9 = new ChannelMessageColumn("HAS_SPACE_BEFORE", 8, "has_space_before");
        HAS_SPACE_BEFORE = channelMessageColumn9;
        ChannelMessageColumn channelMessageColumn10 = new ChannelMessageColumn("HAS_SPACE_AFTER", 9, "has_space_after");
        HAS_SPACE_AFTER = channelMessageColumn10;
        ChannelMessageColumn channelMessageColumn11 = new ChannelMessageColumn("WEIGHT_BEFORE", 10, "weight_before");
        WEIGHT_BEFORE = channelMessageColumn11;
        ChannelMessageColumn channelMessageColumn12 = new ChannelMessageColumn("WEIGHT_AFTER", 11, "weight_after");
        WEIGHT_AFTER = channelMessageColumn12;
        ChannelMessageColumn channelMessageColumn13 = new ChannelMessageColumn(CredentialProviderBaseController.TYPE_TAG, 12, "type");
        TYPE = channelMessageColumn13;
        ChannelMessageColumn channelMessageColumn14 = new ChannelMessageColumn("ATTACH", 13, "attach");
        ATTACH = channelMessageColumn14;
        ChannelMessageColumn channelMessageColumn15 = new ChannelMessageColumn("PHASE_ID", 14, "phase_id");
        PHASE_ID = channelMessageColumn15;
        ChannelMessageColumn channelMessageColumn16 = new ChannelMessageColumn("LOCAL_REACTION", 15, "local_reaction");
        LOCAL_REACTION = channelMessageColumn16;
        ChannelMessageColumn channelMessageColumn17 = new ChannelMessageColumn("SOURCE", 16, "source");
        SOURCE = channelMessageColumn17;
        ChannelMessageColumn channelMessageColumn18 = new ChannelMessageColumn("POST_TEXT", 17, "post_text");
        POST_TEXT = channelMessageColumn18;
        ChannelMessageColumn channelMessageColumn19 = new ChannelMessageColumn("ACCESS_KEY", 18, "access_key");
        ACCESS_KEY = channelMessageColumn19;
        ChannelMessageColumn channelMessageColumn20 = new ChannelMessageColumn("OWNER_ID", 19, "owner_id");
        OWNER_ID = channelMessageColumn20;
        ChannelMessageColumn channelMessageColumn21 = new ChannelMessageColumn("POST_ID", 20, "post_id");
        POST_ID = channelMessageColumn21;
        ChannelMessageColumn channelMessageColumn22 = new ChannelMessageColumn("FROM_ID", 21, "from_id");
        FROM_ID = channelMessageColumn22;
        ChannelMessageColumn channelMessageColumn23 = new ChannelMessageColumn("POST_TYPE", 22, "post_type");
        POST_TYPE = channelMessageColumn23;
        ChannelMessageColumn channelMessageColumn24 = new ChannelMessageColumn("DONUT", 23, "donut");
        DONUT = channelMessageColumn24;
        ChannelMessageColumn channelMessageColumn25 = new ChannelMessageColumn("AUTHOR_AD_INFO_URL", 24, "author_ad_info_url");
        AUTHOR_AD_INFO_URL = channelMessageColumn25;
        ChannelMessageColumn channelMessageColumn26 = new ChannelMessageColumn("AUTHOR_AD_MARKER", 25, "author_ad_marker");
        AUTHOR_AD_MARKER = channelMessageColumn26;
        ChannelMessageColumn channelMessageColumn27 = new ChannelMessageColumn("TRACK_CODE", 26, "track_code");
        TRACK_CODE = channelMessageColumn27;
        ChannelMessageColumn channelMessageColumn28 = new ChannelMessageColumn("DELETED_REASON", 27, "deleted_reason");
        DELETED_REASON = channelMessageColumn28;
        ChannelMessageColumn channelMessageColumn29 = new ChannelMessageColumn("DELETED_DETAILS", 28, "deleted_details");
        DELETED_DETAILS = channelMessageColumn29;
        ChannelMessageColumn channelMessageColumn30 = new ChannelMessageColumn("COMMENTS_COUNT", 29, "comments_count");
        COMMENTS_COUNT = channelMessageColumn30;
        ChannelMessageColumn channelMessageColumn31 = new ChannelMessageColumn("COMMENTS_CAN_VIEW", 30, "comments_can_view");
        COMMENTS_CAN_VIEW = channelMessageColumn31;
        ChannelMessageColumn channelMessageColumn32 = new ChannelMessageColumn("COMMENTS_CAN_POST", 31, "comments_can_post");
        COMMENTS_CAN_POST = channelMessageColumn32;
        ChannelMessageColumn channelMessageColumn33 = new ChannelMessageColumn("COMMENTS_CAN_CLOSE", 32, "comments_can_close");
        COMMENTS_CAN_CLOSE = channelMessageColumn33;
        ChannelMessageColumn channelMessageColumn34 = new ChannelMessageColumn("COMMENTS_CAN_OPEN", 33, "comments_can_open");
        COMMENTS_CAN_OPEN = channelMessageColumn34;
        ChannelMessageColumn channelMessageColumn35 = new ChannelMessageColumn("SIGNER_ID", 34, "signer_id");
        SIGNER_ID = channelMessageColumn35;
        ChannelMessageColumn channelMessageColumn36 = new ChannelMessageColumn("IS_ADVERTISEMENT", 35, "is_advertisement");
        IS_ADVERTISEMENT = channelMessageColumn36;
        ChannelMessageColumn channelMessageColumn37 = new ChannelMessageColumn("ITEM_REACTIONS", 36, "item_reactions");
        ITEM_REACTIONS = channelMessageColumn37;
        ChannelMessageColumn channelMessageColumn38 = new ChannelMessageColumn("REPOSTS_COUNT", 37, "reposts_count");
        REPOSTS_COUNT = channelMessageColumn38;
        ChannelMessageColumn channelMessageColumn39 = new ChannelMessageColumn("VIEWS_COUNT", 38, "views_count");
        VIEWS_COUNT = channelMessageColumn39;
        ChannelMessageColumn channelMessageColumn40 = new ChannelMessageColumn("PUBLISH_DATE", 39, "publish_date");
        PUBLISH_DATE = channelMessageColumn40;
        ChannelMessageColumn channelMessageColumn41 = new ChannelMessageColumn("TEXT_LIVE_TITLE", 40, "text_live_title");
        TEXT_LIVE_TITLE = channelMessageColumn41;
        ChannelMessageColumn channelMessageColumn42 = new ChannelMessageColumn("TEXT_LIVE_URL", 41, "text_live_url");
        TEXT_LIVE_URL = channelMessageColumn42;
        ChannelMessageColumn channelMessageColumn43 = new ChannelMessageColumn("SOURCE_TYPE", 42, "source_type");
        SOURCE_TYPE = channelMessageColumn43;
        ChannelMessageColumn channelMessageColumn44 = new ChannelMessageColumn("SOURCE_ID", 43, "source_id");
        SOURCE_ID = channelMessageColumn44;
        ChannelMessageColumn channelMessageColumn45 = new ChannelMessageColumn("IS_VIEWED", 44, "is_viewed");
        IS_VIEWED = channelMessageColumn45;
        ChannelMessageColumn channelMessageColumn46 = new ChannelMessageColumn("IS_VERIFIED", 45, "is_verified");
        IS_VERIFIED = channelMessageColumn46;
        ChannelMessageColumn channelMessageColumn47 = new ChannelMessageColumn("PARENT_ID", 46, "parent_id");
        PARENT_ID = channelMessageColumn47;
        ChannelMessageColumn channelMessageColumn48 = new ChannelMessageColumn("IS_FAKE_NEWS", 47, "is_fake_news");
        IS_FAKE_NEWS = channelMessageColumn48;
        ChannelMessageColumn channelMessageColumn49 = new ChannelMessageColumn("EXTERNAL_VIEW_TRACKING", 48, "external_view_tracking");
        EXTERNAL_VIEW_TRACKING = channelMessageColumn49;
        ChannelMessageColumn channelMessageColumn50 = new ChannelMessageColumn("IS_MUTE_NOTIFICATION", 49, "is_mute_notification");
        IS_MUTE_NOTIFICATION = channelMessageColumn50;
        ChannelMessageColumn channelMessageColumn51 = new ChannelMessageColumn("IS_MSG_PINNED", 50, "is_msg_pinned");
        IS_MSG_PINNED = channelMessageColumn51;
        ChannelMessageColumn channelMessageColumn52 = new ChannelMessageColumn("BODY_FORMAT", 51, "body_format");
        BODY_FORMAT = channelMessageColumn52;
        ChannelMessageColumn channelMessageColumn53 = new ChannelMessageColumn("GUID", 52, "guid");
        GUID = channelMessageColumn53;
        ChannelMessageColumn channelMessageColumn54 = new ChannelMessageColumn("SYNC_STATE", 53, "sync_state");
        SYNC_STATE = channelMessageColumn54;
        ChannelMessageColumn channelMessageColumn55 = new ChannelMessageColumn("SYNC_CONFIG", 54, "sync_config");
        SYNC_CONFIG = channelMessageColumn55;
        ChannelMessageColumn channelMessageColumn56 = new ChannelMessageColumn("IS_DONUT_PHOTOS", 55, "is_donut_photos");
        IS_DONUT_PHOTOS = channelMessageColumn56;
        ChannelMessageColumn channelMessageColumn57 = new ChannelMessageColumn("PAID_REACTION", 56, "paid_reaction");
        PAID_REACTION = channelMessageColumn57;
        ChannelMessageColumn[] channelMessageColumnArr = {channelMessageColumn, channelMessageColumn2, channelMessageColumn3, channelMessageColumn4, channelMessageColumn5, channelMessageColumn6, channelMessageColumn7, channelMessageColumn8, channelMessageColumn9, channelMessageColumn10, channelMessageColumn11, channelMessageColumn12, channelMessageColumn13, channelMessageColumn14, channelMessageColumn15, channelMessageColumn16, channelMessageColumn17, channelMessageColumn18, channelMessageColumn19, channelMessageColumn20, channelMessageColumn21, channelMessageColumn22, channelMessageColumn23, channelMessageColumn24, channelMessageColumn25, channelMessageColumn26, channelMessageColumn27, channelMessageColumn28, channelMessageColumn29, channelMessageColumn30, channelMessageColumn31, channelMessageColumn32, channelMessageColumn33, channelMessageColumn34, channelMessageColumn35, channelMessageColumn36, channelMessageColumn37, channelMessageColumn38, channelMessageColumn39, channelMessageColumn40, channelMessageColumn41, channelMessageColumn42, channelMessageColumn43, channelMessageColumn44, channelMessageColumn45, channelMessageColumn46, channelMessageColumn47, channelMessageColumn48, channelMessageColumn49, channelMessageColumn50, channelMessageColumn51, channelMessageColumn52, channelMessageColumn53, channelMessageColumn54, channelMessageColumn55, channelMessageColumn56, channelMessageColumn57};
        $VALUES = channelMessageColumnArr;
        $ENTRIES = new asp(channelMessageColumnArr);
        Companion = new a();
        allColumns = values();
    }

    public ChannelMessageColumn(String str, int i, String str2) {
        this.key = str2;
    }

    public static ChannelMessageColumn valueOf(String str) {
        return (ChannelMessageColumn) Enum.valueOf(ChannelMessageColumn.class, str);
    }

    public static ChannelMessageColumn[] values() {
        return (ChannelMessageColumn[]) $VALUES.clone();
    }

    @Override // xsna.qgl0
    public final String getKey() {
        return this.key;
    }

    public final int i() {
        return ordinal() + 1;
    }
}
