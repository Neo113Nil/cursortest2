package com.vk.common.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.view.a;
import java.util.ArrayList;
import xsna.an10;
import xsna.hm7;
import xsna.o8h;
import xsna.v5o;
import xsna.wq;

/* compiled from: DotsIndicatorView.kt */
/* loaded from: classes17.dex */
public final class DotsIndicatorView extends View {
    public static final /* synthetic */ int v = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public int o;
    public a p;
    public float q;
    public final ValueAnimator r;
    public final com.vk.common.view.a s;
    public final ArrayList<a.InterfaceC0720a> t;
    public int u;

    /* compiled from: DotsIndicatorView.kt */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public boolean d;

        public a(int i) {
            this.a = i;
            this.b = new int[i];
            this.c = new int[i];
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        
            r5 = 3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(int i, int i2, int i3, int i4, int[] iArr) {
            int i5;
            int min = Math.min(i2, i3);
            int min2 = i < i2 + (-2) ? Math.min(i, min - i4) : i2 > i3 ? (i3 - i2) + i : i;
            int length = iArr.length;
            int i6 = 0;
            while (i6 < length) {
                if (i6 >= min) {
                    i5 = 0;
                } else {
                    i5 = 2;
                    if (i6 != min2) {
                        i5 = i6 == 0 ? 1 : 1;
                    }
                }
                iArr[i6] = i5;
                i6++;
            }
        }
    }

    /* compiled from: DotsIndicatorView.kt */
    public final class b implements a.InterfaceC0720a {
        public b() {
        }

        @Override // com.vk.common.view.a.InterfaceC0720a
        public final void a() {
            DotsIndicatorView dotsIndicatorView = DotsIndicatorView.this;
            ArrayList<a.InterfaceC0720a> arrayList = dotsIndicatorView.t;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    com.vk.common.view.a aVar = dotsIndicatorView.s;
                    int i = dotsIndicatorView.i;
                    int i2 = dotsIndicatorView.h - i;
                    aVar.j = -i;
                    aVar.k = i2;
                    dotsIndicatorView.performHapticFeedback(0);
                    dotsIndicatorView.animate().scaleX(1.2f).scaleY(1.2f).setUpdateListener(new o8h(dotsIndicatorView, 1)).start();
                    return;
                }
                arrayList.get(size).a();
            }
        }

        @Override // com.vk.common.view.a.InterfaceC0720a
        public final void b(int i) {
            DotsIndicatorView dotsIndicatorView = DotsIndicatorView.this;
            ArrayList<a.InterfaceC0720a> arrayList = dotsIndicatorView.t;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    dotsIndicatorView.performHapticFeedback(6);
                    return;
                }
                arrayList.get(size).b(i);
            }
        }

        @Override // com.vk.common.view.a.InterfaceC0720a
        public final void c() {
            DotsIndicatorView dotsIndicatorView = DotsIndicatorView.this;
            for (int size = dotsIndicatorView.t.size() - 1; -1 < size; size--) {
                dotsIndicatorView.t.get(size).c();
            }
            ViewParent parent = dotsIndicatorView.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.vk.common.view.a.InterfaceC0720a
        public final void d() {
            DotsIndicatorView dotsIndicatorView = DotsIndicatorView.this;
            ArrayList<a.InterfaceC0720a> arrayList = dotsIndicatorView.t;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    dotsIndicatorView.animate().scaleX(1.0f).scaleY(1.0f).setUpdateListener(new hm7((Object) dotsIndicatorView, 1)).start();
                    return;
                }
                arrayList.get(size).d();
            }
        }
    }

    public DotsIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = -1;
        this.j = 5;
        this.k = 3;
        Paint paint = new Paint();
        this.l = paint;
        Paint paint2 = new Paint();
        this.m = paint2;
        Paint paint3 = new Paint();
        this.n = paint3;
        this.p = new a(this.j + 1);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(130L);
        this.r = duration;
        this.s = new com.vk.common.view.a(context, new b());
        this.t = new ArrayList<>(2);
        paint.setFlags(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setFlags(1);
        paint2.setStyle(style);
        paint3.setFlags(1);
        paint3.setStyle(style);
        paint3.setColor(0);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new v5o(this, 0));
        if (isInEditMode()) {
            float f = getResources().getDisplayMetrics().density;
            setDotSize(an10.b(6.0f * f));
            float f2 = 4.0f * f;
            setSmallDotSize(an10.b(f2));
            setSelectedDotSize(an10.b(f * 8.0f));
            setSpacing(an10.b(f2));
            setSelectedPosition(3);
            setCount(10);
            setSelectedDotColor(-12303292);
            setDotColor(-3355444);
        }
    }

    public final int a(int i) {
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.d;
        }
        if (i != 3) {
            return 0;
        }
        return this.c;
    }

    public final void b(int i, int i2) {
        a aVar = this.p;
        int i3 = this.h;
        int i4 = this.j;
        int i5 = this.k;
        a.a(i, i3, i4, i5, aVar.b);
        int[] iArr = aVar.c;
        a.a(i2, i3, i4, i5, iArr);
        boolean z = i > i2;
        if (!z) {
            i = i2;
        }
        boolean z2 = i3 > i4 && i5 <= i && i <= i3 - i5;
        aVar.d = z2;
        if (z2) {
            if (z) {
                iArr = aVar.b;
            }
            int i6 = iArr[iArr.length - 1];
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            iArr[0] = i6;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.cancel();
        animate().cancel();
        this.n.setColor(this.g);
        setScaleX(1.0f);
        setScaleY(1.0f);
        this.i = -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredHeight = getMeasuredHeight() - getPaddingBottom();
        float a2 = wq.a((getMeasuredWidth() - getPaddingRight()) - paddingLeft, this.o, 2.0f, paddingLeft);
        float paddingLeft2 = a2 - getPaddingLeft();
        Paint paint = this.n;
        if (paint.getColor() != 0) {
            float measuredHeight2 = getMeasuredHeight();
            float f = this.f;
            canvas2 = canvas;
            canvas2.drawRoundRect(paddingLeft2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.o + paddingLeft2 + getPaddingLeft() + getPaddingRight(), measuredHeight2, f, f, paint);
        } else {
            canvas2 = canvas;
        }
        a aVar = this.p;
        if (aVar.c[0] == 0) {
            a2 -= this.e * this.q;
        }
        int i = aVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            a aVar2 = this.p;
            int i3 = aVar2.b[i2];
            Paint paint2 = aVar2.c[i2] == 2 ? this.m : this.l;
            float a3 = ((a(r2) - r7) * this.q) + a(i3);
            float f2 = a3 / 2.0f;
            canvas2.drawCircle(a2 + f2, wq.a(measuredHeight, paddingTop, 2.0f, paddingTop), f2, paint2);
            a2 += a3 + this.e;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.h < 2) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        this.o = 0;
        int i3 = this.p.a;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int a2 = a(this.p.c[i5]);
            this.o += a2;
            if (a2 > 0) {
                i4++;
            }
        }
        int i6 = this.o;
        int i7 = this.e;
        this.o = ((i4 - 1) * i7) + i6;
        int i8 = this.b;
        int i9 = (i7 + i8) * this.j;
        int i10 = this.d;
        setMeasuredDimension(paddingRight + i9 + i10, paddingBottom + Math.max(i8, Math.max(this.c, i10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r2 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        com.vk.common.view.a aVar = this.s;
        if (aVar.b) {
            GestureDetector gestureDetector = aVar.l;
            b bVar = aVar.a;
            if (motionEvent.getPointerCount() != 1 && !aVar.c) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                gestureDetector.onTouchEvent(obtain);
                obtain.recycle();
            } else if (!aVar.c) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else if (aVar.e == motionEvent.getPointerId(0)) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int x = (int) (motionEvent.getX() - aVar.f);
                        int y = (int) (motionEvent.getY() - aVar.g);
                        if ((y * y) + (x * x) > aVar.h && (i2 = aVar.d) != (i = x / aVar.i)) {
                            int i3 = aVar.j;
                            if (i < aVar.k && i3 <= i) {
                                int signum = Integer.signum(i - i2);
                                aVar.d = i;
                                bVar.b(signum);
                            }
                        }
                        bVar.c();
                    }
                    z = true;
                }
                aVar.c = false;
                aVar.e = -1;
                bVar.d();
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBgColor(int i) {
        Paint paint = this.n;
        if (paint.getColor() != i) {
            paint.setColor(i);
            this.g = i;
            invalidate();
        }
    }

    public final void setBgCornerRadius(float f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        invalidate();
    }

    public final void setCount(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setDotColor(int i) {
        Paint paint = this.l;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }

    public final void setDotSize(int i) {
        if (this.b != i) {
            this.b = i;
            if (this.c == 0) {
                this.c = an10.b((i * 2.0f) / 3.0f);
            }
            if (this.d == 0) {
                this.d = i;
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setMaxDotsCount(int i) {
        if (this.j != i) {
            this.j = i;
            this.p = new a(i + 1);
            b(-1, this.i);
            requestLayout();
            invalidate();
        }
    }

    public final void setScrollBorder(int i) {
        if (this.k != i) {
            this.k = i;
            b(-1, this.i);
            requestLayout();
            invalidate();
        }
    }

    public final void setSelectedDotColor(int i) {
        Paint paint = this.m;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }

    public final void setSelectedDotSize(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setSelectedPosition(int i) {
        int i2 = this.i;
        if (i2 != i) {
            b(i2, i);
            boolean z = this.i != -1;
            this.q = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
            this.i = i;
            if (z) {
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator.isStarted()) {
                    valueAnimator.end();
                }
                valueAnimator.setDuration(this.p.d ? 222L : 135L);
                valueAnimator.setStartDelay(this.p.d ? 48L : 0L);
                valueAnimator.start();
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setSmallDotSize(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setSpacing(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setSwipeBgColor(int i) {
        if (this.u != i) {
            this.u = i;
            invalidate();
        }
    }

    public final void setSwipeEnabled(boolean z) {
        this.s.b = z;
    }

    public final void setSwipeStep(int i) {
        this.s.i = i;
    }
}
