package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoChannelsAPlusMarkDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsAPlusMarkDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsAPlusMarkDto> CREATOR = new a();

    @pmi0("license_id")
    private final String licenseId;

    @pmi0("rkn_url")
    private final String rknUrl;

    /* compiled from: VideoChannelsAPlusMarkDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsAPlusMarkDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsAPlusMarkDto createFromParcel(Parcel parcel) {
            return new VideoChannelsAPlusMarkDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsAPlusMarkDto[] newArray(int i) {
            return new VideoChannelsAPlusMarkDto[i];
        }
    }

    public VideoChannelsAPlusMarkDto(String str, String str2) {
        this.licenseId = str;
        this.rknUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsAPlusMarkDto)) {
            return false;
        }
        VideoChannelsAPlusMarkDto videoChannelsAPlusMarkDto = (VideoChannelsAPlusMarkDto) obj;
        return epx.f(this.licenseId, videoChannelsAPlusMarkDto.licenseId) && epx.f(this.rknUrl, videoChannelsAPlusMarkDto.rknUrl);
    }

    public final int hashCode() {
        return this.rknUrl.hashCode() + (this.licenseId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsAPlusMarkDto(licenseId=");
        sb.append(this.licenseId);
        sb.append(", rknUrl=");
        return ho8.a(sb, this.rknUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.licenseId);
        parcel.writeString(this.rknUrl);
    }
}
