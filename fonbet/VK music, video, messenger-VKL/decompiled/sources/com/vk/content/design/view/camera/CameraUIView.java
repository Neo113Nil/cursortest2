package com.vk.content.design.view.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.client.result.ParsedResult;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.cadre.CadreTarget;
import com.vk.cameraui.ShutterStates;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.cameraui.widgets.CameraGridView;
import com.vk.cameraui.widgets.ClipsProgressView;
import com.vk.cameraui.widgets.VideoRecordingTimerView;
import com.vk.clips.design.view.BroadcastFriendsView;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.masks.MasksController;
import com.vk.masks.MasksView;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import com.vk.media.ok.recording.RecognitionView;
import com.vk.media.ok.utils.DuetAction;
import com.vk.media.recorder.RecorderBase;
import com.vk.medianative.MediaNative;
import com.vk.ml.MLFeatures;
import com.vk.permission.PermissionHelper;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import defpackage.x;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a1y;
import xsna.a5;
import xsna.ai10;
import xsna.am9;
import xsna.an9;
import xsna.asu0;
import xsna.atn0;
import xsna.awt0;
import xsna.b1y;
import xsna.baf;
import xsna.bdz;
import xsna.be6;
import xsna.bg8;
import xsna.bm9;
import xsna.bo9;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cg8;
import xsna.cn70;
import xsna.coz;
import xsna.cxu0;
import xsna.d0;
import xsna.d0k;
import xsna.d3m;
import xsna.d40;
import xsna.d7;
import xsna.dcn;
import xsna.dg8;
import xsna.dhr0;
import xsna.djl0;
import xsna.dm9;
import xsna.dn9;
import xsna.do3;
import xsna.do9;
import xsna.doe0;
import xsna.dxh;
import xsna.e3m;
import xsna.e43;
import xsna.e8;
import xsna.ei10;
import xsna.eig;
import xsna.en9;
import xsna.enj;
import xsna.ep6;
import xsna.epx;
import xsna.eqo;
import xsna.etv0;
import xsna.ey90;
import xsna.f1;
import xsna.f2y0;
import xsna.f4m;
import xsna.fi10;
import xsna.fil;
import xsna.fm9;
import xsna.fn9;
import xsna.fxc0;
import xsna.fy2;
import xsna.g0m0;
import xsna.g0t;
import xsna.gm9;
import xsna.gr3;
import xsna.gz80;
import xsna.gzs;
import xsna.h3g0;
import xsna.h6;
import xsna.hav0;
import xsna.hd;
import xsna.hfr;
import xsna.hg;
import xsna.hn9;
import xsna.i0q0;
import xsna.iah0;
import xsna.il1;
import xsna.iod;
import xsna.iz8;
import xsna.izs;
import xsna.j20;
import xsna.j22;
import xsna.j50;
import xsna.j5g;
import xsna.jl4;
import xsna.jy;
import xsna.kd;
import xsna.kl2;
import xsna.kn4;
import xsna.kn9;
import xsna.kqo;
import xsna.kz8;
import xsna.l7v;
import xsna.l8;
import xsna.lh3;
import xsna.lk9;
import xsna.lmv;
import xsna.ln9;
import xsna.lno;
import xsna.lqo;
import xsna.m1r;
import xsna.mhy;
import xsna.mn9;
import xsna.n1r;
import xsna.n96;
import xsna.ne3;
import xsna.ni9;
import xsna.nk9;
import xsna.nn9;
import xsna.o7j;
import xsna.o9e;
import xsna.oen;
import xsna.of9;
import xsna.p69;
import xsna.pd;
import xsna.pe8;
import xsna.pn9;
import xsna.qi9;
import xsna.ql0;
import xsna.qn9;
import xsna.ra;
import xsna.rg10;
import xsna.rj1;
import xsna.rj9;
import xsna.rl3;
import xsna.rli0;
import xsna.rm0;
import xsna.rn9;
import xsna.rpo;
import xsna.rsg0;
import xsna.rw70;
import xsna.s1;
import xsna.s3q0;
import xsna.s4;
import xsna.s8g0;
import xsna.sc2;
import xsna.sc4;
import xsna.sf1;
import xsna.sm9;
import xsna.sn9;
import xsna.spo;
import xsna.t12;
import xsna.tlo0;
import xsna.tn9;
import xsna.u330;
import xsna.ug;
import xsna.uud;
import xsna.v4v;
import xsna.v5o;
import xsna.v7m0;
import xsna.vg;
import xsna.vi9;
import xsna.vn9;
import xsna.w1q0;
import xsna.we0;
import xsna.wh6;
import xsna.wm9;
import xsna.wn9;
import xsna.wx0;
import xsna.wzf;
import xsna.xkg;
import xsna.xmg0;
import xsna.xn9;
import xsna.xz;
import xsna.xzs;
import xsna.y8g0;
import xsna.ya;
import xsna.yn9;
import xsna.ysg0;
import xsna.yx0;
import xsna.yx90;
import xsna.yy80;
import xsna.z4;
import xsna.z9o0;
import xsna.zd9;
import xsna.zhy0;
import xsna.zn9;
import xsna.zq3;
import xsna.zs;
import xsna.zx;
import xsna.zx0;
import xsna.zy;

/* compiled from: CameraUIView.kt */
/* loaded from: classes.dex */
public final class CameraUIView extends n96 implements UiTracking$TrackableView {
    public static final float w1 = iah0.b(13.0f);
    public final float A;
    public FrameLayout A0;
    public final gm9 B;
    public StopwatchView B0;
    public eqo<DynamicMasksUseCase> C;
    public RecognitionView C0;
    public eqo<rpo> D;
    public VkScreenSpinner D0;
    public eqo<kqo> E;
    public ClipsControlsView E0;
    public final AccelerateDecelerateInterpolator F;
    public VkContentBadge F0;
    public ValueAnimator G;
    public ClipsProgressView G0;
    public final baf H;
    public VkSimpleButton H0;
    public boolean I;
    public ImageView I0;
    public float J;
    public ImageView J0;
    public float K;
    public ViewGroup K0;
    public boolean L;
    public View L0;
    public io.reactivex.rxjava3.disposables.c M;
    public StopwatchView M0;
    public io.reactivex.rxjava3.disposables.c N;
    public ProgressBar N0;
    public dcn O;
    public ImageView O0;
    public boolean P;
    public FrameLayout P0;
    public long Q;
    public QrScannerUi Q0;
    public final boolean R;
    public HorizontalScrollView R0;
    public ImageView S;
    public LinearLayout S0;
    public ImageView T;
    public ViewPropertyAnimator T0;
    public ImageView U;
    public final iz8[] U0;
    public TextView V;
    public boolean V0;
    public ImageView W;
    public float W0;
    public final bpn0 X0;
    public w1q0 Y0;
    public boolean Z0;
    public ImageView a0;
    public io.reactivex.rxjava3.disposables.c a1;
    public MasksWrap b0;
    public final Handler b1;
    public uud c0;
    public View c1;
    public View d0;
    public VKImageView d1;
    public View e0;
    public TextView e1;
    public ImageView f0;
    public View f1;
    public VideoRecordingTimerView g0;
    public boolean g1;
    public VkAvatar h0;
    public int h1;
    public View i0;
    public float i1;
    public View j0;
    public etv0 j1;
    public View k0;
    public pe8 k1;
    public FrameLayout l0;
    public bm9 l1;
    public ViewGroup m0;
    public cg8 m1;
    public AppCompatImageView n0;
    public izs<? super ArrayList<ParsedResult>, s3q0> n1;
    public AppCompatTextView o0;
    public fm9 o1;
    public View p0;
    public boolean p1;
    public View q0;
    public String q1;
    public CameraGridView r0;
    public boolean r1;
    public int s0;
    public boolean s1;
    public int t0;
    public final com.vk.content.design.view.camera.c t1;
    public View u0;
    public final wn9 u1;
    public View v0;

    @SuppressLint({"ClickableViewAccessibility"})
    public final rn9 v1;
    public final Object w;
    public AppCompatEditText w0;
    public volatile qi9 x;
    public View x0;
    public final float y;
    public final FrameLayout y0;
    public final float z;
    public final FrameLayout z0;

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class a extends RecyclerView.n {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i = this.b;
            rect.left = i;
            rect.right = i;
            rect.top = i;
            rect.bottom = i;
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class c extends AnimatorListenerAdapter {
        public final /* synthetic */ int c;

        public c(int i) {
            this.c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = CameraUIView.w1;
            ShutterButton shutter = CameraUIView.this.getShutter();
            if (shutter != null) {
                shutter.b(this.c, true);
            }
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class d {
        public final /* synthetic */ Mask b;

        public d(Mask mask) {
            this.b = mask;
        }

        public final void a(final Mask mask, boolean z) {
            rsg0 rsg0Var;
            rsg0 rsg0Var2;
            final boolean z2 = false;
            CameraUIView cameraUIView = CameraUIView.this;
            if (!z) {
                MasksWrap masksWrap = cameraUIView.b0;
                if (masksWrap != null) {
                    io.reactivex.rxjava3.disposables.c favoriteDisposable = masksWrap.getFavoriteDisposable();
                    if (favoriteDisposable != null) {
                        favoriteDisposable.dispose();
                    }
                    final MasksController masksController = masksWrap.getMasksController();
                    masksController.getClass();
                    boolean z3 = mask.u;
                    int i = mask.d;
                    UserId userId = mask.e;
                    if (z3) {
                        rsg0Var = new ei10("masks.removeEffectFromFavorite");
                        rsg0Var.F(userId, "owner_id");
                        rsg0Var.C(i, "effect_id");
                    } else {
                        fi10 fi10Var = new fi10("masks.removeFromFavorite");
                        fi10Var.F(userId, "owner_id");
                        fi10Var.C(i, "mask_id");
                        rsg0Var = fi10Var;
                    }
                    masksWrap.setFavoriteDisposable(rsg0.T(rsg0Var).L(new l(masksController, mask, z2) { // from class: xsna.jh10
                        public final /* synthetic */ Mask b;
                        public final /* synthetic */ boolean c;

                        {
                            this.b = mask;
                            this.c = z2;
                        }

                        @Override // io.reactivex.rxjava3.functions.l
                        public final Object apply(Object obj) {
                            if (!((Boolean) obj).booleanValue()) {
                                return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                            }
                            wmi0 wmi0Var = wmi0.a;
                            io.reactivex.rxjava3.core.q e = wmi0Var.e("masks_catalog");
                            Mask mask2 = this.b;
                            boolean z4 = this.c;
                            return io.reactivex.rxjava3.core.q.I0(e.U(new lus(mask2, z4, "masks_catalog")), wmi0Var.e("ok_effects_catalog").U(new lus(mask2, z4, "ok_effects_catalog")), new jq(23));
                        }
                    }, false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bdz(new wzf(masksWrap, 29), 2), new m1r(new v4v(11), 5)));
                    return;
                }
                return;
            }
            MasksWrap masksWrap2 = cameraUIView.b0;
            if (masksWrap2 != null) {
                io.reactivex.rxjava3.disposables.c favoriteDisposable2 = masksWrap2.getFavoriteDisposable();
                if (favoriteDisposable2 != null) {
                    favoriteDisposable2.dispose();
                }
                final MasksController masksController2 = masksWrap2.getMasksController();
                masksController2.getClass();
                boolean z4 = mask.u;
                int i2 = mask.d;
                UserId userId2 = mask.e;
                if (z4) {
                    rsg0Var2 = new djl0("masks.addEffectToFavorite");
                    rsg0Var2.F(userId2, "owner_id");
                    rsg0Var2.C(i2, "effect_id");
                } else {
                    zs zsVar = new zs("masks.addToFavorite");
                    zsVar.F(userId2, "owner_id");
                    zsVar.C(i2, "mask_id");
                    rsg0Var2 = zsVar;
                }
                final boolean z5 = true;
                masksWrap2.setFavoriteDisposable(rsg0.T(rsg0Var2).L(new l(masksController2, mask, z5) { // from class: xsna.jh10
                    public final /* synthetic */ Mask b;
                    public final /* synthetic */ boolean c;

                    {
                        this.b = mask;
                        this.c = z5;
                    }

                    @Override // io.reactivex.rxjava3.functions.l
                    public final Object apply(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                        }
                        wmi0 wmi0Var = wmi0.a;
                        io.reactivex.rxjava3.core.q e = wmi0Var.e("masks_catalog");
                        Mask mask2 = this.b;
                        boolean z42 = this.c;
                        return io.reactivex.rxjava3.core.q.I0(e.U(new lus(mask2, z42, "masks_catalog")), wmi0Var.e("ok_effects_catalog").U(new lus(mask2, z42, "ok_effects_catalog")), new jq(23));
                    }
                }, false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n1r(new dxh(masksWrap2, 25), 3), new j50(new d0k(15), 26)));
            }
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e implements o7j, g0t {
        public e() {
        }

        @Override // xsna.o7j
        public final void accept(Object obj) {
            DuetAction duetAction = (DuetAction) obj;
            float f = CameraUIView.w1;
            CameraUIView cameraUIView = CameraUIView.this;
            bm9 presenter = cameraUIView.getPresenter();
            if (presenter != null) {
                presenter.y3(duetAction);
            }
            if (duetAction == DuetAction.CANCEL) {
                cameraUIView.ff(false, null, null);
                cameraUIView.H.a();
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof o7j) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CameraUIView.this, CameraUIView.class, "duetViewResponseCallback", "duetViewResponseCallback(Lcom/vk/media/ok/utils/DuetAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class h implements TabsRecycler.a {
        public h() {
        }

        @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.a
        public final boolean a(String str) {
            float f = CameraUIView.w1;
            return CameraUIView.this.getDeps().h().b().a(str);
        }

        @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.a
        public final void b(String str) {
            float f = CameraUIView.w1;
            CameraUIView.this.getDeps().h().b().b(str);
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class i {
        public i() {
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class j {

        /* compiled from: CameraUIView.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DynamicMasksUseCase.values().length];
                try {
                    iArr[DynamicMasksUseCase.CameraInit.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DynamicMasksUseCase.CameraInitAndMaskPreselected.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DynamicMasksUseCase.MasksClicked.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public j() {
        }
    }

    @SuppressLint({"ViewConstructor"})
    public CameraUIView(Context context, dm9 dm9Var, g0m0 g0m0Var, StoryCameraParams storyCameraParams) {
        super(context, dm9Var);
        List<StoryCameraGalleryData> Ib;
        this.w = g0m0Var;
        this.y = iah0.a(150);
        this.z = iah0.a(32);
        this.A = y8g0.a(R.dimen.story_camera_tabs_height);
        gm9 gm9Var = new gm9();
        this.B = gm9Var;
        this.F = new AccelerateDecelerateInterpolator();
        this.H = new baf();
        StoriesFeatures storiesFeatures = StoriesFeatures.SKIP_CAMERA_ON_REPOST;
        storiesFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(storiesFeatures);
        this.R = a2;
        this.U0 = new iz8[]{null, null};
        this.X0 = new bpn0(new zq3(4));
        this.b1 = new Handler();
        this.o1 = gm9Var;
        this.p1 = true;
        this.r1 = true;
        this.t1 = new com.vk.content.design.view.camera.c(this, context);
        if (storyCameraParams.Sb()) {
            setFitsSystemWindows(false);
            setClipToPadding(true);
            setClipChildren(true);
            setClipToOutline(true);
            setFocusableInTouchMode(true);
            setBackgroundColor(0);
        } else {
            setFitsSystemWindows(true);
            setClipToPadding(false);
            setClipChildren(false);
            setFocusableInTouchMode(true);
            setBackgroundColor(-16777216);
        }
        LayoutInflater.from(context).inflate(R.layout.create_camera_view_ui, (ViewGroup) this, true);
        this.y0 = (FrameLayout) findViewById(R.id.center_container);
        bwt0.o(this, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 12));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.camera_view_controls_container);
        this.z0 = frameLayout;
        if (a2 && storyCameraParams.Vb()) {
            f4m.j(frameLayout);
        }
        if (storyCameraParams.Lb() != null) {
            f4m.j(frameLayout);
        }
        if (storyCameraParams.Mb() && (Ib = storyCameraParams.Ib()) != null && !Ib.isEmpty()) {
            f4m.j(frameLayout);
        }
        bwt0.o(this, new il1(this, 8));
        bwt0.o(this, new s4(this, 16));
        this.u1 = new wn9(this);
        this.v1 = new rn9(this, 0);
    }

    public static gzs A(CameraUIView cameraUIView, Object obj) {
        return ((u330) obj) instanceof com.vk.ml.g ? new com.vk.movika.sdk.base.flow.binding.j(5, cameraUIView, obj) : cameraUIView.getModelStateUpdater();
    }

    public static void B(CameraUIView cameraUIView) {
        i0q0.f(cameraUIView.getModelStateUpdater());
    }

    public static final void C(CameraUIView cameraUIView) {
        if (cameraUIView.b0 != null) {
            com.vk.content.design.view.camera.a.k();
        }
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null ? presenter.Y3() : false) {
            return;
        }
        cameraUIView.b1.postDelayed(new tn9(cameraUIView, 0), 100L);
    }

    private final gzs<s3q0> getModelStateUpdater() {
        ((xkg) getDeps().k()).getClass();
        z9o0 z9o0Var = xkg.b;
        final int m = z9o0Var.c().m();
        ((xkg) getDeps().k()).getClass();
        final int l = z9o0Var.c().l();
        return new gzs() { // from class: xsna.cn9
            @Override // xsna.gzs
            public final Object invoke() {
                ProgressBar clipsGestureProgress;
                ProgressBar clipsGestureProgress2;
                int i2 = l;
                int i3 = m;
                CameraUIView cameraUIView = this;
                if (i2 == i3) {
                    io.reactivex.rxjava3.disposables.c cVar = cameraUIView.a1;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    cameraUIView.a1 = null;
                    ClipsControlsView clipsControls = cameraUIView.getClipsControls();
                    if (clipsControls != null && (clipsGestureProgress2 = clipsControls.getClipsGestureProgress()) != null) {
                        clipsGestureProgress2.setVisibility(8);
                    }
                } else {
                    float f2 = CameraUIView.w1;
                    if (cameraUIView.getDeps().a().b()) {
                        float f3 = i2 / i3;
                        ClipsControlsView clipsControls2 = cameraUIView.getClipsControls();
                        if (clipsControls2 != null && (clipsGestureProgress = clipsControls2.getClipsGestureProgress()) != null) {
                            clipsGestureProgress.setProgress((int) (f3 * 100));
                            clipsGestureProgress.setVisibility(0);
                        }
                    }
                }
                return s3q0.a;
            }
        };
    }

    private final yy80 getOrientationLocker() {
        return (yy80) this.X0.getValue();
    }

    private final RecorderBase.RecordingType getRecordingType() {
        StoryCameraMode c4;
        bm9 presenter = getPresenter();
        if (presenter != null && (c4 = presenter.c4()) != null && c4.i()) {
            return RecorderBase.RecordingType.CLIP;
        }
        bm9 presenter2 = getPresenter();
        return (presenter2 != null ? presenter2.c4() : null) == StoryCameraMode.LIVE ? RecorderBase.RecordingType.LIVE : RecorderBase.RecordingType.ORIGINAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDuetsOn$lambda$170(CameraUIView cameraUIView) {
        cameraUIView.H.b();
    }

    private void setGalleryAvailable(boolean z) {
        this.r1 = z;
        View photosButtonBottom = getPhotosButtonBottom();
        if (photosButtonBottom != null) {
            photosButtonBottom.setClickable(z);
        }
        VkPicture photosButtonThumbBottom = getPhotosButtonThumbBottom();
        if (photosButtonThumbBottom != null) {
            photosButtonThumbBottom.setVisibility(z ? 0 : 8);
        }
        View photosButtonRollBottom = getPhotosButtonRollBottom();
        if (photosButtonRollBottom != null) {
            photosButtonRollBottom.setBackgroundResource(z ? R.drawable.ic_camera_roll : R.drawable.vk_icon_picture_outline_shadow_large_48_gallery);
            photosButtonRollBottom.setAlpha(z ? 1.0f : 0.4f);
        }
    }

    private final void setLeftButtonContentDescription(int i2) {
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setContentDescription(getContext().getString(i2));
        }
    }

    private void setLoadingProgress(float f2) {
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setLoadingProgress(f2);
            shutter.invalidate();
        }
    }

    private void setLoadingVisible(boolean z) {
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setLoading(z);
            shutter.invalidate();
        }
    }

    private final void setRightButtonContentDescription(int i2) {
        ImageView imageView = this.T;
        if (imageView != null) {
            imageView.setContentDescription(getContext().getString(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s3q0 y(final CameraUIView cameraUIView) {
        int i2;
        long j2;
        boolean z;
        TabsRecycler tabs;
        bm9 presenter;
        zd9 camera1View;
        an9 state;
        StoryCameraMode currentState;
        int i3 = 1;
        b1y b1yVar = new b1y(cameraUIView, i3);
        zn9 zn9Var = new zn9(cameraUIView);
        h3g0 h3g0Var = new h3g0(cameraUIView);
        e8 e8Var = new e8(cameraUIView, 7);
        bm9 presenter2 = cameraUIView.getPresenter();
        doe0 doe0Var = (presenter2 == null || !presenter2.M3()) ? doe0.a.a : doe0.b.a;
        rw70 rw70Var = new rw70(y8g0.e(R.string.clips_orientation_tip), new com.vk.movika.sdk.base.observable.e(cameraUIView, 15));
        bo9 bo9Var = new bo9(cameraUIView);
        a1y a1yVar = new a1y(cameraUIView, 2);
        rj9 rj9Var = new rj9(cameraUIView.getDeps());
        new nk9(cameraUIView.getDeps().b()).b();
        long currentTimeMillis = System.currentTimeMillis();
        sc4 sc4Var = new sc4(cameraUIView, i3);
        if (cameraUIView.getCamera1View() == null) {
            j2 = currentTimeMillis;
            zd9 xn9Var = new xn9(doe0Var, b1yVar, zn9Var, h3g0Var, e8Var, bo9Var, rw70Var, rj9Var, a1yVar, sc4Var, cameraUIView, cameraUIView.getContext(), ((eig) cameraUIView.getDeps().j()).b(), ((eig) cameraUIView.getDeps().j()).a(), cameraUIView.getRecordingType(), cameraUIView.getDeps().l().d(), fxc0.B().i().d());
            i2 = 0;
            cameraUIView.addView(xn9Var, 0);
            cameraUIView.setCamera1View(xn9Var);
        } else {
            i2 = 0;
            j2 = currentTimeMillis;
        }
        zd9 camera1View2 = cameraUIView.getCamera1View();
        if (camera1View2 != null) {
            cameraUIView.J0(camera1View2);
            final long j3 = j2;
            camera1View2.setOnDoubleClickListener(new View.OnClickListener() { // from class: xsna.on9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bm9 presenter3;
                    an9 state2;
                    bm9 presenter4;
                    an9 state3;
                    bm9 presenter5;
                    Mask selectedMask;
                    float f2 = CameraUIView.w1;
                    if (System.currentTimeMillis() - j3 > 2000) {
                        CameraUIView cameraUIView2 = cameraUIView;
                        bm9 presenter6 = cameraUIView2.getPresenter();
                        if ((presenter6 != null ? presenter6.c4() : null) != StoryCameraMode.QR_SCANNER) {
                            MasksWrap masksWrap = cameraUIView2.b0;
                            if ((masksWrap != null && (selectedMask = masksWrap.getSelectedMask()) != null && selectedMask.s) || (presenter3 = cameraUIView2.getPresenter()) == null || (state2 = presenter3.getState()) == null || state2.i || (presenter4 = cameraUIView2.getPresenter()) == null || (state3 = presenter4.getState()) == null || state3.g || (presenter5 = cameraUIView2.getPresenter()) == null) {
                                return;
                            }
                            presenter5.B();
                        }
                    }
                }
            });
            camera1View2.setTrySingleTapCallback(new lh3(cameraUIView, 2));
            camera1View2.setExternalTouchListener(new pn9(cameraUIView, i2));
            camera1View2.setMaxRecordingLengthMs(60000);
            MasksWrap masksWrap = cameraUIView.b0;
            if (masksWrap != null) {
                masksWrap.setCamera1View(cameraUIView.t1);
            }
            StoryCameraParams cameraParams = cameraUIView.getCameraParams();
            if (cameraParams != null) {
                z = true;
                if (cameraParams.Gb()) {
                    camera1View2.k();
                    StoryCameraParams cameraParams2 = cameraUIView.getCameraParams();
                    if (cameraParams2 != null) {
                        cameraParams2.Zb();
                    }
                }
            } else {
                z = true;
            }
            StoryCameraParams cameraParams3 = cameraUIView.getCameraParams();
            if (cameraParams3 != null && cameraParams3.Fb() == z) {
                camera1View2.j();
                StoryCameraParams cameraParams4 = cameraUIView.getCameraParams();
                if (cameraParams4 != null) {
                    cameraParams4.Yb();
                }
            }
            bm9 presenter3 = cameraUIView.getPresenter();
            camera1View2.setRecordingCallback(presenter3 != null ? presenter3.B4() : null);
            camera1View2.setCameraTracker(new yn9(cameraUIView));
            camera1View2.setFeatureCallback(new l8(cameraUIView, 10));
            camera1View2.l = new d0(cameraUIView, 4);
            camera1View2.setFrameDetector(cameraUIView.x);
            bm9 presenter4 = cameraUIView.getPresenter();
            camera1View2.setMLDetectorEnabled(cameraUIView.H(presenter4 != null ? presenter4.c4() : null));
            StopwatchView stopwatchView = cameraUIView.B0;
            RecognitionView recognitionView = cameraUIView.C0;
            MasksWrap masksWrap2 = cameraUIView.b0;
            camera1View2.G(stopwatchView, recognitionView, masksWrap2 != null ? masksWrap2.getClipsGalleryListWrapper() : null);
            bm9 presenter5 = cameraUIView.getPresenter();
            camera1View2.F((presenter5 == null || (currentState = presenter5.getCurrentState()) == null || currentState.i()) ? i2 : z);
        } else {
            z = true;
        }
        bm9 presenter6 = cameraUIView.getPresenter();
        if (presenter6 != null) {
            presenter6.j3();
        }
        cameraUIView.p0();
        QrScannerUi qrScannerUi = cameraUIView.Q0;
        if (qrScannerUi != null) {
            qrScannerUi.b(cameraUIView.getCamera1View());
        }
        if (e3m.h(cameraUIView.getContext()) != null && (((presenter = cameraUIView.getPresenter()) == null || (state = presenter.getState()) == null || state.f() != z) && (camera1View = cameraUIView.getCamera1View()) != null)) {
            awt0.t(camera1View, new z4(cameraUIView, 15));
        }
        ShutterButton shutter = cameraUIView.getShutter();
        if (shutter != null) {
            shutter.setExternalDownListener(new com.vk.content.design.view.camera.b(cameraUIView));
        }
        if (cameraUIView.Y0 == null && (tabs = cameraUIView.getTabs()) != null) {
            LinearLayoutManager lm = tabs.getLm();
            atn0 tabSnapHelper$ui_release = tabs.getTabSnapHelper$ui_release();
            UiTracker uiTracker = UiTracker.a;
            w1q0 w1q0Var = new w1q0(lm, tabSnapHelper$ui_release, UiTracker.c(), new a5(3, cameraUIView, tabs));
            cameraUIView.Y0 = w1q0Var;
            tabs.addOnScrollListener(w1q0Var);
        }
        if (cameraUIView.R && cameraUIView.z0.getVisibility() != 0) {
            cameraUIView.z0.setVisibility(i2);
        }
        eqo<DynamicMasksUseCase> eqoVar = cameraUIView.C;
        if (eqoVar != null) {
            eqoVar.f(DynamicMasksUseCase.CameraInit);
        }
        return s3q0.a;
    }

    public final void B0() {
        this.s1 = true;
        setLoadingProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bm9 presenter = getPresenter();
        if ((presenter != null ? presenter.getCurrentState() : null) == StoryCameraMode.CLIPS) {
            setGalleryAvailable(false);
            setLoadingVisible(true);
        }
    }

    public final void C0() {
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.d();
            camera1View.N();
        }
    }

    public final void D(iz8 iz8Var) {
        hfr.a aVar = new hfr.a(rli0.j(rl3.D(ShutterStates.values()), new wh6(3)));
        while (aVar.hasNext()) {
            ShutterButton.d dVar = getShutterStatesMap().get((ShutterStates) aVar.next());
            if (dVar != null) {
                dVar.v().bottom -= this.h1;
                this.h1 = (int) (iz8Var.f() ? iz8Var.a() - G(iz8Var) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                dVar.v().bottom += this.h1;
            }
        }
    }

    public final void E() {
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            ValueAnimator valueAnimator = shutter.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int i2 = 1;
            ofFloat.addUpdateListener(new v5o(shutter, i2));
            ofFloat.addListener(new ql0(shutter, i2));
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new OvershootInterpolator());
            ofFloat.start();
            shutter.I = ofFloat;
        }
    }

    public final void E0(iod iodVar) {
        StopwatchView stopwatchView = this.M0;
        if (stopwatchView != null) {
            stopwatchView.c();
        }
        StopwatchView stopwatchView2 = this.M0;
        if (stopwatchView2 != null) {
            stopwatchView2.c.remove(iodVar);
        }
        setCountDownLayoutVisible(false);
    }

    public final void F(boolean z, ra raVar) {
        HorizontalScrollView horizontalScrollView = this.R0;
        if (horizontalScrollView != null) {
            ViewPropertyAnimator viewPropertyAnimator = this.T0;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = z ? -iah0.a(70) : 0.0f;
            if (z) {
                f2 = 1.0f;
            }
            float f4 = f2;
            if (z) {
                horizontalScrollView.setVisibility(0);
            }
            ViewPropertyAnimator listener = horizontalScrollView.animate().alpha(f4).translationY(f3).setDuration(200L).setListener(new vn9(horizontalScrollView, f4, f3, z, raVar));
            this.T0 = listener;
            listener.start();
        }
    }

    public final void F0(xmg0 xmg0Var) {
        if (U()) {
            return;
        }
        if (xmg0Var.equals(xmg0.a.a)) {
            AppCompatImageView appCompatImageView = this.n0;
            if (appCompatImageView != null) {
                appCompatImageView.setScaleX(-1.0f);
            }
            ViewGroup viewGroup = this.m0;
            if (viewGroup != null) {
                viewGroup.setRotation(-90.0f);
            }
            FrameLayout frameLayout = this.l0;
            if (frameLayout != null) {
                d3m.c(frameLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new sn9(this, R.anim.rotate_to_left_endless), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (!xmg0Var.equals(xmg0.c.a)) {
            if (!xmg0Var.equals(xmg0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AppCompatImageView appCompatImageView2 = this.n0;
            if (appCompatImageView2 != null) {
                appCompatImageView2.clearAnimation();
            }
            FrameLayout frameLayout2 = this.l0;
            if (frameLayout2 != null) {
                d3m.e(frameLayout2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView3 = this.n0;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setScaleX(1.0f);
        }
        ViewGroup viewGroup2 = this.m0;
        if (viewGroup2 != null) {
            viewGroup2.setRotation(90.0f);
        }
        FrameLayout frameLayout3 = this.l0;
        if (frameLayout3 != null) {
            d3m.c(frameLayout3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new sn9(this, R.anim.rotate_to_right_endless), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final float G(iz8 iz8Var) {
        if (!iz8Var.f()) {
            return iz8Var.c();
        }
        float a2 = iz8Var.a();
        float f2 = this.A;
        return a2 > f2 ? iz8Var.a() - f2 : iz8Var.a();
    }

    public final void G0() {
        if (U()) {
            return;
        }
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Activity h2 = e3m.h(context);
        if (h2 != null) {
            getOrientationLocker().b(h2);
        }
    }

    public final boolean H(StoryCameraMode storyCameraMode) {
        boolean z = storyCameraMode == StoryCameraMode.STORY || storyCameraMode == StoryCameraMode.QR_SCANNER;
        bm9 presenter = getPresenter();
        return z && (presenter != null && !presenter.M3());
    }

    public final void H0(boolean z, boolean z2) {
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setForeground(dhr0.t.a(R.drawable.bg_btn_white_selector));
        }
        if (z || z2) {
            ImageView imageView2 = this.U;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.vk_icon_cancel_outline_shadow_large_48_close);
            }
            ImageView imageView3 = this.T;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            setLeftButtonContentDescription(R.string.accessibility_close);
            return;
        }
        ImageView imageView4 = this.T;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        ImageView imageView5 = this.T;
        if (imageView5 != null) {
            imageView5.setImageResource(R.drawable.vk_icon_settings_outline_shadow_large_48);
        }
        ImageView imageView6 = this.U;
        if (imageView6 != null) {
            imageView6.setImageResource(R.drawable.vk_icon_cancel_outline_shadow_large_48_close);
        }
        setRightButtonContentDescription(R.string.story_accessibility_settings);
        setLeftButtonContentDescription(R.string.accessibility_close);
        this.B.getState().r(false);
    }

    @Override // xsna.d0m0
    public final void Hj() {
        w1q0 w1q0Var;
        StoryCameraParams cameraParams = getCameraParams();
        if ((cameraParams == null || !cameraParams.Mb()) && (w1q0Var = this.Y0) != null) {
            w1q0Var.l();
        }
    }

    public final void I() {
        an9 state;
        bm9 presenter = getPresenter();
        if (presenter != null && (state = presenter.getState()) != null && state.g()) {
            bm9 presenter2 = getPresenter();
            if (presenter2 != null) {
                presenter2.u3();
            }
            N();
        }
        uud uudVar = this.c0;
        if (uudVar != null) {
            uudVar.a();
        }
    }

    public final void I0(long j2) {
        VideoRecordingTimerView videoRecordingTimerView = this.g0;
        if (videoRecordingTimerView != null) {
            videoRecordingTimerView.e(j2);
        }
    }

    public final void J() {
        this.b1.removeCallbacksAndMessages(null);
        MasksWrap masksWrap = this.b0;
        if (masksWrap != null) {
            masksWrap.n();
        }
        this.b0 = null;
        gm9 gm9Var = this.B;
        gm9Var.getState().o(false);
        gm9Var.d();
        C0();
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.setOnDoubleClickListener(null);
            camera1View.setTrySingleTapCallback(null);
            camera1View.setOnCameraResultListener(null);
            camera1View.setRecordingCallback(null);
            removeView(camera1View);
        }
        setCamera1View(null);
        this.y0.removeAllViews();
        FrameLayout editorContainer = getEditorContainer();
        if (editorContainer != null) {
            editorContainer.removeAllViews();
        }
        w1q0 w1q0Var = this.Y0;
        if (w1q0Var != null) {
            w1q0Var.l();
            TabsRecycler tabs = getTabs();
            if (tabs != null) {
                tabs.removeOnScrollListener(w1q0Var);
            }
        }
        this.Y0 = null;
    }

    public final void J0(View view) {
        if (e3m.h(view.getContext()) == null || !view.equals(this.z0)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        iz8 Q = Q(false);
        marginLayoutParams.topMargin = Q.f() ? Math.max((int) Q.d(), 0) : Math.max((int) Q.c(), 0);
    }

    public final void M(boolean z) {
        O(0, null, z);
    }

    public final void N() {
        an9 state;
        bm9 presenter = getPresenter();
        if (presenter != null && (state = presenter.getState()) != null) {
            state.k(false);
        }
        l0();
        VkScreenSpinner vkScreenSpinner = this.D0;
        if (vkScreenSpinner != null) {
            vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Done);
        }
        VkScreenSpinner vkScreenSpinner2 = this.D0;
        if (vkScreenSpinner2 != null) {
            vkScreenSpinner2.setVisibility(8);
        }
        this.B.d();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xsna.g0m0] */
    public final void O(int i2, Intent intent, boolean z) {
        String Pb;
        if (this.M != null || getCamera1View() == null) {
            StoryCameraParams cameraParams = getCameraParams();
            if (cameraParams != null && (Pb = cameraParams.Pb()) != null) {
                Intent putExtra = (intent == null ? new Intent() : intent).putExtra(CommonUrlParts.REQUEST_ID, Pb);
                if (putExtra != null) {
                    intent = putExtra;
                }
            }
            eqo<DynamicMasksUseCase> eqoVar = this.C;
            if (eqoVar != null) {
                eqoVar.a();
            }
            eqo<rpo> eqoVar2 = this.D;
            if (eqoVar2 != null) {
                eqoVar2.a();
            }
            io.reactivex.rxjava3.disposables.c cVar = this.M;
            if (cVar != null) {
                cVar.dispose();
            }
            this.M = null;
            t();
            ?? r0 = this.w;
            r0.ad(i2, intent);
            r0.o5(z);
        }
    }

    public final void P(StoryCameraMode storyCameraMode) {
        int indexOf = this.B.m().indexOf(storyCameraMode);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            bm9 presenter = getPresenter();
            if (presenter != null) {
                presenter.F3(intValue);
            }
            TabsRecycler tabs = getTabs();
            if (tabs != null) {
                tabs.d(intValue, false);
            }
        }
    }

    public final iz8 Q(boolean z) {
        boolean s = iah0.s(getContext());
        iz8[] iz8VarArr = this.U0;
        if (z) {
            iz8VarArr[s ? 1 : 0] = null;
        }
        iz8 iz8Var = iz8VarArr[s ? 1 : 0];
        if (iz8Var != null) {
            return iz8Var;
        }
        kz8 c2 = getDeps().c();
        boolean a2 = getDeps().c().a(getContext());
        CadreTarget cadreTarget = CadreTarget.VIEWFINDER;
        StoryCameraParams cameraParams = getCameraParams();
        boolean z2 = false;
        if (cameraParams != null && cameraParams.Sb()) {
            z2 = true;
        }
        iz8 d2 = c2.d(this, a2, cadreTarget, z2);
        iz8VarArr[s ? 1 : 0] = d2;
        return d2;
    }

    @Override // xsna.cm9
    public final void Qh() {
        an9 state;
        bm9 presenter = getPresenter();
        if (presenter == null || (state = presenter.getState()) == null || !state.g()) {
            return;
        }
        VkScreenSpinner vkScreenSpinner = this.D0;
        if (vkScreenSpinner != null) {
            vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Done);
        }
        VkScreenSpinner vkScreenSpinner2 = this.D0;
        if (vkScreenSpinner2 != null) {
            vkScreenSpinner2.setOnCancelListener(null);
        }
        postDelayed(new kl2(this, 1), 1000L);
    }

    public final void R() {
        this.B.V();
    }

    public final void S() {
        this.b1.post(new sm9(this, 1));
    }

    public final boolean U() {
        return getRecordingType() == RecorderBase.RecordingType.LIVE && fxc0.B().i().d();
    }

    public final boolean W() {
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            return shutter.H.u0;
        }
        return false;
    }

    public final void X() {
        if (U()) {
            return;
        }
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Activity h2 = e3m.h(context);
        if (h2 != null) {
            getOrientationLocker().a(h2);
        }
    }

    public final void Y() {
        if (this.Z0) {
            return;
        }
        ((xkg) getDeps().k()).getClass();
        if (xkg.b.f()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            this.Z0 = true;
            com.vk.ml.b bVar = MLFeatures.a;
            int i2 = 4;
            if (MLFeatures.d()) {
                asu0.a.getClass();
                asu0.h().submit(new t12(this, i2));
            }
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            asu0.a.getClass();
            this.a1 = new i0(fVar.a0(asu0.i()), new com.vk.movika.sdk.android.defaultplayer.view.a(10)).U(new do3(this, i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new x(new d40(5), 7), new xz(new b(L.a), 9));
        }
    }

    public final void Z(boolean z) {
        f2y0 write;
        eqo<DynamicMasksUseCase> eqoVar = this.C;
        if (eqoVar != null && eqoVar.b()) {
            z = false;
        }
        pe8 f2 = this.B.f();
        if (f2 != null && (write = f2.getWrite()) != null) {
            write.setMaskButtonState(z);
        }
        bm9 presenter = getPresenter();
        int i2 = (presenter != null ? presenter.c4() : null) == StoryCameraMode.CLIPS ? R.drawable.vk_icon_hat_outline_shadow_large_48 : z ? R.drawable.vk_icon_masks_shadow_large_48 : R.drawable.vk_icon_masks_off_outline_shadow_large_48;
        ImageView imageView = this.a0;
        if (imageView != null) {
            imageView.setImageResource(i2);
        }
    }

    @Override // xsna.n96, xsna.d0m0
    public final boolean a0() {
        FragmentManager supportFragmentManager;
        Activity h2 = e3m.h(getContext());
        FragmentActivity fragmentActivity = h2 instanceof FragmentActivity ? (FragmentActivity) h2 : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || supportFragmentManager.K() <= 0) {
            this.H.a();
            return super.a0();
        }
        supportFragmentManager.W();
        return true;
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void b(int i2, boolean z) {
        an9 state;
        eqo<kqo> eqoVar;
        am9 K3;
        am9.a a2;
        StoryCameraMode storyCameraMode;
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setCanceledTouch(false);
        }
        bm9 presenter = getPresenter();
        if (presenter != null) {
            presenter.j4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, -1);
        }
        this.B.a();
        bm9 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.L3(z);
        }
        l0();
        ShutterButton shutter2 = getShutter();
        if (shutter2 != null) {
            shutter2.b(p(i2), z);
        }
        bm9 presenter3 = getPresenter();
        if (presenter3 != null && (K3 = presenter3.K3()) != null && (a2 = K3.a()) != null) {
            bm9 presenter4 = getPresenter();
            if (presenter4 == null || (storyCameraMode = presenter4.I3(i2)) == null) {
                storyCameraMode = StoryCameraMode.STORY;
            }
            a2.b(of9.a(storyCameraMode));
        }
        bm9 presenter5 = getPresenter();
        if (presenter5 != null) {
            presenter5.n3();
        }
        bm9 presenter6 = getPresenter();
        if (presenter6 == null || !presenter6.f4()) {
            MasksWrap masksWrap = this.b0;
            if (masksWrap != null) {
                masksWrap.q(false);
            }
            MasksWrap masksWrap2 = this.b0;
            if (masksWrap2 != null) {
                masksWrap2.setSelectedMask(null);
            }
            MasksWrap masksWrap3 = this.b0;
            if (masksWrap3 != null) {
                masksWrap3.u();
            }
            bm9 presenter7 = getPresenter();
            if (presenter7 != null) {
                presenter7.A();
            }
        }
        bm9 presenter8 = getPresenter();
        if (presenter8 != null) {
            Z(presenter8.getState().f());
        }
        bm9 presenter9 = getPresenter();
        if (presenter9 != null) {
            StoryCameraMode I3 = presenter9.I3(i2);
            if (I3 == StoryCameraMode.LIVE) {
                presenter9.q4();
                q();
                if (ni9.b() && (eqoVar = this.E) != null) {
                    eqoVar.d(kqo.b.b);
                }
            }
            if (I3 == StoryCameraMode.QR_SCANNER) {
                presenter9.s3();
                zd9 camera1View = getCamera1View();
                if (camera1View != null) {
                    awt0.t(camera1View, new h6(this, 12));
                }
            }
            if (I3 != StoryCameraMode.CLIPS) {
                ClipsControlsView clipsControls = getClipsControls();
                if (clipsControls != null) {
                    lmv.J2(clipsControls, null, 6);
                }
                this.H.a();
            }
            presenter9.a4(I3);
            zd9 camera1View2 = getCamera1View();
            if (camera1View2 != null) {
                camera1View2.setMLDetectorEnabled(H(I3));
            }
        }
        bm9 presenter10 = getPresenter();
        if (presenter10 == null || (state = presenter10.getState()) == null || !state.a()) {
            return;
        }
        d0();
        requestFocus();
    }

    public final void b0(Uri uri) {
        if (this.r1) {
            VkPicture photosButtonThumbBottom = getPhotosButtonThumbBottom();
            if (photosButtonThumbBottom != null) {
                photosButtonThumbBottom.setVisibility(0);
            }
            View photosButtonRollBottom = getPhotosButtonRollBottom();
            if (photosButtonRollBottom != null) {
                photosButtonRollBottom.setBackgroundResource(R.drawable.ic_camera_roll);
            }
        }
        VkPicture photosButtonThumbBottom2 = getPhotosButtonThumbBottom();
        if (photosButtonThumbBottom2 != null) {
            photosButtonThumbBottom2.m0(uri, new Size(cn70.b(28), cn70.b(28)));
        }
        VkPicture photosButtonThumbTop = getPhotosButtonThumbTop();
        if (photosButtonThumbTop != null) {
            photosButtonThumbTop.setVisibility(0);
        }
        VkPicture photosButtonThumbTop2 = getPhotosButtonThumbTop();
        if (photosButtonThumbTop2 != null) {
            photosButtonThumbTop2.m0(uri, new Size(cn70.b(24), cn70.b(24)));
        }
    }

    @Override // xsna.cm9
    public final void bf() {
        if (this.s1) {
            this.s1 = false;
            setLoadingProgress(1.0f);
            setGalleryAvailable(true);
            bm9 presenter = getPresenter();
            if ((presenter != null ? presenter.getCurrentState() : null) == StoryCameraMode.CLIPS) {
                E();
            }
        }
    }

    public final void c0(List<? extends StoryCameraMode> list, StoryCameraMode storyCameraMode, an9 an9Var) {
        gm9 gm9Var = this.B;
        gm9Var.m().clear();
        gm9Var.m().addAll(list);
        gm9Var.Z(an9Var);
        getShutterStatesMap().clear();
        getShutterItems().clear();
        getShutterItems().addAll(getPresenter().p3(getShutterStatesMap()));
        an9Var.n(list.indexOf(storyCameraMode));
        if (an9Var.d() < 0) {
            an9Var.n(0);
        }
        if (!this.V0) {
            this.V0 = true;
            awt0.t(this, new zy(this, 15));
        }
        getDeps().h().b().c(HintId.INFO_CLIPS_CAMERA_MODE.getId(), this.u1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (xsna.nr2.C(r8) == true) goto L49;
     */
    @Override // android.view.ViewGroup, android.view.View, xsna.d0m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        bm9 presenter = getPresenter();
        if (presenter == null || !presenter.o3()) {
            bm9 presenter2 = getPresenter();
            if (presenter2 != null) {
                an9 state = presenter2.getState();
                if (state != null) {
                    if (state.a()) {
                    }
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyCode == 24 || keyCode == 25) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    this.P = false;
                    io.reactivex.rxjava3.disposables.c cVar = this.N;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    if (SystemClock.elapsedRealtime() - this.Q < 200) {
                        ShutterButton shutter = getShutter();
                        a(shutter != null ? shutter.getPosCur() : -1);
                        return true;
                    }
                    ShutterButton shutter2 = getShutter();
                    d(shutter2 != null ? shutter2.getPosCur() : -1);
                    return true;
                }
            } else if (!this.P) {
                this.Q = SystemClock.elapsedRealtime();
                this.P = true;
                bm9 presenter3 = getPresenter();
                if (presenter3 != null && presenter3.e4()) {
                    io.reactivex.rxjava3.disposables.c cVar2 = this.N;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.N = q.B0(200L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j22(new pd(this, 15), 9));
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AppCompatEditText appCompatEditText = this.w0;
        if (appCompatEditText == null || !appCompatEditText.hasFocus()) {
            if (motionEvent.getAction() == 1) {
                uud uudVar = this.c0;
                this.H.c(uudVar != null ? uudVar.b() : null, getShutter());
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        AppCompatEditText appCompatEditText2 = this.w0;
        if (appCompatEditText2 != null) {
            appCompatEditText2.clearFocus();
        }
        mhy.b(getContext());
        requestFocus();
        return true;
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void e(float f2, int i2, int i3) {
        bm9 presenter = getPresenter();
        if (presenter != null) {
            presenter.D3(i2);
        }
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setCanceledTouch(true);
        }
        bm9 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.j4(f2, i2, i3);
        }
        this.B.a();
        l0();
        ShutterButton shutter2 = getShutter();
        if (shutter2 != null) {
            shutter2.e(f2, p(i2), p(i3));
        }
        AppCompatEditText appCompatEditText = this.w0;
        if (appCompatEditText == null || !appCompatEditText.hasFocus()) {
            return;
        }
        mhy.b(getContext());
        requestFocus();
    }

    @Override // xsna.cm9
    public final void ff(boolean z, lno lnoVar, StoryMusicInfo storyMusicInfo) {
        an9 state;
        an9 state2;
        DuetAction a2;
        an9 state3;
        gm9 gm9Var = this.B;
        if (z) {
            uud uudVar = this.c0;
            gm9Var.X(uudVar != null ? uudVar.b() : null);
            gm9Var.b();
            bm9 presenter = getPresenter();
            if (presenter != null && (state3 = presenter.getState()) != null) {
                state3.p(true);
            }
            bm9 presenter2 = getPresenter();
            if (presenter2 != null) {
                uud uudVar2 = this.c0;
                if (uudVar2 == null || (a2 = uudVar2.c()) == null) {
                    StoryCameraParams cameraParams = getCameraParams();
                    a2 = v7m0.a(cameraParams != null ? cameraParams.Kb() : null);
                    if (a2 == null) {
                        a2 = DuetAction.BLUR;
                    }
                }
                presenter2.w4(lnoVar, a2);
            }
            if (storyMusicInfo != null) {
                bm9 presenter3 = getPresenter();
                if (presenter3 != null) {
                    presenter3.x4(storyMusicInfo);
                }
                ClipsControlsView clipsControls = getClipsControls();
                if (clipsControls != null) {
                    clipsControls.q0(false, false);
                }
            }
            if (!ni9.a()) {
                ClipsControlsView clipsControls2 = getClipsControls();
                if (clipsControls2 != null) {
                    clipsControls2.setSpeedButtonEnabled(false);
                }
                ClipsControlsView clipsControls3 = getClipsControls();
                if (clipsControls3 != null) {
                    clipsControls3.setClipsSpeedbtnAttributes(1.0f);
                }
                bm9 presenter4 = getPresenter();
                if (presenter4 != null) {
                    presenter4.c(1.0f);
                }
            }
            MasksWrap masksWrap = this.b0;
            if (masksWrap != null) {
                masksWrap.setLoadCommonMasks(false);
                masksWrap.D(false, true);
            }
            gm9Var.d();
            bm9 presenter5 = getPresenter();
            if (presenter5 != null && presenter5.Q3()) {
                uud uudVar3 = this.c0;
                this.H.c(uudVar3 != null ? uudVar3.b() : null, getShutter());
            }
        } else {
            bm9 presenter6 = getPresenter();
            Boolean valueOf = (presenter6 == null || (state2 = presenter6.getState()) == null) ? null : Boolean.valueOf(state2.e());
            bm9 presenter7 = getPresenter();
            if (presenter7 != null && (state = presenter7.getState()) != null) {
                state.p(false);
            }
            StoryCameraParams cameraParams2 = getCameraParams();
            if (cameraParams2 != null) {
                cameraParams2.Xb();
            }
            bm9 presenter8 = getPresenter();
            if (presenter8 != null) {
                presenter8.y3(DuetAction.CANCEL);
            }
            if (epx.f(valueOf, Boolean.TRUE)) {
                bm9 presenter9 = getPresenter();
                if (presenter9 != null) {
                    presenter9.x4(null);
                }
                bm9 presenter10 = getPresenter();
                if (presenter10 != null) {
                    presenter10.clearSavedStorage();
                }
                ClipsControlsView clipsControls4 = getClipsControls();
                if (clipsControls4 != null) {
                    clipsControls4.q0(true, false);
                }
                ClipsControlsView clipsControls5 = getClipsControls();
                if (clipsControls5 != null) {
                    clipsControls5.setSpeedButtonEnabled(true);
                }
                ClipsControlsView clipsControls6 = getClipsControls();
                if (clipsControls6 != null) {
                    clipsControls6.Y0(true, false);
                }
            }
            MasksWrap masksWrap2 = this.b0;
            if (masksWrap2 != null) {
                masksWrap2.setLoadCommonMasks(true);
                masksWrap2.D(false, true);
            }
            this.b1.post(new p69(this, 1));
            gm9Var.d();
        }
        ClipsControlsView clipsControls7 = getClipsControls();
        if (clipsControls7 != null) {
            clipsControls7.setTimerButtonEnabled(true);
        }
    }

    @Override // xsna.n96
    public pe8 getBroadcast() {
        return this.k1;
    }

    @Override // xsna.n96, xsna.cm9
    public cg8 getBroadcastFriends() {
        return this.m1;
    }

    @Override // xsna.n96
    public izs<ArrayList<ParsedResult>, s3q0> getCustomQrListener() {
        return this.n1;
    }

    @Override // xsna.n96, xsna.cm9
    public boolean getGesturedControl() {
        ClipsControlsView clipsControls = getClipsControls();
        return clipsControls != null && clipsControls.getGesturedControl();
    }

    @Override // xsna.n96, xsna.cm9
    public boolean getIsFullHdCamera() {
        zd9 camera1View = getCamera1View();
        return camera1View != null && camera1View.n();
    }

    @Override // xsna.n96
    public String getLiveAuthorPhoto() {
        return this.q1;
    }

    @Override // xsna.n96, xsna.cm9
    public String getLiveNameText() {
        AppCompatEditText appCompatEditText = this.w0;
        return String.valueOf(appCompatEditText != null ? appCompatEditText.getText() : null);
    }

    @Override // xsna.n96
    public boolean getLiveNameTextEditable() {
        return this.p1;
    }

    @Override // xsna.n96
    public float getLoadingProgress() {
        ShutterButton shutter = getShutter();
        return shutter != null ? shutter.getLoadingProgress() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.n96, xsna.cm9
    public rg10 getMaskCallback() {
        return this.b0;
    }

    @Override // xsna.n96, xsna.cm9
    public fm9 getPositions() {
        return this.o1;
    }

    @Override // xsna.n96, xsna.cm9
    public Integer getQrModeIndex() {
        QrScannerUi qrScannerUi = this.Q0;
        if (qrScannerUi != null) {
            return Integer.valueOf(qrScannerUi.a());
        }
        return null;
    }

    @Override // xsna.n96, xsna.cm9
    public float getSceneHeight() {
        return iah0.f().widthPixels / 0.5625f;
    }

    @Override // xsna.n96, xsna.cm9
    public float getSceneWidth() {
        return iah0.f().widthPixels;
    }

    @Override // xsna.n96, xsna.cm9
    public Mask getSelectedMask() {
        MasksWrap masksWrap = this.b0;
        if (masksWrap != null) {
            return masksWrap.getSelectedMask();
        }
        return null;
    }

    public final void j0(boolean z, boolean z2) {
        an9 state;
        MasksWrap masksWrap = this.b0;
        if (masksWrap != null) {
            bm9 presenter = getPresenter();
            if (presenter != null && (state = presenter.getState()) != null && !state.e()) {
                masksWrap.setLoadCommonMasks(true);
            }
            masksWrap.setLoadOkMasks(z);
            masksWrap.D(z, z2);
        }
    }

    public final void k0() {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        ArrayList arrayList = clipsProgressView.o;
        if (arrayList.isEmpty()) {
            return;
        }
        clipsProgressView.p -= ((Number) j5g.i0(arrayList)).floatValue();
        arrayList.remove(e43.h(arrayList));
        clipsProgressView.invalidate();
    }

    public final void l0() {
        an9 state;
        if (this.s1) {
            bm9 presenter = getPresenter();
            if ((presenter != null ? presenter.getCurrentState() : null) == StoryCameraMode.CLIPS) {
                setGalleryAvailable(false);
                setLoadingVisible(true);
                return;
            }
        }
        bm9 presenter2 = getPresenter();
        if (presenter2 != null && (state = presenter2.getState()) != null && state.g()) {
            bm9 presenter3 = getPresenter();
            if ((presenter3 != null ? presenter3.getCurrentState() : null) == StoryCameraMode.CLIPS) {
                setGalleryAvailable(false);
                return;
            }
        }
        setGalleryAvailable(true);
        if (W()) {
            setLoadingVisible(false);
            E();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.Qb() == true) goto L13;
     */
    @Override // xsna.n96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        Window window;
        boolean z = (iah0.n((Activity) getContext()) || oen.a() || (r0 = getCameraParams()) == null) ? false : true;
        if ((getContext() instanceof Activity) && z && (window = ((Activity) getContext()).getWindow()) != null) {
            window.addFlags(1024);
        }
    }

    public final void n0(File file, long j2) {
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.K(file, j2);
        }
    }

    public final void o0(float f2, int i2) {
        LinearLayout linearLayout = this.S0;
        if (linearLayout == null || i2 < 0 || i2 >= linearLayout.getChildCount()) {
            return;
        }
        ((lk9) linearLayout.getChildAt(i2)).setProgress(f2);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        bm9 presenter;
        awt0.t(this, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 15));
        Integer valueOf = configuration != null ? Integer.valueOf(configuration.orientation) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            bm9 presenter2 = getPresenter();
            if (presenter2 != null) {
                presenter2.N3(true);
            }
        } else if (valueOf != null && valueOf.intValue() == 1 && (presenter = getPresenter()) != null) {
            presenter.N3(false);
        }
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.D();
        }
    }

    @Override // xsna.n96, xsna.d0m0
    public final void onDestroy() {
        TabsRecycler.e eVar;
        super.onDestroy();
        eqo<DynamicMasksUseCase> eqoVar = this.C;
        if (eqoVar != null) {
            eqoVar.a();
        }
        eqo<rpo> eqoVar2 = this.D;
        if (eqoVar2 != null) {
            eqoVar2.a();
        }
        getDeps().h().b().i(HintId.INFO_CLIPS_CAMERA_MODE.getId(), this.u1);
        StickersDrawingViewGroup stickersDrawingViewGroup = getStickersDrawingViewGroup();
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.q();
        }
        TabsRecycler tabs = getTabs();
        if (tabs != null && (eVar = tabs.m) != null) {
            tabs.getViewTreeObserver().removeOnGlobalLayoutListener(eVar);
        }
        MasksWrap masksWrap = this.b0;
        if (masksWrap != null) {
            masksWrap.n();
        }
        J();
        this.b0 = null;
        this.y0.removeAllViews();
        FrameLayout editorContainer = getEditorContainer();
        if (editorContainer != null) {
            editorContainer.removeAllViews();
        }
        Iterator<ViewTreeObserver.OnGlobalLayoutListener> it = getLayoutObservers().iterator();
        while (it.hasNext()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(it.next());
        }
        getLayoutObservers().clear();
        this.H.a();
        io.reactivex.rxjava3.disposables.c cVar = this.a1;
        if (cVar != null) {
            cVar.dispose();
        }
        this.a1 = null;
    }

    @Override // xsna.n96, xsna.d0m0
    public final void onResume() {
        super.onResume();
        p0();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        p0();
    }

    public final void p0() {
        int d2;
        float a2;
        if (getCamera1View() == null) {
            return;
        }
        zd9 camera1View = getCamera1View();
        ViewGroup.LayoutParams layoutParams = camera1View != null ? camera1View.getLayoutParams() : null;
        iz8 Q = Q(true);
        int G = (int) G(Q);
        this.t0 = G;
        if (Q.f()) {
            if (layoutParams != null) {
                layoutParams.width = Q.e();
            }
            bm9 presenter = getPresenter();
            if (presenter == null || !presenter.M3()) {
                if (layoutParams != null) {
                    layoutParams.height = Q.b();
                }
            } else if (layoutParams != null) {
                layoutParams.height = -1;
            }
            int d3 = (int) Q.d();
            float c2 = Q.c();
            zd9 camera1View2 = getCamera1View();
            if (camera1View2 != null) {
                camera1View2.setTranslationY(d3);
            }
            zd9 camera1View3 = getCamera1View();
            if (camera1View3 != null) {
                camera1View3.setTranslationX(c2);
            }
            StickersDrawingViewGroup stickersDrawingViewGroup = getStickersDrawingViewGroup();
            if (stickersDrawingViewGroup != null) {
                f4m.u(stickersDrawingViewGroup, 0, d3, 0, G);
            }
            View view = this.j0;
            if (view != null) {
                f4m.u(view, 0, d3, 0, G);
            }
        } else {
            if (layoutParams != null) {
                layoutParams.width = Q.b();
            }
            if (layoutParams != null) {
                layoutParams.height = Q.e();
            }
            int c3 = (int) Q.c();
            if (this.i1 == -90.0f) {
                d2 = (int) Q.a();
                a2 = Q.d();
            } else {
                d2 = (int) Q.d();
                a2 = Q.a();
            }
            int i2 = (int) a2;
            zd9 camera1View4 = getCamera1View();
            if (camera1View4 != null) {
                camera1View4.setTranslationX(d2);
            }
            zd9 camera1View5 = getCamera1View();
            if (camera1View5 != null) {
                camera1View5.setTranslationY(c3);
            }
            StickersDrawingViewGroup stickersDrawingViewGroup2 = getStickersDrawingViewGroup();
            if (stickersDrawingViewGroup2 != null) {
                f4m.u(stickersDrawingViewGroup2, d2, c3, i2, c3);
            }
            View view2 = this.j0;
            if (view2 != null) {
                f4m.u(view2, d2, c3, i2, c3);
            }
        }
        f4m.q(G, this.z0);
        zd9 camera1View6 = getCamera1View();
        if (camera1View6 != null) {
            camera1View6.setLayoutParams(layoutParams);
        }
        zd9 camera1View7 = getCamera1View();
        if (camera1View7 != null) {
            camera1View7.setOutlineProvider(getDeps().c().c(Q));
        }
        zd9 camera1View8 = getCamera1View();
        if (camera1View8 != null) {
            camera1View8.setClipToOutline(true);
        }
        coz.a(getCamera1View(), this.k0);
        D(Q);
        gm9 gm9Var = this.B;
        gm9Var.V();
        gm9Var.b();
        gm9Var.a();
        gm9Var.d();
        awt0.t(this, new dn9(this, 0));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xsna.g0m0] */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void q0() {
        bm9 presenter;
        boolean z = true;
        LayoutInflater.from(getContext()).inflate(R.layout.create_camera_camera_view, (ViewGroup) this.y0, true);
        QrScannerUi qrScannerUi = new QrScannerUi(this, getPresenter(), this.w, new fy2(this), getDeps());
        this.Q0 = qrScannerUi;
        StoryCameraParams cameraParams = getCameraParams();
        qrScannerUi.e(false, cameraParams != null ? cameraParams.Nb() : null);
        getClickLock().a();
        getShutterLock().a();
        setEditorContainer((FrameLayout) findViewById(R.id.editor_container));
        this.A0 = (FrameLayout) findViewById(R.id.live_container);
        MasksWrap masksWrap = (MasksWrap) findViewById(R.id.masks_wrap);
        this.B.Y(masksWrap);
        masksWrap.setUsersBridge(getDeps().p());
        masksWrap.setLinksBridge(getDeps().i());
        int a2 = e3m.a(R.dimen.camera_masks_view_height_new, getContext());
        masksWrap.setMasksView((MasksView) findViewById(R.id.masks_wrap_masks_view));
        masksWrap.getMasksView().getLayoutParams().height = a2;
        masksWrap.getMasksView().setHeadersToIgnoreDeleteButtons(true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.masks_wrap_spheres_view);
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        recyclerView.setOutlineProvider(viewOutlineProvider);
        recyclerView.setClipToOutline(true);
        recyclerView.addItemDecoration(new a(y8g0.a(R.dimen.effect_list_item_margin_dp)));
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        masksWrap.setGroupedEffectView(recyclerView);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.camera_clips_gallery_photos_list);
        View findViewById = findViewById(R.id.camera_clips_gallery_photos_list_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.add_media_button_frame);
        masksWrap.setClipsGalleryListContainer(findViewById);
        masksWrap.setClipsGalleryListWrapper(new o9e(recyclerView2, findViewById, frameLayout, getDeps()));
        masksWrap.setClipsGalleryListContainerBG(findViewById(R.id.camera_clips_gallery_photos_container_bg));
        findViewById(R.id.add_media_button).setOnClickListener(new fn9(0, masksWrap, this));
        bwt0.o(this, new com.vk.catalog2.common.ui.holders.b(4, this, masksWrap));
        this.b0 = masksWrap;
        if (getPositions().x().Cb() != null) {
            StoryCameraParams cameraParams2 = getCameraParams();
            uud uudVar = new uud(getContext(), new e(), v7m0.a(cameraParams2 != null ? cameraParams2.Kb() : null));
            uudVar.b().setOutlineProvider(viewOutlineProvider);
            uudVar.b().setClipToOutline(true);
            f4m.j(uudVar.b());
            addView(uudVar.b());
            bwt0.o(this, new com.vk.voip.a(6, this, uudVar));
            this.c0 = uudVar;
        }
        StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) findViewById(R.id.story_camera_stickers_view_group);
        ViewGroup.LayoutParams layoutParams = stickersDrawingViewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSceneWidth();
            layoutParams.height = (int) getSceneHeight();
        }
        stickersDrawingViewGroup.setSupportViewOffset(false);
        stickersDrawingViewGroup.setVideoStickersMute(true);
        stickersDrawingViewGroup.setTouchFalseIfNoSticker(true);
        setStickersDrawingViewGroup(stickersDrawingViewGroup);
        CameraGridView cameraGridView = (CameraGridView) findViewById(R.id.story_camera_grid_view);
        bwt0.o(this, new wx0(2, this, cameraGridView));
        this.r0 = cameraGridView;
        this.j0 = findViewById(R.id.live_header);
        this.k0 = findViewById(R.id.before_live_overlay);
        this.w0 = (AppCompatEditText) findViewById(R.id.live_name);
        this.h0 = (VkAvatar) findViewById(R.id.live_author_photo);
        this.i0 = findViewById(R.id.live_author_arrow);
        this.p0 = findViewById(R.id.broadcast_friends_view);
        this.q0 = findViewById(R.id.divider);
        ImageView imageView = (ImageView) findViewById(R.id.top_left_button);
        f4m.t(e3m.a(R.dimen.camera_top_buttons_top_margin, getContext()), imageView);
        this.U = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.top_right_button);
        f4m.t(e3m.a(R.dimen.camera_top_buttons_top_margin, getContext()), imageView2);
        this.T = imageView2;
        this.u0 = findViewById(R.id.vmoji_capture_shadow);
        this.l0 = (FrameLayout) findViewById(R.id.create_camera_rotation_tip_main_container);
        this.m0 = (ViewGroup) findViewById(R.id.create_camera_rotation_tip_inner_container);
        awt0.t(this, new hn9(0, this, (TextView) findViewById(R.id.create_camera_rotation_tip_subtitle)));
        this.n0 = (AppCompatImageView) findViewById(R.id.create_camera_rotation_tip_image);
        this.o0 = (AppCompatTextView) findViewById(R.id.create_camera_rotation_tip_bottom);
        bm9 presenter2 = getPresenter();
        boolean M3 = presenter2 != null ? presenter2.M3() : false;
        bm9 presenter3 = getPresenter();
        boolean v3 = presenter3 != null ? presenter3.v3() : false;
        if (!M3 && !v3) {
            MasksWrap masksWrap2 = this.b0;
            if (masksWrap2 != null) {
                bm9 presenter4 = getPresenter();
                masksWrap2.setCameraTracker(presenter4 != null ? presenter4.K3() : null);
            }
            KeyEvent.Callback findViewById2 = findViewById(R.id.broadcast_friends_view);
            BroadcastFriendsView broadcastFriendsView = (BroadcastFriendsView) findViewById2;
            getDeps();
            broadcastFriendsView.setPresenter((bg8) new dg8(broadcastFriendsView));
            setBroadcastFriends((cg8) findViewById2);
            AppCompatEditText appCompatEditText = this.w0;
            if (appCompatEditText != null) {
                appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.in9
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        float f2 = CameraUIView.w1;
                        if (i2 != 6) {
                            return false;
                        }
                        CameraUIView cameraUIView = CameraUIView.this;
                        mhy.b(cameraUIView.getContext());
                        cameraUIView.requestFocus();
                        return true;
                    }
                });
            }
            MasksWrap masksWrap3 = this.b0;
            if (masksWrap3 != null) {
                masksWrap3.setCamera1View(this.t1);
                masksWrap3.setMasksProvider(getPresenter());
                StoryCameraParams cameraParams3 = getCameraParams();
                StoryCameraMode Hb = cameraParams3 != null ? cameraParams3.Hb() : null;
                StoryCameraMode storyCameraMode = StoryCameraMode.CLIPS;
                if (Hb != storyCameraMode) {
                    bm9 presenter5 = getPresenter();
                    if ((presenter5 != null ? presenter5.c4() : null) != storyCameraMode) {
                        z = false;
                    }
                }
                masksWrap3.setLoadOkMasks(z);
                masksWrap3.setMasksAnalytics(new fil());
                masksWrap3.s(MasksController.MasksCatalogType.DEFAULT);
            }
            VkAvatar vkAvatar = this.h0;
            if (vkAvatar != null) {
                bwt0.i0(vkAvatar, new yx0(this, 14));
            }
            View view = this.i0;
            if (view != null) {
                bwt0.i0(view, new d7(this, 12));
            }
        }
        StoryCameraParams cameraParams4 = getCameraParams();
        boolean Bb = cameraParams4 != null ? cameraParams4.Bb() : false;
        StoryCameraParams cameraParams5 = getCameraParams();
        boolean Ub = cameraParams5 != null ? cameraParams5.Ub() : false;
        if (Bb || Ub) {
            View view2 = this.L0;
            (view2 != null ? view2 : null).setVisibility(4);
        }
        this.R0 = (HorizontalScrollView) findViewById(R.id.camera_ui_previews_wrapper);
        this.S0 = (LinearLayout) findViewById(R.id.camera_ui_previews_layout);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.camera_countdown_layout);
        bwt0.o(this, new jl4(2, this, viewGroup));
        this.K0 = viewGroup;
        StopwatchView stopwatchView = (StopwatchView) findViewById(R.id.countdown_stopwatch_view);
        stopwatchView.setTextSizePix(getResources().getDimensionPixelSize(R.dimen.stopwatch_text_size));
        stopwatchView.setTextColor(getContext().getColor(R.color.stopwatch_text_color));
        this.M0 = stopwatchView;
        bwt0.i0((TextView) findViewById(R.id.camera_countdown_cancel_btn), new zx0(this, 13));
        eqo<DynamicMasksUseCase> eqoVar = this.C;
        if (eqoVar != null) {
            eqoVar.e();
        }
        eqo<DynamicMasksUseCase> eqoVar2 = this.C;
        if (eqoVar2 != null && (presenter = getPresenter()) != null) {
            presenter.z4(eqoVar2.b());
        }
        View findViewById3 = findViewById(R.id.current_masks_button);
        this.c1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new be6(this, 1));
        }
        View view3 = this.c1;
        if (view3 != null) {
            awt0.t(view3, new com.vk.movika.sdk.base.logic.interactor.b(this, 11));
        }
        this.d1 = (VKImageView) findViewById(R.id.current_masks_button_avatar);
        this.e1 = (TextView) findViewById(R.id.current_masks_button_info);
        View findViewById4 = findViewById(R.id.current_masks_button_close);
        this.f1 = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new ne3(this, 2));
        }
        o(this.w0, new rj1(this, 11));
    }

    public final void r0() {
        Boolean Jb;
        View w12;
        if (this.I) {
            return;
        }
        int i2 = 1;
        this.I = true;
        LayoutInflater from = LayoutInflater.from(getContext());
        FrameLayout frameLayout = this.z0;
        from.inflate(R.layout.create_camera_stub_view, (ViewGroup) frameLayout, true);
        int i3 = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        View findViewById = findViewById(R.id.camera_tabs_container);
        View findViewById2 = findViewById.findViewById(R.id.camera_tabs_bottom_gradient);
        iz8 Q = Q(false);
        if (Q.a() > this.A) {
            f4m.j(findViewById2);
        } else {
            int G = (int) G(Q);
            bwt0.c0(e3m.a(R.dimen.camera_bottom_buttons_margin_bottom, getContext()) + G, findViewById2);
            f4m.q(-G, findViewById2);
            cxu0 cxu0Var = cxu0.a;
            Context context = getContext();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            cxu0Var.getClass();
            findViewById2.setBackground(cxu0.b(orientation, context));
        }
        this.L0 = findViewById;
        setTabs((TabsRecycler) findViewById.findViewById(R.id.tabs));
        setShutter((ShutterButton) findViewById(R.id.shutter));
        setPhotosButtonBottom(findViewById(R.id.gallery_button_bottom));
        View photosButtonBottom = getPhotosButtonBottom();
        setPhotosButtonThumbBottom(photosButtonBottom != null ? (VkPicture) photosButtonBottom.findViewById(R.id.photos_button_thumb_bottom) : null);
        View photosButtonBottom2 = getPhotosButtonBottom();
        setPhotosButtonRollBottom(photosButtonBottom2 != null ? photosButtonBottom2.findViewById(R.id.photos_button_roll_bottom) : null);
        setPhotosButtonTop(findViewById(R.id.gallery_button_top));
        View photosButtonTop = getPhotosButtonTop();
        setPhotosButtonThumbTop(photosButtonTop != null ? (VkPicture) photosButtonTop.findViewById(R.id.photos_button_thumb_top) : null);
        setFlashButton((ImageView) findViewById(R.id.flash_button));
        setMasksButton(findViewById(R.id.masks_button));
        setSwitchButton((ImageView) findViewById(R.id.switch_button));
        this.S = (ImageView) findViewById(R.id.switch_button_live);
        this.d0 = findViewById(R.id.right_holder);
        this.e0 = findViewById(R.id.left_holder);
        this.T = (ImageView) findViewById(R.id.top_right_button);
        this.U = (ImageView) findViewById(R.id.top_left_button);
        this.a0 = (ImageView) findViewById(R.id.masks_button_image);
        this.V = (TextView) findViewById(R.id.masks_button_new_badge);
        this.W = (ImageView) findViewById(R.id.masks_button_new_badge_dot);
        this.x0 = findViewById(R.id.loader);
        this.f0 = (ImageView) findViewById(R.id.sharing_icon);
        this.g0 = (VideoRecordingTimerView) findViewById(R.id.recording_timer);
        setCollectionButton((AttachWithCounterView) findViewById(R.id.collection_button));
        this.v0 = findViewById(R.id.vmoji_capture_tip);
        this.F0 = (VkContentBadge) findViewById(R.id.duration_switch);
        StoryCameraParams cameraParams = getCameraParams();
        final boolean Bb = cameraParams != null ? cameraParams.Bb() : false;
        StoryCameraParams cameraParams2 = getCameraParams();
        boolean Ub = cameraParams2 != null ? cameraParams2.Ub() : false;
        StoryCameraParams cameraParams3 = getCameraParams();
        final boolean Wb = cameraParams3 != null ? cameraParams3.Wb() : true;
        H0(Bb, Ub);
        TabsRecycler tabs = getTabs();
        if (tabs != null) {
            tabs.setHintsDelegate(new h());
        }
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setExternalTouchListener(this.v1);
        }
        ImageView flashButton = getFlashButton();
        if (flashButton != null) {
            flashButton.setOnClickListener(new ep6(this, i2));
        }
        AttachWithCounterView collectionButton = getCollectionButton();
        if (collectionButton != null) {
            collectionButton.setOnClickListener(new kn9(this, i3));
        }
        ImageView imageView = this.U;
        if (imageView != null) {
            bwt0.i0(imageView, new ln9(this, Bb, i3));
        }
        ImageView imageView2 = this.T;
        if (imageView2 != null) {
            bwt0.i0(imageView2, new jy(this, 20));
        }
        View masksButton = getMasksButton();
        int i4 = 12;
        if (masksButton != null) {
            bwt0.i0(masksButton, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, i4));
        }
        ImageView switchButton = getSwitchButton();
        if (switchButton != null) {
            switchButton.setOnClickListener(new mn9(this, i3));
        }
        ImageView imageView3 = this.S;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new nn9(this, i3));
        }
        View photosButtonBottom3 = getPhotosButtonBottom();
        if (photosButtonBottom3 != null) {
            photosButtonBottom3.setOnClickListener(new ug(this, i2));
        }
        View photosButtonTop2 = getPhotosButtonTop();
        if (photosButtonTop2 != null) {
            photosButtonTop2.setOnClickListener(new vg(this, i2));
        }
        View photosButtonTop3 = getPhotosButtonTop();
        if (photosButtonTop3 != null) {
            bm9 presenter = getPresenter();
            f4m.q((presenter == null || !presenter.M3()) ? e3m.a(R.dimen.camera_scan_from_photo_button_margin_bottom, photosButtonTop3.getContext()) : e3m.a(R.dimen.camera_scan_from_photo_button_margin_bottom_qr_only, photosButtonTop3.getContext()), photosButtonTop3);
            photosButtonTop3.setOutlineProvider(hav0.c);
        }
        TabsRecycler tabs2 = getTabs();
        if (tabs2 != null) {
            tabs2.setButtonTouchDelegate(getShutter());
            List<StoryCameraMode> z3 = getPresenter().z3();
            bm9 presenter2 = getPresenter();
            tabs2.c((presenter2 != null ? Integer.valueOf(presenter2.V3()) : null).intValue(), z3);
            tabs2.p.add(this);
        }
        ShutterButton shutter2 = getShutter();
        gm9 gm9Var = this.B;
        if (shutter2 != null) {
            shutter2.setFocusable(true);
            shutter2.setFocusableInTouchMode(true);
            shutter2.setClickListener(this);
            shutter2.setItems(getShutterItems());
            shutter2.c = p(gm9Var.getState().d());
            shutter2.d = -1;
            shutter2.setDelta(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            shutter2.post(new sc2(shutter2, r8));
        }
        ImageView imageView4 = this.f0;
        int i5 = 14;
        if (imageView4 != null) {
            bwt0.i0(imageView4, new com.vk.movika.sdk.base.observable.a(this, i5));
        }
        this.N0 = (ProgressBar) findViewById(R.id.camera_masks_progress);
        this.O0 = (ImageView) findViewById(R.id.masks_button_sync_badge);
        Context context2 = getContext();
        boolean f2 = ((eig) getDeps().j()).f();
        boolean g2 = ((eig) getDeps().j()).g();
        View masksButton2 = getMasksButton();
        ProgressBar progressBar = this.N0;
        ProgressBar progressBar2 = progressBar == null ? null : progressBar;
        ImageView imageView5 = this.O0;
        this.C = new ai10(context2, f2, g2, new j(), new hg(this, 9), masksButton2, progressBar2, imageView5 == null ? null : imageView5).a();
        ClipsControlsView clipsControlsView = (ClipsControlsView) findViewById(R.id.clips_controls_view);
        clipsControlsView.setCameraUiPositions(gm9Var);
        bm9 presenter3 = getPresenter();
        int i6 = 17;
        int i7 = 6;
        if (presenter3 != null) {
            wm9 Z3 = presenter3.Z3();
            clipsControlsView.t = Z3;
            bwt0.i0(clipsControlsView.L, new j20(i7, clipsControlsView, Z3));
            bwt0.i0(clipsControlsView.B, new com.vk.im.engine.internal.api_commands.messages.a(clipsControlsView, i6));
            Float a2 = Z3.a();
            clipsControlsView.setClipsSpeedbtnAttributes(a2 != null ? a2.floatValue() : 1.0f);
            bwt0.i0(clipsControlsView.F, new com.vk.clips.design.view.camera.controls.a(Z3));
            bwt0.i0(clipsControlsView.H, new com.vk.clips.design.view.camera.controls.b(Z3));
            bwt0.i0(clipsControlsView.M, new com.vk.clips.design.view.camera.controls.c(Z3));
            boolean z = Z3.i() != StoryCameraTarget.CLIP_FRAGMENT;
            VkImage vkImage = clipsControlsView.I;
            vkImage.setVisibility(z ? 0 : 8);
            bwt0.i0(vkImage, new rm0(i7, vkImage, Z3));
            bwt0.i0(clipsControlsView.D, new com.vk.im.engine.internal.storage.delegates.messages.b(Z3, 28));
        }
        setClipsControls(clipsControlsView);
        this.G0 = (ClipsProgressView) findViewById(R.id.camera_clips_progress_view);
        bm9 presenter4 = getPresenter();
        if (presenter4 != null && (w12 = presenter4.w1(getContext())) != null) {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.camera_clips_authors_choose_view);
            this.P0 = frameLayout2;
            if (frameLayout2 != null) {
                frameLayout2.addView(w12, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout frameLayout3 = this.P0;
            if (frameLayout3 != null) {
                bwt0.i0(frameLayout3, new zx(this, i4));
            }
        }
        StoryCameraParams cameraParams4 = getCameraParams();
        if (cameraParams4 != null && (Jb = cameraParams4.Jb()) != null) {
            boolean booleanValue = Jb.booleanValue();
            ClipsControlsView clipsControls = getClipsControls();
            if (clipsControls != null && booleanValue == clipsControls.getGesturedControl()) {
                Jb = null;
            }
            if (Jb != null) {
                boolean booleanValue2 = Jb.booleanValue();
                ClipsControlsView clipsControls2 = getClipsControls();
                if (clipsControls2 != null) {
                    clipsControls2.x2(booleanValue2);
                }
            }
        }
        s0(getDeps().a().b());
        VkSimpleButton vkSimpleButton = (VkSimpleButton) findViewById(R.id.camera_clips_next_btn);
        bwt0.i0(vkSimpleButton, new gr3(this, i7));
        this.H0 = vkSimpleButton;
        ImageView imageView6 = (ImageView) findViewById(R.id.camera_clips_delete_btn);
        bwt0.i0(imageView6, new sf1(this, i5));
        this.I0 = imageView6;
        ImageView imageView7 = (ImageView) findViewById(R.id.clips_close_btn);
        bwt0.i0(imageView7, new com.vk.im.engine.internal.storage.delegates.messages.b(this, i6));
        this.J0 = imageView7;
        StopwatchView stopwatchView = (StopwatchView) findViewById(R.id.recording_timer_view);
        stopwatchView.setTextSizePix(getResources().getDimensionPixelSize(R.dimen.stopwatch_text_size));
        Context context3 = getContext();
        e3m.a aVar = e3m.a;
        stopwatchView.setTextColor(context3.getColor(R.color.stopwatch_text_color));
        this.B0 = stopwatchView;
        RecognitionView recognitionView = (RecognitionView) findViewById(R.id.gesture_recognition_view);
        recognitionView.setLineSizePx(getResources().getDimensionPixelSize(R.dimen.recognition_view_line_size));
        recognitionView.setProgressColor(getContext().getColor(R.color.recognition_progress_color));
        recognitionView.setBackgroundColor(getContext().getColor(R.color.recognition_background_color));
        recognitionView.setBorderColor(getContext().getColor(R.color.recognition_border_color));
        this.C0 = recognitionView;
        this.D0 = (VkScreenSpinner) findViewById(R.id.circular_progress);
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            StopwatchView stopwatchView2 = this.B0;
            RecognitionView recognitionView2 = this.C0;
            MasksWrap masksWrap = this.b0;
            camera1View.G(stopwatchView2, recognitionView2, masksWrap != null ? masksWrap.getClipsGalleryListWrapper() : null);
        }
        VkContentBadge vkContentBadge = this.F0;
        if (vkContentBadge == null) {
            vkContentBadge = null;
        }
        vkContentBadge.setText(vkContentBadge.getContext().getString(R.string.clips_camera_duration_minutes_button_text, Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(getPresenter() != null ? r5.S3() : 1L))));
        bwt0.i0(vkContentBadge, new ya(5, this, vkContentBadge));
        vkContentBadge.setContentDescription(vkContentBadge.getContext().getString(R.string.clips_duration_title));
        Context context4 = getContext();
        DynamicTask dynamicTask = DynamicTask.GESTURE_CONTROL;
        Context context5 = getContext();
        ClipsControlsView clipsControls3 = getClipsControls();
        View clipsGestureAnchor = clipsControls3 != null ? clipsControls3.getClipsGestureAnchor() : null;
        ClipsControlsView clipsControls4 = getClipsControls();
        eqo<rpo> eqoVar = new eqo<>(context4, dynamicTask, new spo(context5, clipsGestureAnchor, clipsControls4 != null ? clipsControls4.getClipsGestureProgress() : null), ((eig) getDeps().j()).c(), ((eig) getDeps().j()).d());
        eqoVar.h(new f());
        this.D = eqoVar;
        eqo<kqo> eqoVar2 = new eqo<>(getContext(), DynamicTask.LIVES_PUBLISHER, new lqo(getContext(), getShutter(), new i()), ((eig) getDeps().j()).e(), ((eig) getDeps().j()).d());
        eqoVar2.h(new g());
        this.E = eqoVar2;
        o(getTabs(), new gzs() { // from class: xsna.jn9
            @Override // xsna.gzs
            public final Object invoke() {
                CameraUIView cameraUIView = CameraUIView.this;
                gm9 gm9Var2 = cameraUIView.B;
                gm9Var2.p = cameraUIView.getTabs();
                View view = cameraUIView.L0;
                if (view == null) {
                    view = null;
                }
                gm9Var2.q = view;
                gm9Var2.B = cameraUIView.getPhotosButtonBottom();
                if (Wb) {
                    gm9Var2.C = cameraUIView.getPhotosButtonTop();
                }
                gm9Var2.A = cameraUIView.getFlashButton();
                gm9Var2.w = cameraUIView.getSwitchButton();
                gm9Var2.v = cameraUIView.getMasksButton();
                gm9Var2.x = cameraUIView.S;
                gm9Var2.n = cameraUIView.d0;
                gm9Var2.m = cameraUIView.e0;
                if (!Bb) {
                    gm9Var2.y = cameraUIView.T;
                }
                gm9Var2.z = cameraUIView.U;
                gm9Var2.u = cameraUIView.getShutter();
                gm9Var2.t = cameraUIView.x0;
                gm9Var2.F = cameraUIView.f0;
                gm9Var2.G = cameraUIView.getCollectionButton();
                gm9Var2.H = cameraUIView.g0;
                ClipsProgressView clipsProgressView = cameraUIView.G0;
                if (clipsProgressView == null) {
                    clipsProgressView = null;
                }
                gm9Var2.P = clipsProgressView;
                gm9Var2.Q = cameraUIView.getClipsControls();
                VkSimpleButton vkSimpleButton2 = cameraUIView.H0;
                if (vkSimpleButton2 == null) {
                    vkSimpleButton2 = null;
                }
                gm9Var2.R = vkSimpleButton2;
                ImageView imageView8 = cameraUIView.I0;
                if (imageView8 == null) {
                    imageView8 = null;
                }
                gm9Var2.S = imageView8;
                ImageView imageView9 = cameraUIView.J0;
                if (imageView9 == null) {
                    imageView9 = null;
                }
                gm9Var2.T = imageView9;
                gm9Var2.O = cameraUIView.v0;
                VkContentBadge vkContentBadge2 = cameraUIView.F0;
                gm9Var2.b0 = vkContentBadge2 != null ? vkContentBadge2 : null;
                gm9Var2.c0 = cameraUIView.D0;
                ClipsControlsView clipsControls5 = cameraUIView.getClipsControls();
                if (clipsControls5 != null) {
                    clipsControls5.u = gm9Var2;
                    gm9Var2.Z = clipsControls5.L;
                    gm9Var2.X = clipsControls5.z;
                    gm9Var2.V = clipsControls5.B;
                    gm9Var2.W = clipsControls5.C;
                }
                gm9Var2.V();
                gm9Var2.b();
                gm9Var2.a();
                gm9Var2.d();
                return s3q0.a;
            }
        });
    }

    public final void s0(boolean z) {
        an9 state;
        ClipsControlsView.a aVar;
        ClipsControlsView clipsControls = getClipsControls();
        if (clipsControls != null) {
            VkText vkText = clipsControls.A;
            ((xkg) getDeps().k()).getClass();
            boolean f2 = xkg.b.f();
            ImageView imageView = clipsControls.M;
            if (f2 && z) {
                if (!gz80.a(28) && (aVar = clipsControls.t) != null) {
                    aVar.o(!clipsControls.w);
                }
                imageView.setVisibility(0);
                gm9 gm9Var = clipsControls.u;
                if (gm9Var != null && (state = gm9Var.getState()) != null && state.c()) {
                    f4m.j(vkText);
                }
            } else {
                imageView.setVisibility(8);
                f4m.j(vkText);
            }
        }
        this.B.d();
    }

    @Override // xsna.n96, xsna.cm9
    public void setBroadcast(pe8 pe8Var) {
        this.k1 = pe8Var;
    }

    @Override // xsna.n96
    public void setBroadcastFriends(cg8 cg8Var) {
        this.m1 = cg8Var;
    }

    @Override // xsna.n96, xsna.cm9
    public void setCameraGridVisible(boolean z) {
        CameraGridView cameraGridView = this.r0;
        if (cameraGridView != null) {
            cameraGridView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setClipsContentLoadingProgress(float f2) {
        VkScreenSpinner vkScreenSpinner = this.D0;
        if (vkScreenSpinner != null) {
            VkSpinnerContent.SpinnerState spinnerState = vkScreenSpinner.getSpinnerState();
            VkSpinnerContent.SpinnerState spinnerState2 = VkSpinnerContent.SpinnerState.Loading;
            if (spinnerState != spinnerState2) {
                vkScreenSpinner.setSpinnerState(spinnerState2);
                vkScreenSpinner.setVisibility(0);
            }
            tlo0.a aVar = tlo0.Companion;
            String format = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? String.format(vkScreenSpinner.getContext().getString(R.string.camera_loading_progress), Arrays.copyOf(new Object[]{Integer.valueOf((int) (f2 * 100))}, 1)) : vkScreenSpinner.getContext().getString(R.string.camera_loading_process);
            aVar.getClass();
            vkScreenSpinner.b(tlo0.a.d(format).a(vkScreenSpinner.getContext()), false);
        }
    }

    public void setClipsControls(ClipsControlsView clipsControlsView) {
        this.E0 = clipsControlsView;
    }

    @Override // xsna.n96, xsna.cm9
    public void setClipsCountDownMarker(Long l) {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.setCountDownMarker(l);
    }

    @Override // xsna.n96, xsna.cm9
    public void setClipsProgress(float f2) {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.setCurrentSectionProgress(f2);
    }

    @Override // xsna.n96, xsna.cm9
    public void setClipsProgressCounterVisible(boolean z) {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.setCounterLabelVisibility(z);
    }

    @Override // xsna.n96, xsna.cm9
    public void setClipsProgressMaxDurationMs(int i2) {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.setMaxDurationMs(i2);
    }

    @Override // xsna.n96
    public void setCountDownIcon(int i2) {
        ClipsControlsView clipsControls = getClipsControls();
        if (clipsControls != null) {
            clipsControls.setCountDownIcon(i2);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setCountDownLayoutVisible(boolean z) {
        StopwatchView stopwatchView = this.M0;
        if (stopwatchView != null) {
            f4m.j(stopwatchView);
        }
        ViewGroup viewGroup = this.K0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.n96
    public void setCustomQrListener(izs<? super ArrayList<ParsedResult>, s3q0> izsVar) {
        this.n1 = izsVar;
    }

    @Override // xsna.n96
    public void setIsFullHdCamera(boolean z) {
        zd9 camera1View = getCamera1View();
        if (camera1View != null) {
            camera1View.setFullHd(z);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setLiveAuthorPhoto(String str) {
        this.q1 = str;
        VkAvatar vkAvatar = this.h0;
        if (vkAvatar != null) {
            vkAvatar.o0(str, null);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setLiveNameText(String str) {
        AppCompatEditText appCompatEditText = this.w0;
        if (appCompatEditText != null) {
            appCompatEditText.setText(str, TextView.BufferType.EDITABLE);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setLiveNameTextEditable(boolean z) {
        this.p1 = z;
        AppCompatEditText appCompatEditText = this.w0;
        if (appCompatEditText != null) {
            appCompatEditText.setFocusable(z);
        }
        AppCompatEditText appCompatEditText2 = this.w0;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setFocusableInTouchMode(z);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setNewMasksBadgeCount(String str) {
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setNewMasksBadgeVisible(boolean z) {
        TextView textView = this.V;
        int i2 = 8;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            if (z) {
                getDeps().f().h().getClass();
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    @Override // xsna.n96, xsna.d0m0
    public void setOnFirstFrameCallback(gzs<s3q0> gzsVar) {
        this.x = new qi9(gzsVar);
    }

    @Override // xsna.n96
    public void setPositions(fm9 fm9Var) {
        this.o1 = fm9Var;
    }

    @Override // xsna.n96, xsna.cm9
    public void setQrProcessingEnabled(boolean z) {
        QrScannerUi qrScannerUi = this.Q0;
        if (qrScannerUi != null) {
            qrScannerUi.c(z);
        }
        QrScannerUi qrScannerUi2 = this.Q0;
        if (qrScannerUi2 != null) {
            qrScannerUi2.d(z);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setShareButtonVisible(boolean z) {
        ImageView imageView = this.f0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setShutterEnabled(boolean z) {
        an9 state;
        bm9 presenter = getPresenter();
        if (presenter != null && (state = presenter.getState()) != null) {
            state.q(z);
        }
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setAlphaFactor(z ? 1.0f : 0.4f);
            shutter.setEnabled(z);
            shutter.invalidate();
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setShutterLoadingProgress(float f2) {
        setLoadingProgress(f2);
    }

    @Override // xsna.n96, xsna.cm9
    public void setShutterPosition(boolean z) {
        int p = p(this.B.getState().d());
        ShutterButton shutter = getShutter();
        int posCur = shutter != null ? shutter.getPosCur() : -1;
        if (p != posCur) {
            ShutterButton shutter2 = getShutter();
            int posNext = shutter2 != null ? shutter2.getPosNext() : -1;
            if (posNext != -1 && posNext != p) {
                posCur = posNext;
            }
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            final int min = Math.min(posCur, p);
            final int max = Math.max(posCur, p);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = posCur > p ? 1.0f : 0.0f;
            if (posCur <= p) {
                f2 = 1.0f;
            }
            if (!z) {
                ShutterButton shutter3 = getShutter();
                if (shutter3 != null) {
                    shutter3.b(p, true);
                    return;
                }
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.gn9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f4 = CameraUIView.w1;
                    ShutterButton shutter4 = this.getShutter();
                    if (shutter4 != null) {
                        shutter4.e(((Float) valueAnimator2.getAnimatedValue()).floatValue(), min, max);
                    }
                }
            });
            ofFloat.addListener(new c(p));
            ofFloat.setDuration(380L);
            ofFloat.setInterpolator(this.F);
            ofFloat.start();
            this.G = ofFloat;
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setShutterProgressListener(ShutterButton.e eVar) {
        ShutterButton shutter = getShutter();
        if (shutter != null) {
            shutter.setProgressListener(eVar);
        }
    }

    @Override // xsna.n96, xsna.cm9
    public void setStopwatchTime(int i2) {
        StopwatchView stopwatchView = this.M0;
        if ((stopwatchView == null || !stopwatchView.k) && stopwatchView != null) {
            stopwatchView.a(true);
        }
        StopwatchView stopwatchView2 = this.M0;
        if (stopwatchView2 != null) {
            stopwatchView2.setDuration(i2);
        }
    }

    @Override // xsna.n96
    public void setSwipeSemiposition(boolean z) {
        this.B.getState().s(z);
        if (z) {
            this.H.a();
        }
    }

    @Override // xsna.n96
    public void setTab(StoryCameraMode storyCameraMode) {
        bm9 presenter = getPresenter();
        Integer num = null;
        an9 state = presenter != null ? presenter.getState() : null;
        int indexOf = this.B.m().indexOf(storyCameraMode);
        Integer valueOf = Integer.valueOf(indexOf);
        if ((state == null || state.d() != indexOf) && state != null && !state.b()) {
            num = valueOf;
        }
        if (num != null) {
            P(storyCameraMode);
        }
    }

    @Override // xsna.n96
    public void setVisibleProgressView(boolean z) {
        ClipsProgressView clipsProgressView = this.G0;
        if (clipsProgressView == null) {
            clipsProgressView = null;
        }
        clipsProgressView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0.Qb() == true) goto L10;
     */
    @Override // xsna.n96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        Window window;
        boolean z = ((getContext() instanceof StoryCameraActivity) || (r0 = getCameraParams()) == null) ? false : true;
        if ((getContext() instanceof Activity) && z && (window = ((Activity) getContext()).getWindow()) != null) {
            window.clearFlags(1024);
        }
    }

    public final void t0(String str) {
        vi9 vi9Var = new vi9(getContext());
        vi9Var.q(str);
        vi9Var.e(this.s0 + this.t0);
        vi9Var.n();
    }

    public final void v0() {
        Activity h2 = e3m.h(getContext());
        if (h2 == null) {
            return;
        }
        bm9 presenter = getPresenter();
        if ((presenter != null ? presenter.c4() : null) != StoryCameraMode.QR_SCANNER) {
            return;
        }
        Rect rect = new Rect();
        View photosButtonTop = getPhotosButtonTop();
        if (photosButtonTop != null) {
            photosButtonTop.getGlobalVisibleRect(rect);
        }
        l7v b2 = getDeps().h().b();
        HintId hintId = HintId.INFO_BUBBLE_QR_SCANNER_PHOTO;
        if (b2.a(hintId.getId())) {
            l7v b3 = getDeps().h().b();
            String id = hintId.getId();
            b3.getClass();
            l7v.b bVar = new l7v.b(id, b3, rect);
            bVar.i(new en9(this, 0));
            bVar.m();
            bVar.l();
            this.O = bVar.j(h2);
        }
    }

    public final void x0(boolean z) {
        ImageView imageView;
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (imageView = this.f0) == null) {
            return;
        }
        imageView.postDelayed(new qn9(0, this, activity), z ? 300L : 0L);
    }

    public final void y0() {
        bm9 presenter;
        am9 K3;
        String[] strArr;
        String[] strArr2;
        int i2;
        String[] strArr3;
        String[] strArr4;
        int i3;
        String[] strArr5;
        int i4;
        if (getCameraPermissionHelper() == null) {
            bm9 presenter2 = getPresenter();
            boolean z = (presenter2 != null ? presenter2.getCurrentState() : null) == StoryCameraMode.QR_SCANNER;
            bm9 presenter3 = getPresenter();
            boolean z2 = (presenter3 != null ? presenter3.getCurrentState() : null) == StoryCameraMode.VMOJI_CAPTURE;
            bm9 presenter4 = getPresenter();
            boolean z3 = (presenter4 != null ? presenter4.getCurrentState() : null) == StoryCameraMode.CLIPS;
            if (z) {
                PermissionHelper.a.getClass();
                strArr5 = PermissionHelper.z;
                i4 = R.string.vk_permissions_camera_qr;
            } else if (z2) {
                PermissionHelper.a.getClass();
                strArr5 = PermissionHelper.l;
                i4 = R.string.vk_permissions_camera_vmoji;
            } else {
                if (z3) {
                    PermissionHelper.a.getClass();
                    strArr = PermissionHelper.j;
                    strArr2 = PermissionHelper.k;
                    i2 = R.string.vk_permissions_camera_clips;
                } else {
                    PermissionHelper.a.getClass();
                    strArr = PermissionHelper.j;
                    strArr2 = PermissionHelper.k;
                    i2 = R.string.vk_permissions_stories_camera;
                }
                strArr3 = strArr;
                strArr4 = strArr2;
                i3 = i2;
                Activity activity = (Activity) getContext();
                dhr0.a.getClass();
                setCameraPermissionHelper(s8g0.a.a(kn4.b(activity, Integer.valueOf(dhr0.u().c)), ey90.a.a(dhr0.s()), new yx90(i3, 13, strArr3, strArr4, false), new hd(this, 12), new kd(this, 14), new we0(this, 11), new s1(this, 12)));
            }
            strArr3 = strArr5;
            strArr4 = strArr3;
            i3 = i4;
            Activity activity2 = (Activity) getContext();
            dhr0.a.getClass();
            setCameraPermissionHelper(s8g0.a.a(kn4.b(activity2, Integer.valueOf(dhr0.u().c)), ey90.a.a(dhr0.s()), new yx90(i3, 13, strArr3, strArr4, false), new hd(this, 12), new kd(this, 14), new we0(this, 11), new s1(this, 12)));
        }
        s8g0 cameraPermissionHelper = getCameraPermissionHelper();
        if (cameraPermissionHelper == null || !cameraPermissionHelper.d()) {
            s8g0 cameraPermissionHelper2 = getCameraPermissionHelper();
            if (cameraPermissionHelper2 != null) {
                cameraPermissionHelper2.b();
            }
            s8g0 cameraPermissionHelper3 = getCameraPermissionHelper();
            if (cameraPermissionHelper3 != null && cameraPermissionHelper3.d() && (presenter = getPresenter()) != null && (K3 = presenter.K3()) != null) {
                Context context = getContext();
                StoryPublishEvent storyPublishEvent = StoryPublishEvent.CAMERA_ACCESS_REQUESTED;
                bm9 presenter5 = getPresenter();
                K3.e(context, storyPublishEvent, presenter5 != null ? presenter5.c4() : null);
            }
        }
        MasksWrap masksWrap = this.b0;
        if (masksWrap != null) {
            masksWrap.w();
        }
    }

    public final void z0() {
        an9 state;
        f1 f1Var = new f1(this, 12);
        VkScreenSpinner vkScreenSpinner = this.D0;
        if (vkScreenSpinner != null) {
            vkScreenSpinner.setOnCancelListener(new do9(f1Var, this));
        }
        ClipsControlsView clipsControls = getClipsControls();
        if (clipsControls != null) {
            clipsControls.setTimerButtonEnabled(false);
        }
        setGalleryAvailable(false);
        bm9 presenter = getPresenter();
        if (presenter != null && (state = presenter.getState()) != null) {
            state.k(true);
        }
        this.B.d();
        setClipsContentLoadingProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.n96, xsna.cm9
    public ClipsControlsView getClipsControls() {
        return this.E0;
    }

    @Override // xsna.n96, xsna.sr6
    public bm9 getPresenter() {
        return this.l1;
    }

    @Override // xsna.n96
    public void setPresenter(bm9 bm9Var) {
        this.l1 = bm9Var;
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class f implements eqo.a<rpo> {
        public f() {
        }

        @Override // xsna.eqo.a
        public final void b(rpo rpoVar) {
            rpo rpoVar2 = rpoVar;
            boolean equals = rpoVar2.equals(rpo.a.b);
            CameraUIView cameraUIView = CameraUIView.this;
            if (equals) {
                bm9 presenter = cameraUIView.getPresenter();
                if (presenter != null) {
                    presenter.w3();
                }
                cameraUIView.Y();
            } else {
                if (!rpoVar2.equals(rpo.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bm9 presenter2 = cameraUIView.getPresenter();
                if (presenter2 != null) {
                    presenter2.n4();
                }
                cameraUIView.Y();
            }
            L.e("CameraUIView", zhy0.a("OpenCV dynamic module loaded, lib attached = ", MediaNative.checkOrLoadOpenCV()));
        }

        @Override // xsna.eqo.a
        public final void c(rpo rpoVar) {
            L.e("CameraUIView", "OpenCV dynamic module loading cancelled");
            bm9 presenter = CameraUIView.this.getPresenter();
            if (presenter != null) {
                presenter.t4(false, true);
            }
        }

        @Override // xsna.eqo.a
        public final void d(rpo rpoVar, Throwable th) {
            L.e("CameraUIView", "OpenCV dynamic module loading error: " + th.getLocalizedMessage());
            bm9 presenter = CameraUIView.this.getPresenter();
            if (presenter != null) {
                presenter.t4(false, true);
            }
        }

        @Override // xsna.eqo.a
        public final void a(boolean z) {
        }
    }

    /* compiled from: CameraUIView.kt */
    /* loaded from: classes17.dex */
    public static final class g implements eqo.a<kqo> {
        public g() {
        }

        @Override // xsna.eqo.a
        public final void b(kqo kqoVar) {
            bm9 presenter;
            if (!kqoVar.equals(kqo.a.b) || (presenter = CameraUIView.this.getPresenter()) == null) {
                return;
            }
            presenter.l4();
        }

        @Override // xsna.eqo.a
        public final /* bridge */ /* synthetic */ void c(kqo kqoVar) {
        }

        @Override // xsna.eqo.a
        public final /* bridge */ /* synthetic */ void d(kqo kqoVar, Throwable th) {
        }

        @Override // xsna.eqo.a
        public final void a(boolean z) {
        }
    }
}
