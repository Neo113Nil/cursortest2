package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetHistoryFilterDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetHistoryFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetHistoryFilterDto[] $VALUES;

    @pmi0("all")
    public static final ChannelsGetHistoryFilterDto ALL;
    public static final Parcelable.Creator<ChannelsGetHistoryFilterDto> CREATOR;

    @pmi0("media_viewer")
    public static final ChannelsGetHistoryFilterDto MEDIA_VIEWER;

    @pmi0("postponed")
    public static final ChannelsGetHistoryFilterDto POSTPONED;
    private final String value;

    /* compiled from: ChannelsGetHistoryFilterDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetHistoryFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryFilterDto createFromParcel(Parcel parcel) {
            return ChannelsGetHistoryFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryFilterDto[] newArray(int i) {
            return new ChannelsGetHistoryFilterDto[i];
        }
    }

    static {
        ChannelsGetHistoryFilterDto channelsGetHistoryFilterDto = new ChannelsGetHistoryFilterDto("ALL", 0, "all");
        ALL = channelsGetHistoryFilterDto;
        ChannelsGetHistoryFilterDto channelsGetHistoryFilterDto2 = new ChannelsGetHistoryFilterDto("MEDIA_VIEWER", 1, "media_viewer");
        MEDIA_VIEWER = channelsGetHistoryFilterDto2;
        ChannelsGetHistoryFilterDto channelsGetHistoryFilterDto3 = new ChannelsGetHistoryFilterDto("POSTPONED", 2, "postponed");
        POSTPONED = channelsGetHistoryFilterDto3;
        ChannelsGetHistoryFilterDto[] channelsGetHistoryFilterDtoArr = {channelsGetHistoryFilterDto, channelsGetHistoryFilterDto2, channelsGetHistoryFilterDto3};
        $VALUES = channelsGetHistoryFilterDtoArr;
        $ENTRIES = new asp(channelsGetHistoryFilterDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetHistoryFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetHistoryFilterDto valueOf(String str) {
        return (ChannelsGetHistoryFilterDto) Enum.valueOf(ChannelsGetHistoryFilterDto.class, str);
    }

    public static ChannelsGetHistoryFilterDto[] values() {
        return (ChannelsGetHistoryFilterDto[]) $VALUES.clone();
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
