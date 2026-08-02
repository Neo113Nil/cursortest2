package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: NewsfeedListDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedListDto {

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    public NewsfeedListDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedListDto)) {
            return false;
        }
        NewsfeedListDto newsfeedListDto = (NewsfeedListDto) obj;
        return this.id == newsfeedListDto.id && epx.f(this.title, newsfeedListDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "NewsfeedListDto(id=", ", title=", this.title, ")");
    }
}
