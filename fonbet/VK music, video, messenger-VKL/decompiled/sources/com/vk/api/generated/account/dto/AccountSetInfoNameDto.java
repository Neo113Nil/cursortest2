package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSetInfoNameDto.kt */
/* loaded from: classes14.dex */
public final class AccountSetInfoNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSetInfoNameDto[] $VALUES;

    @pmi0("audio_autoplay")
    public static final AccountSetInfoNameDto AUDIO_AUTOPLAY;

    @pmi0("comment_submit_type")
    public static final AccountSetInfoNameDto COMMENT_SUBMIT_TYPE;

    @pmi0("community_comments")
    public static final AccountSetInfoNameDto COMMUNITY_COMMENTS;
    public static final Parcelable.Creator<AccountSetInfoNameDto> CREATOR;

    @pmi0("fave_intro")
    public static final AccountSetInfoNameDto FAVE_INTRO;

    @pmi0("feed_type")
    public static final AccountSetInfoNameDto FEED_TYPE;

    @pmi0("im_user_name_type")
    public static final AccountSetInfoNameDto IM_USER_NAME_TYPE;

    @pmi0("include_channel_notifications")
    public static final AccountSetInfoNameDto INCLUDE_CHANNEL_NOTIFICATIONS;

    @pmi0("intro")
    public static final AccountSetInfoNameDto INTRO;

    @pmi0("is_recognize_block_friends_photo_enabled")
    public static final AccountSetInfoNameDto IS_RECOGNIZE_BLOCK_FRIENDS_PHOTO_ENABLED;

    @pmi0("is_recognize_block_me_photo_enabled")
    public static final AccountSetInfoNameDto IS_RECOGNIZE_BLOCK_ME_PHOTO_ENABLED;

    @pmi0("is_recognize_find_friends")
    public static final AccountSetInfoNameDto IS_RECOGNIZE_FIND_FRIENDS;

    @pmi0("is_recognize_photo_me_enabled")
    public static final AccountSetInfoNameDto IS_RECOGNIZE_PHOTO_ME_ENABLED;

    @pmi0("is_recognize_show_me_to_friends")
    public static final AccountSetInfoNameDto IS_RECOGNIZE_SHOW_ME_TO_FRIENDS;

    @pmi0("market_albums_v2_intro")
    public static final AccountSetInfoNameDto MARKET_ALBUMS_V2_INTRO;

    @pmi0("market_onboarding")
    public static final AccountSetInfoNameDto MARKET_ONBOARDING;

    @pmi0("market_wishlist")
    public static final AccountSetInfoNameDto MARKET_WISHLIST;

    @pmi0("menu_intro")
    public static final AccountSetInfoNameDto MENU_INTRO;

    @pmi0("messages_auto_unarchive")
    public static final AccountSetInfoNameDto MESSAGES_AUTO_UNARCHIVE;

    @pmi0("messages_counter_settings_include_channels")
    public static final AccountSetInfoNameDto MESSAGES_COUNTER_SETTINGS_INCLUDE_CHANNELS;

    @pmi0("messages_counter_settings_include_group_dialogs")
    public static final AccountSetInfoNameDto MESSAGES_COUNTER_SETTINGS_INCLUDE_GROUP_DIALOGS;

    @pmi0("messages_counter_settings_include_mutted")
    public static final AccountSetInfoNameDto MESSAGES_COUNTER_SETTINGS_INCLUDE_MUTTED;

    @pmi0("messages_multiline_input")
    public static final AccountSetInfoNameDto MESSAGES_MULTILINE_INPUT;

    @pmi0("messages_recommendation_list_hidden")
    public static final AccountSetInfoNameDto MESSAGES_RECOMMENDATION_LIST_HIDDEN;

    @pmi0("messages_transcript_auto_show")
    public static final AccountSetInfoNameDto MESSAGES_TRANSCRIPT_AUTO_SHOW;

    @pmi0("money_p2p_intro")
    public static final AccountSetInfoNameDto MONEY_P2P_INTRO;

    @pmi0("music_intro")
    public static final AccountSetInfoNameDto MUSIC_INTRO;

    @pmi0("no_wall_replies")
    public static final AccountSetInfoNameDto NO_WALL_REPLIES;

    @pmi0("own_posts_default")
    public static final AccountSetInfoNameDto OWN_POSTS_DEFAULT;

    @pmi0("shopping_intro")
    public static final AccountSetInfoNameDto SHOPPING_INTRO;

    @pmi0("show_only_not_muted_messages")
    public static final AccountSetInfoNameDto SHOW_ONLY_NOT_MUTED_MESSAGES;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    public static final AccountSetInfoNameDto TIMEZONE;

    @pmi0("visible_time")
    public static final AccountSetInfoNameDto VISIBLE_TIME;

    @pmi0("wishlists_ae_promobanner")
    public static final AccountSetInfoNameDto WISHLISTS_AE_PROMOBANNER;
    private final String value;

    /* compiled from: AccountSetInfoNameDto.kt */
    public static final class a implements Parcelable.Creator<AccountSetInfoNameDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSetInfoNameDto createFromParcel(Parcel parcel) {
            return AccountSetInfoNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSetInfoNameDto[] newArray(int i) {
            return new AccountSetInfoNameDto[i];
        }
    }

    static {
        AccountSetInfoNameDto accountSetInfoNameDto = new AccountSetInfoNameDto("AUDIO_AUTOPLAY", 0, "audio_autoplay");
        AUDIO_AUTOPLAY = accountSetInfoNameDto;
        AccountSetInfoNameDto accountSetInfoNameDto2 = new AccountSetInfoNameDto("COMMENT_SUBMIT_TYPE", 1, "comment_submit_type");
        COMMENT_SUBMIT_TYPE = accountSetInfoNameDto2;
        AccountSetInfoNameDto accountSetInfoNameDto3 = new AccountSetInfoNameDto("COMMUNITY_COMMENTS", 2, "community_comments");
        COMMUNITY_COMMENTS = accountSetInfoNameDto3;
        AccountSetInfoNameDto accountSetInfoNameDto4 = new AccountSetInfoNameDto("FAVE_INTRO", 3, "fave_intro");
        FAVE_INTRO = accountSetInfoNameDto4;
        AccountSetInfoNameDto accountSetInfoNameDto5 = new AccountSetInfoNameDto("FEED_TYPE", 4, "feed_type");
        FEED_TYPE = accountSetInfoNameDto5;
        AccountSetInfoNameDto accountSetInfoNameDto6 = new AccountSetInfoNameDto("IM_USER_NAME_TYPE", 5, "im_user_name_type");
        IM_USER_NAME_TYPE = accountSetInfoNameDto6;
        AccountSetInfoNameDto accountSetInfoNameDto7 = new AccountSetInfoNameDto("INCLUDE_CHANNEL_NOTIFICATIONS", 6, "include_channel_notifications");
        INCLUDE_CHANNEL_NOTIFICATIONS = accountSetInfoNameDto7;
        AccountSetInfoNameDto accountSetInfoNameDto8 = new AccountSetInfoNameDto("INTRO", 7, "intro");
        INTRO = accountSetInfoNameDto8;
        AccountSetInfoNameDto accountSetInfoNameDto9 = new AccountSetInfoNameDto("IS_RECOGNIZE_BLOCK_FRIENDS_PHOTO_ENABLED", 8, "is_recognize_block_friends_photo_enabled");
        IS_RECOGNIZE_BLOCK_FRIENDS_PHOTO_ENABLED = accountSetInfoNameDto9;
        AccountSetInfoNameDto accountSetInfoNameDto10 = new AccountSetInfoNameDto("IS_RECOGNIZE_BLOCK_ME_PHOTO_ENABLED", 9, "is_recognize_block_me_photo_enabled");
        IS_RECOGNIZE_BLOCK_ME_PHOTO_ENABLED = accountSetInfoNameDto10;
        AccountSetInfoNameDto accountSetInfoNameDto11 = new AccountSetInfoNameDto("IS_RECOGNIZE_FIND_FRIENDS", 10, "is_recognize_find_friends");
        IS_RECOGNIZE_FIND_FRIENDS = accountSetInfoNameDto11;
        AccountSetInfoNameDto accountSetInfoNameDto12 = new AccountSetInfoNameDto("IS_RECOGNIZE_PHOTO_ME_ENABLED", 11, "is_recognize_photo_me_enabled");
        IS_RECOGNIZE_PHOTO_ME_ENABLED = accountSetInfoNameDto12;
        AccountSetInfoNameDto accountSetInfoNameDto13 = new AccountSetInfoNameDto("IS_RECOGNIZE_SHOW_ME_TO_FRIENDS", 12, "is_recognize_show_me_to_friends");
        IS_RECOGNIZE_SHOW_ME_TO_FRIENDS = accountSetInfoNameDto13;
        AccountSetInfoNameDto accountSetInfoNameDto14 = new AccountSetInfoNameDto("MARKET_ALBUMS_V2_INTRO", 13, "market_albums_v2_intro");
        MARKET_ALBUMS_V2_INTRO = accountSetInfoNameDto14;
        AccountSetInfoNameDto accountSetInfoNameDto15 = new AccountSetInfoNameDto("MARKET_ONBOARDING", 14, "market_onboarding");
        MARKET_ONBOARDING = accountSetInfoNameDto15;
        AccountSetInfoNameDto accountSetInfoNameDto16 = new AccountSetInfoNameDto("MARKET_WISHLIST", 15, "market_wishlist");
        MARKET_WISHLIST = accountSetInfoNameDto16;
        AccountSetInfoNameDto accountSetInfoNameDto17 = new AccountSetInfoNameDto("MENU_INTRO", 16, "menu_intro");
        MENU_INTRO = accountSetInfoNameDto17;
        AccountSetInfoNameDto accountSetInfoNameDto18 = new AccountSetInfoNameDto("MESSAGES_AUTO_UNARCHIVE", 17, "messages_auto_unarchive");
        MESSAGES_AUTO_UNARCHIVE = accountSetInfoNameDto18;
        AccountSetInfoNameDto accountSetInfoNameDto19 = new AccountSetInfoNameDto("MESSAGES_COUNTER_SETTINGS_INCLUDE_CHANNELS", 18, "messages_counter_settings_include_channels");
        MESSAGES_COUNTER_SETTINGS_INCLUDE_CHANNELS = accountSetInfoNameDto19;
        AccountSetInfoNameDto accountSetInfoNameDto20 = new AccountSetInfoNameDto("MESSAGES_COUNTER_SETTINGS_INCLUDE_GROUP_DIALOGS", 19, "messages_counter_settings_include_group_dialogs");
        MESSAGES_COUNTER_SETTINGS_INCLUDE_GROUP_DIALOGS = accountSetInfoNameDto20;
        AccountSetInfoNameDto accountSetInfoNameDto21 = new AccountSetInfoNameDto("MESSAGES_COUNTER_SETTINGS_INCLUDE_MUTTED", 20, "messages_counter_settings_include_mutted");
        MESSAGES_COUNTER_SETTINGS_INCLUDE_MUTTED = accountSetInfoNameDto21;
        AccountSetInfoNameDto accountSetInfoNameDto22 = new AccountSetInfoNameDto("MESSAGES_MULTILINE_INPUT", 21, "messages_multiline_input");
        MESSAGES_MULTILINE_INPUT = accountSetInfoNameDto22;
        AccountSetInfoNameDto accountSetInfoNameDto23 = new AccountSetInfoNameDto("MESSAGES_TRANSCRIPT_AUTO_SHOW", 22, "messages_transcript_auto_show");
        MESSAGES_TRANSCRIPT_AUTO_SHOW = accountSetInfoNameDto23;
        AccountSetInfoNameDto accountSetInfoNameDto24 = new AccountSetInfoNameDto("MONEY_P2P_INTRO", 23, "money_p2p_intro");
        MONEY_P2P_INTRO = accountSetInfoNameDto24;
        AccountSetInfoNameDto accountSetInfoNameDto25 = new AccountSetInfoNameDto("MUSIC_INTRO", 24, "music_intro");
        MUSIC_INTRO = accountSetInfoNameDto25;
        AccountSetInfoNameDto accountSetInfoNameDto26 = new AccountSetInfoNameDto("NO_WALL_REPLIES", 25, "no_wall_replies");
        NO_WALL_REPLIES = accountSetInfoNameDto26;
        AccountSetInfoNameDto accountSetInfoNameDto27 = new AccountSetInfoNameDto("OWN_POSTS_DEFAULT", 26, "own_posts_default");
        OWN_POSTS_DEFAULT = accountSetInfoNameDto27;
        AccountSetInfoNameDto accountSetInfoNameDto28 = new AccountSetInfoNameDto("SHOPPING_INTRO", 27, "shopping_intro");
        SHOPPING_INTRO = accountSetInfoNameDto28;
        AccountSetInfoNameDto accountSetInfoNameDto29 = new AccountSetInfoNameDto("SHOW_ONLY_NOT_MUTED_MESSAGES", 28, "show_only_not_muted_messages");
        SHOW_ONLY_NOT_MUTED_MESSAGES = accountSetInfoNameDto29;
        AccountSetInfoNameDto accountSetInfoNameDto30 = new AccountSetInfoNameDto("TIMEZONE", 29, AnalyticsBaseParamsConstantsKt.TIMEZONE);
        TIMEZONE = accountSetInfoNameDto30;
        AccountSetInfoNameDto accountSetInfoNameDto31 = new AccountSetInfoNameDto("VISIBLE_TIME", 30, "visible_time");
        VISIBLE_TIME = accountSetInfoNameDto31;
        AccountSetInfoNameDto accountSetInfoNameDto32 = new AccountSetInfoNameDto("WISHLISTS_AE_PROMOBANNER", 31, "wishlists_ae_promobanner");
        WISHLISTS_AE_PROMOBANNER = accountSetInfoNameDto32;
        AccountSetInfoNameDto accountSetInfoNameDto33 = new AccountSetInfoNameDto("MESSAGES_RECOMMENDATION_LIST_HIDDEN", 32, "messages_recommendation_list_hidden");
        MESSAGES_RECOMMENDATION_LIST_HIDDEN = accountSetInfoNameDto33;
        AccountSetInfoNameDto[] accountSetInfoNameDtoArr = {accountSetInfoNameDto, accountSetInfoNameDto2, accountSetInfoNameDto3, accountSetInfoNameDto4, accountSetInfoNameDto5, accountSetInfoNameDto6, accountSetInfoNameDto7, accountSetInfoNameDto8, accountSetInfoNameDto9, accountSetInfoNameDto10, accountSetInfoNameDto11, accountSetInfoNameDto12, accountSetInfoNameDto13, accountSetInfoNameDto14, accountSetInfoNameDto15, accountSetInfoNameDto16, accountSetInfoNameDto17, accountSetInfoNameDto18, accountSetInfoNameDto19, accountSetInfoNameDto20, accountSetInfoNameDto21, accountSetInfoNameDto22, accountSetInfoNameDto23, accountSetInfoNameDto24, accountSetInfoNameDto25, accountSetInfoNameDto26, accountSetInfoNameDto27, accountSetInfoNameDto28, accountSetInfoNameDto29, accountSetInfoNameDto30, accountSetInfoNameDto31, accountSetInfoNameDto32, accountSetInfoNameDto33};
        $VALUES = accountSetInfoNameDtoArr;
        $ENTRIES = new asp(accountSetInfoNameDtoArr);
        CREATOR = new a();
    }

    private AccountSetInfoNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountSetInfoNameDto valueOf(String str) {
        return (AccountSetInfoNameDto) Enum.valueOf(AccountSetInfoNameDto.class, str);
    }

    public static AccountSetInfoNameDto[] values() {
        return (AccountSetInfoNameDto[]) $VALUES.clone();
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
