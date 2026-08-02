package com.vk.sdk.api.link.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LinkTargetObjectDto.kt */
/* loaded from: classes5.dex */
public final class LinkTargetObjectDto {

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final String type;

    public LinkTargetObjectDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkTargetObjectDto)) {
            return false;
        }
        LinkTargetObjectDto linkTargetObjectDto = (LinkTargetObjectDto) obj;
        return epx.f(this.type, linkTargetObjectDto.type) && epx.f(this.ownerId, linkTargetObjectDto.ownerId) && epx.f(this.itemId, linkTargetObjectDto.itemId);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.itemId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        UserId userId = this.ownerId;
        Integer num = this.itemId;
        StringBuilder sb = new StringBuilder("LinkTargetObjectDto(type=");
        sb.append(str);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", itemId=");
        return oq.b(sb, num, ")");
    }

    public LinkTargetObjectDto(String str, UserId userId, Integer num) {
        this.type = str;
        this.ownerId = userId;
        this.itemId = num;
    }

    public /* synthetic */ LinkTargetObjectDto(String str, UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
