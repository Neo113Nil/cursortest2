package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.jq;
import xsna.pmi0;
import xsna.xq;
import xsna.zcl;

/* compiled from: StoriesStatLineDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStatLineDto {

    @pmi0("counter")
    private final Integer counter;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("name")
    private final String name;

    public StoriesStatLineDto(String str, Integer num, Boolean bool) {
        this.name = str;
        this.counter = num;
        this.isUnavailable = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStatLineDto)) {
            return false;
        }
        StoriesStatLineDto storiesStatLineDto = (StoriesStatLineDto) obj;
        return epx.f(this.name, storiesStatLineDto.name) && epx.f(this.counter, storiesStatLineDto.counter) && epx.f(this.isUnavailable, storiesStatLineDto.isUnavailable);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.counter;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isUnavailable;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        Integer num = this.counter;
        return xq.d(jq.d(num, "StoriesStatLineDto(name=", str, ", counter=", ", isUnavailable="), this.isUnavailable, ")");
    }

    public /* synthetic */ StoriesStatLineDto(String str, Integer num, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}
