package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetDiffSupportedTypesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetDiffSupportedTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetDiffSupportedTypesDto[] $VALUES;

    @pmi0("business")
    public static final MessagesGetDiffSupportedTypesDto BUSINESS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesGetDiffSupportedTypesDto CHANNELS;
    public static final Parcelable.Creator<MessagesGetDiffSupportedTypesDto> CREATOR;

    @pmi0("managed_groups")
    public static final MessagesGetDiffSupportedTypesDto MANAGED_GROUPS;

    @pmi0("personal")
    public static final MessagesGetDiffSupportedTypesDto PERSONAL;

    @pmi0("unread")
    public static final MessagesGetDiffSupportedTypesDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetDiffSupportedTypesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetDiffSupportedTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffSupportedTypesDto createFromParcel(Parcel parcel) {
            return MessagesGetDiffSupportedTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffSupportedTypesDto[] newArray(int i) {
            return new MessagesGetDiffSupportedTypesDto[i];
        }
    }

    static {
        MessagesGetDiffSupportedTypesDto messagesGetDiffSupportedTypesDto = new MessagesGetDiffSupportedTypesDto("BUSINESS", 0, "business");
        BUSINESS = messagesGetDiffSupportedTypesDto;
        MessagesGetDiffSupportedTypesDto messagesGetDiffSupportedTypesDto2 = new MessagesGetDiffSupportedTypesDto("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesGetDiffSupportedTypesDto2;
        MessagesGetDiffSupportedTypesDto messagesGetDiffSupportedTypesDto3 = new MessagesGetDiffSupportedTypesDto("MANAGED_GROUPS", 2, "managed_groups");
        MANAGED_GROUPS = messagesGetDiffSupportedTypesDto3;
        MessagesGetDiffSupportedTypesDto messagesGetDiffSupportedTypesDto4 = new MessagesGetDiffSupportedTypesDto("PERSONAL", 3, "personal");
        PERSONAL = messagesGetDiffSupportedTypesDto4;
        MessagesGetDiffSupportedTypesDto messagesGetDiffSupportedTypesDto5 = new MessagesGetDiffSupportedTypesDto("UNREAD", 4, "unread");
        UNREAD = messagesGetDiffSupportedTypesDto5;
        MessagesGetDiffSupportedTypesDto[] messagesGetDiffSupportedTypesDtoArr = {messagesGetDiffSupportedTypesDto, messagesGetDiffSupportedTypesDto2, messagesGetDiffSupportedTypesDto3, messagesGetDiffSupportedTypesDto4, messagesGetDiffSupportedTypesDto5};
        $VALUES = messagesGetDiffSupportedTypesDtoArr;
        $ENTRIES = new asp(messagesGetDiffSupportedTypesDtoArr);
        CREATOR = new a();
    }

    private MessagesGetDiffSupportedTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetDiffSupportedTypesDto valueOf(String str) {
        return (MessagesGetDiffSupportedTypesDto) Enum.valueOf(MessagesGetDiffSupportedTypesDto.class, str);
    }

    public static MessagesGetDiffSupportedTypesDto[] values() {
        return (MessagesGetDiffSupportedTypesDto[]) $VALUES.clone();
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
