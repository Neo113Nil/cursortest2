package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesCountersFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCountersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesCountersFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesCountersFilterDto ALL;

    @pmi0("business_notify")
    public static final MessagesCountersFilterDto BUSINESS_NOTIFY;

    @pmi0("business_notify_all")
    public static final MessagesCountersFilterDto BUSINESS_NOTIFY_ALL;

    @pmi0("calls")
    public static final MessagesCountersFilterDto CALLS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesCountersFilterDto CHANNELS;
    public static final Parcelable.Creator<MessagesCountersFilterDto> CREATOR;

    @pmi0("groups_folder")
    public static final MessagesCountersFilterDto GROUPS_FOLDER;

    @pmi0("messages")
    public static final MessagesCountersFilterDto MESSAGES;

    @pmi0("messages_archive")
    public static final MessagesCountersFilterDto MESSAGES_ARCHIVE;

    @pmi0("messages_archive_mentions_count")
    public static final MessagesCountersFilterDto MESSAGES_ARCHIVE_MENTIONS_COUNT;

    @pmi0("messages_archive_unread")
    public static final MessagesCountersFilterDto MESSAGES_ARCHIVE_UNREAD;

    @pmi0("messages_archive_unread_unmuted")
    public static final MessagesCountersFilterDto MESSAGES_ARCHIVE_UNREAD_UNMUTED;

    @pmi0("messages_folders")
    public static final MessagesCountersFilterDto MESSAGES_FOLDERS;

    @pmi0("messages_unread_unmuted")
    public static final MessagesCountersFilterDto MESSAGES_UNREAD_UNMUTED;

    @pmi0("message_requests")
    public static final MessagesCountersFilterDto MESSAGE_REQUESTS;
    private final String value;

    /* compiled from: MessagesCountersFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCountersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCountersFilterDto createFromParcel(Parcel parcel) {
            return MessagesCountersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCountersFilterDto[] newArray(int i) {
            return new MessagesCountersFilterDto[i];
        }
    }

    static {
        MessagesCountersFilterDto messagesCountersFilterDto = new MessagesCountersFilterDto("ALL", 0, "all");
        ALL = messagesCountersFilterDto;
        MessagesCountersFilterDto messagesCountersFilterDto2 = new MessagesCountersFilterDto("MESSAGES", 1, "messages");
        MESSAGES = messagesCountersFilterDto2;
        MessagesCountersFilterDto messagesCountersFilterDto3 = new MessagesCountersFilterDto("MESSAGE_REQUESTS", 2, "message_requests");
        MESSAGE_REQUESTS = messagesCountersFilterDto3;
        MessagesCountersFilterDto messagesCountersFilterDto4 = new MessagesCountersFilterDto("MESSAGES_ARCHIVE", 3, "messages_archive");
        MESSAGES_ARCHIVE = messagesCountersFilterDto4;
        MessagesCountersFilterDto messagesCountersFilterDto5 = new MessagesCountersFilterDto("MESSAGES_ARCHIVE_UNREAD", 4, "messages_archive_unread");
        MESSAGES_ARCHIVE_UNREAD = messagesCountersFilterDto5;
        MessagesCountersFilterDto messagesCountersFilterDto6 = new MessagesCountersFilterDto("MESSAGES_ARCHIVE_UNREAD_UNMUTED", 5, "messages_archive_unread_unmuted");
        MESSAGES_ARCHIVE_UNREAD_UNMUTED = messagesCountersFilterDto6;
        MessagesCountersFilterDto messagesCountersFilterDto7 = new MessagesCountersFilterDto("MESSAGES_ARCHIVE_MENTIONS_COUNT", 6, "messages_archive_mentions_count");
        MESSAGES_ARCHIVE_MENTIONS_COUNT = messagesCountersFilterDto7;
        MessagesCountersFilterDto messagesCountersFilterDto8 = new MessagesCountersFilterDto("MESSAGES_UNREAD_UNMUTED", 7, "messages_unread_unmuted");
        MESSAGES_UNREAD_UNMUTED = messagesCountersFilterDto8;
        MessagesCountersFilterDto messagesCountersFilterDto9 = new MessagesCountersFilterDto("MESSAGES_FOLDERS", 8, "messages_folders");
        MESSAGES_FOLDERS = messagesCountersFilterDto9;
        MessagesCountersFilterDto messagesCountersFilterDto10 = new MessagesCountersFilterDto("CALLS", 9, "calls");
        CALLS = messagesCountersFilterDto10;
        MessagesCountersFilterDto messagesCountersFilterDto11 = new MessagesCountersFilterDto("BUSINESS_NOTIFY", 10, "business_notify");
        BUSINESS_NOTIFY = messagesCountersFilterDto11;
        MessagesCountersFilterDto messagesCountersFilterDto12 = new MessagesCountersFilterDto("BUSINESS_NOTIFY_ALL", 11, "business_notify_all");
        BUSINESS_NOTIFY_ALL = messagesCountersFilterDto12;
        MessagesCountersFilterDto messagesCountersFilterDto13 = new MessagesCountersFilterDto("CHANNELS", 12, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesCountersFilterDto13;
        MessagesCountersFilterDto messagesCountersFilterDto14 = new MessagesCountersFilterDto("GROUPS_FOLDER", 13, "groups_folder");
        GROUPS_FOLDER = messagesCountersFilterDto14;
        MessagesCountersFilterDto[] messagesCountersFilterDtoArr = {messagesCountersFilterDto, messagesCountersFilterDto2, messagesCountersFilterDto3, messagesCountersFilterDto4, messagesCountersFilterDto5, messagesCountersFilterDto6, messagesCountersFilterDto7, messagesCountersFilterDto8, messagesCountersFilterDto9, messagesCountersFilterDto10, messagesCountersFilterDto11, messagesCountersFilterDto12, messagesCountersFilterDto13, messagesCountersFilterDto14};
        $VALUES = messagesCountersFilterDtoArr;
        $ENTRIES = new asp(messagesCountersFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesCountersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesCountersFilterDto valueOf(String str) {
        return (MessagesCountersFilterDto) Enum.valueOf(MessagesCountersFilterDto.class, str);
    }

    public static MessagesCountersFilterDto[] values() {
        return (MessagesCountersFilterDto[]) $VALUES.clone();
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
