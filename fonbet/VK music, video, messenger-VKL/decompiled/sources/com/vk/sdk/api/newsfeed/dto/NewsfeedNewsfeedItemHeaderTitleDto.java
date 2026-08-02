package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderTitleDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderTitleDto {

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderTitleDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderTitleDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = (NewsfeedNewsfeedItemHeaderTitleDto) obj;
        return epx.f(this.sourceId, newsfeedNewsfeedItemHeaderTitleDto.sourceId) && epx.f(this.text, newsfeedNewsfeedItemHeaderTitleDto.text);
    }

    public final int hashCode() {
        UserId userId = this.sourceId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        return hashCode + (newsfeedNewsfeedItemHeaderTextDto != null ? newsfeedNewsfeedItemHeaderTextDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderTitleDto(sourceId=" + this.sourceId + ", text=" + this.text + ")";
    }

    public NewsfeedNewsfeedItemHeaderTitleDto(UserId userId, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto) {
        this.sourceId = userId;
        this.text = newsfeedNewsfeedItemHeaderTextDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderTitleDto(UserId userId, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto);
    }
}
