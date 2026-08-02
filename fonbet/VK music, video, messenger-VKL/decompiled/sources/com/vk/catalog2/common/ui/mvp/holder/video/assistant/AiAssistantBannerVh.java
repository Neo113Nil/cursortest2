package com.vk.catalog2.common.ui.mvp.holder.video.assistant;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.video.assistant.api.domain.model.AiAssistantType;
import com.vk.video.assistant.api.router.AiAssistantArguments;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.awt0;
import xsna.gko;
import xsna.iah0;
import xsna.nc1;
import xsna.oq;
import xsna.ra0;
import xsna.tlo0;

/* compiled from: AiAssistantBannerVh.kt */
/* loaded from: classes16.dex */
public final class AiAssistantBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final nc1 b;
    public VkBanner c;

    public AiAssistantBannerVh(nc1 nc1Var) {
        this.b = nc1Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        VkBanner vkBanner = this.c;
        if (vkBanner == null) {
            vkBanner = null;
        }
        vkBanner.setOnClickListener(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            VkBanner vkBanner = this.c;
            if (vkBanner == null) {
                vkBanner = null;
            }
            vkBanner.setBefore(new VkBanner.b.C0806b(new gko(R.drawable.vk_icon_sparkles_circle_fill_ai_gradient_32), null, null, 14));
            VkBanner vkBanner2 = this.c;
            if (vkBanner2 == null) {
                vkBanner2 = null;
            }
            vkBanner2.setMiddle(new VkBanner.e(oq.d(tlo0.Companion, ((UIBlockPlaceholder) uIBlock).A), null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            VkBanner vkBanner3 = this.c;
            (vkBanner3 != null ? vkBanner3 : null).setAfter(new VkBanner.a.C0804a(new ra0(this, 1), 6));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int a = iah0.a(12);
        VkBanner vkBanner = new VkBanner(layoutInflater.getContext(), null, 6);
        vkBanner.setId(R.id.assistant_banner);
        vkBanner.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        awt0.x(vkBanner, a, a, a, 0, 8);
        this.c = vkBanner;
        vkBanner.setOnClickListener(this);
        return vkBanner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || this.b == null) {
            return;
        }
        view.getContext();
        new AiAssistantArguments(new AiAssistantArguments.EntryPoint.SearchBanner(null, null, 3, null), null);
        AiAssistantType.a aVar = AiAssistantType.Companion;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
