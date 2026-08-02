package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.anj;
import xsna.b0u0;
import xsna.bdl;
import xsna.fpo0;
import xsna.iut0;
import xsna.l6j0;
import xsna.m33;
import xsna.olg0;
import xsna.qm10;
import xsna.sl10;
import xsna.t1u0;
import xsna.zm10;

/* loaded from: classes13.dex */
public class MaterialButton extends AppCompatButton implements Checkable, l6j0 {
    public static final int[] s = {R.attr.state_checkable};
    public static final int[] t = {R.attr.state_checked};
    public static final int u = R$style.Widget_MaterialComponents_Button;

    @NonNull
    public final sl10 e;

    @NonNull
    public final LinkedHashSet<a> f;

    @Nullable
    public b g;

    @Nullable
    public PorterDuff.Mode h;

    @Nullable
    public ColorStateList i;

    @Nullable
    public Drawable j;

    @Nullable
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.d = parcel.readInt() == 1;
        }
    }

    public interface a {
        void a();
    }

    public interface b {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = R$attr.materialButtonStyle;
        int i2 = u;
        this.f = new LinkedHashSet<>();
        this.p = false;
        this.q = false;
        Context context2 = getContext();
        TypedArray d = fpo0.d(context2, attributeSet, R$styleable.MaterialButton, i, i2, new int[0]);
        this.o = d.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        int i3 = d.getInt(R$styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h = t1u0.e(i3, mode);
        this.i = qm10.a(getContext(), d, R$styleable.MaterialButton_iconTint);
        this.j = qm10.d(getContext(), d, R$styleable.MaterialButton_icon);
        this.r = d.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.l = d.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        sl10 sl10Var = new sl10(this, com.google.android.material.shape.a.c(context2, attributeSet, i, i2).a());
        this.e = sl10Var;
        sl10Var.c = d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        sl10Var.d = d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        sl10Var.e = d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        sl10Var.f = d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        if (d.hasValue(R$styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = d.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, -1);
            sl10Var.g = dimensionPixelSize;
            sl10Var.c(sl10Var.b.f(dimensionPixelSize));
            sl10Var.p = true;
        }
        sl10Var.h = d.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        sl10Var.i = t1u0.e(d.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), mode);
        sl10Var.j = qm10.a(getContext(), d, R$styleable.MaterialButton_backgroundTint);
        sl10Var.k = qm10.a(getContext(), d, R$styleable.MaterialButton_strokeColor);
        sl10Var.l = qm10.a(getContext(), d, R$styleable.MaterialButton_rippleColor);
        sl10Var.q = d.getBoolean(R$styleable.MaterialButton_android_checkable, false);
        sl10Var.t = d.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
        sl10Var.r = d.getBoolean(R$styleable.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(R$styleable.MaterialButton_android_background)) {
            sl10Var.o = true;
            setSupportBackgroundTintList(sl10Var.j);
            setSupportBackgroundTintMode(sl10Var.i);
        } else {
            sl10Var.e();
        }
        setPaddingRelative(paddingStart + sl10Var.c, paddingTop + sl10Var.e, paddingEnd + sl10Var.d, paddingBottom + sl10Var.f);
        d.recycle();
        setCompoundDrawablePadding(this.o);
        c(this.j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public final boolean a() {
        sl10 sl10Var = this.e;
        return (sl10Var == null || sl10Var.o) ? false : true;
    }

    public final void b() {
        int i = this.r;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.j, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.j, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.j, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                this.j.setTintMode(mode);
            }
            int i = this.l;
            if (i == 0) {
                i = this.j.getIntrinsicWidth();
            }
            int i2 = this.l;
            if (i2 == 0) {
                i2 = this.j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.j;
            int i3 = this.m;
            int i4 = this.n;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.j.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.r;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.j) || (((i5 == 3 || i5 == 4) && drawable5 != this.j) || ((i5 == 16 || i5 == 32) && drawable4 != this.j))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.j == null || getLayout() == null) {
            return;
        }
        int i3 = this.r;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.m = 0;
                if (i3 == 16) {
                    this.n = 0;
                    c(false);
                    return;
                }
                int i4 = this.l;
                if (i4 == 0) {
                    i4 = this.j.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.o) - getPaddingBottom()) / 2);
                if (this.n != max) {
                    this.n = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.r;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.m = 0;
            c(false);
            return;
        }
        int i6 = this.l;
        if (i6 == 0) {
            i6 = this.j.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.o) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.m != paddingEnd) {
            this.m = paddingEnd;
            c(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        sl10 sl10Var = this.e;
        return ((sl10Var == null || !sl10Var.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.e.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.j;
    }

    public int getIconGravity() {
        return this.r;
    }

    public int getIconPadding() {
        return this.o;
    }

    public int getIconSize() {
        return this.l;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    public int getInsetBottom() {
        return this.e.f;
    }

    public int getInsetTop() {
        return this.e.e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (a()) {
            return this.e.l;
        }
        return null;
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        if (a()) {
            return this.e.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.e.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.e.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.e.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.e.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            bdl.e(this, this.e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        sl10 sl10Var = this.e;
        if (sl10Var != null && sl10Var.q) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (this.p) {
            View.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.p);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        sl10 sl10Var = this.e;
        accessibilityNodeInfo.setCheckable(sl10Var != null && sl10Var.q);
        accessibilityNodeInfo.setChecked(this.p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        setChecked(savedState.d);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.p;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.e.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.j != null) {
            if (this.j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.k = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        sl10 sl10Var = this.e;
        if (sl10Var.b(false) != null) {
            sl10Var.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        sl10 sl10Var = this.e;
        sl10Var.o = true;
        MaterialButton materialButton = sl10Var.a;
        materialButton.setSupportBackgroundTintList(sl10Var.j);
        materialButton.setSupportBackgroundTintMode(sl10Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? m33.a(i, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.e.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        sl10 sl10Var = this.e;
        if (sl10Var == null || !sl10Var.q || !isEnabled() || this.p == z) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.p;
            if (!materialButtonToggleGroup.g) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.q) {
            return;
        }
        this.q = true;
        Iterator<a> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.q = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            sl10 sl10Var = this.e;
            if (sl10Var.p && sl10Var.g == i) {
                return;
            }
            sl10Var.g = i;
            sl10Var.p = true;
            sl10Var.c(sl10Var.b.f(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.e.b(false).setElevation(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.j != drawable) {
            this.j = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.r != i) {
            this.r = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.o != i) {
            this.o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? m33.a(i, getContext()) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.l != i) {
            this.l = i;
            c(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(anj.b(i, getContext()));
    }

    public void setInsetBottom(int i) {
        sl10 sl10Var = this.e;
        sl10Var.d(sl10Var.e, i);
    }

    public void setInsetTop(int i) {
        sl10 sl10Var = this.e;
        sl10Var.d(i, sl10Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable b bVar) {
        this.g = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            sl10 sl10Var = this.e;
            MaterialButton materialButton = sl10Var.a;
            if (sl10Var.l != colorStateList) {
                sl10Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(olg0.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(anj.b(i, getContext()));
        }
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.e.c(aVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            sl10 sl10Var = this.e;
            sl10Var.n = z;
            sl10Var.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            sl10 sl10Var = this.e;
            if (sl10Var.k != colorStateList) {
                sl10Var.k = colorStateList;
                sl10Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(anj.b(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            sl10 sl10Var = this.e;
            if (sl10Var.h != i) {
                sl10Var.h = i;
                sl10Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        sl10 sl10Var = this.e;
        if (sl10Var.j != colorStateList) {
            sl10Var.j = colorStateList;
            if (sl10Var.b(false) != null) {
                sl10Var.b(false).setTintList(sl10Var.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        sl10 sl10Var = this.e;
        if (sl10Var.i != mode) {
            sl10Var.i = mode;
            if (sl10Var.b(false) == null || sl10Var.i == null) {
                return;
            }
            sl10Var.b(false).setTintMode(sl10Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.e.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }
}
