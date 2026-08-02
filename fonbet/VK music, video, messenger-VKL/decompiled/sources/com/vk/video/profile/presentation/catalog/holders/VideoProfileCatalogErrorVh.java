package com.vk.video.profile.presentation.catalog.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.core.compose.component.semantics.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.b8g;
import xsna.dei0;
import xsna.e3m;
import xsna.gko;
import xsna.tlo0;
import xsna.w2j0;

/* compiled from: VideoProfileCatalogErrorVh.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCatalogErrorVh extends ErrorStateVh {
    public final dei0 f;

    public VideoProfileCatalogErrorVh(VideoProfileCatalogContentVh videoProfileCatalogContentVh, dei0 dei0Var) {
        super(videoProfileCatalogContentVh, dei0Var);
        this.f = dei0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(layoutInflater.getContext(), null, 6);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_globe_outline_28), new b8g(e3m.f(R.attr.vk_ui_icon_secondary, layoutInflater.getContext())), null, 28));
        tlo0.a aVar = tlo0.Companion;
        String string = vkPlaceholder.getContext().getString(R.string.vk_common_network_error);
        aVar.getClass();
        vkPlaceholder.setMiddle(new VkPlaceholder.b((tlo0) null, new tlo0.h(string), (a) null, 11));
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.video_error_retry), new w2j0(this, 20), null, null, null, null, null, false, null, 2044), (VkPlaceholder.a.C0854a) null, 6));
        return vkPlaceholder;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
    }
}
