package com.vk.notifications.core;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationIconType.kt */
/* loaded from: classes4.dex */
public final class NotificationIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationIconType[] $VALUES;
    public static final NotificationIconType Achievements;
    public static final NotificationIconType Ads;
    public static final NotificationIconType Birthday;
    public static final NotificationIconType Call;
    public static final NotificationIconType Cancel;
    public static final NotificationIconType Comment;
    public static final NotificationIconType CommentGray;
    public static final NotificationIconType Discussions;
    public static final NotificationIconType Donut;
    public static final NotificationIconType Event;
    public static final NotificationIconType Follow;
    public static final NotificationIconType FriendAccepted;
    public static final NotificationIconType FriendFound;
    public static final NotificationIconType FriendSuggest;
    public static final NotificationIconType Gift;
    public static final NotificationIconType Interesting;
    public static final NotificationIconType InviteApp;
    public static final NotificationIconType InviteGroup;
    public static final NotificationIconType InviteGroupAccepted;
    public static final NotificationIconType Like;
    public static final NotificationIconType LikeGray;
    public static final NotificationIconType Live;
    public static final NotificationIconType MarketOrderStatusCollecting;
    public static final NotificationIconType Mention;
    public static final NotificationIconType Message;
    public static final NotificationIconType MessageRequest;
    public static final NotificationIconType NewPost;
    public static final NotificationIconType PhotoTag;
    public static final NotificationIconType Podcast;
    public static final NotificationIconType PrivatePost;
    public static final NotificationIconType Reply;
    public static final NotificationIconType ReplyGray;
    public static final NotificationIconType Repost;
    public static final NotificationIconType RequestMoney;
    public static final NotificationIconType StoryQuestion;
    public static final NotificationIconType StoryQuestionAnswer;
    public static final NotificationIconType StoryReply;
    public static final NotificationIconType SuggestedPostPublished;
    public static final NotificationIconType TransferMoney;
    public static final NotificationIconType TransferMoneyCancelled;
    public static final NotificationIconType TransferVotes;
    public static final NotificationIconType Voting;
    public static final NotificationIconType Wall;
    public static final NotificationIconType WishlistBirthday;
    private final String iconName;

    static {
        NotificationIconType notificationIconType = new NotificationIconType("Achievements", 0, "achievements");
        Achievements = notificationIconType;
        NotificationIconType notificationIconType2 = new NotificationIconType("Ads", 1, b.JSON_KEY_ADS);
        Ads = notificationIconType2;
        NotificationIconType notificationIconType3 = new NotificationIconType("Birthday", 2, "birthday");
        Birthday = notificationIconType3;
        NotificationIconType notificationIconType4 = new NotificationIconType("Call", 3, NotificationCompat.CATEGORY_CALL);
        Call = notificationIconType4;
        NotificationIconType notificationIconType5 = new NotificationIconType("Cancel", 4, "cancel");
        Cancel = notificationIconType5;
        NotificationIconType notificationIconType6 = new NotificationIconType("Comment", 5, "comment");
        Comment = notificationIconType6;
        NotificationIconType notificationIconType7 = new NotificationIconType("CommentGray", 6, "comment_gray");
        CommentGray = notificationIconType7;
        NotificationIconType notificationIconType8 = new NotificationIconType("Discussions", 7, "discussions");
        Discussions = notificationIconType8;
        NotificationIconType notificationIconType9 = new NotificationIconType("Event", 8, NotificationCompat.CATEGORY_EVENT);
        Event = notificationIconType9;
        NotificationIconType notificationIconType10 = new NotificationIconType("Follow", 9, "follow");
        Follow = notificationIconType10;
        NotificationIconType notificationIconType11 = new NotificationIconType("FriendAccepted", 10, "friend_accepted");
        FriendAccepted = notificationIconType11;
        NotificationIconType notificationIconType12 = new NotificationIconType("FriendFound", 11, "friend_found");
        FriendFound = notificationIconType12;
        NotificationIconType notificationIconType13 = new NotificationIconType("FriendSuggest", 12, "friend_suggest");
        FriendSuggest = notificationIconType13;
        NotificationIconType notificationIconType14 = new NotificationIconType("Gift", 13, "gift");
        Gift = notificationIconType14;
        NotificationIconType notificationIconType15 = new NotificationIconType("Interesting", 14, "interesting");
        Interesting = notificationIconType15;
        NotificationIconType notificationIconType16 = new NotificationIconType("InviteApp", 15, "invite_app");
        InviteApp = notificationIconType16;
        NotificationIconType notificationIconType17 = new NotificationIconType("InviteGroup", 16, "invite_group");
        InviteGroup = notificationIconType17;
        NotificationIconType notificationIconType18 = new NotificationIconType("InviteGroupAccepted", 17, "invite_group_accepted");
        InviteGroupAccepted = notificationIconType18;
        NotificationIconType notificationIconType19 = new NotificationIconType("Like", 18, "like");
        Like = notificationIconType19;
        NotificationIconType notificationIconType20 = new NotificationIconType("LikeGray", 19, "like_gray");
        LikeGray = notificationIconType20;
        NotificationIconType notificationIconType21 = new NotificationIconType("Live", 20, "live");
        Live = notificationIconType21;
        NotificationIconType notificationIconType22 = new NotificationIconType("Mention", 21, "mention");
        Mention = notificationIconType22;
        NotificationIconType notificationIconType23 = new NotificationIconType("Message", 22, "message");
        Message = notificationIconType23;
        NotificationIconType notificationIconType24 = new NotificationIconType("MessageRequest", 23, "message_request");
        MessageRequest = notificationIconType24;
        NotificationIconType notificationIconType25 = new NotificationIconType("NewPost", 24, "new_post");
        NewPost = notificationIconType25;
        NotificationIconType notificationIconType26 = new NotificationIconType("PhotoTag", 25, "photo_tag");
        PhotoTag = notificationIconType26;
        NotificationIconType notificationIconType27 = new NotificationIconType("Podcast", 26, "podcast");
        Podcast = notificationIconType27;
        NotificationIconType notificationIconType28 = new NotificationIconType("PrivatePost", 27, "private_post");
        PrivatePost = notificationIconType28;
        NotificationIconType notificationIconType29 = new NotificationIconType("Reply", 28, "reply");
        Reply = notificationIconType29;
        NotificationIconType notificationIconType30 = new NotificationIconType("ReplyGray", 29, "reply_gray");
        ReplyGray = notificationIconType30;
        NotificationIconType notificationIconType31 = new NotificationIconType("Repost", 30, "repost");
        Repost = notificationIconType31;
        NotificationIconType notificationIconType32 = new NotificationIconType("RequestMoney", 31, "request_money");
        RequestMoney = notificationIconType32;
        NotificationIconType notificationIconType33 = new NotificationIconType("StoryReply", 32, "story_reply");
        StoryReply = notificationIconType33;
        NotificationIconType notificationIconType34 = new NotificationIconType("StoryQuestion", 33, "story_question");
        StoryQuestion = notificationIconType34;
        NotificationIconType notificationIconType35 = new NotificationIconType("StoryQuestionAnswer", 34, "story_question_answer");
        StoryQuestionAnswer = notificationIconType35;
        NotificationIconType notificationIconType36 = new NotificationIconType("SuggestedPostPublished", 35, "suggested_post_published");
        SuggestedPostPublished = notificationIconType36;
        NotificationIconType notificationIconType37 = new NotificationIconType("TransferMoney", 36, "transfer_money");
        TransferMoney = notificationIconType37;
        NotificationIconType notificationIconType38 = new NotificationIconType("TransferMoneyCancelled", 37, "transfer_money_cancelled");
        TransferMoneyCancelled = notificationIconType38;
        NotificationIconType notificationIconType39 = new NotificationIconType("TransferVotes", 38, "transfer_votes");
        TransferVotes = notificationIconType39;
        NotificationIconType notificationIconType40 = new NotificationIconType("Voting", 39, "voting");
        Voting = notificationIconType40;
        NotificationIconType notificationIconType41 = new NotificationIconType("Wall", 40, "wall");
        Wall = notificationIconType41;
        NotificationIconType notificationIconType42 = new NotificationIconType("WishlistBirthday", 41, "wishlist_birthday");
        WishlistBirthday = notificationIconType42;
        NotificationIconType notificationIconType43 = new NotificationIconType("Donut", 42, "donut");
        Donut = notificationIconType43;
        NotificationIconType notificationIconType44 = new NotificationIconType("MarketOrderStatusCollecting", 43, "market_order_status_collecting");
        MarketOrderStatusCollecting = notificationIconType44;
        NotificationIconType[] notificationIconTypeArr = {notificationIconType, notificationIconType2, notificationIconType3, notificationIconType4, notificationIconType5, notificationIconType6, notificationIconType7, notificationIconType8, notificationIconType9, notificationIconType10, notificationIconType11, notificationIconType12, notificationIconType13, notificationIconType14, notificationIconType15, notificationIconType16, notificationIconType17, notificationIconType18, notificationIconType19, notificationIconType20, notificationIconType21, notificationIconType22, notificationIconType23, notificationIconType24, notificationIconType25, notificationIconType26, notificationIconType27, notificationIconType28, notificationIconType29, notificationIconType30, notificationIconType31, notificationIconType32, notificationIconType33, notificationIconType34, notificationIconType35, notificationIconType36, notificationIconType37, notificationIconType38, notificationIconType39, notificationIconType40, notificationIconType41, notificationIconType42, notificationIconType43, notificationIconType44};
        $VALUES = notificationIconTypeArr;
        $ENTRIES = new asp(notificationIconTypeArr);
    }

    public NotificationIconType(String str, int i, String str2) {
        this.iconName = str2;
    }

    public static NotificationIconType valueOf(String str) {
        return (NotificationIconType) Enum.valueOf(NotificationIconType.class, str);
    }

    public static NotificationIconType[] values() {
        return (NotificationIconType[]) $VALUES.clone();
    }

    public final String h() {
        return this.iconName;
    }
}
