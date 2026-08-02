package com.vk.catalog2.common.ui.mvp.holder.video.showcase;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import xsna.b9s0;
import xsna.iq8;
import xsna.jai;
import xsna.lpg0;
import xsna.qls0;
import xsna.u4a;
import xsna.wh50;
import xsna.zak0;

/* compiled from: VideoFlatActionViewHolder.kt */
/* loaded from: classes16.dex */
public final class VideoFlatActionViewHolder implements CatalogViewHolder {
    public final b9s0 b;
    public final u4a c;
    public final lpg0 d;
    public final wh50 e = k.b(null);
    public final qls0 f = new qls0();

    public VideoFlatActionViewHolder(b9s0 b9s0Var, u4a u4aVar, lpg0 lpg0Var) {
        this.b = b9s0Var;
        this.c = u4aVar;
        this.d = lpg0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionOpenSection) {
            ((zak0) this.e).setValue((UIBlockActionOpenSection) uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        composeView.setContent(new jai(-1929307502, new iq8(10, this, composeView), true));
        return composeView;
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
