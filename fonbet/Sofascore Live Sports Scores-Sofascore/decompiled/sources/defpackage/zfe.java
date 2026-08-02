package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.github.chrisbanes.photoview.PhotoView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zfe implements View.OnTouchListener, View.OnLayoutChangeListener {
    public final PhotoView h;
    public final GestureDetector i;
    public final d94 j;
    public View.OnClickListener p;
    public View.OnLongClickListener q;
    public qqd r;
    public y94 s;
    public final e3c x;
    public final AccelerateDecelerateInterpolator a = new AccelerateDecelerateInterpolator();
    public int b = 200;
    public float c = 1.0f;
    public float d = 1.75f;
    public float e = 3.0f;
    public boolean f = true;
    public boolean g = false;
    public final Matrix k = new Matrix();
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final RectF n = new RectF();
    public final float[] o = new float[9];
    public int t = 2;
    public int u = 2;
    public boolean v = true;
    public ImageView.ScaleType w = ImageView.ScaleType.FIT_CENTER;

    public zfe(PhotoView photoView) {
        e3c e3cVar = new e3c(this, 7);
        this.x = e3cVar;
        this.h = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.j = new d94(photoView.getContext(), e3cVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new vfe(this));
        this.i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new wfe(this));
    }

    public final void a() {
        if (b()) {
            this.h.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f;
        Matrix c = c();
        PhotoView photoView = this.h;
        Drawable drawable = photoView.getDrawable();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            rectF = this.n;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intrinsicWidth, intrinsicHeight);
            c.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float height = rectF.height();
        float width = rectF.width();
        float height2 = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (height <= height2) {
            int i = xfe.a[this.w.ordinal()];
            float f3 = rectF.top;
            if (i != 2) {
                f = (i != 3 ? (height2 - height) / 2.0f : height2 - height) - f3;
            } else {
                f = -f3;
            }
            this.u = 2;
        } else {
            float f4 = rectF.top;
            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.u = 0;
                f = -f4;
            } else {
                float f5 = rectF.bottom;
                if (f5 < height2) {
                    this.u = 1;
                    f = height2 - f5;
                } else {
                    this.u = -1;
                    f = 0.0f;
                }
            }
        }
        float width2 = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (width <= width2) {
            int i2 = xfe.a[this.w.ordinal()];
            float f6 = rectF.left;
            if (i2 != 2) {
                f2 = (i2 != 3 ? (width2 - width) / 2.0f : width2 - width) - f6;
            } else {
                f2 = -f6;
            }
            this.t = 2;
        } else {
            float f7 = rectF.left;
            if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.t = 0;
                f2 = -f7;
            } else {
                float f8 = rectF.right;
                if (f8 < width2) {
                    f2 = width2 - f8;
                    this.t = 1;
                } else {
                    this.t = -1;
                }
            }
        }
        this.m.postTranslate(f2, f);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.k;
        Matrix matrix2 = this.l;
        matrix2.set(matrix);
        matrix2.postConcat(this.m);
        return matrix2;
    }

    public final float d() {
        Matrix matrix = this.m;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f, float f2, float f3, boolean z) {
        if (f < this.c || f > this.e) {
            a70.p("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.h.post(new yfe(this, d(), f, f2, f3));
        } else {
            this.m.setScale(f, f, f2, f3);
            a();
        }
    }

    public final void f() {
        boolean z = this.v;
        PhotoView photoView = this.h;
        if (z) {
            g(photoView.getDrawable());
            return;
        }
        Matrix matrix = this.m;
        matrix.reset();
        matrix.postRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a();
        photoView.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.h;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.k;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        ImageView.ScaleType scaleType = this.w;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f * max)) / 2.0f, mz1.c(f3, max, height, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f * min)) / 2.0f, mz1.c(f3, min, height, 2.0f));
        } else {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f3);
            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
            int i = xfe.a[this.w.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.m;
        matrix2.reset();
        matrix2.postRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a();
        photoView.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        g(this.h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        d94 d94Var;
        GestureDetector gestureDetector;
        boolean z2 = false;
        if (!this.v || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            y94 y94Var = this.s;
            if (y94Var != null) {
                ((OverScroller) y94Var.d).forceFinished(true);
                this.s = null;
            }
        } else if (action == 1 || action == 3) {
            float d = d();
            float f = this.c;
            PhotoView photoView = this.h;
            RectF rectF2 = this.n;
            if (d < f) {
                b();
                Matrix c = c();
                if (photoView.getDrawable() != null) {
                    rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
                    c.mapRect(rectF2);
                    rectF = rectF2;
                }
                if (rectF != null) {
                    RectF rectF3 = rectF;
                    view.post(new yfe(this, d(), this.c, rectF3.centerX(), rectF3.centerY()));
                    z = true;
                }
            } else if (d() > this.e) {
                b();
                Matrix c2 = c();
                if (photoView.getDrawable() != null) {
                    rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r3.getIntrinsicWidth(), r3.getIntrinsicHeight());
                    c2.mapRect(rectF2);
                    rectF = rectF2;
                }
                if (rectF != null) {
                    RectF rectF4 = rectF;
                    view.post(new yfe(this, d(), this.e, rectF4.centerX(), rectF4.centerY()));
                    z = true;
                }
            }
            d94Var = this.j;
            if (d94Var != null) {
                ScaleGestureDetector scaleGestureDetector = d94Var.c;
                boolean isInProgress = scaleGestureDetector.isInProgress();
                boolean z3 = d94Var.e;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    d94Var.a(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                boolean z4 = (isInProgress || scaleGestureDetector.isInProgress()) ? false : true;
                boolean z5 = (z3 || d94Var.e) ? false : true;
                if (z4 && z5) {
                    z2 = true;
                }
                this.g = z2;
                z = true;
            }
            gestureDetector = this.i;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z;
        }
        z = false;
        d94Var = this.j;
        if (d94Var != null) {
        }
        gestureDetector = this.i;
        if (gestureDetector == null) {
        }
        return z;
    }
}
