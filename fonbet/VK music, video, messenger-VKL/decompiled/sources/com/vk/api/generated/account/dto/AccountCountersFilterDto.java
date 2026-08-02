package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountCountersFilterDto.kt */
/* loaded from: classes14.dex */
public final class AccountCountersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountCountersFilterDto[] $VALUES;

    @pmi0("app_requests")
    public static final AccountCountersFilterDto APP_REQUESTS;

    @pmi0("business_notify")
    public static final AccountCountersFilterDto BUSINESS_NOTIFY;

    @pmi0("business_notify_all")
    public static final AccountCountersFilterDto BUSINESS_NOTIFY_ALL;

    @pmi0("calls")
    public static final AccountCountersFilterDto CALLS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final AccountCountersFilterDto CHANNELS;
    public static final Parcelable.Creator<AccountCountersFilterDto> CREATOR;

    @pmi0("events")
    public static final AccountCountersFilterDto EVENTS;

    @pmi0("faves")
    public static final AccountCountersFilterDto FAVES;

    @pmi0("friends")
    public static final AccountCountersFilterDto FRIENDS;

    @pmi0("friends_recommendations")
    public static final AccountCountersFilterDto FRIENDS_RECOMMENDATIONS;

    @pmi0("friends_unread")
    public static final AccountCountersFilterDto FRIENDS_UNREAD;

    @pmi0("friends_unread_badge")
    public static final AccountCountersFilterDto FRIENDS_UNREAD_BADGE;

    @pmi0("games")
    public static final AccountCountersFilterDto GAMES;

    @pmi0("gifts")
    public static final AccountCountersFilterDto GIFTS;

    @pmi0("groups")
    public static final AccountCountersFilterDto GROUPS;

    @pmi0("icon_badge")
    public static final AccountCountersFilterDto ICON_BADGE;

    @pmi0("market_orders")
    public static final AccountCountersFilterDto MARKET_ORDERS;

    @pmi0("memories")
    public static final AccountCountersFilterDto MEMORIES;

    @pmi0("menu_clips_badge")
    public static final AccountCountersFilterDto MENU_CLIPS_BADGE;

    @pmi0("menu_discover_badge")
    public static final AccountCountersFilterDto MENU_DISCOVER_BADGE;

    @pmi0("menu_new_clips_badge")
    public static final AccountCountersFilterDto MENU_NEW_CLIPS_BADGE;

    @pmi0("menu_notifications_badge")
    public static final AccountCountersFilterDto MENU_NOTIFICATIONS_BADGE;

    @pmi0("menu_superapp_friends_badge")
    public static final AccountCountersFilterDto MENU_SUPERAPP_FRIENDS_BADGE;

    @pmi0("messages")
    public static final AccountCountersFilterDto MESSAGES;

    @pmi0("messages_archive")
    public static final AccountCountersFilterDto MESSAGES_ARCHIVE;

    @pmi0("messages_archive_mentions_count")
    public static final AccountCountersFilterDto MESSAGES_ARCHIVE_MENTIONS_COUNT;

    @pmi0("messages_archive_unread")
    public static final AccountCountersFilterDto MESSAGES_ARCHIVE_UNREAD;

    @pmi0("messages_archive_unread_unmuted")
    public static final AccountCountersFilterDto MESSAGES_ARCHIVE_UNREAD_UNMUTED;

    @pmi0("messages_folders")
    public static final AccountCountersFilterDto MESSAGES_FOLDERS;

    @pmi0("messages_unread_unmuted")
    public static final AccountCountersFilterDto MESSAGES_UNREAD_UNMUTED;

    @pmi0("message_requests")
    public static final AccountCountersFilterDto MESSAGE_REQUESTS;

    @pmi0("notes")
    public static final AccountCountersFilterDto NOTES;

    @pmi0(C4504q2.x)
    public static final AccountCountersFilterDto NOTIFICATIONS;

    @pmi0("notifications_with_pushes")
    public static final AccountCountersFilterDto NOTIFICATIONS_WITH_PUSHES;

    @pmi0("photos")
    public static final AccountCountersFilterDto PHOTOS;

    @pmi0("sdk")
    public static final AccountCountersFilterDto SDK;

    @pmi0("support")
    public static final AccountCountersFilterDto SUPPORT;

    @pmi0("vkcom_email_unreads")
    public static final AccountCountersFilterDto VKCOM_EMAIL_UNREADS;

    @pmi0("vkpay")
    public static final AccountCountersFilterDto VKPAY;
    private final String value;

    /* compiled from: AccountCountersFilterDto.kt */
    public static final class a implements Parcelable.Creator<AccountCountersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountCountersFilterDto createFromParcel(Parcel parcel) {
            return AccountCountersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountCountersFilterDto[] newArray(int i) {
            return new AccountCountersFilterDto[i];
        }
    }

    static {
        AccountCountersFilterDto accountCountersFilterDto = new AccountCountersFilterDto("APP_REQUESTS", 0, "app_requests");
        APP_REQUESTS = accountCountersFilterDto;
        AccountCountersFilterDto accountCountersFilterDto2 = new AccountCountersFilterDto("BUSINESS_NOTIFY", 1, "business_notify");
        BUSINESS_NOTIFY = accountCountersFilterDto2;
        AccountCountersFilterDto accountCountersFilterDto3 = new AccountCountersFilterDto("BUSINESS_NOTIFY_ALL", 2, "business_notify_all");
        BUSINESS_NOTIFY_ALL = accountCountersFilterDto3;
        AccountCountersFilterDto accountCountersFilterDto4 = new AccountCountersFilterDto("EVENTS", 3, "events");
        EVENTS = accountCountersFilterDto4;
        AccountCountersFilterDto accountCountersFilterDto5 = new AccountCountersFilterDto(Privacy.FRIENDS, 4, "friends");
        FRIENDS = accountCountersFilterDto5;
        AccountCountersFilterDto accountCountersFilterDto6 = new AccountCountersFilterDto("FRIENDS_RECOMMENDATIONS", 5, "friends_recommendations");
        FRIENDS_RECOMMENDATIONS = accountCountersFilterDto6;
        AccountCountersFilterDto accountCountersFilterDto7 = new AccountCountersFilterDto("FRIENDS_UNREAD", 6, "friends_unread");
        FRIENDS_UNREAD = accountCountersFilterDto7;
        AccountCountersFilterDto accountCountersFilterDto8 = new AccountCountersFilterDto("FRIENDS_UNREAD_BADGE", 7, "friends_unread_badge");
        FRIENDS_UNREAD_BADGE = accountCountersFilterDto8;
        AccountCountersFilterDto accountCountersFilterDto9 = new AccountCountersFilterDto("GAMES", 8, "games");
        GAMES = accountCountersFilterDto9;
        AccountCountersFilterDto accountCountersFilterDto10 = new AccountCountersFilterDto("GIFTS", 9, "gifts");
        GIFTS = accountCountersFilterDto10;
        AccountCountersFilterDto accountCountersFilterDto11 = new AccountCountersFilterDto("GROUPS", 10, "groups");
        GROUPS = accountCountersFilterDto11;
        AccountCountersFilterDto accountCountersFilterDto12 = new AccountCountersFilterDto("ICON_BADGE", 11, "icon_badge");
        ICON_BADGE = accountCountersFilterDto12;
        AccountCountersFilterDto accountCountersFilterDto13 = new AccountCountersFilterDto("MENU_NOTIFICATIONS_BADGE", 12, "menu_notifications_badge");
        MENU_NOTIFICATIONS_BADGE = accountCountersFilterDto13;
        AccountCountersFilterDto accountCountersFilterDto14 = new AccountCountersFilterDto("NOTIFICATIONS_WITH_PUSHES", 13, "notifications_with_pushes");
        NOTIFICATIONS_WITH_PUSHES = accountCountersFilterDto14;
        AccountCountersFilterDto accountCountersFilterDto15 = new AccountCountersFilterDto("MENU_DISCOVER_BADGE", 14, "menu_discover_badge");
        MENU_DISCOVER_BADGE = accountCountersFilterDto15;
        AccountCountersFilterDto accountCountersFilterDto16 = new AccountCountersFilterDto("MESSAGES", 15, "messages");
        MESSAGES = accountCountersFilterDto16;
        AccountCountersFilterDto accountCountersFilterDto17 = new AccountCountersFilterDto("MESSAGE_REQUESTS", 16, "message_requests");
        MESSAGE_REQUESTS = accountCountersFilterDto17;
        AccountCountersFilterDto accountCountersFilterDto18 = new AccountCountersFilterDto("MESSAGES_ARCHIVE", 17, "messages_archive");
        MESSAGES_ARCHIVE = accountCountersFilterDto18;
        AccountCountersFilterDto accountCountersFilterDto19 = new AccountCountersFilterDto("MESSAGES_ARCHIVE_UNREAD", 18, "messages_archive_unread");
        MESSAGES_ARCHIVE_UNREAD = accountCountersFilterDto19;
        AccountCountersFilterDto accountCountersFilterDto20 = new AccountCountersFilterDto("MESSAGES_ARCHIVE_UNREAD_UNMUTED", 19, "messages_archive_unread_unmuted");
        MESSAGES_ARCHIVE_UNREAD_UNMUTED = accountCountersFilterDto20;
        AccountCountersFilterDto accountCountersFilterDto21 = new AccountCountersFilterDto("MESSAGES_ARCHIVE_MENTIONS_COUNT", 20, "messages_archive_mentions_count");
        MESSAGES_ARCHIVE_MENTIONS_COUNT = accountCountersFilterDto21;
        AccountCountersFilterDto accountCountersFilterDto22 = new AccountCountersFilterDto("NOTES", 21, "notes");
        NOTES = accountCountersFilterDto22;
        AccountCountersFilterDto accountCountersFilterDto23 = new AccountCountersFilterDto("NOTIFICATIONS", 22, C4504q2.x);
        NOTIFICATIONS = accountCountersFilterDto23;
        AccountCountersFilterDto accountCountersFilterDto24 = new AccountCountersFilterDto("PHOTOS", 23, "photos");
        PHOTOS = accountCountersFilterDto24;
        AccountCountersFilterDto accountCountersFilterDto25 = new AccountCountersFilterDto("SDK", 24, "sdk");
        SDK = accountCountersFilterDto25;
        AccountCountersFilterDto accountCountersFilterDto26 = new AccountCountersFilterDto("SUPPORT", 25, "support");
        SUPPORT = accountCountersFilterDto26;
        AccountCountersFilterDto accountCountersFilterDto27 = new AccountCountersFilterDto("VKPAY", 26, "vkpay");
        VKPAY = accountCountersFilterDto27;
        AccountCountersFilterDto accountCountersFilterDto28 = new AccountCountersFilterDto("CALLS", 27, "calls");
        CALLS = accountCountersFilterDto28;
        AccountCountersFilterDto accountCountersFilterDto29 = new AccountCountersFilterDto("MESSAGES_FOLDERS", 28, "messages_folders");
        MESSAGES_FOLDERS = accountCountersFilterDto29;
        AccountCountersFilterDto accountCountersFilterDto30 = new AccountCountersFilterDto("FAVES", 29, "faves");
        FAVES = accountCountersFilterDto30;
        AccountCountersFilterDto accountCountersFilterDto31 = new AccountCountersFilterDto("MEMORIES", 30, "memories");
        MEMORIES = accountCountersFilterDto31;
        AccountCountersFilterDto accountCountersFilterDto32 = new AccountCountersFilterDto("MENU_CLIPS_BADGE", 31, "menu_clips_badge");
        MENU_CLIPS_BADGE = accountCountersFilterDto32;
        AccountCountersFilterDto accountCountersFilterDto33 = new AccountCountersFilterDto("MENU_SUPERAPP_FRIENDS_BADGE", 32, "menu_superapp_friends_badge");
        MENU_SUPERAPP_FRIENDS_BADGE = accountCountersFilterDto33;
        AccountCountersFilterDto accountCountersFilterDto34 = new AccountCountersFilterDto("MARKET_ORDERS", 33, "market_orders");
        MARKET_ORDERS = accountCountersFilterDto34;
        AccountCountersFilterDto accountCountersFilterDto35 = new AccountCountersFilterDto("MENU_NEW_CLIPS_BADGE", 34, "menu_new_clips_badge");
        MENU_NEW_CLIPS_BADGE = accountCountersFilterDto35;
        AccountCountersFilterDto accountCountersFilterDto36 = new AccountCountersFilterDto("MESSAGES_UNREAD_UNMUTED", 35, "messages_unread_unmuted");
        MESSAGES_UNREAD_UNMUTED = accountCountersFilterDto36;
        AccountCountersFilterDto accountCountersFilterDto37 = new AccountCountersFilterDto("VKCOM_EMAIL_UNREADS", 36, "vkcom_email_unreads");
        VKCOM_EMAIL_UNREADS = accountCountersFilterDto37;
        AccountCountersFilterDto accountCountersFilterDto38 = new AccountCountersFilterDto("CHANNELS", 37, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = accountCountersFilterDto38;
        AccountCountersFilterDto[] accountCountersFilterDtoArr = {accountCountersFilterDto, accountCountersFilterDto2, accountCountersFilterDto3, accountCountersFilterDto4, accountCountersFilterDto5, accountCountersFilterDto6, accountCountersFilterDto7, accountCountersFilterDto8, accountCountersFilterDto9, accountCountersFilterDto10, accountCountersFilterDto11, accountCountersFilterDto12, accountCountersFilterDto13, accountCountersFilterDto14, accountCountersFilterDto15, accountCountersFilterDto16, accountCountersFilterDto17, accountCountersFilterDto18, accountCountersFilterDto19, accountCountersFilterDto20, accountCountersFilterDto21, accountCountersFilterDto22, accountCountersFilterDto23, accountCountersFilterDto24, accountCountersFilterDto25, accountCountersFilterDto26, accountCountersFilterDto27, accountCountersFilterDto28, accountCountersFilterDto29, accountCountersFilterDto30, accountCountersFilterDto31, accountCountersFilterDto32, accountCountersFilterDto33, accountCountersFilterDto34, accountCountersFilterDto35, accountCountersFilterDto36, accountCountersFilterDto37, accountCountersFilterDto38};
        $VALUES = accountCountersFilterDtoArr;
        $ENTRIES = new asp(accountCountersFilterDtoArr);
        CREATOR = new a();
    }

    private AccountCountersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountCountersFilterDto valueOf(String str) {
        return (AccountCountersFilterDto) Enum.valueOf(AccountCountersFilterDto.class, str);
    }

    public static AccountCountersFilterDto[] values() {
        return (AccountCountersFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
