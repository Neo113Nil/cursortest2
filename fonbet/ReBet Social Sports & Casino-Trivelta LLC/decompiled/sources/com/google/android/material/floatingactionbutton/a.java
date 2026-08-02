package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.AbstractC2074d;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import ua.d;

/* loaded from: classes3.dex */
public class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f35479b;

    /* renamed from: h, reason: collision with root package name */
    public float f35485h;

    /* renamed from: i, reason: collision with root package name */
    public int f35486i;

    /* renamed from: j, reason: collision with root package name */
    public int f35487j;

    /* renamed from: k, reason: collision with root package name */
    public int f35488k;

    /* renamed from: l, reason: collision with root package name */
    public int f35489l;

    /* renamed from: m, reason: collision with root package name */
    public int f35490m;

    /* renamed from: o, reason: collision with root package name */
    public n f35492o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f35493p;

    /* renamed from: a, reason: collision with root package name */
    public final o f35478a = o.l();

    /* renamed from: c, reason: collision with root package name */
    public final Path f35480c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f35481d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f35482e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f35483f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final b f35484g = new b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f35491n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(n nVar) {
        this.f35492o = nVar;
        Paint paint = new Paint(1);
        this.f35479b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        copyBounds(this.f35481d);
        float height = this.f35485h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{AbstractC2074d.g(this.f35486i, this.f35490m), AbstractC2074d.g(this.f35487j, this.f35490m), AbstractC2074d.g(AbstractC2074d.k(this.f35487j, 0), this.f35490m), AbstractC2074d.g(AbstractC2074d.k(this.f35489l, 0), this.f35490m), AbstractC2074d.g(this.f35489l, this.f35490m), AbstractC2074d.g(this.f35488k, this.f35490m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f35483f.set(getBounds());
        return this.f35483f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f35490m = colorStateList.getColorForState(getState(), this.f35490m);
        }
        this.f35493p = colorStateList;
        this.f35491n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f35485h != f10) {
            this.f35485h = f10;
            this.f35479b.setStrokeWidth(f10 * 1.3333f);
            this.f35491n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f35491n) {
            this.f35479b.setShader(a());
            this.f35491n = false;
        }
        float strokeWidth = this.f35479b.getStrokeWidth() / 2.0f;
        copyBounds(this.f35481d);
        this.f35482e.set(this.f35481d);
        float min = Math.min(this.f35492o.r().a(b()), this.f35482e.width() / 2.0f);
        if (this.f35492o.v(b())) {
            this.f35482e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f35482e, min, min, this.f35479b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f35486i = i10;
        this.f35487j = i11;
        this.f35488k = i12;
        this.f35489l = i13;
    }

    public void f(n nVar) {
        this.f35492o = nVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f35484g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f35485h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f35492o.v(b())) {
            outline.setRoundRect(getBounds(), this.f35492o.r().a(b()));
        } else {
            copyBounds(this.f35481d);
            this.f35482e.set(this.f35481d);
            this.f35478a.d(this.f35492o, 1.0f, this.f35482e, this.f35480c);
            d.j(outline, this.f35480c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f35492o.v(b())) {
            return true;
        }
        int round = Math.round(this.f35485h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f35493p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f35491n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f35493p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f35490m)) != this.f35490m) {
            this.f35491n = true;
            this.f35490m = colorForState;
        }
        if (this.f35491n) {
            invalidateSelf();
        }
        return this.f35491n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f35479b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35479b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
