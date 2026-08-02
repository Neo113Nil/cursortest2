package com.vk.repository.internal.repos.stickers.database.converters.dto;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;

/* compiled from: StickerItemDto.kt */
/* loaded from: classes5.dex */
public final class StickerItemDto {

    @pmi0("animations")
    private final StickerAnimationDto animations;

    @pmi0("config")
    private final ImageConfigIdDto config;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final ImageListDto images;

    @pmi0("imagesWithBackground")
    private final ImageListDto imagesWithBackground;

    @pmi0("isAllowed")
    private final boolean isAllowed;

    @pmi0("popupAnimation")
    private final PopupStickerAnimationDto popupAnimation;

    @pmi0(InAppPurchaseMetaData.KEY_PRODUCT_ID)
    private final int productId;

    @pmi0("render")
    private final StickerRenderDto render;

    @pmi0("vmojiCharacter")
    private final String vmojiCharacter;

    public StickerItemDto(int i, int i2, ImageListDto imageListDto, ImageListDto imageListDto2, ImageConfigIdDto imageConfigIdDto, StickerAnimationDto stickerAnimationDto, boolean z, StickerRenderDto stickerRenderDto, String str, PopupStickerAnimationDto popupStickerAnimationDto) {
        this.id = i;
        this.productId = i2;
        this.images = imageListDto;
        this.imagesWithBackground = imageListDto2;
        this.config = imageConfigIdDto;
        this.animations = stickerAnimationDto;
        this.isAllowed = z;
        this.render = stickerRenderDto;
        this.vmojiCharacter = str;
        this.popupAnimation = popupStickerAnimationDto;
    }

    public final StickerAnimationDto a() {
        return this.animations;
    }

    public final ImageConfigIdDto b() {
        return this.config;
    }

    public final int c() {
        return this.id;
    }

    public final ImageListDto d() {
        return this.images;
    }

    public final ImageListDto e() {
        return this.imagesWithBackground;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemDto)) {
            return false;
        }
        StickerItemDto stickerItemDto = (StickerItemDto) obj;
        return this.id == stickerItemDto.id && this.productId == stickerItemDto.productId && epx.f(this.images, stickerItemDto.images) && epx.f(this.imagesWithBackground, stickerItemDto.imagesWithBackground) && epx.f(this.config, stickerItemDto.config) && epx.f(this.animations, stickerItemDto.animations) && this.isAllowed == stickerItemDto.isAllowed && epx.f(this.render, stickerItemDto.render) && epx.f(this.vmojiCharacter, stickerItemDto.vmojiCharacter) && epx.f(this.popupAnimation, stickerItemDto.popupAnimation);
    }

    public final PopupStickerAnimationDto f() {
        return this.popupAnimation;
    }

    public final int g() {
        return this.productId;
    }

    public final StickerRenderDto h() {
        return this.render;
    }

    public final int hashCode() {
        int hashCode = (this.imagesWithBackground.hashCode() + ((this.images.hashCode() + shy.a(this.productId, Integer.hashCode(this.id) * 31, 31)) * 31)) * 31;
        ImageConfigIdDto imageConfigIdDto = this.config;
        int b = qoy.b((this.animations.hashCode() + ((hashCode + (imageConfigIdDto == null ? 0 : imageConfigIdDto.hashCode())) * 31)) * 31, 31, this.isAllowed);
        StickerRenderDto stickerRenderDto = this.render;
        int hashCode2 = (b + (stickerRenderDto == null ? 0 : stickerRenderDto.hashCode())) * 31;
        String str = this.vmojiCharacter;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PopupStickerAnimationDto popupStickerAnimationDto = this.popupAnimation;
        return hashCode3 + (popupStickerAnimationDto != null ? popupStickerAnimationDto.hashCode() : 0);
    }

    public final String i() {
        return this.vmojiCharacter;
    }

    public final boolean j() {
        return this.isAllowed;
    }

    public final String toString() {
        return "StickerItemDto(id=" + this.id + ", productId=" + this.productId + ", images=" + this.images + ", imagesWithBackground=" + this.imagesWithBackground + ", config=" + this.config + ", animations=" + this.animations + ", isAllowed=" + this.isAllowed + ", render=" + this.render + ", vmojiCharacter=" + this.vmojiCharacter + ", popupAnimation=" + this.popupAnimation + ')';
    }
}
