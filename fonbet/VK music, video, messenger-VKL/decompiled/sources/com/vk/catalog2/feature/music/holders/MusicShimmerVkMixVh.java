package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.holders.MusicShimmerVkMixVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.subjects.f;
import xsna.e3m;
import xsna.g6;
import xsna.iah0;
import xsna.l4v0;
import xsna.q550;
import xsna.w4v0;
import xsna.zk30;
import xsna.zn;

/* compiled from: MusicShimmerVkMixVh.kt */
/* loaded from: classes16.dex */
public final class MusicShimmerVkMixVh implements CatalogViewHolder {
    public final l4v0 b;
    public final int c;
    public final boolean d;
    public View e;
    public c f;
    public q550 g;
    public a h;

    /* compiled from: MusicShimmerVkMixVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnScrollChangedListener(MusicShimmerVkMixVh.this.g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            MusicShimmerVkMixVh musicShimmerVkMixVh = MusicShimmerVkMixVh.this;
            viewTreeObserver.removeOnScrollChangedListener(musicShimmerVkMixVh.g);
            c cVar = musicShimmerVkMixVh.f;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    public MusicShimmerVkMixVh(l4v0 l4v0Var, int i, boolean z) {
        this.b = l4v0Var;
        this.c = i;
        this.d = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        View view;
        c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        a aVar = this.h;
        if (aVar == null || (view = this.e) == null) {
            return;
        }
        view.removeOnAttachStateChangeListener(aVar);
    }

    public final void a(Rect rect) {
        View view = this.e;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        int a2 = iah0.a(20);
        l4v0 l4v0Var = this.b;
        if (l4v0Var != null) {
            l4v0Var.d(new w4v0(rect.bottom + a2, true, this.d));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [xsna.q550] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        this.e = inflate;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.shimmer);
        int f = e3m.f(R.attr.vk_ui_skeleton_from, shimmerFrameLayout.getContext());
        int f2 = e3m.f(R.attr.vk_ui_skeleton_to, shimmerFrameLayout.getContext());
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        cVar.k(f);
        cVar.a.d = f2;
        shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
        shimmerFrameLayout.d();
        final Rect rect = new Rect();
        View view = this.e;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
            this.g = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.q550
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MusicShimmerVkMixVh.this.a(rect);
                }
            };
            a aVar = new a();
            this.h = aVar;
            view.addOnAttachStateChangeListener(aVar);
        }
        l4v0 l4v0Var = this.b;
        if (l4v0Var == null) {
            return inflate;
        }
        f b = l4v0Var.b();
        zk30 zk30Var = new zk30(new g6(21, this, rect), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.f = b.E(zk30Var, lVar, kVar, kVar).subscribe();
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
