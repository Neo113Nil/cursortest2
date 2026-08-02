package com.vk.clips.viewer.impl.adapters;

import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.dto.common.Good;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import xsna.nih0;

/* compiled from: VideoFileAdapter.kt */
/* loaded from: classes17.dex */
public final class a implements nih0 {
    public final SdkGood a;
    public final String b;

    public a(ClickableMarketItem clickableMarketItem) {
        Good good = clickableMarketItem.j;
        this.a = good != null ? new GoodWrapper(good) : null;
        this.b = clickableMarketItem.l;
    }

    @Override // xsna.nih0
    public final String a() {
        return this.b;
    }

    @Override // xsna.nih0
    public final SdkGood b() {
        return this.a;
    }
}
