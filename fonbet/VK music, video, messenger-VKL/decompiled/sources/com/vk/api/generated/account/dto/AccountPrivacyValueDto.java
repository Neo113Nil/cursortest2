package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPrivacyValueDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacyValueDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPrivacyValueDto[] $VALUES;

    @pmi0("all")
    public static final AccountPrivacyValueDto ALL;

    @pmi0("all_except_of_search_engines")
    public static final AccountPrivacyValueDto ALL_EXCEPT_OF_SEARCH_ENGINES;

    @pmi0("all_groups")
    public static final AccountPrivacyValueDto ALL_GROUPS;

    @pmi0("any")
    public static final AccountPrivacyValueDto ANY;

    @pmi0("bday_visibility_day_month")
    public static final AccountPrivacyValueDto BDAY_VISIBILITY_DAY_MONTH;

    @pmi0("best_friends")
    public static final AccountPrivacyValueDto BEST_FRIENDS;

    @pmi0("blur")
    public static final AccountPrivacyValueDto BLUR;

    @pmi0("community_all")
    public static final AccountPrivacyValueDto COMMUNITY_ALL;

    @pmi0("community_none")
    public static final AccountPrivacyValueDto COMMUNITY_NONE;

    @pmi0("community_subscriptions")
    public static final AccountPrivacyValueDto COMMUNITY_SUBSCRIPTIONS;
    public static final Parcelable.Creator<AccountPrivacyValueDto> CREATOR;

    @pmi0("friends")
    public static final AccountPrivacyValueDto FRIENDS;

    @pmi0("friends_and_contacts")
    public static final AccountPrivacyValueDto FRIENDS_AND_CONTACTS;

    @pmi0("friends_of_friends")
    public static final AccountPrivacyValueDto FRIENDS_OF_FRIENDS;

    @pmi0("friends_of_friends_only")
    public static final AccountPrivacyValueDto FRIENDS_OF_FRIENDS_ONLY;

    @pmi0("hidden_friends_only")
    public static final AccountPrivacyValueDto HIDDEN_FRIENDS_ONLY;

    @pmi0("letters")
    public static final AccountPrivacyValueDto LETTERS;

    @pmi0("list28")
    public static final AccountPrivacyValueDto LIST28;

    @pmi0("nobody")
    public static final AccountPrivacyValueDto NOBODY;

    @pmi0("none")
    public static final AccountPrivacyValueDto NONE;

    @pmi0("no_groups")
    public static final AccountPrivacyValueDto NO_GROUPS;

    @pmi0("only_me")
    public static final AccountPrivacyValueDto ONLY_ME;

    @pmi0("original")
    public static final AccountPrivacyValueDto ORIGINAL;

    @pmi0("see_all_friends")
    public static final AccountPrivacyValueDto SEE_ALL_FRIENDS;

    @pmi0("some")
    public static final AccountPrivacyValueDto SOME;

    @pmi0("some_groups")
    public static final AccountPrivacyValueDto SOME_GROUPS;

    @pmi0("updates_audio")
    public static final AccountPrivacyValueDto UPDATES_AUDIO;

    @pmi0("updates_events")
    public static final AccountPrivacyValueDto UPDATES_EVENTS;

    @pmi0("updates_friends")
    public static final AccountPrivacyValueDto UPDATES_FRIENDS;

    @pmi0("updates_groups")
    public static final AccountPrivacyValueDto UPDATES_GROUPS;

    @pmi0("updates_photos")
    public static final AccountPrivacyValueDto UPDATES_PHOTOS;

    @pmi0("updates_profile")
    public static final AccountPrivacyValueDto UPDATES_PROFILE;

    @pmi0("updates_tags")
    public static final AccountPrivacyValueDto UPDATES_TAGS;

    @pmi0("updates_topics")
    public static final AccountPrivacyValueDto UPDATES_TOPICS;

    @pmi0("updates_video")
    public static final AccountPrivacyValueDto UPDATES_VIDEO;

    @pmi0("updates_wall_likes")
    public static final AccountPrivacyValueDto UPDATES_WALL_LIKES;

    @pmi0("updates_wall_mentions")
    public static final AccountPrivacyValueDto UPDATES_WALL_MENTIONS;

    @pmi0("updates_wall_replies")
    public static final AccountPrivacyValueDto UPDATES_WALL_REPLIES;

    @pmi0("vk_users_only")
    public static final AccountPrivacyValueDto VK_USERS_ONLY;
    private final String value;

    /* compiled from: AccountPrivacyValueDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacyValueDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyValueDto createFromParcel(Parcel parcel) {
            return AccountPrivacyValueDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyValueDto[] newArray(int i) {
            return new AccountPrivacyValueDto[i];
        }
    }

    static {
        AccountPrivacyValueDto accountPrivacyValueDto = new AccountPrivacyValueDto("ALL", 0, "all");
        ALL = accountPrivacyValueDto;
        AccountPrivacyValueDto accountPrivacyValueDto2 = new AccountPrivacyValueDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = accountPrivacyValueDto2;
        AccountPrivacyValueDto accountPrivacyValueDto3 = new AccountPrivacyValueDto("FRIENDS_OF_FRIENDS", 2, "friends_of_friends");
        FRIENDS_OF_FRIENDS = accountPrivacyValueDto3;
        AccountPrivacyValueDto accountPrivacyValueDto4 = new AccountPrivacyValueDto("FRIENDS_OF_FRIENDS_ONLY", 3, "friends_of_friends_only");
        FRIENDS_OF_FRIENDS_ONLY = accountPrivacyValueDto4;
        AccountPrivacyValueDto accountPrivacyValueDto5 = new AccountPrivacyValueDto("BEST_FRIENDS", 4, "best_friends");
        BEST_FRIENDS = accountPrivacyValueDto5;
        AccountPrivacyValueDto accountPrivacyValueDto6 = new AccountPrivacyValueDto("ONLY_ME", 5, "only_me");
        ONLY_ME = accountPrivacyValueDto6;
        AccountPrivacyValueDto accountPrivacyValueDto7 = new AccountPrivacyValueDto("SOME", 6, "some");
        SOME = accountPrivacyValueDto7;
        AccountPrivacyValueDto accountPrivacyValueDto8 = new AccountPrivacyValueDto("SEE_ALL_FRIENDS", 7, "see_all_friends");
        SEE_ALL_FRIENDS = accountPrivacyValueDto8;
        AccountPrivacyValueDto accountPrivacyValueDto9 = new AccountPrivacyValueDto("NOBODY", 8, "nobody");
        NOBODY = accountPrivacyValueDto9;
        AccountPrivacyValueDto accountPrivacyValueDto10 = new AccountPrivacyValueDto("HIDDEN_FRIENDS_ONLY", 9, "hidden_friends_only");
        HIDDEN_FRIENDS_ONLY = accountPrivacyValueDto10;
        AccountPrivacyValueDto accountPrivacyValueDto11 = new AccountPrivacyValueDto("FRIENDS_AND_CONTACTS", 10, "friends_and_contacts");
        FRIENDS_AND_CONTACTS = accountPrivacyValueDto11;
        AccountPrivacyValueDto accountPrivacyValueDto12 = new AccountPrivacyValueDto("ALL_EXCEPT_OF_SEARCH_ENGINES", 11, "all_except_of_search_engines");
        ALL_EXCEPT_OF_SEARCH_ENGINES = accountPrivacyValueDto12;
        AccountPrivacyValueDto accountPrivacyValueDto13 = new AccountPrivacyValueDto("VK_USERS_ONLY", 12, "vk_users_only");
        VK_USERS_ONLY = accountPrivacyValueDto13;
        AccountPrivacyValueDto accountPrivacyValueDto14 = new AccountPrivacyValueDto("ANY", 13, "any");
        ANY = accountPrivacyValueDto14;
        AccountPrivacyValueDto accountPrivacyValueDto15 = new AccountPrivacyValueDto("NONE", 14, "none");
        NONE = accountPrivacyValueDto15;
        AccountPrivacyValueDto accountPrivacyValueDto16 = new AccountPrivacyValueDto("BLUR", 15, "blur");
        BLUR = accountPrivacyValueDto16;
        AccountPrivacyValueDto accountPrivacyValueDto17 = new AccountPrivacyValueDto("LETTERS", 16, "letters");
        LETTERS = accountPrivacyValueDto17;
        AccountPrivacyValueDto accountPrivacyValueDto18 = new AccountPrivacyValueDto("ORIGINAL", 17, "original");
        ORIGINAL = accountPrivacyValueDto18;
        AccountPrivacyValueDto accountPrivacyValueDto19 = new AccountPrivacyValueDto("COMMUNITY_NONE", 18, "community_none");
        COMMUNITY_NONE = accountPrivacyValueDto19;
        AccountPrivacyValueDto accountPrivacyValueDto20 = new AccountPrivacyValueDto("COMMUNITY_SUBSCRIPTIONS", 19, "community_subscriptions");
        COMMUNITY_SUBSCRIPTIONS = accountPrivacyValueDto20;
        AccountPrivacyValueDto accountPrivacyValueDto21 = new AccountPrivacyValueDto("COMMUNITY_ALL", 20, "community_all");
        COMMUNITY_ALL = accountPrivacyValueDto21;
        AccountPrivacyValueDto accountPrivacyValueDto22 = new AccountPrivacyValueDto("BDAY_VISIBILITY_DAY_MONTH", 21, "bday_visibility_day_month");
        BDAY_VISIBILITY_DAY_MONTH = accountPrivacyValueDto22;
        AccountPrivacyValueDto accountPrivacyValueDto23 = new AccountPrivacyValueDto("LIST28", 22, "list28");
        LIST28 = accountPrivacyValueDto23;
        AccountPrivacyValueDto accountPrivacyValueDto24 = new AccountPrivacyValueDto("ALL_GROUPS", 23, "all_groups");
        ALL_GROUPS = accountPrivacyValueDto24;
        AccountPrivacyValueDto accountPrivacyValueDto25 = new AccountPrivacyValueDto("SOME_GROUPS", 24, "some_groups");
        SOME_GROUPS = accountPrivacyValueDto25;
        AccountPrivacyValueDto accountPrivacyValueDto26 = new AccountPrivacyValueDto("NO_GROUPS", 25, "no_groups");
        NO_GROUPS = accountPrivacyValueDto26;
        AccountPrivacyValueDto accountPrivacyValueDto27 = new AccountPrivacyValueDto("UPDATES_PHOTOS", 26, "updates_photos");
        UPDATES_PHOTOS = accountPrivacyValueDto27;
        AccountPrivacyValueDto accountPrivacyValueDto28 = new AccountPrivacyValueDto("UPDATES_VIDEO", 27, "updates_video");
        UPDATES_VIDEO = accountPrivacyValueDto28;
        AccountPrivacyValueDto accountPrivacyValueDto29 = new AccountPrivacyValueDto("UPDATES_TOPICS", 28, "updates_topics");
        UPDATES_TOPICS = accountPrivacyValueDto29;
        AccountPrivacyValueDto accountPrivacyValueDto30 = new AccountPrivacyValueDto("UPDATES_FRIENDS", 29, "updates_friends");
        UPDATES_FRIENDS = accountPrivacyValueDto30;
        AccountPrivacyValueDto accountPrivacyValueDto31 = new AccountPrivacyValueDto("UPDATES_GROUPS", 30, "updates_groups");
        UPDATES_GROUPS = accountPrivacyValueDto31;
        AccountPrivacyValueDto accountPrivacyValueDto32 = new AccountPrivacyValueDto("UPDATES_EVENTS", 31, "updates_events");
        UPDATES_EVENTS = accountPrivacyValueDto32;
        AccountPrivacyValueDto accountPrivacyValueDto33 = new AccountPrivacyValueDto("UPDATES_TAGS", 32, "updates_tags");
        UPDATES_TAGS = accountPrivacyValueDto33;
        AccountPrivacyValueDto accountPrivacyValueDto34 = new AccountPrivacyValueDto("UPDATES_PROFILE", 33, "updates_profile");
        UPDATES_PROFILE = accountPrivacyValueDto34;
        AccountPrivacyValueDto accountPrivacyValueDto35 = new AccountPrivacyValueDto("UPDATES_AUDIO", 34, "updates_audio");
        UPDATES_AUDIO = accountPrivacyValueDto35;
        AccountPrivacyValueDto accountPrivacyValueDto36 = new AccountPrivacyValueDto("UPDATES_WALL_REPLIES", 35, "updates_wall_replies");
        UPDATES_WALL_REPLIES = accountPrivacyValueDto36;
        AccountPrivacyValueDto accountPrivacyValueDto37 = new AccountPrivacyValueDto("UPDATES_WALL_LIKES", 36, "updates_wall_likes");
        UPDATES_WALL_LIKES = accountPrivacyValueDto37;
        AccountPrivacyValueDto accountPrivacyValueDto38 = new AccountPrivacyValueDto("UPDATES_WALL_MENTIONS", 37, "updates_wall_mentions");
        UPDATES_WALL_MENTIONS = accountPrivacyValueDto38;
        AccountPrivacyValueDto[] accountPrivacyValueDtoArr = {accountPrivacyValueDto, accountPrivacyValueDto2, accountPrivacyValueDto3, accountPrivacyValueDto4, accountPrivacyValueDto5, accountPrivacyValueDto6, accountPrivacyValueDto7, accountPrivacyValueDto8, accountPrivacyValueDto9, accountPrivacyValueDto10, accountPrivacyValueDto11, accountPrivacyValueDto12, accountPrivacyValueDto13, accountPrivacyValueDto14, accountPrivacyValueDto15, accountPrivacyValueDto16, accountPrivacyValueDto17, accountPrivacyValueDto18, accountPrivacyValueDto19, accountPrivacyValueDto20, accountPrivacyValueDto21, accountPrivacyValueDto22, accountPrivacyValueDto23, accountPrivacyValueDto24, accountPrivacyValueDto25, accountPrivacyValueDto26, accountPrivacyValueDto27, accountPrivacyValueDto28, accountPrivacyValueDto29, accountPrivacyValueDto30, accountPrivacyValueDto31, accountPrivacyValueDto32, accountPrivacyValueDto33, accountPrivacyValueDto34, accountPrivacyValueDto35, accountPrivacyValueDto36, accountPrivacyValueDto37, accountPrivacyValueDto38};
        $VALUES = accountPrivacyValueDtoArr;
        $ENTRIES = new asp(accountPrivacyValueDtoArr);
        CREATOR = new a();
    }

    private AccountPrivacyValueDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPrivacyValueDto valueOf(String str) {
        return (AccountPrivacyValueDto) Enum.valueOf(AccountPrivacyValueDto.class, str);
    }

    public static AccountPrivacyValueDto[] values() {
        return (AccountPrivacyValueDto[]) $VALUES.clone();
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
