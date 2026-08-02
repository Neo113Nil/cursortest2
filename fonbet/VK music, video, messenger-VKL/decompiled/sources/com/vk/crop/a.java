package com.vk.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.h;
import xsna.bn10;
import xsna.iah0;
import xsna.lik;
import xsna.wq;

/* compiled from: CircleCropOverlayView.java */
/* loaded from: classes17.dex */
public final class a extends d {
    public static final int u = iah0.a(16);
    public static final int v = iah0.a(2);
    public final int f;
    public final Paint g;
    public final Paint h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;

    @Nullable
    public Bitmap q;

    @Nullable
    public Drawable r;
    public int s;
    public boolean t;

    public a(Context context) {
        super(context);
        this.f = iah0.a(128);
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        float f = u;
        this.i = f;
        this.j = f;
        this.k = iah0.f().widthPixels - r1;
        this.l = iah0.f().widthPixels - r1;
        this.m = f;
        this.n = f;
        this.o = f;
        this.p = f;
        this.s = -419430401;
        this.t = false;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setColor(-1);
    }

    private float getXMinCropSide() {
        return this.f;
    }

    private float getYMinCropSide() {
        return this.f;
    }

    @Override // com.vk.crop.d
    public final RectF a(float f) {
        return lik.a(1.0f, getMeasuredWidth(), getMeasuredHeight(), this.m, this.n, this.o, this.p);
    }

    @Override // com.vk.crop.d
    public final void b(float f) {
        RectF a = a(1.0f);
        this.i = a.left;
        this.j = a.top;
        this.k = a.right;
        this.l = a.bottom;
        invalidate();
    }

    @Override // com.vk.crop.d
    public final void c(float f, float f2) {
        b(f);
    }

    public final float d() {
        return Math.min((getMeasuredWidth() - this.m) - this.o, (getMeasuredHeight() - this.n) - this.p);
    }

    public final float e() {
        return Math.min((getMeasuredWidth() - this.m) - this.o, (getMeasuredHeight() - this.n) - this.p);
    }

    public final void f() {
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            bitmap.recycle();
            this.q = null;
        }
    }

    public float getBottomSidePadding() {
        return this.p;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCenterX() {
        float f = this.i;
        return wq.a(this.k, f, 2.0f, f);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCenterY() {
        float f = this.j;
        return wq.a(this.l, f, 2.0f, f);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropAspectRatio() {
        return (this.k - this.i) / (this.l - this.j);
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropHeight() {
        return this.l - this.j;
    }

    @Override // com.vk.crop.d
    public RectF getCropRect() {
        return new RectF(this.i, this.j, this.k, this.l);
    }

    @Override // com.vk.crop.d
    public float getCropScale() {
        float f;
        int height;
        if (getWidth() < getHeight()) {
            f = this.k - this.i;
            height = getWidth();
        } else {
            f = this.l - this.j;
            height = getHeight();
        }
        return f / height;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getCropWidth() {
        return this.k - this.i;
    }

    public float getLeftSidePadding() {
        return this.m;
    }

    public float getRightSidePadding() {
        return this.o;
    }

    public float getTopSidePadding() {
        return this.n;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getX0() {
        return this.i;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getX1() {
        return this.k;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getY0() {
        return this.j;
    }

    @Override // com.vk.crop.d, xsna.bfk
    public float getY1() {
        return this.l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.q;
        if (bitmap == null || bitmap.isRecycled() || this.q.getWidth() != getWidth() || this.q.getHeight() != getHeight()) {
            Bitmap bitmap2 = this.q;
            this.q = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(this.q);
            canvas2.drawColor(this.s);
            Drawable drawable = this.r;
            if (drawable != null) {
                drawable.draw(canvas2);
            }
            float f = this.k;
            float f2 = this.i;
            float f3 = (f + f2) / 2.0f;
            float f4 = this.l;
            float f5 = this.j;
            float f6 = (f4 + f5) / 2.0f;
            float min = Math.min((f - f2) / 2.0f, (f4 - f5) / 2.0f);
            if (this.t) {
                canvas2.drawCircle(f3, f6, v + min, this.h);
            }
            canvas2.drawCircle(f3, f6, min, this.g);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        canvas.drawBitmap(this.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
        if (i == i3 && i2 == i4) {
            return;
        }
        f();
    }

    public void setBottomSidePadding(float f) {
        this.p = f;
    }

    public void setDrawBorder(boolean z) {
        this.t = z;
        invalidate();
    }

    public void setLeftSidePadding(float f) {
        this.m = f;
    }

    @Override // com.vk.crop.d
    public void setOverlayColor(int i) {
        this.s = i;
        f();
    }

    @Override // com.vk.crop.d
    public void setOverlayDrawable(@Nullable Drawable drawable) {
        this.r = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        f();
    }

    public void setRightSidePadding(float f) {
        this.o = f;
    }

    @Override // com.vk.crop.d
    public void setTopSidePadding(float f) {
        this.n = f;
    }

    @Override // com.vk.crop.d
    public void setX0(float f) {
        float f2;
        float xMinCropSide;
        float f3 = this.k;
        if (f <= f3 && f3 - f >= getXMinCropSide()) {
            if (this.k - f > e()) {
                f2 = this.k;
                xMinCropSide = e();
            }
            this.i = bn10.b(f, this.m, getMeasuredWidth() - this.o);
            f();
            invalidate();
        }
        f2 = this.k;
        xMinCropSide = getXMinCropSide();
        f = f2 - xMinCropSide;
        this.i = bn10.b(f, this.m, getMeasuredWidth() - this.o);
        f();
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setX1(float f) {
        float f2 = this.i;
        if (f < f2 || f - f2 < getXMinCropSide()) {
            f = this.i + getXMinCropSide();
        } else if (f - this.i > e()) {
            f = this.i + e();
        }
        this.k = bn10.b(f, this.m, getMeasuredWidth() - this.o);
        f();
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setY0(float f) {
        float f2;
        float yMinCropSide;
        float f3 = this.l;
        if (f <= f3 && f3 - f >= getYMinCropSide()) {
            if (this.l - f > d()) {
                f2 = this.l;
                yMinCropSide = d();
            }
            this.j = bn10.b(f, this.n, getMeasuredHeight() - this.p);
            f();
            invalidate();
        }
        f2 = this.l;
        yMinCropSide = getYMinCropSide();
        f = f2 - yMinCropSide;
        this.j = bn10.b(f, this.n, getMeasuredHeight() - this.p);
        f();
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setY1(float f) {
        float f2 = this.j;
        if (f < f2 || f - f2 < getYMinCropSide()) {
            f = this.j + getYMinCropSide();
        } else if (f - this.j > d()) {
            f = this.j + d();
        }
        this.l = bn10.b(f, this.n, getMeasuredHeight() - this.p);
        f();
        invalidate();
    }

    @Override // com.vk.crop.d
    public void setLinesAndTransparentOverlayVisible(boolean z) {
    }

    @Override // com.vk.crop.d
    public void setOnCropChangeListener(h.d dVar) {
    }

    @Override // com.vk.crop.d
    public void setTouchEnabled(boolean z) {
    }
}
