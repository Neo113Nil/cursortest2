package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class l extends Drawable implements j {
    float[] mInsideBorderRadii;
    private final float[] mRadii = new float[8];
    final float[] mBorderRadii = new float[8];

    /* renamed from: a, reason: collision with root package name */
    public final Paint f30458a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f30459b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f30460c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f30461d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f30462e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30463f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30464g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Path f30465h = new Path();

    /* renamed from: i, reason: collision with root package name */
    public final Path f30466i = new Path();

    /* renamed from: j, reason: collision with root package name */
    public int f30467j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f30468k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public int f30469l = 255;

    public l(int i10) {
        j(i10);
    }

    public static l g(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    private void k() {
        float[] fArr;
        float[] fArr2;
        this.f30465h.reset();
        this.f30466i.reset();
        this.f30468k.set(getBounds());
        RectF rectF = this.f30468k;
        float f10 = this.f30460c;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f30459b) {
            this.f30466i.addCircle(this.f30468k.centerX(), this.f30468k.centerY(), Math.min(this.f30468k.width(), this.f30468k.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.mBorderRadii;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.mRadii[i11] + this.f30461d) - (this.f30460c / 2.0f);
                i11++;
            }
            this.f30466i.addRoundRect(this.f30468k, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f30468k;
        float f11 = this.f30460c;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f30461d + (this.f30463f ? this.f30460c : 0.0f);
        this.f30468k.inset(f12, f12);
        if (this.f30459b) {
            this.f30465h.addCircle(this.f30468k.centerX(), this.f30468k.centerY(), Math.min(this.f30468k.width(), this.f30468k.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f30463f) {
            if (this.mInsideBorderRadii == null) {
                this.mInsideBorderRadii = new float[8];
            }
            while (true) {
                fArr2 = this.mInsideBorderRadii;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.mRadii[i10] - this.f30460c;
                i10++;
            }
            this.f30465h.addRoundRect(this.f30468k, fArr2, Path.Direction.CW);
        } else {
            this.f30465h.addRoundRect(this.f30468k, this.mRadii, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f30468k.inset(f13, f13);
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(boolean z10) {
        this.f30459b = z10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void b(float f10) {
        if (this.f30461d != f10) {
            this.f30461d = f10;
            k();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(float f10) {
        D6.k.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.mRadii, f10);
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void d(boolean z10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f30458a.setColor(C3014e.c(this.f30467j, this.f30469l));
        this.f30458a.setStyle(Paint.Style.FILL);
        this.f30458a.setFilterBitmap(i());
        canvas.drawPath(this.f30465h, this.f30458a);
        if (this.f30460c != 0.0f) {
            this.f30458a.setColor(C3014e.c(this.f30462e, this.f30469l));
            this.f30458a.setStyle(Paint.Style.STROKE);
            this.f30458a.setStrokeWidth(this.f30460c);
            canvas.drawPath(this.f30466i, this.f30458a);
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z10) {
        if (this.f30464g != z10) {
            this.f30464g = z10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z10) {
        if (this.f30463f != z10) {
            this.f30463f = z10;
            k();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30469l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C3014e.b(C3014e.c(this.f30467j, this.f30469l));
    }

    @Override // com.facebook.drawee.drawable.j
    public void h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.mRadii, 0.0f);
        } else {
            D6.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.mRadii, 0, 8);
        }
        k();
        invalidateSelf();
    }

    public boolean i() {
        return this.f30464g;
    }

    public void j(int i10) {
        if (this.f30467j != i10) {
            this.f30467j = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f30469l) {
            this.f30469l = i10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void setBorder(int i10, float f10) {
        if (this.f30462e != i10) {
            this.f30462e = i10;
            invalidateSelf();
        }
        if (this.f30460c != f10) {
            this.f30460c = f10;
            k();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
