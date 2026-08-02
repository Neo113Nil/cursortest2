package com.vk.catalog2.common.ui.mvp.holder.container;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.core.design.tools.view.BannersFrameLayout;
import com.vk.core.view.components.banner.VkBanner;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.h6m0;
import xsna.iah0;
import xsna.q3a;
import xsna.r8a;

/* compiled from: SmallVkBannerVh.kt */
/* loaded from: classes16.dex */
public final class SmallVkBannerVh extends VkBannerVh {
    public final boolean r;
    public final int s;
    public BannersFrameLayout t;

    public SmallVkBannerVh(q3a q3aVar, b5a b5aVar, r8a r8aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z, boolean z2, int i) {
        super(q3aVar, b5aVar, r8aVar, aVar, R.layout.catalog_vk_banner_small, BannerSize.Small, z, z2);
        this.r = z;
        this.s = i;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        BannersFrameLayout bannersFrameLayout = (BannersFrameLayout) inflate;
        this.t = bannersFrameLayout;
        (bannersFrameLayout == null ? null : bannersFrameLayout).getLayoutParams().height = this.s;
        VkBanner vkBanner = (VkBanner) bannersFrameLayout.findViewById(R.id.banner);
        this.j = vkBanner;
        if (vkBanner == null) {
            vkBanner = null;
        }
        vkBanner.setOnClick(new h6m0(this, 21));
        BannersFrameLayout bannersFrameLayout2 = this.t;
        if (bannersFrameLayout2 == null) {
            bannersFrameLayout2 = null;
        }
        bannersFrameLayout2.setMaxWidthValue(-1);
        BannersFrameLayout bannersFrameLayout3 = this.t;
        (bannersFrameLayout3 != null ? bannersFrameLayout3 : null).setWidthPadding(this.r ? iah0.a(40) : 0);
        return inflate;
    }

    public SmallVkBannerVh(q3a q3aVar, b5a b5aVar, r8a r8aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z, boolean z2) {
        this(q3aVar, b5aVar, r8aVar, aVar, z, z2, iah0.a(108));
    }
}
