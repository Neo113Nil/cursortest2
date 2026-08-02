package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.animation.AnimatorSet;
import android.animation.FloatArrayEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.photo.Photo;
import com.vk.feed.tool.view.posting.photoviewer.PhotoViewerLayout;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.ClippingImageView;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.PhotoViewPager;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.awt0;
import xsna.cn70;
import xsna.cvs;
import xsna.e4;
import xsna.e43;
import xsna.eeu0;
import xsna.f5z;
import xsna.fy2;
import xsna.gqo;
import xsna.gtd0;
import xsna.gzs;
import xsna.h2w;
import xsna.hu3;
import xsna.izs;
import xsna.j5g;
import xsna.j9b;
import xsna.jcn;
import xsna.k7z;
import xsna.k9b;
import xsna.l2k;
import xsna.lyd;
import xsna.mcr0;
import xsna.nrx0;
import xsna.o0o0;
import xsna.pkk;
import xsna.q6y0;
import xsna.ro;
import xsna.tlo0;
import xsna.ty80;
import xsna.u910;
import xsna.v910;
import xsna.w6e0;
import xsna.w910;
import xsna.x1o0;
import xsna.xmz;
import xsna.xyt0;
import xsna.y910;
import xsna.z1h0;

/* compiled from: MarketPicker.kt */
/* loaded from: classes4.dex */
public final class e implements ViewPager.j {
    public static final RectF x = new RectF();
    public final ArrayList b;
    public final ContextThemeWrapper c;
    public final f d;
    public final ty80 e;
    public final Integer f;
    public AnimatorSet h;
    public final h l;
    public int m;
    public int o;
    public final WindowManager p;
    public final PhotoViewerLayout q;
    public final View r;
    public final PhotoViewPager s;
    public final TextView t;
    public final ArrayList u;
    public final VkTopBar v;
    public b w;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final pkk i = new pkk(0.58d, 0.77d, 0.5d, 1.0d);
    public final xmz j = new xmz(2);
    public final h2w k = new h2w(5);
    public int n = -1;

    /* compiled from: MarketPicker.kt */
    public interface a {
        default void a(b bVar) {
            mcr0.s(bVar.c).subscribe();
        }
    }

    /* compiled from: MarketPicker.kt */
    public static final class b {
        public final PhotoAttachment a;
        public final PhotoAttachment b;
        public final String c;
        public final Photo d;
        public final ImageCropArea e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        public b(PhotoAttachment photoAttachment, PhotoAttachment photoAttachment2, String str, Photo photo, ImageCropArea imageCropArea, int i, int i2) {
            int i3 = imageCropArea != null ? imageCropArea.f : i;
            int i4 = imageCropArea != null ? imageCropArea.g : i2;
            this.a = photoAttachment;
            this.b = photoAttachment2;
            this.c = str;
            this.d = photo;
            this.e = imageCropArea;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
        }
    }

    /* compiled from: MarketPicker.kt */
    public static final class c {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }
    }

    public e(int i, ArrayList arrayList, FragmentActivity fragmentActivity, ContextThemeWrapper contextThemeWrapper, f fVar, o0o0 o0o0Var) {
        View decorView;
        View decorView2;
        View decorView3;
        this.b = arrayList;
        this.c = contextThemeWrapper;
        this.d = fVar;
        this.e = new ty80(contextThemeWrapper, this);
        this.m = i;
        this.p = (WindowManager) contextThemeWrapper.getSystemService("window");
        b bVar = (b) arrayList.get(i);
        this.w = bVar;
        fVar.a(bVar);
        Activity d = d(contextThemeWrapper);
        this.f = d != null ? Integer.valueOf(d.getRequestedOrientation()) : null;
        PhotoViewerLayout photoViewerLayout = (PhotoViewerLayout) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.market_picker_layout, (ViewGroup) null);
        this.q = photoViewerLayout;
        Window window = fragmentActivity.getWindow();
        f5z e = (window == null || (decorView3 = window.getDecorView()) == null) ? null : gqo.e(decorView3);
        Window window2 = fragmentActivity.getWindow();
        xyt0 h = (window2 == null || (decorView2 = window2.getDecorView()) == null) ? null : ro.h(decorView2);
        Window window3 = fragmentActivity.getWindow();
        z1h0 f = (window3 == null || (decorView = window3.getDecorView()) == null) ? null : lyd.f(decorView);
        gqo.f(photoViewerLayout, e);
        ro.o(photoViewerLayout, h);
        lyd.h(photoViewerLayout, f);
        View findViewById = photoViewerLayout.findViewById(R.id.pv_dim);
        this.r = findViewById;
        VkTopBar vkTopBar = (VkTopBar) photoViewerLayout.findViewById(R.id.market_picker_top_bar);
        this.v = vkTopBar;
        PhotoViewPager photoViewPager = (PhotoViewPager) photoViewerLayout.findViewById(R.id.pv_view_pager);
        this.s = photoViewPager;
        this.t = (TextView) photoViewerLayout.findViewById(R.id.attach_prompt);
        int i2 = 0;
        this.u = e43.o(findViewById, vkTopBar);
        photoViewerLayout.setSystemUiVisibility(CoverVideoUploadTask.y);
        photoViewerLayout.setOnApplyWindowInsetsListener(new v910(this, i2));
        photoViewerLayout.addOnAttachStateChangeListener(new y910(this));
        final k7z k7zVar = new k7z(this, 3);
        photoViewerLayout.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.jvt0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (i3 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    k7z.this.invoke();
                }
                return true;
            }
        });
        photoViewerLayout.setFocusable(true);
        photoViewerLayout.setFocusableInTouchMode(true);
        photoViewerLayout.requestFocus();
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        cvs cvsVar = new cvs(this, 17);
        tlo0.a aVar = tlo0.Companion;
        String string = photoViewerLayout.getContext().getString(R.string.previous_step_talkback_title);
        aVar.getClass();
        vkTopBar.setBack(new VkTopBar.b(cvsVar, new tlo0.h(string), null, null, com.vk.core.compose.component.semantics.b.a(null, new w910(this, i2), 3), 12));
        vkTopBar.setAfter(null);
        h hVar = new h(arrayList, LayoutInflater.from(contextThemeWrapper), fVar, this, o0o0Var);
        this.l = hVar;
        photoViewPager.setPageMargin(cn70.b(16));
        photoViewPager.setAdapter(hVar);
        photoViewPager.setCurrentItem(i);
        photoViewPager.setOffscreenPageLimit(2);
        photoViewPager.addOnPageChangeListener(this);
        jcn jcnVar = new jcn(new fy2(this));
        photoViewerLayout.setInterceptToucheEventListener(jcnVar);
        photoViewerLayout.setOnTouchListener(jcnVar);
        onPageSelected(i);
    }

    public static void c(e eVar) {
        if (eVar.q.isAttachedToWindow() && eVar.h == null) {
            if (!eVar.d.p.isEmpty()) {
                eeu0.a aVar = new eeu0.a(eVar.c);
                aVar.B(R.string.market_picker_exit_dialog_title);
                aVar.q(R.string.market_picker_exit_dialog_subtitle);
                aVar.setPositiveButton(R.string.market_picker_exit_dialog_exit_button, new hu3(eVar, 2));
                aVar.setNegativeButton(R.string.market_picker_exit_dialog_cancel_button, new u910());
                aVar.m();
                return;
            }
            h2w h2wVar = eVar.k;
            int i = 0;
            int i2 = 0;
            eVar.a(new j9b(i2, eVar, e.class, "onHideAnimation", "onHideAnimation()V", i), new k9b(i2, eVar, e.class, "onFinishScaleOut", "onFinishScaleOut()V", i, 2), h2wVar);
        }
    }

    public static Activity d(ContextThemeWrapper contextThemeWrapper) {
        boolean z;
        Object obj = contextThemeWrapper;
        while (true) {
            z = obj instanceof Activity;
            if (z || !(obj instanceof ContextWrapper)) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        if (z) {
            return (Activity) obj;
        }
        return null;
    }

    public final void a(final gzs gzsVar, final gzs gzsVar2, final izs izsVar) {
        Matrix matrix;
        Pair pair;
        int i;
        int i2;
        int i3;
        int i4;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        float alpha = this.r.getAlpha();
        int[] iArr = x1o0.b;
        int i5 = this.m;
        b bVar = this.w;
        h hVar = this.l;
        d dVar = hVar.h.get(i5);
        d dVar2 = dVar instanceof d ? dVar : null;
        if (dVar2 == null || (matrix = dVar2.k.getTransformMatrix()) == null) {
            matrix = new Matrix();
        }
        d dVar3 = hVar.h.get(i5);
        Iterable singletonList = dVar3 != null ? Collections.singletonList(dVar3.a) : EmptyList.b;
        SparseArray<ClippingImageView> sparseArray = hVar.i;
        Integer num = hVar.m;
        ClippingImageView clippingImageView = sparseArray.get(num != null ? num.intValue() : 0);
        View view = (View) j5g.a0(j5g.u0(singletonList, clippingImageView != null ? Collections.singletonList(clippingImageView) : EmptyList.b));
        matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view != null ? view.getTranslationY() : 0.0f);
        this.s.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        RectF rectF = new RectF(f, f2, r2.getMeasuredWidth() + f, r2.getMeasuredHeight() + f2);
        matrix.mapRect(rectF);
        float width = rectF.width();
        float height = rectF.height();
        float f3 = width / height;
        int i6 = bVar.h;
        int i7 = bVar.i;
        if (f3 > i6 / i7) {
            width = (i6 / i7) * height;
        } else {
            height = width / (i6 / i7);
        }
        float f4 = height;
        int i8 = Build.VERSION.SDK_INT;
        WindowManager windowManager = this.p;
        if (i8 >= 30) {
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
        this.d.j.getClass();
        nrx0 nrx0Var = new nrx0(null, rectF, null, new float[8], width, f4, alpha, intValue, intValue2);
        b bVar2 = this.w;
        if (!rectF.isEmpty()) {
            int i9 = bVar2.h;
        }
        RectF rectF2 = nrx0Var.b;
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f5 = width2 / height2;
        int i10 = bVar2.h;
        if (i10 <= 0 || (i4 = bVar2.i) <= 0) {
            i = (int) height2;
            i2 = (int) width2;
        } else {
            float f6 = i10 / i4;
            if (f5 > f6) {
                i = (int) height2;
                i2 = (int) (f6 * i);
            } else {
                i2 = (int) width2;
                i = (int) (i2 / f6);
            }
        }
        float f7 = ((width2 - i2) / 2.0f) + rectF2.left;
        float f8 = ((height2 - i) / 2.0f) + rectF2.top;
        int i11 = 0;
        Rect rect = nrx0Var.c;
        if (rect != null) {
            int max = Math.max(rect.top, 0);
            i3 = Math.max(-rect.bottom, 0);
            i11 = max;
        } else {
            i3 = 0;
        }
        final w6e0 w6e0Var = new w6e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, nrx0Var.g, f7, nrx0Var.i, f7, f8, 0, 0, (int) (i11 / 1.0f), 0, (int) (i3 / 1.0f), 0, 1.0f, 1.0f, (60032 & 16384) != 0 ? new float[8] : null, new float[8], i2, i);
        final ClippingImageView clippingImageView2 = hVar.i.get(this.m);
        if (clippingImageView2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = clippingImageView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = w6e0Var.q;
            marginLayoutParams.height = w6e0Var.r;
            clippingImageView2.setLayoutParams(marginLayoutParams);
        }
        awt0.t(clippingImageView2, new gzs(clippingImageView2, izsVar, w6e0Var, gzsVar, gzsVar2) { // from class: xsna.x910
            public final /* synthetic */ ClippingImageView c;
            public final /* synthetic */ izs d;
            public final /* synthetic */ w6e0 e;
            public final /* synthetic */ FunctionReferenceImpl f;
            public final /* synthetic */ FunctionReferenceImpl g;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f = (FunctionReferenceImpl) gzsVar;
                this.g = (FunctionReferenceImpl) gzsVar2;
            }

            /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            @Override // xsna.gzs
            public final Object invoke() {
                ViewGroup viewGroup;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = com.vk.newsfeed.posting.market_picker.presentation.base.view.e.this;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.d dVar4 = eVar.l.h.get(eVar.m);
                if (dVar4 != null && (viewGroup = dVar4.a) != null) {
                    viewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                w6e0 w6e0Var2 = (w6e0) this.d.invoke(this.e);
                cty ctyVar = new cty(this.g);
                eVar.r.setVisibility(0);
                ClippingImageView clippingImageView3 = this.c;
                clippingImageView3.animate().cancel();
                clippingImageView3.setVisibility(eVar.d.h(eVar.m) ? 4 : 0);
                clippingImageView3.setAlpha(1.0f);
                clippingImageView3.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                clippingImageView3.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ArrayList arrayList = eVar.u;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ObjectAnimator.ofFloat((View) it.next(), (Property<View, Float>) View.ALPHA, w6e0Var2.a, w6e0Var2.b));
                }
                PhotoViewPager photoViewPager = eVar.s;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(photoViewPager, (Property<PhotoViewPager, Float>) View.TRANSLATION_Y, photoViewPager.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(clippingImageView3, (Property<ClippingImageView, Float>) View.ROTATION, clippingImageView3.getRotation(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Property property = View.X;
                float f9 = w6e0Var2.c;
                float f10 = w6e0Var2.n;
                float f11 = w6e0Var2.m;
                List l = e43.l(ofFloat, ofFloat2, ObjectAnimator.ofFloat(clippingImageView3, (Property<ClippingImageView, Float>) property, f9, w6e0Var2.e), ObjectAnimator.ofFloat(clippingImageView3, (Property<ClippingImageView, Float>) View.Y, w6e0Var2.d, w6e0Var2.f), ObjectAnimator.ofFloat(clippingImageView3, (Property<ClippingImageView, Float>) View.SCALE_X, f11, f10), ObjectAnimator.ofFloat(clippingImageView3, (Property<ClippingImageView, Float>) View.SCALE_Y, f11, f10));
                List l2 = e43.l(ObjectAnimator.ofInt(clippingImageView3, "clipX", w6e0Var2.g, w6e0Var2.h), ObjectAnimator.ofInt(clippingImageView3, "clipTop", w6e0Var2.i, w6e0Var2.j), ObjectAnimator.ofInt(clippingImageView3, "clipBottom", w6e0Var2.k, w6e0Var2.l), ObjectAnimator.ofObject(clippingImageView3, "corners", new FloatArrayEvaluator(), w6e0Var2.o, w6e0Var2.p));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(j5g.u0(l2, j5g.u0(l, arrayList2)));
                animatorSet.setInterpolator(eVar.i);
                animatorSet.setDuration(250L);
                animatorSet.addListener(new z910(ctyVar));
                animatorSet.start();
                this.f.invoke();
                s3q0 s3q0Var = s3q0.a;
                eVar.h = animatorSet;
                return s3q0.a;
            }
        });
    }

    public final void b(int i) {
        Activity d = d(this.c);
        if (d != null) {
            try {
                d.setRequestedOrientation(i != 0 ? i != 1 ? i != 3 ? d.getRequestedOrientation() : 0 : 8 : 1);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        int i2;
        q6y0 q6y0Var;
        if (i != 0 || (i2 = this.n) == this.m) {
            return;
        }
        d dVar = this.l.h.get(i2);
        if (dVar != null && (q6y0Var = dVar.k.m) != null) {
            q6y0Var.i(1.0f);
        }
        this.n = this.m;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        ArrayList arrayList = this.b;
        this.w = (f < 1.0f || i == e43.h(arrayList)) ? (b) arrayList.get(i) : (b) arrayList.get(i + 1);
        int i3 = this.m;
        if (i3 != i) {
            if (i == i3 - 1) {
                PhotoViewPager photoViewPager = this.s;
                i2 = (i2 - photoViewPager.getPageMargin()) - photoViewPager.getMeasuredWidth();
            } else {
                i2 = 0;
            }
        }
        this.o = i2;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        this.n = this.m;
        this.m = i;
        ArrayList arrayList = this.b;
        this.w = (b) arrayList.get(i);
        int size = arrayList.size();
        f fVar = this.d;
        String string = fVar.j.b.getString(R.string.market_picker_toolbar_title, Integer.valueOf(i + 1), Integer.valueOf(size));
        this.v.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(string, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new l2k(string, 29), 2), 6));
        c cVar = new c(i);
        int i2 = this.m;
        h hVar = this.l;
        SparseBooleanArray sparseBooleanArray = hVar.k;
        SparseArray<d> sparseArray = hVar.h;
        sparseBooleanArray.get(i2, false);
        int i3 = this.n;
        if (i3 != i) {
            sparseArray.get(i3);
        }
        sparseArray.get(i);
        hVar.g = cVar;
        fVar.c(i, cVar);
        fVar.u = (b) j5g.b0(i, fVar.l);
        gtd0 gtd0Var = fVar.b;
        if (gtd0Var.b != i) {
            gtd0Var.a.u().w();
            gtd0Var.b = i;
        }
    }
}
