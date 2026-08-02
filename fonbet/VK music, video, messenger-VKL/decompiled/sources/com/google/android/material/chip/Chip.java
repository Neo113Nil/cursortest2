package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.chip.a;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.impl.L2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import xsna.am;
import xsna.anj;
import xsna.b0u0;
import xsna.bdl;
import xsna.beo0;
import xsna.cm10;
import xsna.dac;
import xsna.de;
import xsna.eac;
import xsna.fpo0;
import xsna.iut0;
import xsna.l6j0;
import xsna.m33;
import xsna.mb30;
import xsna.olg0;
import xsna.qm10;
import xsna.szx0;
import xsna.t1u0;
import xsna.ubo0;
import xsna.uy6;
import xsna.vdo0;
import xsna.y9q;
import xsna.zm10;

/* loaded from: classes13.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0119a, l6j0, cm10<Chip> {

    @Nullable
    public com.google.android.material.chip.a f;

    @Nullable
    public InsetDrawable g;

    @Nullable
    public RippleDrawable h;

    @Nullable
    public View.OnClickListener i;

    @Nullable
    public CompoundButton.OnCheckedChangeListener j;

    @Nullable
    public cm10.a<Chip> k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;

    @Nullable
    public CharSequence s;

    @NonNull
    public final b t;
    public boolean u;
    public final Rect v;
    public final RectF w;
    public final a x;
    public static final int y = R$style.Widget_MaterialComponents_Chip_Action;
    public static final Rect z = new Rect();
    public static final int[] A = {R.attr.state_selected};
    public static final int[] B = {R.attr.state_checkable};

    public class b extends y9q {
        public b(Chip chip) {
            super(chip);
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            int i = Chip.y;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(@NonNull List<Integer> list) {
            com.google.android.material.chip.a aVar;
            list.add(0);
            int i = Chip.y;
            Chip chip = Chip.this;
            if (!chip.e() || (aVar = chip.f) == null || !aVar.o || chip.i == null) {
                return;
            }
            list.add(1);
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.i;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.u) {
                        chip.t.sendEventForVirtualView(1, 1);
                    }
                }
            }
            return z;
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForHost(@NonNull am amVar) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f;
            amVar.l(aVar != null && aVar.u);
            amVar.o(chip.isClickable());
            amVar.n(chip.getAccessibilityClassName());
            amVar.A(chip.getText());
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, @NonNull am amVar) {
            if (i != 1) {
                amVar.r("");
                amVar.j(Chip.z);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                amVar.r(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                amVar.r(chip.getContext().getString(R$string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            amVar.j(chip.getCloseIconTouchBoundsInt());
            amVar.b(am.a.e);
            amVar.a.setEnabled(chip.isEnabled());
        }

        @Override // xsna.y9q
        public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.o = z;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int resourceId;
        int i = R$attr.chipStyle;
        int i2 = y;
        this.v = new Rect();
        this.w = new RectF();
        this.x = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", L2.g);
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet, i);
        int i3 = 0;
        TypedArray d = fpo0.d(aVar.I, attributeSet, R$styleable.Chip, i, i2, new int[0]);
        aVar.i0 = d.hasValue(R$styleable.Chip_shapeAppearance);
        int i4 = R$styleable.Chip_chipSurfaceColor;
        Context context3 = aVar.I;
        ColorStateList a2 = qm10.a(context3, d, i4);
        if (aVar.b != a2) {
            aVar.b = a2;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList a3 = qm10.a(context3, d, R$styleable.Chip_chipBackgroundColor);
        if (aVar.c != a3) {
            aVar.c = a3;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = d.getDimension(R$styleable.Chip_chipMinHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (aVar.d != dimension) {
            aVar.d = dimension;
            aVar.invalidateSelf();
            aVar.i();
        }
        if (d.hasValue(R$styleable.Chip_chipCornerRadius)) {
            aVar.o(d.getDimension(R$styleable.Chip_chipCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        aVar.t(qm10.a(context3, d, R$styleable.Chip_chipStrokeColor));
        aVar.u(d.getDimension(R$styleable.Chip_chipStrokeWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        aVar.D(qm10.a(context3, d, R$styleable.Chip_rippleColor));
        String text = d.getText(R$styleable.Chip_android_text);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.i, text);
        beo0 beo0Var = aVar.O;
        if (!equals) {
            aVar.i = text;
            beo0Var.e = true;
            aVar.invalidateSelf();
            aVar.i();
        }
        int i5 = R$styleable.Chip_android_textAppearance;
        ubo0 ubo0Var = (!d.hasValue(i5) || (resourceId = d.getResourceId(i5, 0)) == 0) ? null : new ubo0(context3, resourceId);
        ubo0Var.k = d.getDimension(R$styleable.Chip_android_textSize, ubo0Var.k);
        beo0Var.c(ubo0Var, context3);
        int i6 = d.getInt(R$styleable.Chip_android_ellipsize, 0);
        if (i6 == 1) {
            aVar.f0 = TextUtils.TruncateAt.START;
        } else if (i6 == 2) {
            aVar.f0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i6 == 3) {
            aVar.f0 = TextUtils.TruncateAt.END;
        }
        aVar.s(d.getBoolean(R$styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.s(d.getBoolean(R$styleable.Chip_chipIconEnabled, false));
        }
        aVar.p(qm10.d(context3, d, R$styleable.Chip_chipIcon));
        if (d.hasValue(R$styleable.Chip_chipIconTint)) {
            aVar.r(qm10.a(context3, d, R$styleable.Chip_chipIconTint));
        }
        aVar.q(d.getDimension(R$styleable.Chip_chipIconSize, -1.0f));
        aVar.A(d.getBoolean(R$styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.A(d.getBoolean(R$styleable.Chip_closeIconEnabled, false));
        }
        aVar.v(qm10.d(context3, d, R$styleable.Chip_closeIcon));
        aVar.z(qm10.a(context3, d, R$styleable.Chip_closeIconTint));
        aVar.x(d.getDimension(R$styleable.Chip_closeIconSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        aVar.k(d.getBoolean(R$styleable.Chip_android_checkable, false));
        aVar.n(d.getBoolean(R$styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.n(d.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
        }
        aVar.l(qm10.d(context3, d, R$styleable.Chip_checkedIcon));
        if (d.hasValue(R$styleable.Chip_checkedIconTint)) {
            aVar.m(qm10.a(context3, d, R$styleable.Chip_checkedIconTint));
        }
        aVar.y = mb30.a(context3, d, R$styleable.Chip_showMotionSpec);
        aVar.z = mb30.a(context3, d, R$styleable.Chip_hideMotionSpec);
        float dimension2 = d.getDimension(R$styleable.Chip_chipStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (aVar.A != dimension2) {
            aVar.A = dimension2;
            aVar.invalidateSelf();
            aVar.i();
        }
        aVar.C(d.getDimension(R$styleable.Chip_iconStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        aVar.B(d.getDimension(R$styleable.Chip_iconEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension3 = d.getDimension(R$styleable.Chip_textStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (aVar.D != dimension3) {
            aVar.D = dimension3;
            aVar.invalidateSelf();
            aVar.i();
        }
        float dimension4 = d.getDimension(R$styleable.Chip_textEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (aVar.E != dimension4) {
            aVar.E = dimension4;
            aVar.invalidateSelf();
            aVar.i();
        }
        aVar.y(d.getDimension(R$styleable.Chip_closeIconStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        aVar.w(d.getDimension(R$styleable.Chip_closeIconEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension5 = d.getDimension(R$styleable.Chip_chipEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (aVar.H != dimension5) {
            aVar.H = dimension5;
            aVar.invalidateSelf();
            aVar.i();
        }
        aVar.h0 = d.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        d.recycle();
        int[] iArr = R$styleable.Chip;
        fpo0.a(context2, attributeSet, i, i2);
        fpo0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.p = obtainStyledAttributes.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
        this.r = (int) Math.ceil(obtainStyledAttributes.getDimension(R$styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(t1u0.b(48, getContext()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aVar.setElevation(getElevation());
        int[] iArr2 = R$styleable.Chip;
        fpo0.a(context2, attributeSet, i, i2);
        fpo0.b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean hasValue = obtainStyledAttributes2.hasValue(R$styleable.Chip_shapeAppearance);
        obtainStyledAttributes2.recycle();
        this.t = new b(this);
        f();
        if (!hasValue) {
            setOutlineProvider(new eac(this));
        }
        setChecked(this.l);
        setText(aVar.i);
        setEllipsize(aVar.f0);
        i();
        if (!this.f.g0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.p) {
            setMinHeight(this.r);
        }
        this.q = getLayoutDirection();
        super.setOnCheckedChangeListener(new dac(this, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.w;
        rectF.setEmpty();
        if (e() && this.i != null) {
            com.google.android.material.chip.a aVar = this.f;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.G()) {
                float f = aVar.H + aVar.G + aVar.s + aVar.F + aVar.E;
                if (aVar.getLayoutDirection() == 0) {
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
        Rect rect = this.v;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    @Nullable
    private ubo0 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.O.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0119a
    public final void a() {
        d(this.r);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.r = i;
        if (!this.p) {
            InsetDrawable insetDrawable = this.g;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f.d));
        int max2 = Math.max(0, i - this.f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.g;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.g != null) {
            Rect rect = new Rect();
            this.g.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.g = new InsetDrawable((Drawable) this.f, i2, i3, i2, i3);
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return !this.u ? super.dispatchHoverEvent(motionEvent) : this.t.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.t;
        if (!bVar.dispatchKeyEvent(keyEvent) || bVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f;
        boolean z2 = false;
        if (aVar != null && com.google.android.material.chip.a.h(aVar.p)) {
            com.google.android.material.chip.a aVar2 = this.f;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.o) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.n) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.m) {
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
            } else {
                i = 0;
            }
            if (this.o) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.n) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.m) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.c0, iArr)) {
                aVar2.c0 = iArr;
                if (aVar2.G()) {
                    z2 = aVar2.j(aVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null) {
            return false;
        }
        Object obj = aVar.p;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof szx0) {
            obj = ((szx0) obj).b();
        }
        return obj != null;
    }

    public final void f() {
        com.google.android.material.chip.a aVar;
        if (!e() || (aVar = this.f) == null || !aVar.o || this.i == null) {
            iut0.q(this, null);
            this.u = false;
        } else {
            iut0.q(this, this.t);
            this.u = true;
        }
    }

    public final void g() {
        this.h = new RippleDrawable(olg0.c(this.f.h), getBackgroundDrawable(), null);
        this.f.getClass();
        RippleDrawable rippleDrawable = this.h;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.s)) {
            return this.s;
        }
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || !aVar.u) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).i.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.g;
        return insetDrawable == null ? this.f : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.w;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.x;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.f()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public Drawable getChipDrawable() {
        return this.f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.H : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || (drawable = aVar.k) == 0) {
            return null;
        }
        return drawable instanceof szx0 ? ((szx0) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.m : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.l;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.d : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.A : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.f;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.g : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || (drawable = aVar.p) == 0) {
            return null;
        }
        return drawable instanceof szx0 ? ((szx0) drawable).b() : drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.t;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.G : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.s : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.F : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.r;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.f0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.u) {
            b bVar = this.t;
            if (bVar.getKeyboardFocusedVirtualViewId() == 1 || bVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public mb30 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.z;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.C : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.B : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.h;
        }
        return null;
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.f.getShapeAppearanceModel();
    }

    @Nullable
    public mb30 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            return aVar.y;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.E : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f;
        return aVar != null ? aVar.D : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f) == null) {
            return;
        }
        int e = (int) (aVar.e() + aVar.H + aVar.E);
        com.google.android.material.chip.a aVar2 = this.f;
        int d = (int) (aVar2.d() + aVar2.A + aVar2.D);
        if (this.g != null) {
            Rect rect = new Rect();
            this.g.getPadding(rect);
            d += rect.left;
            e += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setPaddingRelative(d, paddingTop, e, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        ubo0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.e(this, this.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null && aVar.u) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.u) {
            this.t.onFocusChanged(z2, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.u);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.d) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(R$id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) am.h.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.m) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.m) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.i;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.u) {
                    this.t.sendEventForVirtualView(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.h) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z2) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.k(z2);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.k(aVar.I.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null) {
            this.l = z2;
        } else if (aVar.u) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.l(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.l(m33.a(i, aVar.I));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.m(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.m(anj.b(i, aVar.I));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.n(aVar.I.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.c == colorStateList) {
            return;
        }
        aVar.c = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList b2;
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.c == (b2 = anj.b(i, aVar.I))) {
            return;
        }
        aVar.c = b2;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.o(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.o(aVar.I.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.e0 = new WeakReference<>(null);
            }
            this.f = aVar;
            aVar.g0 = false;
            aVar.e0 = new WeakReference<>(this);
            d(this.r);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.H == f) {
            return;
        }
        aVar.H = f;
        aVar.invalidateSelf();
        aVar.i();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float dimension = aVar.I.getResources().getDimension(i);
            if (aVar.H != dimension) {
                aVar.H = dimension;
                aVar.invalidateSelf();
                aVar.i();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.p(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.p(m33.a(i, aVar.I));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.q(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.q(aVar.I.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.r(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.r(anj.b(i, aVar.I));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.s(aVar.I.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.d == f) {
            return;
        }
        aVar.d = f;
        aVar.invalidateSelf();
        aVar.i();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float dimension = aVar.I.getResources().getDimension(i);
            if (aVar.d != dimension) {
                aVar.d = dimension;
                aVar.invalidateSelf();
                aVar.i();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.A == f) {
            return;
        }
        aVar.A = f;
        aVar.invalidateSelf();
        aVar.i();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float dimension = aVar.I.getResources().getDimension(i);
            if (aVar.A != dimension) {
                aVar.A = dimension;
                aVar.invalidateSelf();
                aVar.i();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.t(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.t(anj.b(i, aVar.I));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.u(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.u(aVar.I.getResources().getDimension(i));
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
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.v(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.t == charSequence) {
            return;
        }
        uy6 c = uy6.c();
        c.getClass();
        vdo0.e eVar = vdo0.a;
        aVar.t = c.d(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.w(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.w(aVar.I.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.v(m33.a(i, aVar.I));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.x(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.x(aVar.I.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.y(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.y(aVar.I.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.z(anj.b(i, aVar.I));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.setElevation(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.f0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.p = z2;
        d(this.r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(@Nullable mb30 mb30Var) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.z = mb30Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.z = mb30.b(i, aVar.I);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.B(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.B(aVar.I.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.C(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.C(aVar.I.getResources().getDimension(i));
        }
    }

    @Override // xsna.cm10
    public void setInternalOnCheckedChangeListener(@Nullable cm10.a<Chip> aVar) {
        this.k = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.h0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        f();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.D(colorStateList);
        }
        this.f.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.D(anj.b(i, aVar.I));
            this.f.getClass();
            g();
        }
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        this.f.setShapeAppearanceModel(aVar);
    }

    public void setShowMotionSpec(@Nullable mb30 mb30Var) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.y = mb30Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.y = mb30.b(i, aVar.I);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.g0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f;
        if (aVar2 == null || TextUtils.equals(aVar2.i, charSequence)) {
            return;
        }
        aVar2.i = charSequence;
        aVar2.O.e = true;
        aVar2.invalidateSelf();
        aVar2.i();
    }

    public void setTextAppearance(@Nullable ubo0 ubo0Var) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.O.c(ubo0Var, aVar.I);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.E == f) {
            return;
        }
        aVar.E = f;
        aVar.invalidateSelf();
        aVar.i();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float dimension = aVar.I.getResources().getDimension(i);
            if (aVar.E != dimension) {
                aVar.E = dimension;
                aVar.invalidateSelf();
                aVar.i();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            beo0 beo0Var = aVar.O;
            ubo0 ubo0Var = beo0Var.g;
            if (ubo0Var != null) {
                ubo0Var.k = applyDimension;
                beo0Var.a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar == null || aVar.D == f) {
            return;
        }
        aVar.D = f;
        aVar.invalidateSelf();
        aVar.i();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            float dimension = aVar.I.getResources().getDimension(i);
            if (aVar.D != dimension) {
                aVar.D = dimension;
                aVar.invalidateSelf();
                aVar.i();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.A(z2);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.n(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            aVar.s(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            Context context2 = aVar.I;
            aVar.O.c(new ubo0(context2, i), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.f;
        if (aVar != null) {
            Context context = aVar.I;
            aVar.O.c(new ubo0(context, i), context);
        }
        i();
    }

    public class a extends de {
        public a() {
        }

        @Override // xsna.de
        public final void n0(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f;
            chip.setText(aVar.g0 ? aVar.i : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // xsna.de
        public final void m0(int i) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }
}
