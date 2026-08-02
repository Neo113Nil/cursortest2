package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.j03;
import xsna.oo;
import xsna.oq;
import xsna.tlo0;

/* compiled from: ErrorStateVkUiVh.kt */
/* loaded from: classes16.dex */
public final class ErrorStateVkUiVh extends ErrorStateVh {
    public final oo f;
    public VkPlaceholder g;

    public ErrorStateVkUiVh(CommunitiesCatalogRootVh communitiesCatalogRootVh, oo ooVar) {
        super(communitiesCatalogRootVh, ooVar);
        this.f = ooVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
        VkPlaceholder vkPlaceholder = this.g;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        String g = j03.g(vkPlaceholder.getContext(), th, R.string.error);
        VkPlaceholder vkPlaceholder2 = this.g;
        if (vkPlaceholder2 == null) {
            vkPlaceholder2 = null;
        }
        vkPlaceholder2.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, g)), 1));
        VkPlaceholder vkPlaceholder3 = this.g;
        (vkPlaceholder3 != null ? vkPlaceholder3 : null).setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_common_retry), (gzs) this.f, (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Tertiary, (VkButton.Appearance) null, false, 444), null, null, null, 8));
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a();
        VkPlaceholder vkPlaceholder = new VkPlaceholder(layoutInflater.getContext(), null, 6, 0);
        this.g = vkPlaceholder;
        return vkPlaceholder;
    }
}
