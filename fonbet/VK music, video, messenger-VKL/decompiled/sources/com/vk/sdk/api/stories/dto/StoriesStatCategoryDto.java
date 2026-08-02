package com.vk.sdk.api.stories.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesStatCategoryDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStatCategoryDto {

    @pmi0("header")
    private final String header;

    @pmi0("lines")
    private final List<StoriesStatLineDto> lines;

    public StoriesStatCategoryDto(String str, List<StoriesStatLineDto> list) {
        this.header = str;
        this.lines = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStatCategoryDto)) {
            return false;
        }
        StoriesStatCategoryDto storiesStatCategoryDto = (StoriesStatCategoryDto) obj;
        return epx.f(this.header, storiesStatCategoryDto.header) && epx.f(this.lines, storiesStatCategoryDto.lines);
    }

    public final int hashCode() {
        return this.lines.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return "StoriesStatCategoryDto(header=" + this.header + ", lines=" + this.lines + ")";
    }
}
