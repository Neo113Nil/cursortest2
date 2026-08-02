package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoVideoAdsSportDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsSportDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsSportDto> CREATOR = new a();

    @pmi0("sections")
    private final VideoVideoAdsSportSectionsDto sections;

    /* compiled from: VideoVideoAdsSportDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsSportDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsSportDto(VideoVideoAdsSportSectionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportDto[] newArray(int i) {
            return new VideoVideoAdsSportDto[i];
        }
    }

    public VideoVideoAdsSportDto(VideoVideoAdsSportSectionsDto videoVideoAdsSportSectionsDto) {
        this.sections = videoVideoAdsSportSectionsDto;
    }

    public final VideoVideoAdsSportSectionsDto d() {
        return this.sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoVideoAdsSportDto) && epx.f(this.sections, ((VideoVideoAdsSportDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "VideoVideoAdsSportDto(sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sections.writeToParcel(parcel, i);
    }
}
