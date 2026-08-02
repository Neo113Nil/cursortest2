package com.vk.libvideo.design.view.live;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.libvideo.live.impl.views.addbutton.AddImgButtonView;
import com.vk.libvideo.live.impl.views.chat.LiveRecycleView;
import com.vk.libvideo.live.impl.views.error.ErrorView;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.transform.TransformController;
import xsna.a390;
import xsna.a7q0;
import xsna.akk0;
import xsna.anj;
import xsna.asu0;
import xsna.awt0;
import xsna.bkk0;
import xsna.blz;
import xsna.bo;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bzj;
import xsna.c5m;
import xsna.ci0;
import xsna.d3m;
import xsna.dhr0;
import xsna.dvp;
import xsna.dw20;
import xsna.e3m;
import xsna.elz;
import xsna.enj;
import xsna.f2y0;
import xsna.f3y0;
import xsna.f4m;
import xsna.fgh;
import xsna.flz;
import xsna.fn4;
import xsna.fot;
import xsna.fpf0;
import xsna.g08;
import xsna.g620;
import xsna.glp;
import xsna.gv5;
import xsna.h12;
import xsna.h520;
import xsna.h8;
import xsna.hqa0;
import xsna.i1t0;
import xsna.i560;
import xsna.iah0;
import xsna.ify;
import xsna.j0;
import xsna.j7q0;
import xsna.jb;
import xsna.je0;
import xsna.k4m;
import xsna.k7m;
import xsna.k7q0;
import xsna.kkp;
import xsna.klz;
import xsna.kzr0;
import xsna.l2i;
import xsna.l31;
import xsna.l7s;
import xsna.lnz;
import xsna.lpj;
import xsna.lzr0;
import xsna.m0q0;
import xsna.m33;
import xsna.m7m;
import xsna.maz;
import xsna.mcr0;
import xsna.md0;
import xsna.mg0;
import xsna.mk0;
import xsna.msy;
import xsna.nd1;
import xsna.nh;
import xsna.nzb;
import xsna.o31;
import xsna.oiz;
import xsna.ojf0;
import xsna.ozr0;
import xsna.piz;
import xsna.por0;
import xsna.qyk0;
import xsna.ror0;
import xsna.rpb;
import xsna.rr6;
import xsna.s290;
import xsna.sv0;
import xsna.szr0;
import xsna.thu0;
import xsna.tju;
import xsna.ucp;
import xsna.uhu0;
import xsna.unz;
import xsna.uoc;
import xsna.uur;
import xsna.vcd;
import xsna.vnz;
import xsna.wc0;
import xsna.wjk0;
import xsna.xnz;
import xsna.xqm0;
import xsna.ye0;
import xsna.ykp;
import xsna.yks0;
import xsna.ynz;
import xsna.zhr0;
import xsna.zzf;

/* loaded from: classes2.dex */
public class LiveView extends FrameLayout implements piz, gv5, m0q0, UiTracking$TrackableView, yks0.a {
    public static final int q0;
    public static final int u0;
    public static final int v0;
    public ror0 A;
    public AddImgButtonView B;
    public final VideoTextureView C;
    public final FrameLayout D;

    @Nullable
    public flz E;

    @Nullable
    public thu0 F;

    @Nullable
    public uhu0 G;
    public c5m H;
    public uoc I;
    public vcd J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public boolean P;
    public oiz Q;
    public boolean R;
    public io.reactivex.rxjava3.disposables.c S;
    public io.reactivex.rxjava3.disposables.c T;
    public boolean U;
    public final HashSet V;
    public final VideoAdLayout W;
    public boolean a0;
    public final ErrorView b;

    @Nullable
    public l31 b0;
    public final VkImageSimple c;

    @Nullable
    public mg0 c0;
    public final LinearLayout d;
    public boolean d0;
    public final FrameLayout e;

    @Nullable
    public Window e0;
    public final FrameLayout f;
    public boolean f0;
    public final View g;
    public boolean g0;
    public LinearLayout h;
    public fot h0;
    public final VkSpinner i;
    public int i0;
    public final PreviewImageView j;
    public int j0;
    public final FrameLayout k;
    public boolean k0;
    public final VideoOverlayView l;
    public final maz l0;
    public final View m;
    public final hqa0 m0;
    public final View n;
    public final md0 n0;
    public ConstraintLayout o;
    public final wc0 o0;

    @Nullable
    public f3y0 p;
    public lnz q;
    public nzb r;

    @Nullable
    public akk0 s;
    public final VkText t;
    public final View u;
    public final AdvertBannerView v;

    @Nullable
    public bkk0 w;
    public MenuButtonNewView x;
    public ykp y;
    public glp z;
    public static final int p0 = iah0.a(64);
    public static final int r0 = iah0.a(98);
    public static final int s0 = iah0.a(64.0f);
    public static final int t0 = iah0.a(200);
    public static final int w0 = iah0.a(4);

    public class a implements io.reactivex.rxjava3.functions.f<Bitmap> {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public a(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Bitmap bitmap) throws Throwable {
            Bitmap bitmap2 = bitmap;
            boolean z = this.b;
            LiveView liveView = LiveView.this;
            if (!z || this.c) {
                liveView.j.clearColorFilter();
            } else {
                liveView.j.setColorFilter(liveView.getContext().getColor(R.color.vk_black_alpha60));
            }
            liveView.j.setImageBitmap(bitmap2);
            View view = liveView.u;
            boolean z2 = this.d;
            awt0.u(view, z2 && z2);
        }
    }

    public class b implements io.reactivex.rxjava3.functions.f<Throwable> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            Throwable th2 = th;
            if (th2 instanceof e) {
                com.vk.metrics.eventtracking.b.a.a(th2);
            }
            L.i(th2);
        }
    }

    public class c implements io.reactivex.rxjava3.functions.a {
        public c() {
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() throws Exception {
            LiveView.this.T = null;
        }
    }

    public class d implements l<Bitmap, Bitmap> {
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public d(String str, boolean z, boolean z2, boolean z3) {
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final Bitmap apply(Bitmap bitmap) throws Throwable {
            Bitmap bitmap2 = bitmap;
            int i = LiveView.p0;
            if (bitmap2.getByteCount() < 83886080) {
                f fVar = new f();
                if (bitmap2.getWidth() < fVar.getMaximumBitmapWidth() && bitmap2.getHeight() < fVar.getMaximumBitmapHeight()) {
                    if ((this.c && this.d) || (this.e && LiveView.this.Q.R0())) {
                        bpn0 bpn0Var = VideoOverlayView.I;
                        VideoOverlayView.b.c().d(bitmap2);
                    }
                    return bitmap2;
                }
            }
            throw new e(bitmap2.getWidth() + "x" + bitmap2.getHeight() + " | " + this.b);
        }
    }

    public static class e extends RuntimeException {
    }

    public static class f extends Canvas {
    }

    static {
        float f2 = 8;
        q0 = iah0.a(f2);
        u0 = iah0.a(f2);
        v0 = iah0.a(f2);
    }

    public LiveView(@NonNull Context context) {
        super(context, null, 0);
        jb jbVar = new jb(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = msy.a(lazyThreadSafetyMode, jbVar);
        this.L = msy.a(lazyThreadSafetyMode, new nd1(20));
        this.M = msy.a(lazyThreadSafetyMode, new fn4(21));
        this.N = msy.a(lazyThreadSafetyMode, new nh(17));
        this.O = msy.a(lazyThreadSafetyMode, new sv0(23));
        this.P = false;
        this.R = true;
        this.U = false;
        this.V = new HashSet();
        this.a0 = false;
        this.b0 = null;
        this.c0 = null;
        this.d0 = true;
        this.f0 = true;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = true;
        this.l0 = ((LinksBridgeComponent) ((k7m) m7m.c(this)).a(fpf0.a(LinksBridgeComponent.class))).p().e();
        this.m0 = ((AdPixelStatsComponent) ((k7m) m7m.c(this)).a(fpf0.a(AdPixelStatsComponent.class))).Ed();
        this.n0 = ((VideoAdvertisementsComponent) ((k7m) m7m.c(this)).mo408a(fpf0.a(VideoAdvertisementsComponent.class))).a8();
        this.o0 = ((VideoAdvertisementsComponent) ((k7m) m7m.c(this)).mo408a(fpf0.a(VideoAdvertisementsComponent.class))).Z3(VideoAdvertisementsComponent.AdType.LIVE);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_view, (ViewGroup) this, true);
        PreviewImageView previewImageView = (PreviewImageView) inflate.findViewById(R.id.liveViewBack);
        this.j = previewImageView;
        this.k = (FrameLayout) inflate.findViewById(R.id.liveViewBackContainer);
        this.W = (VideoAdLayout) inflate.findViewById(R.id.videoAdBottomPanelView);
        this.e = (FrameLayout) inflate.findViewById(R.id.liveViewMainHolder);
        this.f = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_container);
        this.g = inflate.findViewById(R.id.bottom_sheet_gradient_view);
        VkImageSimple vkImageSimple = (VkImageSimple) inflate.findViewById(R.id.liveViewClose);
        this.c = vkImageSimple;
        this.d = (LinearLayout) inflate.findViewById(R.id.liveViewTopHolder);
        this.i = (VkSpinner) inflate.findViewById(R.id.liveViewProgress);
        this.b = (ErrorView) inflate.findViewById(R.id.liveViewError);
        this.m = inflate.findViewById(R.id.liveViewFadeUp);
        this.n = inflate.findViewById(R.id.liveViewFadeBottom);
        VideoTextureView videoTextureView = (VideoTextureView) inflate.findViewById(R.id.liveTexture);
        this.C = videoTextureView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.liveTextureHolder);
        this.D = frameLayout;
        this.l = (VideoOverlayView) inflate.findViewById(R.id.liveOverlay);
        this.t = (VkText) inflate.findViewById(R.id.liveSubtitleName);
        this.u = inflate.findViewById(R.id.previewOverlay);
        AdvertBannerView.c cVar = AdvertBannerView.f;
        Context context2 = frameLayout.getContext();
        vnz vnzVar = new vnz(this);
        cVar.getClass();
        AdvertBannerView b2 = AdvertBannerView.c.b(context2, vnzVar);
        if (b2 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(b2, layoutParams);
            float f2 = 12;
            f4m.s(iah0.a(f2), b2);
            f4m.r(iah0.a(f2), b2);
            f4m.q(iah0.a(27), b2);
        }
        this.v = b2;
        videoTextureView.i(TransformController.ScaleType.FIT, false);
        previewImageView.setContentScaleType(VideoResizer.VideoFitType.FIT);
        vkImageSimple.setOnClickListener(new unz(this));
        this.j0 = iah0.j(context).y;
    }

    public static void a(LiveView liveView) {
        wc0 wc0Var = liveView.o0;
        if (liveView.b0 != null) {
            wc0Var.e();
            wc0Var.d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource.USER, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason.CLICKED);
            liveView.l0.l(liveView.getContext(), liveView.b0.b.a.b, LaunchContext.A, null, null);
            liveView.Q.B1();
            AdvertBannerView advertBannerView = liveView.v;
            if (advertBannerView != null) {
                advertBannerView.a();
            }
            mg0 mg0Var = liveView.c0;
            if (mg0Var != null) {
                dw20 dw20Var = mg0Var.e;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                mg0Var.e = null;
                liveView.c0 = null;
            }
        }
    }

    private fot getGestureDetectorInstance() {
        fot fotVar = this.h0;
        if (fotVar != null) {
            return fotVar;
        }
        fot fotVar2 = new fot(getContext(), new ynz(this), null);
        this.h0 = fotVar2;
        return fotVar2;
    }

    private int getViewsAboveSeekBottomMargin() {
        flz flzVar = this.E;
        View actualView = flzVar == null ? null : flzVar.getActualView();
        return this.Q.w() ? q0 : (actualView == null || actualView.getVisibility() == 8) ? p0 : r0;
    }

    @Override // xsna.piz
    public final VideoTextureView A3() {
        return this.C;
    }

    @Override // xsna.piz
    public final void A4() {
        boolean z = this.P;
        FrameLayout frameLayout = this.k;
        if (!z && !this.U) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            frameLayout.animate().cancel();
            if (frameLayout.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                frameLayout.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
            }
        }
    }

    @Override // xsna.piz
    public final void B0(long j) {
        flz flzVar = this.E;
        if (flzVar == null || flzVar.getActualView() == null || j <= 0) {
            return;
        }
        flz flzVar2 = this.E;
        oiz oizVar = this.Q;
        flzVar2.G0(j, oizVar != null && oizVar.i());
    }

    @Override // xsna.piz
    public final f2y0 C(boolean z) {
        if (this.p == null) {
            this.p = new f3y0(getContext());
        }
        this.p.setBottomSheetParams(new ojf0(iah0.a(64), false, 2.4f, true, true, true));
        f3y0 f3y0Var = this.p;
        View view = this.g;
        f3y0Var.setBottomSheetGradientView(view);
        this.p.setBottomSheet(this.f);
        this.p.setWindow(this.e0);
        this.p.o0(this, !this.Q.w());
        f3y0 f3y0Var2 = this.p;
        f3y0Var2.x = new fgh(this, 25);
        f3y0Var2.y = new l2i(this, 24);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, s0);
        layoutParams.gravity = 80;
        if (this.Q.w()) {
            layoutParams.bottomMargin = iah0.a(144);
        }
        this.p.setLayoutParams(layoutParams);
        this.e.addView(this.p, ((ViewGroup) view.getParent()).indexOfChild(view) + 1);
        if (z) {
            this.p.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.p.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.V.add(this.p);
        return this.p;
    }

    @Override // xsna.piz
    public final void D1(@Nullable Image image, boolean z, boolean z2) {
        if (image != null) {
            VideoFile videoFile = getPresenter().getModel().f;
            boolean z0 = videoFile != null ? videoFile.z0() : false;
            ImageSize Cb = image.Cb(z ? ImageScreenSize.MID.h() : ImageScreenSize.BIG.h(), true, true);
            String str = Cb == null ? null : Cb.d.d;
            if (str != null) {
                Bitmap k = mcr0.k(str);
                this.T = new a0((k != null ? q.T(k) : mcr0.h(Uri.parse(str))).r0(asu0.a.c()).U(new d(str, z, z2, z0)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new c()).subscribe(new a(z, z2, z0), new b());
            }
        }
    }

    @Override // xsna.piz
    public final a7q0 H1(boolean z, boolean z2) {
        if (this.o == null) {
            this.o = this.Q.R0() ? new j7q0(getContext()) : new k7q0(getContext());
        }
        this.o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e.addView(this.o, 0);
        if (this.Q.w()) {
            ((a7q0) this.o).setTopBlockTopMargin(iah0.a(200));
        }
        if (!this.Q.w() || z2) {
            this.o.setVisibility(0);
        } else {
            this.o.setVisibility(8);
        }
        if (z) {
            this.o.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.o.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.V.add((rr6) this.o);
        return (a7q0) this.o;
    }

    @Override // xsna.yks0.a
    public final void He(@NonNull List list, @NonNull VideoFile videoFile) {
        uoc uocVar = this.I;
        if (uocVar != null) {
            uocVar.k1(videoFile);
        }
    }

    @Override // xsna.piz
    public final void I() {
        if (this.k0) {
            io.reactivex.rxjava3.disposables.c cVar = this.S;
            if (cVar != null) {
                cVar.dispose();
                this.S = null;
            }
            if (this.Q.p2()) {
                this.S = q.B0(300L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xnz(this, 0));
            } else {
                this.i.setVisibility(0);
            }
        }
    }

    @Override // xsna.piz
    public final void I3(VideoRestriction videoRestriction) {
        VideoOverlayView videoOverlayView = this.l;
        videoOverlayView.setVisibility(0);
        videoOverlayView.Z4(new i1t0(true, bo.h()), new VideoOverlayView.c.i(new a390().a(videoRestriction), new s290().a(null), false, new bzj(this, 23)));
    }

    @Override // xsna.piz
    public final uur J() {
        if (this.q == null) {
            this.q = new lnz(getContext());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(150.0f), iah0.a(400.0f));
        if (this.Q.w()) {
            layoutParams.gravity = 53;
            layoutParams.topMargin = iah0.a(48);
        } else {
            layoutParams.gravity = 85;
        }
        layoutParams.bottomMargin = getViewsAboveSeekBottomMargin();
        layoutParams.rightMargin = iah0.a(-48.0f);
        this.q.setLayoutParams(layoutParams);
        this.e.addView(this.q, 0);
        this.V.add(this.q);
        return this.q;
    }

    @Override // xsna.piz
    public final rpb K() {
        Context context;
        if (this.r == null) {
            if (this.Q.w()) {
                context = getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i) {
                    context = new l7s(context, dhr0.u().c);
                }
            } else {
                context = getContext();
            }
            this.r = new nzb(context, this.Q.w());
        }
        boolean w = this.Q.w();
        FrameLayout frameLayout = this.e;
        if (w) {
            b();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMarginStart(w0);
            this.r.setLayoutParams(layoutParams);
            this.h.addView(this.r, 0);
            frameLayout.removeView(this.h);
            frameLayout.addView(this.h, 0);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 80;
            layoutParams2.bottomMargin = getViewsAboveSeekBottomMargin();
            this.r.setLayoutParams(layoutParams2);
            frameLayout.addView(this.r, 0);
        }
        if (this.Q.w()) {
            LiveRecycleView liveRecycleView = this.r.b;
            liveRecycleView.setOverScrollMode(0);
            liveRecycleView.addOnItemTouchListener(new blz(liveRecycleView));
        }
        this.V.add(this.r);
        return this.r;
    }

    @Override // xsna.piz
    public final uoc M1() {
        if (this.I == null) {
            this.I = g620.f().Z().b(getContext());
        }
        Object obj = this.I;
        if (obj instanceof View) {
            View view = (View) obj;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = u0;
            layoutParams.setMarginEnd(v0);
            view.setLayoutParams(layoutParams);
            this.e.addView(view);
        }
        this.V.add(this.I);
        return this.I;
    }

    @Override // xsna.piz
    public final void M2(long j, long j2, boolean z) {
        flz flzVar = this.E;
        if (flzVar != null) {
            flzVar.m3(j, j2, z);
        }
    }

    @Override // xsna.piz
    public final flz P3() {
        flz flzVar = this.E;
        FrameLayout frameLayout = this.e;
        if (flzVar != null) {
            flzVar.release();
            View actualView = this.E.getActualView();
            if (actualView != null) {
                frameLayout.removeView(actualView);
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(48), 80);
        layoutParams.bottomMargin = this.Q.w() ? iah0.a(8) : iah0.a(52.0f);
        klz klzVar = new klz(getContext());
        this.E = klzVar;
        View actualView2 = klzVar.getActualView();
        if (actualView2 != null) {
            actualView2.setLayoutParams(layoutParams);
            frameLayout.addView(actualView2);
        }
        flz flzVar2 = this.E;
        if (flzVar2 instanceof klz) {
            ((klz) flzVar2).setShowChangeListener(new h8(this, 22));
        }
        this.V.add(this.E);
        if (this.Q.w()) {
            this.E.E0();
            if (actualView2 != null) {
                actualView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                actualView2.setTranslationY(t0);
            }
        }
        return this.E;
    }

    @Override // xsna.piz
    public final void Q1() {
        ErrorView errorView = this.b;
        errorView.e = null;
        errorView.setVisibility(8);
    }

    @Override // xsna.piz
    public final void Q2(boolean z) {
        FrameLayout frameLayout = this.k;
        frameLayout.animate().cancel();
        if (!z) {
            frameLayout.setAlpha(1.0f);
        } else if (frameLayout.getAlpha() != 1.0f) {
            frameLayout.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    @Override // xsna.piz
    public final mk0 R1(boolean z) {
        if (this.Q.w()) {
            return null;
        }
        AddImgButtonView addImgButtonView = new AddImgButtonView(getContext(), null);
        this.B = addImgButtonView;
        addImgButtonView.setId(R.id.live_view_add_button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f));
        layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.B.setLayoutParams(layoutParams);
        this.B.setContentDescription(getContext().getString(R.string.add));
        this.d.addView(this.B, 0);
        if (z) {
            this.B.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.B.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.V.add(this.B);
        return this.B;
    }

    @Override // xsna.piz
    public final void T(dvp dvpVar) {
        ErrorView errorView = this.b;
        errorView.setModel(dvpVar);
        errorView.setVisibility(0);
    }

    @Override // xsna.piz
    public final k4m T2(boolean z) {
        if (this.H == null) {
            c5m c5mVar = new c5m(getContext(), this.Q.w());
            this.H = c5mVar;
            c5mVar.setHighlightColor(0);
            this.H.setTextAppearance(getContext(), R.style.VkUiTypography_Subhead);
            this.H.setTextColor(-1);
            this.H.setMaxLines(2);
        }
        if (this.Q.w()) {
            return this.H;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = iah0.a(12.0f);
        layoutParams.rightMargin = iah0.a(48.0f) * 2;
        int a2 = iah0.a(54.0f);
        LinearLayout linearLayout = this.h;
        if (linearLayout != null && linearLayout.getWidth() > 0) {
            a2 = this.h.getWidth();
        }
        layoutParams.topMargin = a2;
        this.H.setLayoutParams(layoutParams);
        if (z) {
            this.H.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.H.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.V.add(this.H);
        if (this.H.getParent() == null) {
            addView(this.H);
        }
        return this.H;
    }

    @Override // xsna.gv5
    public final boolean a0() {
        f3y0 f3y0Var = this.p;
        if (f3y0Var != null) {
            return f3y0Var.a0();
        }
        return false;
    }

    public final void b() {
        if (this.h == null) {
            this.h = new LinearLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = getViewsAboveSeekBottomMargin();
            this.h.setLayoutParams(layoutParams);
            this.h.setOrientation(1);
            this.e.addView(this.h);
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        View actualView;
        flz flzVar = this.E;
        if (flzVar == null || (actualView = flzVar.getActualView()) == null) {
            return false;
        }
        Rect rect = new Rect();
        actualView.getHitRect(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void d(boolean z, boolean z2) {
        int d2;
        t(getContext().getResources().getConfiguration());
        if (!this.Q.w() || this.p == null) {
            return;
        }
        if (this.Q.c1()) {
            d2 = ify.d(3, null);
        } else {
            Activity h = e3m.h(getContext());
            if (h == null) {
                return;
            } else {
                d2 = ify.d(3, null) - ((iah0.j(getContext()).y - (iah0.h(h, true) + f4m.e(this).top)) - getHeight());
            }
        }
        int applyDimension = (int) (z2 ? TypedValue.applyDimension(1, 64, getContext().getResources().getDisplayMetrics()) : TypedValue.applyDimension(1, 10, getContext().getResources().getDisplayMetrics()));
        int i = z ? 64 : 0;
        if (z2 && z) {
            f4m.q(d2 - applyDimension, this.p);
        }
        int i2 = d2 - applyDimension;
        f4m.q(((int) TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics())) + i2, this.f);
        f4m.q(i2, this.g);
        if (!this.p.K || z2) {
            int i3 = ify.a;
            if ((ify.e(ify.c) || this.p.V) && z2) {
                return;
            }
            setWriteBarVisible(z);
            Object obj = this.I;
            if (obj != null && (obj instanceof View)) {
                awt0.v((View) obj, !z);
            }
            if (this.Q.isActive()) {
                this.p.F2();
            }
            f4m.q(d2, this.p);
            if (this.r != null) {
                int i4 = s0 + d2;
                bkk0 bkk0Var = this.w;
                int measuredHeight = i4 - (bkk0Var == null ? 0 : bkk0Var.getMeasuredHeight());
                nzb nzbVar = this.r;
                if (!z) {
                    measuredHeight = 0;
                }
                f4m.q(measuredHeight, nzbVar);
            }
            if (!z) {
                d2 = 0;
            }
            f4m.q(d2, this.n);
        }
    }

    @Override // xsna.piz
    public final void d0() {
        f3y0 f3y0Var = this.p;
        if (f3y0Var != null) {
            f3y0Var.d0();
            d(false, false);
        }
    }

    public final void e() {
        setVisibilityFaded(true);
    }

    @Override // xsna.piz
    public final vcd e3() {
        if (this.J == null) {
            this.J = g620.f().Z().a(getContext());
        }
        bkk0 bkk0Var = this.w;
        if (bkk0Var != null) {
            Object obj = this.J;
            if (obj instanceof View) {
                bkk0Var.setClipsMode((View) obj);
            }
        }
        this.V.add(this.J);
        return this.J;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.piz
    public final void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2) {
        this.a0 = true;
        this.W.c(((szr0) this.N.getValue()).a(aVar, aVar2), (ozr0) this.L.getValue());
    }

    @Override // xsna.piz
    public final void g4(boolean z, boolean z2) {
        LiveView liveView;
        boolean z3;
        boolean z4;
        if (this.f0) {
            this.R = z;
            liveView = this;
            z3 = z;
            z4 = z2;
            liveView.n(250L, z3, true, z4);
        } else {
            liveView = this;
            z3 = z;
            z4 = z2;
        }
        liveView.Q.V0(z3, z4);
    }

    @Override // xsna.piz
    public Set<rr6<?>> getBaseViews() {
        return this.V;
    }

    @Override // xsna.piz
    @Nullable
    public ImageView getCloseView() {
        return this.c;
    }

    @Override // xsna.piz
    public List<View> getFadeTransitionViews() {
        return Collections.singletonList(this.e);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return super.getForeground();
    }

    @Override // xsna.piz
    @Nullable
    public flz getLiveSeekView() {
        return this.E;
    }

    @Override // xsna.piz
    public FrameLayout getMainHolder() {
        return this.e;
    }

    public VideoOverlayView getOverlayView() {
        return this.l;
    }

    @Override // xsna.piz
    public PreviewImageView getPreviewImageView() {
        return this.j;
    }

    @Override // xsna.piz
    public wjk0 getSpectatorsViewNew() {
        return this.w;
    }

    @Override // xsna.piz
    @Nullable
    public a7q0 getUpcomingView() {
        return (a7q0) this.o;
    }

    @Override // xsna.piz
    public VideoTextureView getVideoTextureView() {
        return this.C;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.piz
    public Window getWindow() {
        return this.e0;
    }

    @Override // xsna.piz
    public final void h() {
        this.W.f();
    }

    @Override // xsna.piz
    public final boolean isVisible() {
        return this.R;
    }

    @Override // xsna.piz
    public final void j() {
        this.d.setVisibility(0);
        this.m.setVisibility(0);
        this.n.setVisibility(0);
        this.e.setVisibility(0);
        c5m c5mVar = this.H;
        if (c5mVar != null) {
            c5mVar.setVisibility(0);
        }
        this.a0 = false;
        setVisibilityFaded(true);
        this.W.b();
        this.d0 = true;
        s(false);
    }

    public final void l() {
        setVisibilityFaded(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.piz
    public final void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar) {
        this.d.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.e.setVisibility(8);
        c5m c5mVar = this.H;
        if (c5mVar != null) {
            c5mVar.setVisibility(8);
        }
        this.a0 = true;
        ?? r1 = this.M;
        this.W.a(((lzr0) r1.getValue()).b(je0Var), ((lzr0) r1.getValue()).c(aVar), ((lzr0) r1.getValue()).a((kzr0) this.O.getValue()), null, (ozr0) this.L.getValue(), this.K);
        this.W.setVisibility(0);
        setVisibilityFaded(true);
        r();
        if (aVar instanceof a.AbstractC1195a) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            this.C.d(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight());
        }
        this.d0 = false;
        s(true);
    }

    public final void n(long j, boolean z, boolean z2, boolean z3) {
        Integer num;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        Integer num2 = null;
        if (this.p != null) {
            if (z2) {
                num = Integer.valueOf(z ? 0 : iah0.a(80.0f));
            } else {
                num = null;
            }
            o(this.p, z, j, num, null, accelerateInterpolator, z3);
        }
        flz flzVar = this.E;
        View actualView = flzVar == null ? null : flzVar.getActualView();
        if (actualView != null) {
            o(actualView, this.Q.w() || z, j, null, null, accelerateInterpolator, z3);
        }
        VideoOverlayView videoOverlayView = this.l;
        if (videoOverlayView != null) {
            o(videoOverlayView, z, j, null, null, accelerateInterpolator, z3);
        }
        VideoAdLayout videoAdLayout = this.W;
        if (videoAdLayout != null) {
            o(videoAdLayout, this.a0 && z, j, null, new j0(this, 10), accelerateInterpolator, z3);
        }
        if (this.d != null) {
            if (z2) {
                num2 = Integer.valueOf(z ? 0 : -iah0.a(80.0f));
            }
            o(this.d, z, j, num2, null, accelerateInterpolator, z3);
        }
        VkSpinner vkSpinner = this.i;
        if (vkSpinner != null) {
            o(vkSpinner, z, j, null, null, accelerateInterpolator, z3);
        }
        lnz lnzVar = this.q;
        if (lnzVar != null) {
            o(lnzVar, z, j, null, null, accelerateInterpolator, z3);
        }
        nzb nzbVar = this.r;
        if (nzbVar != null) {
            o(nzbVar, z, j, null, null, accelerateInterpolator, z3);
        }
        bkk0 bkk0Var = this.w;
        if (bkk0Var != null) {
            o(bkk0Var, z, j, null, null, accelerateInterpolator, z3);
        }
        c5m c5mVar = this.H;
        if (c5mVar != null) {
            o(c5mVar, z, j, null, null, accelerateInterpolator, z3);
        }
        View view = this.m;
        if (view != null) {
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z3) {
                ViewPropertyAnimator animate = view.animate();
                if (z) {
                    f2 = 0.5f;
                }
                animate.alpha(f2).setInterpolator(accelerateInterpolator).setDuration(j).start();
            } else {
                if (z) {
                    f2 = 0.5f;
                }
                view.setAlpha(f2);
            }
        }
        View view2 = this.n;
        if (view2 != null) {
            o(view2, z, j, null, null, accelerateInterpolator, z3);
        }
        ErrorView errorView = this.b;
        if (errorView != null) {
            o(errorView, z, j, null, null, accelerateInterpolator, z3);
        }
        ykp ykpVar = this.y;
        if (ykpVar != null) {
            o(ykpVar, z, j, null, null, accelerateInterpolator, z3);
        }
        ror0 ror0Var = this.A;
        if (ror0Var != null) {
            o(ror0Var, z, j, null, null, accelerateInterpolator, z3);
        }
        ConstraintLayout constraintLayout = this.o;
        if (constraintLayout != null) {
            o(constraintLayout, z, j, null, null, accelerateInterpolator, z3);
        }
        Object obj = this.I;
        if (obj != null && (obj instanceof View)) {
            o((View) obj, z, j, null, null, accelerateInterpolator, z3);
        }
        if (this.v != null) {
            s(false);
        }
    }

    @Override // xsna.piz
    public final void n0(boolean z) {
        LinearLayout linearLayout = this.d;
        if (linearLayout.findViewById(R.id.pip) != null) {
            return;
        }
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null);
        appCompatImageButton.setId(R.id.pip);
        appCompatImageButton.setBackgroundResource(R.drawable.ripple);
        appCompatImageButton.setImageDrawable(enj.d(R.drawable.vk_icon_picture_in_picture_16x9_outline_24, R.color.vk_white, getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f));
        layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        appCompatImageButton.setLayoutParams(layoutParams);
        linearLayout.addView(appCompatImageButton, 0);
        if (z) {
            appCompatImageButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            appCompatImageButton.animate().alpha(1.0f).setDuration(300L).start();
        }
        appCompatImageButton.setContentDescription(getContext().getString(R.string.accessibility_picture_in_picture));
        appCompatImageButton.setOnClickListener(new ci0(this, 8));
    }

    @Override // xsna.piz
    public final kkp n1() {
        boolean M = this.Q.M();
        HashSet hashSet = this.V;
        FrameLayout frameLayout = this.e;
        if (!M) {
            if (this.y == null) {
                this.y = new ykp(getContext());
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 51;
            this.y.setLayoutParams(layoutParams);
            frameLayout.addView(this.y, 0);
            hashSet.add(this.y);
            return this.y;
        }
        if (this.z == null) {
            this.z = new glp(getContext());
        }
        this.z.setAllowAddButton(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 51;
        this.z.setLayoutParams(layoutParams2);
        frameLayout.addView(this.z, 0);
        hashSet.add(this.z);
        return this.z;
    }

    public final void o(View view, boolean z, long j, @Nullable Integer num, @Nullable j0 j0Var, AccelerateInterpolator accelerateInterpolator, boolean z2) {
        VideoFile videoFile = getPresenter().getModel().f;
        if ((videoFile != null ? videoFile.z0() : false) && this.Q.R0()) {
            return;
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z2) {
            if (z) {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            if (num != null) {
                view.setTranslationY(num.intValue());
            }
            if (j0Var != null) {
                j0Var.run();
                return;
            }
            return;
        }
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f2 = 1.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f2).setInterpolator(accelerateInterpolator).setDuration(j);
        if (num != null) {
            duration = duration.translationY(num.intValue());
        }
        if (j0Var != null) {
            duration = duration.withEndAction(j0Var);
        }
        duration.start();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.i0 = 0;
        this.j0 = iah0.j(getContext()).y;
        t(configuration);
        super.onConfigurationChanged(configuration);
        AdvertBannerView advertBannerView = this.v;
        if (advertBannerView != null) {
            advertBannerView.post(new h12(7, this, configuration));
        }
        s(true);
        i560.d.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        for (int i = 0; i < getChildCount(); i++) {
            d3m.b(getChildAt(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.R) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        flz flzVar = this.E;
        elz presenter = flzVar != null ? flzVar.getPresenter() : null;
        if (presenter != null) {
            presenter.e0(i5);
        }
        u();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(final int i, final int i2, int i3, int i4) {
        f3y0 f3y0Var;
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i3) {
            return;
        }
        oiz oizVar = this.Q;
        if (oizVar != null && oizVar.isActive() && (f3y0Var = this.p) != null) {
            f3y0Var.F2();
        }
        post(new Runnable() { // from class: xsna.tnz
            /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
            
                if (r1 != 0) goto L10;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                LiveView liveView = LiveView.this;
                int i5 = liveView.i0;
                int i6 = i2;
                if (i6 >= i5 && i6 <= liveView.j0) {
                    liveView.i0 = i6;
                }
                i5 = i6;
                FrameLayout frameLayout = liveView.D;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i5;
                frameLayout.setLayoutParams(layoutParams);
                liveView.j.U();
            }
        });
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getGestureDetectorInstance().a(motionEvent);
        return true;
    }

    @Override // xsna.rr6
    public final void pause() {
        oiz oizVar = this.Q;
        if (oizVar != null) {
            if (oizVar.P1()) {
                setKeepScreenOn(false);
            }
            this.Q.pause();
        }
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).pause();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
            this.T = null;
        }
        this.P = true;
    }

    public final void q(boolean z) {
        LiveStatNew liveStatNew;
        oiz oizVar = this.Q;
        if ((oizVar instanceof com.vk.libvideo.live.impl.views.live.b) && (liveStatNew = ((com.vk.libvideo.live.impl.views.live.b) oizVar).W) != null) {
            if (this.R) {
                liveStatNew.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("action_type", "hide_comments");
                liveStatNew.b(bundle);
                qyk0.a().e("live_action", bundle);
            } else {
                liveStatNew.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("action_type", "show_comments");
                liveStatNew.b(bundle2);
                qyk0.a().e("live_action", bundle2);
            }
        }
        boolean z2 = !this.R;
        this.R = z2;
        g4(z2, z);
        if (this.Q.w()) {
            return;
        }
        this.Q.n(this.R);
    }

    @Override // xsna.piz
    public final void r() {
        io.reactivex.rxjava3.disposables.c cVar = this.S;
        if (cVar != null) {
            cVar.dispose();
            this.S = null;
        }
        this.i.setVisibility(8);
    }

    @Override // xsna.rr6
    public final void release() {
        mg0 mg0Var = this.c0;
        if (mg0Var != null) {
            dw20 dw20Var = mg0Var.e;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            mg0Var.e = null;
            this.c0 = null;
        }
        oiz oizVar = this.Q;
        if (oizVar != null) {
            if (oizVar.P1()) {
                setKeepScreenOn(false);
            }
            this.Q.release();
        }
        HashSet hashSet = this.V;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).release();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
            this.T = null;
        }
        hashSet.clear();
    }

    @Override // xsna.rr6
    public final void resume() {
        oiz oizVar = this.Q;
        if (oizVar != null) {
            if (oizVar.P1()) {
                setKeepScreenOn(true);
            }
            this.Q.resume();
        }
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).resume();
        }
    }

    public final void s(boolean z) {
        AdvertBannerView advertBannerView = this.v;
        if (advertBannerView == null) {
            return;
        }
        if (this.b0 == null) {
            advertBannerView.setVisibility(8);
            return;
        }
        VideoPipStateHolder.a.getClass();
        boolean d2 = VideoPipStateHolder.d();
        if (this.b0 == null || !this.d0 || this.R || d2) {
            advertBannerView.b(false, null);
            return;
        }
        if (!z) {
            advertBannerView.b(true, null);
            return;
        }
        boolean z2 = getContext().getResources().getConfiguration().orientation == 1;
        if (this.R) {
            return;
        }
        advertBannerView.post(new o31(advertBannerView, z2));
    }

    @Override // xsna.piz
    public void setAdvertBanner(VideoAdvertisementsRepository.a aVar) {
        AdvertBannerView advertBannerView = this.v;
        if (advertBannerView == null) {
            return;
        }
        if (!(aVar instanceof VideoAdvertisementsRepository.a.d)) {
            this.b0 = null;
            s(false);
            return;
        }
        boolean z = this.b0 != null;
        this.b0 = ((VideoAdvertisementsRepository.a.d) aVar).a;
        Configuration configuration = getContext().getResources().getConfiguration();
        AdvertBannerView advertBannerView2 = this.v;
        if (advertBannerView2 != null) {
            advertBannerView2.post(new h12(7, this, configuration));
        }
        if (z) {
            zzf zzfVar = this.b0.a.f;
            if (zzfVar != null) {
                String g = xqm0.g("\n            updateBannerCoefficients(\n                '" + zzfVar.a + "',\n                '" + zzfVar.c + "',\n                '" + zzfVar.b + "'\n            );\n        ");
                StringBuilder sb = new StringBuilder("javascript:");
                sb.append(g);
                advertBannerView.evaluateJavascript(sb.toString(), null);
            }
        } else {
            g08 g08Var = this.b0.a;
            String str = g08Var.a;
            advertBannerView.setWebViewClient(new com.vk.libvideo.ui.ad.a(advertBannerView, g08Var.f == null ? AdvertBannerView.Style.FULLSCREEN : null, new tju(this, 6)));
            advertBannerView.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
        }
        Object[] objArr = {this.b0.b.b};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        this.m0.a(Collections.unmodifiableList(arrayList));
        this.o0.g();
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
    }

    @Override // xsna.piz
    public void setLiveSeekView(flz flzVar) {
        this.E = flzVar;
    }

    @Override // xsna.piz
    public void setLoaderColor(int i) {
        this.i.setIndeterminateTintList(anj.b(i, getContext()));
    }

    @Override // xsna.piz
    public void setLoaderEnabled(boolean z) {
        this.k0 = z;
        io.reactivex.rxjava3.disposables.c cVar = this.S;
        if (cVar == null || z) {
            return;
        }
        cVar.dispose();
        this.S = null;
    }

    @Override // xsna.piz
    public void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
        uhu0 uhu0Var = this.G;
        if (uhu0Var != null) {
            List<VideoUrl> list = zhr0.a;
            bwt0.o0(uhu0Var, uhu0Var.getContext().getColor(mediaRouteConnectStatus == MediaRouteConnectStatus.CONNECTED ? R.color.vk_blue_300 : R.color.vk_white));
        }
    }

    public void setSkipUp(boolean z) {
        this.g0 = z;
    }

    @Override // xsna.piz
    public void setSmoothHideBack(boolean z) {
        this.U = z;
    }

    @Override // xsna.piz
    public void setVisibilityFaded(boolean z) {
        LiveView liveView;
        if (z) {
            liveView = this;
            if (liveView.R) {
                liveView.n(100L, true, false, true);
            }
        } else {
            liveView = this;
            liveView.n(100L, false, false, true);
        }
        liveView.f0 = z;
    }

    @Override // xsna.piz
    public void setWindow(Window window) {
        this.e0 = window;
    }

    @Override // xsna.piz
    public void setWriteBarVisible(boolean z) {
        f3y0 f3y0Var = this.p;
        if (f3y0Var != null) {
            awt0.v(f3y0Var, z);
            awt0.v(this.f, z);
            awt0.v(this.g, z);
        }
    }

    public final void t(Configuration configuration) {
        int i;
        int i2 = iah0.j(getContext()).x;
        int i3 = 0;
        try {
            i = this.p.getKeyboardPopup().f.getHeight();
        } catch (Exception unused) {
            i = 0;
        }
        f3y0 f3y0Var = this.p;
        if (f3y0Var == null || f3y0Var.getAutoSuggestPopup() == null) {
            return;
        }
        float n = this.p.getAutoSuggestPopup().n() * 1.5f;
        int height = this.d.getHeight();
        int i4 = configuration.orientation;
        if (i4 != 2) {
            i2 = this.j0;
        }
        float f2 = ((i2 - i) - n) - height;
        FrameLayout frameLayout = this.f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            layoutParams.topMargin = iah0.a(16);
        } else {
            layoutParams.topMargin = f2 > ((float) iah0.a(64.0f)) ? iah0.a(64) : (int) f2;
        }
        if (i4 == 2 && f2 < iah0.a(64.0f)) {
            i3 = 8;
        }
        c5m c5mVar = this.H;
        if (c5mVar != null) {
            c5mVar.setVisibility(i3);
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(layoutParams));
    }

    public final void u() {
        int viewsAboveSeekBottomMargin = getViewsAboveSeekBottomMargin();
        if (this.Q.w()) {
            LinearLayout linearLayout = this.h;
            if (linearLayout != null) {
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = viewsAboveSeekBottomMargin;
            }
        } else {
            nzb nzbVar = this.r;
            if (nzbVar != null) {
                ((FrameLayout.LayoutParams) nzbVar.getLayoutParams()).bottomMargin = viewsAboveSeekBottomMargin;
            }
        }
        lnz lnzVar = this.q;
        if (lnzVar != null) {
            ((FrameLayout.LayoutParams) lnzVar.getLayoutParams()).bottomMargin = viewsAboveSeekBottomMargin;
        }
    }

    @Override // xsna.piz
    public final wjk0 v(boolean z) {
        VideoFile videoFile = this.Q.getModel().f;
        if (videoFile != null && this.Q.R0()) {
            boolean z0 = videoFile.z0();
            VkText vkText = this.t;
            awt0.u(vkText, z0);
            if (z0) {
                ucp ucpVar = ucp.a;
                vkText.setText(ucp.i(videoFile.getTitle()));
            }
        }
        boolean w = this.Q.w();
        HashSet hashSet = this.V;
        if (!w) {
            if (this.s == null) {
                this.s = new akk0(getContext());
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            this.s.setLayoutParams(layoutParams);
            this.d.addView(this.s, 0);
            if (z) {
                this.s.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.s.animate().alpha(1.0f).setDuration(300L).start();
            }
            hashSet.add(this.s);
            return this.s;
        }
        if (this.w == null) {
            this.w = new bkk0(getContext());
        }
        b();
        this.w.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.h.addView(this.w, 0);
        LinearLayout linearLayout = this.h;
        FrameLayout frameLayout = this.e;
        frameLayout.removeView(linearLayout);
        frameLayout.addView(this.h, 0);
        if (z) {
            this.w.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.w.animate().alpha(1.0f).setDuration(300L).start();
        }
        if (this.Q.w()) {
            this.w.setClickable(true);
        }
        hashSet.add(this.w);
        return this.w;
    }

    @Override // xsna.piz
    public final void v1() {
        View view = this.n;
        view.setBackgroundResource(R.drawable.bg_live_vertical_feed_gradient);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.height = iah0.a(350);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // xsna.piz
    public final por0 w3() {
        if (this.A == null) {
            this.A = new ror0(getContext());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 51;
        this.A.setLayoutParams(layoutParams);
        this.e.addView(this.A, 0);
        this.V.add(this.A);
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.piz
    public final void x() {
        if (!this.R && !getPresenter().w()) {
            q(false);
        }
        Q2(false);
        HashSet hashSet = this.V;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            rr6 rr6Var = (rr6) it.next();
            rr6Var.release();
            View view = (View) rr6Var;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        hashSet.clear();
        boolean isAttachedToWindow = isAttachedToWindow();
        VideoOverlayView videoOverlayView = this.l;
        if (isAttachedToWindow) {
            d3m.e(videoOverlayView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        } else {
            videoOverlayView.animate().cancel();
            videoOverlayView.clearAnimation();
            videoOverlayView.setVisibility(8);
        }
        LinearLayout linearLayout = this.d;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        linearLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c5m c5mVar = this.H;
        if (c5mVar != null) {
            c5mVar.animate().cancel();
            this.H.setAlpha(1.0f);
            this.H.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        View view2 = this.m;
        view2.animate().cancel();
        view2.setAlpha(0.5f);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view3 = this.n;
        view3.animate().cancel();
        view3.setAlpha(1.0f);
        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b.setVisibility(8);
        this.i.setVisibility(8);
    }

    @Override // xsna.m0q0
    @SuppressLint({"MissingSuperCall"})
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(this.Q.getModel().d), Long.valueOf(this.Q.getModel().e.b), null, null, null);
    }

    @Override // xsna.piz
    public final h520 z1(boolean z) {
        boolean w = this.Q.w();
        MenuButtonNewView menuButtonNewView = new MenuButtonNewView(getContext(), null, 6);
        this.x = menuButtonNewView;
        menuButtonNewView.setId(R.id.live_view_menu_button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(48.0f), iah0.a(w ? 64.0f : 48.0f));
        layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x.setBackground(m33.a(R.drawable.vkim_ripple_light_borderless, getContext()));
        this.x.setContentDescription(getContext().getString(R.string.videos_suggested_all));
        this.x.setLayoutParams(layoutParams);
        if (w && this.p != null && !this.Q.w()) {
            ((ViewGroup) this.p.findViewById(R.id.writeViewButtonsHolder)).addView(this.x, 0);
        } else if (!this.Q.w()) {
            this.d.addView(this.x, 0);
        }
        if (z) {
            this.x.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.x.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.V.add(this.x);
        return this.x;
    }

    @Override // xsna.rr6
    public oiz getPresenter() {
        return this.Q;
    }

    @Override // xsna.rr6
    public void setPresenter(oiz oizVar) {
        this.Q = oizVar;
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void L9(@NonNull VideoFile videoFile, boolean z) {
    }
}
