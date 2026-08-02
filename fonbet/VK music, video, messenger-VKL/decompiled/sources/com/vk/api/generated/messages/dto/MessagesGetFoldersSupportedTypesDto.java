package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetFoldersSupportedTypesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetFoldersSupportedTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetFoldersSupportedTypesDto[] $VALUES;

    @pmi0("business")
    public static final MessagesGetFoldersSupportedTypesDto BUSINESS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesGetFoldersSupportedTypesDto CHANNELS;
    public static final Parcelable.Creator<MessagesGetFoldersSupportedTypesDto> CREATOR;

    @pmi0("managed_groups")
    public static final MessagesGetFoldersSupportedTypesDto MANAGED_GROUPS;

    @pmi0("personal")
    public static final MessagesGetFoldersSupportedTypesDto PERSONAL;

    @pmi0("unread")
    public static final MessagesGetFoldersSupportedTypesDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetFoldersSupportedTypesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetFoldersSupportedTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetFoldersSupportedTypesDto createFromParcel(Parcel parcel) {
            return MessagesGetFoldersSupportedTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetFoldersSupportedTypesDto[] newArray(int i) {
            return new MessagesGetFoldersSupportedTypesDto[i];
        }
    }

    static {
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto = new MessagesGetFoldersSupportedTypesDto("BUSINESS", 0, "business");
        BUSINESS = messagesGetFoldersSupportedTypesDto;
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto2 = new MessagesGetFoldersSupportedTypesDto("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesGetFoldersSupportedTypesDto2;
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto3 = new MessagesGetFoldersSupportedTypesDto("MANAGED_GROUPS", 2, "managed_groups");
        MANAGED_GROUPS = messagesGetFoldersSupportedTypesDto3;
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto4 = new MessagesGetFoldersSupportedTypesDto("PERSONAL", 3, "personal");
        PERSONAL = messagesGetFoldersSupportedTypesDto4;
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto5 = new MessagesGetFoldersSupportedTypesDto("UNREAD", 4, "unread");
        UNREAD = messagesGetFoldersSupportedTypesDto5;
        MessagesGetFoldersSupportedTypesDto[] messagesGetFoldersSupportedTypesDtoArr = {messagesGetFoldersSupportedTypesDto, messagesGetFoldersSupportedTypesDto2, messagesGetFoldersSupportedTypesDto3, messagesGetFoldersSupportedTypesDto4, messagesGetFoldersSupportedTypesDto5};
        $VALUES = messagesGetFoldersSupportedTypesDtoArr;
        $ENTRIES = new asp(messagesGetFoldersSupportedTypesDtoArr);
        CREATOR = new a();
    }

    private MessagesGetFoldersSupportedTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetFoldersSupportedTypesDto valueOf(String str) {
        return (MessagesGetFoldersSupportedTypesDto) Enum.valueOf(MessagesGetFoldersSupportedTypesDto.class, str);
    }

    public static MessagesGetFoldersSupportedTypesDto[] values() {
        return (MessagesGetFoldersSupportedTypesDto[]) $VALUES.clone();
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
