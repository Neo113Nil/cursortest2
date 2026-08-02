package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesStoryStatsStatDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStoryStatsStatDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("state")
    private final StoriesStoryStatsStateDto state;

    public StoriesStoryStatsStatDto(StoriesStoryStatsStateDto storiesStoryStatsStateDto, Integer num) {
        this.state = storiesStoryStatsStateDto;
        this.count = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryStatsStatDto)) {
            return false;
        }
        StoriesStoryStatsStatDto storiesStoryStatsStatDto = (StoriesStoryStatsStatDto) obj;
        return this.state == storiesStoryStatsStatDto.state && epx.f(this.count, storiesStoryStatsStatDto.count);
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        Integer num = this.count;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "StoriesStoryStatsStatDto(state=" + this.state + ", count=" + this.count + ")";
    }

    public /* synthetic */ StoriesStoryStatsStatDto(StoriesStoryStatsStateDto storiesStoryStatsStateDto, Integer num, int i, zcl zclVar) {
        this(storiesStoryStatsStateDto, (i & 2) != 0 ? null : num);
    }
}
