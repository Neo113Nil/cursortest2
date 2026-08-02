package com.vk.photoviewer;

import android.animation.AnimatorSet;
import android.animation.FloatArrayEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.photoviewer.PhotoViewer;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aea0;
import xsna.an10;
import xsna.asp;
import xsna.awt0;
import xsna.bpn0;
import xsna.c220;
import xsna.c5g;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.f0z;
import xsna.f56;
import xsna.fnw;
import xsna.gcn;
import xsna.ggs;
import xsna.gz80;
import xsna.gzs;
import xsna.hfr;
import xsna.i0q0;
import xsna.i5g;
import xsna.id;
import xsna.ie40;
import xsna.izs;
import xsna.j5g;
import xsna.jjx;
import xsna.jsk;
import xsna.kl2;
import xsna.kvt0;
import xsna.mcr0;
import xsna.mrx0;
import xsna.n14;
import xsna.obh;
import xsna.okk;
import xsna.q4a0;
import xsna.qnj;
import xsna.rli0;
import xsna.s3q0;
import xsna.sk4;
import xsna.sns0;
import xsna.tnf;
import xsna.twt0;
import xsna.uq50;
import xsna.uy80;
import xsna.wp40;
import xsna.x6e0;
import xsna.x9g0;
import xsna.xgv;
import xsna.xh5;
import xsna.xy80;
import xsna.yg5;
import xsna.z260;
import xsna.z7w;
import xsna.znk0;
import xsna.zrp;
import xsna.zu3;

/* compiled from: PhotoViewer.kt */
/* loaded from: classes3.dex */
public final class PhotoViewer implements ViewPager.j {
    public static final RectF U = new RectF();
    public final View A;
    public final View B;
    public final PhotoViewPager C;
    public final Toolbar D;
    public final TextView E;
    public final PickPositionOverlayView F;
    public final TextView G;
    public final View H;
    public final View I;
    public final ArrayList J;
    public g K;
    public boolean L;
    public boolean M;
    public mrx0 N;
    public float O;
    public boolean P;
    public boolean Q;
    public float R;
    public final i S;
    public final j T;
    public final Context b;
    public final b c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public boolean g;
    public final uy80 h;
    public final Integer i;
    public final xy80 j;
    public final Handler k;
    public Object l;
    public final okk m;
    public final c220 n;
    public final z7w o;
    public final ArrayList p;
    public final q4a0 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public final WindowManager v;
    public final PhotoViewerLayout w;
    public final View x;
    public final View y;
    public final View z;

    /* compiled from: PhotoViewer.kt */
    public static final class AnimationState {
        public final View a;
        public final sns0 b;
        public final VideoGifState c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PhotoViewer.kt */
        public static final class VideoGifState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ VideoGifState[] $VALUES;
            public static final VideoGifState PLAY_ON_FINISH_ANIMATION;
            public static final VideoGifState PLAY_ON_START_ANIMATION;

            static {
                VideoGifState videoGifState = new VideoGifState("PLAY_ON_START_ANIMATION", 0);
                PLAY_ON_START_ANIMATION = videoGifState;
                VideoGifState videoGifState2 = new VideoGifState("PLAY_ON_FINISH_ANIMATION", 1);
                PLAY_ON_FINISH_ANIMATION = videoGifState2;
                VideoGifState[] videoGifStateArr = {videoGifState, videoGifState2};
                $VALUES = videoGifStateArr;
                $ENTRIES = new asp(videoGifStateArr);
            }

            public VideoGifState() {
                throw null;
            }

            public static VideoGifState valueOf(String str) {
                return (VideoGifState) Enum.valueOf(VideoGifState.class, str);
            }

            public static VideoGifState[] values() {
                return (VideoGifState[]) $VALUES.clone();
            }
        }

        public AnimationState(View view, sns0 sns0Var, VideoGifState videoGifState) {
            this.a = view;
            this.b = sns0Var;
            this.c = videoGifState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimationState)) {
                return false;
            }
            AnimationState animationState = (AnimationState) obj;
            return epx.f(this.a, animationState.a) && epx.f(this.b, animationState.b) && this.c == animationState.c;
        }

        public final int hashCode() {
            View view = this.a;
            int hashCode = (view == null ? 0 : view.hashCode()) * 31;
            sns0 sns0Var = this.b;
            int hashCode2 = (hashCode + (sns0Var == null ? 0 : sns0Var.hashCode())) * 31;
            VideoGifState videoGifState = this.c;
            return hashCode2 + (videoGifState != null ? videoGifState.hashCode() : 0);
        }

        public final String toString() {
            return "AnimationState(previewView=" + this.a + ", videoGifPreviewView=" + this.b + ", videoGifState=" + this.c + ')';
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final class c {
        public static WindowManager.LayoutParams a() {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, -2013134846, 1);
            layoutParams.softInputMode = 1;
            layoutParams.dimAmount = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (gz80.a(28)) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            return layoutParams;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public interface d {
        RectF a();
    }

    /* compiled from: PhotoViewer.kt */
    public interface e extends g {
        String b();

        String c();
    }

    /* compiled from: PhotoViewer.kt */
    public interface f extends g {
    }

    /* compiled from: PhotoViewer.kt */
    public interface g {
        String a();

        String d();

        String e();

        List<String> f();

        default boolean g() {
            return getWidth() <= 0 || getHeight() <= 0;
        }

        int getHeight();

        int getWidth();
    }

    /* compiled from: PhotoViewer.kt */
    public interface h extends g {
        VideoFile A();

        long y();
    }

    /* compiled from: PhotoViewer.kt */
    public interface i {
        void a(PointF pointF);
    }

    /* compiled from: PhotoViewer.kt */
    public interface j {
        void a(TextView textView, CharSequence charSequence);

        void b(TextView textView);
    }

    /* compiled from: PhotoViewer.kt */
    public final class k implements i {
        public k() {
        }

        @Override // com.vk.photoviewer.PhotoViewer.i
        public final void a(PointF pointF) {
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.D.getVisibility() == 0) {
                photoViewer.h();
            } else {
                photoViewer.t();
            }
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final class l implements j {
        @Override // com.vk.photoviewer.PhotoViewer.j
        public final void a(TextView textView, CharSequence charSequence) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }

        @Override // com.vk.photoviewer.PhotoViewer.j
        public final void b(TextView textView) {
            textView.setVisibility(8);
        }
    }

    /* compiled from: PhotoViewer.kt */
    public interface m extends g {
    }

    /* compiled from: PhotoViewer.kt */
    public interface n extends g {
        yg5 j();
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer photoViewer = (PhotoViewer) this.receiver;
            RectF rectF = PhotoViewer.U;
            ggs ggsVar = photoViewer.q.k.get(photoViewer.r);
            if ((ggsVar instanceof sns0 ? (sns0) ggsVar : null) != null && photoViewer.p.size() == 1) {
                ggs ggsVar2 = photoViewer.q.k.get(photoViewer.r);
                sns0 sns0Var = ggsVar2 instanceof sns0 ? (sns0) ggsVar2 : null;
                if (sns0Var != null) {
                    sns0Var.i();
                }
                i0q0.d(200L, new id(photoViewer, 10));
            }
            return s3q0.a;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer.b((PhotoViewer) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final class q implements d {
        public final /* synthetic */ int b;

        public q(int i) {
            this.b = i;
        }

        @Override // com.vk.photoviewer.PhotoViewer.d
        public final RectF a() {
            PhotoViewer photoViewer = PhotoViewer.this;
            ggs ggsVar = photoViewer.q.k.get(this.b);
            fnw fnwVar = ggsVar instanceof fnw ? (fnw) ggsVar : null;
            RectF displayRect = fnwVar != null ? fnwVar.getDisplayRect() : null;
            if (displayRect == null) {
                return null;
            }
            RectF rectF = PhotoViewer.U;
            rectF.set(displayRect);
            rectF.top = photoViewer.C.getTranslationY() + rectF.top;
            rectF.bottom = photoViewer.C.getTranslationY() + rectF.bottom;
            float f = rectF.left;
            int i = photoViewer.u;
            rectF.left = f - i;
            rectF.right -= i;
            return rectF;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer.a((PhotoViewer) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer.b((PhotoViewer) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer photoViewer = (PhotoViewer) this.receiver;
            RectF rectF = PhotoViewer.U;
            photoViewer.w.setAlpha(1.0f);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoViewer.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PhotoViewer.a((PhotoViewer) this.receiver);
            return s3q0.a;
        }
    }

    public PhotoViewer() {
        throw null;
    }

    public PhotoViewer(int i2, ArrayList arrayList, Context context, b bVar, boolean z, boolean z2, int i3) {
        xy80 xy80Var;
        boolean z3 = (i3 & 16) != 0 ? false : z;
        boolean z4 = (i3 & 32) != 0 ? false : z2;
        boolean z5 = (i3 & 64) == 0;
        this.b = context;
        this.c = bVar;
        this.d = z3;
        this.e = z4;
        this.f = true;
        uy80 uy80Var = new uy80(context, this);
        this.h = uy80Var;
        this.k = new Handler(Looper.getMainLooper());
        PointF pointF = new PointF((float) 0.58d, (float) 0.77d);
        PointF pointF2 = new PointF((float) 0.5d, (float) 1.0d);
        okk okkVar = new okk();
        okkVar.c = new PointF();
        okkVar.d = new PointF();
        okkVar.e = new PointF();
        float f2 = pointF.x;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f3 = pointF2.x;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        okkVar.a = pointF;
        okkVar.b = pointF2;
        this.m = okkVar;
        this.n = new c220(12);
        this.o = new z7w(15);
        this.r = i2;
        this.t = -1;
        this.v = (WindowManager) context.getSystemService("window");
        this.R = 1.0f;
        this.S = new k();
        this.T = new l();
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.p = arrayList2;
        g gVar = (g) arrayList2.get(i2);
        this.K = gVar;
        bVar.q(gVar);
        Activity u2 = u(context);
        this.i = u2 != null ? Integer.valueOf(u2.getRequestedOrientation()) : null;
        if (!BuildInfo.s()) {
            uy80Var.d = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
        }
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        PhotoViewerLayout photoViewerLayout = (PhotoViewerLayout) layoutInflater.inflate(R.layout.photo_viewer_layout, (ViewGroup) null);
        this.w = photoViewerLayout;
        View findViewById = photoViewerLayout.findViewById(R.id.pv_dim);
        this.x = findViewById;
        View findViewById2 = photoViewerLayout.findViewById(R.id.pv_content_scrim);
        this.y = findViewById2;
        View findViewById3 = photoViewerLayout.findViewById(R.id.pv_bottom_nav_scrim);
        this.z = findViewById3;
        View findViewById4 = photoViewerLayout.findViewById(R.id.pv_left_nav_scrim);
        this.A = findViewById4;
        View findViewById5 = photoViewerLayout.findViewById(R.id.pv_right_nav_scrim);
        this.B = findViewById5;
        Toolbar toolbar = (Toolbar) photoViewerLayout.findViewById(R.id.pv_toolbar);
        this.D = toolbar;
        TextView textView = (TextView) photoViewerLayout.findViewById(R.id.pv_title);
        this.E = textView;
        PhotoViewPager photoViewPager = (PhotoViewPager) photoViewerLayout.findViewById(R.id.pv_view_pager);
        this.C = photoViewPager;
        View s2 = bVar.s(photoViewerLayout);
        View view = s2 == null ? new View(context) : s2;
        this.H = view;
        photoViewerLayout.addView(view);
        View D = bVar.D(photoViewerLayout);
        View view2 = view;
        View view3 = D == null ? new View(context) : D;
        this.I = view3;
        if (z5) {
            photoViewerLayout.addView(view3, photoViewerLayout.indexOfChild(photoViewPager) + 1);
        } else {
            photoViewerLayout.addView(view3);
        }
        PickPositionOverlayView pickPositionOverlayView = (PickPositionOverlayView) photoViewerLayout.findViewById(R.id.pick_position_overlay);
        this.F = pickPositionOverlayView;
        View view4 = view3;
        this.G = (TextView) photoViewerLayout.findViewById(R.id.attach_prompt);
        int i4 = 8;
        ArrayList o2 = e43.o(findViewById, findViewById2, toolbar, textView, view2, view4, findViewById3, findViewById4, findViewById5);
        this.J = o2;
        if (bVar.N()) {
            textView.setVisibility(8);
            o2.remove(textView);
        }
        photoViewerLayout.setSystemUiVisibility(CoverVideoUploadTask.y);
        photoViewerLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.yda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view5, WindowInsets windowInsets) {
                int stableInsetTop = windowInsets.getStableInsetTop();
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                int stableInsetRight = windowInsets.getStableInsetRight();
                int stableInsetLeft = windowInsets.getStableInsetLeft();
                PhotoViewer photoViewer = PhotoViewer.this;
                View view6 = photoViewer.y;
                view6.getLayoutParams().height = stableInsetTop;
                photoViewer.z.getLayoutParams().height = systemWindowInsetBottom;
                photoViewer.A.getLayoutParams().width = stableInsetLeft;
                photoViewer.B.getLayoutParams().width = stableInsetRight;
                View view7 = photoViewer.H;
                twt0.f(stableInsetTop, view7);
                Toolbar toolbar2 = photoViewer.D;
                twt0.f(stableInsetTop, toolbar2);
                TextView textView2 = photoViewer.E;
                twt0.f(stableInsetTop, textView2);
                ViewGroup.LayoutParams layoutParams = view7.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = systemWindowInsetBottom;
                }
                twt0.d(stableInsetLeft, view6);
                twt0.d(stableInsetLeft, view7);
                twt0.d(stableInsetLeft, toolbar2);
                twt0.d(stableInsetLeft, textView2);
                twt0.e(stableInsetRight, view6);
                twt0.e(stableInsetRight, view7);
                twt0.e(stableInsetRight, toolbar2);
                twt0.e(stableInsetRight, textView2);
                int a2 = e3m.a(R.dimen.pick_position_prompt_bottom_margin, photoViewer.w.getContext()) + systemWindowInsetBottom;
                ViewGroup.LayoutParams layoutParams2 = photoViewer.G.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = a2;
                }
                photoViewer.s = systemWindowInsetBottom > iah0.a((float) 100);
                return windowInsets;
            }
        });
        photoViewerLayout.addOnAttachStateChangeListener(new com.vk.photoviewer.c(this));
        photoViewerLayout.setOnKeyListener(new kvt0(new uq50(this, 12)));
        photoViewerLayout.setFocusable(true);
        photoViewerLayout.setFocusableInTouchMode(true);
        photoViewerLayout.requestFocus();
        toolbar.setNavigationOnClickListener(new jsk(this, i4));
        Activity u3 = u(context);
        if (u3 != null) {
            xy80Var = new xy80(u3);
            xy80Var.enable();
        } else {
            xy80Var = null;
        }
        this.j = xy80Var;
        Activity u4 = u(context);
        q4a0 q4a0Var = new q4a0(arrayList, view2, view4, layoutInflater, bVar, this, xy80Var, (u4 == null || (u4.getWindow().getAttributes().flags & 8192) == 0) ? false : true);
        this.q = q4a0Var;
        photoViewPager.setPageMargin((int) (16 * context.getResources().getDisplayMetrics().density));
        photoViewPager.setAdapter(q4a0Var);
        photoViewPager.setCurrentItem(i2);
        photoViewPager.setOffscreenPageLimit(2);
        photoViewPager.addOnPageChangeListener(this);
        View.OnTouchListener gcnVar = new gcn(new com.vk.photoviewer.d(this));
        photoViewerLayout.setContextMenuCreator(new qnj(context));
        photoViewerLayout.setInterceptToucheEventListener(gcnVar);
        photoViewerLayout.setOnTouchListener(gcnVar);
        onPageSelected(i2);
        pickPositionOverlayView.setMarkerFractionPositionListener(new zu3(this, 14));
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.zda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                PhotoViewer photoViewer = PhotoViewer.this;
                q4a0 q4a0Var2 = photoViewer.q;
                int z6 = photoViewer.c.z();
                SparseArray<ggs> sparseArray = q4a0Var2.k;
                Integer num = q4a0Var2.p;
                ggs ggsVar = sparseArray.get(num != null ? num.intValue() : 0);
                k120 k120Var = ggsVar instanceof k120 ? (k120) ggsVar : null;
                if (k120Var != null) {
                    k120Var.setPlayerControlsBottomPadding(z6);
                }
                Integer num2 = q4a0Var2.p;
                ggs ggsVar2 = sparseArray.get(num2 != null ? num2.intValue() : 0);
                fnw fnwVar = ggsVar2 instanceof fnw ? (fnw) ggsVar2 : null;
                if (fnwVar != null) {
                    q4a0.this.e.C(z6);
                }
            }
        });
    }

    public static final void a(PhotoViewer photoViewer) {
        photoViewer.c.H(photoViewer);
        q4a0 q4a0Var = photoViewer.q;
        int i2 = photoViewer.r;
        q4a0Var.o = true;
        SparseArray<ggs> sparseArray = q4a0Var.k;
        ggs ggsVar = sparseArray.get(i2);
        if (ggsVar != null) {
            ggsVar.setAlpha(1.0f);
        }
        ggs ggsVar2 = sparseArray.get(i2);
        fnw fnwVar = ggsVar2 instanceof fnw ? (fnw) ggsVar2 : null;
        if (fnwVar != null) {
            fnwVar.setZoomable(q4a0Var.m.get(i2));
        }
        q4a0Var.c(i2);
        photoViewer.l = null;
        photoViewer.r(1.0f, photoViewer.r);
        photoViewer.g = true;
        if (q4a0Var.n.get(photoViewer.r, false)) {
            photoViewer.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, photoViewer.r);
        }
    }

    public static final void b(PhotoViewer photoViewer) {
        twt0.c(photoViewer.C, 50L, null, 6).withStartAction(new tnf(photoViewer, 7)).withEndAction(new kl2(photoViewer, 6));
    }

    public static void d(PhotoViewer photoViewer, View view, x6e0 x6e0Var, com.vk.movika.sdk.base.ui.i iVar, gzs gzsVar, int i2) {
        Iterable iterable;
        gzs sk4Var = (i2 & 8) != 0 ? new sk4(29) : iVar;
        boolean z = (i2 & 32) == 0;
        photoViewer.e(view);
        if (!z) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ArrayList arrayList = photoViewer.J;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ObjectAnimator.ofFloat((View) it.next(), (Property<View, Float>) View.ALPHA, x6e0Var.a, x6e0Var.b));
        }
        PhotoViewPager photoViewPager = photoViewer.C;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(photoViewPager, (Property<PhotoViewPager, Float>) View.TRANSLATION_Y, photoViewPager.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, view.getRotation(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Property property = View.X;
        float f2 = x6e0Var.c;
        float f3 = x6e0Var.n;
        float f4 = x6e0Var.m;
        List l2 = e43.l(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2, x6e0Var.e), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, x6e0Var.d, x6e0Var.f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f4, f3), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f4, f3));
        if (view instanceof ClippingImageView) {
            ClippingImageView clippingImageView = (ClippingImageView) view;
            iterable = e43.l(ObjectAnimator.ofInt(clippingImageView, "clipX", x6e0Var.g, x6e0Var.h), ObjectAnimator.ofInt(clippingImageView, "clipTop", x6e0Var.i, x6e0Var.j), ObjectAnimator.ofInt(clippingImageView, "clipBottom", x6e0Var.k, x6e0Var.l), ObjectAnimator.ofObject(clippingImageView, "corners", new FloatArrayEvaluator(), x6e0Var.o, x6e0Var.p));
        } else {
            iterable = EmptyList.b;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j5g.u0(iterable, j5g.u0(l2, arrayList2)));
        animatorSet.setInterpolator(photoViewer.m);
        animatorSet.setDuration(250L);
        animatorSet.addListener(new aea0(gzsVar));
        animatorSet.start();
        sk4Var.invoke();
        photoViewer.l = animatorSet;
    }

    public static Activity u(Context context) {
        boolean z;
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    public final void c(final gzs gzsVar, final izs izsVar, final gzs gzsVar2, boolean z) {
        final AnimationState animationState;
        final x6e0 a2 = com.vk.photoviewer.a.a(q(this.x.getAlpha()), this.K, false);
        int i2 = this.r;
        q4a0 q4a0Var = this.q;
        ClippingImageView clippingImageView = q4a0Var.l.get(i2);
        ggs ggsVar = q4a0Var.k.get(this.r);
        sns0 sns0Var = ggsVar instanceof sns0 ? (sns0) ggsVar : null;
        if (sns0Var != null) {
            yg5 j2 = sns0Var.getGif().j();
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var = b.C1208b.a().c;
            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
            if (epx.f(yg5Var, j2) && yg5Var.p() && this.p.size() == 1) {
                animationState = new AnimationState(sns0Var, sns0Var, z ? AnimationState.VideoGifState.PLAY_ON_START_ANIMATION : null);
            } else {
                animationState = new AnimationState(clippingImageView, sns0Var, z ? AnimationState.VideoGifState.PLAY_ON_FINISH_ANIMATION : null);
            }
        } else {
            animationState = new AnimationState(clippingImageView, null, null);
        }
        final View view = animationState.a;
        if (view == null) {
            return;
        }
        twt0.g(a2.q, a2.r, view);
        awt0.t(view, new gzs(view, izsVar, a2, gzsVar, animationState, gzsVar2) { // from class: xsna.xda0
            public final /* synthetic */ View c;
            public final /* synthetic */ izs d;
            public final /* synthetic */ x6e0 e;
            public final /* synthetic */ FunctionReferenceImpl f;
            public final /* synthetic */ PhotoViewer.AnimationState g;
            public final /* synthetic */ FunctionReferenceImpl h;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f = (FunctionReferenceImpl) gzsVar;
                this.g = animationState;
                this.h = (FunctionReferenceImpl) gzsVar2;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            @Override // xsna.gzs
            public final Object invoke() {
                PhotoViewer photoViewer = PhotoViewer.this;
                q4a0 q4a0Var2 = photoViewer.q;
                ggs ggsVar2 = q4a0Var2.k.get(photoViewer.r);
                if (ggsVar2 != null) {
                    ggsVar2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                x6e0 x6e0Var = (x6e0) this.d.invoke(this.e);
                ?? r1 = this.f;
                PhotoViewer.AnimationState animationState2 = this.g;
                PhotoViewer.d(photoViewer, this.c, x6e0Var, new com.vk.movika.sdk.base.ui.i(r1, animationState2), new dp0((gzs) this.h, animationState2), 32);
                return s3q0.a;
            }
        });
    }

    public final void e(View view) {
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        view.animate().cancel();
        view.setVisibility(this.c.u(this.r) ? 4 : 0);
        view.setAlpha(1.0f);
    }

    public final WindowManager.LayoutParams f() {
        Activity u2 = u(this.b);
        boolean z = false;
        if (u2 != null && (u2.getWindow().getAttributes().flags & 8192) != 0) {
            z = true;
        }
        b bVar = this.c;
        WindowManager.LayoutParams k2 = bVar.k();
        if (z || !bVar.l()) {
            int i2 = k2.flags;
            if ((i2 & 8192) == 0) {
                k2.flags = i2 | 8192;
            }
        }
        return k2;
    }

    public final void g(boolean z) {
        if (this.w.isAttachedToWindow() && this.l == null) {
            if (z) {
                c(new o(0, this, PhotoViewer.class, "onHideAnimation", "onHideAnimation()V", 0), this.o, new p(0, this, PhotoViewer.class, "onFinishScaleOut", "onFinishScaleOut()V", 0), false);
            } else {
                l();
                k();
            }
            twt0.a(this.E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31);
        }
    }

    public final void h() {
        if (!this.L && this.D.getVisibility() == 0) {
            this.w.setSystemUiVisibility(5382);
            hfr.a aVar = new hfr.a(rli0.l(rli0.l(rli0.l(new i5g(this.J), new xgv(this, 20)), new f0z(this, 21)), new jjx(this, 24)));
            while (aVar.hasNext()) {
                twt0.c((View) aVar.next(), 150L, null, 6);
            }
            this.c.P(false);
        }
    }

    public final void i() {
        this.L = false;
        this.M = false;
        this.f = true;
        PickPositionOverlayView pickPositionOverlayView = this.F;
        pickPositionOverlayView.e = -1.0f;
        pickPositionOverlayView.f = -1.0f;
        pickPositionOverlayView.setVisibility(8);
        onPageSelected(this.r);
        this.D.setNavigationIcon(R.drawable.vk_icon_arrow_left_outline_28);
        j();
        this.H.setVisibility(0);
        this.I.setVisibility(0);
        this.T.b(this.G);
    }

    public final void j() {
        Toolbar toolbar = this.D;
        toolbar.getMenu().clear();
        int i2 = this.r;
        b bVar = this.c;
        if (bVar.F(i2) != 0) {
            toolbar.l(bVar.F(this.r));
            toolbar.setOnMenuItemClickListener(new ie40(this, 6));
            bVar.o((g) this.p.get(this.r), this.r, toolbar.getMenu());
        }
    }

    public final void k() {
        this.h.e.dispose();
        Integer num = this.i;
        if (num != null) {
            int intValue = num.intValue();
            Activity u2 = u(this.b);
            if (u2 != null) {
                u2.setRequestedOrientation(intValue);
            }
        }
        q4a0 q4a0Var = this.q;
        SparseArray<ggs> sparseArray = q4a0Var.k;
        Integer num2 = q4a0Var.p;
        ggs ggsVar = sparseArray.get(num2 != null ? num2.intValue() : 0);
        if (ggsVar != null) {
            ggsVar.b();
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.valueAt(i2).a();
        }
        xy80 xy80Var = this.j;
        if (xy80Var != null) {
            xy80Var.b(-1);
            xy80Var.disable();
        }
        PhotoViewerLayout photoViewerLayout = this.w;
        if (photoViewerLayout.isAttachedToWindow()) {
            this.v.removeViewImmediate(photoViewerLayout);
        }
        this.l = null;
        this.g = false;
    }

    public final void l() {
        r(1.0f, this.r);
        this.k.removeCallbacksAndMessages(null);
        boolean h2 = this.c.h();
        PhotoViewerLayout photoViewerLayout = this.w;
        if (h2) {
            photoViewerLayout.setSystemUiVisibility(CoverVideoUploadTask.y);
        } else {
            photoViewerLayout.setSystemUiVisibility(5382);
        }
    }

    public final void m(int i2) {
        Activity u2;
        if (this.c.J() && (u2 = u(this.b)) != null) {
            try {
                u2.setRequestedOrientation(i2 != 0 ? i2 != 1 ? i2 != 3 ? u2.getRequestedOrientation() : 0 : 8 : 1);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void n(PointF pointF) {
        if (this.s) {
            return;
        }
        this.S.a(pointF);
    }

    public final void o(boolean z) {
        x6e0 x6e0Var;
        ClippingImageView clippingImageView = this.q.l.get(this.r);
        boolean z2 = true;
        if (clippingImageView == null || !this.Q || !this.g) {
            this.P = true;
            if (this.Q && this.g) {
                l();
                k();
                return;
            }
            return;
        }
        if (z) {
            this.R = 1.0f;
        }
        mrx0 mrx0Var = this.N;
        if (mrx0Var == null) {
            mrx0Var = null;
        }
        float alpha = this.x.getAlpha();
        float f2 = this.O;
        float f3 = mrx0Var.f;
        float f4 = mrx0Var.e;
        Rect rect = mrx0Var.a;
        RectF rectF = mrx0Var.b;
        if (this.e || (z ? f2 <= 1.0f : alpha <= 0.1f)) {
            z2 = false;
        }
        Pair pair = z2 ? new Pair(Float.valueOf(alpha), Float.valueOf(1.0f)) : new Pair(Float.valueOf(alpha), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        float width = ((rectF.width() - f4) / 2.0f) + rectF.left;
        float height = ((rectF.height() - f3) / 2.0f) + rectF.top;
        if (rect == null) {
            float x = clippingImageView.getX();
            float f5 = z2 ? width : 0.0f;
            float y = clippingImageView.getY();
            if (!z2) {
                height = rectF.height();
            }
            x6e0Var = new x6e0(floatValue, floatValue2, x, y, f5, height, 0, 0, 0, clippingImageView.getScaleX(), null, (int) f4, (int) f3, 61376);
        } else {
            x6e0Var = new x6e0(floatValue, floatValue2, clippingImageView.getX(), clippingImageView.getY(), z2 ? width : rect.centerX() - (rect.width() / 2.0f), z2 ? height : rect.centerY() - (rect.height() / 2.0f), 0, 0, 0, clippingImageView.getScaleX(), null, (int) f4, (int) f3, 61376);
        }
        if (x6e0Var.b != 1.0f) {
            d(this, clippingImageView, x6e0Var, null, new s(0, this, PhotoViewer.class, "onFinishScaleOut", "onFinishScaleOut()V", 0), 8);
        } else {
            twt0.g(x6e0Var.q, x6e0Var.r, clippingImageView);
            awt0.t(clippingImageView, new f56(this, clippingImageView, x6e0Var, 3));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i2) {
        int i3;
        if (i2 != 0 || (i3 = this.t) == this.r) {
            return;
        }
        ggs ggsVar = this.q.k.get(i3);
        fnw fnwVar = ggsVar instanceof fnw ? (fnw) ggsVar : null;
        if (fnwVar != null) {
            fnwVar.m.m.i(1.0f);
        }
        this.t = this.r;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i2, float f2, int i3) {
        ArrayList arrayList = this.p;
        this.K = (f2 < 1.0f || i2 == e43.h(arrayList)) ? (g) arrayList.get(i2) : (g) arrayList.get(i2 + 1);
        int i4 = this.r;
        if (i4 != i2) {
            if (i2 == i4 - 1) {
                PhotoViewPager photoViewPager = this.C;
                i3 = (i3 - photoViewPager.getPageMargin()) - photoViewPager.getMeasuredWidth();
            } else {
                i3 = 0;
            }
        }
        this.u = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    @Override // androidx.viewpager.widget.ViewPager.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageSelected(int i2) {
        boolean z;
        ImageViewer.SwipeDirection swipeDirection;
        ggs ggsVar;
        boolean z2 = false;
        boolean z3 = this.t == -1;
        this.t = this.r;
        this.r = i2;
        ArrayList arrayList = this.p;
        this.K = (g) arrayList.get(i2);
        b bVar = this.c;
        Integer f2 = bVar.f();
        int intValue = f2 != null ? f2.intValue() : arrayList.size();
        String m2 = bVar.m(i2, intValue);
        if (bVar.N()) {
            Toolbar toolbar = this.D;
            toolbar.setTitle(m2);
            toolbar.setSubtitle(bVar.p(i2, intValue));
        } else {
            this.E.setText(m2);
        }
        j();
        q qVar = new q(i2);
        int i3 = this.r;
        q4a0 q4a0Var = this.q;
        SparseBooleanArray sparseBooleanArray = q4a0Var.n;
        SparseArray<ggs> sparseArray = q4a0Var.k;
        if (sparseBooleanArray.get(i3, false)) {
            r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.r);
        } else {
            r(1.0f, this.r);
        }
        r(1.0f, this.t);
        int i4 = this.t;
        if (i4 != i2 && (ggsVar = sparseArray.get(i4)) != null) {
            ggsVar.b();
        }
        ggs ggsVar2 = sparseArray.get(i2);
        if (ggsVar2 != null) {
            ggsVar2.d();
        }
        q4a0Var.i = qVar;
        bVar.n(i2, qVar);
        bVar.e(i2);
        if (this.r >= arrayList.size() - 2) {
            bVar.A();
        }
        if (z3 || this.t != this.r) {
            if (!z3) {
                int i5 = this.t;
                int i6 = this.r;
                if (i5 > i6 && i6 <= 2) {
                    z = true;
                    if (!z3) {
                        int i7 = this.t;
                        int i8 = this.r;
                        if (i7 < i8 && i8 >= arrayList.size() - 3) {
                            z2 = true;
                        }
                    }
                    if (!z) {
                        swipeDirection = ImageViewer.SwipeDirection.LEFT;
                    } else if (z2) {
                        swipeDirection = ImageViewer.SwipeDirection.RIGHT;
                    } else if (z3) {
                        swipeDirection = ImageViewer.SwipeDirection.INITIAL;
                    }
                    bVar.M(swipeDirection, this.d);
                }
            }
            z = false;
            if (!z3) {
            }
            if (!z) {
            }
            bVar.M(swipeDirection, this.d);
        }
        this.F.setDisplayRectProvider(qVar);
    }

    public final void p() {
        PhotoViewerLayout photoViewerLayout = this.w;
        Activity b2 = enj.b(photoViewerLayout);
        if (b2 == null || b2.isFinishing() || b2.isDestroyed()) {
            return;
        }
        this.g = false;
        j();
        photoViewerLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.v.addView(photoViewerLayout, f());
        awt0.t(photoViewerLayout, new z260(this, 10));
    }

    public final mrx0 q(float f2) {
        Matrix matrix;
        Rect rect;
        Pair pair;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        int i2 = this.r;
        g gVar = this.K;
        q4a0 q4a0Var = this.q;
        ggs ggsVar = q4a0Var.k.get(i2);
        fnw fnwVar = ggsVar instanceof fnw ? (fnw) ggsVar : null;
        if (fnwVar == null || (matrix = fnwVar.getTransformMatrix()) == null) {
            matrix = new Matrix();
        }
        View view = (View) j5g.a0(q4a0Var.b(i2));
        matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view != null ? view.getTranslationY() : 0.0f);
        b bVar = this.c;
        Rect d2 = bVar.d(i2);
        if (d2 == null) {
            View c2 = bVar.c(i2);
            rect = c2 != null ? znk0.y(c2) : null;
        } else {
            rect = d2;
        }
        int[] iArr = znk0.b;
        this.C.getLocationOnScreen(iArr);
        float f3 = iArr[0];
        float f4 = iArr[1];
        RectF rectF = new RectF(f3, f4, r6.getMeasuredWidth() + f3, r6.getMeasuredHeight() + f4);
        matrix.mapRect(rectF);
        float width = rectF.width();
        float height = rectF.height();
        if (width / height > gVar.getWidth() / gVar.getHeight()) {
            width = (gVar.getWidth() / gVar.getHeight()) * height;
        } else {
            height = width / (gVar.getWidth() / gVar.getHeight());
        }
        float f5 = width;
        float f6 = height;
        int i3 = Build.VERSION.SDK_INT;
        WindowManager windowManager = this.v;
        if (i3 >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            pair = new Pair(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            pair = new Pair(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        Rect g2 = bVar.g();
        float[] r2 = bVar.r(i2);
        if (r2 == null) {
            r2 = new float[8];
        }
        return new mrx0(rect, rectF, g2, r2, f5, f6, f2, intValue, intValue2);
    }

    public final void r(float f2, int i2) {
        View c2 = this.c.c(i2);
        if (c2 != null) {
            c2.setAlpha(f2);
        }
    }

    public final void s() {
        PhotoViewerLayout photoViewerLayout = this.w;
        Activity b2 = enj.b(photoViewerLayout);
        if (b2 == null || b2.isFinishing() || b2.isDestroyed()) {
            return;
        }
        this.g = false;
        j();
        photoViewerLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.v.addView(photoViewerLayout, f());
        awt0.t(photoViewerLayout, new wp40(this, 11));
    }

    public final void t() {
        if (this.L || this.D.getVisibility() == 0) {
            return;
        }
        this.w.setSystemUiVisibility(CoverVideoUploadTask.y);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!epx.f((View) next, this.x)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            twt0.b(6, 150L, (View) it2.next());
        }
        this.c.P(true);
    }

    /* compiled from: PhotoViewer.kt */
    public interface a {
        default View c(int i) {
            return null;
        }

        default Rect d(int i) {
            return null;
        }

        default Rect g() {
            return null;
        }

        default void onDismiss() {
        }

        default void e(int i) {
        }

        default void j(PhotoViewer photoViewer) {
        }
    }

    /* compiled from: PhotoViewer.kt */
    public interface b extends a {
        default View B(fnw fnwVar, int i) {
            return null;
        }

        default View D(PhotoViewerLayout photoViewerLayout) {
            return null;
        }

        default View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
            return null;
        }

        default int F(int i) {
            return 0;
        }

        default View G(fnw fnwVar, obh obhVar) {
            View inflate = LayoutInflater.from(fnwVar.getContext()).inflate(R.layout.viewer_retry_screen, (ViewGroup) fnwVar, false);
            inflate.findViewById(R.id.retry_button).setOnClickListener(new n14(obhVar, 5));
            return inflate;
        }

        default String I(g gVar) {
            Object obj;
            Iterator<T> it = gVar.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (mcr0.p((String) obj)) {
                    break;
                }
            }
            String str = (String) obj;
            return str == null ? gVar.a() : str;
        }

        default boolean J() {
            return true;
        }

        default ImageRequest K(g gVar) {
            return null;
        }

        default float[] L() {
            return null;
        }

        default boolean N() {
            return false;
        }

        default boolean O() {
            return false;
        }

        default Rect a() {
            return null;
        }

        default Integer f() {
            return null;
        }

        default boolean h() {
            return true;
        }

        default WindowManager.LayoutParams k() {
            RectF rectF = PhotoViewer.U;
            return c.a();
        }

        default boolean l() {
            return true;
        }

        default String m(int i, int i2) {
            return String.format(Locale.ENGLISH, "%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, 2));
        }

        default String p(int i, int i2) {
            return null;
        }

        default void q(g gVar) {
            mcr0.s(gVar.e()).subscribe();
        }

        default float[] r(int i) {
            return L();
        }

        default View s(ViewGroup viewGroup) {
            return null;
        }

        default boolean t(int i) {
            return false;
        }

        default boolean u(int i) {
            return false;
        }

        default boolean v() {
            return false;
        }

        default boolean w(g gVar, int i, MenuItem menuItem, View view) {
            return false;
        }

        default ImageRequest x(Context context, String str, g gVar) {
            int b = ((float) Math.max(gVar.getWidth(), gVar.getHeight())) > ((float) context.getResources().getConfiguration().screenWidthDp) * context.getResources().getDisplayMetrics().density ? an10.b((context.getResources().getConfiguration().screenWidthDp * context.getResources().getDisplayMetrics().density) / Math.max(gVar.getWidth(), gVar.getHeight())) : 1;
            int width = gVar.getWidth() * b;
            int height = gVar.getHeight() * b;
            x9g0 x9g0Var = (width <= 0 || height <= 0) ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, 12);
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
            h.d = x9g0Var;
            h.j = Priority.HIGH;
            return h.a();
        }

        default int z() {
            return 0;
        }

        default void A() {
        }

        default void C(int i) {
        }

        default void H(PhotoViewer photoViewer) {
        }

        default void P(boolean z) {
        }

        default void b(int i) {
        }

        default void i(int i) {
        }

        default void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }

        default void n(int i, q qVar) {
        }

        default void y(int i, ViewGroup viewGroup) {
        }

        default void o(g gVar, int i, Menu menu) {
        }
    }
}
