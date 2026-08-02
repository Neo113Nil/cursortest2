package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesMarkSeenSourceDto.kt */
/* loaded from: classes15.dex */
public final class StoriesMarkSeenSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesMarkSeenSourceDto[] $VALUES;

    @pmi0("ads_preview")
    public static final StoriesMarkSeenSourceDto ADS_PREVIEW;

    @pmi0("archive")
    public static final StoriesMarkSeenSourceDto ARCHIVE;

    @pmi0("avatar")
    public static final StoriesMarkSeenSourceDto AVATAR;

    @pmi0("comment_avatar")
    public static final StoriesMarkSeenSourceDto COMMENT_AVATAR;
    public static final Parcelable.Creator<StoriesMarkSeenSourceDto> CREATOR;

    @pmi0("discover")
    public static final StoriesMarkSeenSourceDto DISCOVER;

    @pmi0("discover_feed_block")
    public static final StoriesMarkSeenSourceDto DISCOVER_FEED_BLOCK;

    @pmi0("discover_geo_block")
    public static final StoriesMarkSeenSourceDto DISCOVER_GEO_BLOCK;

    @pmi0("discover_link")
    public static final StoriesMarkSeenSourceDto DISCOVER_LINK;

    @pmi0("fave")
    public static final StoriesMarkSeenSourceDto FAVE;

    @pmi0("feed")
    public static final StoriesMarkSeenSourceDto FEED;

    @pmi0("feed_middle")
    public static final StoriesMarkSeenSourceDto FEED_MIDDLE;

    @pmi0("group_personal_card")
    public static final StoriesMarkSeenSourceDto GROUP_PERSONAL_CARD;

    @pmi0("im_channels")
    public static final StoriesMarkSeenSourceDto IM_CHANNELS;

    @pmi0("im_chat_details")
    public static final StoriesMarkSeenSourceDto IM_CHAT_DETAILS;

    @pmi0("im_dialogs")
    public static final StoriesMarkSeenSourceDto IM_DIALOGS;

    @pmi0("im_dialog_header")
    public static final StoriesMarkSeenSourceDto IM_DIALOG_HEADER;

    @pmi0("im_msg_list")
    public static final StoriesMarkSeenSourceDto IM_MSG_LIST;

    @pmi0("im_settings")
    public static final StoriesMarkSeenSourceDto IM_SETTINGS;

    @pmi0("link")
    public static final StoriesMarkSeenSourceDto LINK;

    @pmi0("list")
    public static final StoriesMarkSeenSourceDto LIST;

    @pmi0("list_middle")
    public static final StoriesMarkSeenSourceDto LIST_MIDDLE;

    @pmi0("narrative_link")
    public static final StoriesMarkSeenSourceDto NARRATIVE_LINK;

    @pmi0("narrative_recommendations")
    public static final StoriesMarkSeenSourceDto NARRATIVE_RECOMMENDATIONS;

    @pmi0("narrative_section")
    public static final StoriesMarkSeenSourceDto NARRATIVE_SECTION;

    @pmi0("narrative_snippet")
    public static final StoriesMarkSeenSourceDto NARRATIVE_SNIPPET;

    @pmi0("narrative_story")
    public static final StoriesMarkSeenSourceDto NARRATIVE_STORY;

    @pmi0("nospam")
    public static final StoriesMarkSeenSourceDto NOSPAM;

    @pmi0("place_story_list")
    public static final StoriesMarkSeenSourceDto PLACE_STORY_LIST;

    @pmi0("post_avatar")
    public static final StoriesMarkSeenSourceDto POST_AVATAR;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final StoriesMarkSeenSourceDto PROFILE;

    @pmi0("profile_snackbar")
    public static final StoriesMarkSeenSourceDto PROFILE_SNACKBAR;

    @pmi0("question_story")
    public static final StoriesMarkSeenSourceDto QUESTION_STORY;

    @pmi0("replies_list")
    public static final StoriesMarkSeenSourceDto REPLIES_LIST;

    @pmi0("reply")
    public static final StoriesMarkSeenSourceDto REPLY;

    @pmi0("reply_story")
    public static final StoriesMarkSeenSourceDto REPLY_STORY;

    @pmi0("repost_auto_to_story_activity")
    public static final StoriesMarkSeenSourceDto REPOST_AUTO_TO_STORY_ACTIVITY;

    @pmi0("seamless_transition_discover")
    public static final StoriesMarkSeenSourceDto SEAMLESS_TRANSITION_DISCOVER;

    @pmi0("seamless_transition_discover_feed_block")
    public static final StoriesMarkSeenSourceDto SEAMLESS_TRANSITION_DISCOVER_FEED_BLOCK;

    @pmi0("search_story_list")
    public static final StoriesMarkSeenSourceDto SEARCH_STORY_LIST;

    @pmi0("sf")
    public static final StoriesMarkSeenSourceDto SF;

    @pmi0("snippet")
    public static final StoriesMarkSeenSourceDto SNIPPET;

    @pmi0("stories_feed_block")
    public static final StoriesMarkSeenSourceDto STORIES_FEED_BLOCK;

    @pmi0("stories_feed_block_preview")
    public static final StoriesMarkSeenSourceDto STORIES_FEED_BLOCK_PREVIEW;

    @pmi0("stories_possible_friends_block")
    public static final StoriesMarkSeenSourceDto STORIES_POSSIBLE_FRIENDS_BLOCK;

    @pmi0("story_archive")
    public static final StoriesMarkSeenSourceDto STORY_ARCHIVE;

    @pmi0("user_personal_card")
    public static final StoriesMarkSeenSourceDto USER_PERSONAL_CARD;

    @pmi0("your_friends_stories_block")
    public static final StoriesMarkSeenSourceDto YOUR_FRIENDS_STORIES_BLOCK;
    private final String value;

    /* compiled from: StoriesMarkSeenSourceDto.kt */
    public static final class a implements Parcelable.Creator<StoriesMarkSeenSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesMarkSeenSourceDto createFromParcel(Parcel parcel) {
            return StoriesMarkSeenSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesMarkSeenSourceDto[] newArray(int i) {
            return new StoriesMarkSeenSourceDto[i];
        }
    }

    static {
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto = new StoriesMarkSeenSourceDto("ADS_PREVIEW", 0, "ads_preview");
        ADS_PREVIEW = storiesMarkSeenSourceDto;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto2 = new StoriesMarkSeenSourceDto("ARCHIVE", 1, "archive");
        ARCHIVE = storiesMarkSeenSourceDto2;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto3 = new StoriesMarkSeenSourceDto("AVATAR", 2, "avatar");
        AVATAR = storiesMarkSeenSourceDto3;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto4 = new StoriesMarkSeenSourceDto("COMMENT_AVATAR", 3, "comment_avatar");
        COMMENT_AVATAR = storiesMarkSeenSourceDto4;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto5 = new StoriesMarkSeenSourceDto("DISCOVER", 4, "discover");
        DISCOVER = storiesMarkSeenSourceDto5;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto6 = new StoriesMarkSeenSourceDto("DISCOVER_FEED_BLOCK", 5, "discover_feed_block");
        DISCOVER_FEED_BLOCK = storiesMarkSeenSourceDto6;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto7 = new StoriesMarkSeenSourceDto("DISCOVER_GEO_BLOCK", 6, "discover_geo_block");
        DISCOVER_GEO_BLOCK = storiesMarkSeenSourceDto7;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto8 = new StoriesMarkSeenSourceDto("DISCOVER_LINK", 7, "discover_link");
        DISCOVER_LINK = storiesMarkSeenSourceDto8;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto9 = new StoriesMarkSeenSourceDto("FAVE", 8, "fave");
        FAVE = storiesMarkSeenSourceDto9;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto10 = new StoriesMarkSeenSourceDto("FEED", 9, "feed");
        FEED = storiesMarkSeenSourceDto10;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto11 = new StoriesMarkSeenSourceDto("FEED_MIDDLE", 10, "feed_middle");
        FEED_MIDDLE = storiesMarkSeenSourceDto11;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto12 = new StoriesMarkSeenSourceDto("GROUP_PERSONAL_CARD", 11, "group_personal_card");
        GROUP_PERSONAL_CARD = storiesMarkSeenSourceDto12;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto13 = new StoriesMarkSeenSourceDto("IM_CHANNELS", 12, "im_channels");
        IM_CHANNELS = storiesMarkSeenSourceDto13;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto14 = new StoriesMarkSeenSourceDto("IM_CHAT_DETAILS", 13, "im_chat_details");
        IM_CHAT_DETAILS = storiesMarkSeenSourceDto14;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto15 = new StoriesMarkSeenSourceDto("IM_DIALOG_HEADER", 14, "im_dialog_header");
        IM_DIALOG_HEADER = storiesMarkSeenSourceDto15;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto16 = new StoriesMarkSeenSourceDto("IM_DIALOGS", 15, "im_dialogs");
        IM_DIALOGS = storiesMarkSeenSourceDto16;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto17 = new StoriesMarkSeenSourceDto("IM_MSG_LIST", 16, "im_msg_list");
        IM_MSG_LIST = storiesMarkSeenSourceDto17;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto18 = new StoriesMarkSeenSourceDto("IM_SETTINGS", 17, "im_settings");
        IM_SETTINGS = storiesMarkSeenSourceDto18;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto19 = new StoriesMarkSeenSourceDto("LINK", 18, "link");
        LINK = storiesMarkSeenSourceDto19;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto20 = new StoriesMarkSeenSourceDto("LIST", 19, "list");
        LIST = storiesMarkSeenSourceDto20;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto21 = new StoriesMarkSeenSourceDto("LIST_MIDDLE", 20, "list_middle");
        LIST_MIDDLE = storiesMarkSeenSourceDto21;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto22 = new StoriesMarkSeenSourceDto("NARRATIVE_LINK", 21, "narrative_link");
        NARRATIVE_LINK = storiesMarkSeenSourceDto22;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto23 = new StoriesMarkSeenSourceDto("NARRATIVE_RECOMMENDATIONS", 22, "narrative_recommendations");
        NARRATIVE_RECOMMENDATIONS = storiesMarkSeenSourceDto23;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto24 = new StoriesMarkSeenSourceDto("NARRATIVE_SECTION", 23, "narrative_section");
        NARRATIVE_SECTION = storiesMarkSeenSourceDto24;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto25 = new StoriesMarkSeenSourceDto("NARRATIVE_SNIPPET", 24, "narrative_snippet");
        NARRATIVE_SNIPPET = storiesMarkSeenSourceDto25;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto26 = new StoriesMarkSeenSourceDto("NARRATIVE_STORY", 25, "narrative_story");
        NARRATIVE_STORY = storiesMarkSeenSourceDto26;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto27 = new StoriesMarkSeenSourceDto("NOSPAM", 26, "nospam");
        NOSPAM = storiesMarkSeenSourceDto27;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto28 = new StoriesMarkSeenSourceDto("PLACE_STORY_LIST", 27, "place_story_list");
        PLACE_STORY_LIST = storiesMarkSeenSourceDto28;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto29 = new StoriesMarkSeenSourceDto("POST_AVATAR", 28, "post_avatar");
        POST_AVATAR = storiesMarkSeenSourceDto29;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto30 = new StoriesMarkSeenSourceDto("PROFILE", 29, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = storiesMarkSeenSourceDto30;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto31 = new StoriesMarkSeenSourceDto("PROFILE_SNACKBAR", 30, "profile_snackbar");
        PROFILE_SNACKBAR = storiesMarkSeenSourceDto31;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto32 = new StoriesMarkSeenSourceDto("QUESTION_STORY", 31, "question_story");
        QUESTION_STORY = storiesMarkSeenSourceDto32;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto33 = new StoriesMarkSeenSourceDto("REPLIES_LIST", 32, "replies_list");
        REPLIES_LIST = storiesMarkSeenSourceDto33;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto34 = new StoriesMarkSeenSourceDto("REPLY", 33, "reply");
        REPLY = storiesMarkSeenSourceDto34;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto35 = new StoriesMarkSeenSourceDto("REPLY_STORY", 34, "reply_story");
        REPLY_STORY = storiesMarkSeenSourceDto35;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto36 = new StoriesMarkSeenSourceDto("REPOST_AUTO_TO_STORY_ACTIVITY", 35, "repost_auto_to_story_activity");
        REPOST_AUTO_TO_STORY_ACTIVITY = storiesMarkSeenSourceDto36;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto37 = new StoriesMarkSeenSourceDto("SEAMLESS_TRANSITION_DISCOVER", 36, "seamless_transition_discover");
        SEAMLESS_TRANSITION_DISCOVER = storiesMarkSeenSourceDto37;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto38 = new StoriesMarkSeenSourceDto("SEAMLESS_TRANSITION_DISCOVER_FEED_BLOCK", 37, "seamless_transition_discover_feed_block");
        SEAMLESS_TRANSITION_DISCOVER_FEED_BLOCK = storiesMarkSeenSourceDto38;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto39 = new StoriesMarkSeenSourceDto("SEARCH_STORY_LIST", 38, "search_story_list");
        SEARCH_STORY_LIST = storiesMarkSeenSourceDto39;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto40 = new StoriesMarkSeenSourceDto("SF", 39, "sf");
        SF = storiesMarkSeenSourceDto40;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto41 = new StoriesMarkSeenSourceDto("SNIPPET", 40, "snippet");
        SNIPPET = storiesMarkSeenSourceDto41;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto42 = new StoriesMarkSeenSourceDto("STORIES_FEED_BLOCK", 41, "stories_feed_block");
        STORIES_FEED_BLOCK = storiesMarkSeenSourceDto42;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto43 = new StoriesMarkSeenSourceDto("STORIES_FEED_BLOCK_PREVIEW", 42, "stories_feed_block_preview");
        STORIES_FEED_BLOCK_PREVIEW = storiesMarkSeenSourceDto43;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto44 = new StoriesMarkSeenSourceDto("STORY_ARCHIVE", 43, "story_archive");
        STORY_ARCHIVE = storiesMarkSeenSourceDto44;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto45 = new StoriesMarkSeenSourceDto("USER_PERSONAL_CARD", 44, "user_personal_card");
        USER_PERSONAL_CARD = storiesMarkSeenSourceDto45;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto46 = new StoriesMarkSeenSourceDto("YOUR_FRIENDS_STORIES_BLOCK", 45, "your_friends_stories_block");
        YOUR_FRIENDS_STORIES_BLOCK = storiesMarkSeenSourceDto46;
        StoriesMarkSeenSourceDto storiesMarkSeenSourceDto47 = new StoriesMarkSeenSourceDto("STORIES_POSSIBLE_FRIENDS_BLOCK", 46, "stories_possible_friends_block");
        STORIES_POSSIBLE_FRIENDS_BLOCK = storiesMarkSeenSourceDto47;
        StoriesMarkSeenSourceDto[] storiesMarkSeenSourceDtoArr = {storiesMarkSeenSourceDto, storiesMarkSeenSourceDto2, storiesMarkSeenSourceDto3, storiesMarkSeenSourceDto4, storiesMarkSeenSourceDto5, storiesMarkSeenSourceDto6, storiesMarkSeenSourceDto7, storiesMarkSeenSourceDto8, storiesMarkSeenSourceDto9, storiesMarkSeenSourceDto10, storiesMarkSeenSourceDto11, storiesMarkSeenSourceDto12, storiesMarkSeenSourceDto13, storiesMarkSeenSourceDto14, storiesMarkSeenSourceDto15, storiesMarkSeenSourceDto16, storiesMarkSeenSourceDto17, storiesMarkSeenSourceDto18, storiesMarkSeenSourceDto19, storiesMarkSeenSourceDto20, storiesMarkSeenSourceDto21, storiesMarkSeenSourceDto22, storiesMarkSeenSourceDto23, storiesMarkSeenSourceDto24, storiesMarkSeenSourceDto25, storiesMarkSeenSourceDto26, storiesMarkSeenSourceDto27, storiesMarkSeenSourceDto28, storiesMarkSeenSourceDto29, storiesMarkSeenSourceDto30, storiesMarkSeenSourceDto31, storiesMarkSeenSourceDto32, storiesMarkSeenSourceDto33, storiesMarkSeenSourceDto34, storiesMarkSeenSourceDto35, storiesMarkSeenSourceDto36, storiesMarkSeenSourceDto37, storiesMarkSeenSourceDto38, storiesMarkSeenSourceDto39, storiesMarkSeenSourceDto40, storiesMarkSeenSourceDto41, storiesMarkSeenSourceDto42, storiesMarkSeenSourceDto43, storiesMarkSeenSourceDto44, storiesMarkSeenSourceDto45, storiesMarkSeenSourceDto46, storiesMarkSeenSourceDto47};
        $VALUES = storiesMarkSeenSourceDtoArr;
        $ENTRIES = new asp(storiesMarkSeenSourceDtoArr);
        CREATOR = new a();
    }

    private StoriesMarkSeenSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesMarkSeenSourceDto valueOf(String str) {
        return (StoriesMarkSeenSourceDto) Enum.valueOf(StoriesMarkSeenSourceDto.class, str);
    }

    public static StoriesMarkSeenSourceDto[] values() {
        return (StoriesMarkSeenSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
