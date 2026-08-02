package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsCreateCategoryGenderDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateCategoryGenderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsCreateCategoryGenderDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsCreateCategoryGenderDto> CREATOR;

    @pmi0("0")
    public static final ChannelsCreateCategoryGenderDto TYPE_0;

    @pmi0("1")
    public static final ChannelsCreateCategoryGenderDto TYPE_1;

    @pmi0("2")
    public static final ChannelsCreateCategoryGenderDto TYPE_2;
    private final int value;

    /* compiled from: ChannelsCreateCategoryGenderDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateCategoryGenderDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCategoryGenderDto createFromParcel(Parcel parcel) {
            return ChannelsCreateCategoryGenderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateCategoryGenderDto[] newArray(int i) {
            return new ChannelsCreateCategoryGenderDto[i];
        }
    }

    static {
        ChannelsCreateCategoryGenderDto channelsCreateCategoryGenderDto = new ChannelsCreateCategoryGenderDto("TYPE_0", 0, 0);
        TYPE_0 = channelsCreateCategoryGenderDto;
        ChannelsCreateCategoryGenderDto channelsCreateCategoryGenderDto2 = new ChannelsCreateCategoryGenderDto("TYPE_1", 1, 1);
        TYPE_1 = channelsCreateCategoryGenderDto2;
        ChannelsCreateCategoryGenderDto channelsCreateCategoryGenderDto3 = new ChannelsCreateCategoryGenderDto("TYPE_2", 2, 2);
        TYPE_2 = channelsCreateCategoryGenderDto3;
        ChannelsCreateCategoryGenderDto[] channelsCreateCategoryGenderDtoArr = {channelsCreateCategoryGenderDto, channelsCreateCategoryGenderDto2, channelsCreateCategoryGenderDto3};
        $VALUES = channelsCreateCategoryGenderDtoArr;
        $ENTRIES = new asp(channelsCreateCategoryGenderDtoArr);
        CREATOR = new a();
    }

    private ChannelsCreateCategoryGenderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsCreateCategoryGenderDto valueOf(String str) {
        return (ChannelsCreateCategoryGenderDto) Enum.valueOf(ChannelsCreateCategoryGenderDto.class, str);
    }

    public static ChannelsCreateCategoryGenderDto[] values() {
        return (ChannelsCreateCategoryGenderDto[]) $VALUES.clone();
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
