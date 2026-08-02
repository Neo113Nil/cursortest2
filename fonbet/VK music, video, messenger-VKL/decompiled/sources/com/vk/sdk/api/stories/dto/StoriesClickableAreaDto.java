package com.vk.sdk.api.stories.dto;

import xsna.pmi0;
import xsna.sl9;

/* compiled from: StoriesClickableAreaDto.kt */
/* loaded from: classes5.dex */
public final class StoriesClickableAreaDto {

    @pmi0("x")
    private final int x;

    @pmi0("y")
    private final int y;

    public StoriesClickableAreaDto(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableAreaDto)) {
            return false;
        }
        StoriesClickableAreaDto storiesClickableAreaDto = (StoriesClickableAreaDto) obj;
        return this.x == storiesClickableAreaDto.x && this.y == storiesClickableAreaDto.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
    }

    public final String toString() {
        return sl9.c(this.x, this.y, "StoriesClickableAreaDto(x=", ", y=", ")");
    }
}
