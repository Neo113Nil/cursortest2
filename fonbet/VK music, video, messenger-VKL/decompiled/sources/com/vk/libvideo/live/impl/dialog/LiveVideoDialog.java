package com.vk.libvideo.live.impl.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import xsna.a8v;
import xsna.ays;
import xsna.b5z;
import xsna.c0a;
import xsna.diz;
import xsna.dlz;
import xsna.dq;
import xsna.gz80;
import xsna.gzs;
import xsna.iah0;
import xsna.jfy;
import xsna.jnz;
import xsna.kfy;
import xsna.l8w;
import xsna.lmz;
import xsna.lyd;
import xsna.n5i;
import xsna.niz;
import xsna.pmz;
import xsna.r6m;
import xsna.s1m;
import xsna.sy80;
import xsna.tn10;
import xsna.xy80;
import xsna.ysg0;

/* loaded from: classes.dex */
public class LiveVideoDialog extends AnimationDialog implements niz, diz, sy80, LiveSwipeView.d, ViewTreeObserver.OnWindowFocusChangeListener {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;
    public VideoOwner h0;
    public LiveSwipeView i0;
    public FrameLayout j0;
    public c k0;
    public c l0;
    public boolean m0;
    public boolean n0;
    public c0a p0;

    @NonNull
    public jfy q0;
    public ays r0;
    public xy80 t0;
    public LifecycleHandler u0;
    public String v0;
    public String w0;
    public SearchStatsLoggingInfo x0;
    public VideoFile y0;
    public boolean z0;
    public boolean o0 = false;
    public final a s0 = new a();

    /* loaded from: classes3.dex */
    public class a extends b5z {
        public a() {
        }

        @Override // xsna.b5z
        public final void b(@NonNull Activity activity) {
            LiveVideoDialog.this.oo();
        }

        @Override // xsna.b5z
        public final void c(@NonNull Activity activity) {
            LiveVideoDialog liveVideoDialog = LiveVideoDialog.this;
            liveVideoDialog.i0.pause();
            liveVideoDialog.m0 = true;
            Dialog dialog = liveVideoDialog.s;
            if (dialog != null) {
                dialog.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(liveVideoDialog.r0);
            }
            FrameLayout frameLayout = liveVideoDialog.j0;
            if (frameLayout != null) {
                frameLayout.setKeepScreenOn(false);
            }
            lyd.g().P();
        }

        @Override // xsna.b5z
        public final void e(@NonNull Activity activity) {
            Window window;
            LiveVideoDialog liveVideoDialog = LiveVideoDialog.this;
            if (liveVideoDialog.m0) {
                r6m.a.getClass();
                if (r6m.j()) {
                    liveVideoDialog.i0.resume();
                    liveVideoDialog.m0 = false;
                }
            }
            com.vk.libvideo.design.view.swipe.layout.a aVar = liveVideoDialog.O;
            if (aVar == null) {
                aVar = null;
            }
            aVar.setBackgroundAlpha(255);
            Dialog dialog = liveVideoDialog.s;
            if (dialog == null || dialog.getWindow() == null || liveVideoDialog.s.getWindow().getDecorView() == null || !liveVideoDialog.s.getWindow().getDecorView().isAttachedToWindow() || !liveVideoDialog.o) {
                return;
            }
            Dialog dialog2 = liveVideoDialog.s;
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                if (!gz80.a(24)) {
                    window.setFlags(1024, 1024);
                } else if (!activity.isInMultiWindowMode()) {
                    window.setFlags(1024, 1024);
                }
            }
            liveVideoDialog.s.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(liveVideoDialog.r0);
            FrameLayout frameLayout = liveVideoDialog.j0;
            if (frameLayout != null) {
                frameLayout.setKeepScreenOn(true);
            }
            lyd.g().B();
        }
    }

    @Override // xsna.sy80
    public final void Be() {
        this.t0.i();
        this.t0.g();
    }

    @Override // xsna.niz
    public final void F() {
        this.n0 = true;
        b(this.o0);
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        this.i0.e();
        if (currentLiveView != null) {
            currentLiveView.setVisibilityFaded(false);
        }
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Lg() {
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        currentLiveView.setClipToPadding(false);
        currentLiveView.setClipChildren(false);
        this.i0.e();
        currentLiveView.l();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        return this.i0.d();
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void W6() {
        F();
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void fm() {
        if (this.n0) {
            return;
        }
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        currentLiveView.setClipToPadding(true);
        currentLiveView.setClipChildren(true);
        this.i0.i();
        currentLiveView.e();
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final float getVolume() {
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        if (currentLiveView == null || currentLiveView.getPresenter() == null || currentLiveView.getPresenter().C1() == null) {
            return 1.0f;
        }
        return currentLiveView.getPresenter().C1().getVolume();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final List<View> ho() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.i0.getCurrentLiveView().getOverlayView());
        return arrayList;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final View io() {
        return this.i0;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final tn10 jo() {
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        if (currentLiveView != null) {
            return currentLiveView.getPreviewImageView();
        }
        return null;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int ko() {
        return R.layout.live_video_fullscreen;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final tn10 lo() {
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        if (currentLiveView != null) {
            return currentLiveView.getVideoTextureView().getMatrixProvider();
        }
        return null;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int mo() {
        return R.style.LiveVideoFullScreenDialog;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void no(Rect rect) {
        this.j0.findViewById(R.id.drag_view).setPadding(0, rect.top, 0, 0);
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.dialogs.BaseAnimationDialog, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getArguments() != null) {
            this.v0 = getArguments().getString("ref_screen");
            this.w0 = getArguments().getString("ref_ctx");
            this.y0 = (VideoFile) getArguments().getParcelable(X3.i.b);
            this.z0 = getArguments().getBoolean("stop_on_dsm");
            this.A0 = getArguments().getBoolean("live_rec_on");
            this.x0 = (SearchStatsLoggingInfo) getArguments().getParcelable("search_stats_logging_info");
        }
        Window window = zn().getWindow();
        FragmentActivity kn = kn();
        this.r0 = new ays(getActivity(), window, (ViewGroup) window.getDecorView());
        FrameLayout frameLayout = (FrameLayout) window.getDecorView().getRootView();
        this.j0 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.O;
        if (aVar == null) {
            aVar = null;
        }
        aVar.setBackgroundColor(kn.getColor(R.color.vk_black));
        this.q0 = kfy.a(getActivity(), window);
        xy80 xy80Var = new xy80(kn);
        this.t0 = xy80Var;
        xy80Var.enable();
        LifecycleHandler c = LifecycleHandler.c(kn);
        this.u0 = c;
        c.a(this.s0);
        UserId userId = UserId.d;
        VideoFile videoFile = this.y0;
        if (videoFile != null) {
            i = videoFile.o0();
            userId = this.y0.I0();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
        videoFeatures.getClass();
        if (b.A.a(videoFeatures)) {
            arrayList.add(VideoUrl.DASH_LIVE_ON_DEMAND_URL);
        }
        arrayList.add(VideoUrl.HLS_LIVE);
        arrayList.add(VideoUrl.HLS_ONDEMAND_LIVE_URL);
        List<? extends VideoUrl> list = (List) arrayList.stream().filter(new jnz(0)).collect(Collectors.toList());
        VideoFile videoFile2 = this.y0;
        if (videoFile2 != null && videoFile2.w9().Db(list) == null) {
            this.y0 = null;
        }
        this.h0 = new VideoOwner(this.y0, i, userId);
        com.vk.libvideo.design.view.swipe.layout.a aVar2 = this.O;
        if (aVar2 == null) {
            aVar2 = null;
        }
        LiveSwipeView liveSwipeView = (LiveSwipeView) aVar2.findViewById(R.id.drag_view);
        this.i0 = liveSwipeView;
        liveSwipeView.setWindow(window);
        this.i0.setLiveAnimationController(this);
        this.i0.setFirstInstItemListener(this);
        com.vk.libvideo.design.view.swipe.layout.a aVar3 = this.O;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.setTouchSlop(0);
        com.vk.libvideo.design.view.swipe.layout.a aVar4 = this.O;
        if (aVar4 == null) {
            aVar4 = null;
        }
        aVar4.setDragStartTouchSlop(iah0.a(42.0f));
        com.vk.libvideo.design.view.swipe.layout.a aVar5 = this.O;
        (aVar5 != null ? aVar5 : null).setMinVelocity(100000.0f);
        pmz pmzVar = new pmz(this.i0);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.x0;
        if (searchStatsLoggingInfo != null) {
            pmzVar.u2(new dlz(searchStatsLoggingInfo, new s1m(this, 21)));
        }
        pmzVar.G1(this);
        pmzVar.v2(this);
        pmzVar.w1(this.z0);
        pmzVar.J0(this.A0);
        pmzVar.h2(this.v0);
        pmzVar.w2(this.w0);
        this.i0.setPresenter((lmz) pmzVar);
        pmzVar.e1(this.h0);
        pmzVar.x2();
        pmzVar.start();
        ViewTreeObserver viewTreeObserver = window.getDecorView().getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(this.r0);
        viewTreeObserver.addOnWindowFocusChangeListener(this);
        An(false);
        this.p0 = new c0a(requireContext(), (gzs) new n5i(this, 27));
        lyd.g().B();
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.g()) {
            f<Object> fVar = ysg0.b.a;
            dq dqVar = new dq(17);
            fVar.getClass();
            this.k0 = new i0(fVar, dqVar).subscribe(new l8w(this, 3));
        }
        return onCreateView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver = this.s.getWindow().getDecorView().getViewTreeObserver();
        viewTreeObserver.removeOnGlobalLayoutListener(this.r0);
        viewTreeObserver.removeOnGlobalLayoutListener(this.q0);
        viewTreeObserver.removeOnWindowFocusChangeListener(this);
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.s.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.q0);
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        this.s.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.q0);
        super.onResume();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.l0 = new q(new com.vk.movika.sdk.base.model.history.b(16)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a8v(this, 4));
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (this.p0.g() != null) {
            if (z) {
                this.p0.g().d();
            } else {
                this.p0.g().c();
            }
        }
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void oo() {
        super.oo();
        c cVar = this.k0;
        if (cVar != null) {
            cVar.dispose();
            this.k0 = null;
        }
        c cVar2 = this.l0;
        if (cVar2 != null) {
            cVar2.dispose();
            this.l0 = null;
        }
        this.u0.e(this.s0);
        this.t0.b(-1);
        this.t0.disable();
        this.i0.c();
        this.i0.release();
        if (this.p0.g() != null) {
            this.p0.g().c();
        }
        lyd.g().P();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void qo() {
        super.qo();
        if (this.p0.g() != null) {
            this.p0.g().e();
        }
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void setVolume(float f) {
        LiveView currentLiveView = this.i0.getCurrentLiveView();
        if (currentLiveView == null || currentLiveView.getPresenter() == null || currentLiveView.getPresenter().C1() == null) {
            return;
        }
        currentLiveView.getPresenter().C1().setVolume(f);
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 5380);
        window.setFlags(1024, 1024);
        window.getAttributes().windowAnimations = R.style.LiveVideoFullScreenDialog;
        window.setStatusBarColor(0);
        yn.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.hnz
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int i2 = LiveVideoDialog.B0;
                LiveVideoDialog liveVideoDialog = LiveVideoDialog.this;
                if (i == 24) {
                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                    if (com.vk.libvideo.autoplay.e.c()) {
                        VideoFile videoFile = liveVideoDialog.h0.f;
                        if (videoFile != null) {
                            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                            yg5 e = b.C1208b.a().e(videoFile, null);
                            if (((e.d() || e.isPlaying()) && e.v0() != null && !videoFile.k0()) || e.P0()) {
                                com.vk.libvideo.autoplay.e.f(false);
                                z2s0.b.getClass();
                                e.setVolume(z2s0.n);
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (i == 4 && keyEvent.getAction() == 1) {
                    if (!liveVideoDialog.i0.a0()) {
                        liveVideoDialog.i0.e();
                        liveVideoDialog.i0.getCurrentLiveView().setVisibilityFaded(false);
                        liveVideoDialog.b(false);
                    }
                    return true;
                }
                return false;
            }
        });
        lyd.g().B();
        return yn;
    }

    @Override // xsna.niz
    public final void delete() {
    }

    @Override // xsna.niz
    public final void t6() {
    }
}
