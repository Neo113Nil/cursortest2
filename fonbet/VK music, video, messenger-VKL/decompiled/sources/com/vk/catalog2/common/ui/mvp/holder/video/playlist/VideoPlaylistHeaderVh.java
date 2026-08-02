package com.vk.catalog2.common.ui.mvp.holder.video.playlist;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBounceAppBarBlockableBehavior;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCover;
import com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverComposeVh;
import com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverXmlVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.y;
import xsna.c3k0;
import xsna.c7q0;
import xsna.dhr0;
import xsna.e3m;
import xsna.fxc0;
import xsna.g380;
import xsna.gz80;
import xsna.hxm0;
import xsna.iah0;
import xsna.mba;
import xsna.mnh0;
import xsna.oyp0;
import xsna.too0;
import xsna.u4a;
import xsna.u4t0;
import xsna.v4t0;
import xsna.x310;

/* compiled from: VideoPlaylistHeaderVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistHeaderVh implements CatalogViewHolder, too0, g380 {
    public final u4a b;
    public CollapsingToolbarLayout c;
    public NonBouncedAppBarLayout d;
    public final u4t0 e;
    public final VideoPlaylistToolbar f;
    public final VideoPlaylistCover g;
    public boolean h;
    public float i;
    public boolean j;
    public boolean k;
    public c l;

    public VideoPlaylistHeaderVh(u4a u4aVar) {
        VideoPlaylistToolbar videoPlaylistToolbarVh;
        u4a.a aVar = u4aVar.b;
        u4a.b bVar = u4aVar.c;
        this.b = u4aVar;
        u4t0 u4t0Var = new u4t0();
        this.e = u4t0Var;
        if (fxc0.B().J().i1()) {
            mba mbaVar = bVar.a;
            u4a.a aVar2 = u4aVar.b;
            videoPlaylistToolbarVh = new VideoPlaylistToolbarComposeVh(mbaVar, aVar2.f, aVar2.b, u4t0Var, aVar2);
        } else {
            videoPlaylistToolbarVh = new VideoPlaylistToolbarVh(bVar.a, aVar.f, u4t0Var, aVar);
        }
        this.f = videoPlaylistToolbarVh;
        this.g = fxc0.B().J().i1() ? new VideoPlaylistCoverComposeVh(bVar.a, aVar.f, u4t0Var, fxc0.B().J()) : new VideoPlaylistCoverXmlVh(bVar.a, aVar.f, u4t0Var, fxc0.B().J());
        this.j = true;
    }

    public static void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, boolean z) {
        Activity h = e3m.h(nonBouncedAppBarLayout.getContext());
        if (h == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = (z || dhr0.a.c(h)) ? false : true;
        Window window = h.getWindow();
        if (gz80.a(23) && (window.getDecorView().getSystemUiVisibility() & 8192) > 0) {
            z2 = true;
        }
        if (z3 != z2) {
            mnh0.w(h.getWindow().getDecorView(), z3);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.f.L();
        this.g.L();
        c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        this.l = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideoAlbum) {
            boolean z = ((UIBlockVideoAlbum) uIBlock).y.l;
            u4t0 u4t0Var = this.e;
            u4t0Var.f(z);
            u4t0Var.k = uIBlock.f;
            NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
            if (nonBouncedAppBarLayout == null) {
                nonBouncedAppBarLayout = null;
            }
            nonBouncedAppBarLayout.setVisibility(0);
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = this.d;
            if (nonBouncedAppBarLayout2 == null) {
                nonBouncedAppBarLayout2 = null;
            }
            nonBouncedAppBarLayout2.h(c() && this.j, true, true);
            b(c());
            this.g.c(uIBlock);
            VideoPlaylistToolbar videoPlaylistToolbar = this.f;
            videoPlaylistToolbar.N6(uIBlock);
            videoPlaylistToolbar.e(false);
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

    @Override // xsna.too0
    public final void Ng() {
        mba mbaVar = this.f;
        too0 too0Var = mbaVar instanceof too0 ? (too0) mbaVar : null;
        if (too0Var != null) {
            too0Var.Ng();
        }
    }

    public final void b(boolean z) {
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

    public final boolean c() {
        return fxc0.B().J().v0() || this.k;
    }

    public final boolean d(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.c;
        if (collapsingToolbarLayout == null) {
            collapsingToolbarLayout = null;
        }
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        if (nonBouncedAppBarLayout.getTotalScrollRange() == 0) {
            return false;
        }
        int height = collapsingToolbarLayout.getHeight();
        NonBouncedAppBarLayout nonBouncedAppBarLayout2 = this.d;
        if (nonBouncedAppBarLayout2 == null) {
            nonBouncedAppBarLayout2 = null;
        }
        int scrimVisibleHeightTrigger = collapsingToolbarLayout.getScrimVisibleHeightTrigger() - (height - nonBouncedAppBarLayout2.getTotalScrollRange());
        NonBouncedAppBarLayout nonBouncedAppBarLayout3 = this.d;
        return (nonBouncedAppBarLayout3 != null ? nonBouncedAppBarLayout3 : null).getTotalScrollRange() + i > scrimVisibleHeightTrigger;
    }

    public final void e(boolean z) {
        this.f.e(z);
        this.h = z;
        b(!z && c());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) layoutInflater.inflate(fxc0.B().J().i1() ? R.layout.catalog2_video_playlist_header_redesign : R.layout.catalog2_video_playlist_header, viewGroup, false);
        this.d = nonBouncedAppBarLayout;
        (nonBouncedAppBarLayout == null ? null : nonBouncedAppBarLayout).setBackground(null);
        this.k = iah0.s(nonBouncedAppBarLayout.getContext());
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) nonBouncedAppBarLayout.findViewById(R.id.collapsing_layout);
        collapsingToolbarLayout.setScrimAnimationDuration(300L);
        collapsingToolbarLayout.addView(this.g.k5(layoutInflater, collapsingToolbarLayout, bundle), 0);
        this.c = collapsingToolbarLayout;
        FrameLayout frameLayout = (FrameLayout) nonBouncedAppBarLayout.findViewById(R.id.video_playlist_toolbar_container);
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.c;
        if (collapsingToolbarLayout2 == null) {
            collapsingToolbarLayout2 = null;
        }
        View k5 = this.f.k5(layoutInflater, collapsingToolbarLayout2, bundle);
        if (fxc0.B().J().i1()) {
            frameLayout.addView(k5, 0);
        } else {
            CollapsingToolbarLayout collapsingToolbarLayout3 = this.c;
            (collapsingToolbarLayout3 != null ? collapsingToolbarLayout3 : null).addView(k5, 1);
        }
        nonBouncedAppBarLayout.a(new v4t0(this));
        c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        this.l = new y(this.b.b.e.a().b0(oyp0.class).U(new x310(new hxm0(9), 19)), a.a, b.a).subscribe(new c7q0(new c3k0(this, 14), 4));
        return nonBouncedAppBarLayout;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z = false;
        this.k = configuration.orientation == 1;
        b(c() && !this.h);
        if (fxc0.B().J().v0()) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = this.d;
            if (nonBouncedAppBarLayout == null) {
                nonBouncedAppBarLayout = null;
            }
            this.j = nonBouncedAppBarLayout.f();
        } else if (!this.k) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = this.d;
            if (nonBouncedAppBarLayout2 == null) {
                nonBouncedAppBarLayout2 = null;
            }
            this.j = nonBouncedAppBarLayout2.f();
        }
        boolean c = c();
        u4t0 u4t0Var = this.e;
        ImageView imageView = u4t0Var.d;
        if (imageView != null) {
            imageView.setVisibility((!u4t0Var.i || c) ? 8 : 0);
        }
        this.f.d(this.i);
        this.g.d(this.i);
        NonBouncedAppBarLayout nonBouncedAppBarLayout3 = this.d;
        NonBouncedAppBarLayout nonBouncedAppBarLayout4 = nonBouncedAppBarLayout3 != null ? nonBouncedAppBarLayout3 : null;
        if (c() && this.j) {
            z = true;
        }
        nonBouncedAppBarLayout4.setExpanded(z);
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
