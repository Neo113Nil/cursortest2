package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsChannelTypeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsChannelTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsChannelTypeDto[] $VALUES;

    @pmi0("channel")
    public static final ChannelsChannelTypeDto CHANNEL;

    @pmi0("community_channel")
    public static final ChannelsChannelTypeDto COMMUNITY_CHANNEL;
    public static final Parcelable.Creator<ChannelsChannelTypeDto> CREATOR;

    @pmi0("edu_channel")
    public static final ChannelsChannelTypeDto EDU_CHANNEL;

    @pmi0("group")
    public static final ChannelsChannelTypeDto GROUP;

    @pmi0("personal_channel")
    public static final ChannelsChannelTypeDto PERSONAL_CHANNEL;
    private final String value;

    /* compiled from: ChannelsChannelTypeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsChannelTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelTypeDto createFromParcel(Parcel parcel) {
            return ChannelsChannelTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelTypeDto[] newArray(int i) {
            return new ChannelsChannelTypeDto[i];
        }
    }

    static {
        ChannelsChannelTypeDto channelsChannelTypeDto = new ChannelsChannelTypeDto("CHANNEL", 0, "channel");
        CHANNEL = channelsChannelTypeDto;
        ChannelsChannelTypeDto channelsChannelTypeDto2 = new ChannelsChannelTypeDto("EDU_CHANNEL", 1, "edu_channel");
        EDU_CHANNEL = channelsChannelTypeDto2;
        ChannelsChannelTypeDto channelsChannelTypeDto3 = new ChannelsChannelTypeDto("GROUP", 2, "group");
        GROUP = channelsChannelTypeDto3;
        ChannelsChannelTypeDto channelsChannelTypeDto4 = new ChannelsChannelTypeDto("COMMUNITY_CHANNEL", 3, "community_channel");
        COMMUNITY_CHANNEL = channelsChannelTypeDto4;
        ChannelsChannelTypeDto channelsChannelTypeDto5 = new ChannelsChannelTypeDto("PERSONAL_CHANNEL", 4, "personal_channel");
        PERSONAL_CHANNEL = channelsChannelTypeDto5;
        ChannelsChannelTypeDto[] channelsChannelTypeDtoArr = {channelsChannelTypeDto, channelsChannelTypeDto2, channelsChannelTypeDto3, channelsChannelTypeDto4, channelsChannelTypeDto5};
        $VALUES = channelsChannelTypeDtoArr;
        $ENTRIES = new asp(channelsChannelTypeDtoArr);
        CREATOR = new a();
    }

    private ChannelsChannelTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsChannelTypeDto valueOf(String str) {
        return (ChannelsChannelTypeDto) Enum.valueOf(ChannelsChannelTypeDto.class, str);
    }

    public static ChannelsChannelTypeDto[] values() {
        return (ChannelsChannelTypeDto[]) $VALUES.clone();
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
