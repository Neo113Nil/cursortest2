package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsSendReactionItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSendReactionItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsSendReactionItemTypeDto[] $VALUES;

    @pmi0("comment")
    public static final ChannelsSendReactionItemTypeDto COMMENT;
    public static final Parcelable.Creator<ChannelsSendReactionItemTypeDto> CREATOR;

    @pmi0("message")
    public static final ChannelsSendReactionItemTypeDto MESSAGE;
    private final String value;

    /* compiled from: ChannelsSendReactionItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSendReactionItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSendReactionItemTypeDto createFromParcel(Parcel parcel) {
            return ChannelsSendReactionItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSendReactionItemTypeDto[] newArray(int i) {
            return new ChannelsSendReactionItemTypeDto[i];
        }
    }

    static {
        ChannelsSendReactionItemTypeDto channelsSendReactionItemTypeDto = new ChannelsSendReactionItemTypeDto("COMMENT", 0, "comment");
        COMMENT = channelsSendReactionItemTypeDto;
        ChannelsSendReactionItemTypeDto channelsSendReactionItemTypeDto2 = new ChannelsSendReactionItemTypeDto("MESSAGE", 1, "message");
        MESSAGE = channelsSendReactionItemTypeDto2;
        ChannelsSendReactionItemTypeDto[] channelsSendReactionItemTypeDtoArr = {channelsSendReactionItemTypeDto, channelsSendReactionItemTypeDto2};
        $VALUES = channelsSendReactionItemTypeDtoArr;
        $ENTRIES = new asp(channelsSendReactionItemTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsSendReactionItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsSendReactionItemTypeDto valueOf(String str) {
        return (ChannelsSendReactionItemTypeDto) Enum.valueOf(ChannelsSendReactionItemTypeDto.class, str);
    }

    public static ChannelsSendReactionItemTypeDto[] values() {
        return (ChannelsSendReactionItemTypeDto[]) $VALUES.clone();
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
