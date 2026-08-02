package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class k extends n {

    /* renamed from: G, reason: collision with root package name */
    public static boolean f30451G = false;

    /* renamed from: A, reason: collision with root package name */
    public final Paint f30452A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint f30453B;

    /* renamed from: C, reason: collision with root package name */
    public final Bitmap f30454C;

    /* renamed from: D, reason: collision with root package name */
    public WeakReference f30455D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f30456E;

    /* renamed from: F, reason: collision with root package name */
    public RectF f30457F;

    public k(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f30452A = paint2;
        Paint paint3 = new Paint(1);
        this.f30453B = paint3;
        this.f30457F = null;
        this.f30454C = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f30456E = z10;
    }

    public static boolean n() {
        return f30451G;
    }

    @Override // com.facebook.drawee.drawable.n, com.facebook.drawee.drawable.j
    public void d(boolean z10) {
        this.f30456E = z10;
    }

    @Override // com.facebook.drawee.drawable.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (N7.b.d()) {
            N7.b.a("RoundedBitmapDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (N7.b.d()) {
                N7.b.b();
                return;
            }
            return;
        }
        m();
        l();
        o();
        int save = canvas.save();
        canvas.concat(this.f30504r);
        if (this.f30456E || this.f30457F == null) {
            canvas.drawPath(this.f30491e, this.f30452A);
        } else {
            int save2 = canvas.save();
            canvas.clipRect(this.f30457F);
            canvas.drawPath(this.f30491e, this.f30452A);
            canvas.restoreToCount(save2);
        }
        float f10 = this.f30490d;
        if (f10 > 0.0f) {
            this.f30453B.setStrokeWidth(f10);
            this.f30453B.setColor(C3014e.c(this.f30493g, this.f30452A.getAlpha()));
            canvas.drawPath(this.f30494h, this.f30453B);
        }
        canvas.restoreToCount(save);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    @Override // com.facebook.drawee.drawable.n
    public boolean k() {
        return super.k() && this.f30454C != null;
    }

    @Override // com.facebook.drawee.drawable.n
    public void m() {
        super.m();
        if (this.f30456E) {
            return;
        }
        if (this.f30457F == null) {
            this.f30457F = new RectF();
        }
        this.f30507u.mapRect(this.f30457F, this.f30497k);
    }

    public final void o() {
        Shader shader;
        WeakReference weakReference = this.f30455D;
        if (weakReference == null || weakReference.get() != this.f30454C) {
            this.f30455D = new WeakReference(this.f30454C);
            if (this.f30454C != null) {
                Paint paint = this.f30452A;
                Bitmap bitmap = this.f30454C;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f30492f = true;
            }
        }
        if (this.f30492f && (shader = this.f30452A.getShader()) != null) {
            shader.setLocalMatrix(this.f30507u);
            this.f30492f = false;
        }
        this.f30452A.setFilterBitmap(i());
    }

    @Override // com.facebook.drawee.drawable.n, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f30452A.getAlpha()) {
            this.f30452A.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.n, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f30452A.setColorFilter(colorFilter);
    }
}
