package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsGetFilterDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsGetFilterDto[] $VALUES;

    @pmi0("all")
    public static final ChannelsGetFilterDto ALL;

    @pmi0("archived")
    public static final ChannelsGetFilterDto ARCHIVED;
    public static final Parcelable.Creator<ChannelsGetFilterDto> CREATOR;

    @pmi0("editor")
    public static final ChannelsGetFilterDto EDITOR;

    @pmi0("inbound_request")
    public static final ChannelsGetFilterDto INBOUND_REQUEST;

    @pmi0("unread")
    public static final ChannelsGetFilterDto UNREAD;
    private final String value;

    /* compiled from: ChannelsGetFilterDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetFilterDto createFromParcel(Parcel parcel) {
            return ChannelsGetFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetFilterDto[] newArray(int i) {
            return new ChannelsGetFilterDto[i];
        }
    }

    static {
        ChannelsGetFilterDto channelsGetFilterDto = new ChannelsGetFilterDto("ALL", 0, "all");
        ALL = channelsGetFilterDto;
        ChannelsGetFilterDto channelsGetFilterDto2 = new ChannelsGetFilterDto("ARCHIVED", 1, "archived");
        ARCHIVED = channelsGetFilterDto2;
        ChannelsGetFilterDto channelsGetFilterDto3 = new ChannelsGetFilterDto("EDITOR", 2, "editor");
        EDITOR = channelsGetFilterDto3;
        ChannelsGetFilterDto channelsGetFilterDto4 = new ChannelsGetFilterDto("INBOUND_REQUEST", 3, "inbound_request");
        INBOUND_REQUEST = channelsGetFilterDto4;
        ChannelsGetFilterDto channelsGetFilterDto5 = new ChannelsGetFilterDto("UNREAD", 4, "unread");
        UNREAD = channelsGetFilterDto5;
        ChannelsGetFilterDto[] channelsGetFilterDtoArr = {channelsGetFilterDto, channelsGetFilterDto2, channelsGetFilterDto3, channelsGetFilterDto4, channelsGetFilterDto5};
        $VALUES = channelsGetFilterDtoArr;
        $ENTRIES = new asp(channelsGetFilterDtoArr);
        CREATOR = new a();
    }

    private ChannelsGetFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsGetFilterDto valueOf(String str) {
        return (ChannelsGetFilterDto) Enum.valueOf(ChannelsGetFilterDto.class, str);
    }

    public static ChannelsGetFilterDto[] values() {
        return (ChannelsGetFilterDto[]) $VALUES.clone();
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
