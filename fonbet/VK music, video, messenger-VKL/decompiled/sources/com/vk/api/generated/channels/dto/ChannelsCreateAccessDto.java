package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsCreateAccessDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateAccessDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsCreateAccessDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsCreateAccessDto> CREATOR;

    @pmi0("0")
    public static final ChannelsCreateAccessDto TYPE_0;

    @pmi0("1")
    public static final ChannelsCreateAccessDto TYPE_1;

    @pmi0("2")
    public static final ChannelsCreateAccessDto TYPE_2;
    private final int value;

    /* compiled from: ChannelsCreateAccessDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateAccessDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateAccessDto createFromParcel(Parcel parcel) {
            return ChannelsCreateAccessDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateAccessDto[] newArray(int i) {
            return new ChannelsCreateAccessDto[i];
        }
    }

    static {
        ChannelsCreateAccessDto channelsCreateAccessDto = new ChannelsCreateAccessDto("TYPE_0", 0, 0);
        TYPE_0 = channelsCreateAccessDto;
        ChannelsCreateAccessDto channelsCreateAccessDto2 = new ChannelsCreateAccessDto("TYPE_1", 1, 1);
        TYPE_1 = channelsCreateAccessDto2;
        ChannelsCreateAccessDto channelsCreateAccessDto3 = new ChannelsCreateAccessDto("TYPE_2", 2, 2);
        TYPE_2 = channelsCreateAccessDto3;
        ChannelsCreateAccessDto[] channelsCreateAccessDtoArr = {channelsCreateAccessDto, channelsCreateAccessDto2, channelsCreateAccessDto3};
        $VALUES = channelsCreateAccessDtoArr;
        $ENTRIES = new asp(channelsCreateAccessDtoArr);
        CREATOR = new a();
    }

    private ChannelsCreateAccessDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsCreateAccessDto valueOf(String str) {
        return (ChannelsCreateAccessDto) Enum.valueOf(ChannelsCreateAccessDto.class, str);
    }

    public static ChannelsCreateAccessDto[] values() {
        return (ChannelsCreateAccessDto[]) $VALUES.clone();
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
