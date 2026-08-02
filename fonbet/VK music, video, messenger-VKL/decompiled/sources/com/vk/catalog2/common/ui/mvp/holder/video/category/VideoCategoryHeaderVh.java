package com.vk.catalog2.common.ui.mvp.holder.video.category;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBounceAppBarBlockableBehavior;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.y;
import xsna.b5a;
import xsna.g380;
import xsna.iah0;
import xsna.k2y;
import xsna.ltl0;
import xsna.mba;
import xsna.mdk0;
import xsna.oyp0;
import xsna.qas0;
import xsna.u4a;
import xsna.vii0;

/* compiled from: VideoCategoryHeaderVh.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryHeaderVh implements CatalogViewHolder, g380 {
    public final u4a b;
    public CollapsingToolbarLayout c;
    public NonBouncedAppBarLayout d;
    public final VideoCategoryToolbarVh e;
    public final VideoCategoryCoverVh f;
    public boolean g;
    public boolean h;
    public boolean i;
    public c j;

    public VideoCategoryHeaderVh(u4a u4aVar) {
        this.b = u4aVar;
        mba mbaVar = u4aVar.c.a;
        u4a.a aVar = u4aVar.b;
        b5a b5aVar = aVar.f;
        this.e = new VideoCategoryToolbarVh(mbaVar, b5aVar, aVar);
        this.f = new VideoCategoryCoverVh(mbaVar, b5aVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.e.getClass();
        this.f.getClass();
        c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideoCategory) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
            if (nonBouncedAppBarLayout == null) {
                nonBouncedAppBarLayout = null;
            }
            nonBouncedAppBarLayout.setVisibility(0);
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = this.d;
            if (nonBouncedAppBarLayout2 == null) {
                nonBouncedAppBarLayout2 = null;
            }
            nonBouncedAppBarLayout2.h(!this.g, true, true);
            a(!this.g);
            this.f.N6(uIBlock);
            this.e.N6(uIBlock);
            CollapsingToolbarLayout collapsingToolbarLayout = this.c;
            if (collapsingToolbarLayout == null) {
                collapsingToolbarLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
            NonBouncedAppBarLayout.c cVar = layoutParams instanceof NonBouncedAppBarLayout.c ? (NonBouncedAppBarLayout.c) layoutParams : null;
            if (cVar != null) {
                cVar.a = 19;
            }
            CollapsingToolbarLayout collapsingToolbarLayout2 = this.c;
            (collapsingToolbarLayout2 != null ? collapsingToolbarLayout2 : null).setVisibility(0);
        }
    }

    public final void a(boolean z) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = nonBouncedAppBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        NonBounceAppBarBlockableBehavior nonBounceAppBarBlockableBehavior = obj instanceof NonBounceAppBarBlockableBehavior ? (NonBounceAppBarBlockableBehavior) obj : null;
        if (nonBounceAppBarBlockableBehavior != null) {
            nonBounceAppBarBlockableBehavior.r = z;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) layoutInflater.inflate(R.layout.catalog2_live_video_category_header, viewGroup, false);
        this.d = nonBouncedAppBarLayout;
        (nonBouncedAppBarLayout == null ? null : nonBouncedAppBarLayout).setBackground(null);
        this.i = iah0.s(nonBouncedAppBarLayout.getContext());
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) nonBouncedAppBarLayout.findViewById(R.id.collapsing_layout);
        collapsingToolbarLayout.setScrimAnimationDuration(300L);
        View k5 = this.f.k5(layoutInflater, collapsingToolbarLayout, bundle);
        View k52 = this.e.k5(layoutInflater, collapsingToolbarLayout, bundle);
        collapsingToolbarLayout.addView(k5, 0);
        collapsingToolbarLayout.addView(k52, 1);
        this.c = collapsingToolbarLayout;
        nonBouncedAppBarLayout.a(new qas0(this));
        c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = new y(this.b.b.e.a().b0(oyp0.class).U(new vii0(new ltl0(8), 5)), a.a, b.a).subscribe(new k2y(new mdk0(this, 11), 23));
        return nonBouncedAppBarLayout;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.i = configuration.orientation == 1;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        nonBouncedAppBarLayout.setExpanded(this.g);
        a((this.h && this.i) ? false : true);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
