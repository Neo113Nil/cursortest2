package com.vk.repository.internal.repos.stickers.database.converters.dto;

import com.ironsource.X3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PopupStickerAnimationLayerDto.kt */
/* loaded from: classes5.dex */
public abstract class PopupStickerAnimationLayerDto {

    /* compiled from: PopupStickerAnimationLayerDto.kt */
    public static final class PopupStickerFixedAnimationLayerDto extends PopupStickerAnimationLayerDto {

        @pmi0("loopsLimit")
        private final int loopsLimit;

        @pmi0("positionX")
        private final PopupLayerPositionXTypeDto positionX;

        @pmi0("positionY")
        private final PopupLayerPositionYTypeDto positionY;

        @pmi0("scaleRatio")
        private final float scaleRatio;

        @pmi0("url")
        private final String url;

        public PopupStickerFixedAnimationLayerDto(PopupLayerPositionXTypeDto popupLayerPositionXTypeDto, PopupLayerPositionYTypeDto popupLayerPositionYTypeDto, String str, int i, float f) {
            super(null);
            this.positionX = popupLayerPositionXTypeDto;
            this.positionY = popupLayerPositionYTypeDto;
            this.url = str;
            this.loopsLimit = i;
            this.scaleRatio = f;
        }

        public final int a() {
            return this.loopsLimit;
        }

        public final PopupLayerPositionXTypeDto b() {
            return this.positionX;
        }

        public final PopupLayerPositionYTypeDto c() {
            return this.positionY;
        }

        public final float d() {
            return this.scaleRatio;
        }

        public final String e() {
            return this.url;
        }
    }

    /* compiled from: PopupStickerAnimationLayerDto.kt */
    public static final class PopupStickerFullscreenAnimationLayerDto extends PopupStickerAnimationLayerDto {

        @pmi0("fit")
        private final PopupLayerFitTypeDto fit;

        @pmi0("loopsLimit")
        private final int loopsLimit;

        @pmi0("positionX")
        private final PopupLayerPositionXTypeDto positionX;

        @pmi0("positionY")
        private final PopupLayerPositionYTypeDto positionY;

        @pmi0("repeat")
        private final PopupLayerRepeatTypeDto repeat;

        @pmi0("scaleRatio")
        private final float scaleRatio;

        @pmi0("url")
        private final String url;

        public PopupStickerFullscreenAnimationLayerDto(PopupLayerPositionXTypeDto popupLayerPositionXTypeDto, PopupLayerPositionYTypeDto popupLayerPositionYTypeDto, String str, int i, PopupLayerRepeatTypeDto popupLayerRepeatTypeDto, PopupLayerFitTypeDto popupLayerFitTypeDto, float f) {
            super(null);
            this.positionX = popupLayerPositionXTypeDto;
            this.positionY = popupLayerPositionYTypeDto;
            this.url = str;
            this.loopsLimit = i;
            this.repeat = popupLayerRepeatTypeDto;
            this.fit = popupLayerFitTypeDto;
            this.scaleRatio = f;
        }

        public final PopupLayerFitTypeDto a() {
            return this.fit;
        }

        public final int b() {
            return this.loopsLimit;
        }

        public final PopupLayerPositionXTypeDto c() {
            return this.positionX;
        }

        public final PopupLayerPositionYTypeDto d() {
            return this.positionY;
        }

        public final PopupLayerRepeatTypeDto e() {
            return this.repeat;
        }

        public final float f() {
            return this.scaleRatio;
        }

        public final String g() {
            return this.url;
        }
    }

    /* compiled from: PopupStickerAnimationLayerDto.kt */
    public static final class PopupStickerGradientLayerDto extends PopupStickerAnimationLayerDto {

        @pmi0(X3.i.L)
        private final PopupLayerGradientPositionTypeDto position;

        @pmi0("scaleRatio")
        private final float scaleRatio;

        public PopupStickerGradientLayerDto(PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto, float f) {
            super(null);
            this.position = popupLayerGradientPositionTypeDto;
            this.scaleRatio = f;
        }

        public final PopupLayerGradientPositionTypeDto a() {
            return this.position;
        }

        public final float b() {
            return this.scaleRatio;
        }
    }

    public /* synthetic */ PopupStickerAnimationLayerDto(zcl zclVar) {
        this();
    }

    private PopupStickerAnimationLayerDto() {
    }
}
