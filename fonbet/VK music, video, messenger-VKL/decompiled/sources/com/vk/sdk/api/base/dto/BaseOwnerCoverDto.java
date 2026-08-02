package com.vk.sdk.api.base.dto;

import java.util.List;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseOwnerCoverDto.kt */
/* loaded from: classes5.dex */
public final class BaseOwnerCoverDto {

    @pmi0("crop_params")
    private final BaseOwnerCoverCropParamsDto cropParams;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("original_image")
    private final BaseImageDto originalImage;

    @pmi0("photo_id")
    private final Integer photoId;

    public BaseOwnerCoverDto(BaseBoolIntDto baseBoolIntDto, List<BaseImageDto> list, BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto, BaseImageDto baseImageDto, Integer num) {
        this.enabled = baseBoolIntDto;
        this.images = list;
        this.cropParams = baseOwnerCoverCropParamsDto;
        this.originalImage = baseImageDto;
        this.photoId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOwnerCoverDto)) {
            return false;
        }
        BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) obj;
        return this.enabled == baseOwnerCoverDto.enabled && epx.f(this.images, baseOwnerCoverDto.images) && epx.f(this.cropParams, baseOwnerCoverDto.cropParams) && epx.f(this.originalImage, baseOwnerCoverDto.originalImage) && epx.f(this.photoId, baseOwnerCoverDto.photoId);
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        List<BaseImageDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = this.cropParams;
        int hashCode3 = (hashCode2 + (baseOwnerCoverCropParamsDto == null ? 0 : baseOwnerCoverCropParamsDto.hashCode())) * 31;
        BaseImageDto baseImageDto = this.originalImage;
        int hashCode4 = (hashCode3 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        Integer num = this.photoId;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        BaseBoolIntDto baseBoolIntDto = this.enabled;
        List<BaseImageDto> list = this.images;
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = this.cropParams;
        BaseImageDto baseImageDto = this.originalImage;
        Integer num = this.photoId;
        StringBuilder sb = new StringBuilder("BaseOwnerCoverDto(enabled=");
        sb.append(baseBoolIntDto);
        sb.append(", images=");
        sb.append(list);
        sb.append(", cropParams=");
        sb.append(baseOwnerCoverCropParamsDto);
        sb.append(", originalImage=");
        sb.append(baseImageDto);
        sb.append(", photoId=");
        return oq.b(sb, num, ")");
    }

    public /* synthetic */ BaseOwnerCoverDto(BaseBoolIntDto baseBoolIntDto, List list, BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto, BaseImageDto baseImageDto, Integer num, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : baseOwnerCoverCropParamsDto, (i & 8) != 0 ? null : baseImageDto, (i & 16) != 0 ? null : num);
    }
}
