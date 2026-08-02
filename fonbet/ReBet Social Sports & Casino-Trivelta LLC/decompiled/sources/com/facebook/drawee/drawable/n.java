package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class n extends Drawable implements j, D {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f30487a;

    /* renamed from: m, reason: collision with root package name */
    public RectF f30499m;
    float[] mInsideBorderRadii;

    /* renamed from: s, reason: collision with root package name */
    public Matrix f30505s;

    /* renamed from: t, reason: collision with root package name */
    public Matrix f30506t;

    /* renamed from: z, reason: collision with root package name */
    public E f30512z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30488b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30489c = false;

    /* renamed from: d, reason: collision with root package name */
    public float f30490d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public final Path f30491e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public boolean f30492f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f30493g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Path f30494h = new Path();
    private final float[] mCornerRadii = new float[8];
    final float[] mBorderRadii = new float[8];

    /* renamed from: i, reason: collision with root package name */
    public final RectF f30495i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    public final RectF f30496j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    public final RectF f30497k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public final RectF f30498l = new RectF();

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f30500n = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f30501o = new Matrix();

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f30502p = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f30503q = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f30504r = new Matrix();

    /* renamed from: u, reason: collision with root package name */
    public final Matrix f30507u = new Matrix();

    /* renamed from: v, reason: collision with root package name */
    public float f30508v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30509w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30510x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30511y = true;

    public n(Drawable drawable) {
        this.f30487a = drawable;
    }

    public static Matrix g(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    public static boolean j(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(boolean z10) {
        this.f30488b = z10;
        this.f30511y = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void b(float f10) {
        if (this.f30508v != f10) {
            this.f30508v = f10;
            this.f30511y = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(float f10) {
        D6.k.i(f10 >= 0.0f);
        Arrays.fill(this.mCornerRadii, f10);
        this.f30489c = f10 != 0.0f;
        this.f30511y = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f30487a.clearColorFilter();
    }

    public void d(boolean z10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (N7.b.d()) {
            N7.b.a("RoundedDrawable#draw");
        }
        this.f30487a.draw(canvas);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z10) {
        if (this.f30510x != z10) {
            this.f30510x = z10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z10) {
        if (this.f30509w != z10) {
            this.f30509w = z10;
            this.f30511y = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30487a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f30487a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f30487a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f30487a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30487a.getOpacity();
    }

    @Override // com.facebook.drawee.drawable.j
    public void h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.mCornerRadii, 0.0f);
            this.f30489c = false;
        } else {
            D6.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.mCornerRadii, 0, 8);
            this.f30489c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f30489c |= fArr[i10] > 0.0f;
            }
        }
        this.f30511y = true;
        invalidateSelf();
    }

    public boolean i() {
        return this.f30510x;
    }

    public boolean k() {
        return this.f30488b || this.f30489c || this.f30490d > 0.0f;
    }

    public void l() {
        float[] fArr;
        if (this.f30511y) {
            this.f30494h.reset();
            RectF rectF = this.f30495i;
            float f10 = this.f30490d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f30488b) {
                this.f30494h.addCircle(this.f30495i.centerX(), this.f30495i.centerY(), Math.min(this.f30495i.width(), this.f30495i.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.mBorderRadii;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.mCornerRadii[i10] + this.f30508v) - (this.f30490d / 2.0f);
                    i10++;
                }
                this.f30494h.addRoundRect(this.f30495i, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f30495i;
            float f11 = this.f30490d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f30491e.reset();
            float f12 = this.f30508v + (this.f30509w ? this.f30490d : 0.0f);
            this.f30495i.inset(f12, f12);
            if (this.f30488b) {
                this.f30491e.addCircle(this.f30495i.centerX(), this.f30495i.centerY(), Math.min(this.f30495i.width(), this.f30495i.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f30509w) {
                if (this.mInsideBorderRadii == null) {
                    this.mInsideBorderRadii = new float[8];
                }
                for (int i11 = 0; i11 < this.mBorderRadii.length; i11++) {
                    this.mInsideBorderRadii[i11] = this.mCornerRadii[i11] - this.f30490d;
                }
                this.f30491e.addRoundRect(this.f30495i, this.mInsideBorderRadii, Path.Direction.CW);
            } else {
                this.f30491e.addRoundRect(this.f30495i, this.mCornerRadii, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f30495i.inset(f13, f13);
            this.f30491e.setFillType(Path.FillType.WINDING);
            this.f30511y = false;
        }
    }

    public void m() {
        Matrix matrix;
        Matrix matrix2;
        E e10 = this.f30512z;
        if (e10 != null) {
            e10.getTransform(this.f30502p);
            this.f30512z.getRootBounds(this.f30495i);
        } else {
            this.f30502p.reset();
            this.f30495i.set(getBounds());
        }
        this.f30497k.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f30498l.set(this.f30487a.getBounds());
        Matrix matrix3 = this.f30500n;
        RectF rectF = this.f30497k;
        RectF rectF2 = this.f30498l;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f30509w) {
            RectF rectF3 = this.f30499m;
            if (rectF3 == null) {
                this.f30499m = new RectF(this.f30495i);
            } else {
                rectF3.set(this.f30495i);
            }
            RectF rectF4 = this.f30499m;
            float f10 = this.f30490d;
            rectF4.inset(f10, f10);
            if (this.f30505s == null) {
                this.f30505s = new Matrix();
            }
            this.f30505s.setRectToRect(this.f30495i, this.f30499m, scaleToFit);
        } else {
            Matrix matrix4 = this.f30505s;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f30502p.equals(this.f30503q) || !this.f30500n.equals(this.f30501o) || ((matrix2 = this.f30505s) != null && !j(matrix2, this.f30506t))) {
            this.f30492f = true;
            this.f30502p.invert(this.f30504r);
            this.f30507u.set(this.f30502p);
            if (this.f30509w && (matrix = this.f30505s) != null) {
                this.f30507u.postConcat(matrix);
            }
            this.f30507u.preConcat(this.f30500n);
            this.f30503q.set(this.f30502p);
            this.f30501o.set(this.f30500n);
            if (this.f30509w) {
                Matrix matrix5 = this.f30506t;
                if (matrix5 == null) {
                    this.f30506t = g(this.f30505s);
                } else {
                    matrix5.set(this.f30505s);
                }
            } else {
                Matrix matrix6 = this.f30506t;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f30495i.equals(this.f30496j)) {
            return;
        }
        this.f30511y = true;
        this.f30496j.set(this.f30495i);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f30487a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30487a.setAlpha(i10);
    }

    @Override // com.facebook.drawee.drawable.j
    public void setBorder(int i10, float f10) {
        if (this.f30493g == i10 && this.f30490d == f10) {
            return;
        }
        this.f30493g = i10;
        this.f30490d = f10;
        this.f30511y = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f30487a.setColorFilter(i10, mode);
    }

    @Override // com.facebook.drawee.drawable.D
    public void setTransformCallback(E e10) {
        this.f30512z = e10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30487a.setColorFilter(colorFilter);
    }
}
