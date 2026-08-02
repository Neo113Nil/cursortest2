package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.movika.sdk.base.logic.interactor.c;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.bwt0;
import xsna.cn70;
import xsna.gko;
import xsna.mba;
import xsna.oq;
import xsna.sos0;
import xsna.tlo0;

/* compiled from: VkPlaceholderVideoGrowthVh.kt */
/* loaded from: classes16.dex */
public final class VkPlaceholderVideoGrowthVh implements CatalogViewHolder {
    public final mba b;
    public final sos0 c;
    public VkBanner d;

    public VkPlaceholderVideoGrowthVh(mba mbaVar, sos0 sos0Var) {
        this.b = mbaVar;
        this.c = sos0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            VkBanner vkBanner = this.d;
            if (vkBanner == null) {
                vkBanner = null;
            }
            bwt0.p0(vkBanner, true);
            VkBanner vkBanner2 = this.d;
            if (vkBanner2 == null) {
                vkBanner2 = null;
            }
            vkBanner2.setAfter(new VkBanner.a.C0804a(null, 7));
            VkBanner vkBanner3 = this.d;
            if (vkBanner3 == null) {
                vkBanner3 = null;
            }
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            tlo0.h d = oq.d(tlo0.Companion, uIBlockPlaceholder.A);
            String str = uIBlockPlaceholder.D;
            if (str == null) {
                str = "";
            }
            vkBanner3.setMiddle(new VkBanner.e(d, new tlo0.h(str), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            VkBanner vkBanner4 = this.d;
            (vkBanner4 != null ? vkBanner4 : null).setOnClick(new c(29, this, uIBlock));
            sos0 sos0Var = this.c;
            if (sos0Var != null) {
                sos0Var.f(CommunityGrowthTrapScreen.VIDEO_GROUP_MAIN, CommunityGrowthTrapEvent.BANNER);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkBanner vkBanner = new VkBanner(layoutInflater.getContext(), null, 6);
        vkBanner.setVisibility(8);
        vkBanner.setPadding(cn70.b(12), vkBanner.getPaddingTop(), cn70.b(12), vkBanner.getPaddingBottom());
        vkBanner.setBefore(new VkBanner.b.C0806b(new gko(R.drawable.vk_icon_logo_vk_video_color_28), null, new Size(cn70.b(36), cn70.b(36)), 10));
        this.d = vkBanner;
        return vkBanner;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
