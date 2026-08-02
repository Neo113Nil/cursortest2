package com.vk.photo.editor.views.zoom;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;
import kotlin.Pair;
import xsna.bi80;
import xsna.epx;
import xsna.ilq;
import xsna.nn10;
import xsna.otk0;
import xsna.ov10;
import xsna.sot;
import xsna.u6y0;
import xsna.v95;
import xsna.y6y0;

/* compiled from: ZoomRootLayout.kt */
/* loaded from: classes4.dex */
public final class ZoomRootLayout extends FrameLayout implements sot.a, u6y0 {
    public static final /* synthetic */ int o = 0;
    public boolean b;
    public boolean c;
    public int d;
    public b e;
    public final Matrix f;
    public final Matrix g;
    public final Matrix h;
    public final sot i;
    public ov10 j;
    public bi80 k;
    public final RectF l;
    public final ilq m;
    public final otk0<a> n;

    /* compiled from: ZoomRootLayout.kt */
    public interface a {

        /* compiled from: ZoomRootLayout.kt */
        /* renamed from: com.vk.photo.editor.views.zoom.ZoomRootLayout$a$a, reason: collision with other inner class name */
        public static final class C1471a implements a {
            public static final C1471a a = new C1471a();
        }

        /* compiled from: ZoomRootLayout.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: ZoomRootLayout.kt */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    public ZoomRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = 1;
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new Matrix();
        sot sotVar = new sot(context, this, null);
        this.i = sotVar;
        this.l = new RectF();
        this.m = new ilq();
        this.n = new otk0<>(new v95(this, 18));
        setZoomEnabled(false);
        setOnTouchListener(sotVar);
    }

    public static ValueAnimator d(final ZoomRootLayout zoomRootLayout, View view, a aVar) {
        Pair pair;
        final float f = aVar instanceof a.C1471a ? 4.0f : 1.0f;
        if (aVar.equals(a.C1471a.a)) {
            pair = new Pair(Float.valueOf(view.getWidth() / 2.0f), Float.valueOf(view.getHeight() / 2.0f));
        } else {
            zoomRootLayout.e();
            pair = new Pair(Float.valueOf(zoomRootLayout.getMediaRect().centerX()), Float.valueOf(zoomRootLayout.getMediaRect().centerY()));
        }
        final float floatValue = ((Number) pair.d()).floatValue();
        final float floatValue2 = ((Number) pair.g()).floatValue();
        final float a2 = nn10.a(zoomRootLayout.g);
        bi80 bi80Var = zoomRootLayout.k;
        if (bi80Var != null) {
            bi80Var.invoke();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(a2, f);
        ofFloat.setInterpolator(zoomRootLayout.m);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.x6y0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ZoomRootLayout.o;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f2 = f;
                float f3 = a2;
                float b2 = u11.b(f2, f3, animatedFraction, f3);
                ZoomRootLayout zoomRootLayout2 = zoomRootLayout;
                Matrix matrix = zoomRootLayout2.g;
                float a3 = b2 / nn10.a(matrix);
                matrix.postScale(a3, a3, floatValue, floatValue2);
                zoomRootLayout2.e();
                zoomRootLayout2.invalidate();
            }
        });
        ofFloat.addListener(new y6y0(zoomRootLayout));
        return ofFloat;
    }

    private final RectF getMediaRect() {
        ov10 ov10Var = this.j;
        RectF rectF = ov10Var != null ? ov10Var.provide().e : null;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF2 = this.l;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        if (rectF != null) {
            rectF2.set(rectF);
        }
        this.g.mapRect(rectF2);
        return rectF2;
    }

    @Override // xsna.sot.a
    public final void a(float f, float f2) {
        this.g.postTranslate(f, f2);
        e();
        invalidate();
    }

    @Override // xsna.sot.a
    public final void b() {
        float a2 = nn10.a(this.g);
        otk0<a> otk0Var = this.n;
        if (a2 > 4.0f) {
            otk0Var.a(a.C1471a.a, this);
        } else if (a2 < 1.0f) {
            otk0Var.a(a.b.a, this);
        }
    }

    @Override // xsna.sot.a
    public final void c() {
        a.c cVar = a.c.a;
        otk0<a> otk0Var = this.n;
        otk0Var.b = cVar;
        AnimatorSet animatorSet = otk0Var.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.concat(this.g);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        float f;
        float f2;
        float f3;
        Matrix matrix;
        Matrix matrix2;
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        float height = getMediaRect().height();
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (height <= measuredHeight) {
            measuredHeight = (measuredHeight - getMediaRect().height()) / 2;
            f2 = getMediaRect().top;
        } else {
            if (getMediaRect().top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = -getMediaRect().top;
            } else if (getMediaRect().bottom < measuredHeight) {
                f2 = getMediaRect().bottom;
            } else {
                f = 0.0f;
            }
            if (getMediaRect().width() <= measuredWidth) {
                if (getMediaRect().left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f4 = -getMediaRect().left;
                } else if (getMediaRect().right < measuredWidth) {
                    f3 = getMediaRect().right;
                }
                matrix = this.g;
                matrix.postTranslate(f4, f);
                matrix2 = this.h;
                if (epx.f(matrix2, matrix)) {
                    return;
                }
                matrix2.set(matrix);
                bi80 bi80Var = this.k;
                if (bi80Var != null) {
                    bi80Var.invoke();
                    return;
                }
                return;
            }
            measuredWidth = (measuredWidth - getMediaRect().width()) / 2;
            f3 = getMediaRect().left;
            f4 = measuredWidth - f3;
            matrix = this.g;
            matrix.postTranslate(f4, f);
            matrix2 = this.h;
            if (epx.f(matrix2, matrix)) {
            }
        }
        f = measuredHeight - f2;
        if (getMediaRect().width() <= measuredWidth) {
        }
        f4 = measuredWidth - f3;
        matrix = this.g;
        matrix.postTranslate(f4, f);
        matrix2 = this.h;
        if (epx.f(matrix2, matrix)) {
        }
    }

    public final boolean getAllowToDragWhileScaling() {
        return this.c;
    }

    @Override // xsna.u6y0
    public Matrix getContentMatrix() {
        Matrix matrix = this.g;
        Matrix matrix2 = this.f;
        matrix2.set(matrix);
        return matrix2;
    }

    public final boolean getHasZoom() {
        return !this.f.isIdentity();
    }

    public final int getMinPointerCount() {
        return this.d;
    }

    public final b getZoomEventListener() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getPointerCount() >= this.d && this.b;
        if (!z) {
            this.i.onTouch(this, motionEvent);
        }
        return z;
    }

    @Override // xsna.sot.a
    public final void onScale(float f, float f2, float f3) {
        this.g.postScale(f, f, f2, f3);
        e();
        invalidate();
        if (f >= 1.0f) {
            b bVar = this.e;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        b bVar2 = this.e;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    public final void setAllowToDragWhileScaling(boolean z) {
        this.c = z;
        this.i.h = z;
    }

    public final void setMinPointerCount(int i) {
        this.d = i;
        this.i.i = i;
    }

    public final void setZoomEnabled(boolean z) {
        this.b = z;
        this.i.g = z;
    }

    public final void setZoomEventListener(b bVar) {
        this.e = bVar;
    }

    /* compiled from: ZoomRootLayout.kt */
    public interface b {
        default void a() {
        }

        default void b() {
        }
    }
}
