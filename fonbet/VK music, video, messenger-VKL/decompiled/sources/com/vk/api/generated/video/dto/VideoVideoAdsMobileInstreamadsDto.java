package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoVideoAdsMobileInstreamadsDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsMobileInstreamadsDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsMobileInstreamadsDto> CREATOR = new a();

    @pmi0("sections")
    private final VideoVideoAdsInstreamSectionsDto sections;

    /* compiled from: VideoVideoAdsMobileInstreamadsDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsMobileInstreamadsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsMobileInstreamadsDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsMobileInstreamadsDto(VideoVideoAdsInstreamSectionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsMobileInstreamadsDto[] newArray(int i) {
            return new VideoVideoAdsMobileInstreamadsDto[i];
        }
    }

    public VideoVideoAdsMobileInstreamadsDto(VideoVideoAdsInstreamSectionsDto videoVideoAdsInstreamSectionsDto) {
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
        return (obj instanceof VideoVideoAdsMobileInstreamadsDto) && epx.f(this.sections, ((VideoVideoAdsMobileInstreamadsDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return "VideoVideoAdsMobileInstreamadsDto(sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sections.writeToParcel(parcel, i);
    }
}
