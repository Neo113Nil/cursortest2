package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFilesDto;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: TopshelfTopshelfTrailerDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfTrailerDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfTrailerDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("files")
    private final VideoVideoFilesDto files;

    /* compiled from: TopshelfTopshelfTrailerDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfTrailerDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfTrailerDto createFromParcel(Parcel parcel) {
            return new TopshelfTopshelfTrailerDto((VideoVideoFilesDto) parcel.readParcelable(TopshelfTopshelfTrailerDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfTrailerDto[] newArray(int i) {
            return new TopshelfTopshelfTrailerDto[i];
        }
    }

    public TopshelfTopshelfTrailerDto(VideoVideoFilesDto videoVideoFilesDto, int i) {
        this.files = videoVideoFilesDto;
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
        if (!(obj instanceof TopshelfTopshelfTrailerDto)) {
            return false;
        }
        TopshelfTopshelfTrailerDto topshelfTopshelfTrailerDto = (TopshelfTopshelfTrailerDto) obj;
        return epx.f(this.files, topshelfTopshelfTrailerDto.files) && this.duration == topshelfTopshelfTrailerDto.duration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.duration) + (this.files.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfTrailerDto(files=");
        sb.append(this.files);
        sb.append(", duration=");
        return vu5.b(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.files, i);
        parcel.writeInt(this.duration);
    }
}
