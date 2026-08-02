package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetMembersFilterDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMembersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetMembersFilterDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsGetMembersFilterDto> CREATOR;

    @pmi0("managers")
    public static final ChannelsGetMembersFilterDto MANAGERS;

    @pmi0("members")
    public static final ChannelsGetMembersFilterDto MEMBERS;
    private final String value;

    /* compiled from: ChannelsGetMembersFilterDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMembersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMembersFilterDto createFromParcel(Parcel parcel) {
            return ChannelsGetMembersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMembersFilterDto[] newArray(int i) {
            return new ChannelsGetMembersFilterDto[i];
        }
    }

    static {
        ChannelsGetMembersFilterDto channelsGetMembersFilterDto = new ChannelsGetMembersFilterDto("MANAGERS", 0, "managers");
        MANAGERS = channelsGetMembersFilterDto;
        ChannelsGetMembersFilterDto channelsGetMembersFilterDto2 = new ChannelsGetMembersFilterDto("MEMBERS", 1, "members");
        MEMBERS = channelsGetMembersFilterDto2;
        ChannelsGetMembersFilterDto[] channelsGetMembersFilterDtoArr = {channelsGetMembersFilterDto, channelsGetMembersFilterDto2};
        $VALUES = channelsGetMembersFilterDtoArr;
        $ENTRIES = new asp(channelsGetMembersFilterDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetMembersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetMembersFilterDto valueOf(String str) {
        return (ChannelsGetMembersFilterDto) Enum.valueOf(ChannelsGetMembersFilterDto.class, str);
    }

    public static ChannelsGetMembersFilterDto[] values() {
        return (ChannelsGetMembersFilterDto[]) $VALUES.clone();
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
