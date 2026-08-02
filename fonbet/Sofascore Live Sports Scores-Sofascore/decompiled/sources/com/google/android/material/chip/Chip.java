package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.focus.FocusRingDrawable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a9j;
import defpackage.ach;
import defpackage.bsk;
import defpackage.cwc;
import defpackage.e9j;
import defpackage.eb0;
import defpackage.eq3;
import defpackage.fjg;
import defpackage.hn;
import defpackage.izb;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.rfo;
import defpackage.rt2;
import defpackage.st2;
import defpackage.td4;
import defpackage.uv1;
import defpackage.w3a;
import defpackage.x2a;
import defpackage.xah;
import defpackage.z7j;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Chip extends eb0 implements ach, Checkable {
    public static final Rect w = new Rect();
    public static final int[] x = {R.attr.state_selected};
    public static final int[] y = {R.attr.state_checkable};
    public st2 e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final rt2 r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final pt2 v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.sofascore.results.R.attr.chipStyle);
        int resourceId;
        this.t = new Rect();
        this.u = new RectF();
        int i = 0;
        this.v = new pt2(this, i);
        Context context2 = getContext();
        int i2 = 1;
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                a70.m("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                a70.m("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                a70.m("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                a70.m("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                a70.m("Chip does not support multi-line text");
                throw null;
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        st2 st2Var = new st2(context2, attributeSet);
        Context context3 = st2Var.o0;
        int[] iArr = pjf.g;
        TypedArray Y = m6k.Y(context3, attributeSet, iArr, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        st2Var.O0 = Y.hasValue(39);
        Context context4 = st2Var.o0;
        ColorStateList x2 = w3a.x(context4, Y, 25);
        if (st2Var.H != x2) {
            st2Var.H = x2;
            st2Var.onStateChange(st2Var.getState());
        }
        ColorStateList x3 = w3a.x(context4, Y, 12);
        if (st2Var.I != x3) {
            st2Var.I = x3;
            st2Var.onStateChange(st2Var.getState());
        }
        float dimension = Y.getDimension(20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (st2Var.J != dimension) {
            st2Var.J = dimension;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        if (Y.hasValue(13)) {
            st2Var.S(Y.getDimension(13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        st2Var.X(w3a.x(context4, Y, 23));
        st2Var.Y(Y.getDimension(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        st2Var.i0(w3a.x(context4, Y, 38));
        String text = Y.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(st2Var.O, text);
        e9j e9jVar = st2Var.u0;
        if (!equals) {
            st2Var.O = text;
            e9jVar.e = true;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        z7j z7jVar = (!Y.hasValue(0) || (resourceId = Y.getResourceId(0, 0)) == 0) ? null : new z7j(context4, resourceId);
        z7jVar.l = Y.getDimension(1, z7jVar.l);
        int i3 = Y.hasValue(34) ? 34 : 7;
        if (Y.hasValue(i3)) {
            z7jVar.c = Y.getString(i3);
        }
        e9jVar.c(z7jVar, context4);
        int i4 = Y.getInt(3, 0);
        if (i4 == 1) {
            st2Var.L0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            st2Var.L0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            st2Var.L0 = TextUtils.TruncateAt.END;
        }
        st2Var.W(Y.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            st2Var.W(Y.getBoolean(16, false));
        }
        st2Var.T(w3a.z(context4, Y, 15));
        if (Y.hasValue(18)) {
            st2Var.V(w3a.x(context4, Y, 18));
        }
        st2Var.U(Y.getDimension(17, -1.0f));
        st2Var.f0(Y.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            st2Var.f0(Y.getBoolean(27, false));
        }
        st2Var.Z(w3a.z(context4, Y, 26));
        st2Var.e0(w3a.x(context4, Y, 31));
        st2Var.b0(Y.getDimension(29, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        st2Var.O(Y.getBoolean(6, false));
        st2Var.R(Y.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            st2Var.R(Y.getBoolean(9, false));
        }
        st2Var.P(w3a.z(context4, Y, 8));
        if (Y.hasValue(10)) {
            st2Var.Q(w3a.x(context4, Y, 10));
        }
        st2Var.e0 = cwc.a(context4, Y, 41);
        st2Var.f0 = cwc.a(context4, Y, 35);
        float dimension2 = Y.getDimension(22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (st2Var.g0 != dimension2) {
            st2Var.g0 = dimension2;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        st2Var.h0(Y.getDimension(37, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        st2Var.g0(Y.getDimension(36, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension3 = Y.getDimension(43, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (st2Var.j0 != dimension3) {
            st2Var.j0 = dimension3;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        float dimension4 = Y.getDimension(42, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (st2Var.k0 != dimension4) {
            st2Var.k0 = dimension4;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        st2Var.c0(Y.getDimension(30, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        st2Var.a0(Y.getDimension(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension5 = Y.getDimension(14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (st2Var.n0 != dimension5) {
            st2Var.n0 = dimension5;
            st2Var.invalidateSelf();
            st2Var.M();
        }
        st2Var.N0 = Y.getDimensionPixelSize(4, Integer.MAX_VALUE);
        Y.recycle();
        m6k.v(context2, attributeSet, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action);
        m6k.w(context2, attributeSet, iArr, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action);
        this.n = obtainStyledAttributes.getBoolean(33, false);
        this.p = (int) Math.ceil(obtainStyledAttributes.getDimension(21, x2a.N(context2)));
        obtainStyledAttributes.recycle();
        setChipDrawable(st2Var);
        st2Var.s(getElevation());
        m6k.v(context2, attributeSet, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action);
        m6k.w(context2, attributeSet, iArr, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.sofascore.results.R.attr.chipStyle, com.sofascore.results.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.r = new rt2(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new qt2(i, this));
        }
        setChecked(this.j);
        setText(st2Var.O);
        setEllipsize(st2Var.L0);
        h();
        if (!this.e.M0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.n) {
            setMinHeight(this.p);
        }
        this.o = getLayoutDirection();
        super.setOnCheckedChangeListener(new hn(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.u;
        rectF.setEmpty();
        if (d() && this.h != null) {
            st2 st2Var = this.e;
            Rect bounds = st2Var.getBounds();
            rectF.setEmpty();
            if (st2Var.l0()) {
                float f = st2Var.n0 + st2Var.m0 + st2Var.Y + st2Var.l0 + st2Var.k0;
                if (st2Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    @Nullable
    private z7j getTextAppearance() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.u0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.p = i;
        if (!this.n) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.e.J));
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    public final boolean d() {
        st2 st2Var = this.e;
        if (st2Var == null) {
            return false;
        }
        Drawable drawable = st2Var.V;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.s ? super.dispatchHoverEvent(motionEvent) : this.r.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        rt2 rt2Var = this.r;
        rt2Var.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && rt2Var.p(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = rt2Var.l;
                    if (i3 != Integer.MIN_VALUE) {
                        rt2Var.r(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = rt2Var.p(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = rt2Var.p(1, null);
            }
        }
        if (!z || rt2Var.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.eb0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        st2 st2Var = this.e;
        boolean z = false;
        int i = 0;
        z = false;
        if (st2Var != null && st2.L(st2Var.V)) {
            st2 st2Var2 = this.e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = st2Var2.d0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        st2 st2Var;
        if (!d() || (st2Var = this.e) == null || !st2Var.U || this.h == null) {
            bsk.q(this, null);
            this.s = false;
        } else {
            bsk.q(this, this.r);
            this.s = true;
        }
    }

    public final void f() {
        RippleDrawable rippleDrawable = new RippleDrawable(rfo.J(this.e.N), getBackgroundDrawable(), null);
        FocusRingDrawable.f(getContext(), rippleDrawable, this.e);
        this.g = rippleDrawable;
        this.e.getClass();
        setBackground(this.g);
        g();
    }

    public final void g() {
        st2 st2Var;
        if (TextUtils.isEmpty(getText()) || (st2Var = this.e) == null) {
            return;
        }
        int I = (int) (st2Var.I() + st2Var.n0 + st2Var.k0);
        st2 st2Var2 = this.e;
        int H = (int) (st2Var2.H() + st2Var2.g0 + st2Var2.j0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            H += rect.left;
            I += rect.right;
        }
        setPaddingRelative(H, getPaddingTop(), I, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        st2 st2Var = this.e;
        if (st2Var == null || !st2Var.a0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.c0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.d0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        st2 st2Var = this.e;
        return st2Var != null ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, st2Var.J()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.n0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        st2 st2Var = this.e;
        if (st2Var == null || (drawable = st2Var.Q) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.S : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.R;
        }
        return null;
    }

    public float getChipMinHeight() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.J : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getChipStartPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.g0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.M : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        st2 st2Var = this.e;
        if (st2Var == null || (drawable = st2Var.V) == null) {
            return null;
        }
        return drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.Z;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.m0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconSize() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.Y : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconStartPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.l0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.X;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.L0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.s) {
            rt2 rt2Var = this.r;
            if (rt2Var.l == 1 || rt2Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    @Nullable
    public String getFontVariationSettings() {
        st2 st2Var = this.e;
        if (st2Var == null) {
            return super.getFontVariationSettings();
        }
        z7j z7jVar = st2Var.u0.g;
        if (z7jVar != null) {
            return z7jVar.c;
        }
        return null;
    }

    @Nullable
    public cwc getHideMotionSpec() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.f0;
        }
        return null;
    }

    public float getIconEndPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.i0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getIconStartPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.h0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.N;
        }
        return null;
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        return this.e.k();
    }

    @Nullable
    public cwc getShowMotionSpec() {
        st2 st2Var = this.e;
        if (st2Var != null) {
            return st2Var.e0;
        }
        return null;
    }

    public float getTextEndPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.k0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getTextStartPadding() {
        st2 st2Var = this.e;
        return st2Var != null ? st2Var.j0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void h() {
        TextPaint paint = getPaint();
        st2 st2Var = this.e;
        if (st2Var != null) {
            paint.drawableState = st2Var.getState();
        }
        z7j textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l4a.I(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, x);
        }
        st2 st2Var = this.e;
        if (st2Var != null && st2Var.a0) {
            View.mergeDrawableStates(onCreateDrawableState, y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.s) {
            rt2 rt2Var = this.r;
            int i2 = rt2Var.l;
            if (i2 != Integer.MIN_VALUE) {
                rt2Var.j(i2);
            }
            if (z) {
                rt2Var.p(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        st2 st2Var = this.e;
        accessibilityNodeInfo.setCheckable(st2Var != null && st2Var.a0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.s) {
                    this.r.w(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        }
    }

    @Override // defpackage.eb0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.O(z);
        }
    }

    public void setCheckableResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.O(st2Var.o0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        st2 st2Var = this.e;
        if (st2Var == null) {
            this.j = z;
        } else if (st2Var.a0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.P(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.P(td4.d0(i, st2Var.o0));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Q(eq3.q(i, st2Var.o0));
        }
    }

    public void setCheckedIconVisible(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.R(st2Var.o0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.I == colorStateList) {
            return;
        }
        st2Var.I = colorStateList;
        st2Var.onStateChange(st2Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList q;
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.I == (q = eq3.q(i, st2Var.o0))) {
            return;
        }
        st2Var.I = q;
        st2Var.onStateChange(st2Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.S(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.S(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull st2 st2Var) {
        st2 st2Var2 = this.e;
        if (st2Var2 != st2Var) {
            if (st2Var2 != null) {
                st2Var2.K0 = new WeakReference(null);
            }
            this.e = st2Var;
            st2Var.M0 = false;
            st2Var.K0 = new WeakReference(this);
            c(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.n0 == f) {
            return;
        }
        st2Var.n0 = f;
        st2Var.invalidateSelf();
        st2Var.M();
    }

    public void setChipEndPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            float dimension = st2Var.o0.getResources().getDimension(i);
            if (st2Var.n0 != dimension) {
                st2Var.n0 = dimension;
                st2Var.invalidateSelf();
                st2Var.M();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.T(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.T(td4.d0(i, st2Var.o0));
        }
    }

    public void setChipIconSize(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.U(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.U(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.V(eq3.q(i, st2Var.o0));
        }
    }

    public void setChipIconVisible(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.W(st2Var.o0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.J == f) {
            return;
        }
        st2Var.J = f;
        st2Var.invalidateSelf();
        st2Var.M();
    }

    public void setChipMinHeightResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            float dimension = st2Var.o0.getResources().getDimension(i);
            if (st2Var.J != dimension) {
                st2Var.J = dimension;
                st2Var.invalidateSelf();
                st2Var.M();
            }
        }
    }

    public void setChipStartPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.g0 == f) {
            return;
        }
        st2Var.g0 = f;
        st2Var.invalidateSelf();
        st2Var.M();
    }

    public void setChipStartPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            float dimension = st2Var.o0.getResources().getDimension(i);
            if (st2Var.g0 != dimension) {
                st2Var.g0 = dimension;
                st2Var.invalidateSelf();
                st2Var.M();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.X(eq3.q(i, st2Var.o0));
        }
    }

    public void setChipStrokeWidth(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Y(st2Var.o0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Z(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.Z == charSequence) {
            return;
        }
        String str = uv1.b;
        uv1 uv1Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? uv1.e : uv1.d;
        uv1Var.getClass();
        fjg fjgVar = a9j.a;
        st2Var.Z = uv1Var.c(charSequence);
        st2Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.a0(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.Z(td4.d0(i, st2Var.o0));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.b0(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.c0(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.e0(eq3.q(i, st2Var.o0));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.eb0, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a70.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            a70.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.eb0, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a70.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            a70.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            a70.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            a70.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            a70.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            a70.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.s(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            a70.m("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.L0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        c(this.p);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        st2 st2Var = this.e;
        if (st2Var == null) {
            return false;
        }
        z7j z7jVar = st2Var.u0.g;
        if (z7jVar != null) {
            z7jVar.c = str;
        }
        h();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(@Nullable cwc cwcVar) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.f0 = cwcVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.f0 = cwc.b(i, st2Var.o0);
        }
    }

    public void setIconEndPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.g0(st2Var.o0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.h0(st2Var.o0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            a70.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            a70.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.N0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            a70.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.i0(colorStateList);
        }
        this.e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.i0(eq3.q(i, st2Var.o0));
            this.e.getClass();
            f();
        }
    }

    @Override // defpackage.ach
    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        this.e.setShapeAppearanceModel(xahVar);
    }

    public void setShowMotionSpec(@Nullable cwc cwcVar) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.e0 = cwcVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.e0 = cwc.b(i, st2Var.o0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            a70.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        st2 st2Var = this.e;
        if (st2Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(st2Var.M0 ? null : charSequence, bufferType);
        st2 st2Var2 = this.e;
        if (st2Var2 == null || TextUtils.equals(st2Var2.O, charSequence)) {
            return;
        }
        st2Var2.O = charSequence;
        st2Var2.u0.e = true;
        st2Var2.invalidateSelf();
        st2Var2.M();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        st2 st2Var = this.e;
        if (st2Var != null) {
            Context context2 = st2Var.o0;
            st2Var.u0.c(new z7j(context2, i), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.k0 == f) {
            return;
        }
        st2Var.k0 = f;
        st2Var.invalidateSelf();
        st2Var.M();
    }

    public void setTextEndPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            float dimension = st2Var.o0.getResources().getDimension(i);
            if (st2Var.k0 != dimension) {
                st2Var.k0 = dimension;
                st2Var.invalidateSelf();
                st2Var.M();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        st2 st2Var = this.e;
        if (st2Var != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            e9j e9jVar = st2Var.u0;
            z7j z7jVar = e9jVar.g;
            if (z7jVar != null) {
                z7jVar.l = applyDimension;
                e9jVar.a.setTextSize(applyDimension);
                st2Var.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        st2 st2Var = this.e;
        if (st2Var == null || st2Var.j0 == f) {
            return;
        }
        st2Var.j0 = f;
        st2Var.invalidateSelf();
        st2Var.M();
    }

    public void setTextStartPaddingResource(int i) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            float dimension = st2Var.o0.getResources().getDimension(i);
            if (st2Var.j0 != dimension) {
                st2Var.j0 = dimension;
                st2Var.invalidateSelf();
                st2Var.M();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.f0(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.R(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.W(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a70.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            a70.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            a70.m("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            a70.m("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(@Nullable z7j z7jVar) {
        st2 st2Var = this.e;
        if (st2Var != null) {
            st2Var.u0.c(z7jVar, st2Var.o0);
        }
        h();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // defpackage.eb0, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void setInternalOnCheckedChangeListener(@Nullable izb izbVar) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        st2 st2Var = this.e;
        if (st2Var != null) {
            Context context = st2Var.o0;
            st2Var.u0.c(new z7j(context, i), context);
        }
        h();
    }
}
