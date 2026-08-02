package com.vk.catalog2.common.ui.mvp.holder.video.showcase;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cpu;
import xsna.izs;
import xsna.jai;
import xsna.msy;
import xsna.pzj;
import xsna.s7c0;
import xsna.u4a;
import xsna.wh50;
import xsna.zak0;

/* compiled from: VideoShowcaseViewHolder.kt */
/* loaded from: classes16.dex */
public final class VideoShowcaseViewHolder implements CatalogViewHolder {
    public final boolean b;
    public final u4a c;
    public final wh50 d = k.b(null);
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new s7c0(16));

    /* compiled from: VideoShowcaseViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UserId, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(UserId userId) {
            return Boolean.valueOf(((cpu) this.receiver).d(userId));
        }
    }

    public VideoShowcaseViewHolder(u4a u4aVar, boolean z) {
        this.b = z;
        this.c = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideo) {
            ((zak0) this.d).setValue((UIBlockVideo) uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new jai(-2142552878, new pzj(12, this, composeView), true));
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
