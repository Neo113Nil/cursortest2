package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.b;
import fd.i;
import gd.InterfaceC4376a;
import gd.c;
import hd.C4503a;
import id.AsyncTaskC4543a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jd.g;

/* loaded from: classes4.dex */
public abstract class a extends com.yalantis.ucrop.view.b {

    /* renamed from: A, reason: collision with root package name */
    public int f42323A;

    /* renamed from: B, reason: collision with root package name */
    public long f42324B;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f42325q;

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f42326r;

    /* renamed from: s, reason: collision with root package name */
    public float f42327s;

    /* renamed from: t, reason: collision with root package name */
    public float f42328t;

    /* renamed from: u, reason: collision with root package name */
    public c f42329u;

    /* renamed from: v, reason: collision with root package name */
    public Runnable f42330v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f42331w;

    /* renamed from: x, reason: collision with root package name */
    public float f42332x;

    /* renamed from: y, reason: collision with root package name */
    public float f42333y;

    /* renamed from: z, reason: collision with root package name */
    public int f42334z;

    /* renamed from: com.yalantis.ucrop.view.a$a, reason: collision with other inner class name */
    public static class RunnableC0603a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f42335a;

        /* renamed from: b, reason: collision with root package name */
        public final long f42336b;

        /* renamed from: c, reason: collision with root package name */
        public final long f42337c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        public final float f42338d;

        /* renamed from: e, reason: collision with root package name */
        public final float f42339e;

        /* renamed from: f, reason: collision with root package name */
        public final float f42340f;

        /* renamed from: g, reason: collision with root package name */
        public final float f42341g;

        /* renamed from: h, reason: collision with root package name */
        public final float f42342h;

        /* renamed from: i, reason: collision with root package name */
        public final float f42343i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f42344j;

        public RunnableC0603a(a aVar, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f42335a = new WeakReference(aVar);
            this.f42336b = j10;
            this.f42338d = f10;
            this.f42339e = f11;
            this.f42340f = f12;
            this.f42341g = f13;
            this.f42342h = f14;
            this.f42343i = f15;
            this.f42344j = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = (a) this.f42335a.get();
            if (aVar == null) {
                return;
            }
            float min = Math.min(this.f42336b, System.currentTimeMillis() - this.f42337c);
            float b10 = jd.b.b(min, 0.0f, this.f42340f, this.f42336b);
            float b11 = jd.b.b(min, 0.0f, this.f42341g, this.f42336b);
            float a10 = jd.b.a(min, 0.0f, this.f42343i, this.f42336b);
            if (min < this.f42336b) {
                float[] fArr = aVar.mCurrentImageCenter;
                aVar.o(b10 - (fArr[0] - this.f42338d), b11 - (fArr[1] - this.f42339e));
                if (!this.f42344j) {
                    aVar.F(this.f42342h + a10, aVar.f42325q.centerX(), aVar.f42325q.centerY());
                }
                if (aVar.x()) {
                    return;
                }
                aVar.post(this);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f42345a;

        /* renamed from: b, reason: collision with root package name */
        public final long f42346b;

        /* renamed from: c, reason: collision with root package name */
        public final long f42347c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        public final float f42348d;

        /* renamed from: e, reason: collision with root package name */
        public final float f42349e;

        /* renamed from: f, reason: collision with root package name */
        public final float f42350f;

        /* renamed from: g, reason: collision with root package name */
        public final float f42351g;

        public b(a aVar, long j10, float f10, float f11, float f12, float f13) {
            this.f42345a = new WeakReference(aVar);
            this.f42346b = j10;
            this.f42348d = f10;
            this.f42349e = f11;
            this.f42350f = f12;
            this.f42351g = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = (a) this.f42345a.get();
            if (aVar == null) {
                return;
            }
            float min = Math.min(this.f42346b, System.currentTimeMillis() - this.f42347c);
            float a10 = jd.b.a(min, 0.0f, this.f42349e, this.f42346b);
            if (min >= this.f42346b) {
                aVar.B();
            } else {
                aVar.F(this.f42348d + a10, this.f42350f, this.f42351g);
                aVar.post(this);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42325q = new RectF();
        this.f42326r = new Matrix();
        this.f42328t = 10.0f;
        this.f42331w = null;
        this.f42334z = 0;
        this.f42323A = 0;
        this.f42324B = 500L;
    }

    public void A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(i.f46670d, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(i.f46671e, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f42327s = 0.0f;
        } else {
            this.f42327s = abs / abs2;
        }
    }

    public void B() {
        setImageToWrapCropBounds(true);
    }

    public final void C(float f10, float f11) {
        float width = this.f42325q.width();
        float height = this.f42325q.height();
        float max = Math.max(this.f42325q.width() / f10, this.f42325q.height() / f11);
        RectF rectF = this.f42325q;
        float f12 = ((width - (f10 * max)) / 2.0f) + rectF.left;
        float f13 = ((height - (f11 * max)) / 2.0f) + rectF.top;
        this.f42352d.reset();
        this.f42352d.postScale(max, max);
        this.f42352d.postTranslate(f12, f13);
        setImageMatrix(this.f42352d);
    }

    public void D(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.f42331w = bVar;
        post(bVar);
    }

    public void E(float f10) {
        F(f10, this.f42325q.centerX(), this.f42325q.centerY());
    }

    public void F(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void G(float f10) {
        H(f10, this.f42325q.centerX(), this.f42325q.centerY());
    }

    public void H(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public c getCropBoundsChangeListener() {
        return this.f42329u;
    }

    public float getMaxScale() {
        return this.f42332x;
    }

    public float getMinScale() {
        return this.f42333y;
    }

    public float getTargetAspectRatio() {
        return this.f42327s;
    }

    @Override // com.yalantis.ucrop.view.b
    public void l() {
        super.l();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f42327s == 0.0f) {
            this.f42327s = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f42353e;
        float f10 = this.f42327s;
        int i11 = (int) (i10 / f10);
        int i12 = this.f42354f;
        if (i11 > i12) {
            this.f42325q.set((i10 - ((int) (i12 * f10))) / 2, 0.0f, r4 + r2, i12);
        } else {
            this.f42325q.set(0.0f, (i12 - i11) / 2, i10, i11 + r6);
        }
        u(intrinsicWidth, intrinsicHeight);
        C(intrinsicWidth, intrinsicHeight);
        c cVar = this.f42329u;
        if (cVar != null) {
            cVar.a(this.f42327s);
        }
        b.InterfaceC0604b interfaceC0604b = this.f42355g;
        if (interfaceC0604b != null) {
            interfaceC0604b.c(getCurrentScale());
            this.f42355g.d(getCurrentAngle());
        }
    }

    @Override // com.yalantis.ucrop.view.b
    public void n(float f10, float f11, float f12) {
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            super.n(f10, f11, f12);
        } else {
            if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale()) {
                return;
            }
            super.n(f10, f11, f12);
        }
    }

    public final float[] s() {
        this.f42326r.reset();
        this.f42326r.setRotate(-getCurrentAngle());
        float[] fArr = this.mCurrentImageCorners;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b10 = g.b(this.f42325q);
        this.f42326r.mapPoints(copyOf);
        this.f42326r.mapPoints(b10);
        RectF d10 = g.d(copyOf);
        RectF d11 = g.d(b10);
        float f10 = d10.left - d11.left;
        float f11 = d10.top - d11.top;
        float f12 = d10.right - d11.right;
        float f13 = d10.bottom - d11.bottom;
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        float[] fArr2 = {f10, f11, f12, f13};
        this.f42326r.reset();
        this.f42326r.setRotate(getCurrentAngle());
        this.f42326r.mapPoints(fArr2);
        return fArr2;
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.f42329u = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f42327s = rectF.width() / rectF.height();
        this.f42325q.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        t();
        B();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float max;
        if (!this.f42357i || x()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.f42325q.centerX() - f11;
        float centerY = this.f42325q.centerY() - f12;
        this.f42326r.reset();
        this.f42326r.setTranslate(centerX, centerY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f42326r.mapPoints(copyOf);
        boolean y10 = y(copyOf);
        if (y10) {
            float[] s10 = s();
            float f13 = -(s10[0] + s10[2]);
            centerY = -(s10[1] + s10[3]);
            max = 0.0f;
            f10 = f13;
        } else {
            RectF rectF = new RectF(this.f42325q);
            this.f42326r.reset();
            this.f42326r.setRotate(getCurrentAngle());
            this.f42326r.mapRect(rectF);
            float[] c10 = g.c(this.mCurrentImageCorners);
            f10 = centerX;
            max = (Math.max(rectF.width() / c10[0], rectF.height() / c10[1]) * currentScale) - currentScale;
        }
        float f14 = centerY;
        if (z10) {
            RunnableC0603a runnableC0603a = new RunnableC0603a(this, this.f42324B, f11, f12, f10, f14, currentScale, max, y10);
            this.f42330v = runnableC0603a;
            post(runnableC0603a);
        } else {
            o(f10, f14);
            if (y10) {
                return;
            }
            F(currentScale + max, this.f42325q.centerX(), this.f42325q.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.f42324B = j10;
    }

    public void setMaxResultImageSizeX(int i10) {
        this.f42334z = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.f42323A = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f42328t = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.f42327s = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.f42327s = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.f42327s = f10;
        }
        c cVar = this.f42329u;
        if (cVar != null) {
            cVar.a(this.f42327s);
        }
    }

    public final void t() {
        if (getDrawable() == null) {
            return;
        }
        u(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    public final void u(float f10, float f11) {
        float min = Math.min(Math.min(this.f42325q.width() / f10, this.f42325q.width() / f11), Math.min(this.f42325q.height() / f11, this.f42325q.height() / f10));
        this.f42333y = min;
        this.f42332x = min * this.f42328t;
    }

    public void v() {
        removeCallbacks(this.f42330v);
        removeCallbacks(this.f42331w);
    }

    public void w(Bitmap.CompressFormat compressFormat, int i10, InterfaceC4376a interfaceC4376a) {
        v();
        setImageToWrapCropBounds(false);
        hd.c cVar = new hd.c(this.f42325q, g.d(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle());
        C4503a c4503a = new C4503a(this.f42334z, this.f42323A, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        c4503a.j(getImageInputUri());
        c4503a.k(getImageOutputUri());
        new AsyncTaskC4543a(getContext(), getViewBitmap(), cVar, c4503a, interfaceC4376a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean x() {
        return y(this.mCurrentImageCorners);
    }

    public boolean y(float[] fArr) {
        this.f42326r.reset();
        this.f42326r.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f42326r.mapPoints(copyOf);
        float[] b10 = g.b(this.f42325q);
        this.f42326r.mapPoints(b10);
        return g.d(copyOf).contains(g.d(b10));
    }

    public void z(float f10) {
        m(f10, this.f42325q.centerX(), this.f42325q.centerY());
    }
}
