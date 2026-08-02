package com.vk.sdk.api.widgets.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WidgetsCommentMediaDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsCommentMediaDto {

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("thumb_src")
    private final String thumbSrc;

    @pmi0("type")
    private final WidgetsCommentMediaTypeDto type;

    public WidgetsCommentMediaDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentMediaDto)) {
            return false;
        }
        WidgetsCommentMediaDto widgetsCommentMediaDto = (WidgetsCommentMediaDto) obj;
        return epx.f(this.itemId, widgetsCommentMediaDto.itemId) && epx.f(this.ownerId, widgetsCommentMediaDto.ownerId) && epx.f(this.thumbSrc, widgetsCommentMediaDto.thumbSrc) && this.type == widgetsCommentMediaDto.type;
    }

    public final int hashCode() {
        Integer num = this.itemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.thumbSrc;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto = this.type;
        return hashCode3 + (widgetsCommentMediaTypeDto != null ? widgetsCommentMediaTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "WidgetsCommentMediaDto(itemId=" + this.itemId + ", ownerId=" + this.ownerId + ", thumbSrc=" + this.thumbSrc + ", type=" + this.type + ")";
    }

    public WidgetsCommentMediaDto(Integer num, UserId userId, String str, WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto) {
        this.itemId = num;
        this.ownerId = userId;
        this.thumbSrc = str;
        this.type = widgetsCommentMediaTypeDto;
    }

    public /* synthetic */ WidgetsCommentMediaDto(Integer num, UserId userId, String str, WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : widgetsCommentMediaTypeDto);
    }
}
