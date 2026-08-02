package com.vk.catalog2.common.ui.mvp.video;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.a5t0;
import xsna.ac20;
import xsna.bpn0;
import xsna.bqx0;
import xsna.cpu;
import xsna.dhr0;
import xsna.e1m0;
import xsna.e3m;
import xsna.e4;
import xsna.e7q0;
import xsna.epx;
import xsna.f4m;
import xsna.g2u0;
import xsna.gko;
import xsna.ify;
import xsna.its;
import xsna.iyd0;
import xsna.jwr0;
import xsna.k7l0;
import xsna.mlf0;
import xsna.msy;
import xsna.myd0;
import xsna.nda;
import xsna.qhg0;
import xsna.srq0;
import xsna.sua;
import xsna.tlo0;
import xsna.tq;
import xsna.u4a;
import xsna.u5p0;
import xsna.wjs0;
import xsna.wqx0;
import xsna.xg5;
import xsna.z4t0;

/* compiled from: VideoPlaylistPlaceHolder.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistPlaceHolder extends PlaceholderVh implements ify.a {
    public CollapsingToolbarLayout A;
    public VkTopBar B;
    public View C;
    public View D;
    public View E;
    public io.reactivex.rxjava3.disposables.c F;
    public View G;
    public Boolean H;
    public String I;
    public final Object J;
    public final VideoAlbum t;
    public final nda u;
    public final u4a.a v;
    public final Object w;
    public UIBlockPlaceholder x;
    public View y;
    public NonBouncedAppBarLayout z;

    /* compiled from: VideoPlaylistPlaceHolder.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity h = e3m.h(this.b.getContext());
            if (h == null) {
                return;
            }
            dhr0.v0(h);
        }
    }

    public VideoPlaylistPlaceHolder(VideoAlbum videoAlbum, com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar, u4a.a aVar2) {
        super(aVar, true, false, null, null, R.layout.catalog_playlist_placeholder, ndaVar, 0, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        this.t = videoAlbum;
        this.u = ndaVar;
        this.v = aVar2;
        e1m0 e1m0Var = new e1m0(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, e1m0Var);
        this.J = msy.a(lazyThreadSafetyMode, new mlf0(this, 20));
    }

    public static final void c(View view, VideoPlaylistPlaceHolder videoPlaylistPlaceHolder) {
        Activity c2;
        Window window;
        View decorView;
        VideoAlbum videoAlbum = videoPlaylistPlaceHolder.t;
        View rootView = view.getRootView();
        NonBouncedAppBarLayout nonBouncedAppBarLayout = rootView != null ? (NonBouncedAppBarLayout) rootView.findViewById(R.id.video_playlist_app_bar_layout) : null;
        videoPlaylistPlaceHolder.z = nonBouncedAppBarLayout;
        if (nonBouncedAppBarLayout != null) {
            nonBouncedAppBarLayout.setBackground(null);
        }
        videoPlaylistPlaceHolder.A = (CollapsingToolbarLayout) view.getRootView().findViewById(R.id.collapsing_layout);
        videoPlaylistPlaceHolder.B = (VkTopBar) view.findViewById(R.id.empty_playlist_toolbar);
        videoPlaylistPlaceHolder.C = view.findViewById(R.id.primary_button);
        videoPlaylistPlaceHolder.D = view.findViewById(R.id.secondary_button);
        videoPlaylistPlaceHolder.E = view.findViewById(R.id.catalog_placeholder_view_title);
        videoPlaylistPlaceHolder.G = view.findViewById(R.id.place_holder_block);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = view.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = view.getMeasuredHeight();
        f4m.a(view, new a5t0(view, ref$IntRef, ref$IntRef2, videoPlaylistPlaceHolder));
        VkTopBar vkTopBar = videoPlaylistPlaceHolder.B;
        if (vkTopBar != null) {
            vkTopBar.setVisibility(0);
            videoPlaylistPlaceHolder.I = videoAlbum.d;
            vkTopBar.setBack(new VkTopBar.b(new srq0(videoPlaylistPlaceHolder, 7), tq.h(tlo0.Companion, R.string.vk_accessibility_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new k7l0(videoPlaylistPlaceHolder, 20), 3), 12));
            String str = videoPlaylistPlaceHolder.I;
            if (str == null) {
                str = "";
            }
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
            bpn0 bpn0Var = xg5.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_28), new tlo0.f(R.string.more), new its(0, videoPlaylistPlaceHolder, VideoPlaylistPlaceHolder.class, "callBottomSheet", "callBottomSheet()V", 0, 2), null, null, com.vk.core.compose.component.semantics.b.a(null, new u5p0(videoPlaylistPlaceHolder, 8), 3), 24), (((cpu) bpn0Var.getValue()).a(videoAlbum.c) && sua.p(videoAlbum)) ? new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_write_outline_28), new tlo0.f(R.string.more), new myd0(videoPlaylistPlaceHolder, 22), null, null, com.vk.core.compose.component.semantics.b.a(null, new iyd0(videoPlaylistPlaceHolder, 19), 3), 24) : null, 4));
            View view2 = videoPlaylistPlaceHolder.y;
            WindowInsets rootWindowInsets = (view2 == null || (c2 = g2u0.c(view2)) == null || (window = c2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
            Integer valueOf = rootWindowInsets != null ? Integer.valueOf(wqx0.a(bqx0.h(null, rootWindowInsets))) : null;
            if (valueOf != null) {
                f4m.t(valueOf.intValue(), vkTopBar);
            }
        }
        UIBlockPlaceholder uIBlockPlaceholder = videoPlaylistPlaceHolder.x;
        if (uIBlockPlaceholder != null) {
            videoPlaylistPlaceHolder.N6(uIBlockPlaceholder);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        int i = ify.a;
        ify.g(this);
        io.reactivex.rxjava3.disposables.c cVar = this.F;
        if (cVar != null) {
            cVar.dispose();
        }
        this.H = null;
        super.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockPlaceholder) {
            this.x = (UIBlockPlaceholder) uIBlock;
            View view = this.y;
            if (view != null) {
                if (!view.isAttachedToWindow()) {
                    view.addOnAttachStateChangeListener(new a(view, this));
                    return;
                }
                CollapsingToolbarLayout collapsingToolbarLayout = this.A;
                ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout != null ? collapsingToolbarLayout.getLayoutParams() : null;
                NonBouncedAppBarLayout.c cVar = layoutParams instanceof NonBouncedAppBarLayout.c ? (NonBouncedAppBarLayout.c) layoutParams : null;
                if (cVar != null) {
                    cVar.a = 0;
                }
                NonBouncedAppBarLayout nonBouncedAppBarLayout = this.z;
                if (nonBouncedAppBarLayout != null) {
                    nonBouncedAppBarLayout.h(false, false, true);
                }
                NonBouncedAppBarLayout nonBouncedAppBarLayout2 = this.z;
                if (nonBouncedAppBarLayout2 != null) {
                    nonBouncedAppBarLayout2.setVisibility(0);
                }
                CollapsingToolbarLayout collapsingToolbarLayout2 = this.A;
                if (collapsingToolbarLayout2 != null) {
                    collapsingToolbarLayout2.setVisibility(8);
                }
                VkTopBar vkTopBar = this.B;
                if (vkTopBar != null) {
                    vkTopBar.setVisibility(0);
                }
                view.post(new b(view));
            }
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
        d(false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh
    public final int b(UIBlockPlaceholder uIBlockPlaceholder) {
        return 56;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z) {
        if (epx.f(this.H, Boolean.valueOf(z))) {
            return;
        }
        View view = this.G;
        int i = 0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        ?? r0 = this.J;
        int intValue = z ? ((Number) r0.getValue()).intValue() : -((Number) r0.getValue()).intValue();
        View view2 = this.G;
        if (view2 != null) {
            f4m.q((intValue / 2) + i, view2);
        }
        this.H = Boolean.valueOf(z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.y = k5;
        int i = ify.a;
        ify.a(this);
        this.F = new i0(wjs0.b.b0(jwr0.class), new ac20(new z4t0(this, 0), 23)).subscribe(new e7q0(new qhg0(this, 22), 6));
        if (k5.isAttachedToWindow()) {
            c(k5, this);
            return k5;
        }
        k5.addOnAttachStateChangeListener(new c(k5, this, k5));
        return k5;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        d(true);
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ VideoPlaylistPlaceHolder c;

        public a(View view, VideoPlaylistPlaceHolder videoPlaylistPlaceHolder) {
            this.b = view;
            this.c = videoPlaylistPlaceHolder;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = this.c;
            CollapsingToolbarLayout collapsingToolbarLayout = videoPlaylistPlaceHolder.A;
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout != null ? collapsingToolbarLayout.getLayoutParams() : null;
            NonBouncedAppBarLayout.c cVar = layoutParams instanceof NonBouncedAppBarLayout.c ? (NonBouncedAppBarLayout.c) layoutParams : null;
            if (cVar != null) {
                cVar.a = 0;
            }
            NonBouncedAppBarLayout nonBouncedAppBarLayout = videoPlaylistPlaceHolder.z;
            if (nonBouncedAppBarLayout != null) {
                nonBouncedAppBarLayout.h(false, false, true);
            }
            videoPlaylistPlaceHolder.getClass();
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoPlaylistPlaceHolder.z;
            if (nonBouncedAppBarLayout2 != null) {
                nonBouncedAppBarLayout2.setVisibility(0);
            }
            CollapsingToolbarLayout collapsingToolbarLayout2 = videoPlaylistPlaceHolder.A;
            if (collapsingToolbarLayout2 != null) {
                collapsingToolbarLayout2.setVisibility(8);
            }
            VkTopBar vkTopBar = videoPlaylistPlaceHolder.B;
            if (vkTopBar != null) {
                vkTopBar.setVisibility(0);
            }
            view.post(new b(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ VideoPlaylistPlaceHolder c;
        public final /* synthetic */ View d;

        public c(View view, VideoPlaylistPlaceHolder videoPlaylistPlaceHolder, View view2) {
            this.b = view;
            this.c = videoPlaylistPlaceHolder;
            this.d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            VideoPlaylistPlaceHolder.c(this.d, this.c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
