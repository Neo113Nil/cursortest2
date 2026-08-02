package com.vk.stories.design.view.stickers.market;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import java.util.List;
import xsna.lo6;
import xsna.lri0;

/* compiled from: ServiceStickerStyleSwitchingView.kt */
/* loaded from: classes6.dex */
public final class ServiceStickerStyleSwitchingView extends lo6<ServiceStickerStyle, StoryServiceItemInfo> {
    public ServiceStickerStyleSwitchingView() {
        throw null;
    }

    public ServiceStickerStyleSwitchingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 28);
    }

    @Override // xsna.lo6
    public List<ServiceStickerStyle> getAllStyles() {
        return ServiceStickerStyle.h();
    }

    public ServiceStickerStyleSwitchingView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, ServiceStickerStyle.Sticker, new lri0());
    }
}
