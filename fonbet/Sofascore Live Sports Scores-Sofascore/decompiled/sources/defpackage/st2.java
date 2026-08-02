package defpackage;

import android.R;
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
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class st2 extends qzb implements Drawable.Callback, d9j {
    public static final int[] P0 = {R.attr.state_enabled};
    public static final ShapeDrawable Q0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public ColorFilter E0;
    public PorterDuffColorFilter F0;
    public ColorStateList G0;
    public ColorStateList H;
    public PorterDuff.Mode H0;
    public ColorStateList I;
    public int[] I0;
    public float J;
    public ColorStateList J0;
    public float K;
    public WeakReference K0;
    public ColorStateList L;
    public TextUtils.TruncateAt L0;
    public float M;
    public boolean M0;
    public ColorStateList N;
    public int N0;
    public CharSequence O;
    public boolean O0;
    public boolean P;
    public Drawable Q;
    public ColorStateList R;
    public float S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public RippleDrawable W;
    public ColorStateList X;
    public float Y;
    public SpannableStringBuilder Z;
    public boolean a0;
    public boolean b0;
    public Drawable c0;
    public ColorStateList d0;
    public cwc e0;
    public cwc f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public final Context o0;
    public final Paint p0;
    public final Paint.FontMetrics q0;
    public final RectF r0;
    public final PointF s0;
    public final Path t0;
    public final e9j u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public st2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = -1.0f;
        this.p0 = new Paint(1);
        this.q0 = new Paint.FontMetrics();
        this.r0 = new RectF();
        this.s0 = new PointF();
        this.t0 = new Path();
        this.D0 = 255;
        this.H0 = PorterDuff.Mode.SRC_IN;
        this.K0 = new WeakReference(null);
        p(context);
        this.o0 = context;
        e9j e9jVar = new e9j(this);
        this.u0 = e9jVar;
        this.O = "";
        e9jVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = P0;
        setState(iArr);
        d0(iArr);
        this.M0 = true;
        Q0.setTint(-1);
    }

    public static boolean K(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean L(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void m0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void F(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.V) {
            drawable.setTintList(this.X);
            if (drawable.isStateful()) {
                drawable.setState(this.I0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.Q;
        if (drawable == drawable2 && this.T) {
            drawable2.setTintList(this.R);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (k0() || j0()) {
            float f = this.g0 + this.h0;
            Drawable drawable = this.B0 ? this.c0 : this.Q;
            float f2 = this.S;
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
            Drawable drawable2 = this.B0 ? this.c0 : this.Q;
            float f5 = this.S;
            if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable2 != null) {
                f5 = (float) Math.ceil(vha.p(24, this.o0));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float H() {
        if (!k0() && !j0()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.h0;
        Drawable drawable = this.B0 ? this.c0 : this.Q;
        float f2 = this.S;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.i0;
    }

    public final float I() {
        return l0() ? this.l0 + this.Y + this.m0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float J() {
        return this.O0 ? m() : this.K;
    }

    public final void M() {
        Chip chip = (Chip) this.K0.get();
        if (chip != null) {
            chip.c(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.H;
        int e = e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.v0) : 0);
        boolean z3 = true;
        if (this.v0 != e) {
            this.v0 = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.I;
        int e2 = e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.w0) : 0);
        if (this.w0 != e2) {
            this.w0 = e2;
            onStateChange = true;
        }
        int h = o23.h(e2, e);
        if ((this.x0 != h) | (this.b.c == null)) {
            this.x0 = h;
            t(ColorStateList.valueOf(h));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.L;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.y0) : 0;
        if (this.y0 != colorForState3) {
            this.y0 = colorForState3;
            onStateChange = true;
        }
        if (this.J0 != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.J0.getColorForState(iArr, this.z0);
                if (this.z0 != i) {
                    this.z0 = i;
                }
                z7j z7jVar = this.u0.g;
                colorForState = (z7jVar != null || (colorStateList = z7jVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.A0);
                if (this.A0 != colorForState) {
                    this.A0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.a0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.B0 != z || this.c0 == null) {
                    z2 = false;
                } else {
                    float H = H();
                    this.B0 = z;
                    if (H != H()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.G0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.C0) : 0;
                if (this.C0 == colorForState2) {
                    this.C0 = colorForState2;
                    ColorStateList colorStateList6 = this.G0;
                    PorterDuff.Mode mode = this.H0;
                    this.F0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (L(this.Q)) {
                    z3 |= this.Q.setState(iArr);
                }
                if (L(this.c0)) {
                    z3 |= this.c0.setState(iArr);
                }
                if (L(this.V)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.V.setState(iArr3);
                }
                if (L(this.W)) {
                    z3 |= this.W.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    M();
                }
                return z3;
            }
        }
        i = 0;
        if (this.z0 != i) {
        }
        z7j z7jVar2 = this.u0.g;
        if (z7jVar2 != null) {
        }
        if (this.A0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.B0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.G0;
        if (colorStateList52 == null) {
        }
        if (this.C0 == colorForState2) {
        }
        if (L(this.Q)) {
        }
        if (L(this.c0)) {
        }
        if (L(this.V)) {
        }
        if (L(this.W)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void O(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            float H = H();
            if (!z && this.B0) {
                this.B0 = false;
            }
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void P(Drawable drawable) {
        if (this.c0 != drawable) {
            float H = H();
            this.c0 = drawable;
            float H2 = H();
            m0(this.c0);
            F(this.c0);
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (this.b0 && (drawable = this.c0) != null && this.a0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z) {
        if (this.b0 != z) {
            boolean j0 = j0();
            this.b0 = z;
            boolean j02 = j0();
            if (j0 != j02) {
                Drawable drawable = this.c0;
                if (j02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void S(float f) {
        if (this.K != f) {
            this.K = f;
            setShapeAppearanceModel(k().a(f));
        }
    }

    public final void T(Drawable drawable) {
        Drawable drawable2 = this.Q;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float H = H();
            this.Q = drawable != null ? drawable.mutate() : null;
            float H2 = H();
            m0(drawable2);
            if (k0()) {
                F(this.Q);
            }
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void U(float f) {
        if (this.S != f) {
            float H = H();
            this.S = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        this.T = true;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (k0()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z) {
        if (this.P != z) {
            boolean k0 = k0();
            this.P = z;
            boolean k02 = k0();
            if (k0 != k02) {
                Drawable drawable = this.Q;
                if (k02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.O0) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f) {
        if (this.M != f) {
            this.M = f;
            this.p0.setStrokeWidth(f);
            if (this.O0) {
                A(f);
            }
            invalidateSelf();
        }
    }

    public final void Z(Drawable drawable) {
        Drawable drawable2 = this.V;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float I = I();
            this.V = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(rfo.J(this.N), this.V, Q0);
            FocusRingDrawable.f(this.o0, rippleDrawable, null);
            this.W = rippleDrawable;
            float I2 = I();
            m0(drawable2);
            if (l0()) {
                F(this.V);
            }
            invalidateSelf();
            if (I != I2) {
                M();
            }
        }
    }

    @Override // defpackage.qzb, defpackage.d9j
    public final void a() {
        M();
        invalidateSelf();
    }

    public final void a0(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void b0(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void c0(float f) {
        if (this.l0 != f) {
            this.l0 = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final boolean d0(int[] iArr) {
        if (Arrays.equals(this.I0, iArr)) {
            return false;
        }
        this.I0 = iArr;
        if (l0()) {
            return N(getState(), iArr);
        }
        return false;
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.D0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.O0;
        Paint paint = this.p0;
        RectF rectF = this.r0;
        if (!z) {
            paint.setColor(this.v0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (!this.O0) {
            paint.setColor(this.w0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.E0;
            if (colorFilter == null) {
                colorFilter = this.F0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (this.O0) {
            super.draw(canvas);
        }
        if (this.M > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.O0) {
            paint.setColor(this.y0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.O0) {
                ColorFilter colorFilter2 = this.E0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.F0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.M / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.K - (this.M / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.z0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.O0) {
            RectF rectF2 = new RectF(bounds);
            xah d = this.b.a.d();
            float[] fArr = this.C;
            float f5 = this.b.j;
            d4a d4aVar = this.r;
            qn2 qn2Var = this.s;
            f = 2.0f;
            Path path = this.t0;
            qn2Var.c(d, fArr, f5, rectF2, d4aVar, path);
            g(canvas2, paint, path, this.b.a.d(), this.C, i());
        } else {
            canvas2.drawRoundRect(rectF, J(), J(), paint);
            f = 2.0f;
        }
        if (k0()) {
            G(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Q.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (j0()) {
            G(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.c0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.c0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.M0 && this.O != null) {
            PointF pointF = this.s0;
            pointF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.O;
            e9j e9jVar = this.u0;
            if (charSequence != null) {
                float H = H() + this.g0 + this.j0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + H;
                } else {
                    pointF.x = bounds.right - H;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = e9jVar.a;
                Paint.FontMetrics fontMetrics = this.q0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.O != null) {
                float H2 = H() + this.g0 + this.j0;
                float I = I() + this.n0 + this.k0;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + H2;
                    rectF.right = bounds.right - I;
                } else {
                    rectF.left = i4 + I;
                    rectF.right = bounds.right - H2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            z7j z7jVar = e9jVar.g;
            TextPaint textPaint2 = e9jVar.a;
            if (z7jVar != null) {
                textPaint2.drawableState = getState();
                e9jVar.g.d(this.o0, textPaint2, e9jVar.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(e9jVar.a(this.O.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.O;
            if (z2 && this.L0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.L0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (l0()) {
            rectF.setEmpty();
            if (l0()) {
                float f10 = this.n0 + this.m0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.Y;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.Y;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.Y;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.setBounds(this.V.getBounds());
            this.W.jumpToCurrentState();
            this.W.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.D0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final void e0(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (l0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z) {
        if (this.U != z) {
            boolean l0 = l0();
            this.U = z;
            boolean l02 = l0();
            if (l0 != l02) {
                Drawable drawable = this.V;
                if (l02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void g0(float f) {
        if (this.i0 != f) {
            float H = H();
            this.i0 = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(I() + this.u0.a(this.O.toString()) + H() + this.g0 + this.j0 + this.k0 + this.n0), this.N0);
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.O0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        } else {
            outline.setRoundRect(bounds, this.K);
            outline2 = outline;
        }
        outline2.setAlpha(this.D0 / 255.0f);
    }

    public final void h0(float f) {
        if (this.h0 != f) {
            float H = H();
            this.h0 = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void i0(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.J0 = null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (K(this.H) || K(this.I) || K(this.L)) {
            return true;
        }
        z7j z7jVar = this.u0.g;
        if (z7jVar == null || (colorStateList = z7jVar.k) == null || !colorStateList.isStateful()) {
            return (this.b0 && this.c0 != null && this.a0) || L(this.Q) || L(this.c0) || K(this.G0);
        }
        return true;
    }

    public final boolean j0() {
        return this.b0 && this.c0 != null && this.B0;
    }

    public final boolean k0() {
        return this.P && this.Q != null;
    }

    public final boolean l0() {
        return this.U && this.V != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (k0()) {
            onLayoutDirectionChanged |= this.Q.setLayoutDirection(i);
        }
        if (j0()) {
            onLayoutDirectionChanged |= this.c0.setLayoutDirection(i);
        }
        if (l0()) {
            onLayoutDirectionChanged |= this.V.setLayoutDirection(i);
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
        if (k0()) {
            onLevelChange |= this.Q.setLevel(i);
        }
        if (j0()) {
            onLevelChange |= this.c0.setLevel(i);
        }
        if (l0()) {
            onLevelChange |= this.V.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.O0) {
            super.onStateChange(iArr);
        }
        return N(iArr, this.I0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.E0 != colorFilter) {
            this.E0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.qzb, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            ColorStateList colorStateList = this.G0;
            this.F0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (k0()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (j0()) {
            visible |= this.c0.setVisible(z, z2);
        }
        if (l0()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
