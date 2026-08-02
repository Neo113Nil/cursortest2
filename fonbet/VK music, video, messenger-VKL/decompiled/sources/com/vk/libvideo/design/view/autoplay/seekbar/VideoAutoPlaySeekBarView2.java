package com.vk.libvideo.design.view.autoplay.seekbar;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.an10;
import xsna.b4s0;
import xsna.bwt0;
import xsna.c5g;
import xsna.f4m;
import xsna.fpf0;
import xsna.i8c0;
import xsna.iah0;
import xsna.j5g;
import xsna.mnh0;
import xsna.msy;
import xsna.p5j;
import xsna.pod0;
import xsna.ptl0;
import xsna.qcy;
import xsna.sox;
import xsna.swe0;
import xsna.vl2;
import xsna.wjo;
import xsna.zpr;

/* compiled from: VideoAutoPlaySeekBarView2.kt */
/* loaded from: classes2.dex */
public final class VideoAutoPlaySeekBarView2 extends ProgressBar implements GestureDetector.OnGestureListener {
    public final /* synthetic */ GestureDetector.SimpleOnGestureListener b;
    public boolean c;
    public sox d;
    public b e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final List<Rect> k;
    public final RectF l;
    public final Paint m;
    public final zpr n;
    public final vl2 o;
    public final b4s0 p;
    public final Object q;
    public static final /* synthetic */ qcy<Object>[] s = {new MutablePropertyReference1Impl(VideoAutoPlaySeekBarView2.class, "thumbScale", "getThumbScale()F", 0), p5j.a(0, VideoAutoPlaySeekBarView2.class, "seekingProgress", "getSeekingProgress()I", fpf0.a)};
    public static final a r = new a();
    public static final int t = iah0.a(30);
    public static final float u = iah0.b(16.0f);
    public static final float v = iah0.b(6.0f);
    public static final float w = iah0.b(2.0f);
    public static final Object x = msy.a(LazyThreadSafetyMode.NONE, new i8c0(9));

    /* compiled from: VideoAutoPlaySeekBarView2.kt */
    public static final class a {
    }

    /* compiled from: VideoAutoPlaySeekBarView2.kt */
    public interface b {
        void a(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i);

        void b(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i);

        void c(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i);
    }

    public VideoAutoPlaySeekBarView2(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.q.getValue();
    }

    private final int getSeekingProgress() {
        qcy<Object> qcyVar = s[1];
        vl2 vl2Var = this.o;
        vl2Var.getClass();
        return vl2Var.d;
    }

    private final float getThumbScale() {
        return ((Number) this.n.getValue(this, s[0])).floatValue();
    }

    private final void setSeekingProgress(int i) {
        this.o.setValue(this, s[1], Integer.valueOf(i));
    }

    private final void setThumbActive(boolean z) {
        setThumbScale(z ? 1.0f : 0.75f);
    }

    private final void setThumbScale(float f) {
        this.n.setValue(this, s[0], Float.valueOf(f));
    }

    public final int a(float f, boolean z) {
        float width;
        float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth());
        if (z) {
            f2 -= this.i;
            width = this.j;
        } else {
            width = getWidth();
        }
        float f3 = swe0.f(f2 / width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        qcy<Object>[] qcyVarArr = bwt0.a;
        if (Math.abs(f3 - bwt0.w0(this, getProgress())) < this.f) {
            return getProgress();
        }
        return an10.b((f3 * (getMax() - getMin())) + getMin());
    }

    public final sox getIntervals() {
        return this.d;
    }

    public final b getListener() {
        return this.e;
    }

    public final float getThumbSnapFraction() {
        return this.f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float w0 = bwt0.w0(this, this.c ? getSeekingProgress() : getProgress());
        float thumbScale = getThumbScale() / 2.0f;
        float f = u * thumbScale;
        float f2 = swe0.f((w0 * this.g) + getPaddingStart(), f, getRight() - f);
        float paddingTop = (this.h / 2.0f) + getPaddingTop();
        float f3 = t * thumbScale;
        RectF rectF = this.l;
        rectF.left = f2 - f3;
        rectF.top = paddingTop - f3;
        rectF.right = f2 + f3;
        rectF.bottom = paddingTop + f3;
        r.getClass();
        canvas.drawBitmap((Bitmap) x.getValue(), (Rect) null, rectF, this.m);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f, float f2) {
        return this.b.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List systemGestureExclusionRects;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            systemGestureExclusionRects = getSystemGestureExclusionRects();
            Rect rect = (Rect) j5g.a0(systemGestureExclusionRects);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (rect != null && rect.right == measuredWidth && rect.bottom == measuredHeight) {
                return;
            }
            List<Rect> list = this.k;
            list.get(0).set(0, 0, measuredWidth, measuredHeight);
            setSystemGestureExclusionRects(list);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@NonNull MotionEvent motionEvent) {
        this.b.onLongPress(motionEvent);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        this.h = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        this.i = getMeasuredWidth() * 0.1f;
        this.j = getMeasuredWidth() - (this.i * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f2) > Math.abs(f) && !this.c) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        setSeekingProgress(a(motionEvent2.getX(), true));
        if (!this.c) {
            this.c = true;
            b bVar = this.e;
            if (bVar != null) {
                bVar.c(this, getSeekingProgress());
            }
        }
        setThumbActive(getSeekingProgress() != getProgress());
        b bVar2 = this.e;
        if (bVar2 != null) {
            bVar2.a(this, getSeekingProgress());
        }
        invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(@NonNull MotionEvent motionEvent) {
        this.b.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.c = false;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(this, a(motionEvent.getX(), false));
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.c;
        if (mnh0.r(motionEvent)) {
            this.c = false;
            setThumbActive(false);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (mnh0.q(motionEvent) && z) {
            setSeekingProgress(a(motionEvent.getX(), true));
            b bVar = this.e;
            if (bVar != null) {
                bVar.b(this, getSeekingProgress());
            }
        }
        return getGestureDetector().onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<xsna.wjo>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public final void setIntervals(sox soxVar) {
        ?? r1;
        this.d = soxVar;
        if (soxVar != null) {
            ArrayList arrayList = soxVar.a;
            r1 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                float f = ((sox.a) it.next()).a;
                float f2 = soxVar.b;
                r1.add(new wjo(f / f2, r2.b / f2));
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        b4s0 b4s0Var = this.p;
        b4s0Var.b = r1;
        b4s0Var.a(b4s0Var.getBounds());
    }

    public final void setListener(b bVar) {
        this.e = bVar;
    }

    public final void setThumbSnapFraction(float f) {
        this.f = f;
    }

    public VideoAutoPlaySeekBarView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoAutoPlaySeekBarView2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoAutoPlaySeekBarView2(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, R.style.VideoAutoPlaySeekBarView);
    }

    public VideoAutoPlaySeekBarView2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new GestureDetector.SimpleOnGestureListener();
        this.f = 0.05f;
        this.k = Collections.singletonList(new Rect());
        this.l = new RectF();
        this.m = new Paint(1);
        zpr zprVar = new zpr(new ptl0(this, 11));
        addOnAttachStateChangeListener(zprVar);
        this.n = zprVar;
        vl2 vl2Var = new vl2(new pod0(this, 24));
        addOnAttachStateChangeListener(vl2Var);
        this.o = vl2Var;
        b4s0 b4s0Var = new b4s0(context);
        this.p = b4s0Var;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new com.vk.voip.a(28, context, this));
        setProgressDrawable(b4s0Var);
        f4m.l(0, 0, this);
        int b2 = an10.b((v * 2) + w);
        f4m.B(b2, b2, this);
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
    }
}
