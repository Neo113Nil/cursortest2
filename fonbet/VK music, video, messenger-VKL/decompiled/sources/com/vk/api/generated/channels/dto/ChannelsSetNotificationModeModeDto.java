package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelsSetNotificationModeModeDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSetNotificationModeModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelsSetNotificationModeModeDto[] $VALUES;
    public static final Parcelable.Creator<ChannelsSetNotificationModeModeDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final ChannelsSetNotificationModeModeDto DISABLED;

    @pmi0("enabled")
    public static final ChannelsSetNotificationModeModeDto ENABLED;
    private final String value;

    /* compiled from: ChannelsSetNotificationModeModeDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSetNotificationModeModeDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSetNotificationModeModeDto createFromParcel(Parcel parcel) {
            return ChannelsSetNotificationModeModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSetNotificationModeModeDto[] newArray(int i) {
            return new ChannelsSetNotificationModeModeDto[i];
        }
    }

    static {
        ChannelsSetNotificationModeModeDto channelsSetNotificationModeModeDto = new ChannelsSetNotificationModeModeDto("DISABLED", 0, C4217a2.e);
        DISABLED = channelsSetNotificationModeModeDto;
        ChannelsSetNotificationModeModeDto channelsSetNotificationModeModeDto2 = new ChannelsSetNotificationModeModeDto("ENABLED", 1, "enabled");
        ENABLED = channelsSetNotificationModeModeDto2;
        ChannelsSetNotificationModeModeDto[] channelsSetNotificationModeModeDtoArr = {channelsSetNotificationModeModeDto, channelsSetNotificationModeModeDto2};
        $VALUES = channelsSetNotificationModeModeDtoArr;
        $ENTRIES = new asp(channelsSetNotificationModeModeDtoArr);
        CREATOR = new a();
    }

    private ChannelsSetNotificationModeModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelsSetNotificationModeModeDto valueOf(String str) {
        return (ChannelsSetNotificationModeModeDto) Enum.valueOf(ChannelsSetNotificationModeModeDto.class, str);
    }

    public static ChannelsSetNotificationModeModeDto[] values() {
        return (ChannelsSetNotificationModeModeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
