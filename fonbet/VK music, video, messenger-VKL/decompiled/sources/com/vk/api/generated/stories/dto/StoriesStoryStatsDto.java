package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesStoryStatsDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryStatsDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStoryStatsDto> CREATOR = new a();

    @pmi0("answer")
    private final StoriesStoryStatsStatDto answer;

    @pmi0("bans")
    private final StoriesStoryStatsStatDto bans;

    @pmi0("likes")
    private final StoriesStoryStatsStatDto likes;

    @pmi0("open_link")
    private final StoriesStoryStatsStatDto openLink;

    @pmi0("replies")
    private final StoriesStoryStatsStatDto replies;

    @pmi0("shares")
    private final StoriesStoryStatsStatDto shares;

    @pmi0("subscribers")
    private final StoriesStoryStatsStatDto subscribers;

    @pmi0("views")
    private final StoriesStoryStatsStatDto views;

    /* compiled from: StoriesStoryStatsDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryStatsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<StoriesStoryStatsStatDto> creator = StoriesStoryStatsStatDto.CREATOR;
            return new StoriesStoryStatsDto(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryStatsDto[] newArray(int i) {
            return new StoriesStoryStatsDto[i];
        }
    }

    public StoriesStoryStatsDto(StoriesStoryStatsStatDto storiesStoryStatsStatDto, StoriesStoryStatsStatDto storiesStoryStatsStatDto2, StoriesStoryStatsStatDto storiesStoryStatsStatDto3, StoriesStoryStatsStatDto storiesStoryStatsStatDto4, StoriesStoryStatsStatDto storiesStoryStatsStatDto5, StoriesStoryStatsStatDto storiesStoryStatsStatDto6, StoriesStoryStatsStatDto storiesStoryStatsStatDto7, StoriesStoryStatsStatDto storiesStoryStatsStatDto8) {
        this.answer = storiesStoryStatsStatDto;
        this.bans = storiesStoryStatsStatDto2;
        this.openLink = storiesStoryStatsStatDto3;
        this.replies = storiesStoryStatsStatDto4;
        this.shares = storiesStoryStatsStatDto5;
        this.subscribers = storiesStoryStatsStatDto6;
        this.views = storiesStoryStatsStatDto7;
        this.likes = storiesStoryStatsStatDto8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryStatsDto)) {
            return false;
        }
        StoriesStoryStatsDto storiesStoryStatsDto = (StoriesStoryStatsDto) obj;
        return epx.f(this.answer, storiesStoryStatsDto.answer) && epx.f(this.bans, storiesStoryStatsDto.bans) && epx.f(this.openLink, storiesStoryStatsDto.openLink) && epx.f(this.replies, storiesStoryStatsDto.replies) && epx.f(this.shares, storiesStoryStatsDto.shares) && epx.f(this.subscribers, storiesStoryStatsDto.subscribers) && epx.f(this.views, storiesStoryStatsDto.views) && epx.f(this.likes, storiesStoryStatsDto.likes);
    }

    public final int hashCode() {
        return this.likes.hashCode() + ((this.views.hashCode() + ((this.subscribers.hashCode() + ((this.shares.hashCode() + ((this.replies.hashCode() + ((this.openLink.hashCode() + ((this.bans.hashCode() + (this.answer.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StoriesStoryStatsDto(answer=" + this.answer + ", bans=" + this.bans + ", openLink=" + this.openLink + ", replies=" + this.replies + ", shares=" + this.shares + ", subscribers=" + this.subscribers + ", views=" + this.views + ", likes=" + this.likes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.answer.writeToParcel(parcel, i);
        this.bans.writeToParcel(parcel, i);
        this.openLink.writeToParcel(parcel, i);
        this.replies.writeToParcel(parcel, i);
        this.shares.writeToParcel(parcel, i);
        this.subscribers.writeToParcel(parcel, i);
        this.views.writeToParcel(parcel, i);
        this.likes.writeToParcel(parcel, i);
    }
}
