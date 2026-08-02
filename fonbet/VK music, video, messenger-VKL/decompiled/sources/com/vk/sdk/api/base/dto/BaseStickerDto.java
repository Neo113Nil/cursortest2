package com.vk.sdk.api.base.dto;

import com.vk.movika.sdk.base.model.history.b;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vq;
import xsna.wr;
import xsna.xq;
import xsna.zcl;

/* compiled from: BaseStickerDto.kt */
/* loaded from: classes5.dex */
public final class BaseStickerDto {

    @pmi0("animation_url")
    private final String animationUrl;

    @pmi0("animations")
    private final List<BaseStickerAnimationDto> animations;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("images_with_background")
    private final List<BaseImageDto> imagesWithBackground;

    @pmi0("is_allowed")
    private final Boolean isAllowed;

    @pmi0("product_id")
    private final Integer productId;

    @pmi0("sticker_id")
    private final Integer stickerId;

    public BaseStickerDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerDto)) {
            return false;
        }
        BaseStickerDto baseStickerDto = (BaseStickerDto) obj;
        return epx.f(this.stickerId, baseStickerDto.stickerId) && epx.f(this.productId, baseStickerDto.productId) && epx.f(this.images, baseStickerDto.images) && epx.f(this.imagesWithBackground, baseStickerDto.imagesWithBackground) && epx.f(this.animationUrl, baseStickerDto.animationUrl) && epx.f(this.animations, baseStickerDto.animations) && epx.f(this.isAllowed, baseStickerDto.isAllowed);
    }

    public final int hashCode() {
        Integer num = this.stickerId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.productId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.imagesWithBackground;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.animationUrl;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseStickerAnimationDto> list3 = this.animations;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.isAllowed;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.stickerId;
        Integer num2 = this.productId;
        List<BaseImageDto> list = this.images;
        List<BaseImageDto> list2 = this.imagesWithBackground;
        String str = this.animationUrl;
        List<BaseStickerAnimationDto> list3 = this.animations;
        Boolean bool = this.isAllowed;
        StringBuilder a = wr.a(num, "BaseStickerDto(stickerId=", num2, ", productId=", ", images=");
        vq.d(a, list, ", imagesWithBackground=", list2, ", animationUrl=");
        b.c(str, ", animations=", ", isAllowed=", a, list3);
        return xq.d(a, bool, ")");
    }

    public BaseStickerDto(Integer num, Integer num2, List<BaseImageDto> list, List<BaseImageDto> list2, String str, List<BaseStickerAnimationDto> list3, Boolean bool) {
        this.stickerId = num;
        this.productId = num2;
        this.images = list;
        this.imagesWithBackground = list2;
        this.animationUrl = str;
        this.animations = list3;
        this.isAllowed = bool;
    }

    public /* synthetic */ BaseStickerDto(Integer num, Integer num2, List list, List list2, String str, List list3, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : bool);
    }
}
