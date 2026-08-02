package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ChannelsChannelInfoDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsChannelInfoDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsChannelInfoDto> CREATOR = new a();

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("title")
    private final String title;

    /* compiled from: ChannelsChannelInfoDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsChannelInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelInfoDto createFromParcel(Parcel parcel) {
            return new ChannelsChannelInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelInfoDto[] newArray(int i) {
            return new ChannelsChannelInfoDto[i];
        }
    }

    public ChannelsChannelInfoDto(String str, String str2) {
        this.photoBase = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsChannelInfoDto)) {
            return false;
        }
        ChannelsChannelInfoDto channelsChannelInfoDto = (ChannelsChannelInfoDto) obj;
        return epx.f(this.photoBase, channelsChannelInfoDto.photoBase) && epx.f(this.title, channelsChannelInfoDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.photoBase.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsChannelInfoDto(photoBase=");
        sb.append(this.photoBase);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photoBase);
        parcel.writeString(this.title);
    }
}
