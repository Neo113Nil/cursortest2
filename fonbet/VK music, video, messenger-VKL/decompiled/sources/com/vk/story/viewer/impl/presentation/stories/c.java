package com.vk.story.viewer.impl.presentation.stories;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.log.L;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.impl.presentation.stories.b;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a4c0;
import xsna.ac80;
import xsna.ays;
import xsna.b5z;
import xsna.b8q;
import xsna.bpn0;
import xsna.cmf0;
import xsna.cqm0;
import xsna.d6q0;
import xsna.dhr0;
import xsna.dlm0;
import xsna.e3m;
import xsna.ey50;
import xsna.f5z;
import xsna.f870;
import xsna.fcn;
import xsna.fnj;
import xsna.fsk;
import xsna.gq;
import xsna.gqo;
import xsna.gzs;
import xsna.hyd0;
import xsna.iah0;
import xsna.inm0;
import xsna.j6i;
import xsna.l6f0;
import xsna.lrb0;
import xsna.lyd;
import xsna.m7m;
import xsna.mzp0;
import xsna.p90;
import xsna.pkk;
import xsna.pxo0;
import xsna.q7m0;
import xsna.qlm0;
import xsna.qo6;
import xsna.qq2;
import xsna.qxi;
import xsna.rzp0;
import xsna.s3q0;
import xsna.s9b;
import xsna.smk0;
import xsna.smm0;
import xsna.sqs;
import xsna.tez;
import xsna.u2b0;
import xsna.u90;
import xsna.uko;
import xsna.ulm0;
import xsna.uq;
import xsna.v5m0;
import xsna.vlm0;
import xsna.vrl0;
import xsna.w8i;
import xsna.wg10;
import xsna.wl40;
import xsna.wlm0;
import xsna.woo;
import xsna.wvl0;
import xsna.x19;
import xsna.xlm0;
import xsna.xy9;
import xsna.y1q0;
import xsna.y8i;
import xsna.ylm0;
import xsna.yrl0;
import xsna.ze2;
import xsna.zj3;
import xsna.zzs;

/* compiled from: StoryViewDialog.java */
/* loaded from: classes11.dex */
public final class c extends y8i implements b.k, fcn, ays.a, w8i, l, dhr0.e {
    public static final ArrayList<c> f0 = new ArrayList<>();
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;
    public View G;

    @NonNull
    public final ays H;
    public DialogInterface.OnDismissListener I;
    public StoryViewerRouter.b J;

    @NonNull
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint K;

    @NonNull
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint L;

    @Nullable
    public final String M;

    @Nullable
    public final String N;

    @Nullable
    public final String O;
    public StoryViewerRouter.InOutAnimation P;
    public com.vk.story.api.a Q;

    @Nullable
    public Integer R;

    @NonNull
    public final qlm0 S;

    @NonNull
    public final pxo0 T;
    public boolean U;
    public final y1q0 V;
    public final inm0 W;
    public final v5m0 X;
    public final boolean Y;
    public final boolean Z;
    public long a0;

    @Nullable
    public WeakReference<f5z> b0;
    public int c0;
    public int d0;
    public final b e0;
    public final Handler f;
    public final Activity g;
    public final LifecycleHandler h;
    public final StoryViewerRouter.a i;

    @Nullable
    public final List<StoriesContainer> j;
    public final String k;
    public final ColorDrawable l;

    @NonNull
    public final h m;
    public com.vk.story.viewer.impl.presentation.stories.b n;
    public ViewGroup o;
    public final wg10 p;

    @NonNull
    public final vrl0 q;

    @Nullable
    public final mzp0 r;
    public boolean s;
    public VelocityTracker t;
    public final int u;
    public final int v;
    public float w;
    public boolean x;
    public boolean y;
    public float z;

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class a implements zzs<woo<? extends woo<?>>, Boolean, Float, Float, s3q0> {
        public final /* synthetic */ smk0 b;
        public final /* synthetic */ smk0 c;
        public final /* synthetic */ smk0 d;
        public final /* synthetic */ smk0 e;

        public a(smk0 smk0Var, smk0 smk0Var2, smk0 smk0Var3, smk0 smk0Var4) {
            this.b = smk0Var;
            this.c = smk0Var2;
            this.d = smk0Var3;
            this.e = smk0Var4;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(woo<? extends woo<?>> wooVar, Boolean bool, Float f, Float f2) {
            if (!this.b.f && !this.c.f && !this.d.f && !this.e.f) {
                c cVar = c.this;
                cVar.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                cVar.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!cVar.w()) {
                    View view = cVar.G;
                    if (view != null) {
                        view.setScaleX(1.0f);
                        cVar.G.setScaleY(1.0f);
                    }
                    cVar.G = null;
                }
                cVar.n.Q();
                cVar.n.T(true);
            }
            return null;
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class b extends b5z {
        public b() {
        }

        @Override // xsna.b5z
        public final void b(@NonNull Activity activity) {
            c cVar = c.this;
            cVar.q.onDestroy();
            com.vk.story.viewer.impl.presentation.stories.b bVar = cVar.n;
            if (bVar != null) {
                bVar.L();
            }
        }

        @Override // xsna.b5z
        public final void c(@NonNull Activity activity) {
            c cVar = c.this;
            if (c.l(cVar)) {
                com.vk.story.viewer.impl.presentation.stories.b bVar = cVar.n;
                if (bVar != null) {
                    bVar.M();
                }
                cVar.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar.H);
            }
        }

        @Override // xsna.b5z
        public final void d(@NonNull String str, int i, int i2, @Nullable Intent intent) {
            com.vk.story.viewer.impl.presentation.stories.b bVar;
            c cVar = c.this;
            if (!c.l(cVar) || (bVar = cVar.n) == null) {
                return;
            }
            bVar.K(i, i2, intent);
        }

        @Override // xsna.b5z
        public final void e(@NonNull Activity activity) {
            c cVar = c.this;
            if (c.l(cVar)) {
                com.vk.story.viewer.impl.presentation.stories.b bVar = cVar.n;
                if (bVar != null) {
                    bVar.N();
                }
                cVar.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(cVar.H);
            }
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C1834c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StoryViewerRouter.InOutAnimation.values().length];
            a = iArr;
            try {
                iArr[StoryViewerRouter.InOutAnimation.PointToFullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StoryViewerRouter.InOutAnimation.RectToFullScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class d extends x19 {
        public d() {
        }

        @Override // xsna.elm0
        public final int c(StoriesContainer storiesContainer) {
            int i;
            if (!storiesContainer.j) {
                return storiesContainer.Kb();
            }
            c cVar = c.this;
            wvl0 wvl0Var = cVar.S.i;
            String str = cVar.k;
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(str);
            } catch (Throwable unused) {
                i = 0;
            }
            return wvl0Var.a(storiesContainer, i);
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class e implements DialogInterface.OnDismissListener {
        public final /* synthetic */ Activity b;

        public e(Activity activity) {
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            int i;
            c cVar = c.this;
            WeakReference<f5z> weakReference = cVar.b0;
            if (weakReference != null) {
                f5z f5zVar = weakReference.get();
                if (f5zVar != null) {
                    f5zVar.getLifecycle().removeObserver(cVar);
                }
                cVar.b0 = null;
            }
            com.vk.story.viewer.impl.presentation.stories.b bVar = cVar.n;
            if (bVar != null) {
                bVar.M();
                cVar.n.L();
            }
            cVar.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar.H);
            cVar.h.e(cVar.e0);
            mzp0 mzp0Var = cVar.r;
            if (mzp0Var != null) {
                mzp0Var.g();
            }
            cVar.q.onDestroy();
            ArrayList<c> arrayList = c.f0;
            if (arrayList.size() == 0) {
                Activity activity = this.b;
                u2b0 r = ((AudioModelsComponent) j6i.b(m7m.a(activity), AudioModelsComponent.class)).r();
                Activity activity2 = cVar.g;
                StoryViewerRouter.b bVar2 = cVar.J;
                if (bVar2 != null) {
                    bVar2.Q0();
                    i = 7;
                } else {
                    i = -1;
                }
                activity2.setRequestedOrientation(i);
                r.q0();
                iah0.x(activity, false);
            }
            cVar.S.e.c();
            qxi.a().e();
            L.A("c", uq.b(arrayList, new StringBuilder("Dialog is removed from the stack storyViewDialogStack.count = ")));
            DialogInterface.OnDismissListener onDismissListener = cVar.I;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            d6q0.f(cVar.W);
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            p90.b(cVar.g, cVar.getContext().getColor(R.color.vk_black), false);
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class g implements gzs<s3q0> {
        public g() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            c.this.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            return s3q0.a;
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class h extends FrameLayout {
        public h(Activity activity) {
            super(activity);
            if (activity instanceof AppCompatActivity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
                gqo.f(this, new com.vk.story.viewer.impl.presentation.stories.d(appCompatActivity));
                lyd.h(this, new com.vk.story.viewer.impl.presentation.stories.e(appCompatActivity));
            }
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            c cVar = c.this;
            com.vk.story.viewer.impl.presentation.stories.b bVar = cVar.n;
            return ((bVar == null || bVar.getCurrentStoryView() == null) ? true : cVar.n.getCurrentStoryView().I0()) && c.h(cVar, motionEvent);
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return c.h(c.this, motionEvent);
        }
    }

    /* compiled from: StoryViewDialog.java */
    /* loaded from: classes6.dex */
    public class i implements gzs<com.vk.story.viewer.impl.presentation.stories.b> {
        public i() {
        }

        @Override // xsna.gzs
        public final com.vk.story.viewer.impl.presentation.stories.b invoke() {
            return c.this.n;
        }
    }

    public c(@NonNull Activity activity, @Nullable List<StoriesContainer> list, @NonNull String str, @Nullable StoriesContainer storiesContainer, boolean z, @NonNull StoryViewerRouter.a aVar, @NonNull MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, @NonNull MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable f5z f5zVar, long j) {
        super(activity, iah0.n(activity) ? R.style.StoryDialog : R.style.StoryDialogNoStatusBar);
        this.f = new Handler(Looper.getMainLooper());
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        this.l = colorDrawable;
        this.x = false;
        this.y = false;
        this.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.E = -1;
        this.F = -1;
        this.P = StoryViewerRouter.InOutAnimation.PointToFullScreen;
        this.Q = new com.vk.story.api.a();
        this.T = new pxo0(500L);
        this.U = false;
        y1q0 y1q0Var = new y1q0();
        this.V = y1q0Var;
        d dVar = new d();
        inm0 inm0Var = new inm0(new i(), new g(), StoryViewerKBHPolicy.PAUSE);
        this.W = inm0Var;
        v5m0 u5 = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).u5();
        this.X = u5;
        StoriesFeatures storiesFeatures = StoriesFeatures.STORY_VIEWER_OPTIMIZED_INITIAL;
        storiesFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(storiesFeatures);
        this.Z = a2;
        b bVar = new b();
        this.e0 = bVar;
        getWindow().setWindowAnimations(R.style.PickerDialogNoAnimation);
        if (w()) {
            dhr0.f(this);
            if (activity.getWindow() != null) {
                this.c0 = activity.getWindow().getStatusBarColor();
                this.d0 = activity.getWindow().getNavigationBarColor();
            } else {
                this.c0 = dhr0.Y(R.attr.vk_ui_header_background, activity);
                this.d0 = dhr0.Y(R.attr.vk_ui_background_content, activity);
            }
            getWindow().setStatusBarColor(this.c0);
            getWindow().setNavigationBarColor(this.d0);
        }
        this.K = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.L = mobileOfficialAppsConStoriesStat$ViewEntryPoint2;
        this.M = str2;
        this.N = str3;
        this.O = str4;
        this.g = activity;
        this.i = aVar;
        this.j = list;
        this.k = str;
        this.Y = z;
        if (f5zVar != null) {
            f5zVar.getLifecycle().addObserver(this);
            this.b0 = new WeakReference<>(f5zVar);
        }
        StoriesComponent storiesComponent = (StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class);
        StoryViewerComponent storyViewerComponent = (StoryViewerComponent) j6i.b(m7m.f(this), StoryViewerComponent.class);
        StoryStatisticsComponent storyStatisticsComponent = (StoryStatisticsComponent) j6i.b(m7m.f(this), StoryStatisticsComponent.class);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.a(UiMeasuringScreen.STORY).j();
        this.r = mzp0Var;
        mzp0Var.init();
        mzp0Var.start();
        vrl0 V2 = storyViewerComponent.V2();
        this.q = V2;
        if (V2 instanceof yrl0) {
            ((yrl0) V2).u(mzp0Var);
        }
        new WeakReference(V2);
        q7m0 q7m0Var = new q7m0(str);
        V2.i(j, q7m0Var, new hyd0(4), mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        NarrativeComponent narrativeComponent = (NarrativeComponent) j6i.b(m7m.f(this), NarrativeComponent.class);
        CommonEditorComponent commonEditorComponent = (CommonEditorComponent) j6i.b(m7m.f(this), CommonEditorComponent.class);
        BridgeComponent bridgeComponent = (BridgeComponent) j6i.b(m7m.f(this), BridgeComponent.class);
        MarketComponent marketComponent = (MarketComponent) j6i.b(m7m.f(this), MarketComponent.class);
        AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) j6i.b(m7m.f(this), AudienceResearchComponent.class);
        smm0 smm0Var = new smm0(q7m0Var, new WeakReference(V2), u5);
        wvl0 z3 = storyViewerComponent.z3();
        qlm0 qlm0Var = new qlm0(storiesComponent.b(), storiesComponent.o7(), narrativeComponent.n4(), narrativeComponent.V7(), storiesComponent.fb(), storyViewerComponent.l9(), storyViewerComponent.tb(), storyViewerComponent.Wd(), z3, commonEditorComponent.Ha(), storyViewerComponent.lb(), storyViewerComponent.b(), storiesComponent.b7(), storyViewerComponent.w9(), storiesComponent.eb(), storiesComponent.r2(), storiesComponent.w(), storyViewerComponent.g9(), q7m0Var, smm0Var, storyStatisticsComponent.h7(), bridgeComponent.t().b(), marketComponent.l7(), bridgeComponent.s(), audienceResearchComponent);
        this.S = qlm0Var;
        qlm0Var.b().o();
        ays aysVar = new ays(activity, getWindow(), getWindow().getDecorView());
        this.H = aysVar;
        aysVar.a(this);
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(aysVar);
        StoriesContainer e2 = (z && storiesContainer == null && list != null && storiesContainer == null) ? z3.e(str, list) : storiesContainer;
        if (z && e2 == null) {
            throw new IllegalArgumentException("Can't find stories container with openStoryUniqueId = ".concat(str));
        }
        h hVar = new h(activity);
        this.m = hVar;
        hVar.setBackground(colorDrawable);
        wg10 wg10Var = new wg10(activity);
        this.p = wg10Var;
        if (!z) {
            t();
        } else if (a2) {
            t();
        } else {
            dlm0 dlm0Var = new dlm0(activity, e2, qlm0Var, new WeakReference(V2));
            dlm0Var.c();
            dlm0Var.b(dVar);
            dlm0Var.e(mobileOfficialAppsConStoriesStat$ViewEntryPoint);
            dlm0Var.d(new ac80(y1q0Var, null));
            this.o = (ViewGroup) dlm0Var.a();
            if (w()) {
                wg10Var.removeAllViews();
                wg10Var.addView(this.o);
                hVar.removeAllViews();
                hVar.addView(wg10Var);
            } else {
                hVar.removeAllViews();
                hVar.addView(this.o);
            }
        }
        setContentView(hVar);
        mzp0Var.e(hVar);
        LifecycleHandler c = LifecycleHandler.c(activity);
        this.h = c;
        c.a(bVar);
        d6q0.b(inm0Var);
        super.setOnDismissListener(new e(activity));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
        this.u = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public static boolean h(c cVar, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i2 = cVar.v;
        int i3 = cVar.u;
        ColorDrawable colorDrawable = cVar.l;
        StoryViewerRouter.a aVar = cVar.i;
        h hVar = cVar.m;
        wg10 wg10Var = cVar.p;
        if (!cVar.s && cVar.n != null && !cVar.T.c() && !cVar.n.A()) {
            if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                if (!cVar.x && !cVar.y && motionEvent.getPointerCount() == 1) {
                    cVar.D = motionEvent.getX();
                    cVar.w = motionEvent.getY();
                    cVar.x = false;
                    cVar.A = motionEvent.getY();
                    cVar.z = motionEvent.getX();
                    cVar.y = false;
                    cVar.U = true;
                    VelocityTracker obtain = VelocityTracker.obtain();
                    cVar.t = obtain;
                    obtain.addMovement(motionEvent);
                }
            } else if (motionEvent.getActionMasked() == 2 && cVar.U) {
                if (motionEvent.getPointerCount() == 1) {
                    VelocityTracker velocityTracker3 = cVar.t;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float abs = Math.abs(motionEvent.getX() - cVar.D);
                    float abs2 = Math.abs(motionEvent.getY() - cVar.w);
                    boolean z = motionEvent.getY() - cVar.w > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float abs3 = Math.abs(motionEvent.getX() - cVar.z);
                    float abs4 = Math.abs(motionEvent.getY() - cVar.A);
                    boolean J = motionEvent.getX() - cVar.z < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? cVar.n.J() : cVar.n.H();
                    if (z && !cVar.x && !cVar.y && abs2 >= iah0.a(30) && abs2 / 2.0f > abs && cVar.w >= iah0.a(40)) {
                        cVar.x = true;
                        cVar.w = motionEvent.getY();
                        if (!cVar.w()) {
                            View k = aVar.k(cVar.n.getCurrentStoryUniqueId());
                            cVar.G = k;
                            if (k != null) {
                                k.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                cVar.G.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                        }
                        cVar.n.P();
                        cVar.n.T(false);
                        return true;
                    }
                    if (J && !cVar.x && !cVar.y && abs3 >= iah0.a(30) && abs3 / 2.0f > abs4) {
                        cVar.y = true;
                        cVar.z = motionEvent.getX();
                        if (!cVar.w()) {
                            View k2 = aVar.k(cVar.n.getCurrentStoryUniqueId());
                            cVar.G = k2;
                            if (k2 != null) {
                                k2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                cVar.G.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                        }
                        cVar.n.P();
                        if (cVar.w()) {
                            cVar.n.T(false);
                        }
                        return true;
                    }
                    float f2 = 0.9f;
                    if (!cVar.x) {
                        if (!cVar.y) {
                            cVar.D = motionEvent.getX();
                            cVar.A = motionEvent.getY();
                            return false;
                        }
                        cVar.C = motionEvent.getX() - cVar.z;
                        float p = p(cVar.C, hVar.getWidth());
                        colorDrawable.setAlpha((int) Math.max(127.0f, 255.0f * p));
                        if (cVar.w()) {
                            wg10Var.setTranslationX(cVar.C);
                        } else {
                            cVar.n.setTranslationX(cVar.C);
                        }
                        if (cVar.w()) {
                            cVar.n.y(p);
                        }
                        if (p >= 0.5f && p <= 1.0f) {
                            f2 = 0.9f + (((p - 0.5f) / 0.5f) * 0.100000024f);
                        }
                        if (cVar.w()) {
                            wg10Var.setScaleX(f2);
                            wg10Var.setScaleY(f2);
                        } else {
                            cVar.n.setScaleX(f2);
                            cVar.n.setScaleY(f2);
                        }
                        cVar.n.P();
                        return false;
                    }
                    cVar.B = motionEvent.getY() - cVar.w;
                    float p2 = p(cVar.B, hVar.getHeight());
                    Window window = cVar.getWindow();
                    if (window != null) {
                        window.addFlags(Integer.MIN_VALUE);
                        int intValue = ((Integer) zj3.a.evaluate(Math.max(0.29f, p2), Integer.valueOf(cVar.getContext().getColor(R.color.vk_clear)), Integer.valueOf(cVar.getContext().getColor(R.color.vk_black)))).intValue();
                        window.setStatusBarColor(intValue);
                        cVar.u(intValue);
                    }
                    colorDrawable.setAlpha((int) Math.max(127.0f, 255.0f * p2));
                    if (cVar.w()) {
                        wg10Var.setTranslationY(cVar.B);
                    } else {
                        cVar.n.setTranslationY(cVar.B);
                    }
                    cVar.n.y(p2);
                    if (p2 >= 0.5f && p2 <= 1.0f) {
                        f2 = 0.9f + (((p2 - 0.5f) / 0.5f) * 0.100000024f);
                    }
                    if (cVar.w()) {
                        wg10Var.setScaleX(f2);
                        wg10Var.setScaleY(f2);
                    } else {
                        cVar.n.setScaleX(f2);
                        cVar.n.setScaleY(f2);
                    }
                    cVar.n.P();
                    return false;
                }
            } else if (cVar.U && (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6)) {
                cVar.U = false;
                if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) && (velocityTracker = cVar.t) != null) {
                    velocityTracker.addMovement(motionEvent);
                    cVar.t.computeCurrentVelocity(1000);
                }
                if (cVar.x) {
                    VelocityTracker velocityTracker4 = cVar.t;
                    boolean z2 = velocityTracker4 == null || (Math.abs(velocityTracker4.getYVelocity()) > ((float) i3) && Math.abs(cVar.t.getYVelocity()) < ((float) i2));
                    if (gq.a(motionEvent, cVar.w) > hVar.getHeight() / 5.0f || z2) {
                        cVar.v(StoryViewAction.CLOSE_SWIPE_DOWN);
                        cVar.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cVar.t.getYVelocity(), true);
                    } else {
                        cVar.m();
                    }
                    cVar.x = false;
                } else if (cVar.y) {
                    VelocityTracker velocityTracker5 = cVar.t;
                    boolean z3 = velocityTracker5 == null || (Math.abs(velocityTracker5.getXVelocity()) > ((float) i3) && Math.abs(cVar.t.getXVelocity()) < ((float) i2));
                    if (Math.abs(cVar.z - motionEvent.getX()) > hVar.getWidth() / 3.0f || z3) {
                        qo6 currentStoryView = cVar.n.getCurrentStoryView();
                        if (motionEvent.getX() - cVar.z < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && currentStoryView != null) {
                            StoriesContainer storiesContainer = currentStoryView.getStoriesContainer();
                            StoryEntry currentStory = currentStoryView.getCurrentStory();
                            currentStoryView.I();
                            cVar.f.postDelayed(new wl40(cVar, storiesContainer, currentStory, 1), 225L);
                        }
                        cVar.v(StoryViewAction.CLOSE_SWIPE_RIGHT_OR_LEFT);
                        cVar.n(cVar.t.getXVelocity(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
                    } else {
                        cVar.m();
                    }
                    cVar.y = false;
                }
                if (motionEvent.getActionMasked() == 3 && (velocityTracker2 = cVar.t) != null) {
                    velocityTracker2.recycle();
                    cVar.t = null;
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean l(c cVar) {
        ArrayList<c> arrayList = f0;
        return arrayList.size() > 0 && xy9.b(1, arrayList) == cVar;
    }

    public static float p(float f2, int i2) {
        float f3 = i2 / 2.0f;
        return 1.0f - (Math.min(Math.abs(f2), f3) / f3);
    }

    public static int q(View view) {
        if (view == null) {
            return iah0.f().widthPixels / 2;
        }
        if (view.getScaleX() <= 0.9f) {
            return iah0.l(view);
        }
        return (view.getWidth() / 2) + iah0.l(view);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void G0(boolean z) {
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        ays aysVar = this.H;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(aysVar);
        } else {
            viewTreeObserver.removeOnGlobalLayoutListener(aysVar);
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.y8i, xsna.fcn
    public final void b(boolean z) {
        n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.n;
        if (bVar == null || !bVar.C(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void finish() {
        b(true);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final boolean g1() {
        return this.x;
    }

    @Override // xsna.ays.a
    public final boolean isPaused() {
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.n;
        boolean A = (bVar == null || bVar.getSelectedStoryView() == null) ? false : fsk.A(this.n.getSelectedStoryView().getStoriesContainer());
        if (!A) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                return false;
            }
        }
        return !A;
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void j(String str) {
        this.i.j(str);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void k(Intent intent) {
        this.h.g(9091, this.e0.a(), intent);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final u90 k1() {
        return f870.G(this.h, this.e0.a());
    }

    public final void m() {
        Object obj = w() ? this.p : this.n;
        smk0 b2 = qq2.b(obj, woo.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f, 200.0f);
        smk0 b3 = qq2.b(obj, woo.n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f, 200.0f);
        smk0 b4 = qq2.b(obj, woo.o, 1.0f, 0.6f, 200.0f);
        smk0 b5 = qq2.b(obj, woo.p, 1.0f, 0.6f, 200.0f);
        ze2.a.a(new a(b2, b3, b4, b5), b2, b3, b4, b5);
        qq2.h(b2, b3, b4, b5);
        uko.a aVar = uko.a;
        ColorDrawable colorDrawable = this.l;
        ObjectAnimator.ofInt(colorDrawable, aVar, colorDrawable.getAlpha(), 255).setDuration(225L).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(p(this.B, this.m.getHeight()), 1.0f);
        ofFloat.addUpdateListener(new l6f0(this, 2));
        ofFloat.setDuration(225L).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(float f2, float f3, boolean z) {
        zj3 zj3Var;
        smk0 smk0Var;
        com.vk.story.viewer.impl.presentation.stories.b bVar;
        Animator K0;
        final Window window;
        zj3 zj3Var2;
        ArrayList<c> arrayList = f0;
        arrayList.remove(this);
        if (w()) {
            dhr0.a.getClass();
            dhr0.X(this);
        }
        if (!w() && arrayList.isEmpty()) {
            int color = getContext().getColor(R.color.vk_clear);
            boolean L = dhr0.L();
            Activity activity = this.g;
            p90.b(activity, color, L);
            Window window2 = activity.getWindow();
            if (window2 != null) {
                p90.a(window2, color, L);
                s3q0 s3q0Var = s3q0.a;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                dhr0.s0(window3);
                window3.setStatusBarColor(color);
            }
        }
        com.vk.story.viewer.impl.presentation.stories.b bVar2 = this.n;
        if (bVar2 == null || !z) {
            dismiss();
        } else {
            View k = this.i.k(bVar2.getCurrentStoryUniqueId());
            int i2 = this.E;
            int i3 = this.F;
            sqs sqsVar = new sqs(this, k);
            boolean w = w();
            ColorDrawable colorDrawable = this.l;
            if (!w && colorDrawable.getAlpha() == 255) {
                colorDrawable.setAlpha(100);
            }
            this.s = true;
            int i4 = C1834c.a[this.P.ordinal()];
            zj3 zj3Var3 = zj3.a;
            woo.f fVar = woo.p;
            woo.e eVar = woo.o;
            woo.d dVar = woo.n;
            woo.c cVar = woo.m;
            int i5 = i2;
            if (i4 == 1) {
                boolean z2 = k != null && k.isAttachedToWindow();
                int q = z2 ? i5 < 0 ? q(k) : i5 : iah0.v() / 2;
                if (!z2) {
                    i3 = iah0.u() / 2;
                } else if (i3 < 0) {
                    i3 = r(k);
                }
                int v = iah0.v();
                int u = iah0.u();
                int i6 = v / 2;
                int i7 = u / 2;
                if (w()) {
                    boolean z3 = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    pkk pkkVar = new pkk(0.3d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0.3d, 1.0d);
                    ObjectAnimator duration = ObjectAnimator.ofInt(colorDrawable, uko.a, colorDrawable.getAlpha(), 0).setDuration(200L);
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
                    duration2.addUpdateListener(new b8q(this, 1));
                    Property property = View.SCALE_X;
                    float[] fArr = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                    wg10 wg10Var = this.p;
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) property, fArr).setDuration(200L);
                    boolean z4 = z3;
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.SCALE_Y, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
                    ObjectAnimator duration5 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, q - i6).setDuration(200L);
                    ObjectAnimator duration6 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3 - i7).setDuration(200L);
                    ObjectAnimator duration7 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(136L);
                    duration7.setStartDelay(64L);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(duration);
                    arrayList2.add(duration2);
                    arrayList2.add(duration3);
                    arrayList2.add(duration4);
                    arrayList2.add(duration5);
                    arrayList2.add(duration6);
                    arrayList2.add(duration7);
                    if (z4 && (bVar = this.n) != null && bVar.getSelectedStoryView() != null && (K0 = this.n.getSelectedStoryView().K0(false, this.m, v, u)) != null) {
                        K0.setDuration(200L);
                        arrayList2.add(K0);
                    }
                    final Window window4 = getWindow();
                    if (window4 != null) {
                        zj3Var = zj3Var3;
                        ValueAnimator duration8 = ValueAnimator.ofObject(zj3Var, Integer.valueOf(window4.getStatusBarColor()), Integer.valueOf(this.c0)).setDuration(200L);
                        duration8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.tlm0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                com.vk.story.viewer.impl.presentation.stories.c cVar2 = com.vk.story.viewer.impl.presentation.stories.c.this;
                                cVar2.getClass();
                                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                window4.setStatusBarColor(intValue);
                                cVar2.u(intValue);
                            }
                        });
                        arrayList2.add(duration8);
                        ValueAnimator duration9 = ValueAnimator.ofObject(zj3Var, Integer.valueOf(window4.getNavigationBarColor()), Integer.valueOf(this.d0)).setDuration(200L);
                        duration9.addUpdateListener(new tez(window4, 2));
                        arrayList2.add(duration9);
                    } else {
                        zj3Var = zj3Var3;
                    }
                    r28 = k != null ? cmf0.b(k, 120L) : null;
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setInterpolator(pkkVar);
                    animatorSet.addListener(new ylm0(sqsVar));
                    animatorSet.setupStartValues();
                    if (r28 == null) {
                        animatorSet.start();
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(animatorSet, r28);
                        animatorSet2.start();
                    }
                } else {
                    int i8 = i3;
                    zj3Var = zj3Var3;
                    if (k != null) {
                        k.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        k.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    smk0 b2 = qq2.b(this.n, cVar, q - i6, 0.75f, 400.0f);
                    b2.g(f2);
                    smk0 b3 = qq2.b(this.n, dVar, i8 - i7, 0.75f, 400.0f);
                    b3.g(f3);
                    smk0 b4 = qq2.b(this.n, eVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 400.0f);
                    smk0 b5 = qq2.b(this.n, fVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 400.0f);
                    if (k != null) {
                        r28 = qq2.b(k, eVar, 1.0f, 1.0f, 400.0f);
                        smk0Var = qq2.b(k, fVar, 1.0f, 1.0f, 400.0f);
                    } else {
                        smk0Var = null;
                    }
                    ze2.a.a(sqsVar, b2, b3, b4, b5, r28, smk0Var);
                    qq2.h(b2, b3, b4, b5, r28, smk0Var);
                    ObjectAnimator.ofInt(colorDrawable, uko.a, colorDrawable.getAlpha(), 0).setDuration(225L).start();
                }
            } else if (i4 != 2) {
                zj3Var = zj3Var3;
            } else {
                if (k == null) {
                    dismiss();
                    zj3Var2 = zj3Var3;
                } else {
                    boolean isAttachedToWindow = k.isAttachedToWindow();
                    if (!isAttachedToWindow) {
                        i5 = iah0.v() / 2;
                    } else if (i5 < 0) {
                        i5 = q(k);
                    }
                    int i9 = i5;
                    if (!isAttachedToWindow) {
                        i3 = iah0.u() / 2;
                    } else if (i3 < 0) {
                        i3 = r(k);
                    }
                    int width = this.n.getWidth();
                    int i10 = width / 2;
                    int height = this.n.getHeight() / 2;
                    zj3Var2 = zj3Var3;
                    float f4 = width;
                    float width2 = ((k.getWidth() - k.getPaddingLeft()) - k.getPaddingRight()) / f4;
                    int round = Math.round(this.n.getScaleX() * f4);
                    int round2 = Math.round(this.n.getTranslationX() + i10);
                    int round3 = Math.round(this.n.getTranslationY() + height);
                    float width3 = ((k.getWidth() - k.getPaddingLeft()) - k.getPaddingRight()) / round;
                    smk0 b6 = qq2.b(this.n, cVar, i9 - i10, 0.75f, 400.0f);
                    b6.g(f2);
                    smk0 b7 = qq2.b(this.n, dVar, i3 - height, 0.75f, 400.0f);
                    b7.g(f3);
                    smk0 b8 = qq2.b(this.n, eVar, width2, 0.75f, 400.0f);
                    smk0 b9 = qq2.b(this.n, fVar, width2, 0.75f, 400.0f);
                    smk0 a2 = qq2.a(this.n);
                    smk0 c = qq2.c(k, cVar, (-i9) + round2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f);
                    c.g(f2);
                    smk0 c2 = qq2.c(k, dVar, (-i3) + round3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f);
                    c2.g(f3);
                    float f5 = 1.0f / width3;
                    smk0 c3 = qq2.c(k, eVar, f5, 1.0f, 400.0f);
                    smk0 c4 = qq2.c(k, fVar, f5, 1.0f, 400.0f);
                    ze2.a.a(sqsVar, b6, b7, b8, b9, a2, c, c2, c3, c4);
                    qq2.h(b6, b7, b8, b9, a2, c, c2, c3, c4);
                    ObjectAnimator.ofInt(colorDrawable, uko.a, 0).setDuration(225L).start();
                }
                zj3Var = zj3Var2;
            }
            this.n.O();
            this.n.P();
            if (!w() && (window = getWindow()) != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(zj3Var, Integer.valueOf(window.getStatusBarColor()), 0);
                ofObject.setDuration(200L);
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.rlm0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        com.vk.story.viewer.impl.presentation.stories.c cVar2 = com.vk.story.viewer.impl.presentation.stories.c.this;
                        cVar2.getClass();
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        window.setStatusBarColor(intValue);
                        cVar2.u(intValue);
                    }
                });
                ofObject.start();
            }
        }
        ComponentCallbacks2 h2 = e3m.h(getContext());
        if (h2 instanceof ey50) {
            ((ey50) h2).Y().H(this);
        }
        this.V.a();
    }

    public final void o(View view) {
        this.s = false;
        boolean z = this.Y;
        boolean z2 = this.Z;
        if (z && !z2) {
            t();
        }
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (z2) {
            ViewGroup viewGroup = this.o;
            if (viewGroup instanceof com.vk.story.viewer.impl.presentation.stories.b) {
                ((com.vk.story.viewer.impl.presentation.stories.b) viewGroup).D();
            }
        }
        this.T.d();
        this.o = null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_ATTACHED_TO_WINDOW_DIALOG);
    }

    @Override // xsna.y8i, android.app.Dialog
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.n;
        boolean r0 = (bVar == null || bVar.getCurrentStoryView() == null) ? true : this.n.getCurrentStoryView().r0();
        if (this.s || this.T.c() || !r0) {
            return;
        }
        v(StoryViewAction.CLOSE_BACK_BUTTON);
        b(w());
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q.s();
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.q.e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_START_DIALOG);
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(@NonNull f5z f5zVar, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            WeakReference<f5z> weakReference = this.b0;
            if (weakReference != null) {
                f5z f5zVar2 = weakReference.get();
                if (f5zVar2 != null) {
                    f5zVar2.getLifecycle().removeObserver(this);
                }
                this.b0 = null;
            }
            b(false);
        }
    }

    public final int r(View view) {
        if (view == null) {
            return iah0.f().heightPixels / 2;
        }
        if (view.getScaleX() <= 0.9f) {
            return iah0.m(view);
        }
        int height = (view.getHeight() / 2) + iah0.m(view);
        Context context = getContext();
        Activity e2 = fnj.e(context);
        return height - (e2 != null ? iah0.k(e2) : fnj.a(context));
    }

    @Override // xsna.dhr0.e
    public final void sb(@NonNull VKTheme vKTheme) {
        this.c0 = dhr0.Y(R.attr.vk_ui_header_background, getContext());
        this.d0 = dhr0.Y(R.attr.vk_ui_background_content, getContext());
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.I = onDismissListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0468  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void show() {
        ArrayList<c> arrayList;
        long j;
        com.vk.story.viewer.impl.presentation.stories.b bVar;
        ComponentCallbacks2 h2;
        super.show();
        this.V.b();
        ArrayList<c> arrayList2 = f0;
        arrayList2.add(this);
        L.A("c", uq.b(arrayList2, new StringBuilder("Dialog is added to the stack, storyViewDialogStack.count = ")));
        try {
            this.g.setRequestedOrientation(7);
        } catch (IllegalStateException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("Only fullscreen activities can request orientation")) {
                throw e2;
            }
        }
        qxi.a().m();
        View k = this.i.k(this.k);
        int i2 = this.E;
        int i3 = this.F;
        boolean z = k != null;
        ulm0 ulm0Var = new ulm0(this, k);
        this.s = true;
        int i4 = C1834c.a[this.P.ordinal()];
        int i5 = 5;
        ColorDrawable colorDrawable = this.l;
        if (i4 == 1) {
            arrayList = arrayList2;
            int q = i2 < 0 ? q(k) : i2;
            if (i3 < 0) {
                i3 = r(k);
            }
            int v = iah0.v();
            int u = iah0.u();
            int i6 = v / 2;
            int i7 = u / 2;
            boolean w = w();
            wg10 wg10Var = this.p;
            if (w) {
                wg10Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                wg10Var.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                wg10Var.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                this.o.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.o.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            colorDrawable.setAlpha(0);
            if (!w()) {
                float f2 = q - i6;
                this.o.setTranslationX(f2);
                float f3 = i3 - i7;
                this.o.setTranslationY(f3);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.o, (Property<ViewGroup, Float>) View.TRANSLATION_X, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.o, (Property<ViewGroup, Float>) View.TRANSLATION_Y, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.o, (Property<ViewGroup, Float>) View.SCALE_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.o, (Property<ViewGroup, Float>) View.SCALE_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(colorDrawable, uko.a, 0, 255);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofInt);
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(new OvershootInterpolator(0.5f));
                animatorSet.addListener(new wlm0(ulm0Var));
                j = 120;
                animatorSet.setStartDelay(120L);
                animatorSet.setupStartValues();
                animatorSet.start();
                if (!w() && arrayList.size() == 1) {
                    this.f.postDelayed(new f(), j);
                }
                h2 = e3m.h(getContext());
                if (h2 instanceof ey50) {
                    ((ey50) h2).Y().S(this);
                }
                this.q.e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SHOW_DIALOG);
            }
            pkk pkkVar = new pkk(0.3d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0.3d, 1.0d);
            float f4 = q - i6;
            wg10Var.setTranslationX(f4);
            float f5 = i3 - i7;
            wg10Var.setTranslationY(f5);
            ObjectAnimator duration = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.TRANSLATION_X, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.TRANSLATION_Y, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.SCALE_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(200L);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.SCALE_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(200L);
            ObjectAnimator duration5 = ObjectAnimator.ofInt(colorDrawable, uko.a, 0, 255).setDuration(200L);
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(wg10Var, (Property<wg10, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(80L);
            ValueAnimator duration7 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(200L);
            duration7.addUpdateListener(new s9b(this, 2));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(duration);
            arrayList3.add(duration2);
            arrayList3.add(duration3);
            arrayList3.add(duration4);
            arrayList3.add(duration5);
            arrayList3.add(duration6);
            arrayList3.add(duration7);
            boolean z2 = this.Z;
            if (z2 && (bVar = this.n) != null) {
                bVar.setOpenAnimationCallback(new a4c0(this, v, u, pkkVar));
            } else if (!z2) {
                ViewParent viewParent = this.o;
                if (viewParent instanceof qo6) {
                    qo6 qo6Var = (qo6) viewParent;
                    Animator K0 = qo6Var.K0(true, this.m, v, u);
                    if (K0 != null) {
                        K0.setDuration(200L);
                        arrayList3.add(K0);
                    }
                    Animator P = qo6Var.P();
                    if (P != null) {
                        P.setDuration(200L);
                        arrayList3.add(P);
                    }
                }
            }
            final Window window = getWindow();
            if (window != null) {
                Object[] objArr = {Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(getContext().getColor(R.color.vk_black))};
                zj3 zj3Var = zj3.a;
                ValueAnimator duration8 = ValueAnimator.ofObject(zj3Var, objArr).setDuration(200L);
                duration8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.slm0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        com.vk.story.viewer.impl.presentation.stories.c cVar = com.vk.story.viewer.impl.presentation.stories.c.this;
                        cVar.getClass();
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        window.setStatusBarColor(intValue);
                        cVar.u(intValue);
                    }
                });
                arrayList3.add(duration8);
                ValueAnimator duration9 = ValueAnimator.ofObject(zj3Var, Integer.valueOf(window.getNavigationBarColor()), Integer.valueOf(getContext().getColor(R.color.vk_black))).setDuration(200L);
                duration9.addUpdateListener(new lrb0(window, i5));
                arrayList3.add(duration9);
            }
            AnimatorSet a2 = k != null ? cmf0.a(k) : null;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList3);
            animatorSet2.setInterpolator(pkkVar);
            animatorSet2.addListener(new vlm0(ulm0Var));
            animatorSet2.setStartDelay(120L);
            animatorSet2.setupStartValues();
            if (a2 == null) {
                animatorSet2.start();
            } else {
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet2, a2);
                animatorSet3.start();
            }
            this.a0 = System.currentTimeMillis();
        } else if (i4 != 2) {
            arrayList = arrayList2;
        } else if (z) {
            int q2 = i2 < 0 ? q(k) : i2;
            if (i3 < 0) {
                i3 = r(k);
            }
            int v2 = iah0.v();
            int i8 = v2 / 2;
            int u2 = iah0.u() / 2;
            float width = ((k.getWidth() - k.getPaddingLeft()) - k.getPaddingRight()) / v2;
            this.o.setScaleX(width);
            this.o.setScaleY(width);
            colorDrawable.setAlpha(0);
            this.o.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            com.vk.story.viewer.impl.presentation.stories.b bVar2 = this.n;
            if (bVar2 != null) {
                bVar2.y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.o.setTranslationX(q2 - i8);
            this.o.setTranslationY(i3 - u2);
            this.o.setScaleX(width);
            this.o.setScaleY(width);
            ViewGroup viewGroup = this.o;
            Property property = View.TRANSLATION_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ViewGroup viewGroup2 = this.o;
            Property property2 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ViewGroup viewGroup3 = this.o;
            Property property3 = View.SCALE_X;
            arrayList = arrayList2;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property3, 1.0f);
            ViewGroup viewGroup4 = this.o;
            Property property4 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property4, 1.0f);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.o, (Property<ViewGroup, Float>) View.ALPHA, 255.0f);
            k.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            k.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            k.setScaleX(1.0f);
            k.setScaleY(1.0f);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(k, (Property<View, Float>) property, (-q2) + i8);
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(k, (Property<View, Float>) property2, (-i3) + u2);
            float f6 = 1.0f / width;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(k, (Property<View, Float>) property3, f6);
            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(k, (Property<View, Float>) property4, f6);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(colorDrawable, uko.a, 255);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13, ofInt2);
            animatorSet4.setDuration(200L);
            animatorSet4.setInterpolator(new OvershootInterpolator(0.5f));
            animatorSet4.addListener(new xlm0(ulm0Var));
            animatorSet4.setStartDelay(120L);
            animatorSet4.setupStartValues();
            animatorSet4.start();
        } else {
            arrayList = arrayList2;
            o(k);
        }
        j = 120;
        if (!w()) {
            this.f.postDelayed(new f(), j);
        }
        h2 = e3m.h(getContext());
        if (h2 instanceof ey50) {
        }
        this.q.e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SHOW_DIALOG);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        float f2;
        Integer num;
        boolean w;
        vrl0 vrl0Var = this.q;
        vrl0Var.o(true);
        if (w()) {
            ViewParent viewParent = this.o;
            if (viewParent instanceof qo6) {
                f2 = ((qo6) viewParent).getCurrentHeaderAvatarScale();
                float f3 = f2;
                com.vk.story.viewer.impl.presentation.stories.b bVar = new com.vk.story.viewer.impl.presentation.stories.b(this.g, this.K, this.L, this.M, this.N, this.O, false, this, this.j, this.k, null, this.Q, this.V, this.S, new WeakReference(vrl0Var), f3);
                this.n = bVar;
                num = this.R;
                if (num != null) {
                    bVar.setForceLaunchPosition(num.intValue());
                }
                this.o = this.n;
                w = w();
                h hVar = this.m;
                if (w) {
                    hVar.removeAllViews();
                    hVar.addView(this.n);
                } else {
                    wg10 wg10Var = this.p;
                    wg10Var.removeAllViews();
                    wg10Var.addView(this.n);
                    hVar.removeAllViews();
                    hVar.addView(wg10Var);
                }
                this.n.setWindow(getWindow());
                this.n.N();
                vrl0Var.o(false);
            }
        }
        f2 = 1.0f;
        float f32 = f2;
        com.vk.story.viewer.impl.presentation.stories.b bVar2 = new com.vk.story.viewer.impl.presentation.stories.b(this.g, this.K, this.L, this.M, this.N, this.O, false, this, this.j, this.k, null, this.Q, this.V, this.S, new WeakReference(vrl0Var), f32);
        this.n = bVar2;
        num = this.R;
        if (num != null) {
        }
        this.o = this.n;
        w = w();
        h hVar2 = this.m;
        if (w) {
        }
        this.n.setWindow(getWindow());
        this.n.N();
        vrl0Var.o(false);
    }

    public final void u(int i2) {
        Window window;
        Activity activity = this.g;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(i2);
    }

    public final void v(StoryViewAction storyViewAction) {
        StoryEntry currentStoryEntry = this.n.getCurrentStoryEntry();
        this.S.b().t(storyViewAction, this.n.getViewEntryPoint(), currentStoryEntry, this.n.B(), this.M, new com.vk.movika.sdk.base.logic.interactor.i(28, this, storyViewAction));
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    public final boolean w() {
        return this.K == MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST && this.P == StoryViewerRouter.InOutAnimation.PointToFullScreen;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
