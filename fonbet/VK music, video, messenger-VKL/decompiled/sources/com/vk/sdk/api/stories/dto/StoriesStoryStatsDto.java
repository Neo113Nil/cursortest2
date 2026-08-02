package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesStoryStatsDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStoryStatsDto {

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
        return "StoriesStoryStatsDto(answer=" + this.answer + ", bans=" + this.bans + ", openLink=" + this.openLink + ", replies=" + this.replies + ", shares=" + this.shares + ", subscribers=" + this.subscribers + ", views=" + this.views + ", likes=" + this.likes + ")";
    }
}
