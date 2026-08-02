package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsSetConfigResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSetConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsSetConfigResponseDto> CREATOR = new a();

    @pmi0("config_version")
    private final int configVersion;

    /* compiled from: ChannelsSetConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSetConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSetConfigResponseDto createFromParcel(Parcel parcel) {
            return new ChannelsSetConfigResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSetConfigResponseDto[] newArray(int i) {
            return new ChannelsSetConfigResponseDto[i];
        }
    }

    public ChannelsSetConfigResponseDto(int i) {
        this.configVersion = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsSetConfigResponseDto) && this.configVersion == ((ChannelsSetConfigResponseDto) obj).configVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.configVersion);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ChannelsSetConfigResponseDto(configVersion="), this.configVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.configVersion);
    }
}
