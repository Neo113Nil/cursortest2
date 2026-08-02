package com.vk.movika.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.swipe.SwipeFrameLayout;
import com.vk.libvideo.design.view.swipe.layout.SwipeLayout;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.acx;
import xsna.b0u0;
import xsna.bkm;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d8s0;
import xsna.dbs0;
import xsna.dei0;
import xsna.dz20;
import xsna.e43;
import xsna.ebs0;
import xsna.ecx;
import xsna.epx;
import xsna.exr0;
import xsna.fcn;
import xsna.gkc0;
import xsna.gzs;
import xsna.hfs0;
import xsna.i0q0;
import xsna.iah0;
import xsna.ikv0;
import xsna.iml0;
import xsna.io2;
import xsna.iut0;
import xsna.izs;
import xsna.k6s0;
import xsna.kcj0;
import xsna.kqs0;
import xsna.kz20;
import xsna.l6s0;
import xsna.ljt0;
import xsna.lqs0;
import xsna.lyd;
import xsna.maz;
import xsna.mqs0;
import xsna.msy;
import xsna.ofc0;
import xsna.ogl;
import xsna.ows0;
import xsna.oz50;
import xsna.ozl;
import xsna.p90;
import xsna.pgl;
import xsna.pis0;
import xsna.pwh0;
import xsna.q86;
import xsna.qcx;
import xsna.qcy;
import xsna.qdz;
import xsna.rcx;
import xsna.rrn0;
import xsna.s200;
import xsna.s3q0;
import xsna.sms0;
import xsna.tcx;
import xsna.tn10;
import xsna.tsk0;
import xsna.u9t0;
import xsna.v3t0;
import xsna.v5n0;
import xsna.vit0;
import xsna.w0t0;
import xsna.w2j0;
import xsna.ww50;
import xsna.wzs;
import xsna.x2j0;
import xsna.x9l0;
import xsna.xnt0;
import xsna.xv0;
import xsna.xy80;
import xsna.y6s0;
import xsna.yct0;
import xsna.yks0;
import xsna.zet0;

/* compiled from: VideoInteractiveFullscreenFragment.kt */
/* loaded from: classes3.dex */
public final class VideoInteractiveFullscreenFragment extends AnimationDialog implements dz20, rcx.e, l6s0, ebs0 {
    public static final /* synthetic */ int Q0 = 0;
    public final Object A0;
    public final Object B0;
    public String C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public final bpn0 K0;
    public kz20 L0;
    public yks0 M0;
    public exr0 N0;
    public final Object O0;
    public final e P0;
    public final /* synthetic */ pgl h0 = new pgl();
    public final bpn0 i0 = new bpn0(new rrn0(this, 16));
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final Object p0;
    public final Object q0;
    public final Object r0;
    public final Object s0;
    public rcx t0;
    public FitSystemWindowsFrameLayout u0;
    public ViewGroup v0;
    public ViewGroup w0;
    public ViewGroup x0;
    public xy80 y0;
    public final kqs0 z0;

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public static final class a extends oz50 {
        public final Boolean m;

        public a(VideoFile videoFile, boolean z, boolean z2, Boolean bool) {
            super(VideoInteractiveFullscreenFragment.class, null, null);
            this.m = bool;
            this.j.putParcelable(X3.i.b, videoFile);
            this.j.putBoolean("over_dlg", z);
            this.j.putString("referrer", null);
            this.j.putBoolean("over_activity", false);
            this.j.putBoolean("stop_on_close", z2);
        }

        public final void y(Activity activity, xy80 xy80Var, io2 io2Var) {
            if (!(activity instanceof FragmentActivity) || p90.e(activity)) {
                L.G("Can't create dialog, invalid activity");
                return;
            }
            VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = (VideoInteractiveFullscreenFragment) f();
            videoInteractiveFullscreenFragment.y0 = xy80Var;
            Boolean bool = this.m;
            videoInteractiveFullscreenFragment.F0 = bool != null ? bool.booleanValue() : false;
            videoInteractiveFullscreenFragment.X = io2Var;
            videoInteractiveFullscreenFragment.setArguments(this.j);
            videoInteractiveFullscreenFragment.Td(((FragmentActivity) activity).getSupportFragmentManager(), "VideoInteractiveDialog");
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public final class d implements ViewTreeObserver.OnWindowFocusChangeListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            ww50 v;
            boolean z2 = true;
            VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = VideoInteractiveFullscreenFragment.this;
            if (!z) {
                kz20 kz20Var = videoInteractiveFullscreenFragment.L0;
                if (kz20Var != null && !kz20Var.b()) {
                    rcx rcxVar = videoInteractiveFullscreenFragment.t0;
                    fcn fcnVar = null;
                    if (rcxVar == null) {
                        rcxVar = null;
                    }
                    if (!rcxVar.o4()) {
                        FragmentActivity activity = videoInteractiveFullscreenFragment.getActivity();
                        if (activity != null && (v = s200.v(activity)) != null) {
                            fcnVar = v.z();
                        }
                        if (!epx.f(fcnVar, videoInteractiveFullscreenFragment)) {
                            if (videoInteractiveFullscreenFragment.I0) {
                                videoInteractiveFullscreenFragment.wo();
                            }
                            z2 = false;
                        }
                    }
                }
            } else if (!videoInteractiveFullscreenFragment.I0) {
                videoInteractiveFullscreenFragment.xo();
            }
            videoInteractiveFullscreenFragment.H0 = z2;
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public static final class e implements bkm {
        public e() {
        }

        @Override // xsna.bkm
        public final void bb(int i) {
            ww50 v;
            fcn z;
            xy80 xy80Var;
            VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = VideoInteractiveFullscreenFragment.this;
            FragmentActivity activity = videoInteractiveFullscreenFragment.getActivity();
            if (activity == null || (v = s200.v(activity)) == null || (z = v.z()) == videoInteractiveFullscreenFragment || !(z instanceof BaseAnimationDialog) || (z instanceof AnimationDialog) || (xy80Var = videoInteractiveFullscreenFragment.y0) == null) {
                return;
            }
            xy80Var.disable();
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Rect, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Rect rect) {
            ((VideoInteractiveFullscreenFragment) this.receiver).no(rect);
            return s3q0.a;
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Rect, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Rect rect) {
            ((VideoInteractiveFullscreenFragment) this.receiver).no(rect);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [xsna.kqs0] */
    public VideoInteractiveFullscreenFragment() {
        lqs0 lqs0Var = new lqs0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, lqs0Var);
        this.k0 = msy.a(lazyThreadSafetyMode, new x2j0(this, 10));
        this.l0 = msy.a(lazyThreadSafetyMode, new pwh0(this, 22));
        this.m0 = msy.a(lazyThreadSafetyMode, new v5n0(this, 14));
        this.n0 = msy.a(lazyThreadSafetyMode, new tsk0(this, 21));
        this.o0 = msy.a(lazyThreadSafetyMode, new pis0(this, 2));
        this.p0 = msy.a(lazyThreadSafetyMode, new dei0(this, 25));
        this.q0 = msy.a(lazyThreadSafetyMode, new iml0(this, 14));
        this.r0 = msy.a(lazyThreadSafetyMode, new ofc0(this, 24));
        int i = 18;
        this.s0 = msy.a(lazyThreadSafetyMode, new kcj0(this, i));
        this.z0 = new xy80.c() { // from class: xsna.kqs0
            @Override // xsna.xy80.c
            public final void a(int i2) {
                int i3 = VideoInteractiveFullscreenFragment.Q0;
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = VideoInteractiveFullscreenFragment.this;
                videoInteractiveFullscreenFragment.getClass();
                videoInteractiveFullscreenFragment.vo(i2 == 0 || i2 == 8);
            }
        };
        this.A0 = msy.a(lazyThreadSafetyMode, new w2j0(this, i));
        this.B0 = msy.a(lazyThreadSafetyMode, new gkc0(this, 23));
        this.H0 = true;
        this.K0 = new bpn0(new xv0(29));
        this.O0 = msy.a(lazyThreadSafetyMode, new x9l0(this, 10));
        this.P0 = new e();
    }

    public static boolean uo(Configuration configuration) {
        return configuration != null && configuration.orientation == 2;
    }

    @Override // xsna.dz20
    public final void Ff(String str) {
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.j2(false, false);
        this.J0++;
    }

    @Override // xsna.dz20
    public final void Qc(String str) {
        int i = this.J0 - 1;
        this.J0 = i;
        if (i == 0) {
            rcx rcxVar = this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.j2(true, true);
            yo();
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return (xnt0) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rcx.e
    public final void ab(rcx.d dVar) {
        if (dVar.equals(rcx.d.a.a)) {
            b(false);
            return;
        }
        if (dVar instanceof rcx.d.e) {
            if (!((rcx.d.e) dVar).a) {
                rcx rcxVar = this.t0;
                bwt0.H((rcxVar != null ? rcxVar : null).getView());
                return;
            }
            rcx rcxVar2 = this.t0;
            View view = (rcxVar2 != null ? rcxVar2 : null).getView();
            qcy<Object>[] qcyVarArr = bwt0.a;
            if (view.getSystemUiVisibility() != 1796) {
                view.setSystemUiVisibility(1796);
                return;
            }
            return;
        }
        if (dVar.equals(rcx.d.C3605d.a) || !(dVar instanceof rcx.d.b)) {
            return;
        }
        rcx rcxVar3 = this.t0;
        if (rcxVar3 == null) {
            rcxVar3 = null;
        }
        rcxVar3.a(new acx.g(false, true, false));
        maz e2 = ((qdz) this.o0.getValue()).e();
        rcx rcxVar4 = this.t0;
        maz.c(e2, (rcxVar4 != null ? rcxVar4 : null).getView().getContext(), ((rcx.d.b) dVar).a, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, LaunchContext.ActivityNextState.ALIVE, null, null, null, null, false, true, null, null, null, 62849023), null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        ww50 v;
        xy80 xy80Var = this.y0;
        if (xy80Var != null) {
            xy80Var.i();
        }
        FragmentActivity kn = kn();
        xy80 xy80Var2 = this.y0;
        kn.setRequestedOrientation(xy80Var2 != null ? xy80Var2.e : -1);
        this.G0 = true;
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.s2();
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.u0;
        ViewTreeObserver viewTreeObserver = (fitSystemWindowsFrameLayout != null ? fitSystemWindowsFrameLayout : null).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener((d) this.O0.getValue());
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.c0(this.P0);
        }
        if (this.D0) {
            finish();
        } else {
            super.b(z);
        }
    }

    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        if (dbs0Var.equals(d8s0.a)) {
            b(false);
            return;
        }
        if (dbs0Var.equals(w0t0.a)) {
            ikv0.a aVar = new ikv0.a(kn());
            aVar.u = new ikv0.d(new ikv0.d.c(requireContext().getString(R.string.interactive_video_pip_info_message)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            float f2 = 28;
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_28, Integer.valueOf(R.attr.vk_ui_icon_accent), new Size(iah0.a(f2), iah0.a(f2)), 8);
            aVar.e = 3000L;
            aVar.n();
            b(false);
            return;
        }
        if (dbs0Var.equals(yct0.a)) {
            acx.g gVar = new acx.g(true, true, true);
            rcx rcxVar = this.t0;
            (rcxVar != null ? rcxVar : null).a(gVar);
            return;
        }
        if (!dbs0Var.equals(sms0.a)) {
            exr0 exr0Var = this.N0;
            if (exr0Var != null) {
                exr0Var.b(dbs0Var);
                return;
            }
            return;
        }
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        boolean uo = uo(mo2getContext.getResources().getConfiguration());
        rcx rcxVar2 = this.t0;
        (rcxVar2 != null ? rcxVar2 : null).P(uo, false);
        xy80 xy80Var = this.y0;
        if (xy80Var != null) {
            if (xy80Var.c()) {
                xy80Var.i();
                xy80Var.b(uo(requireContext().getResources().getConfiguration()) ? 1 : 0);
            } else if (uo) {
                xy80Var.f();
            } else {
                xy80Var.e();
            }
        }
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final List<View> ho() {
        return e43.m(this.x0);
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final View io() {
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        return rcxVar.getView();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final tn10 jo() {
        return null;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int ko() {
        return R.layout.interactive_player_layout;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    @ozl
    public final tn10 lo() {
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        return rcxVar.q3();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int mo() {
        return R.style.VideoFullScreenDialog;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void no(Rect rect) {
        ViewGroup viewGroup = this.v0;
        if (viewGroup != null) {
            viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        ViewGroup viewGroup2 = this.w0;
        if (viewGroup2 != null) {
            int i = rect.top;
            int i2 = rect.left;
            float f2 = 12;
            int a2 = iah0.a(f2);
            if (i2 < a2) {
                i2 = a2;
            }
            int i3 = rect.right;
            int a3 = iah0.a(f2);
            if (i3 < a3) {
                i3 = a3;
            }
            viewGroup2.setPadding(i2, i, i3, rect.bottom);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        ww50 v;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null || (v = s200.v(activity)) == null) {
            return;
        }
        v.j(this.P0);
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vo(uo(configuration));
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.dialogs.BaseAnimationDialog, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment;
        ww50 v;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        rcx a2 = ((ecx) this.i0.getValue()).a(requireContext(), new tcx.a(true, true, true));
        this.t0 = a2;
        a2.L1(this);
        ?? r15 = this.B0;
        VideoFile videoFile = (VideoFile) r15.getValue();
        if (videoFile != null) {
            kz20 kz20Var = new kz20(videoFile, this, this);
            kz20Var.h = videoFile.r();
            this.L0 = kz20Var;
            yks0 yks0Var = new yks0(videoFile, this.C0, "");
            this.M0 = yks0Var;
            yks0Var.b(new mqs0(this));
            this.N0 = new exr0(new c());
            videoInteractiveFullscreenFragment = this;
            a2.y0(new InteractiveData(videoFile, this.C0, videoFile.r(), InteractiveData.From.FULLSCREEN, (SearchStatsLoggingInfo) null, (ebs0) videoInteractiveFullscreenFragment, false, false, Tensorflow.FRAME_WIDTH));
        } else {
            videoInteractiveFullscreenFragment = this;
        }
        a2.j2(false, false);
        videoInteractiveFullscreenFragment.t0 = a2;
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = (FitSystemWindowsFrameLayout) onCreateView;
        videoInteractiveFullscreenFragment.u0 = fitSystemWindowsFrameLayout;
        if (fitSystemWindowsFrameLayout == null) {
            fitSystemWindowsFrameLayout = null;
        }
        fitSystemWindowsFrameLayout.getViewTreeObserver().addOnWindowFocusChangeListener((d) videoInteractiveFullscreenFragment.O0.getValue());
        com.vk.libvideo.design.view.swipe.layout.a aVar = videoInteractiveFullscreenFragment.O;
        if (aVar == null) {
            aVar = null;
        }
        aVar.setBackgroundColor(-16777216);
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout2 = videoInteractiveFullscreenFragment.u0;
        if (fitSystemWindowsFrameLayout2 == null) {
            fitSystemWindowsFrameLayout2 = null;
        }
        SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) fitSystemWindowsFrameLayout2.findViewById(R.id.drag_view);
        rcx rcxVar = videoInteractiveFullscreenFragment.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        videoInteractiveFullscreenFragment.v0 = (ViewGroup) rcxVar.getView().findViewById(R.id.adjustable_controls);
        rcx rcxVar2 = videoInteractiveFullscreenFragment.t0;
        if (rcxVar2 == null) {
            rcxVar2 = null;
        }
        rcx rcxVar3 = videoInteractiveFullscreenFragment.t0;
        if (rcxVar3 == null) {
            rcxVar3 = null;
        }
        videoInteractiveFullscreenFragment.w0 = (ViewGroup) rcxVar3.getView().findViewById(R.id.tooltip_overlay);
        rcx rcxVar4 = videoInteractiveFullscreenFragment.t0;
        if (rcxVar4 == null) {
            rcxVar4 = null;
        }
        rcx rcxVar5 = videoInteractiveFullscreenFragment.t0;
        if (rcxVar5 == null) {
            rcxVar5 = null;
        }
        videoInteractiveFullscreenFragment.x0 = (ViewGroup) rcxVar5.getView().findViewById(R.id.interactive_state_container);
        rcx rcxVar6 = videoInteractiveFullscreenFragment.t0;
        if (rcxVar6 == null) {
            rcxVar6 = null;
        }
        swipeFrameLayout.addView(rcxVar6.getView(), new FrameLayout.LayoutParams(-1, -1));
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout3 = videoInteractiveFullscreenFragment.u0;
        if (fitSystemWindowsFrameLayout3 == null) {
            fitSystemWindowsFrameLayout3 = null;
        }
        ((SwipeLayout) fitSystemWindowsFrameLayout3.findViewById(R.id.swipe_layout)).setNavigationCallback(new b());
        if (videoInteractiveFullscreenFragment.y0 == null) {
            videoInteractiveFullscreenFragment.y0 = new xy80(getActivity());
        }
        xy80 xy80Var = videoInteractiveFullscreenFragment.y0;
        if (xy80Var != null) {
            xy80Var.enable();
        }
        xy80 xy80Var2 = videoInteractiveFullscreenFragment.y0;
        if (xy80Var2 != null) {
            xy80Var2.a(videoInteractiveFullscreenFragment.z0);
        }
        if (videoInteractiveFullscreenFragment.F0) {
            xy80 xy80Var3 = videoInteractiveFullscreenFragment.y0;
            if (xy80Var3 != null) {
                xy80Var3.i();
            }
            rcx rcxVar7 = videoInteractiveFullscreenFragment.t0;
            (rcxVar7 != null ? rcxVar7 : null).P(uo(requireContext().getResources().getConfiguration()), false);
        } else {
            VideoFile videoFile2 = (VideoFile) r15.getValue();
            if (videoFile2 != null && videoFile2.isHorizontal() && to()) {
                xy80 xy80Var4 = videoInteractiveFullscreenFragment.y0;
                if (xy80Var4 != null) {
                    xy80Var4.e();
                }
                videoInteractiveFullscreenFragment.N = false;
            } else {
                xy80 xy80Var5 = videoInteractiveFullscreenFragment.y0;
                if (xy80Var5 != null) {
                    xy80Var5.i();
                }
                FragmentActivity kn = kn();
                xy80 xy80Var6 = videoInteractiveFullscreenFragment.y0;
                kn.setRequestedOrientation(xy80Var6 != null ? xy80Var6.e : -1);
            }
            i0q0.d(300L, new q86(this, 12));
        }
        int statusBarColor = kn().getWindow().getStatusBarColor();
        if (videoInteractiveFullscreenFragment.V == null) {
            videoInteractiveFullscreenFragment.V = Integer.valueOf(statusBarColor);
        }
        ((com.vk.movika.api.a) videoInteractiveFullscreenFragment.K0.getValue()).enable();
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.S(this);
        }
        return onCreateView;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ww50 v;
        super.onDestroyView();
        oo();
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.u0;
        if (fitSystemWindowsFrameLayout == null) {
            fitSystemWindowsFrameLayout = null;
        }
        fitSystemWindowsFrameLayout.getViewTreeObserver().removeOnWindowFocusChangeListener((d) this.O0.getValue());
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.setVideoFocused(false);
        if (this.D0 || this.E0) {
            lyd.g().P();
            xy80 xy80Var = this.y0;
            if (xy80Var != null) {
                xy80Var.b(-1);
            }
            xy80 xy80Var2 = this.y0;
            if (xy80Var2 != null) {
                xy80Var2.disable();
            }
        }
        rcx rcxVar2 = this.t0;
        if (rcxVar2 == null) {
            rcxVar2 = null;
        }
        rcxVar2.r2(this);
        this.y0 = null;
        ((com.vk.movika.api.a) this.K0.getValue()).disable();
        rcx rcxVar3 = this.t0;
        (rcxVar3 != null ? rcxVar3 : null).destroy();
        FragmentActivity activity = getActivity();
        if (activity == null || (v = s200.v(activity)) == null) {
            return;
        }
        v.H(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        ww50 v;
        super.onDetach();
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.c0(this.P0);
        }
        xy80 xy80Var = this.y0;
        if (xy80Var != null) {
            xy80Var.b.remove(this.z0);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.H0) {
            wo();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.H0) {
            xo();
        }
        rcx rcxVar = this.t0;
        rcx rcxVar2 = rcxVar == null ? null : rcxVar;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar2.a(new acx.o(rcxVar.getView().getContext()));
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ro();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.C0 = arguments.getString("referrer", this.C0);
            this.E0 = arguments.getBoolean("stop_on_close", this.E0);
            this.D0 = arguments.getBoolean("over_activity", this.D0);
        } else {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"arguments is null!"});
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow();
        }
        f fVar = new f(1, this, VideoInteractiveFullscreenFragment.class, "onApplyCutoutInsets", "onApplyCutoutInsets(Landroid/graphics/Rect;)V", 0);
        pgl pglVar = this.h0;
        pglVar.getClass();
        ogl oglVar = new ogl(pglVar, fVar);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, oglVar);
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
    }

    public final void vo(boolean z) {
        xy80 xy80Var;
        kz20 kz20Var;
        kz20 kz20Var2 = this.L0;
        if ((kz20Var2 == null || !kz20Var2.b()) && this.H0) {
            i0q0.d(300L, new q86(this, 12));
            boolean z2 = !z;
            this.N = z2;
            if (!to() || (xy80Var = this.y0) == null || !xy80Var.k || (kz20Var = this.L0) == null || kz20Var.b()) {
                xy80 xy80Var2 = this.y0;
                if (xy80Var2 != null) {
                    xy80Var2.b(z2 ? 1 : 0);
                }
            } else if (!z) {
                xy80 xy80Var3 = this.y0;
                if (xy80Var3 != null) {
                    xy80Var3.f();
                }
                b(false);
            }
            rcx rcxVar = this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.s2();
        }
    }

    public final void wo() {
        xy80 xy80Var;
        this.I0 = false;
        lyd.g().P();
        if (!this.G0) {
            rcx rcxVar = this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.setVideoFocused(false);
        }
        if (to() || (xy80Var = this.y0) == null) {
            return;
        }
        xy80Var.disable();
    }

    public final void xo() {
        this.I0 = true;
        lyd.g().B();
        xy80 xy80Var = this.y0;
        if (xy80Var != null) {
            xy80Var.enable();
        }
        yo();
        rcx rcxVar = this.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.setVideoFocused(true);
    }

    public final void yo() {
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            View requireView = requireView();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.getWindow();
            }
            g gVar = new g(1, this, VideoInteractiveFullscreenFragment.class, "onApplyCutoutInsets", "onApplyCutoutInsets(Landroid/graphics/Rect;)V", 0);
            pgl pglVar = this.h0;
            pglVar.getClass();
            ogl oglVar = new ogl(pglVar, gVar);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(requireView, oglVar);
            rcx rcxVar = this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.P(uo(mo2getContext.getResources().getConfiguration()), false);
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public final class b implements a.e {
        public b() {
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final void Lg() {
            VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = VideoInteractiveFullscreenFragment.this;
            rcx rcxVar = videoInteractiveFullscreenFragment.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.s2();
            rcx rcxVar2 = videoInteractiveFullscreenFragment.t0;
            (rcxVar2 != null ? rcxVar2 : null).j2(false, true);
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final boolean Sj() {
            return true;
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final void W6() {
            VideoInteractiveFullscreenFragment.this.b(false);
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final boolean Wh() {
            return true;
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final void Yb() {
            VideoInteractiveFullscreenFragment.this.b(false);
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final float getVolume() {
            rcx rcxVar = VideoInteractiveFullscreenFragment.this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            return rcxVar.getState().b;
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final boolean h6() {
            return false;
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final void setVolume(float f) {
            rcx rcxVar = VideoInteractiveFullscreenFragment.this.t0;
            if (rcxVar == null) {
                rcxVar = null;
            }
            rcxVar.a(new acx.n(f));
        }

        @Override // com.vk.libvideo.design.view.swipe.layout.a.e
        public final void fm() {
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public final class c implements exr0.a {
        public final b a;
        public final a b;

        /* compiled from: VideoInteractiveFullscreenFragment.kt */
        public static final class b implements ows0 {
            public final /* synthetic */ VideoInteractiveFullscreenFragment b;

            public b(VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment) {
                this.b = videoInteractiveFullscreenFragment;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.ows0
            public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
                return (io.reactivex.rxjava3.subjects.d) this.b.r0.getValue();
            }
        }

        public c() {
            this.a = new b(VideoInteractiveFullscreenFragment.this);
            this.b = new a(VideoInteractiveFullscreenFragment.this, this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final u9t0 L() {
            return (u9t0) VideoInteractiveFullscreenFragment.this.n0.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.b S() {
            return ((VideoShareComponent) VideoInteractiveFullscreenFragment.this.p0.getValue()).S();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final NotificationsPermission V() {
            return (NotificationsPermission) VideoInteractiveFullscreenFragment.this.j0.getValue();
        }

        @Override // xsna.exr0.a
        public final yks0 W() {
            yks0 yks0Var = VideoInteractiveFullscreenFragment.this.M0;
            if (yks0Var != null) {
                return yks0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // xsna.exr0.a
        public final SearchStatsLoggingInfo a() {
            return null;
        }

        @Override // xsna.exr0.a
        public final ows0 b() {
            return this.a;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> d() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> e() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<VideoAlbum> f() {
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final ljt0 g() {
            return (ljt0) VideoInteractiveFullscreenFragment.this.q0.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final vit0 g0() {
            return (vit0) VideoInteractiveFullscreenFragment.this.k0.getValue();
        }

        @Override // xsna.exr0.a
        public final FragmentActivity getActivity() {
            return VideoInteractiveFullscreenFragment.this.kn();
        }

        @Override // xsna.exr0.a
        public final View getView() {
            return VideoInteractiveFullscreenFragment.this.requireView();
        }

        @Override // xsna.exr0.a
        public final zet0 h() {
            return null;
        }

        @Override // xsna.exr0.a
        public final y6s0 i() {
            return this.b;
        }

        @Override // xsna.exr0.a
        public final kz20 j() {
            kz20 kz20Var = VideoInteractiveFullscreenFragment.this.L0;
            if (kz20Var != null) {
                return kz20Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> k() {
            return null;
        }

        @Override // xsna.exr0.a
        public final MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final com.vk.video.kidsprofile.restricteduseractions.a m() {
            return (com.vk.video.kidsprofile.restricteduseractions.a) VideoInteractiveFullscreenFragment.this.m0.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final v3t0 m0() {
            return (v3t0) VideoInteractiveFullscreenFragment.this.l0.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final hfs0 n() {
            return (hfs0) VideoInteractiveFullscreenFragment.this.s0.getValue();
        }

        @Override // xsna.exr0.a
        public final AdsDataProvider o() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> p() {
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.a p0() {
            return ((VideoShareComponent) VideoInteractiveFullscreenFragment.this.p0.getValue()).p0();
        }

        @Override // xsna.exr0.a
        public final void c() {
        }

        /* compiled from: VideoInteractiveFullscreenFragment.kt */
        public static final class a implements y6s0 {
            public final /* synthetic */ VideoInteractiveFullscreenFragment a;
            public final /* synthetic */ c b;

            /* compiled from: VideoInteractiveFullscreenFragment.kt */
            /* renamed from: com.vk.movika.impl.VideoInteractiveFullscreenFragment$c$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1286a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SHARE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public a(VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment, c cVar) {
                this.a = videoInteractiveFullscreenFragment;
                this.b = cVar;
            }

            @Override // xsna.y6s0
            public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                int i = C1286a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
                if (i == 1) {
                    this.a.b(false);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.b.getClass();
                }
            }

            @Override // xsna.y6s0
            public final int c2() {
                return -1;
            }

            @Override // xsna.y6s0
            public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            }
        }
    }

    /* compiled from: VideoInteractiveFullscreenFragment.kt */
    public static final class h extends xnt0.a {
        public qcx a;

        public h() {
        }

        @Override // xsna.xnt0.a
        public final void d(View view, float f) {
            if (this.a == null) {
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = VideoInteractiveFullscreenFragment.this;
                rcx rcxVar = videoInteractiveFullscreenFragment.t0;
                if (rcxVar == null) {
                    rcxVar = null;
                }
                ViewGroup viewGroup = (ViewGroup) rcxVar.getView();
                rcx rcxVar2 = videoInteractiveFullscreenFragment.t0;
                if (rcxVar2 == null) {
                    rcxVar2 = null;
                }
                tn10 q3 = rcxVar2.q3();
                this.a = new qcx(viewGroup, view, e43.m(q3 != null ? q3.b() : null));
            }
            qcx qcxVar = this.a;
            if (qcxVar != null) {
                qcxVar.d(view, f);
            }
        }

        @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
        }
    }
}
