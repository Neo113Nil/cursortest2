package com.vk.stat.scheme;

import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeSubscriptionSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonCommunitiesStat$TypeSubscriptionSource[] $VALUES;

    @pmi0("about_video_channel")
    public static final CommonCommunitiesStat$TypeSubscriptionSource ABOUT_VIDEO_CHANNEL;

    @pmi0("comments_placeholder")
    public static final CommonCommunitiesStat$TypeSubscriptionSource COMMENTS_PLACEHOLDER;

    @pmi0("direct_link")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DIRECT_LINK;

    @pmi0("donut_banner")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_BANNER;

    @pmi0("donut_content_paywall")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_CONTENT_PAYWALL;

    @pmi0("donut_content_repost")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_CONTENT_REPOST;

    @pmi0("donut_goal")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_GOAL;

    @pmi0("donut_goal_list")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_GOAL_LIST;

    @pmi0("donut_goal_subscriptions")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_GOAL_SUBSCRIPTIONS;

    @pmi0("donut_post_channel")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_POST_CHANNEL;

    @pmi0("donut_post_goal")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_POST_GOAL;

    @pmi0("donut_post_goal_level")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_POST_GOAL_LEVEL;

    @pmi0("donut_post_level")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_POST_LEVEL;

    @pmi0("donut_video_blur")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_VIDEO_BLUR;

    @pmi0("donut_video_description")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_VIDEO_DESCRIPTION;

    @pmi0("donut_video_paywall")
    public static final CommonCommunitiesStat$TypeSubscriptionSource DONUT_VIDEO_PAYWALL;

    @pmi0("post_donut_goal")
    public static final CommonCommunitiesStat$TypeSubscriptionSource POST_DONUT_GOAL;

    @pmi0("post_level_list_placeholder")
    public static final CommonCommunitiesStat$TypeSubscriptionSource POST_LEVEL_LIST_PLACEHOLDER;

    @pmi0("post_level_placeholder")
    public static final CommonCommunitiesStat$TypeSubscriptionSource POST_LEVEL_PLACEHOLDER;

    @pmi0("short_video")
    public static final CommonCommunitiesStat$TypeSubscriptionSource SHORT_VIDEO;

    @pmi0("unsubscribe_popup")
    public static final CommonCommunitiesStat$TypeSubscriptionSource UNSUBSCRIBE_POPUP;

    @pmi0("video")
    public static final CommonCommunitiesStat$TypeSubscriptionSource VIDEO;

    @pmi0("video_channel")
    public static final CommonCommunitiesStat$TypeSubscriptionSource VIDEO_CHANNEL;

    static {
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_BANNER", 0);
        DONUT_BANNER = commonCommunitiesStat$TypeSubscriptionSource;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource2 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_GOAL", 1);
        DONUT_GOAL = commonCommunitiesStat$TypeSubscriptionSource2;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource3 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_GOAL_LIST", 2);
        DONUT_GOAL_LIST = commonCommunitiesStat$TypeSubscriptionSource3;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource4 = new CommonCommunitiesStat$TypeSubscriptionSource("COMMENTS_PLACEHOLDER", 3);
        COMMENTS_PLACEHOLDER = commonCommunitiesStat$TypeSubscriptionSource4;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource5 = new CommonCommunitiesStat$TypeSubscriptionSource("POST_LEVEL_PLACEHOLDER", 4);
        POST_LEVEL_PLACEHOLDER = commonCommunitiesStat$TypeSubscriptionSource5;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource6 = new CommonCommunitiesStat$TypeSubscriptionSource("POST_LEVEL_LIST_PLACEHOLDER", 5);
        POST_LEVEL_LIST_PLACEHOLDER = commonCommunitiesStat$TypeSubscriptionSource6;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource7 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_GOAL_SUBSCRIPTIONS", 6);
        DONUT_GOAL_SUBSCRIPTIONS = commonCommunitiesStat$TypeSubscriptionSource7;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource8 = new CommonCommunitiesStat$TypeSubscriptionSource(Privacy.DIRECT_LINK, 7);
        DIRECT_LINK = commonCommunitiesStat$TypeSubscriptionSource8;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource9 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_CONTENT_PAYWALL", 8);
        DONUT_CONTENT_PAYWALL = commonCommunitiesStat$TypeSubscriptionSource9;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource10 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_CONTENT_REPOST", 9);
        DONUT_CONTENT_REPOST = commonCommunitiesStat$TypeSubscriptionSource10;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource11 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_VIDEO_BLUR", 10);
        DONUT_VIDEO_BLUR = commonCommunitiesStat$TypeSubscriptionSource11;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource12 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_POST_CHANNEL", 11);
        DONUT_POST_CHANNEL = commonCommunitiesStat$TypeSubscriptionSource12;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource13 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_POST_GOAL", 12);
        DONUT_POST_GOAL = commonCommunitiesStat$TypeSubscriptionSource13;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource14 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_POST_LEVEL", 13);
        DONUT_POST_LEVEL = commonCommunitiesStat$TypeSubscriptionSource14;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource15 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_POST_GOAL_LEVEL", 14);
        DONUT_POST_GOAL_LEVEL = commonCommunitiesStat$TypeSubscriptionSource15;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource16 = new CommonCommunitiesStat$TypeSubscriptionSource("POST_DONUT_GOAL", 15);
        POST_DONUT_GOAL = commonCommunitiesStat$TypeSubscriptionSource16;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource17 = new CommonCommunitiesStat$TypeSubscriptionSource("VIDEO_CHANNEL", 16);
        VIDEO_CHANNEL = commonCommunitiesStat$TypeSubscriptionSource17;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource18 = new CommonCommunitiesStat$TypeSubscriptionSource("ABOUT_VIDEO_CHANNEL", 17);
        ABOUT_VIDEO_CHANNEL = commonCommunitiesStat$TypeSubscriptionSource18;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource19 = new CommonCommunitiesStat$TypeSubscriptionSource(SignalingProtocol.MEDIA_OPTION_VIDEO, 18);
        VIDEO = commonCommunitiesStat$TypeSubscriptionSource19;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource20 = new CommonCommunitiesStat$TypeSubscriptionSource("UNSUBSCRIBE_POPUP", 19);
        UNSUBSCRIBE_POPUP = commonCommunitiesStat$TypeSubscriptionSource20;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource21 = new CommonCommunitiesStat$TypeSubscriptionSource("SHORT_VIDEO", 20);
        SHORT_VIDEO = commonCommunitiesStat$TypeSubscriptionSource21;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource22 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_VIDEO_PAYWALL", 21);
        DONUT_VIDEO_PAYWALL = commonCommunitiesStat$TypeSubscriptionSource22;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource23 = new CommonCommunitiesStat$TypeSubscriptionSource("DONUT_VIDEO_DESCRIPTION", 22);
        DONUT_VIDEO_DESCRIPTION = commonCommunitiesStat$TypeSubscriptionSource23;
        CommonCommunitiesStat$TypeSubscriptionSource[] commonCommunitiesStat$TypeSubscriptionSourceArr = {commonCommunitiesStat$TypeSubscriptionSource, commonCommunitiesStat$TypeSubscriptionSource2, commonCommunitiesStat$TypeSubscriptionSource3, commonCommunitiesStat$TypeSubscriptionSource4, commonCommunitiesStat$TypeSubscriptionSource5, commonCommunitiesStat$TypeSubscriptionSource6, commonCommunitiesStat$TypeSubscriptionSource7, commonCommunitiesStat$TypeSubscriptionSource8, commonCommunitiesStat$TypeSubscriptionSource9, commonCommunitiesStat$TypeSubscriptionSource10, commonCommunitiesStat$TypeSubscriptionSource11, commonCommunitiesStat$TypeSubscriptionSource12, commonCommunitiesStat$TypeSubscriptionSource13, commonCommunitiesStat$TypeSubscriptionSource14, commonCommunitiesStat$TypeSubscriptionSource15, commonCommunitiesStat$TypeSubscriptionSource16, commonCommunitiesStat$TypeSubscriptionSource17, commonCommunitiesStat$TypeSubscriptionSource18, commonCommunitiesStat$TypeSubscriptionSource19, commonCommunitiesStat$TypeSubscriptionSource20, commonCommunitiesStat$TypeSubscriptionSource21, commonCommunitiesStat$TypeSubscriptionSource22, commonCommunitiesStat$TypeSubscriptionSource23};
        $VALUES = commonCommunitiesStat$TypeSubscriptionSourceArr;
        $ENTRIES = new asp(commonCommunitiesStat$TypeSubscriptionSourceArr);
    }

    private CommonCommunitiesStat$TypeSubscriptionSource(String str, int i) {
    }

    public static CommonCommunitiesStat$TypeSubscriptionSource valueOf(String str) {
        return (CommonCommunitiesStat$TypeSubscriptionSource) Enum.valueOf(CommonCommunitiesStat$TypeSubscriptionSource.class, str);
    }

    public static CommonCommunitiesStat$TypeSubscriptionSource[] values() {
        return (CommonCommunitiesStat$TypeSubscriptionSource[]) $VALUES.clone();
    }
}
