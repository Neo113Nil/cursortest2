package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsCreateSubtypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCreateSubtypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsCreateSubtypeDto[] $VALUES;

    @pmi0("2")
    public static final ChannelsCreateSubtypeDto COMPANY_OR_WEBSITE;
    public static final Parcelable.Creator<ChannelsCreateSubtypeDto> CREATOR;

    @pmi0("3")
    public static final ChannelsCreateSubtypeDto PERSON_OR_GROUP;

    @pmi0("1")
    public static final ChannelsCreateSubtypeDto PLACE_OR_BUSINESS;

    @pmi0("4")
    public static final ChannelsCreateSubtypeDto PRODUCT_OR_ART;
    private final int value;

    /* compiled from: ChannelsCreateSubtypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCreateSubtypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateSubtypeDto createFromParcel(Parcel parcel) {
            return ChannelsCreateSubtypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCreateSubtypeDto[] newArray(int i) {
            return new ChannelsCreateSubtypeDto[i];
        }
    }

    static {
        ChannelsCreateSubtypeDto channelsCreateSubtypeDto = new ChannelsCreateSubtypeDto("PLACE_OR_BUSINESS", 0, 1);
        PLACE_OR_BUSINESS = channelsCreateSubtypeDto;
        ChannelsCreateSubtypeDto channelsCreateSubtypeDto2 = new ChannelsCreateSubtypeDto("COMPANY_OR_WEBSITE", 1, 2);
        COMPANY_OR_WEBSITE = channelsCreateSubtypeDto2;
        ChannelsCreateSubtypeDto channelsCreateSubtypeDto3 = new ChannelsCreateSubtypeDto("PERSON_OR_GROUP", 2, 3);
        PERSON_OR_GROUP = channelsCreateSubtypeDto3;
        ChannelsCreateSubtypeDto channelsCreateSubtypeDto4 = new ChannelsCreateSubtypeDto("PRODUCT_OR_ART", 3, 4);
        PRODUCT_OR_ART = channelsCreateSubtypeDto4;
        ChannelsCreateSubtypeDto[] channelsCreateSubtypeDtoArr = {channelsCreateSubtypeDto, channelsCreateSubtypeDto2, channelsCreateSubtypeDto3, channelsCreateSubtypeDto4};
        $VALUES = channelsCreateSubtypeDtoArr;
        $ENTRIES = new asp(channelsCreateSubtypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsCreateSubtypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsCreateSubtypeDto valueOf(String str) {
        return (ChannelsCreateSubtypeDto) Enum.valueOf(ChannelsCreateSubtypeDto.class, str);
    }

    public static ChannelsCreateSubtypeDto[] values() {
        return (ChannelsCreateSubtypeDto[]) $VALUES.clone();
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
