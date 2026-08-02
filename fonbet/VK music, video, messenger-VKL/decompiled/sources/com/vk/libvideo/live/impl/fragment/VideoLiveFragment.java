package com.vk.libvideo.live.impl.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.b0u0;
import xsna.bpn0;
import xsna.c0a;
import xsna.dlz;
import xsna.fbr0;
import xsna.fjs0;
import xsna.fms0;
import xsna.fxc0;
import xsna.gkc0;
import xsna.gzs;
import xsna.hg1;
import xsna.iah0;
import xsna.ies;
import xsna.iut0;
import xsna.jes;
import xsna.kes;
import xsna.ksg0;
import xsna.l6n0;
import xsna.lmz;
import xsna.lqs0;
import xsna.lyd;
import xsna.msy;
import xsna.niz;
import xsna.oiz;
import xsna.onm0;
import xsna.pd40;
import xsna.pmz;
import xsna.q9i0;
import xsna.qtx0;
import xsna.rl3;
import xsna.rnz;
import xsna.sy80;
import xsna.tbe0;
import xsna.uds;
import xsna.vcl0;
import xsna.x2j0;
import xsna.x9l0;
import xsna.xds;
import xsna.xy80;
import xsna.yg5;
import xsna.z2s0;
import xsna.z9c;
import xsna.zet0;
import xsna.zn8;

/* compiled from: VideoLiveFragment.kt */
/* loaded from: classes3.dex */
public final class VideoLiveFragment extends FragmentImpl implements niz, sy80, ies, xds, kes, jes, uds, a.e, fms0, ViewTreeObserver.OnWindowFocusChangeListener, qtx0 {
    public static final /* synthetic */ int i0 = 0;
    public VideoOwner N;
    public a O;
    public c P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public c0a V;
    public xy80 W;
    public String X;
    public String Y;
    public String Z;
    public SearchStatsLoggingInfo a0;
    public VideoFile b0;
    public final fjs0 c0 = new fjs0();
    public final String d0 = "VideoLiveFragment";
    public final Object e0;
    public final Object f0;
    public final Object g0;
    public final Object h0;

    /* compiled from: VideoLiveFragment.kt */
    public static final class a {
        public final LiveSwipeView a;
        public final com.vk.libvideo.design.view.swipe.layout.a b;

        public a(ViewGroup viewGroup) {
            this.a = (LiveSwipeView) viewGroup.findViewById(R.id.drag_view);
            this.b = (com.vk.libvideo.design.view.swipe.layout.a) viewGroup.findViewById(R.id.live_video_swipe_layout);
        }
    }

    public VideoLiveFragment() {
        l6n0 l6n0Var = new l6n0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e0 = msy.a(lazyThreadSafetyMode, l6n0Var);
        this.f0 = msy.a(lazyThreadSafetyMode, new x9l0(this, 11));
        this.g0 = msy.a(lazyThreadSafetyMode, new lqs0(this, 1));
        this.h0 = msy.a(lazyThreadSafetyMode, new x2j0(this, 11));
    }

    @Override // xsna.sy80
    public final void Be() {
        xy80 xy80Var = this.W;
        if (xy80Var != null) {
            xy80Var.i();
        }
        xy80 xy80Var2 = this.W;
        if (xy80Var2 != null) {
            xy80Var2.g();
        }
    }

    @Override // xsna.qtx0
    public final String D9() {
        return this.d0;
    }

    @Override // xsna.niz
    public final void F() {
        a aVar = this.O;
        if (aVar != null) {
            LiveSwipeView liveSwipeView = aVar.a;
            liveSwipeView.e();
            LiveView currentLiveView = liveSwipeView.getCurrentLiveView();
            if (currentLiveView != null) {
                currentLiveView.setVisibilityFaded(false);
            }
        }
        eo();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Lg() {
        LiveSwipeView liveSwipeView;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null) {
            return;
        }
        liveSwipeView.e();
        LiveView currentLiveView = liveSwipeView.getCurrentLiveView();
        if (currentLiveView != null) {
            currentLiveView.setClipToPadding(false);
            currentLiveView.setClipChildren(false);
            currentLiveView.setVisibilityFaded(false);
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        LiveSwipeView liveSwipeView;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null) {
            return false;
        }
        return liveSwipeView.d();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Un(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 24) {
            e eVar = e.a;
            if (e.c()) {
                VideoOwner videoOwner = this.N;
                if (videoOwner == null) {
                    videoOwner = null;
                }
                VideoFile videoFile = videoOwner.f;
                if (videoFile != null) {
                    bpn0 bpn0Var = b.B;
                    yg5 e = b.C1208b.a().e(videoFile, null);
                    if (!((!e.d() && !e.isPlaying()) || e.v0() == null || videoFile.k0()) || e.P0()) {
                        e.f(false);
                        z2s0.b.getClass();
                        e.setVolume(z2s0.n);
                    }
                }
            }
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void W6() {
        F();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Wh() {
        LiveSwipeView liveSwipeView;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null) {
            return false;
        }
        return liveSwipeView.d();
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return true;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Yb() {
        a aVar = this.O;
        if (aVar != null) {
            LiveSwipeView liveSwipeView = aVar.a;
            liveSwipeView.release();
            liveSwipeView.clearAnimation();
        }
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        LiveSwipeView liveSwipeView;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null) {
            return false;
        }
        if (liveSwipeView.a0()) {
            return true;
        }
        liveSwipeView.e();
        liveSwipeView.getCurrentLiveView().setVisibilityFaded(false);
        eo();
        return true;
    }

    public final void eo() {
        a aVar = this.O;
        if (aVar != null) {
            LiveSwipeView liveSwipeView = aVar.a;
            if (this.R) {
                return;
            }
            this.R = true;
            liveSwipeView.clearAnimation();
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveSwipeView, (Property<LiveSwipeView, Float>) FrameLayout.ALPHA, liveSwipeView.getAlpha(), 0.01f);
            com.vk.libvideo.design.view.swipe.layout.a aVar2 = aVar.b;
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(aVar2, com.vk.libvideo.design.view.swipe.layout.a.o, aVar2.getVolume(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            animatorSet.addListener(new com.vk.libvideo.live.impl.fragment.a(aVar, this));
            animatorSet.setDuration(150L);
            animatorSet.start();
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void fm() {
        LiveSwipeView liveSwipeView;
        LiveView currentLiveView;
        LiveSwipeView liveSwipeView2;
        if (this.R) {
            return;
        }
        a aVar = this.O;
        if (aVar != null && (liveSwipeView2 = aVar.a) != null) {
            liveSwipeView2.i();
        }
        a aVar2 = this.O;
        if (aVar2 == null || (liveSwipeView = aVar2.a) == null || (currentLiveView = liveSwipeView.getCurrentLiveView()) == null) {
            return;
        }
        currentLiveView.setClipToPadding(true);
        currentLiveView.setClipChildren(true);
        currentLiveView.setVisibilityFaded(true);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final float getVolume() {
        LiveSwipeView liveSwipeView;
        LiveView currentLiveView;
        oiz presenter;
        rnz C1;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null || (currentLiveView = liveSwipeView.getCurrentLiveView()) == null || (presenter = currentLiveView.getPresenter()) == null || (C1 = presenter.C1()) == null) {
            return 1.0f;
        }
        return C1.getVolume();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean h6() {
        return false;
    }

    @Override // xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.qtx0
    public final boolean lc() {
        return true;
    }

    @Override // xsna.woo0
    public final int o7() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.X = arguments.getString("track_code");
            this.Y = arguments.getString("ref_screen");
            this.Z = arguments.getString("ref_ctx");
            this.b0 = (VideoFile) zn8.a(VideoFile.class, arguments, X3.i.b);
            this.S = arguments.getBoolean("stop_on_dsm");
            this.T = arguments.getBoolean("live_rec_on");
            this.U = arguments.getBoolean("live_pip_2_container");
            this.a0 = (SearchStatsLoggingInfo) zn8.a(SearchStatsLoggingInfo.class, arguments, "search_stats_logging_info");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.live_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fbr0 fbr0Var;
        LiveSwipeView liveSwipeView;
        LiveSwipeView liveSwipeView2;
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this);
        }
        super.onDestroyView();
        c cVar = this.P;
        if (cVar != null) {
            cVar.dispose();
        }
        this.P = null;
        xy80 xy80Var = this.W;
        if (xy80Var != null) {
            xy80Var.b(-1);
        }
        xy80 xy80Var2 = this.W;
        if (xy80Var2 != null) {
            xy80Var2.disable();
        }
        a aVar = this.O;
        if (aVar != null && (liveSwipeView2 = aVar.a) != null) {
            liveSwipeView2.c();
        }
        a aVar2 = this.O;
        if (aVar2 != null && (liveSwipeView = aVar2.a) != null) {
            liveSwipeView.release();
        }
        c0a c0aVar = this.V;
        if (c0aVar != null && (fbr0Var = (fbr0) c0aVar.c) != null) {
            fbr0Var.c();
        }
        lyd.g().P();
        this.O = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        com.vk.libvideo.design.view.swipe.layout.a aVar;
        LiveSwipeView liveSwipeView;
        super.onPause();
        xy80 xy80Var = this.W;
        if (xy80Var != null) {
            xy80Var.disable();
        }
        if (kn().isInPictureInPictureMode()) {
            return;
        }
        a aVar2 = this.O;
        if (aVar2 != null && (liveSwipeView = aVar2.a) != null) {
            liveSwipeView.pause();
        }
        this.Q = true;
        a aVar3 = this.O;
        if (aVar3 != null && (aVar = aVar3.b) != null) {
            aVar.setKeepScreenOn(false);
        }
        lyd.g().P();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        com.vk.libvideo.design.view.swipe.layout.a aVar;
        LiveSwipeView liveSwipeView;
        a aVar2;
        LiveSwipeView liveSwipeView2;
        LiveView currentLiveView;
        oiz presenter;
        rnz C1;
        fbr0 fbr0Var;
        super.onResume();
        this.c0.a();
        c0a c0aVar = this.V;
        if (c0aVar != null && (fbr0Var = (fbr0) c0aVar.c) != null) {
            fbr0Var.e();
        }
        if (!kn().isInPictureInPictureMode() && (aVar2 = this.O) != null && (liveSwipeView2 = aVar2.a) != null && (currentLiveView = liveSwipeView2.getCurrentLiveView()) != null && (presenter = currentLiveView.getPresenter()) != null && (C1 = presenter.C1()) != null) {
            C1.D();
        }
        if (this.Q) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                a aVar3 = this.O;
                if (aVar3 != null && (liveSwipeView = aVar3.a) != null) {
                    liveSwipeView.resume();
                }
                this.Q = false;
            }
        }
        a aVar4 = this.O;
        if (aVar4 != null && (aVar = aVar4.b) != null) {
            aVar.setKeepScreenOn(true);
        }
        xy80 xy80Var = this.W;
        if (xy80Var != null) {
            xy80Var.enable();
        }
        lyd.g().B();
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        LiveSwipeView liveSwipeView;
        com.vk.libvideo.design.view.swipe.layout.a aVar;
        LiveSwipeView liveSwipeView2;
        VideoUrlStorage w9;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        this.O = new a(viewGroup);
        this.P = new q(new vcl0(8)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new onm0(new ksg0(this, 21), 7));
        FragmentActivity kn = kn();
        xy80 xy80Var = new xy80(kn);
        xy80Var.enable();
        this.W = xy80Var;
        VideoFile videoFile = this.b0;
        if (videoFile == null || (userId = videoFile.I0()) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        VideoFile videoFile2 = this.b0;
        int o0 = videoFile2 != null ? videoFile2.o0() : 0;
        VideoFile videoFile3 = this.b0;
        String M4 = videoFile3 != null ? videoFile3.M4() : null;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
        videoFeatures.getClass();
        List I = rl3.I(new VideoUrl[]{com.vk.toggle.b.A.a(videoFeatures) ? VideoUrl.DASH_LIVE_ON_DEMAND_URL : null, VideoUrl.HLS_LIVE, VideoUrl.HLS_ONDEMAND_LIVE_URL});
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (!fxc0.B().i().c().contains((VideoUrl) obj)) {
                arrayList.add(obj);
            }
        }
        VideoFile videoFile4 = this.b0;
        if (((videoFile4 == null || (w9 = videoFile4.w9()) == null) ? null : w9.Db(arrayList)) != null) {
            this.b0 = null;
        }
        this.N = new VideoOwner(this.b0, o0, userId2, this.X, M4);
        a aVar2 = this.O;
        if (aVar2 != null && (liveSwipeView2 = aVar2.a) != null) {
            liveSwipeView2.setWindow(kn.getWindow());
        }
        a aVar3 = this.O;
        if (aVar3 != null && (aVar = aVar3.b) != null) {
            aVar.setTouchSlop(0);
            aVar.setDragStartTouchSlop(iah0.a(42.0f));
            aVar.setMinVelocity(100000.0f);
            aVar.setNavigationCallback(this);
        }
        a aVar4 = this.O;
        pmz pmzVar = new pmz(aVar4 != null ? aVar4.a : null);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a0;
        if (searchStatsLoggingInfo != null) {
            pmzVar.z = new dlz(searchStatsLoggingInfo, new tbe0(this, 25));
        }
        pmzVar.q = this.U;
        pmzVar.A = (zet0) this.f0.getValue();
        pmzVar.G = this.c0;
        pmzVar.B = (com.vk.video.ui.share.api.b) this.g0.getValue();
        pmzVar.C = (VideoAdvertisementsRepository) this.h0.getValue();
        pmzVar.f = this;
        pmzVar.g = this;
        pmzVar.p = this.S;
        pmzVar.J0(this.T);
        pmzVar.w = this.Y;
        pmzVar.x = this.Z;
        a aVar5 = this.O;
        if (aVar5 != null && (liveSwipeView = aVar5.a) != null) {
            liveSwipeView.setPresenter((lmz) pmzVar);
        }
        VideoOwner videoOwner = this.N;
        pmzVar.y = videoOwner != null ? videoOwner : null;
        pmzVar.r = 130L;
        pmzVar.start();
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.V = new c0a(requireContext(), (gzs) new gkc0(this, 24));
        lyd.g().B();
        z9c z9cVar = new z9c(view, 1);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, z9cVar);
        lyd.g().B();
        hg1.a(((f) this.e0.getValue()).subscribe(new pd40(new q9i0(this, 10), 20)), getViewLifecycleOwner());
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        fbr0 fbr0Var;
        c0a c0aVar = this.V;
        if (c0aVar == null || (fbr0Var = (fbr0) c0aVar.c) == null) {
            return;
        }
        if (z) {
            fbr0Var.d();
        } else {
            fbr0Var.c();
        }
    }

    @Override // xsna.qtx0
    public final yg5 q5() {
        LiveSwipeView liveSwipeView;
        LiveView currentLiveView;
        oiz presenter;
        a aVar = this.O;
        rnz C1 = (aVar == null || (liveSwipeView = aVar.a) == null || (currentLiveView = liveSwipeView.getCurrentLiveView()) == null || (presenter = currentLiveView.getPresenter()) == null) ? null : presenter.C1();
        qtx0 qtx0Var = C1 instanceof qtx0 ? (qtx0) C1 : null;
        if (qtx0Var != null) {
            return qtx0Var.q5();
        }
        return null;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void setVolume(float f) {
        LiveSwipeView liveSwipeView;
        LiveView currentLiveView;
        oiz presenter;
        rnz C1;
        a aVar = this.O;
        if (aVar == null || (liveSwipeView = aVar.a) == null || (currentLiveView = liveSwipeView.getCurrentLiveView()) == null || (presenter = currentLiveView.getPresenter()) == null || (C1 = presenter.C1()) == null) {
            return;
        }
        C1.setVolume(f);
    }

    @Override // xsna.niz
    public final void delete() {
    }

    @Override // xsna.niz
    public final void t6() {
    }
}
