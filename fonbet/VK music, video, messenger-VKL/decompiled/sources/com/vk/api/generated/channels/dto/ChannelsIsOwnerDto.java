package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsIsOwnerDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsIsOwnerDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsIsOwnerDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsIsOwnerDto> CREATOR;

    @pmi0("0")
    public static final ChannelsIsOwnerDto USER_IS_NOT_OWNER;

    @pmi0("1")
    public static final ChannelsIsOwnerDto USER_IS_OWNER;
    private final int value;

    /* compiled from: ChannelsIsOwnerDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsIsOwnerDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsIsOwnerDto createFromParcel(Parcel parcel) {
            return ChannelsIsOwnerDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsIsOwnerDto[] newArray(int i) {
            return new ChannelsIsOwnerDto[i];
        }
    }

    static {
        ChannelsIsOwnerDto channelsIsOwnerDto = new ChannelsIsOwnerDto("USER_IS_NOT_OWNER", 0, 0);
        USER_IS_NOT_OWNER = channelsIsOwnerDto;
        ChannelsIsOwnerDto channelsIsOwnerDto2 = new ChannelsIsOwnerDto("USER_IS_OWNER", 1, 1);
        USER_IS_OWNER = channelsIsOwnerDto2;
        ChannelsIsOwnerDto[] channelsIsOwnerDtoArr = {channelsIsOwnerDto, channelsIsOwnerDto2};
        $VALUES = channelsIsOwnerDtoArr;
        $ENTRIES = new asp(channelsIsOwnerDtoArr);
        CREATOR = new a();
    }

    private ChannelsIsOwnerDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsIsOwnerDto valueOf(String str) {
        return (ChannelsIsOwnerDto) Enum.valueOf(ChannelsIsOwnerDto.class, str);
    }

    public static ChannelsIsOwnerDto[] values() {
        return (ChannelsIsOwnerDto[]) $VALUES.clone();
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
