package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: BaseOwnerCoverCropParamsDto.kt */
/* loaded from: classes5.dex */
public final class BaseOwnerCoverCropParamsDto {

    @pmi0("height")
    private final Integer height;

    @pmi0("width")
    private final Integer width;

    @pmi0("x")
    private final Integer x;

    @pmi0("y")
    private final Integer y;

    public BaseOwnerCoverCropParamsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOwnerCoverCropParamsDto)) {
            return false;
        }
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = (BaseOwnerCoverCropParamsDto) obj;
        return epx.f(this.x, baseOwnerCoverCropParamsDto.x) && epx.f(this.y, baseOwnerCoverCropParamsDto.y) && epx.f(this.width, baseOwnerCoverCropParamsDto.width) && epx.f(this.height, baseOwnerCoverCropParamsDto.height);
    }

    public final int hashCode() {
        Integer num = this.x;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.y;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.x;
        Integer num2 = this.y;
        Integer num3 = this.width;
        Integer num4 = this.height;
        StringBuilder a = wr.a(num, "BaseOwnerCoverCropParamsDto(x=", num2, ", y=", ", width=");
        a.append(num3);
        a.append(", height=");
        a.append(num4);
        a.append(")");
        return a.toString();
    }

    public BaseOwnerCoverCropParamsDto(Integer num, Integer num2, Integer num3, Integer num4) {
        this.x = num;
        this.y = num2;
        this.width = num3;
        this.height = num4;
    }

    public /* synthetic */ BaseOwnerCoverCropParamsDto(Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
