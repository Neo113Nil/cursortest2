package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.eok;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSetPrivacyKeyDto.kt */
/* loaded from: classes14.dex */
public final class AccountSetPrivacyKeyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSetPrivacyKeyDto[] $VALUES;

    @pmi0("appscall")
    public static final AccountSetPrivacyKeyDto APPSCALL;

    @pmi0("apps_invite")
    public static final AccountSetPrivacyKeyDto APPS_INVITE;

    @pmi0("audios")
    public static final AccountSetPrivacyKeyDto AUDIOS;

    @pmi0("bdate_visibility")
    public static final AccountSetPrivacyKeyDto BDATE_VISIBILITY;

    @pmi0("calls")
    public static final AccountSetPrivacyKeyDto CALLS;

    @pmi0("calls_from_community")
    public static final AccountSetPrivacyKeyDto CALLS_FROM_COMMUNITY;

    @pmi0("calls_has_messages")
    public static final AccountSetPrivacyKeyDto CALLS_HAS_MESSAGES;

    @pmi0("calls_in_contacts")
    public static final AccountSetPrivacyKeyDto CALLS_IN_CONTACTS;

    @pmi0("calls_ip")
    public static final AccountSetPrivacyKeyDto CALLS_IP;

    @pmi0("chat_invite_user")
    public static final AccountSetPrivacyKeyDto CHAT_INVITE_USER;

    @pmi0("closed_profile")
    public static final AccountSetPrivacyKeyDto CLOSED_PROFILE;

    @pmi0("company_messages")
    public static final AccountSetPrivacyKeyDto COMPANY_MESSAGES;

    @pmi0("contact_avatar")
    public static final AccountSetPrivacyKeyDto CONTACT_AVATAR;

    @pmi0("co_ownership")
    public static final AccountSetPrivacyKeyDto CO_OWNERSHIP;
    public static final Parcelable.Creator<AccountSetPrivacyKeyDto> CREATOR;

    @pmi0("followers_mode")
    public static final AccountSetPrivacyKeyDto FOLLOWERS_MODE;

    @pmi0("friends_requests")
    public static final AccountSetPrivacyKeyDto FRIENDS_REQUESTS;

    @pmi0("games_feed")
    public static final AccountSetPrivacyKeyDto GAMES_FEED;

    @pmi0("gifts")
    public static final AccountSetPrivacyKeyDto GIFTS;

    @pmi0("groups")
    public static final AccountSetPrivacyKeyDto GROUPS;

    @pmi0("groups_invite")
    public static final AccountSetPrivacyKeyDto GROUPS_INVITE;

    @pmi0("hidden_friends")
    public static final AccountSetPrivacyKeyDto HIDDEN_FRIENDS;

    @pmi0("hidden_friends_list")
    public static final AccountSetPrivacyKeyDto HIDDEN_FRIENDS_LIST;

    @pmi0("home")
    public static final AccountSetPrivacyKeyDto HOME;

    @pmi0("is_recognize_photo_me_enabled")
    public static final AccountSetPrivacyKeyDto IS_RECOGNIZE_PHOTO_ME_ENABLED;

    @pmi0("lives")
    public static final AccountSetPrivacyKeyDto LIVES;

    @pmi0("lives_replies")
    public static final AccountSetPrivacyKeyDto LIVES_REPLIES;

    @pmi0("mail_send")
    public static final AccountSetPrivacyKeyDto MAIL_SEND;

    @pmi0("message_requests")
    public static final AccountSetPrivacyKeyDto MESSAGE_REQUESTS;

    @pmi0("mini_apps")
    public static final AccountSetPrivacyKeyDto MINI_APPS;

    @pmi0("mobile")
    public static final AccountSetPrivacyKeyDto MOBILE;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    public static final AccountSetPrivacyKeyDto ONLINE;

    @pmi0("page_access")
    public static final AccountSetPrivacyKeyDto PAGE_ACCESS;

    @pmi0("photos_saved")
    public static final AccountSetPrivacyKeyDto PHOTOS_SAVED;

    @pmi0("photos_tagme")
    public static final AccountSetPrivacyKeyDto PHOTOS_TAGME;

    @pmi0("photos_with")
    public static final AccountSetPrivacyKeyDto PHOTOS_WITH;

    @pmi0("places")
    public static final AccountSetPrivacyKeyDto PLACES;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final AccountSetPrivacyKeyDto PROFILE;

    @pmi0("questions")
    public static final AccountSetPrivacyKeyDto QUESTIONS;

    @pmi0("replies_view")
    public static final AccountSetPrivacyKeyDto REPLIES_VIEW;

    @pmi0("search_by_reg_phone")
    public static final AccountSetPrivacyKeyDto SEARCH_BY_REG_PHONE;

    @pmi0("status_replies")
    public static final AccountSetPrivacyKeyDto STATUS_REPLIES;

    @pmi0("stories")
    public static final AccountSetPrivacyKeyDto STORIES;

    @pmi0("stories_birthday_wishes")
    public static final AccountSetPrivacyKeyDto STORIES_BIRTHDAY_WISHES;

    @pmi0("stories_exclude")
    public static final AccountSetPrivacyKeyDto STORIES_EXCLUDE;

    @pmi0("stories_questions")
    public static final AccountSetPrivacyKeyDto STORIES_QUESTIONS;

    @pmi0("stories_replies")
    public static final AccountSetPrivacyKeyDto STORIES_REPLIES;

    @pmi0("videos")
    public static final AccountSetPrivacyKeyDto VIDEOS;

    @pmi0("vkrun_steps")
    public static final AccountSetPrivacyKeyDto VKRUN_STEPS;

    @pmi0("voicerooms_speaker")
    public static final AccountSetPrivacyKeyDto VOICEROOMS_SPEAKER;

    @pmi0("wall")
    public static final AccountSetPrivacyKeyDto WALL;

    @pmi0("wall_send")
    public static final AccountSetPrivacyKeyDto WALL_SEND;
    private final String value;

    /* compiled from: AccountSetPrivacyKeyDto.kt */
    public static final class a implements Parcelable.Creator<AccountSetPrivacyKeyDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSetPrivacyKeyDto createFromParcel(Parcel parcel) {
            return AccountSetPrivacyKeyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSetPrivacyKeyDto[] newArray(int i) {
            return new AccountSetPrivacyKeyDto[i];
        }
    }

    static {
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto = new AccountSetPrivacyKeyDto("APPS_INVITE", 0, "apps_invite");
        APPS_INVITE = accountSetPrivacyKeyDto;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto2 = new AccountSetPrivacyKeyDto("APPSCALL", 1, "appscall");
        APPSCALL = accountSetPrivacyKeyDto2;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto3 = new AccountSetPrivacyKeyDto("AUDIOS", 2, "audios");
        AUDIOS = accountSetPrivacyKeyDto3;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto4 = new AccountSetPrivacyKeyDto("BDATE_VISIBILITY", 3, "bdate_visibility");
        BDATE_VISIBILITY = accountSetPrivacyKeyDto4;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto5 = new AccountSetPrivacyKeyDto("CALLS", 4, "calls");
        CALLS = accountSetPrivacyKeyDto5;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto6 = new AccountSetPrivacyKeyDto("CALLS_FROM_COMMUNITY", 5, "calls_from_community");
        CALLS_FROM_COMMUNITY = accountSetPrivacyKeyDto6;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto7 = new AccountSetPrivacyKeyDto("VOICEROOMS_SPEAKER", 6, "voicerooms_speaker");
        VOICEROOMS_SPEAKER = accountSetPrivacyKeyDto7;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto8 = new AccountSetPrivacyKeyDto("CALLS_HAS_MESSAGES", 7, "calls_has_messages");
        CALLS_HAS_MESSAGES = accountSetPrivacyKeyDto8;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto9 = new AccountSetPrivacyKeyDto("CALLS_IN_CONTACTS", 8, "calls_in_contacts");
        CALLS_IN_CONTACTS = accountSetPrivacyKeyDto9;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto10 = new AccountSetPrivacyKeyDto("CALLS_IP", 9, "calls_ip");
        CALLS_IP = accountSetPrivacyKeyDto10;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto11 = new AccountSetPrivacyKeyDto("CHAT_INVITE_USER", 10, "chat_invite_user");
        CHAT_INVITE_USER = accountSetPrivacyKeyDto11;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto12 = new AccountSetPrivacyKeyDto("CLOSED_PROFILE", 11, "closed_profile");
        CLOSED_PROFILE = accountSetPrivacyKeyDto12;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto13 = new AccountSetPrivacyKeyDto("CO_OWNERSHIP", 12, "co_ownership");
        CO_OWNERSHIP = accountSetPrivacyKeyDto13;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto14 = new AccountSetPrivacyKeyDto("COMPANY_MESSAGES", 13, "company_messages");
        COMPANY_MESSAGES = accountSetPrivacyKeyDto14;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto15 = new AccountSetPrivacyKeyDto("CONTACT_AVATAR", 14, "contact_avatar");
        CONTACT_AVATAR = accountSetPrivacyKeyDto15;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto16 = new AccountSetPrivacyKeyDto("HIDDEN_FRIENDS_LIST", 15, "hidden_friends_list");
        HIDDEN_FRIENDS_LIST = accountSetPrivacyKeyDto16;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto17 = new AccountSetPrivacyKeyDto("FOLLOWERS_MODE", 16, "followers_mode");
        FOLLOWERS_MODE = accountSetPrivacyKeyDto17;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto18 = new AccountSetPrivacyKeyDto("FRIENDS_REQUESTS", 17, "friends_requests");
        FRIENDS_REQUESTS = accountSetPrivacyKeyDto18;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto19 = new AccountSetPrivacyKeyDto("GAMES_FEED", 18, "games_feed");
        GAMES_FEED = accountSetPrivacyKeyDto19;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto20 = new AccountSetPrivacyKeyDto("GIFTS", 19, "gifts");
        GIFTS = accountSetPrivacyKeyDto20;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto21 = new AccountSetPrivacyKeyDto("GROUPS", 20, "groups");
        GROUPS = accountSetPrivacyKeyDto21;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto22 = new AccountSetPrivacyKeyDto("GROUPS_INVITE", 21, "groups_invite");
        GROUPS_INVITE = accountSetPrivacyKeyDto22;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto23 = new AccountSetPrivacyKeyDto("HIDDEN_FRIENDS", 22, "hidden_friends");
        HIDDEN_FRIENDS = accountSetPrivacyKeyDto23;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto24 = new AccountSetPrivacyKeyDto("HOME", 23, "home");
        HOME = accountSetPrivacyKeyDto24;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto25 = new AccountSetPrivacyKeyDto("IS_RECOGNIZE_PHOTO_ME_ENABLED", 24, "is_recognize_photo_me_enabled");
        IS_RECOGNIZE_PHOTO_ME_ENABLED = accountSetPrivacyKeyDto25;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto26 = new AccountSetPrivacyKeyDto("LIVES", 25, "lives");
        LIVES = accountSetPrivacyKeyDto26;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto27 = new AccountSetPrivacyKeyDto("LIVES_REPLIES", 26, "lives_replies");
        LIVES_REPLIES = accountSetPrivacyKeyDto27;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto28 = new AccountSetPrivacyKeyDto("MAIL_SEND", 27, "mail_send");
        MAIL_SEND = accountSetPrivacyKeyDto28;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto29 = new AccountSetPrivacyKeyDto("MESSAGE_REQUESTS", 28, "message_requests");
        MESSAGE_REQUESTS = accountSetPrivacyKeyDto29;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto30 = new AccountSetPrivacyKeyDto("MINI_APPS", 29, "mini_apps");
        MINI_APPS = accountSetPrivacyKeyDto30;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto31 = new AccountSetPrivacyKeyDto("MOBILE", 30, "mobile");
        MOBILE = accountSetPrivacyKeyDto31;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto32 = new AccountSetPrivacyKeyDto("ONLINE", 31, eok.ONLINE_EXTRAS_KEY);
        ONLINE = accountSetPrivacyKeyDto32;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto33 = new AccountSetPrivacyKeyDto("PAGE_ACCESS", 32, "page_access");
        PAGE_ACCESS = accountSetPrivacyKeyDto33;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto34 = new AccountSetPrivacyKeyDto("PHOTOS_SAVED", 33, "photos_saved");
        PHOTOS_SAVED = accountSetPrivacyKeyDto34;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto35 = new AccountSetPrivacyKeyDto("PHOTOS_TAGME", 34, "photos_tagme");
        PHOTOS_TAGME = accountSetPrivacyKeyDto35;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto36 = new AccountSetPrivacyKeyDto("PHOTOS_WITH", 35, "photos_with");
        PHOTOS_WITH = accountSetPrivacyKeyDto36;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto37 = new AccountSetPrivacyKeyDto("PLACES", 36, "places");
        PLACES = accountSetPrivacyKeyDto37;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto38 = new AccountSetPrivacyKeyDto("PROFILE", 37, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = accountSetPrivacyKeyDto38;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto39 = new AccountSetPrivacyKeyDto("QUESTIONS", 38, "questions");
        QUESTIONS = accountSetPrivacyKeyDto39;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto40 = new AccountSetPrivacyKeyDto("REPLIES_VIEW", 39, "replies_view");
        REPLIES_VIEW = accountSetPrivacyKeyDto40;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto41 = new AccountSetPrivacyKeyDto("SEARCH_BY_REG_PHONE", 40, "search_by_reg_phone");
        SEARCH_BY_REG_PHONE = accountSetPrivacyKeyDto41;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto42 = new AccountSetPrivacyKeyDto("STATUS_REPLIES", 41, "status_replies");
        STATUS_REPLIES = accountSetPrivacyKeyDto42;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto43 = new AccountSetPrivacyKeyDto("STORIES", 42, "stories");
        STORIES = accountSetPrivacyKeyDto43;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto44 = new AccountSetPrivacyKeyDto("STORIES_BIRTHDAY_WISHES", 43, "stories_birthday_wishes");
        STORIES_BIRTHDAY_WISHES = accountSetPrivacyKeyDto44;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto45 = new AccountSetPrivacyKeyDto("STORIES_QUESTIONS", 44, "stories_questions");
        STORIES_QUESTIONS = accountSetPrivacyKeyDto45;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto46 = new AccountSetPrivacyKeyDto("STORIES_REPLIES", 45, "stories_replies");
        STORIES_REPLIES = accountSetPrivacyKeyDto46;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto47 = new AccountSetPrivacyKeyDto("STORIES_EXCLUDE", 46, "stories_exclude");
        STORIES_EXCLUDE = accountSetPrivacyKeyDto47;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto48 = new AccountSetPrivacyKeyDto("VKRUN_STEPS", 47, "vkrun_steps");
        VKRUN_STEPS = accountSetPrivacyKeyDto48;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto49 = new AccountSetPrivacyKeyDto("WALL", 48, "wall");
        WALL = accountSetPrivacyKeyDto49;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto50 = new AccountSetPrivacyKeyDto("WALL_SEND", 49, "wall_send");
        WALL_SEND = accountSetPrivacyKeyDto50;
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto51 = new AccountSetPrivacyKeyDto("VIDEOS", 50, "videos");
        VIDEOS = accountSetPrivacyKeyDto51;
        AccountSetPrivacyKeyDto[] accountSetPrivacyKeyDtoArr = {accountSetPrivacyKeyDto, accountSetPrivacyKeyDto2, accountSetPrivacyKeyDto3, accountSetPrivacyKeyDto4, accountSetPrivacyKeyDto5, accountSetPrivacyKeyDto6, accountSetPrivacyKeyDto7, accountSetPrivacyKeyDto8, accountSetPrivacyKeyDto9, accountSetPrivacyKeyDto10, accountSetPrivacyKeyDto11, accountSetPrivacyKeyDto12, accountSetPrivacyKeyDto13, accountSetPrivacyKeyDto14, accountSetPrivacyKeyDto15, accountSetPrivacyKeyDto16, accountSetPrivacyKeyDto17, accountSetPrivacyKeyDto18, accountSetPrivacyKeyDto19, accountSetPrivacyKeyDto20, accountSetPrivacyKeyDto21, accountSetPrivacyKeyDto22, accountSetPrivacyKeyDto23, accountSetPrivacyKeyDto24, accountSetPrivacyKeyDto25, accountSetPrivacyKeyDto26, accountSetPrivacyKeyDto27, accountSetPrivacyKeyDto28, accountSetPrivacyKeyDto29, accountSetPrivacyKeyDto30, accountSetPrivacyKeyDto31, accountSetPrivacyKeyDto32, accountSetPrivacyKeyDto33, accountSetPrivacyKeyDto34, accountSetPrivacyKeyDto35, accountSetPrivacyKeyDto36, accountSetPrivacyKeyDto37, accountSetPrivacyKeyDto38, accountSetPrivacyKeyDto39, accountSetPrivacyKeyDto40, accountSetPrivacyKeyDto41, accountSetPrivacyKeyDto42, accountSetPrivacyKeyDto43, accountSetPrivacyKeyDto44, accountSetPrivacyKeyDto45, accountSetPrivacyKeyDto46, accountSetPrivacyKeyDto47, accountSetPrivacyKeyDto48, accountSetPrivacyKeyDto49, accountSetPrivacyKeyDto50, accountSetPrivacyKeyDto51};
        $VALUES = accountSetPrivacyKeyDtoArr;
        $ENTRIES = new asp(accountSetPrivacyKeyDtoArr);
        CREATOR = new a();
    }

    private AccountSetPrivacyKeyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountSetPrivacyKeyDto valueOf(String str) {
        return (AccountSetPrivacyKeyDto) Enum.valueOf(AccountSetPrivacyKeyDto.class, str);
    }

    public static AccountSetPrivacyKeyDto[] values() {
        return (AccountSetPrivacyKeyDto[]) $VALUES.clone();
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
