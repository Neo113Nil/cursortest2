package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PodcastsPodcastsBlockContainerDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsPodcastsBlockContainerDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsPodcastsBlockContainerDto> CREATOR = new a();

    @pmi0("podcasts_block")
    private final PodcastsPodcastsBlockDto podcastsBlock;

    /* compiled from: PodcastsPodcastsBlockContainerDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsPodcastsBlockContainerDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsPodcastsBlockContainerDto createFromParcel(Parcel parcel) {
            return new PodcastsPodcastsBlockContainerDto(PodcastsPodcastsBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsPodcastsBlockContainerDto[] newArray(int i) {
            return new PodcastsPodcastsBlockContainerDto[i];
        }
    }

    public PodcastsPodcastsBlockContainerDto(PodcastsPodcastsBlockDto podcastsPodcastsBlockDto) {
        this.podcastsBlock = podcastsPodcastsBlockDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastsPodcastsBlockContainerDto) && epx.f(this.podcastsBlock, ((PodcastsPodcastsBlockContainerDto) obj).podcastsBlock);
    }

    public final int hashCode() {
        return this.podcastsBlock.hashCode();
    }

    public final String toString() {
        return "PodcastsPodcastsBlockContainerDto(podcastsBlock=" + this.podcastsBlock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.podcastsBlock.writeToParcel(parcel, i);
    }
}
