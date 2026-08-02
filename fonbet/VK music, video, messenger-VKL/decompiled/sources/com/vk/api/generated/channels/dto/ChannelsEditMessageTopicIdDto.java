package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsEditMessageTopicIdDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsEditMessageTopicIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsEditMessageTopicIdDto[] $VALUES;

    @pmi0("1")
    public static final ChannelsEditMessageTopicIdDto ART;
    public static final Parcelable.Creator<ChannelsEditMessageTopicIdDto> CREATOR;

    @pmi0("0")
    public static final ChannelsEditMessageTopicIdDto EMPTY_TOPIC;

    @pmi0("43")
    public static final ChannelsEditMessageTopicIdDto FASHION;

    @pmi0("12")
    public static final ChannelsEditMessageTopicIdDto GAMES;

    @pmi0("32")
    public static final ChannelsEditMessageTopicIdDto HUMOR;

    @pmi0(Gc.e)
    public static final ChannelsEditMessageTopicIdDto IT;

    @pmi0("16")
    public static final ChannelsEditMessageTopicIdDto MUSIC;

    @pmi0("19")
    public static final ChannelsEditMessageTopicIdDto PHOTO;

    @pmi0("21")
    public static final ChannelsEditMessageTopicIdDto SCIENCE_AND_TECH;

    @pmi0("23")
    public static final ChannelsEditMessageTopicIdDto SPORT;

    @pmi0("25")
    public static final ChannelsEditMessageTopicIdDto TRAVEL;

    @pmi0("26")
    public static final ChannelsEditMessageTopicIdDto TV_AND_CINEMA;
    private final int value;

    /* compiled from: ChannelsEditMessageTopicIdDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsEditMessageTopicIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsEditMessageTopicIdDto createFromParcel(Parcel parcel) {
            return ChannelsEditMessageTopicIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsEditMessageTopicIdDto[] newArray(int i) {
            return new ChannelsEditMessageTopicIdDto[i];
        }
    }

    static {
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto = new ChannelsEditMessageTopicIdDto("EMPTY_TOPIC", 0, 0);
        EMPTY_TOPIC = channelsEditMessageTopicIdDto;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto2 = new ChannelsEditMessageTopicIdDto("ART", 1, 1);
        ART = channelsEditMessageTopicIdDto2;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto3 = new ChannelsEditMessageTopicIdDto("IT", 2, 7);
        IT = channelsEditMessageTopicIdDto3;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto4 = new ChannelsEditMessageTopicIdDto("GAMES", 3, 12);
        GAMES = channelsEditMessageTopicIdDto4;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto5 = new ChannelsEditMessageTopicIdDto("MUSIC", 4, 16);
        MUSIC = channelsEditMessageTopicIdDto5;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto6 = new ChannelsEditMessageTopicIdDto("PHOTO", 5, 19);
        PHOTO = channelsEditMessageTopicIdDto6;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto7 = new ChannelsEditMessageTopicIdDto("SCIENCE_AND_TECH", 6, 21);
        SCIENCE_AND_TECH = channelsEditMessageTopicIdDto7;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto8 = new ChannelsEditMessageTopicIdDto("SPORT", 7, 23);
        SPORT = channelsEditMessageTopicIdDto8;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto9 = new ChannelsEditMessageTopicIdDto("TRAVEL", 8, 25);
        TRAVEL = channelsEditMessageTopicIdDto9;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto10 = new ChannelsEditMessageTopicIdDto("TV_AND_CINEMA", 9, 26);
        TV_AND_CINEMA = channelsEditMessageTopicIdDto10;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto11 = new ChannelsEditMessageTopicIdDto("HUMOR", 10, 32);
        HUMOR = channelsEditMessageTopicIdDto11;
        ChannelsEditMessageTopicIdDto channelsEditMessageTopicIdDto12 = new ChannelsEditMessageTopicIdDto("FASHION", 11, 43);
        FASHION = channelsEditMessageTopicIdDto12;
        ChannelsEditMessageTopicIdDto[] channelsEditMessageTopicIdDtoArr = {channelsEditMessageTopicIdDto, channelsEditMessageTopicIdDto2, channelsEditMessageTopicIdDto3, channelsEditMessageTopicIdDto4, channelsEditMessageTopicIdDto5, channelsEditMessageTopicIdDto6, channelsEditMessageTopicIdDto7, channelsEditMessageTopicIdDto8, channelsEditMessageTopicIdDto9, channelsEditMessageTopicIdDto10, channelsEditMessageTopicIdDto11, channelsEditMessageTopicIdDto12};
        $VALUES = channelsEditMessageTopicIdDtoArr;
        $ENTRIES = new asp(channelsEditMessageTopicIdDtoArr);
        CREATOR = new a();
    }

    private ChannelsEditMessageTopicIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsEditMessageTopicIdDto valueOf(String str) {
        return (ChannelsEditMessageTopicIdDto) Enum.valueOf(ChannelsEditMessageTopicIdDto.class, str);
    }

    public static ChannelsEditMessageTopicIdDto[] values() {
        return (ChannelsEditMessageTopicIdDto[]) $VALUES.clone();
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
