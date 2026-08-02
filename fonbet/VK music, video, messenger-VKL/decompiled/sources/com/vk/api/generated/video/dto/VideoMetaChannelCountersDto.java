package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoMetaChannelCountersDto.kt */
/* loaded from: classes15.dex */
public final class VideoMetaChannelCountersDto implements Parcelable {
    public static final Parcelable.Creator<VideoMetaChannelCountersDto> CREATOR = new a();

    @pmi0("authors")
    private final Integer authors;

    /* compiled from: VideoMetaChannelCountersDto.kt */
    public static final class a implements Parcelable.Creator<VideoMetaChannelCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoMetaChannelCountersDto createFromParcel(Parcel parcel) {
            return new VideoMetaChannelCountersDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMetaChannelCountersDto[] newArray(int i) {
            return new VideoMetaChannelCountersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMetaChannelCountersDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoMetaChannelCountersDto) && epx.f(this.authors, ((VideoMetaChannelCountersDto) obj).authors);
    }

    public final int hashCode() {
        Integer num = this.authors;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("VideoMetaChannelCountersDto(authors="), this.authors, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.authors;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoMetaChannelCountersDto(Integer num) {
        this.authors = num;
    }

    public /* synthetic */ VideoMetaChannelCountersDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
