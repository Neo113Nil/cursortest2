package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsSearchTargetDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSearchTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsSearchTargetDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    public static final ChannelsSearchTargetDto CHANNELS;
    public static final Parcelable.Creator<ChannelsSearchTargetDto> CREATOR;

    @pmi0("messages")
    public static final ChannelsSearchTargetDto MESSAGES;
    private final String value;

    /* compiled from: ChannelsSearchTargetDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSearchTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchTargetDto createFromParcel(Parcel parcel) {
            return ChannelsSearchTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchTargetDto[] newArray(int i) {
            return new ChannelsSearchTargetDto[i];
        }
    }

    static {
        ChannelsSearchTargetDto channelsSearchTargetDto = new ChannelsSearchTargetDto("CHANNELS", 0, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = channelsSearchTargetDto;
        ChannelsSearchTargetDto channelsSearchTargetDto2 = new ChannelsSearchTargetDto("MESSAGES", 1, "messages");
        MESSAGES = channelsSearchTargetDto2;
        ChannelsSearchTargetDto[] channelsSearchTargetDtoArr = {channelsSearchTargetDto, channelsSearchTargetDto2};
        $VALUES = channelsSearchTargetDtoArr;
        $ENTRIES = new asp(channelsSearchTargetDtoArr);
        CREATOR = new a();
    }

    private ChannelsSearchTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsSearchTargetDto valueOf(String str) {
        return (ChannelsSearchTargetDto) Enum.valueOf(ChannelsSearchTargetDto.class, str);
    }

    public static ChannelsSearchTargetDto[] values() {
        return (ChannelsSearchTargetDto[]) $VALUES.clone();
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
