package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetMembersSortDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMembersSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetMembersSortDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsGetMembersSortDto> CREATOR;

    @pmi0("managers")
    public static final ChannelsGetMembersSortDto MANAGERS;
    private final String value;

    /* compiled from: ChannelsGetMembersSortDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMembersSortDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMembersSortDto createFromParcel(Parcel parcel) {
            return ChannelsGetMembersSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMembersSortDto[] newArray(int i) {
            return new ChannelsGetMembersSortDto[i];
        }
    }

    static {
        ChannelsGetMembersSortDto channelsGetMembersSortDto = new ChannelsGetMembersSortDto("MANAGERS", 0, "managers");
        MANAGERS = channelsGetMembersSortDto;
        ChannelsGetMembersSortDto[] channelsGetMembersSortDtoArr = {channelsGetMembersSortDto};
        $VALUES = channelsGetMembersSortDtoArr;
        $ENTRIES = new asp(channelsGetMembersSortDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetMembersSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetMembersSortDto valueOf(String str) {
        return (ChannelsGetMembersSortDto) Enum.valueOf(ChannelsGetMembersSortDto.class, str);
    }

    public static ChannelsGetMembersSortDto[] values() {
        return (ChannelsGetMembersSortDto[]) $VALUES.clone();
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
