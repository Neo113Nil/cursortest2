package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBRotationView extends FrameLayout {
    private Camera a;
    private Matrix b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    Runnable p;

    public MBRotationView(Context context) {
        super(context);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.a.save();
        this.b.reset();
        float f = i;
        this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a.rotateX(this.g);
        this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i == 0) {
            boolean z = this.o;
            int i4 = this.c;
            if (z) {
                b(i4, this.e, i3);
            } else {
                b(-i4, -this.e, i3);
            }
        } else if (i > 0) {
            b(this.c, this.e, i3);
        } else if (i < 0) {
            b(-this.c, -this.e, i3);
        }
        this.a.getMatrix(this.b);
        this.a.restore();
        this.b.preTranslate((-getWidth()) / 2, -i2);
        this.b.postTranslate(getWidth() / 2, i2);
        canvas.concat(this.b);
        View childAt = getChildAt(c(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.a.save();
        this.b.reset();
        float f = i;
        this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a.rotateY(this.g);
        this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i == 0) {
            boolean z = this.o;
            int i4 = this.d;
            if (z) {
                a(i4, this.e, i3);
            } else {
                a(-i4, -this.e, i3);
            }
        } else if (i > 0) {
            a(this.d, this.e, i3);
        } else if (i < 0) {
            a(-this.d, -this.e, i3);
        }
        this.a.getMatrix(this.b);
        this.a.restore();
        this.b.preTranslate(-i2, (-getHeight()) / 2);
        this.b.postTranslate(i2, getHeight() / 2);
        canvas.concat(this.b);
        View childAt = getChildAt(c(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
    
        if (r3 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        r3 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        r3 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (r3 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int c(int i) {
        int i2;
        int i3;
        if (i == 0) {
            boolean z = this.o;
            int i4 = this.h;
            i2 = z ? i4 - 2 : i4 + 2;
        } else if (i == 1) {
            boolean z2 = this.o;
            i3 = this.h;
        } else if (i != 2) {
            i2 = i != 3 ? 0 : this.h;
        } else {
            boolean z3 = this.o;
            i3 = this.h;
        }
        int childCount = i2 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = i5;
        float f2 = this.k;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = i7;
        float f4 = this.l;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.c = (int) (f3 * f4);
        this.d = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.d;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.p, 1000 / this.f);
        }
        this.m = z;
    }

    public void setHeightRatio(float f) {
        this.l = f;
    }

    public void setRotateV(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.k = f;
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a() {
        this.a = new Camera();
        this.b = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i, int i2, int i3) {
        float f = (-i) / 2.0f;
        if (i3 == 0) {
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = -i2;
            this.a.rotateX(f2);
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateX(f2);
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i3 == 1) {
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateX(i2);
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.a.rotateX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateX(-i2);
            this.a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.g * this.d) / 2) / this.e;
        b(canvas, i, width, 0);
        b(canvas, i, width, 1);
        if (Math.abs(this.g) > this.e / 2) {
            b(canvas, i, width, 3);
            b(canvas, i, width, 2);
        } else {
            b(canvas, i, width, 2);
            b(canvas, i, width, 3);
        }
    }

    private void a(int i) {
        int i2 = this.e;
        int i3 = this.i - (i / i2);
        this.g = i % i2;
        b(i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i = this.g - 1;
        this.g = i;
        this.i = this.h;
        a(i);
        if (this.m) {
            postDelayed(this.p, 1000 / this.f);
        }
    }

    private void a(int i, int i2, int i3) {
        if (i3 == 0) {
            float f = (-i) / 2;
            this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = -i2;
            this.a.rotateY(f2);
            this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateY(f2);
            this.a.translate(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i3 == 1) {
            float f3 = i / 2;
            this.a.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateY(i2);
            this.a.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.a.rotateY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f4 = (-i) / 2;
            this.a.translate(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.rotateY(-i2);
            this.a.translate(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.g * this.c) / 2) / this.e;
        a(canvas, i, height, 0);
        a(canvas, i, height, 1);
        if (Math.abs(this.g) > this.e / 2) {
            a(canvas, i, height, 3);
            a(canvas, i, height, 2);
        } else {
            a(canvas, i, height, 2);
            a(canvas, i, height, 3);
        }
    }

    private void b(int i) {
        int c;
        this.h = i;
        if (Math.abs(this.g) > this.e / 2) {
            c = c(2);
        } else {
            c = c(3);
        }
        if (this.j != c) {
            this.j = c;
        }
    }
}
