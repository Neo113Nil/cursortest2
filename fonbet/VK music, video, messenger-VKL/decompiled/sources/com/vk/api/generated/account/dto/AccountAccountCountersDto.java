package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountAccountCountersDto.kt */
/* loaded from: classes14.dex */
public final class AccountAccountCountersDto implements Parcelable {
    public static final Parcelable.Creator<AccountAccountCountersDto> CREATOR = new a();

    @pmi0("app_requests")
    private final Integer appRequests;

    @pmi0("business_notify")
    private final Integer businessNotify;

    @pmi0("business_notify_all")
    private final Integer businessNotifyAll;

    @pmi0("calls")
    private final Integer calls;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final AccountChannelsCounterDto channels;

    @pmi0("events")
    private final Integer events;

    @pmi0("faves")
    private final Integer faves;

    @pmi0("friends")
    private final Integer friends;

    @pmi0("friends_recommendations")
    private final Integer friendsRecommendations;

    @pmi0("friends_unread")
    private final Integer friendsUnread;

    @pmi0("friends_unread_badge")
    private final Integer friendsUnreadBadge;

    @pmi0("games")
    private final Integer games;

    @pmi0("gifts")
    private final Integer gifts;

    @pmi0("groups")
    private final Integer groups;

    @pmi0("icon_badge")
    private final Integer iconBadge;

    @pmi0("market_orders")
    private final Integer marketOrders;

    @pmi0("memories")
    private final Integer memories;

    @pmi0("menu_clips_badge")
    private final Integer menuClipsBadge;

    @pmi0("menu_discover_badge")
    private final Integer menuDiscoverBadge;

    @pmi0("menu_new_clips_badge")
    private final Integer menuNewClipsBadge;

    @pmi0("menu_notifications_badge")
    private final Integer menuNotificationsBadge;

    @pmi0("menu_superapp_friends_badge")
    private final Integer menuSuperappFriendsBadge;

    @pmi0("message_requests")
    private final Integer messageRequests;

    @pmi0("messages")
    private final Integer messages;

    @pmi0("messages_archive")
    private final Integer messagesArchive;

    @pmi0("messages_archive_mentions_count")
    private final Integer messagesArchiveMentionsCount;

    @pmi0("messages_archive_unread")
    private final Integer messagesArchiveUnread;

    @pmi0("messages_archive_unread_unmuted")
    private final Integer messagesArchiveUnreadUnmuted;

    @pmi0("messages_folders")
    private final List<AccountMessagesFoldersCounterItemDto> messagesFolders;

    @pmi0("messages_unread_unmuted")
    private final Integer messagesUnreadUnmuted;

    @pmi0("notes")
    private final Integer notes;

    @pmi0(C4504q2.x)
    private final Integer notifications;

    @pmi0("notifications_clips")
    private final Integer notificationsClips;

    @pmi0("notifications_music")
    private final Integer notificationsMusic;

    @pmi0("notifications_video")
    private final Integer notificationsVideo;

    @pmi0("notifications_video_tv")
    private final Integer notificationsVideoTv;

    @pmi0("notifications_video_web")
    private final Integer notificationsVideoWeb;

    @pmi0("notifications_with_pushes")
    private final Integer notificationsWithPushes;

    @pmi0("photos")
    private final Integer photos;

    /* renamed from: sdk, reason: collision with root package name */
    @pmi0("sdk")
    private final Integer f59sdk;

    @pmi0("support")
    private final Integer support;

    @pmi0("vkcom_email_unreads")
    private final Integer vkcomEmailUnreads;

    @pmi0("vkpay")
    private final Integer vkpay;

    /* compiled from: AccountAccountCountersDto.kt */
    public static final class a implements Parcelable.Creator<AccountAccountCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountAccountCountersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf36 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf37 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf38 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf39 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf40 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf41 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AccountMessagesFoldersCounterItemDto.CREATOR, parcel, arrayList2, i, 1);
                    readInt = readInt;
                    valueOf = valueOf;
                }
                arrayList = arrayList2;
            }
            return new AccountAccountCountersDto(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, arrayList, parcel.readInt() == 0 ? null : AccountChannelsCounterDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountAccountCountersDto[] newArray(int i) {
            return new AccountAccountCountersDto[i];
        }
    }

    public AccountAccountCountersDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAccountCountersDto)) {
            return false;
        }
        AccountAccountCountersDto accountAccountCountersDto = (AccountAccountCountersDto) obj;
        return epx.f(this.appRequests, accountAccountCountersDto.appRequests) && epx.f(this.businessNotify, accountAccountCountersDto.businessNotify) && epx.f(this.businessNotifyAll, accountAccountCountersDto.businessNotifyAll) && epx.f(this.events, accountAccountCountersDto.events) && epx.f(this.faves, accountAccountCountersDto.faves) && epx.f(this.friends, accountAccountCountersDto.friends) && epx.f(this.friendsRecommendations, accountAccountCountersDto.friendsRecommendations) && epx.f(this.friendsUnread, accountAccountCountersDto.friendsUnread) && epx.f(this.friendsUnreadBadge, accountAccountCountersDto.friendsUnreadBadge) && epx.f(this.games, accountAccountCountersDto.games) && epx.f(this.gifts, accountAccountCountersDto.gifts) && epx.f(this.groups, accountAccountCountersDto.groups) && epx.f(this.iconBadge, accountAccountCountersDto.iconBadge) && epx.f(this.menuNotificationsBadge, accountAccountCountersDto.menuNotificationsBadge) && epx.f(this.notificationsWithPushes, accountAccountCountersDto.notificationsWithPushes) && epx.f(this.menuDiscoverBadge, accountAccountCountersDto.menuDiscoverBadge) && epx.f(this.menuClipsBadge, accountAccountCountersDto.menuClipsBadge) && epx.f(this.menuSuperappFriendsBadge, accountAccountCountersDto.menuSuperappFriendsBadge) && epx.f(this.menuNewClipsBadge, accountAccountCountersDto.menuNewClipsBadge) && epx.f(this.messages, accountAccountCountersDto.messages) && epx.f(this.memories, accountAccountCountersDto.memories) && epx.f(this.messageRequests, accountAccountCountersDto.messageRequests) && epx.f(this.messagesArchive, accountAccountCountersDto.messagesArchive) && epx.f(this.messagesArchiveUnread, accountAccountCountersDto.messagesArchiveUnread) && epx.f(this.messagesArchiveUnreadUnmuted, accountAccountCountersDto.messagesArchiveUnreadUnmuted) && epx.f(this.messagesArchiveMentionsCount, accountAccountCountersDto.messagesArchiveMentionsCount) && epx.f(this.notes, accountAccountCountersDto.notes) && epx.f(this.notifications, accountAccountCountersDto.notifications) && epx.f(this.notificationsClips, accountAccountCountersDto.notificationsClips) && epx.f(this.notificationsMusic, accountAccountCountersDto.notificationsMusic) && epx.f(this.notificationsVideo, accountAccountCountersDto.notificationsVideo) && epx.f(this.notificationsVideoWeb, accountAccountCountersDto.notificationsVideoWeb) && epx.f(this.notificationsVideoTv, accountAccountCountersDto.notificationsVideoTv) && epx.f(this.photos, accountAccountCountersDto.photos) && epx.f(this.f59sdk, accountAccountCountersDto.f59sdk) && epx.f(this.support, accountAccountCountersDto.support) && epx.f(this.vkpay, accountAccountCountersDto.vkpay) && epx.f(this.marketOrders, accountAccountCountersDto.marketOrders) && epx.f(this.messagesUnreadUnmuted, accountAccountCountersDto.messagesUnreadUnmuted) && epx.f(this.calls, accountAccountCountersDto.calls) && epx.f(this.vkcomEmailUnreads, accountAccountCountersDto.vkcomEmailUnreads) && epx.f(this.messagesFolders, accountAccountCountersDto.messagesFolders) && epx.f(this.channels, accountAccountCountersDto.channels);
    }

    public final int hashCode() {
        Integer num = this.appRequests;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.businessNotify;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.businessNotifyAll;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.events;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.faves;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.friends;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.friendsRecommendations;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.friendsUnread;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.friendsUnreadBadge;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.games;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.gifts;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.groups;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.iconBadge;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.menuNotificationsBadge;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.notificationsWithPushes;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.menuDiscoverBadge;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.menuClipsBadge;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.menuSuperappFriendsBadge;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.menuNewClipsBadge;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.messages;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.memories;
        int hashCode21 = (hashCode20 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.messageRequests;
        int hashCode22 = (hashCode21 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.messagesArchive;
        int hashCode23 = (hashCode22 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.messagesArchiveUnread;
        int hashCode24 = (hashCode23 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.messagesArchiveUnreadUnmuted;
        int hashCode25 = (hashCode24 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.messagesArchiveMentionsCount;
        int hashCode26 = (hashCode25 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.notes;
        int hashCode27 = (hashCode26 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.notifications;
        int hashCode28 = (hashCode27 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.notificationsClips;
        int hashCode29 = (hashCode28 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.notificationsMusic;
        int hashCode30 = (hashCode29 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.notificationsVideo;
        int hashCode31 = (hashCode30 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.notificationsVideoWeb;
        int hashCode32 = (hashCode31 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.notificationsVideoTv;
        int hashCode33 = (hashCode32 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.photos;
        int hashCode34 = (hashCode33 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.f59sdk;
        int hashCode35 = (hashCode34 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.support;
        int hashCode36 = (hashCode35 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.vkpay;
        int hashCode37 = (hashCode36 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Integer num38 = this.marketOrders;
        int hashCode38 = (hashCode37 + (num38 == null ? 0 : num38.hashCode())) * 31;
        Integer num39 = this.messagesUnreadUnmuted;
        int hashCode39 = (hashCode38 + (num39 == null ? 0 : num39.hashCode())) * 31;
        Integer num40 = this.calls;
        int hashCode40 = (hashCode39 + (num40 == null ? 0 : num40.hashCode())) * 31;
        Integer num41 = this.vkcomEmailUnreads;
        int hashCode41 = (hashCode40 + (num41 == null ? 0 : num41.hashCode())) * 31;
        List<AccountMessagesFoldersCounterItemDto> list = this.messagesFolders;
        int hashCode42 = (hashCode41 + (list == null ? 0 : list.hashCode())) * 31;
        AccountChannelsCounterDto accountChannelsCounterDto = this.channels;
        return hashCode42 + (accountChannelsCounterDto != null ? accountChannelsCounterDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountAccountCountersDto(appRequests=" + this.appRequests + ", businessNotify=" + this.businessNotify + ", businessNotifyAll=" + this.businessNotifyAll + ", events=" + this.events + ", faves=" + this.faves + ", friends=" + this.friends + ", friendsRecommendations=" + this.friendsRecommendations + ", friendsUnread=" + this.friendsUnread + ", friendsUnreadBadge=" + this.friendsUnreadBadge + ", games=" + this.games + ", gifts=" + this.gifts + ", groups=" + this.groups + ", iconBadge=" + this.iconBadge + ", menuNotificationsBadge=" + this.menuNotificationsBadge + ", notificationsWithPushes=" + this.notificationsWithPushes + ", menuDiscoverBadge=" + this.menuDiscoverBadge + ", menuClipsBadge=" + this.menuClipsBadge + ", menuSuperappFriendsBadge=" + this.menuSuperappFriendsBadge + ", menuNewClipsBadge=" + this.menuNewClipsBadge + ", messages=" + this.messages + ", memories=" + this.memories + ", messageRequests=" + this.messageRequests + ", messagesArchive=" + this.messagesArchive + ", messagesArchiveUnread=" + this.messagesArchiveUnread + ", messagesArchiveUnreadUnmuted=" + this.messagesArchiveUnreadUnmuted + ", messagesArchiveMentionsCount=" + this.messagesArchiveMentionsCount + ", notes=" + this.notes + ", notifications=" + this.notifications + ", notificationsClips=" + this.notificationsClips + ", notificationsMusic=" + this.notificationsMusic + ", notificationsVideo=" + this.notificationsVideo + ", notificationsVideoWeb=" + this.notificationsVideoWeb + ", notificationsVideoTv=" + this.notificationsVideoTv + ", photos=" + this.photos + ", sdk=" + this.f59sdk + ", support=" + this.support + ", vkpay=" + this.vkpay + ", marketOrders=" + this.marketOrders + ", messagesUnreadUnmuted=" + this.messagesUnreadUnmuted + ", calls=" + this.calls + ", vkcomEmailUnreads=" + this.vkcomEmailUnreads + ", messagesFolders=" + this.messagesFolders + ", channels=" + this.channels + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.appRequests;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.businessNotify;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.businessNotifyAll;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.events;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.faves;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.friends;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.friendsRecommendations;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.friendsUnread;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.friendsUnreadBadge;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.games;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.gifts;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        Integer num12 = this.groups;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Integer num13 = this.iconBadge;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        Integer num14 = this.menuNotificationsBadge;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Integer num15 = this.notificationsWithPushes;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Integer num16 = this.menuDiscoverBadge;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        Integer num17 = this.menuClipsBadge;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        Integer num18 = this.menuSuperappFriendsBadge;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        Integer num19 = this.menuNewClipsBadge;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num19);
        }
        Integer num20 = this.messages;
        if (num20 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num20);
        }
        Integer num21 = this.memories;
        if (num21 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num21);
        }
        Integer num22 = this.messageRequests;
        if (num22 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num22);
        }
        Integer num23 = this.messagesArchive;
        if (num23 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num23);
        }
        Integer num24 = this.messagesArchiveUnread;
        if (num24 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num24);
        }
        Integer num25 = this.messagesArchiveUnreadUnmuted;
        if (num25 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num25);
        }
        Integer num26 = this.messagesArchiveMentionsCount;
        if (num26 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num26);
        }
        Integer num27 = this.notes;
        if (num27 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num27);
        }
        Integer num28 = this.notifications;
        if (num28 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num28);
        }
        Integer num29 = this.notificationsClips;
        if (num29 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num29);
        }
        Integer num30 = this.notificationsMusic;
        if (num30 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num30);
        }
        Integer num31 = this.notificationsVideo;
        if (num31 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num31);
        }
        Integer num32 = this.notificationsVideoWeb;
        if (num32 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num32);
        }
        Integer num33 = this.notificationsVideoTv;
        if (num33 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num33);
        }
        Integer num34 = this.photos;
        if (num34 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num34);
        }
        Integer num35 = this.f59sdk;
        if (num35 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num35);
        }
        Integer num36 = this.support;
        if (num36 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num36);
        }
        Integer num37 = this.vkpay;
        if (num37 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num37);
        }
        Integer num38 = this.marketOrders;
        if (num38 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num38);
        }
        Integer num39 = this.messagesUnreadUnmuted;
        if (num39 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num39);
        }
        Integer num40 = this.calls;
        if (num40 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num40);
        }
        Integer num41 = this.vkcomEmailUnreads;
        if (num41 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num41);
        }
        List<AccountMessagesFoldersCounterItemDto> list = this.messagesFolders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountMessagesFoldersCounterItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        AccountChannelsCounterDto accountChannelsCounterDto = this.channels;
        if (accountChannelsCounterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountChannelsCounterDto.writeToParcel(parcel, i);
        }
    }

    public AccountAccountCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, List<AccountMessagesFoldersCounterItemDto> list, AccountChannelsCounterDto accountChannelsCounterDto) {
        this.appRequests = num;
        this.businessNotify = num2;
        this.businessNotifyAll = num3;
        this.events = num4;
        this.faves = num5;
        this.friends = num6;
        this.friendsRecommendations = num7;
        this.friendsUnread = num8;
        this.friendsUnreadBadge = num9;
        this.games = num10;
        this.gifts = num11;
        this.groups = num12;
        this.iconBadge = num13;
        this.menuNotificationsBadge = num14;
        this.notificationsWithPushes = num15;
        this.menuDiscoverBadge = num16;
        this.menuClipsBadge = num17;
        this.menuSuperappFriendsBadge = num18;
        this.menuNewClipsBadge = num19;
        this.messages = num20;
        this.memories = num21;
        this.messageRequests = num22;
        this.messagesArchive = num23;
        this.messagesArchiveUnread = num24;
        this.messagesArchiveUnreadUnmuted = num25;
        this.messagesArchiveMentionsCount = num26;
        this.notes = num27;
        this.notifications = num28;
        this.notificationsClips = num29;
        this.notificationsMusic = num30;
        this.notificationsVideo = num31;
        this.notificationsVideoWeb = num32;
        this.notificationsVideoTv = num33;
        this.photos = num34;
        this.f59sdk = num35;
        this.support = num36;
        this.vkpay = num37;
        this.marketOrders = num38;
        this.messagesUnreadUnmuted = num39;
        this.calls = num40;
        this.vkcomEmailUnreads = num41;
        this.messagesFolders = list;
        this.channels = accountChannelsCounterDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AccountAccountCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, List list, AccountChannelsCounterDto accountChannelsCounterDto, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15, (i & 32768) != 0 ? null : num16, (i & 65536) != 0 ? null : num17, (i & 131072) != 0 ? null : num18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num19, (i & 524288) != 0 ? null : num20, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num21, (i & 2097152) != 0 ? null : num22, (i & 4194304) != 0 ? null : num23, (i & 8388608) != 0 ? null : num24, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num25, (i & 33554432) != 0 ? null : num26, (i & 67108864) != 0 ? null : num27, (i & 134217728) != 0 ? null : num28, (i & 268435456) != 0 ? null : num29, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num30, (i & 1073741824) != 0 ? null : num31, (i & Integer.MIN_VALUE) != 0 ? null : num32, (i2 & 1) != 0 ? null : num33, (i2 & 2) != 0 ? null : num34, (i2 & 4) != 0 ? null : num35, (i2 & 8) != 0 ? null : num36, (i2 & 16) != 0 ? null : num37, (i2 & 32) != 0 ? null : num38, (i2 & 64) != 0 ? null : num39, (i2 & 128) != 0 ? null : num40, (i2 & 256) != 0 ? null : num41, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : accountChannelsCounterDto);
        Integer num42 = (i & 1) != 0 ? null : num;
    }
}
