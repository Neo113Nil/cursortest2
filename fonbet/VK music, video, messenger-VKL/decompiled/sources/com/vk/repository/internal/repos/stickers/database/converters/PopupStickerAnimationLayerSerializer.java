package com.vk.repository.internal.repos.stickers.database.converters;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationLayerDto;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.x9y;

/* compiled from: PopupStickerAnimationLayerSerializer.kt */
/* loaded from: classes5.dex */
public final class PopupStickerAnimationLayerSerializer implements uay<PopupStickerAnimationLayerDto> {
    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        b9y b;
        PopupStickerAnimationLayerDto popupStickerAnimationLayerDto = (PopupStickerAnimationLayerDto) obj;
        x9y x9yVar = new x9y();
        x9yVar.l(new hay(popupStickerAnimationLayerDto.getClass().getCanonicalName()), "type");
        if (popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto) {
            b = ((TreeTypeAdapter.a) tayVar).b(popupStickerAnimationLayerDto);
        } else if (popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto) {
            b = ((TreeTypeAdapter.a) tayVar).b(popupStickerAnimationLayerDto);
        } else {
            if (!(popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto)) {
                throw new IllegalStateException("serialize no mapping for the type:" + popupStickerAnimationLayerDto);
            }
            b = ((TreeTypeAdapter.a) tayVar).b(popupStickerAnimationLayerDto);
        }
        x9yVar.l(b, AdRevenueConstants.LAYER_KEY);
        return x9yVar;
    }
}
