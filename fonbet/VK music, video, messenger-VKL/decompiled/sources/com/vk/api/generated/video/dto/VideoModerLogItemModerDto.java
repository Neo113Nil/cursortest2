package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VideoModerLogItemModerDto.kt */
/* loaded from: classes15.dex */
public final class VideoModerLogItemModerDto implements Parcelable {
    public static final Parcelable.Creator<VideoModerLogItemModerDto> CREATOR = new a();

    @pmi0("id")
    private final long id;

    @pmi0("link")
    private final String link;

    @pmi0("name")
    private final String name;

    /* compiled from: VideoModerLogItemModerDto.kt */
    public static final class a implements Parcelable.Creator<VideoModerLogItemModerDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoModerLogItemModerDto createFromParcel(Parcel parcel) {
            return new VideoModerLogItemModerDto(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoModerLogItemModerDto[] newArray(int i) {
            return new VideoModerLogItemModerDto[i];
        }
    }

    public VideoModerLogItemModerDto(long j, String str, String str2) {
        this.id = j;
        this.name = str;
        this.link = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoModerLogItemModerDto)) {
            return false;
        }
        VideoModerLogItemModerDto videoModerLogItemModerDto = (VideoModerLogItemModerDto) obj;
        return this.id == videoModerLogItemModerDto.id && epx.f(this.name, videoModerLogItemModerDto.name) && epx.f(this.link, videoModerLogItemModerDto.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + urd0.a(Long.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoModerLogItemModerDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.link);
    }
}
