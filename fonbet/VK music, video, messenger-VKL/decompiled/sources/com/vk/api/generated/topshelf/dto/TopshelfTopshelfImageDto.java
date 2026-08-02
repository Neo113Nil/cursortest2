package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: TopshelfTopshelfImageDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfImageDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfImageDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("url")
    private final String url;

    /* compiled from: TopshelfTopshelfImageDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfImageDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfImageDto createFromParcel(Parcel parcel) {
            return new TopshelfTopshelfImageDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfImageDto[] newArray(int i) {
            return new TopshelfTopshelfImageDto[i];
        }
    }

    public TopshelfTopshelfImageDto(String str, int i) {
        this.url = str;
        this.duration = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfTopshelfImageDto)) {
            return false;
        }
        TopshelfTopshelfImageDto topshelfTopshelfImageDto = (TopshelfTopshelfImageDto) obj;
        return epx.f(this.url, topshelfTopshelfImageDto.url) && this.duration == topshelfTopshelfImageDto.duration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.duration) + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfImageDto(url=");
        sb.append(this.url);
        sb.append(", duration=");
        return vu5.b(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.duration);
    }
}
