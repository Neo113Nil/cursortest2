package com.vk.sdk.api.utils.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsDomainResolvedDto.kt */
/* loaded from: classes5.dex */
public final class UtilsDomainResolvedDto {

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0("type")
    private final UtilsDomainResolvedTypeDto type;

    public UtilsDomainResolvedDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsDomainResolvedDto)) {
            return false;
        }
        UtilsDomainResolvedDto utilsDomainResolvedDto = (UtilsDomainResolvedDto) obj;
        return epx.f(this.objectId, utilsDomainResolvedDto.objectId) && epx.f(this.groupId, utilsDomainResolvedDto.groupId) && this.type == utilsDomainResolvedDto.type;
    }

    public final int hashCode() {
        Integer num = this.objectId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.groupId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = this.type;
        return hashCode2 + (utilsDomainResolvedTypeDto != null ? utilsDomainResolvedTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsDomainResolvedDto(objectId=" + this.objectId + ", groupId=" + this.groupId + ", type=" + this.type + ")";
    }

    public UtilsDomainResolvedDto(Integer num, UserId userId, UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto) {
        this.objectId = num;
        this.groupId = userId;
        this.type = utilsDomainResolvedTypeDto;
    }

    public /* synthetic */ UtilsDomainResolvedDto(Integer num, UserId userId, UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : utilsDomainResolvedTypeDto);
    }
}
