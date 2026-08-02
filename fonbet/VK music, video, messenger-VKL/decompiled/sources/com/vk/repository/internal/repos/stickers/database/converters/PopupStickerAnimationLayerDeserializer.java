package com.vk.repository.internal.repos.stickers.database.converters;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationLayerDto;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.up;
import xsna.z8y;

/* compiled from: PopupStickerAnimationLayerDeserializer.kt */
/* loaded from: classes5.dex */
public final class PopupStickerAnimationLayerDeserializer implements a9y<PopupStickerAnimationLayerDto> {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        String f = up.f(b9yVar, "type");
        b9y q = b9yVar.h().q(AdRevenueConstants.LAYER_KEY);
        if (epx.f(f, PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto.class.getCanonicalName())) {
            return (PopupStickerAnimationLayerDto) ((TreeTypeAdapter.a) z8yVar).a(q, PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto.class);
        }
        if (epx.f(f, PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto.class.getCanonicalName())) {
            return (PopupStickerAnimationLayerDto) ((TreeTypeAdapter.a) z8yVar).a(q, PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto.class);
        }
        if (epx.f(f, PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto.class.getCanonicalName())) {
            return (PopupStickerAnimationLayerDto) ((TreeTypeAdapter.a) z8yVar).a(q, PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto.class);
        }
        throw new IllegalStateException(go9.b("deserialize no mapping for the type:", f));
    }
}
