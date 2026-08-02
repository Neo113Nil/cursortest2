package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends C3016g {

    /* renamed from: a, reason: collision with root package name */
    public r f30513a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30514b;

    /* renamed from: c, reason: collision with root package name */
    public PointF f30515c;

    /* renamed from: d, reason: collision with root package name */
    public int f30516d;

    /* renamed from: e, reason: collision with root package name */
    public int f30517e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f30518f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f30519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Drawable drawable, r scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f30519g = new Matrix();
        this.f30513a = scaleType;
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        j();
        if (this.f30518f == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f30518f);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.C3016g, com.facebook.drawee.drawable.E
    public void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        j();
        Matrix matrix = this.f30518f;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    public final void i() {
        float f10;
        Drawable current = getCurrent();
        if (current == null) {
            this.f30517e = 0;
            this.f30516d = 0;
            this.f30518f = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f30516d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f30517e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f30518f = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f30518f = null;
            return;
        }
        if (this.f30513a == r.f30520a) {
            current.setBounds(bounds);
            this.f30518f = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f30519g.reset();
        r rVar = this.f30513a;
        Matrix matrix = this.f30519g;
        PointF pointF = this.f30515c;
        float f11 = 0.5f;
        if (pointF != null) {
            Intrinsics.checkNotNull(pointF);
            f10 = pointF.x;
        } else {
            f10 = 0.5f;
        }
        PointF pointF2 = this.f30515c;
        if (pointF2 != null) {
            Intrinsics.checkNotNull(pointF2);
            f11 = pointF2.y;
        }
        rVar.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
        this.f30518f = this.f30519g;
    }

    public final void j() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f30516d == current.getIntrinsicWidth() && this.f30517e == current.getIntrinsicHeight()) {
            return;
        }
        i();
    }

    public final PointF k() {
        return this.f30515c;
    }

    public final r l() {
        return this.f30513a;
    }

    public final void m(PointF pointF) {
        if (D6.i.a(this.f30515c, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f30515c = null;
        } else {
            if (this.f30515c == null) {
                this.f30515c = new PointF();
            }
            PointF pointF2 = this.f30515c;
            Intrinsics.checkNotNull(pointF2);
            pointF2.set(pointF);
        }
        i();
        invalidateSelf();
    }

    public final void n(r scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (D6.i.a(this.f30513a, scaleType)) {
            return;
        }
        this.f30513a = scaleType;
        this.f30514b = null;
        i();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        i();
    }

    @Override // com.facebook.drawee.drawable.C3016g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        i();
        return current;
    }
}
