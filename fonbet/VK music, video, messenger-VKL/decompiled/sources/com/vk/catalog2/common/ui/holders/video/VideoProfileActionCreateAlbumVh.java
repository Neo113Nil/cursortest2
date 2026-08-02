package com.vk.catalog2.common.ui.holders.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.ActionVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g7s0;
import xsna.iah0;

/* compiled from: VideoProfileActionCreateAlbumVh.kt */
/* loaded from: classes16.dex */
public final class VideoProfileActionCreateAlbumVh extends ActionVh {
    public final UserId b;
    public final boolean c;
    public final g7s0 d;
    public VkButton e;

    public VideoProfileActionCreateAlbumVh(UserId userId, boolean z) {
        g7s0 B = fxc0.B();
        this.b = userId;
        this.c = z;
        this.d = B;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkButton vkButton;
        UIBlockAction uIBlockAction = uIBlock instanceof UIBlockAction ? (UIBlockAction) uIBlock : null;
        if (uIBlockAction == null || (vkButton = this.e) == null) {
            return;
        }
        UIBlockActionTextButton uIBlockActionTextButton = uIBlockAction instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlockAction : null;
        vkButton.setText(uIBlockActionTextButton != null ? uIBlockActionTextButton.z : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_action_create_playlist_profile, viewGroup, false);
        if (!this.c) {
            float f = 16;
            inflate.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        }
        this.e = (VkButton) inflate.findViewById(R.id.create_album);
        bwt0.h0(this, inflate);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        UserId userId = this.b;
        fkq0.b(userId);
        int i = g7s0.G7;
        this.d.n(context, userId);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
