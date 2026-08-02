package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetMessagesReactionsItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMessagesReactionsItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetMessagesReactionsItemTypeDto[] $VALUES;

    @pmi0("comment")
    public static final ChannelsGetMessagesReactionsItemTypeDto COMMENT;
    public static final Parcelable.Creator<ChannelsGetMessagesReactionsItemTypeDto> CREATOR;

    @pmi0("message")
    public static final ChannelsGetMessagesReactionsItemTypeDto MESSAGE;
    private final String value;

    /* compiled from: ChannelsGetMessagesReactionsItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMessagesReactionsItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesReactionsItemTypeDto createFromParcel(Parcel parcel) {
            return ChannelsGetMessagesReactionsItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesReactionsItemTypeDto[] newArray(int i) {
            return new ChannelsGetMessagesReactionsItemTypeDto[i];
        }
    }

    static {
        ChannelsGetMessagesReactionsItemTypeDto channelsGetMessagesReactionsItemTypeDto = new ChannelsGetMessagesReactionsItemTypeDto("COMMENT", 0, "comment");
        COMMENT = channelsGetMessagesReactionsItemTypeDto;
        ChannelsGetMessagesReactionsItemTypeDto channelsGetMessagesReactionsItemTypeDto2 = new ChannelsGetMessagesReactionsItemTypeDto("MESSAGE", 1, "message");
        MESSAGE = channelsGetMessagesReactionsItemTypeDto2;
        ChannelsGetMessagesReactionsItemTypeDto[] channelsGetMessagesReactionsItemTypeDtoArr = {channelsGetMessagesReactionsItemTypeDto, channelsGetMessagesReactionsItemTypeDto2};
        $VALUES = channelsGetMessagesReactionsItemTypeDtoArr;
        $ENTRIES = new asp(channelsGetMessagesReactionsItemTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetMessagesReactionsItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetMessagesReactionsItemTypeDto valueOf(String str) {
        return (ChannelsGetMessagesReactionsItemTypeDto) Enum.valueOf(ChannelsGetMessagesReactionsItemTypeDto.class, str);
    }

    public static ChannelsGetMessagesReactionsItemTypeDto[] values() {
        return (ChannelsGetMessagesReactionsItemTypeDto[]) $VALUES.clone();
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
