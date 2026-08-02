package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetRecommendedFoldersSupportedTypesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetRecommendedFoldersSupportedTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetRecommendedFoldersSupportedTypesDto[] $VALUES;

    @pmi0("business")
    public static final MessagesGetRecommendedFoldersSupportedTypesDto BUSINESS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesGetRecommendedFoldersSupportedTypesDto CHANNELS;
    public static final Parcelable.Creator<MessagesGetRecommendedFoldersSupportedTypesDto> CREATOR;

    @pmi0("managed_groups")
    public static final MessagesGetRecommendedFoldersSupportedTypesDto MANAGED_GROUPS;

    @pmi0("personal")
    public static final MessagesGetRecommendedFoldersSupportedTypesDto PERSONAL;

    @pmi0("unread")
    public static final MessagesGetRecommendedFoldersSupportedTypesDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetRecommendedFoldersSupportedTypesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetRecommendedFoldersSupportedTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetRecommendedFoldersSupportedTypesDto createFromParcel(Parcel parcel) {
            return MessagesGetRecommendedFoldersSupportedTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetRecommendedFoldersSupportedTypesDto[] newArray(int i) {
            return new MessagesGetRecommendedFoldersSupportedTypesDto[i];
        }
    }

    static {
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto = new MessagesGetRecommendedFoldersSupportedTypesDto("BUSINESS", 0, "business");
        BUSINESS = messagesGetRecommendedFoldersSupportedTypesDto;
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto2 = new MessagesGetRecommendedFoldersSupportedTypesDto("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesGetRecommendedFoldersSupportedTypesDto2;
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto3 = new MessagesGetRecommendedFoldersSupportedTypesDto("MANAGED_GROUPS", 2, "managed_groups");
        MANAGED_GROUPS = messagesGetRecommendedFoldersSupportedTypesDto3;
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto4 = new MessagesGetRecommendedFoldersSupportedTypesDto("PERSONAL", 3, "personal");
        PERSONAL = messagesGetRecommendedFoldersSupportedTypesDto4;
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto5 = new MessagesGetRecommendedFoldersSupportedTypesDto("UNREAD", 4, "unread");
        UNREAD = messagesGetRecommendedFoldersSupportedTypesDto5;
        MessagesGetRecommendedFoldersSupportedTypesDto[] messagesGetRecommendedFoldersSupportedTypesDtoArr = {messagesGetRecommendedFoldersSupportedTypesDto, messagesGetRecommendedFoldersSupportedTypesDto2, messagesGetRecommendedFoldersSupportedTypesDto3, messagesGetRecommendedFoldersSupportedTypesDto4, messagesGetRecommendedFoldersSupportedTypesDto5};
        $VALUES = messagesGetRecommendedFoldersSupportedTypesDtoArr;
        $ENTRIES = new asp(messagesGetRecommendedFoldersSupportedTypesDtoArr);
        CREATOR = new a();
    }

    private MessagesGetRecommendedFoldersSupportedTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetRecommendedFoldersSupportedTypesDto valueOf(String str) {
        return (MessagesGetRecommendedFoldersSupportedTypesDto) Enum.valueOf(MessagesGetRecommendedFoldersSupportedTypesDto.class, str);
    }

    public static MessagesGetRecommendedFoldersSupportedTypesDto[] values() {
        return (MessagesGetRecommendedFoldersSupportedTypesDto[]) $VALUES.clone();
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
