package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsSendMessageTopicIdDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSendMessageTopicIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsSendMessageTopicIdDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsSendMessageTopicIdDto> CREATOR;

    @pmi0("0")
    public static final ChannelsSendMessageTopicIdDto TYPE_0;

    @pmi0("1")
    public static final ChannelsSendMessageTopicIdDto TYPE_1;

    @pmi0("12")
    public static final ChannelsSendMessageTopicIdDto TYPE_12;

    @pmi0("16")
    public static final ChannelsSendMessageTopicIdDto TYPE_16;

    @pmi0("19")
    public static final ChannelsSendMessageTopicIdDto TYPE_19;

    @pmi0("21")
    public static final ChannelsSendMessageTopicIdDto TYPE_21;

    @pmi0("23")
    public static final ChannelsSendMessageTopicIdDto TYPE_23;

    @pmi0("25")
    public static final ChannelsSendMessageTopicIdDto TYPE_25;

    @pmi0("26")
    public static final ChannelsSendMessageTopicIdDto TYPE_26;

    @pmi0("32")
    public static final ChannelsSendMessageTopicIdDto TYPE_32;

    @pmi0("43")
    public static final ChannelsSendMessageTopicIdDto TYPE_43;

    @pmi0(Gc.e)
    public static final ChannelsSendMessageTopicIdDto TYPE_7;
    private final int value;

    /* compiled from: ChannelsSendMessageTopicIdDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSendMessageTopicIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSendMessageTopicIdDto createFromParcel(Parcel parcel) {
            return ChannelsSendMessageTopicIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSendMessageTopicIdDto[] newArray(int i) {
            return new ChannelsSendMessageTopicIdDto[i];
        }
    }

    static {
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto = new ChannelsSendMessageTopicIdDto("TYPE_0", 0, 0);
        TYPE_0 = channelsSendMessageTopicIdDto;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto2 = new ChannelsSendMessageTopicIdDto("TYPE_1", 1, 1);
        TYPE_1 = channelsSendMessageTopicIdDto2;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto3 = new ChannelsSendMessageTopicIdDto("TYPE_7", 2, 7);
        TYPE_7 = channelsSendMessageTopicIdDto3;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto4 = new ChannelsSendMessageTopicIdDto("TYPE_12", 3, 12);
        TYPE_12 = channelsSendMessageTopicIdDto4;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto5 = new ChannelsSendMessageTopicIdDto("TYPE_16", 4, 16);
        TYPE_16 = channelsSendMessageTopicIdDto5;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto6 = new ChannelsSendMessageTopicIdDto("TYPE_19", 5, 19);
        TYPE_19 = channelsSendMessageTopicIdDto6;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto7 = new ChannelsSendMessageTopicIdDto("TYPE_21", 6, 21);
        TYPE_21 = channelsSendMessageTopicIdDto7;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto8 = new ChannelsSendMessageTopicIdDto("TYPE_23", 7, 23);
        TYPE_23 = channelsSendMessageTopicIdDto8;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto9 = new ChannelsSendMessageTopicIdDto("TYPE_25", 8, 25);
        TYPE_25 = channelsSendMessageTopicIdDto9;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto10 = new ChannelsSendMessageTopicIdDto("TYPE_26", 9, 26);
        TYPE_26 = channelsSendMessageTopicIdDto10;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto11 = new ChannelsSendMessageTopicIdDto("TYPE_32", 10, 32);
        TYPE_32 = channelsSendMessageTopicIdDto11;
        ChannelsSendMessageTopicIdDto channelsSendMessageTopicIdDto12 = new ChannelsSendMessageTopicIdDto("TYPE_43", 11, 43);
        TYPE_43 = channelsSendMessageTopicIdDto12;
        ChannelsSendMessageTopicIdDto[] channelsSendMessageTopicIdDtoArr = {channelsSendMessageTopicIdDto, channelsSendMessageTopicIdDto2, channelsSendMessageTopicIdDto3, channelsSendMessageTopicIdDto4, channelsSendMessageTopicIdDto5, channelsSendMessageTopicIdDto6, channelsSendMessageTopicIdDto7, channelsSendMessageTopicIdDto8, channelsSendMessageTopicIdDto9, channelsSendMessageTopicIdDto10, channelsSendMessageTopicIdDto11, channelsSendMessageTopicIdDto12};
        $VALUES = channelsSendMessageTopicIdDtoArr;
        $ENTRIES = new asp(channelsSendMessageTopicIdDtoArr);
        CREATOR = new a();
    }

    private ChannelsSendMessageTopicIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChannelsSendMessageTopicIdDto valueOf(String str) {
        return (ChannelsSendMessageTopicIdDto) Enum.valueOf(ChannelsSendMessageTopicIdDto.class, str);
    }

    public static ChannelsSendMessageTopicIdDto[] values() {
        return (ChannelsSendMessageTopicIdDto[]) $VALUES.clone();
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
