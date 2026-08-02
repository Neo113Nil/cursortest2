package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: PodcastsCoverImageDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsCoverImageDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsCoverImageDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: PodcastsCoverImageDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsCoverImageDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsCoverImageDto createFromParcel(Parcel parcel) {
            return new PodcastsCoverImageDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsCoverImageDto[] newArray(int i) {
            return new PodcastsCoverImageDto[i];
        }
    }

    public PodcastsCoverImageDto(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastsCoverImageDto) && epx.f(this.url, ((PodcastsCoverImageDto) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PodcastsCoverImageDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
