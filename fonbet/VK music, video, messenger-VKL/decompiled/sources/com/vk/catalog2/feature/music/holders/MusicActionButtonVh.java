package com.vk.catalog2.feature.music.holders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.ActionVh;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c98;
import xsna.enj;

/* compiled from: MusicActionButtonVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicActionButtonVh extends ActionVh {
    public final int b;
    public final int c;
    public final int d;
    public VkButton e;
    public UIBlock f;

    public MusicActionButtonVh(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        this.f = uIBlock;
        VkButton vkButton = this.e;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setText(this.d);
        if (uIBlock instanceof UIBlockActionPlayAudiosFromBlock) {
            VkButton vkButton2 = this.e;
            bwt0.Q(vkButton2 != null ? vkButton2 : null, R.id.catalog_ui_test_play_audios_from_block, uIBlock.d.getId());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.music_action_button);
        Drawable e = enj.e(this.b, R.attr.vk_ui_background_accent_themed, layoutInflater.getContext());
        int[] iArr = VkButton.W;
        vkButton.Z4(e, true);
        vkButton.setOnClickListener(new c98(this, 1));
        this.e = vkButton;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
    }
}
