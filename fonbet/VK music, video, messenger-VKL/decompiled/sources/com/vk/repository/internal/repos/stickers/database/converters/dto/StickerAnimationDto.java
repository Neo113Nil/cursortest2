package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StickerAnimationDto.kt */
/* loaded from: classes5.dex */
public final class StickerAnimationDto {

    @pmi0("animation")
    private final String animation;

    @pmi0("animationWithBg")
    private final String animationWithBg;

    public StickerAnimationDto(String str, String str2) {
        this.animation = str;
        this.animationWithBg = str2;
    }

    public final String a() {
        return this.animation;
    }

    public final String b() {
        return this.animationWithBg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimationDto)) {
            return false;
        }
        StickerAnimationDto stickerAnimationDto = (StickerAnimationDto) obj;
        return epx.f(this.animation, stickerAnimationDto.animation) && epx.f(this.animationWithBg, stickerAnimationDto.animationWithBg);
    }

    public final int hashCode() {
        return this.animationWithBg.hashCode() + (this.animation.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerAnimationDto(animation=");
        sb.append(this.animation);
        sb.append(", animationWithBg=");
        return ho8.a(sb, this.animationWithBg, ')');
    }
}
