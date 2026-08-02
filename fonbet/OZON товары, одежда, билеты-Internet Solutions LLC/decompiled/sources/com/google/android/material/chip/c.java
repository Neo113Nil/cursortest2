package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.f;
import i7.C7017a;
import j7.C7299h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s7.C9616k;
import s7.C9619n;
import s7.C9621p;
import w7.C10444a;
import y7.C10856g;

/* loaded from: classes9.dex */
public final class c extends C10856g implements Drawable.Callback, C9616k.b {

    /* renamed from: Y0, reason: collision with root package name */
    private static final int[] f58149Y0 = {R.attr.state_enabled};

    /* renamed from: Z0, reason: collision with root package name */
    private static final ShapeDrawable f58150Z0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private float f58151A;

    /* renamed from: A0, reason: collision with root package name */
    private final RectF f58152A0;

    /* renamed from: B, reason: collision with root package name */
    private float f58153B;

    /* renamed from: B0, reason: collision with root package name */
    private final PointF f58154B0;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f58155C;

    /* renamed from: C0, reason: collision with root package name */
    private final Path f58156C0;

    /* renamed from: D, reason: collision with root package name */
    private float f58157D;

    /* renamed from: D0, reason: collision with root package name */
    @NonNull
    private final C9616k f58158D0;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f58159E;

    /* renamed from: E0, reason: collision with root package name */
    private int f58160E0;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f58161F;

    /* renamed from: F0, reason: collision with root package name */
    private int f58162F0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f58163G;

    /* renamed from: G0, reason: collision with root package name */
    private int f58164G0;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f58165H;

    /* renamed from: H0, reason: collision with root package name */
    private int f58166H0;

    /* renamed from: I, reason: collision with root package name */
    private ColorStateList f58167I;

    /* renamed from: I0, reason: collision with root package name */
    private int f58168I0;

    /* renamed from: J, reason: collision with root package name */
    private float f58169J;

    /* renamed from: J0, reason: collision with root package name */
    private int f58170J0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f58171K;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f58172K0;

    /* renamed from: L, reason: collision with root package name */
    private boolean f58173L;

    /* renamed from: L0, reason: collision with root package name */
    private int f58174L0;

    /* renamed from: M, reason: collision with root package name */
    private Drawable f58175M;

    /* renamed from: M0, reason: collision with root package name */
    private int f58176M0;

    /* renamed from: N, reason: collision with root package name */
    private RippleDrawable f58177N;

    /* renamed from: N0, reason: collision with root package name */
    private ColorFilter f58178N0;

    /* renamed from: O, reason: collision with root package name */
    private ColorStateList f58179O;

    /* renamed from: O0, reason: collision with root package name */
    private PorterDuffColorFilter f58180O0;

    /* renamed from: P, reason: collision with root package name */
    private float f58181P;

    /* renamed from: P0, reason: collision with root package name */
    private ColorStateList f58182P0;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f58183Q;

    /* renamed from: Q0, reason: collision with root package name */
    private PorterDuff.Mode f58184Q0;

    /* renamed from: R, reason: collision with root package name */
    private boolean f58185R;

    /* renamed from: R0, reason: collision with root package name */
    private int[] f58186R0;

    /* renamed from: S, reason: collision with root package name */
    private Drawable f58187S;

    /* renamed from: S0, reason: collision with root package name */
    private ColorStateList f58188S0;

    /* renamed from: T0, reason: collision with root package name */
    @NonNull
    private WeakReference<a> f58189T0;

    /* renamed from: U0, reason: collision with root package name */
    private TextUtils.TruncateAt f58190U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f58191V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f58192W0;

    /* renamed from: X, reason: collision with root package name */
    private ColorStateList f58193X;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f58194X0;

    /* renamed from: Y, reason: collision with root package name */
    private float f58195Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f58196Z;

    /* renamed from: r0, reason: collision with root package name */
    private float f58197r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f58198s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f58199t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f58200u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f58201v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f58202w0;

    /* renamed from: x0, reason: collision with root package name */
    @NonNull
    private final Context f58203x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f58204y;

    /* renamed from: y0, reason: collision with root package name */
    private final Paint f58205y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f58206z;

    /* renamed from: z0, reason: collision with root package name */
    private final Paint.FontMetrics f58207z0;

    public interface a {
        void a();
    }

    private c(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.ozon.app.android.R.attr.chipStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_Chip_Action);
        this.f58153B = -1.0f;
        this.f58205y0 = new Paint(1);
        this.f58207z0 = new Paint.FontMetrics();
        this.f58152A0 = new RectF();
        this.f58154B0 = new PointF();
        this.f58156C0 = new Path();
        this.f58176M0 = 255;
        this.f58184Q0 = PorterDuff.Mode.SRC_IN;
        this.f58189T0 = new WeakReference<>(null);
        v(context);
        this.f58203x0 = context;
        C9616k c9616k = new C9616k(this);
        this.f58158D0 = c9616k;
        this.f58161F = "";
        c9616k.d().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f58149Y0;
        setState(iArr);
        m0(iArr);
        this.f58191V0 = true;
        int i11 = C10444a.f103609f;
        f58150Z0.setTint(-1);
    }

    private void O(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.h(drawable, androidx.core.graphics.drawable.a.d(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f58175M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f58186R0);
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f58179O);
            return;
        }
        Drawable drawable2 = this.f58165H;
        if (drawable == drawable2 && this.f58171K) {
            androidx.core.graphics.drawable.a.j(drawable2, this.f58167I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void P(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (w0() || v0()) {
            float f7 = this.f58195Y + this.f58196Z;
            Drawable drawable = this.f58172K0 ? this.f58187S : this.f58165H;
            float f11 = this.f58169J;
            if (f11 <= 0.0f && drawable != null) {
                f11 = drawable.getIntrinsicWidth();
            }
            if (androidx.core.graphics.drawable.a.d(this) == 0) {
                float f12 = rect.left + f7;
                rectF.left = f12;
                rectF.right = f12 + f11;
            } else {
                float f13 = rect.right - f7;
                rectF.right = f13;
                rectF.left = f13 - f11;
            }
            Drawable drawable2 = this.f58172K0 ? this.f58187S : this.f58165H;
            float f14 = this.f58169J;
            if (f14 <= 0.0f && drawable2 != null) {
                f14 = (float) Math.ceil(C9621p.b(24, this.f58203x0));
                if (drawable2.getIntrinsicHeight() <= f14) {
                    f14 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f14 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static c S(@NonNull Context context, AttributeSet attributeSet) {
        Drawable drawable;
        ColorStateList a11;
        Drawable drawable2;
        int resourceId;
        c cVar = new c(context, attributeSet);
        TypedArray e11 = C9619n.e(cVar.f58203x0, attributeSet, C7017a.f65941g, ru.ozon.app.android.R.attr.chipStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        cVar.f58194X0 = e11.hasValue(37);
        Context context2 = cVar.f58203x0;
        ColorStateList a12 = v7.c.a(context2, e11, 24);
        if (cVar.f58204y != a12) {
            cVar.f58204y = a12;
            cVar.onStateChange(cVar.getState());
        }
        ColorStateList a13 = v7.c.a(context2, e11, 11);
        if (cVar.f58206z != a13) {
            cVar.f58206z = a13;
            cVar.onStateChange(cVar.getState());
        }
        float dimension = e11.getDimension(19, 0.0f);
        if (cVar.f58151A != dimension) {
            cVar.f58151A = dimension;
            cVar.invalidateSelf();
            cVar.i0();
        }
        if (e11.hasValue(12)) {
            float dimension2 = e11.getDimension(12, 0.0f);
            if (cVar.f58153B != dimension2) {
                cVar.f58153B = dimension2;
                cVar.setShapeAppearanceModel(cVar.r().o(dimension2));
            }
        }
        ColorStateList a14 = v7.c.a(context2, e11, 22);
        if (cVar.f58155C != a14) {
            cVar.f58155C = a14;
            if (cVar.f58194X0) {
                cVar.J(a14);
            }
            cVar.onStateChange(cVar.getState());
        }
        float dimension3 = e11.getDimension(23, 0.0f);
        if (cVar.f58157D != dimension3) {
            cVar.f58157D = dimension3;
            cVar.f58205y0.setStrokeWidth(dimension3);
            if (cVar.f58194X0) {
                cVar.K(dimension3);
            }
            cVar.invalidateSelf();
        }
        ColorStateList a15 = v7.c.a(context2, e11, 36);
        if (cVar.f58159E != a15) {
            cVar.f58159E = a15;
            cVar.f58188S0 = null;
            cVar.onStateChange(cVar.getState());
        }
        cVar.s0(e11.getText(5));
        v7.d dVar = (!e11.hasValue(0) || (resourceId = e11.getResourceId(0, 0)) == 0) ? null : new v7.d(context2, resourceId);
        dVar.j(e11.getDimension(1, dVar.i()));
        cVar.f58158D0.f(dVar, context2);
        int i11 = e11.getInt(3, 0);
        if (i11 == 1) {
            cVar.f58190U0 = TextUtils.TruncateAt.START;
        } else if (i11 == 2) {
            cVar.f58190U0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i11 == 3) {
            cVar.f58190U0 = TextUtils.TruncateAt.END;
        }
        cVar.l0(e11.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            cVar.l0(e11.getBoolean(15, false));
        }
        Drawable c11 = v7.c.c(context2, e11, 14);
        Drawable drawable3 = cVar.f58165H;
        if (drawable3 != 0) {
            boolean z11 = drawable3 instanceof f;
            drawable = drawable3;
            if (z11) {
                drawable = ((f) drawable3).b();
            }
        } else {
            drawable = null;
        }
        if (drawable != c11) {
            float Q11 = cVar.Q();
            cVar.f58165H = c11 != null ? c11.mutate() : null;
            float Q12 = cVar.Q();
            y0(drawable);
            if (cVar.w0()) {
                cVar.O(cVar.f58165H);
            }
            cVar.invalidateSelf();
            if (Q11 != Q12) {
                cVar.i0();
            }
        }
        if (e11.hasValue(17)) {
            ColorStateList a16 = v7.c.a(context2, e11, 17);
            cVar.f58171K = true;
            if (cVar.f58167I != a16) {
                cVar.f58167I = a16;
                if (cVar.w0()) {
                    androidx.core.graphics.drawable.a.j(cVar.f58165H, a16);
                }
                cVar.onStateChange(cVar.getState());
            }
        }
        float dimension4 = e11.getDimension(16, -1.0f);
        if (cVar.f58169J != dimension4) {
            float Q13 = cVar.Q();
            cVar.f58169J = dimension4;
            float Q14 = cVar.Q();
            cVar.invalidateSelf();
            if (Q13 != Q14) {
                cVar.i0();
            }
        }
        cVar.n0(e11.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            cVar.n0(e11.getBoolean(26, false));
        }
        Drawable c12 = v7.c.c(context2, e11, 25);
        Drawable X9 = cVar.X();
        if (X9 != c12) {
            float R11 = cVar.R();
            cVar.f58175M = c12 != null ? c12.mutate() : null;
            int i12 = C10444a.f103609f;
            cVar.f58177N = new RippleDrawable(C10444a.b(cVar.f58159E), cVar.f58175M, f58150Z0);
            float R12 = cVar.R();
            y0(X9);
            if (cVar.x0()) {
                cVar.O(cVar.f58175M);
            }
            cVar.invalidateSelf();
            if (R11 != R12) {
                cVar.i0();
            }
        }
        ColorStateList a17 = v7.c.a(context2, e11, 30);
        if (cVar.f58179O != a17) {
            cVar.f58179O = a17;
            if (cVar.x0()) {
                androidx.core.graphics.drawable.a.j(cVar.f58175M, a17);
            }
            cVar.onStateChange(cVar.getState());
        }
        float dimension5 = e11.getDimension(28, 0.0f);
        if (cVar.f58181P != dimension5) {
            cVar.f58181P = dimension5;
            cVar.invalidateSelf();
            if (cVar.x0()) {
                cVar.i0();
            }
        }
        boolean z12 = e11.getBoolean(6, false);
        if (cVar.f58183Q != z12) {
            cVar.f58183Q = z12;
            float Q15 = cVar.Q();
            if (!z12 && cVar.f58172K0) {
                cVar.f58172K0 = false;
            }
            float Q16 = cVar.Q();
            cVar.invalidateSelf();
            if (Q15 != Q16) {
                cVar.i0();
            }
        }
        cVar.k0(e11.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            cVar.k0(e11.getBoolean(8, false));
        }
        Drawable c13 = v7.c.c(context2, e11, 7);
        if (cVar.f58187S != c13) {
            float Q17 = cVar.Q();
            cVar.f58187S = c13;
            float Q18 = cVar.Q();
            y0(cVar.f58187S);
            cVar.O(cVar.f58187S);
            cVar.invalidateSelf();
            if (Q17 != Q18) {
                cVar.i0();
            }
        }
        if (e11.hasValue(9) && cVar.f58193X != (a11 = v7.c.a(context2, e11, 9))) {
            cVar.f58193X = a11;
            if (cVar.f58185R && (drawable2 = cVar.f58187S) != null && cVar.f58183Q) {
                androidx.core.graphics.drawable.a.j(drawable2, a11);
            }
            cVar.onStateChange(cVar.getState());
        }
        C7299h.a(context2, e11, 39);
        C7299h.a(context2, e11, 33);
        float dimension6 = e11.getDimension(21, 0.0f);
        if (cVar.f58195Y != dimension6) {
            cVar.f58195Y = dimension6;
            cVar.invalidateSelf();
            cVar.i0();
        }
        float dimension7 = e11.getDimension(35, 0.0f);
        if (cVar.f58196Z != dimension7) {
            float Q19 = cVar.Q();
            cVar.f58196Z = dimension7;
            float Q21 = cVar.Q();
            cVar.invalidateSelf();
            if (Q19 != Q21) {
                cVar.i0();
            }
        }
        float dimension8 = e11.getDimension(34, 0.0f);
        if (cVar.f58197r0 != dimension8) {
            float Q22 = cVar.Q();
            cVar.f58197r0 = dimension8;
            float Q23 = cVar.Q();
            cVar.invalidateSelf();
            if (Q22 != Q23) {
                cVar.i0();
            }
        }
        float dimension9 = e11.getDimension(41, 0.0f);
        if (cVar.f58198s0 != dimension9) {
            cVar.f58198s0 = dimension9;
            cVar.invalidateSelf();
            cVar.i0();
        }
        float dimension10 = e11.getDimension(40, 0.0f);
        if (cVar.f58199t0 != dimension10) {
            cVar.f58199t0 = dimension10;
            cVar.invalidateSelf();
            cVar.i0();
        }
        float dimension11 = e11.getDimension(29, 0.0f);
        if (cVar.f58200u0 != dimension11) {
            cVar.f58200u0 = dimension11;
            cVar.invalidateSelf();
            if (cVar.x0()) {
                cVar.i0();
            }
        }
        float dimension12 = e11.getDimension(27, 0.0f);
        if (cVar.f58201v0 != dimension12) {
            cVar.f58201v0 = dimension12;
            cVar.invalidateSelf();
            if (cVar.x0()) {
                cVar.i0();
            }
        }
        float dimension13 = e11.getDimension(13, 0.0f);
        if (cVar.f58202w0 != dimension13) {
            cVar.f58202w0 = dimension13;
            cVar.invalidateSelf();
            cVar.i0();
        }
        cVar.f58192W0 = e11.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e11.recycle();
        return cVar;
    }

    private static boolean g0(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean h0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean j0(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z11;
        boolean z12;
        int colorForState;
        boolean z13 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f58204y;
        int h11 = h(colorStateList != null ? colorStateList.getColorForState(iArr, this.f58160E0) : 0);
        if (this.f58160E0 != h11) {
            this.f58160E0 = h11;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f58206z;
        int h12 = h(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f58162F0) : 0);
        if (this.f58162F0 != h12) {
            this.f58162F0 = h12;
            onStateChange = true;
        }
        int d11 = androidx.core.graphics.c.d(h12, h11);
        if ((this.f58164G0 != d11) | (q() == null)) {
            this.f58164G0 = d11;
            B(ColorStateList.valueOf(d11));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f58155C;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f58166H0) : 0;
        if (this.f58166H0 != colorForState2) {
            this.f58166H0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f58188S0 == null || !C10444a.c(iArr)) ? 0 : this.f58188S0.getColorForState(iArr, this.f58168I0);
        if (this.f58168I0 != colorForState3) {
            this.f58168I0 = colorForState3;
        }
        C9616k c9616k = this.f58158D0;
        int colorForState4 = (c9616k.c() == null || c9616k.c().h() == null) ? 0 : c9616k.c().h().getColorForState(iArr, this.f58170J0);
        if (this.f58170J0 != colorForState4) {
            this.f58170J0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (state[i11] != 16842912) {
                    i11++;
                } else if (this.f58183Q) {
                    z11 = true;
                }
            }
        }
        z11 = false;
        if (this.f58172K0 != z11 && this.f58187S != null) {
            float Q11 = Q();
            this.f58172K0 = z11;
            if (Q11 != Q()) {
                onStateChange = true;
                z12 = true;
                ColorStateList colorStateList4 = this.f58182P0;
                colorForState = colorStateList4 == null ? colorStateList4.getColorForState(iArr, this.f58174L0) : 0;
                if (this.f58174L0 == colorForState) {
                    this.f58174L0 = colorForState;
                    ColorStateList colorStateList5 = this.f58182P0;
                    PorterDuff.Mode mode = this.f58184Q0;
                    this.f58180O0 = (colorStateList5 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList5.getColorForState(getState(), 0), mode);
                } else {
                    z13 = onStateChange;
                }
                if (h0(this.f58165H)) {
                    z13 |= this.f58165H.setState(iArr);
                }
                if (h0(this.f58187S)) {
                    z13 |= this.f58187S.setState(iArr);
                }
                if (h0(this.f58175M)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z13 |= this.f58175M.setState(iArr3);
                }
                int i12 = C10444a.f103609f;
                if (h0(this.f58177N)) {
                    z13 |= this.f58177N.setState(iArr2);
                }
                if (z13) {
                    invalidateSelf();
                }
                if (z12) {
                    i0();
                }
                return z13;
            }
            onStateChange = true;
        }
        z12 = false;
        ColorStateList colorStateList42 = this.f58182P0;
        if (colorStateList42 == null) {
        }
        if (this.f58174L0 == colorForState) {
        }
        if (h0(this.f58165H)) {
        }
        if (h0(this.f58187S)) {
        }
        if (h0(this.f58175M)) {
        }
        int i122 = C10444a.f103609f;
        if (h0(this.f58177N)) {
        }
        if (z13) {
        }
        if (z12) {
        }
        return z13;
    }

    private boolean v0() {
        return this.f58185R && this.f58187S != null && this.f58172K0;
    }

    private boolean w0() {
        return this.f58163G && this.f58165H != null;
    }

    private boolean x0() {
        return this.f58173L && this.f58175M != null;
    }

    private static void y0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    final float Q() {
        if (!w0() && !v0()) {
            return 0.0f;
        }
        float f7 = this.f58196Z;
        Drawable drawable = this.f58172K0 ? this.f58187S : this.f58165H;
        float f11 = this.f58169J;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f7 + f11 + this.f58197r0;
    }

    final float R() {
        if (x0()) {
            return this.f58200u0 + this.f58181P + this.f58201v0;
        }
        return 0.0f;
    }

    public final float T() {
        return this.f58194X0 ? s() : this.f58153B;
    }

    public final float U() {
        return this.f58202w0;
    }

    public final float V() {
        return this.f58151A;
    }

    public final float W() {
        return this.f58195Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable X() {
        Drawable drawable = this.f58175M;
        if (drawable != 0) {
            return drawable instanceof f ? ((f) drawable).b() : drawable;
        }
        return null;
    }

    public final TextUtils.TruncateAt Y() {
        return this.f58190U0;
    }

    public final ColorStateList Z() {
        return this.f58159E;
    }

    @Override // s7.C9616k.b
    public final void a() {
        i0();
        invalidateSelf();
    }

    public final CharSequence a0() {
        return this.f58161F;
    }

    public final v7.d b0() {
        return this.f58158D0.c();
    }

    public final float c0() {
        return this.f58199t0;
    }

    public final float d0() {
        return this.f58198s0;
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i11;
        Canvas canvas2;
        int i12;
        int i13;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i11 = this.f58176M0) == 0) {
            return;
        }
        if (i11 < 255) {
            canvas2 = canvas;
            i12 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            i12 = 0;
        }
        boolean z11 = this.f58194X0;
        Paint paint = this.f58205y0;
        RectF rectF = this.f58152A0;
        if (!z11) {
            paint.setColor(this.f58160E0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, T(), T(), paint);
        }
        if (!this.f58194X0) {
            paint.setColor(this.f58162F0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f58178N0;
            if (colorFilter == null) {
                colorFilter = this.f58180O0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, T(), T(), paint);
        }
        if (this.f58194X0) {
            super.draw(canvas);
        }
        if (this.f58157D > 0.0f && !this.f58194X0) {
            paint.setColor(this.f58166H0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f58194X0) {
                ColorFilter colorFilter2 = this.f58178N0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f58180O0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f7 = bounds.left;
            float f11 = this.f58157D / 2.0f;
            rectF.set(f7 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.f58153B - (this.f58157D / 2.0f);
            canvas2.drawRoundRect(rectF, f12, f12, paint);
        }
        paint.setColor(this.f58168I0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f58194X0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f58156C0;
            g(path, rectF2);
            j(canvas2, paint, path, o());
        } else {
            canvas2.drawRoundRect(rectF, T(), T(), paint);
        }
        if (w0()) {
            P(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f58165H.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f58165H.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (v0()) {
            P(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f58187S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f58187S.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f58191V0 && this.f58161F != null) {
            PointF pointF = this.f58154B0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f58161F;
            C9616k c9616k = this.f58158D0;
            if (charSequence != null) {
                float Q11 = this.f58195Y + Q() + this.f58198s0;
                if (androidx.core.graphics.drawable.a.d(this) == 0) {
                    pointF.x = bounds.left + Q11;
                } else {
                    pointF.x = bounds.right - Q11;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint d11 = c9616k.d();
                Paint.FontMetrics fontMetrics = this.f58207z0;
                d11.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f58161F != null) {
                float Q12 = this.f58195Y + Q() + this.f58198s0;
                float R11 = this.f58202w0 + R() + this.f58199t0;
                if (androidx.core.graphics.drawable.a.d(this) == 0) {
                    rectF.left = bounds.left + Q12;
                    rectF.right = bounds.right - R11;
                } else {
                    rectF.left = bounds.left + R11;
                    rectF.right = bounds.right - Q12;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (c9616k.c() != null) {
                c9616k.d().drawableState = getState();
                c9616k.h(this.f58203x0);
            }
            c9616k.d().setTextAlign(align);
            boolean z12 = Math.round(c9616k.e(this.f58161F.toString())) > Math.round(rectF.width());
            if (z12) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i13 = save;
            } else {
                i13 = 0;
            }
            CharSequence charSequence2 = this.f58161F;
            if (z12 && this.f58190U0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, c9616k.d(), rectF.width(), this.f58190U0);
            }
            canvas2.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, c9616k.d());
            if (z12) {
                canvas2.restoreToCount(i13);
            }
        }
        if (x0()) {
            rectF.setEmpty();
            if (x0()) {
                float f17 = this.f58202w0 + this.f58201v0;
                if (androidx.core.graphics.drawable.a.d(this) == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f58181P;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f58181P;
                }
                float exactCenterY = bounds.exactCenterY();
                float f21 = this.f58181P;
                float f22 = exactCenterY - (f21 / 2.0f);
                rectF.top = f22;
                rectF.bottom = f22 + f21;
            }
            float f23 = rectF.left;
            float f24 = rectF.top;
            canvas2.translate(f23, f24);
            this.f58175M.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int i14 = C10444a.f103609f;
            this.f58177N.setBounds(this.f58175M.getBounds());
            this.f58177N.jumpToCurrentState();
            this.f58177N.draw(canvas2);
            canvas2.translate(-f23, -f24);
        }
        if (this.f58176M0 < 255) {
            canvas2.restoreToCount(i12);
        }
    }

    public final boolean e0() {
        return this.f58183Q;
    }

    public final boolean f0() {
        return h0(this.f58175M);
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f58176M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f58178N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f58151A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.f58158D0.e(this.f58161F.toString()) + this.f58195Y + Q() + this.f58198s0 + this.f58199t0 + R() + this.f58202w0), this.f58192W0);
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.f58194X0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f58151A, this.f58153B);
        } else {
            outline.setRoundRect(bounds, this.f58153B);
            outline2 = outline;
        }
        outline2.setAlpha(this.f58176M0 / 255.0f);
    }

    protected final void i0() {
        a aVar = this.f58189T0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (g0(this.f58204y) || g0(this.f58206z) || g0(this.f58155C)) {
            return true;
        }
        v7.d c11 = this.f58158D0.c();
        if (c11 == null || c11.h() == null || !c11.h().isStateful()) {
            return (this.f58185R && this.f58187S != null && this.f58183Q) || h0(this.f58165H) || h0(this.f58187S) || g0(this.f58182P0);
        }
        return true;
    }

    public final void k0(boolean z11) {
        if (this.f58185R != z11) {
            boolean v02 = v0();
            this.f58185R = z11;
            boolean v03 = v0();
            if (v02 != v03) {
                if (v03) {
                    O(this.f58187S);
                } else {
                    y0(this.f58187S);
                }
                invalidateSelf();
                i0();
            }
        }
    }

    public final void l0(boolean z11) {
        if (this.f58163G != z11) {
            boolean w02 = w0();
            this.f58163G = z11;
            boolean w03 = w0();
            if (w02 != w03) {
                if (w03) {
                    O(this.f58165H);
                } else {
                    y0(this.f58165H);
                }
                invalidateSelf();
                i0();
            }
        }
    }

    public final boolean m0(@NonNull int[] iArr) {
        if (Arrays.equals(this.f58186R0, iArr)) {
            return false;
        }
        this.f58186R0 = iArr;
        if (x0()) {
            return j0(getState(), iArr);
        }
        return false;
    }

    public final void n0(boolean z11) {
        if (this.f58173L != z11) {
            boolean x02 = x0();
            this.f58173L = z11;
            boolean x03 = x0();
            if (x02 != x03) {
                if (x03) {
                    O(this.f58175M);
                } else {
                    y0(this.f58175M);
                }
                invalidateSelf();
                i0();
            }
        }
    }

    public final void o0(Chip chip) {
        this.f58189T0 = new WeakReference<>(chip);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i11) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (w0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.h(this.f58165H, i11);
        }
        if (v0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.h(this.f58187S, i11);
        }
        if (x0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.h(this.f58175M, i11);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i11) {
        boolean onLevelChange = super.onLevelChange(i11);
        if (w0()) {
            onLevelChange |= this.f58165H.setLevel(i11);
        }
        if (v0()) {
            onLevelChange |= this.f58187S.setLevel(i11);
        }
        if (x0()) {
            onLevelChange |= this.f58175M.setLevel(i11);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable, s7.C9616k.b
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.f58194X0) {
            super.onStateChange(iArr);
        }
        return j0(iArr, this.f58186R0);
    }

    public final void p0(TextUtils.TruncateAt truncateAt) {
        this.f58190U0 = truncateAt;
    }

    public final void q0(int i11) {
        this.f58192W0 = i11;
    }

    final void r0() {
        this.f58191V0 = false;
    }

    public final void s0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f58161F, charSequence)) {
            return;
        }
        this.f58161F = charSequence;
        this.f58158D0.g();
        invalidateSelf();
        i0();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f58176M0 != i11) {
            this.f58176M0 = i11;
            invalidateSelf();
        }
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f58178N0 != colorFilter) {
            this.f58178N0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f58182P0 != colorStateList) {
            this.f58182P0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // y7.C10856g, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f58184Q0 != mode) {
            this.f58184Q0 = mode;
            ColorStateList colorStateList = this.f58182P0;
            this.f58180O0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (w0()) {
            visible |= this.f58165H.setVisible(z11, z12);
        }
        if (v0()) {
            visible |= this.f58187S.setVisible(z11, z12);
        }
        if (x0()) {
            visible |= this.f58175M.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(int i11) {
        Context context = this.f58203x0;
        this.f58158D0.f(new v7.d(context, i11), context);
    }

    final boolean u0() {
        return this.f58191V0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
