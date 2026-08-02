package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesRecommendedFolderTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesRecommendedFolderTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesRecommendedFolderTypeDto[] $VALUES;

    @pmi0("business")
    public static final MessagesRecommendedFolderTypeDto BUSINESS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesRecommendedFolderTypeDto CHANNELS;
    public static final Parcelable.Creator<MessagesRecommendedFolderTypeDto> CREATOR;

    @pmi0("managed_groups")
    public static final MessagesRecommendedFolderTypeDto MANAGED_GROUPS;

    @pmi0("personal")
    public static final MessagesRecommendedFolderTypeDto PERSONAL;

    @pmi0("unread")
    public static final MessagesRecommendedFolderTypeDto UNREAD;
    private final String value;

    /* compiled from: MessagesRecommendedFolderTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesRecommendedFolderTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesRecommendedFolderTypeDto createFromParcel(Parcel parcel) {
            return MessagesRecommendedFolderTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesRecommendedFolderTypeDto[] newArray(int i) {
            return new MessagesRecommendedFolderTypeDto[i];
        }
    }

    static {
        MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto = new MessagesRecommendedFolderTypeDto("BUSINESS", 0, "business");
        BUSINESS = messagesRecommendedFolderTypeDto;
        MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto2 = new MessagesRecommendedFolderTypeDto("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesRecommendedFolderTypeDto2;
        MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto3 = new MessagesRecommendedFolderTypeDto("MANAGED_GROUPS", 2, "managed_groups");
        MANAGED_GROUPS = messagesRecommendedFolderTypeDto3;
        MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto4 = new MessagesRecommendedFolderTypeDto("PERSONAL", 3, "personal");
        PERSONAL = messagesRecommendedFolderTypeDto4;
        MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto5 = new MessagesRecommendedFolderTypeDto("UNREAD", 4, "unread");
        UNREAD = messagesRecommendedFolderTypeDto5;
        MessagesRecommendedFolderTypeDto[] messagesRecommendedFolderTypeDtoArr = {messagesRecommendedFolderTypeDto, messagesRecommendedFolderTypeDto2, messagesRecommendedFolderTypeDto3, messagesRecommendedFolderTypeDto4, messagesRecommendedFolderTypeDto5};
        $VALUES = messagesRecommendedFolderTypeDtoArr;
        $ENTRIES = new asp(messagesRecommendedFolderTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesRecommendedFolderTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesRecommendedFolderTypeDto valueOf(String str) {
        return (MessagesRecommendedFolderTypeDto) Enum.valueOf(MessagesRecommendedFolderTypeDto.class, str);
    }

    public static MessagesRecommendedFolderTypeDto[] values() {
        return (MessagesRecommendedFolderTypeDto[]) $VALUES.clone();
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
