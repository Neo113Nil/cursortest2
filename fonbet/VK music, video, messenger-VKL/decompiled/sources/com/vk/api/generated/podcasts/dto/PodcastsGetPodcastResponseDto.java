package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PodcastsGetPodcastResponseDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsGetPodcastResponseDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsGetPodcastResponseDto> CREATOR = new a();

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("podcast")
    private final PodcastsBlockPodcastDto podcast;

    /* compiled from: PodcastsGetPodcastResponseDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsGetPodcastResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsGetPodcastResponseDto createFromParcel(Parcel parcel) {
            return new PodcastsGetPodcastResponseDto(PodcastsBlockPodcastDto.CREATOR.createFromParcel(parcel), (GroupsGroupFullDto) parcel.readParcelable(PodcastsGetPodcastResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsGetPodcastResponseDto[] newArray(int i) {
            return new PodcastsGetPodcastResponseDto[i];
        }
    }

    public PodcastsGetPodcastResponseDto(PodcastsBlockPodcastDto podcastsBlockPodcastDto, GroupsGroupFullDto groupsGroupFullDto) {
        this.podcast = podcastsBlockPodcastDto;
        this.group = groupsGroupFullDto;
    }

    public final PodcastsBlockPodcastDto d() {
        return this.podcast;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsGetPodcastResponseDto)) {
            return false;
        }
        PodcastsGetPodcastResponseDto podcastsGetPodcastResponseDto = (PodcastsGetPodcastResponseDto) obj;
        return epx.f(this.podcast, podcastsGetPodcastResponseDto.podcast) && epx.f(this.group, podcastsGetPodcastResponseDto.group);
    }

    public final int hashCode() {
        return this.group.hashCode() + (this.podcast.hashCode() * 31);
    }

    public final String toString() {
        return "PodcastsGetPodcastResponseDto(podcast=" + this.podcast + ", group=" + this.group + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.podcast.writeToParcel(parcel, i);
        parcel.writeParcelable(this.group, i);
    }
}
