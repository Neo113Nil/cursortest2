package com.vk.reactions.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.reactions.view.ElevationImageView;
import defpackage.z;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.concurrent.Callable;
import xsna.b780;
import xsna.cn70;
import xsna.e9b;
import xsna.epx;
import xsna.gzs;
import xsna.m2g;
import xsna.rlh;
import xsna.s3q0;
import xsna.tn9;
import xsna.uh3;
import xsna.xv;

/* compiled from: ElevationImageView.kt */
/* loaded from: classes5.dex */
public final class ElevationImageView extends VKImageView {
    public static final float[] A = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.08f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public Bitmap m;
    public Float n;
    public Integer o;
    public Integer p;
    public Drawable q;
    public boolean r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public final b y;
    public final Paint z;

    public ElevationImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static s3q0 T0(ElevationImageView elevationImageView) {
        super.invalidate();
        return s3q0.a;
    }

    public static s3q0 U0(ElevationImageView elevationImageView, Drawable drawable) {
        super.invalidateDrawable(drawable);
        elevationImageView.s = false;
        elevationImageView.r = true;
        elevationImageView.invalidate();
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShadowVisible(boolean z) {
        if (this.x != z) {
            invalidate();
        }
        this.x = z;
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void L0(Uri uri, ImageScreenSize imageScreenSize) {
        setShadowVisible(false);
        super.L0(uri, imageScreenSize);
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void O0(String str, ImageScreenSize imageScreenSize) {
        setShadowVisible(false);
        super.O0(str, imageScreenSize);
    }

    public final void X0(gzs<s3q0> gzsVar) {
        Handler handler = getHandler();
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null || !epx.f(Looper.myLooper(), looper)) {
            post(new tn9(gzsVar, 5));
        } else {
            gzsVar.invoke();
        }
    }

    @Override // xsna.zjt
    public final void clear() {
        setShadowVisible(false);
        super.clear();
    }

    @Override // android.view.View
    public final void invalidate() {
        X0(new m2g(this, 16));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        X0(new uh3(14, this, drawable));
    }

    @Override // xsna.zjt
    public final void load(String str) {
        setShadowVisible(false);
        o0(str, null);
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = true;
        this.y.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r4 != r6.intValue()) goto L33;
     */
    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            Drawable drawable = getDrawable();
            b bVar = this.y;
            if (drawable == null || (!epx.a(this.t, this.n) && this.t <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                this.n = null;
                this.o = null;
                this.p = null;
                this.r = true;
                bVar.e();
            } else {
                if ((this.s || ((this.m != null && !this.r) || this.t <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && epx.f(this.q, drawable) && epx.a(this.t, this.n)) {
                    int width = getWidth();
                    Integer num = this.o;
                    if (num != null && width == num.intValue()) {
                        int height = getHeight();
                        Integer num2 = this.p;
                        if (num2 != null) {
                        }
                    }
                }
                this.n = null;
                this.o = null;
                this.p = null;
                this.r = true;
                bVar.e();
                float f = this.t;
                final int width2 = getWidth();
                final int height2 = getHeight();
                this.n = Float.valueOf(f);
                this.o = Integer.valueOf(width2);
                this.p = Integer.valueOf(height2);
                final Drawable drawable2 = getDrawable();
                if (drawable2 == null || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.r = true;
                    invalidate();
                } else {
                    this.s = true;
                    bVar.b(new a0(new c0(new s0(new Callable() { // from class: xsna.dbp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ElevationImageView elevationImageView = ElevationImageView.this;
                            int b = an10.b(elevationImageView.t * 4.0f);
                            int i = width2 + b;
                            if (i < 1) {
                                i = 1;
                            }
                            int i2 = height2 + b;
                            int i3 = i2 >= 1 ? i2 : 1;
                            Bitmap bitmap = elevationImageView.m;
                            if (bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i3) {
                                bitmap.eraseColor(0);
                            } else {
                                bitmap = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                            }
                            Canvas canvas2 = new Canvas(bitmap);
                            float f2 = 2 * elevationImageView.t;
                            canvas2.translate(f2, f2);
                            Matrix imageMatrix = elevationImageView.getImageMatrix();
                            if (imageMatrix != null) {
                                canvas2.concat(imageMatrix);
                            }
                            drawable2.draw(canvas2);
                            NativeBlurFilter.iterativeBoxBlur(bitmap, 2, an10.b(elevationImageView.t));
                            return bitmap;
                        }
                    }), io.reactivex.rxjava3.internal.functions.a.d, new xv(this, 4)), new e9b(this, 2)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new z(new rlh(this, 8), 22)));
                }
            }
            this.q = drawable;
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                float f2 = (-2) * this.t;
                canvas.drawBitmap(bitmap, this.v + f2, f2 + this.w, this.z);
            }
        }
        super.onDraw(canvas);
    }

    public final void setColorMatrix(float[] fArr) {
        this.z.setColorFilter(new ColorMatrixColorFilter(fArr));
    }

    public final void setElevationDp(float f) {
        if (f == this.u) {
            return;
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        }
        this.t = f2;
        this.u = f;
        this.s = false;
        this.r = true;
        invalidate();
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setShadowVisible(true);
        super.setImageDrawable(drawable);
    }

    public final void setShadowDx(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        }
        this.v = f2;
        this.s = false;
        this.r = true;
        invalidate();
    }

    public final void setShadowDy(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        }
        this.w = f2;
        this.s = false;
        this.r = true;
        invalidate();
    }

    public ElevationImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.r = true;
        float a2 = cn70.a() * 2.0f;
        this.t = a2;
        this.u = 2.0f;
        this.w = a2;
        this.y = new b();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColorFilter(new ColorMatrixColorFilter(A));
        this.z = paint;
        setOnLoadCallback(new a());
    }

    /* compiled from: ElevationImageView.kt */
    public final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            ElevationImageView.this.setShadowVisible(false);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            ElevationImageView.this.setShadowVisible(true);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }
}
