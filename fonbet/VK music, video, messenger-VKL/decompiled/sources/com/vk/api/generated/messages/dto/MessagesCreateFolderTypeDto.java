package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesCreateFolderTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCreateFolderTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesCreateFolderTypeDto[] $VALUES;

    @pmi0("business")
    public static final MessagesCreateFolderTypeDto BUSINESS;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final MessagesCreateFolderTypeDto CHANNELS;
    public static final Parcelable.Creator<MessagesCreateFolderTypeDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MessagesCreateFolderTypeDto DEFAULT;

    @pmi0("managed_groups")
    public static final MessagesCreateFolderTypeDto MANAGED_GROUPS;

    @pmi0("personal")
    public static final MessagesCreateFolderTypeDto PERSONAL;
    private final String value;

    /* compiled from: MessagesCreateFolderTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCreateFolderTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCreateFolderTypeDto createFromParcel(Parcel parcel) {
            return MessagesCreateFolderTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCreateFolderTypeDto[] newArray(int i) {
            return new MessagesCreateFolderTypeDto[i];
        }
    }

    static {
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto = new MessagesCreateFolderTypeDto("BUSINESS", 0, "business");
        BUSINESS = messagesCreateFolderTypeDto;
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto2 = new MessagesCreateFolderTypeDto("CHANNELS", 1, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = messagesCreateFolderTypeDto2;
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto3 = new MessagesCreateFolderTypeDto("DEFAULT", 2, BuildConfig.FLAVOR);
        DEFAULT = messagesCreateFolderTypeDto3;
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto4 = new MessagesCreateFolderTypeDto("MANAGED_GROUPS", 3, "managed_groups");
        MANAGED_GROUPS = messagesCreateFolderTypeDto4;
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto5 = new MessagesCreateFolderTypeDto("PERSONAL", 4, "personal");
        PERSONAL = messagesCreateFolderTypeDto5;
        MessagesCreateFolderTypeDto[] messagesCreateFolderTypeDtoArr = {messagesCreateFolderTypeDto, messagesCreateFolderTypeDto2, messagesCreateFolderTypeDto3, messagesCreateFolderTypeDto4, messagesCreateFolderTypeDto5};
        $VALUES = messagesCreateFolderTypeDtoArr;
        $ENTRIES = new asp(messagesCreateFolderTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesCreateFolderTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesCreateFolderTypeDto valueOf(String str) {
        return (MessagesCreateFolderTypeDto) Enum.valueOf(MessagesCreateFolderTypeDto.class, str);
    }

    public static MessagesCreateFolderTypeDto[] values() {
        return (MessagesCreateFolderTypeDto[]) $VALUES.clone();
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
