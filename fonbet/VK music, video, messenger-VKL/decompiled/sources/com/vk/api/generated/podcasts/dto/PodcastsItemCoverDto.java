package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PodcastsItemCoverDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsItemCoverDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsItemCoverDto> CREATOR = new a();

    /* renamed from: default, reason: not valid java name */
    @pmi0(BuildConfig.FLAVOR)
    private final PodcastsCoverImageDto f22default;

    /* compiled from: PodcastsItemCoverDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsItemCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsItemCoverDto createFromParcel(Parcel parcel) {
            return new PodcastsItemCoverDto(PodcastsCoverImageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsItemCoverDto[] newArray(int i) {
            return new PodcastsItemCoverDto[i];
        }
    }

    public PodcastsItemCoverDto(PodcastsCoverImageDto podcastsCoverImageDto) {
        this.f22default = podcastsCoverImageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastsItemCoverDto) && epx.f(this.f22default, ((PodcastsItemCoverDto) obj).f22default);
    }

    public final int hashCode() {
        return this.f22default.hashCode();
    }

    public final String toString() {
        return "PodcastsItemCoverDto(default=" + this.f22default + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f22default.writeToParcel(parcel, i);
    }
}
