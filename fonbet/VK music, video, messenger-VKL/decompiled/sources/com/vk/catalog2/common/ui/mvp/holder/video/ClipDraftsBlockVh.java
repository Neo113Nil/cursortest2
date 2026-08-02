package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockProfileClipDrafts;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.op1;
import xsna.q3a;

/* compiled from: ClipDraftsBlockVh.kt */
/* loaded from: classes16.dex */
public final class ClipDraftsBlockVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public View c;
    public UIBlockProfileClipDrafts d;

    public ClipDraftsBlockVh(q3a q3aVar) {
        this.b = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockProfileClipDrafts uIBlockProfileClipDrafts = uIBlock instanceof UIBlockProfileClipDrafts ? (UIBlockProfileClipDrafts) uIBlock : null;
        if (uIBlockProfileClipDrafts == null) {
            return;
        }
        this.d = uIBlockProfileClipDrafts;
        if (this.c == null) {
            return;
        }
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        op1 op1Var = new op1(this, 20);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(op1Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_short_video_draft_list_loader, viewGroup, false);
        this.c = inflate;
        return inflate;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
