package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class m extends C3016g implements j {

    /* renamed from: a, reason: collision with root package name */
    public b f30470a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f30471b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f30472c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f30473d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f30474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30475f;

    /* renamed from: g, reason: collision with root package name */
    public float f30476g;

    /* renamed from: h, reason: collision with root package name */
    public int f30477h;

    /* renamed from: i, reason: collision with root package name */
    public int f30478i;

    /* renamed from: j, reason: collision with root package name */
    public float f30479j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30480k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30481l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f30482m;
    final float[] mBorderRadii;
    private final float[] mRadii;

    /* renamed from: n, reason: collision with root package name */
    public final Path f30483n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f30484o;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) D6.k.g(drawable));
        this.f30470a = b.OVERLAY_COLOR;
        this.f30471b = new RectF();
        this.mRadii = new float[8];
        this.mBorderRadii = new float[8];
        this.f30474e = new Paint(1);
        this.f30475f = false;
        this.f30476g = 0.0f;
        this.f30477h = 0;
        this.f30478i = 0;
        this.f30479j = 0.0f;
        this.f30480k = false;
        this.f30481l = false;
        this.f30482m = new Path();
        this.f30483n = new Path();
        this.f30484o = new RectF();
    }

    private void k() {
        float[] fArr;
        this.f30482m.reset();
        this.f30483n.reset();
        this.f30484o.set(getBounds());
        RectF rectF = this.f30484o;
        float f10 = this.f30479j;
        rectF.inset(f10, f10);
        if (this.f30470a == b.OVERLAY_COLOR) {
            this.f30482m.addRect(this.f30484o, Path.Direction.CW);
        }
        if (this.f30475f) {
            this.f30482m.addCircle(this.f30484o.centerX(), this.f30484o.centerY(), Math.min(this.f30484o.width(), this.f30484o.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f30482m.addRoundRect(this.f30484o, this.mRadii, Path.Direction.CW);
        }
        RectF rectF2 = this.f30484o;
        float f11 = this.f30479j;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f30484o;
        float f12 = this.f30476g;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f30475f) {
            this.f30483n.addCircle(this.f30484o.centerX(), this.f30484o.centerY(), Math.min(this.f30484o.width(), this.f30484o.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.mBorderRadii;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.mRadii[i10] + this.f30479j) - (this.f30476g / 2.0f);
                i10++;
            }
            this.f30483n.addRoundRect(this.f30484o, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f30484o;
        float f13 = this.f30476g;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(boolean z10) {
        this.f30475f = z10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void b(float f10) {
        this.f30479j = f10;
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(float f10) {
        Arrays.fill(this.mRadii, f10);
        k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void d(boolean z10) {
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f30471b.set(getBounds());
        int i10 = a.$SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type[this.f30470a.ordinal()];
        if (i10 == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f30482m);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i10 == 2) {
            if (this.f30480k) {
                RectF rectF = this.f30472c;
                if (rectF == null) {
                    this.f30472c = new RectF(this.f30471b);
                    this.f30473d = new Matrix();
                } else {
                    rectF.set(this.f30471b);
                }
                RectF rectF2 = this.f30472c;
                float f10 = this.f30476g;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f30473d;
                if (matrix != null) {
                    matrix.setRectToRect(this.f30471b, this.f30472c, Matrix.ScaleToFit.FILL);
                }
                int save2 = canvas.save();
                canvas.clipRect(this.f30471b);
                canvas.concat(this.f30473d);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f30474e.setStyle(Paint.Style.FILL);
            this.f30474e.setColor(this.f30478i);
            this.f30474e.setStrokeWidth(0.0f);
            this.f30474e.setFilterBitmap(i());
            this.f30482m.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f30482m, this.f30474e);
            if (this.f30475f) {
                float width = ((this.f30471b.width() - this.f30471b.height()) + this.f30476g) / 2.0f;
                float height = ((this.f30471b.height() - this.f30471b.width()) + this.f30476g) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f30471b;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + width, rectF3.bottom, this.f30474e);
                    RectF rectF4 = this.f30471b;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - width, rectF4.top, f12, rectF4.bottom, this.f30474e);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f30471b;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + height, this.f30474e);
                    RectF rectF6 = this.f30471b;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - height, rectF6.right, f16, this.f30474e);
                }
            }
        }
        if (this.f30477h != 0) {
            this.f30474e.setStyle(Paint.Style.STROKE);
            this.f30474e.setColor(this.f30477h);
            this.f30474e.setStrokeWidth(this.f30476g);
            this.f30482m.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f30483n, this.f30474e);
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z10) {
        if (this.f30481l != z10) {
            this.f30481l = z10;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z10) {
        this.f30480k = z10;
        k();
        invalidateSelf();
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
        return this.f30481l;
    }

    public void j(int i10) {
        this.f30478i = i10;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k();
    }

    @Override // com.facebook.drawee.drawable.j
    public void setBorder(int i10, float f10) {
        this.f30477h = i10;
        this.f30476g = f10;
        k();
        invalidateSelf();
    }
}
