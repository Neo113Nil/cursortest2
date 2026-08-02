package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xsna.beo0;
import xsna.mb30;
import xsna.n8g;
import xsna.olg0;
import xsna.szx0;
import xsna.t1u0;
import xsna.ubo0;

/* compiled from: ChipDrawable.java */
/* loaded from: classes13.dex */
public final class a extends MaterialShapeDrawable implements Drawable.Callback, beo0.b {
    public static final int[] j0 = {R.attr.state_enabled};
    public static final ShapeDrawable k0 = new ShapeDrawable(new OvalShape());
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;

    @NonNull
    public final Context I;
    public final Paint J;
    public final Paint.FontMetrics K;
    public final RectF L;
    public final PointF M;
    public final Path N;

    @NonNull
    public final beo0 O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public int X;

    @Nullable
    public ColorFilter Y;

    @Nullable
    public PorterDuffColorFilter Z;

    @Nullable
    public ColorStateList a0;

    @Nullable
    public ColorStateList b;

    @Nullable
    public PorterDuff.Mode b0;

    @Nullable
    public ColorStateList c;
    public int[] c0;
    public float d;

    @Nullable
    public ColorStateList d0;
    public float e;

    @NonNull
    public WeakReference<InterfaceC0119a> e0;

    @Nullable
    public ColorStateList f;
    public TextUtils.TruncateAt f0;
    public float g;
    public boolean g0;

    @Nullable
    public ColorStateList h;
    public int h0;

    @Nullable
    public CharSequence i;
    public boolean i0;
    public boolean j;

    @Nullable
    public Drawable k;

    @Nullable
    public ColorStateList l;
    public float m;
    public boolean n;
    public boolean o;

    @Nullable
    public Drawable p;

    @Nullable
    public RippleDrawable q;

    @Nullable
    public ColorStateList r;
    public float s;

    @Nullable
    public SpannableStringBuilder t;
    public boolean u;
    public boolean v;

    @Nullable
    public Drawable w;

    @Nullable
    public ColorStateList x;

    @Nullable
    public mb30 y;

    @Nullable
    public mb30 z;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0119a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.y);
        this.e = -1.0f;
        this.J = new Paint(1);
        this.K = new Paint.FontMetrics();
        this.L = new RectF();
        this.M = new PointF();
        this.N = new Path();
        this.X = 255;
        this.b0 = PorterDuff.Mode.SRC_IN;
        this.e0 = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.I = context;
        beo0 beo0Var = new beo0(this);
        this.O = beo0Var;
        this.i = "";
        beo0Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = j0;
        setState(iArr);
        if (!Arrays.equals(this.c0, iArr)) {
            this.c0 = iArr;
            if (G()) {
                j(getState(), iArr);
            }
        }
        this.g0 = true;
        k0.setTint(-1);
    }

    public static void H(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean g(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean h(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.o != z) {
            boolean G = G();
            this.o = z;
            boolean G2 = G();
            if (G != G2) {
                if (G2) {
                    b(this.p);
                } else {
                    H(this.p);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void B(float f) {
        if (this.C != f) {
            float d = d();
            this.C = f;
            float d2 = d();
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void C(float f) {
        if (this.B != f) {
            float d = d();
            this.B = f;
            float d2 = d();
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void D(@Nullable ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            this.d0 = null;
            onStateChange(getState());
        }
    }

    public final boolean E() {
        return this.v && this.w != null && this.V;
    }

    public final boolean F() {
        return this.j && this.k != null;
    }

    public final boolean G() {
        return this.o && this.p != null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, xsna.beo0.b
    public final void a() {
        i();
        invalidateSelf();
    }

    public final void b(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.p) {
            if (drawable.isStateful()) {
                drawable.setState(this.c0);
            }
            drawable.setTintList(this.r);
            return;
        }
        Drawable drawable2 = this.k;
        if (drawable == drawable2 && this.n) {
            drawable2.setTintList(this.l);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void c(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (F() || E()) {
            float f = this.A + this.B;
            Drawable drawable = this.V ? this.w : this.k;
            float f2 = this.m;
            if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.V ? this.w : this.k;
            float f5 = this.m;
            if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable2 != null) {
                f5 = (float) Math.ceil(t1u0.b(24, this.I));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float d() {
        if (!F() && !E()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.B;
        Drawable drawable = this.V ? this.w : this.k;
        float f2 = this.m;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.C;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.X) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.i0;
        Paint paint = this.J;
        RectF rectF = this.L;
        if (!z) {
            paint.setColor(this.P);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, f(), f(), paint);
        }
        if (!this.i0) {
            paint.setColor(this.Q);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.Y;
            if (colorFilter == null) {
                colorFilter = this.Z;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, f(), f(), paint);
        }
        if (this.i0) {
            super.draw(canvas);
        }
        if (this.g > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.i0) {
            paint.setColor(this.S);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.i0) {
                ColorFilter colorFilter2 = this.Y;
                if (colorFilter2 == null) {
                    colorFilter2 = this.Z;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.g / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.e - (this.g / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.T);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.i0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.N;
            calculatePathForSize(rectF2, path);
            super.drawShape(canvas2, paint, path, getBoundsAsRectF());
        } else {
            canvas2.drawRoundRect(rectF, f(), f(), paint);
        }
        if (F()) {
            c(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.k.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.k.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (E()) {
            c(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.w.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.w.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.g0 && this.i != null) {
            PointF pointF = this.M;
            pointF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.i;
            beo0 beo0Var = this.O;
            if (charSequence != null) {
                float d = d() + this.A + this.D;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + d;
                } else {
                    pointF.x = bounds.right - d;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = beo0Var.a;
                Paint.FontMetrics fontMetrics = this.K;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.i != null) {
                float d2 = d() + this.A + this.D;
                float e = e() + this.H + this.E;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + d2;
                    rectF.right = bounds.right - e;
                } else {
                    rectF.left = bounds.left + e;
                    rectF.right = bounds.right - d2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            ubo0 ubo0Var = beo0Var.g;
            TextPaint textPaint2 = beo0Var.a;
            if (ubo0Var != null) {
                textPaint2.drawableState = getState();
                beo0Var.g.e(this.I, textPaint2, beo0Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(beo0Var.a(this.i.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.i;
            if (z2 && this.f0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f0);
            }
            canvas2.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (G()) {
            rectF.setEmpty();
            if (G()) {
                float f8 = this.H + this.G;
                if (getLayoutDirection() == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.s;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.s;
                }
                float exactCenterY = bounds.exactCenterY();
                float f11 = this.s;
                float f12 = exactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.p.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.q.setBounds(this.p.getBounds());
            this.q.jumpToCurrentState();
            this.q.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.X < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final float e() {
        return G() ? this.F + this.s + this.G : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float f() {
        return this.i0 ? getTopLeftCornerResolvedSize() : this.e;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(e() + this.O.a(this.i.toString()) + d() + this.A + this.D + this.E + this.H), this.h0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.i0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.d, this.e);
        } else {
            outline.setRoundRect(bounds, this.e);
            outline2 = outline;
        }
        outline2.setAlpha(this.X / 255.0f);
    }

    public final void i() {
        InterfaceC0119a interfaceC0119a = this.e0.get();
        if (interfaceC0119a != null) {
            interfaceC0119a.a();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (g(this.b) || g(this.c) || g(this.f)) {
            return true;
        }
        ubo0 ubo0Var = this.O.g;
        if (ubo0Var == null || (colorStateList = ubo0Var.j) == null || !colorStateList.isStateful()) {
            return (this.v && this.w != null && this.u) || h(this.k) || h(this.w) || g(this.a0);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(@NonNull int[] iArr, @NonNull int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.b;
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.P) : 0);
        boolean z3 = true;
        if (this.P != compositeElevationOverlayIfNeeded) {
            this.P = compositeElevationOverlayIfNeeded;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.c;
        int compositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.Q) : 0);
        if (this.Q != compositeElevationOverlayIfNeeded2) {
            this.Q = compositeElevationOverlayIfNeeded2;
            onStateChange = true;
        }
        int i2 = n8g.i(compositeElevationOverlayIfNeeded2, compositeElevationOverlayIfNeeded);
        if ((this.R != i2) | (getFillColor() == null)) {
            this.R = i2;
            setFillColor(ColorStateList.valueOf(i2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.S) : 0;
        if (this.S != colorForState3) {
            this.S = colorForState3;
            onStateChange = true;
        }
        if (this.d0 != null) {
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i3 : iArr) {
                if (i3 == 16842910) {
                    z5 = true;
                } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                    z6 = true;
                }
            }
            if (z5 && z6) {
                z4 = true;
            }
            if (z4) {
                i = this.d0.getColorForState(iArr, this.T);
                if (this.T != i) {
                    this.T = i;
                }
                ubo0 ubo0Var = this.O.g;
                colorForState = (ubo0Var != null || (colorStateList = ubo0Var.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.U);
                if (this.U != colorForState) {
                    this.U = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (state[i4] != 16842912) {
                            i4++;
                        } else if (this.u) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.V != z || this.w == null) {
                    z2 = false;
                } else {
                    float d = d();
                    this.V = z;
                    if (d != d()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.a0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.W) : 0;
                if (this.W == colorForState2) {
                    this.W = colorForState2;
                    ColorStateList colorStateList6 = this.a0;
                    PorterDuff.Mode mode = this.b0;
                    this.Z = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (h(this.k)) {
                    z3 |= this.k.setState(iArr);
                }
                if (h(this.w)) {
                    z3 |= this.w.setState(iArr);
                }
                if (h(this.p)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.p.setState(iArr3);
                }
                if (h(this.q)) {
                    z3 |= this.q.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    i();
                }
                return z3;
            }
        }
        i = 0;
        if (this.T != i) {
        }
        ubo0 ubo0Var2 = this.O.g;
        if (ubo0Var2 != null) {
        }
        if (this.U != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.V != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.a0;
        if (colorStateList52 == null) {
        }
        if (this.W == colorForState2) {
        }
        if (h(this.k)) {
        }
        if (h(this.w)) {
        }
        if (h(this.p)) {
        }
        if (h(this.q)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void k(boolean z) {
        if (this.u != z) {
            this.u = z;
            float d = d();
            if (!z && this.V) {
                this.V = false;
            }
            float d2 = d();
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void l(@Nullable Drawable drawable) {
        if (this.w != drawable) {
            float d = d();
            this.w = drawable;
            float d2 = d();
            H(this.w);
            b(this.w);
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void m(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        if (this.x != colorStateList) {
            this.x = colorStateList;
            if (this.v && (drawable = this.w) != null && this.u) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void n(boolean z) {
        if (this.v != z) {
            boolean E = E();
            this.v = z;
            boolean E2 = E();
            if (E != E2) {
                if (E2) {
                    b(this.w);
                } else {
                    H(this.w);
                }
                invalidateSelf();
                i();
            }
        }
    }

    @Deprecated
    public final void o(float f) {
        if (this.e != f) {
            this.e = f;
            setShapeAppearanceModel(getShapeAppearanceModel().f(f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (F()) {
            onLayoutDirectionChanged |= this.k.setLayoutDirection(i);
        }
        if (E()) {
            onLayoutDirectionChanged |= this.w.setLayoutDirection(i);
        }
        if (G()) {
            onLayoutDirectionChanged |= this.p.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (F()) {
            onLevelChange |= this.k.setLevel(i);
        }
        if (E()) {
            onLevelChange |= this.w.setLevel(i);
        }
        if (G()) {
            onLevelChange |= this.p.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, xsna.beo0.b
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.i0) {
            super.onStateChange(iArr);
        }
        return j(iArr, this.c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.k;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof szx0;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((szx0) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float d = d();
            this.k = drawable != null ? drawable.mutate() : null;
            float d2 = d();
            H(drawable2);
            if (F()) {
                b(this.k);
            }
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void q(float f) {
        if (this.m != f) {
            float d = d();
            this.m = f;
            float d2 = d();
            invalidateSelf();
            if (d != d2) {
                i();
            }
        }
    }

    public final void r(@Nullable ColorStateList colorStateList) {
        this.n = true;
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (F()) {
                this.k.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void s(boolean z) {
        if (this.j != z) {
            boolean F = F();
            this.j = z;
            boolean F2 = F();
            if (F != F2) {
                if (F2) {
                    b(this.k);
                } else {
                    H(this.k);
                }
                invalidateSelf();
                i();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.X != i) {
            this.X = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.Y != colorFilter) {
            this.Y = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.b0 != mode) {
            this.b0 = mode;
            ColorStateList colorStateList = this.a0;
            this.Z = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (F()) {
            visible |= this.k.setVisible(z, z2);
        }
        if (E()) {
            visible |= this.w.setVisible(z, z2);
        }
        if (G()) {
            visible |= this.p.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(@Nullable ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            if (this.i0) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void u(float f) {
        if (this.g != f) {
            this.g = f;
            this.J.setStrokeWidth(f);
            if (this.i0) {
                super.setStrokeWidth(f);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.p;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof szx0;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((szx0) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float e = e();
            this.p = drawable != null ? drawable.mutate() : null;
            this.q = new RippleDrawable(olg0.c(this.h), this.p, k0);
            float e2 = e();
            H(drawable2);
            if (G()) {
                b(this.p);
            }
            invalidateSelf();
            if (e != e2) {
                i();
            }
        }
    }

    public final void w(float f) {
        if (this.G != f) {
            this.G = f;
            invalidateSelf();
            if (G()) {
                i();
            }
        }
    }

    public final void x(float f) {
        if (this.s != f) {
            this.s = f;
            invalidateSelf();
            if (G()) {
                i();
            }
        }
    }

    public final void y(float f) {
        if (this.F != f) {
            this.F = f;
            invalidateSelf();
            if (G()) {
                i();
            }
        }
    }

    public final void z(@Nullable ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            if (G()) {
                this.p.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
