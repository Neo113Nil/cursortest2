package com.vk.music.podcast.impl.ui.page;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.transition.TransitionOption$Type;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.c;
import com.vk.movika.tools.controls.seekbar.k;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a040;
import xsna.adz;
import xsna.awt0;
import xsna.ayn0;
import xsna.bl30;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cib0;
import xsna.df90;
import xsna.dhr0;
import xsna.ef90;
import xsna.epx;
import xsna.fib0;
import xsna.fm20;
import xsna.gd70;
import xsna.gjb0;
import xsna.gxp;
import xsna.gzs;
import xsna.h6s;
import xsna.ic40;
import xsna.jai;
import xsna.jw30;
import xsna.k7z;
import xsna.k840;
import xsna.lyd;
import xsna.m3a0;
import xsna.msy;
import xsna.mzp0;
import xsna.n6s;
import xsna.nds;
import xsna.oz50;
import xsna.pd90;
import xsna.phb0;
import xsna.qhh0;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sib0;
import xsna.so40;
import xsna.too0;
import xsna.tor0;
import xsna.u2b0;
import xsna.uj40;
import xsna.v100;
import xsna.w950;
import xsna.whp;
import xsna.x6s;
import xsna.xa80;
import xsna.xl40;
import xsna.xxn0;
import xsna.z260;
import xsna.zhb0;
import xsna.zq70;

/* compiled from: PodcastFragment.kt */
/* loaded from: classes3.dex */
public final class PodcastFragment extends BaseMvpFragment<gjb0> implements nds, qhh0, too0 {
    public static final /* synthetic */ int m0 = 0;
    public final Object T;
    public final Object U;
    public final bpn0 V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final u2b0 Z;
    public NonBouncedAppBarLayout a0;
    public RecyclerView b0;
    public SwipeDrawableRefreshLayout c0;
    public View d0;
    public View e0;
    public zhb0 f0;
    public fib0 g0;
    public cib0 h0;
    public ayn0 i0;
    public gzs<s3q0> j0;
    public pd90<zhb0> k0;
    public final b l0;

    /* compiled from: PodcastFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(PodcastFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            u(TransitionOption$Type.TRANSITION_SLIDE_FROM_RIGHT.h());
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_PODCAST_PAGE, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }

        public final void y(String str) {
            this.j.putString("launch_origin", str);
        }

        public final void z(String str) {
            MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(str);
            if (Fb.equals(MusicPlaybackLaunchContext.d) || Fb.t().length() <= 0) {
                return;
            }
            this.j.putString("ref", Fb.t());
        }
    }

    public PodcastFragment() {
        fm20 fm20Var = new fm20(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, fm20Var);
        this.U = msy.a(lazyThreadSafetyMode, new jw30(this, 11));
        this.V = new bpn0(new so40(this, 10));
        this.W = msy.a(lazyThreadSafetyMode, new k7z(this, 22));
        this.X = msy.a(lazyThreadSafetyMode, new gd70(this, 9));
        this.Y = msy.a(lazyThreadSafetyMode, new v100(this, 19));
        this.Z = k840.a.g().b();
        this.l0 = new b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        fib0 fib0Var = this.g0;
        if (fib0Var != null) {
            fib0Var.Ng();
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        return (jo() || dhr0.M()) ? false : true;
    }

    public final boolean jo() {
        Resources resources;
        FragmentActivity activity = getActivity();
        return (activity == null || (resources = activity.getResources()) == null || !resources.getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver)) ? false : true;
    }

    public final void ko(MusicTrack musicTrack, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ic40.r(lyd.g().w(), activity, musicBottomSheetLaunchPoint, musicTrack, null, null, false, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.i0;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
        fib0 fib0Var = this.g0;
        if (fib0Var != null) {
            fib0Var.onConfigurationChanged(configuration);
        }
        RecyclerView recyclerView = this.b0;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sib0 sib0Var = new sib0(this, (phb0) this.T.getValue(), (w950) this.U.getValue(), (xl40) this.X.getValue(), this.J);
        this.f0 = new zhb0(sib0Var);
        this.S = sib0Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_podcast, viewGroup, false);
        this.k0 = new pd90<>(this.f0, n6s.a, x6s.a, h6s.a, new xa80() { // from class: xsna.jhb0
            @Override // xsna.xa80
            public final void b() {
                gzs<s3q0> gzsVar = PodcastFragment.this.j0;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.music_playlist_content_list);
        recyclerView.setAdapter(this.k0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(new g());
        recyclerView.addItemDecoration(new tor0());
        this.i0 = new ayn0(recyclerView, new z260(this, 13), 14);
        this.b0 = recyclerView;
        this.g0 = jo() ? new xxn0(inflate, (gjb0) this.S) : new m3a0(inflate, (gjb0) this.S);
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = (SwipeDrawableRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        int dimensionPixelSize = swipeDrawableRefreshLayout.getResources().getDimensionPixelSize(R.dimen.music_playlists_swipe_to_refresh_custom_offset);
        int dimensionPixelSize2 = swipeDrawableRefreshLayout.getResources().getDimensionPixelSize(R.dimen.music_playlists_swipe_to_refresh_buttons_offset);
        int progressViewStartOffset = swipeDrawableRefreshLayout.getProgressViewStartOffset() - dimensionPixelSize;
        swipeDrawableRefreshLayout.s(progressViewStartOffset, (dimensionPixelSize / 2) + swipeDrawableRefreshLayout.getProgressViewEndOffset() + dimensionPixelSize2 + progressViewStartOffset);
        this.c0 = swipeDrawableRefreshLayout;
        this.a0 = (NonBouncedAppBarLayout) inflate.findViewById(R.id.music_playlist_non_bounced_app_bar_layout);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            bwt0.i0(toolbar, new bl30(this, 9));
        }
        View findViewById = inflate.findViewById(R.id.progress);
        bwt0.Z(R.attr.vk_ui_background_content, findViewById);
        this.d0 = findViewById;
        View findViewById2 = inflate.findViewById(R.id.error_layout);
        this.h0 = new cib0(findViewById2, (KidsModeRestrictionRenderer) this.Y.getValue(), (gjb0) this.S, new a040(this, 18));
        this.e0 = findViewById2;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ayn0 ayn0Var = this.i0;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.a();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        gjb0 gjb0Var = (gjb0) this.S;
        if (gjb0Var != null) {
            gjb0Var.F(getArguments());
        }
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        NonBouncedAppBarLayout nonBouncedAppBarLayout;
        if (getResources().getConfiguration().orientation == 1 && (nonBouncedAppBarLayout = this.a0) != null) {
            nonBouncedAppBarLayout.h(true, true, true);
        }
        RecyclerView recyclerView = this.b0;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        gjb0 gjb0Var = (gjb0) this.S;
        if (gjb0Var == null || !gjb0Var.g7()) {
            return;
        }
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_KIDS_PODCAST_PAGE;
    }

    /* compiled from: PodcastFragment.kt */
    public final class b implements c.n {
        public b() {
        }

        @Override // com.vk.lists.c.n
        public final void Fe() {
            pd90<zhb0> pd90Var = PodcastFragment.this.k0;
            if (pd90Var != null) {
                pd90Var.y0();
            }
        }

        @Override // com.vk.lists.c.n
        public final void K9() {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = PodcastFragment.this.c0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setRefreshing(true);
            }
        }

        @Override // com.vk.lists.c.n
        public final void M9(df90 df90Var) {
            RecyclerView recyclerView = PodcastFragment.this.b0;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(new ef90(df90Var));
            }
        }

        @Override // com.vk.lists.c.n
        public final void Mk() {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = PodcastFragment.this.c0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setRefreshing(false);
            }
        }

        @Override // com.vk.lists.c.n
        public final void Om(df90 df90Var) {
            RecyclerView recyclerView = PodcastFragment.this.b0;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new ef90(df90Var));
            }
        }

        @Override // com.vk.lists.c.n
        public final void e0() {
            PodcastFragment podcastFragment = PodcastFragment.this;
            View view = podcastFragment.d0;
            if (view != null) {
                bwt0.p0(view, true);
            }
            cib0 cib0Var = podcastFragment.h0;
            if (cib0Var != null) {
                cib0Var.a();
            }
            pd90<zhb0> pd90Var = podcastFragment.k0;
            if (pd90Var != null) {
                pd90Var.A0();
            }
        }

        @Override // com.vk.lists.c.n
        public final void f0() {
            PodcastFragment podcastFragment = PodcastFragment.this;
            cib0 cib0Var = podcastFragment.h0;
            if (cib0Var != null) {
                cib0Var.a();
            }
            View view = podcastFragment.d0;
            if (view != null) {
                bwt0.p0(view, false);
            }
            pd90<zhb0> pd90Var = podcastFragment.k0;
            if (pd90Var != null) {
                pd90Var.A0();
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.lists.c.n
        public final void fj(Throwable th, gxp gxpVar) {
            PodcastFragment podcastFragment = PodcastFragment.this;
            cib0 cib0Var = podcastFragment.h0;
            if (cib0Var != null) {
                uj40 uj40Var = cib0Var.e;
                ComposeView composeView = cib0Var.f;
                if (((Boolean) cib0Var.d.getValue()).booleanValue()) {
                    if (epx.f(th != null ? Boolean.valueOf(zq70.B(th)) : null, Boolean.TRUE)) {
                        uj40Var.setVisibility(4);
                        awt0.u(composeView, true);
                        composeView.setContent(new jai(553942724, new k(cib0Var, 8), true));
                        bwt0.p0(cib0Var.a, true);
                    }
                }
                composeView.setVisibility(4);
                awt0.u(uj40Var, true);
                bwt0.p0(cib0Var.a, true);
            }
            View view = podcastFragment.d0;
            if (view != null) {
                bwt0.p0(view, false);
            }
            pd90<zhb0> pd90Var = podcastFragment.k0;
            if (pd90Var != null) {
                pd90Var.A0();
            }
        }

        @Override // com.vk.lists.c.n
        public final void lb() {
            pd90<zhb0> pd90Var = PodcastFragment.this.k0;
            if (pd90Var != null) {
                pd90Var.z0();
            }
        }

        @Override // com.vk.lists.c.n
        public final void qg(whp whpVar) {
            PodcastFragment podcastFragment = PodcastFragment.this;
            cib0 cib0Var = podcastFragment.h0;
            if (cib0Var != null) {
                cib0Var.a();
            }
            View view = podcastFragment.d0;
            if (view != null) {
                bwt0.p0(view, false);
            }
            pd90<zhb0> pd90Var = podcastFragment.k0;
            if (pd90Var != null) {
                pd90Var.A0();
            }
        }

        @Override // com.vk.lists.c.n
        public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
            PodcastFragment.this.j0 = gzsVar;
        }

        @Override // com.vk.lists.c.n
        public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = PodcastFragment.this.c0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setOnRefreshListener(gzsVar != null ? new adz(gzsVar, 8) : null);
            }
        }

        @Override // com.vk.lists.c.n
        public final void gl() {
        }

        @Override // com.vk.lists.c.n
        public final void setDataObserver(gzs<s3q0> gzsVar) {
        }

        @Override // com.vk.lists.c.n
        public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        }
    }
}
