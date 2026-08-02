package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
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
import androidx.annotation.NonNull;
import y7.InterfaceC10852c;
import y7.k;
import y7.l;

/* loaded from: classes9.dex */
final class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f58347b;

    /* renamed from: h, reason: collision with root package name */
    float f58353h;

    /* renamed from: i, reason: collision with root package name */
    private int f58354i;

    /* renamed from: j, reason: collision with root package name */
    private int f58355j;

    /* renamed from: k, reason: collision with root package name */
    private int f58356k;

    /* renamed from: l, reason: collision with root package name */
    private int f58357l;

    /* renamed from: m, reason: collision with root package name */
    private int f58358m;

    /* renamed from: o, reason: collision with root package name */
    private k f58360o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f58361p;

    /* renamed from: a, reason: collision with root package name */
    private final l f58346a = l.b();

    /* renamed from: c, reason: collision with root package name */
    private final Path f58348c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f58349d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f58350e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f58351f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final C0883a f58352g = new C0883a();

    /* renamed from: n, reason: collision with root package name */
    private boolean f58359n = true;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    private class C0883a extends Drawable.ConstantState {
        C0883a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f58360o = kVar;
        Paint paint = new Paint(1);
        this.f58347b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f58358m = colorStateList.getColorForState(getState(), this.f58358m);
        }
        this.f58361p = colorStateList;
        this.f58359n = true;
        invalidateSelf();
    }

    public final void b(float f7) {
        if (this.f58353h != f7) {
            this.f58353h = f7;
            this.f58347b.setStrokeWidth(f7 * 1.3333f);
            this.f58359n = true;
            invalidateSelf();
        }
    }

    final void c(int i11, int i12, int i13, int i14) {
        this.f58354i = i11;
        this.f58355j = i12;
        this.f58356k = i13;
        this.f58357l = i14;
    }

    public final void d(k kVar) {
        this.f58360o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z11 = this.f58359n;
        Paint paint = this.f58347b;
        Rect rect = this.f58349d;
        if (z11) {
            copyBounds(rect);
            float height = this.f58353h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{androidx.core.graphics.c.d(this.f58354i, this.f58358m), androidx.core.graphics.c.d(this.f58355j, this.f58358m), androidx.core.graphics.c.d(androidx.core.graphics.c.f(this.f58355j, 0), this.f58358m), androidx.core.graphics.c.d(androidx.core.graphics.c.f(this.f58357l, 0), this.f58358m), androidx.core.graphics.c.d(this.f58357l, this.f58358m), androidx.core.graphics.c.d(this.f58356k, this.f58358m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f58359n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f58350e;
        rectF.set(rect);
        InterfaceC10852c k11 = this.f58360o.k();
        RectF rectF2 = this.f58351f;
        rectF2.set(getBounds());
        float min = Math.min(k11.a(rectF2), rectF.width() / 2.0f);
        k kVar = this.f58360o;
        rectF2.set(getBounds());
        if (kVar.n(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f58352g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f58353h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        k kVar = this.f58360o;
        RectF rectF = this.f58351f;
        rectF.set(getBounds());
        if (kVar.n(rectF)) {
            InterfaceC10852c k11 = this.f58360o.k();
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), k11.a(rectF));
            return;
        }
        Rect rect = this.f58349d;
        copyBounds(rect);
        RectF rectF2 = this.f58350e;
        rectF2.set(rect);
        k kVar2 = this.f58360o;
        Path path = this.f58348c;
        this.f58346a.a(kVar2, 1.0f, rectF2, null, path);
        if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        k kVar = this.f58360o;
        RectF rectF = this.f58351f;
        rectF.set(getBounds());
        if (!kVar.n(rectF)) {
            return true;
        }
        int round = Math.round(this.f58353h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f58361p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f58359n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f58361p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f58358m)) != this.f58358m) {
            this.f58359n = true;
            this.f58358m = colorForState;
        }
        if (this.f58359n) {
            invalidateSelf();
        }
        return this.f58359n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f58347b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f58347b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
