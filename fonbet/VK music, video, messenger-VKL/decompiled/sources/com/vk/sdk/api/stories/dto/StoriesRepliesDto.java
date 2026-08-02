package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesRepliesDto.kt */
/* loaded from: classes5.dex */
public final class StoriesRepliesDto {

    @pmi0("count")
    private final int count;

    /* renamed from: new, reason: not valid java name */
    @pmi0("new")
    private final Integer f38new;

    public StoriesRepliesDto(int i, Integer num) {
        this.count = i;
        this.f38new = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesRepliesDto)) {
            return false;
        }
        StoriesRepliesDto storiesRepliesDto = (StoriesRepliesDto) obj;
        return this.count == storiesRepliesDto.count && epx.f(this.f38new, storiesRepliesDto.f38new);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.f38new;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "StoriesRepliesDto(count=" + this.count + ", new=" + this.f38new + ")";
    }

    public /* synthetic */ StoriesRepliesDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
