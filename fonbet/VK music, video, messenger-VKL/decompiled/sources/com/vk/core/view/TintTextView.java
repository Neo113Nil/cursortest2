package com.vk.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.vk.design.ui.themehelper.R$styleable;
import xsna.anj;
import xsna.dhr0;
import xsna.ozl;
import xsna.sjo;

/* compiled from: TintTextView.kt */
@ozl
/* loaded from: classes17.dex */
public class TintTextView extends TextViewColorStateListAndAlphaSupportPreV23 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final PorterDuff.Mode i;

    public TintTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final Drawable[] getDrawablesRelative() {
        Drawable drawable;
        Drawable drawable2;
        Drawable[] compoundDrawables = super.getCompoundDrawables();
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        if (compoundDrawablesRelative[0] == null && (drawable2 = compoundDrawables[0]) != null) {
            compoundDrawablesRelative[0] = drawable2;
        }
        if (compoundDrawablesRelative[2] == null && (drawable = compoundDrawables[2]) != null) {
            compoundDrawablesRelative[2] = drawable;
        }
        return compoundDrawablesRelative;
    }

    private final void setDynamicAttributes(AttributeSet attributeSet) {
        int A = dhr0.A("backgroundTint", attributeSet);
        dhr0.a.getClass();
        if (dhr0.J(A)) {
            this.c = A;
        }
        int A2 = dhr0.A("drawableTint", attributeSet);
        if (dhr0.J(A2)) {
            this.e = A2;
            this.d = A2;
            this.f = A2;
            this.h = A2;
        }
        int A3 = dhr0.A("drawableTopTint", attributeSet);
        if (dhr0.J(A3)) {
            this.e = A3;
        }
        int A4 = dhr0.A("drawableStartTint", attributeSet);
        int A5 = dhr0.A("drawableLeftTint", attributeSet);
        if (A4 == 0 && A5 != 0) {
            A4 = A5;
        }
        if (dhr0.J(A4)) {
            this.d = A4;
        }
        int A6 = dhr0.A("drawableBottomTint", attributeSet);
        if (dhr0.J(A6)) {
            this.h = A6;
        }
        int A7 = dhr0.A("drawableEndTint", attributeSet);
        int A8 = dhr0.A("drawableRightTint", attributeSet);
        if (A7 == 0 && A8 != 0) {
            A7 = A8;
        }
        if (dhr0.J(A7)) {
            this.f = A7;
        }
        this.g = dhr0.A("drawableEndTintStateList", attributeSet);
    }

    @Override // com.vk.core.view.TextViewColorStateListAndAlphaSupportPreV23, xsna.too0
    public final void Ng() {
        ColorStateList valueOf;
        b();
        int i = this.c;
        if (i != 0) {
            setBackgroundTint(dhr0.t.c(i));
        }
        int i2 = this.e;
        if (i2 != 0) {
            setDrawableTopTint(dhr0.t.c(i2));
        }
        int i3 = this.d;
        if (i3 != 0) {
            setDrawableStartTint(dhr0.t.c(i3));
        }
        int i4 = this.g;
        if (i4 != 0) {
            dhr0.a.getClass();
            valueOf = anj.b(i4, dhr0.E());
        } else {
            int i5 = this.f;
            valueOf = i5 != 0 ? ColorStateList.valueOf(dhr0.t.c(i5)) : null;
        }
        if (valueOf != null) {
            setDrawableEndTint(valueOf);
        }
        int i6 = this.h;
        if (i6 != 0) {
            setDrawableBottomTint(dhr0.t.c(i6));
        }
    }

    public final Drawable e(Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        sjo.b(drawable, i, this.i);
        return drawable;
    }

    public final void f() {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        Drawable drawable2 = null;
        if (drawable != null) {
            sjo.b(drawable, 0, PorterDuff.Mode.DST);
        } else {
            drawable = null;
        }
        Drawable drawable3 = compoundDrawablesRelative[1];
        if (drawable3 != null) {
            sjo.b(drawable3, 0, PorterDuff.Mode.DST);
        } else {
            drawable3 = null;
        }
        Drawable drawable4 = compoundDrawablesRelative[2];
        if (drawable4 != null) {
            sjo.b(drawable4, 0, PorterDuff.Mode.DST);
        } else {
            drawable4 = null;
        }
        Drawable drawable5 = compoundDrawablesRelative[3];
        if (drawable5 != null) {
            sjo.b(drawable5, 0, PorterDuff.Mode.DST);
            drawable2 = drawable5;
        }
        setCompoundDrawablesRelative(drawable, drawable3, drawable4, drawable2);
    }

    @Override // android.widget.TextView
    public Drawable[] getCompoundDrawables() {
        return new Drawable[4];
    }

    @Override // android.widget.TextView
    public Drawable[] getCompoundDrawablesRelative() {
        return getCompoundDrawables();
    }

    public final void setBackgroundTint(int i) {
        setBackgroundDrawable(e(getBackground(), i));
    }

    public final void setDrawableBottomTint(int i) {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], e(compoundDrawablesRelative[3], i));
    }

    public final void setDrawableEndTint(ColorStateList colorStateList) {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        Drawable drawable2 = compoundDrawablesRelative[1];
        Drawable drawable3 = compoundDrawablesRelative[2];
        if (drawable3 != null) {
            drawable3.mutate();
            drawable3.setColorFilter(null);
            drawable3.setTintMode(this.i);
            drawable3.setTintList(colorStateList);
        } else {
            drawable3 = null;
        }
        setCompoundDrawablesRelative(drawable, drawable2, drawable3, compoundDrawablesRelative[3]);
    }

    public final void setDrawableLeftTint(int i) {
        setDrawableStartTint(i);
    }

    public final void setDrawableRightTint(int i) {
        setDrawableEndTint(ColorStateList.valueOf(i));
    }

    public final void setDrawableStartTint(int i) {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(e(compoundDrawablesRelative[0], i), compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final void setDrawableTint(int i) {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(e(compoundDrawablesRelative[0], i), e(compoundDrawablesRelative[1], i), e(compoundDrawablesRelative[2], i), e(compoundDrawablesRelative[3], i));
    }

    public final void setDrawableTopTint(int i) {
        Drawable[] compoundDrawablesRelative = super.getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], e(compoundDrawablesRelative[1], i), compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final void setDynamicBackgroundTint(int i) {
        this.c = i;
        setBackgroundTint(dhr0.t.c(i));
    }

    public final void setDynamicDrawableBottomTint(int i) {
        this.h = i;
        setDrawableBottomTint(dhr0.t.c(i));
    }

    public final void setDynamicDrawableEndTint(int i) {
        this.f = i;
        setDrawableRightTint(dhr0.t.c(i));
    }

    public final void setDynamicDrawableLeftTint(int i) {
        setDynamicDrawableStartTint(i);
    }

    public final void setDynamicDrawableRightTint(int i) {
        setDynamicDrawableEndTint(i);
    }

    public final void setDynamicDrawableStartTint(int i) {
        this.d = i;
        setDrawableLeftTint(dhr0.t.c(i));
    }

    public final void setDynamicDrawableTint(int i) {
        this.e = i;
        this.d = i;
        this.f = i;
        this.h = i;
        setDrawableTint(dhr0.t.c(i));
    }

    public final void setDynamicDrawableTopTint(int i) {
        this.e = i;
        setDrawableTopTint(dhr0.t.c(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TintTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.p);
        if (attributeSet != null) {
            try {
                setDynamicAttributes(attributeSet);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(7, 0);
        int color3 = obtainStyledAttributes.getColor(6, obtainStyledAttributes.getColor(4, color2));
        int color4 = obtainStyledAttributes.getColor(8, color2);
        int color5 = obtainStyledAttributes.getColor(2, obtainStyledAttributes.getColor(5, color2));
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(3);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(color5) : colorStateList;
        int color6 = obtainStyledAttributes.getColor(1, color2);
        this.i = PorterDuff.Mode.SRC_ATOP;
        obtainStyledAttributes.recycle();
        Drawable[] drawablesRelative = getDrawablesRelative();
        setCompoundDrawables(null, null, null, null);
        setCompoundDrawablesRelative(drawablesRelative[0], drawablesRelative[1], drawablesRelative[2], drawablesRelative[3]);
        if (color != 0) {
            setDrawableTint(color);
        }
        if (color3 != 0) {
            setDrawableLeftTint(color3);
        }
        if (color4 != 0) {
            setDrawableTopTint(color4);
        }
        setDrawableEndTint(colorStateList);
        if (color6 != 0) {
            setDrawableBottomTint(color6);
        }
    }
}
