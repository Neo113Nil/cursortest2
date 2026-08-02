package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetDiffCounterFiltersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetDiffCounterFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetDiffCounterFiltersDto[] $VALUES;

    @pmi0("ad_tag")
    public static final MessagesGetDiffCounterFiltersDto AD_TAG;

    @pmi0("all")
    public static final MessagesGetDiffCounterFiltersDto ALL;

    @pmi0("business_notify")
    public static final MessagesGetDiffCounterFiltersDto BUSINESS_NOTIFY;

    @pmi0("business_notify_all")
    public static final MessagesGetDiffCounterFiltersDto BUSINESS_NOTIFY_ALL;

    @pmi0("calls")
    public static final MessagesGetDiffCounterFiltersDto CALLS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesGetDiffCounterFiltersDto CHANNELS;
    public static final Parcelable.Creator<MessagesGetDiffCounterFiltersDto> CREATOR;

    @pmi0("groups_folder")
    public static final MessagesGetDiffCounterFiltersDto GROUPS_FOLDER;

    @pmi0("important")
    public static final MessagesGetDiffCounterFiltersDto IMPORTANT;

    @pmi0("messages")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES;

    @pmi0("messages_archive")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_ARCHIVE;

    @pmi0("messages_archive_mentions_count")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_ARCHIVE_MENTIONS_COUNT;

    @pmi0("messages_archive_unread")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_ARCHIVE_UNREAD;

    @pmi0("messages_archive_unread_unmuted")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_ARCHIVE_UNREAD_UNMUTED;

    @pmi0("messages_folders")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_FOLDERS;

    @pmi0("messages_unread_unmuted")
    public static final MessagesGetDiffCounterFiltersDto MESSAGES_UNREAD_UNMUTED;

    @pmi0("message_requests")
    public static final MessagesGetDiffCounterFiltersDto MESSAGE_REQUESTS;

    @pmi0("unanswered")
    public static final MessagesGetDiffCounterFiltersDto UNANSWERED;

    @pmi0("unread")
    public static final MessagesGetDiffCounterFiltersDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetDiffCounterFiltersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetDiffCounterFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffCounterFiltersDto createFromParcel(Parcel parcel) {
            return MessagesGetDiffCounterFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffCounterFiltersDto[] newArray(int i) {
            return new MessagesGetDiffCounterFiltersDto[i];
        }
    }

    static {
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto = new MessagesGetDiffCounterFiltersDto("AD_TAG", 0, "ad_tag");
        AD_TAG = messagesGetDiffCounterFiltersDto;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto2 = new MessagesGetDiffCounterFiltersDto("ALL", 1, "all");
        ALL = messagesGetDiffCounterFiltersDto2;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto3 = new MessagesGetDiffCounterFiltersDto("BUSINESS_NOTIFY", 2, "business_notify");
        BUSINESS_NOTIFY = messagesGetDiffCounterFiltersDto3;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto4 = new MessagesGetDiffCounterFiltersDto("BUSINESS_NOTIFY_ALL", 3, "business_notify_all");
        BUSINESS_NOTIFY_ALL = messagesGetDiffCounterFiltersDto4;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto5 = new MessagesGetDiffCounterFiltersDto("CALLS", 4, "calls");
        CALLS = messagesGetDiffCounterFiltersDto5;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto6 = new MessagesGetDiffCounterFiltersDto("CHANNELS", 5, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesGetDiffCounterFiltersDto6;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto7 = new MessagesGetDiffCounterFiltersDto("GROUPS_FOLDER", 6, "groups_folder");
        GROUPS_FOLDER = messagesGetDiffCounterFiltersDto7;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto8 = new MessagesGetDiffCounterFiltersDto("IMPORTANT", 7, "important");
        IMPORTANT = messagesGetDiffCounterFiltersDto8;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto9 = new MessagesGetDiffCounterFiltersDto("MESSAGE_REQUESTS", 8, "message_requests");
        MESSAGE_REQUESTS = messagesGetDiffCounterFiltersDto9;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto10 = new MessagesGetDiffCounterFiltersDto("MESSAGES", 9, "messages");
        MESSAGES = messagesGetDiffCounterFiltersDto10;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto11 = new MessagesGetDiffCounterFiltersDto("MESSAGES_ARCHIVE", 10, "messages_archive");
        MESSAGES_ARCHIVE = messagesGetDiffCounterFiltersDto11;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto12 = new MessagesGetDiffCounterFiltersDto("MESSAGES_ARCHIVE_MENTIONS_COUNT", 11, "messages_archive_mentions_count");
        MESSAGES_ARCHIVE_MENTIONS_COUNT = messagesGetDiffCounterFiltersDto12;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto13 = new MessagesGetDiffCounterFiltersDto("MESSAGES_ARCHIVE_UNREAD", 12, "messages_archive_unread");
        MESSAGES_ARCHIVE_UNREAD = messagesGetDiffCounterFiltersDto13;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto14 = new MessagesGetDiffCounterFiltersDto("MESSAGES_ARCHIVE_UNREAD_UNMUTED", 13, "messages_archive_unread_unmuted");
        MESSAGES_ARCHIVE_UNREAD_UNMUTED = messagesGetDiffCounterFiltersDto14;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto15 = new MessagesGetDiffCounterFiltersDto("MESSAGES_FOLDERS", 14, "messages_folders");
        MESSAGES_FOLDERS = messagesGetDiffCounterFiltersDto15;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto16 = new MessagesGetDiffCounterFiltersDto("MESSAGES_UNREAD_UNMUTED", 15, "messages_unread_unmuted");
        MESSAGES_UNREAD_UNMUTED = messagesGetDiffCounterFiltersDto16;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto17 = new MessagesGetDiffCounterFiltersDto("UNANSWERED", 16, "unanswered");
        UNANSWERED = messagesGetDiffCounterFiltersDto17;
        MessagesGetDiffCounterFiltersDto messagesGetDiffCounterFiltersDto18 = new MessagesGetDiffCounterFiltersDto("UNREAD", 17, "unread");
        UNREAD = messagesGetDiffCounterFiltersDto18;
        MessagesGetDiffCounterFiltersDto[] messagesGetDiffCounterFiltersDtoArr = {messagesGetDiffCounterFiltersDto, messagesGetDiffCounterFiltersDto2, messagesGetDiffCounterFiltersDto3, messagesGetDiffCounterFiltersDto4, messagesGetDiffCounterFiltersDto5, messagesGetDiffCounterFiltersDto6, messagesGetDiffCounterFiltersDto7, messagesGetDiffCounterFiltersDto8, messagesGetDiffCounterFiltersDto9, messagesGetDiffCounterFiltersDto10, messagesGetDiffCounterFiltersDto11, messagesGetDiffCounterFiltersDto12, messagesGetDiffCounterFiltersDto13, messagesGetDiffCounterFiltersDto14, messagesGetDiffCounterFiltersDto15, messagesGetDiffCounterFiltersDto16, messagesGetDiffCounterFiltersDto17, messagesGetDiffCounterFiltersDto18};
        $VALUES = messagesGetDiffCounterFiltersDtoArr;
        $ENTRIES = new asp(messagesGetDiffCounterFiltersDtoArr);
        CREATOR = new a();
    }

    private MessagesGetDiffCounterFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetDiffCounterFiltersDto valueOf(String str) {
        return (MessagesGetDiffCounterFiltersDto) Enum.valueOf(MessagesGetDiffCounterFiltersDto.class, str);
    }

    public static MessagesGetDiffCounterFiltersDto[] values() {
        return (MessagesGetDiffCounterFiltersDto[]) $VALUES.clone();
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
