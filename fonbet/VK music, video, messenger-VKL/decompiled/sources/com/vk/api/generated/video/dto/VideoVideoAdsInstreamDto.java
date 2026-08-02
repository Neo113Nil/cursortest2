package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoVideoAdsInstreamDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsInstreamDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsInstreamDto> CREATOR = new a();

    @pmi0("sections")
    private final VideoVideoAdsInstreamSectionsDto sections;

    /* compiled from: VideoVideoAdsInstreamDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsInstreamDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsInstreamDto(VideoVideoAdsInstreamSectionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamDto[] newArray(int i) {
            return new VideoVideoAdsInstreamDto[i];
        }
    }

    public VideoVideoAdsInstreamDto(VideoVideoAdsInstreamSectionsDto videoVideoAdsInstreamSectionsDto) {
        this.sections = videoVideoAdsInstreamSectionsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoVideoAdsInstreamDto) && epx.f(this.sections, ((VideoVideoAdsInstreamDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "VideoVideoAdsInstreamDto(sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sections.writeToParcel(parcel, i);
    }
}
