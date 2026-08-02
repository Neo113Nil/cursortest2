package com.vk.sdk.api.ads.dto;

import xsna.pmi0;
import xsna.sl9;

/* compiled from: AdsSaveLookalikeRequestResultResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsSaveLookalikeRequestResultResponseDto {

    @pmi0("audience_count")
    private final int audienceCount;

    @pmi0("retargeting_group_id")
    private final int retargetingGroupId;

    public AdsSaveLookalikeRequestResultResponseDto(int i, int i2) {
        this.retargetingGroupId = i;
        this.audienceCount = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsSaveLookalikeRequestResultResponseDto)) {
            return false;
        }
        AdsSaveLookalikeRequestResultResponseDto adsSaveLookalikeRequestResultResponseDto = (AdsSaveLookalikeRequestResultResponseDto) obj;
        return this.retargetingGroupId == adsSaveLookalikeRequestResultResponseDto.retargetingGroupId && this.audienceCount == adsSaveLookalikeRequestResultResponseDto.audienceCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.audienceCount) + (Integer.hashCode(this.retargetingGroupId) * 31);
    }

    public final String toString() {
        return sl9.c(this.retargetingGroupId, this.audienceCount, "AdsSaveLookalikeRequestResultResponseDto(retargetingGroupId=", ", audienceCount=", ")");
    }
}
