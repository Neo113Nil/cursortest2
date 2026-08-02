package com.vk.video.ui.slider.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.Lazy;
import xsna.dnt0;
import xsna.e3m;
import xsna.ent0;
import xsna.fh5;
import xsna.fxc0;
import xsna.s0t0;
import xsna.t3s0;
import xsna.tps0;
import xsna.uc;
import xsna.y8g0;

/* compiled from: VideoSliderAutoPlayHolder.kt */
/* loaded from: classes7.dex */
public final class VideoSliderAutoPlayHolder implements CatalogViewHolder, s0t0, ent0 {
    public final Object b;
    public final Object c;
    public final String d;
    public t3s0 e;

    public VideoSliderAutoPlayHolder(Lazy<? extends VideoShareComponent> lazy, Lazy<? extends DonutVideoComponent> lazy2, String str) {
        this.b = lazy;
        this.c = lazy2;
        this.d = str;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str = uIBlock.f;
        if (uIBlock instanceof UIBlockVideo) {
            Trace.beginSection("VideoSliderAutoPlayHolder.bindData");
            try {
                t3s0 t3s0Var = this.e;
                if (t3s0Var != null) {
                    t3s0Var.L.w(str);
                    VideoAttachment videoAttachment = new VideoAttachment(((UIBlockVideo) uIBlock).B);
                    videoAttachment.Lb(str, null, null);
                    t3s0Var.b7(videoAttachment);
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // xsna.s0t0
    public final void a(fh5 fh5Var) {
        t3s0 t3s0Var;
        View view;
        Context context;
        Activity h;
        if (fh5Var.j == null || (t3s0Var = this.e) == null || (view = t3s0Var.itemView) == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        uc.r(fh5Var, h, true, null, null, null, null, 252);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t3s0 t3s0Var = new t3s0(viewGroup, this, this.d, this.b, this.c, new tps0.a(-2, y8g0.a(R.dimen.suggested_videos_video_height), Float.valueOf(1.7777778f), 1, 0, null, 480));
        t3s0Var.J = fxc0.B().J().O();
        this.e = t3s0Var;
        return t3s0Var.itemView;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        t3s0 t3s0Var = this.e;
        if (t3s0Var != null) {
            return t3s0Var.L;
        }
        return null;
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
