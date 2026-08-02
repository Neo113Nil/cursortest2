package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: SimpleTextVkUiIconButtonVh.kt */
/* loaded from: classes16.dex */
public abstract class SimpleTextVkUiIconButtonVh extends ActionVh {
    public final int b = R.layout.catalog_button_follow_music_owner;
    public VkButton c;

    public final void a(int i) {
        VkButton vkButton = this.c;
        if (vkButton == null) {
            vkButton = null;
        }
        Integer valueOf = Integer.valueOf(i);
        int[] iArr = VkButton.W;
        vkButton.a5(true, valueOf);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.c = (VkButton) inflate.findViewById(R.id.button);
        bwt0.h0(this, inflate);
        return inflate;
    }
}
