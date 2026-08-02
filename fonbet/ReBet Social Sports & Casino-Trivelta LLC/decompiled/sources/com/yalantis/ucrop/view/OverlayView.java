package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import fd.c;
import fd.i;
import gd.d;
import jd.g;

/* loaded from: classes4.dex */
public class OverlayView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f42294a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f42295b;

    /* renamed from: c, reason: collision with root package name */
    public int f42296c;

    /* renamed from: d, reason: collision with root package name */
    public int f42297d;

    /* renamed from: e, reason: collision with root package name */
    public int f42298e;

    /* renamed from: f, reason: collision with root package name */
    public int f42299f;

    /* renamed from: g, reason: collision with root package name */
    public float f42300g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42301h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f42302i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42303j;

    /* renamed from: k, reason: collision with root package name */
    public int f42304k;

    /* renamed from: l, reason: collision with root package name */
    public Path f42305l;

    /* renamed from: m, reason: collision with root package name */
    public Paint f42306m;
    protected float[] mCropGridCenter;
    protected float[] mCropGridCorners;
    private float[] mGridPoints;

    /* renamed from: n, reason: collision with root package name */
    public Paint f42307n;

    /* renamed from: o, reason: collision with root package name */
    public Paint f42308o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f42309p;

    /* renamed from: q, reason: collision with root package name */
    public int f42310q;

    /* renamed from: r, reason: collision with root package name */
    public float f42311r;

    /* renamed from: s, reason: collision with root package name */
    public float f42312s;

    /* renamed from: t, reason: collision with root package name */
    public int f42313t;

    /* renamed from: u, reason: collision with root package name */
    public int f42314u;

    /* renamed from: v, reason: collision with root package name */
    public int f42315v;

    /* renamed from: w, reason: collision with root package name */
    public int f42316w;

    /* renamed from: x, reason: collision with root package name */
    public d f42317x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f42318y;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(Canvas canvas) {
        if (this.f42302i) {
            if (this.mGridPoints == null && !this.f42294a.isEmpty()) {
                this.mGridPoints = new float[(this.f42298e * 4) + (this.f42299f * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f42298e; i11++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.f42294a;
                    fArr[i10] = rectF.left;
                    float f10 = i11 + 1.0f;
                    float height = rectF.height() * (f10 / (this.f42298e + 1));
                    RectF rectF2 = this.f42294a;
                    fArr[i10 + 1] = height + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i12 = i10 + 3;
                    fArr2[i10 + 2] = rectF2.right;
                    i10 += 4;
                    fArr2[i12] = (rectF2.height() * (f10 / (this.f42298e + 1))) + this.f42294a.top;
                }
                for (int i13 = 0; i13 < this.f42299f; i13++) {
                    float[] fArr3 = this.mGridPoints;
                    float f11 = i13 + 1.0f;
                    float width = this.f42294a.width() * (f11 / (this.f42299f + 1));
                    RectF rectF3 = this.f42294a;
                    fArr3[i10] = width + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i10 + 1] = rectF3.top;
                    int i14 = i10 + 3;
                    float width2 = rectF3.width() * (f11 / (this.f42299f + 1));
                    RectF rectF4 = this.f42294a;
                    fArr4[i10 + 2] = width2 + rectF4.left;
                    i10 += 4;
                    this.mGridPoints[i14] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f42307n);
            }
        }
        if (this.f42301h) {
            canvas.drawRect(this.f42294a, this.f42308o);
        }
        if (this.f42310q != 0) {
            canvas.save();
            this.f42295b.set(this.f42294a);
            this.f42295b.inset(this.f42316w, -r1);
            RectF rectF5 = this.f42295b;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF5, op);
            this.f42295b.set(this.f42294a);
            this.f42295b.inset(-r2, this.f42316w);
            canvas.clipRect(this.f42295b, op);
            canvas.drawRect(this.f42294a, this.f42309p);
            canvas.restore();
        }
    }

    public void b(Canvas canvas) {
        canvas.save();
        if (this.f42303j) {
            canvas.clipPath(this.f42305l, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f42294a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f42304k);
        canvas.restore();
        if (this.f42303j) {
            canvas.drawCircle(this.f42294a.centerX(), this.f42294a.centerY(), Math.min(this.f42294a.width(), this.f42294a.height()) / 2.0f, this.f42306m);
        }
    }

    public final int c(float f10, float f11) {
        double d10 = this.f42314u;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double sqrt = Math.sqrt(Math.pow(f10 - this.mCropGridCorners[i11], 2.0d) + Math.pow(f11 - this.mCropGridCorners[i11 + 1], 2.0d));
            if (sqrt < d10) {
                i10 = i11 / 2;
                d10 = sqrt;
            }
        }
        if (this.f42310q == 1 && i10 < 0 && this.f42294a.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    public void d() {
    }

    public final void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f46675i, getResources().getDimensionPixelSize(c.f46619a));
        int color = typedArray.getColor(i.f46674h, getResources().getColor(fd.b.f46608c));
        this.f42308o.setStrokeWidth(dimensionPixelSize);
        this.f42308o.setColor(color);
        Paint paint = this.f42308o;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f42309p.setStrokeWidth(dimensionPixelSize * 3);
        this.f42309p.setColor(color);
        this.f42309p.setStyle(style);
    }

    public final void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.f46679m, getResources().getDimensionPixelSize(c.f46620b));
        int color = typedArray.getColor(i.f46676j, getResources().getColor(fd.b.f46609d));
        this.f42307n.setStrokeWidth(dimensionPixelSize);
        this.f42307n.setColor(color);
        this.f42298e = typedArray.getInt(i.f46678l, 2);
        this.f42299f = typedArray.getInt(i.f46677k, 2);
    }

    public void g(TypedArray typedArray) {
        this.f42303j = typedArray.getBoolean(i.f46672f, false);
        int color = typedArray.getColor(i.f46673g, getResources().getColor(fd.b.f46610e));
        this.f42304k = color;
        this.f42306m.setColor(color);
        this.f42306m.setStyle(Paint.Style.STROKE);
        this.f42306m.setStrokeWidth(1.0f);
        e(typedArray);
        this.f42301h = typedArray.getBoolean(i.f46680n, true);
        f(typedArray);
        this.f42302i = typedArray.getBoolean(i.f46681o, true);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f42294a;
    }

    public int getFreestyleCropMode() {
        return this.f42310q;
    }

    public d getOverlayViewChangeListener() {
        return this.f42317x;
    }

    public void h() {
        int i10 = this.f42296c;
        float f10 = this.f42300g;
        int i11 = (int) (i10 / f10);
        int i12 = this.f42297d;
        if (i11 > i12) {
            int i13 = (i10 - ((int) (i12 * f10))) / 2;
            this.f42294a.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + r1 + i13, getPaddingTop() + this.f42297d);
        } else {
            int i14 = (i12 - i11) / 2;
            this.f42294a.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.f42296c, getPaddingTop() + i11 + i14);
        }
        d dVar = this.f42317x;
        if (dVar != null) {
            dVar.a(this.f42294a);
        }
        j();
    }

    public final void i(float f10, float f11) {
        this.f42295b.set(this.f42294a);
        int i10 = this.f42313t;
        if (i10 == 0) {
            RectF rectF = this.f42295b;
            RectF rectF2 = this.f42294a;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f42295b;
            RectF rectF4 = this.f42294a;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f42295b;
            RectF rectF6 = this.f42294a;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f42295b;
            RectF rectF8 = this.f42294a;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f42295b.offset(f10 - this.f42311r, f11 - this.f42312s);
            if (this.f42295b.left <= getLeft() || this.f42295b.top <= getTop() || this.f42295b.right >= getRight() || this.f42295b.bottom >= getBottom()) {
                return;
            }
            this.f42294a.set(this.f42295b);
            j();
            postInvalidate();
            return;
        }
        boolean z10 = this.f42295b.height() >= ((float) this.f42315v);
        boolean z11 = this.f42295b.width() >= ((float) this.f42315v);
        RectF rectF9 = this.f42294a;
        rectF9.set(z11 ? this.f42295b.left : rectF9.left, z10 ? this.f42295b.top : rectF9.top, z11 ? this.f42295b.right : rectF9.right, z10 ? this.f42295b.bottom : rectF9.bottom);
        if (z10 || z11) {
            j();
            postInvalidate();
        }
    }

    public final void j() {
        this.mCropGridCorners = g.b(this.f42294a);
        this.mCropGridCenter = g.a(this.f42294a);
        this.mGridPoints = null;
        this.f42305l.reset();
        this.f42305l.addCircle(this.f42294a.centerX(), this.f42294a.centerY(), Math.min(this.f42294a.width(), this.f42294a.height()) / 2.0f, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f42296c = width - paddingLeft;
            this.f42297d = height - paddingTop;
            if (this.f42318y) {
                this.f42318y = false;
                setTargetAspectRatio(this.f42300g);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42294a.isEmpty() && this.f42310q != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c10 = c(x10, y10);
                this.f42313t = c10;
                boolean z10 = c10 != -1;
                if (!z10) {
                    this.f42311r = -1.0f;
                    this.f42312s = -1.0f;
                    return z10;
                }
                if (this.f42311r < 0.0f) {
                    this.f42311r = x10;
                    this.f42312s = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f42313t != -1) {
                float min = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                i(min, min2);
                this.f42311r = min;
                this.f42312s = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.f42311r = -1.0f;
                this.f42312s = -1.0f;
                this.f42313t = -1;
                d dVar = this.f42317x;
                if (dVar != null) {
                    dVar.a(this.f42294a);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f42303j = z10;
    }

    public void setCropFrameColor(int i10) {
        this.f42308o.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.f42308o.setStrokeWidth(i10);
    }

    public void setCropGridColor(int i10) {
        this.f42307n.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.f42299f = i10;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(int i10) {
        this.f42298e = i10;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.f42307n.setStrokeWidth(i10);
    }

    public void setDimmedColor(int i10) {
        this.f42304k = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f42310q = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f42310q = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.f42317x = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f42301h = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f42302i = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f42300g = f10;
        if (this.f42296c <= 0) {
            this.f42318y = true;
        } else {
            h();
            postInvalidate();
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42294a = new RectF();
        this.f42295b = new RectF();
        this.mGridPoints = null;
        this.f42305l = new Path();
        this.f42306m = new Paint(1);
        this.f42307n = new Paint(1);
        this.f42308o = new Paint(1);
        this.f42309p = new Paint(1);
        this.f42310q = 0;
        this.f42311r = -1.0f;
        this.f42312s = -1.0f;
        this.f42313t = -1;
        this.f42314u = getResources().getDimensionPixelSize(c.f46622d);
        this.f42315v = getResources().getDimensionPixelSize(c.f46623e);
        this.f42316w = getResources().getDimensionPixelSize(c.f46621c);
        d();
    }
}
