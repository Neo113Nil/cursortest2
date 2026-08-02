package com.vk.auth.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.vk.auth.common.R$styleable;
import java.util.Locale;
import xsna.hnj;
import xsna.sjo;

/* compiled from: VkAuthTintTextView.kt */
/* loaded from: classes15.dex */
public final class VkAuthTintTextView extends VkAuthTextView {
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final PorterDuff.Mode h;

    public VkAuthTintTextView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        PorterDuff.Mode mode;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.e);
        try {
            this.c = obtainStyledAttributes.getColor(0, 0);
            int color = obtainStyledAttributes.getColor(6, 0);
            this.d = obtainStyledAttributes.getColor(5, obtainStyledAttributes.getColor(3, color));
            this.e = obtainStyledAttributes.getColor(8, color);
            this.f = obtainStyledAttributes.getColor(2, obtainStyledAttributes.getColor(4, color));
            this.g = obtainStyledAttributes.getColor(1, color);
            try {
                mode = PorterDuff.Mode.valueOf(obtainStyledAttributes.getString(7).toUpperCase(Locale.ROOT));
            } catch (Exception unused) {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
            this.h = mode;
            obtainStyledAttributes.recycle();
            Drawable[] drawablesRelative = getDrawablesRelative();
            setCompoundDrawables(null, null, null, null);
            setCompoundDrawablesRelative(drawablesRelative[0], drawablesRelative[1], drawablesRelative[2], drawablesRelative[3]);
            int i = this.c;
            if (i != 0) {
                setDrawableTint(i);
            }
            int i2 = this.d;
            if (i2 != 0) {
                setDrawableLeftTint(i2);
            }
            int i3 = this.e;
            if (i3 != 0) {
                setDrawableTopTint(i3);
            }
            int i4 = this.f;
            if (i4 != 0) {
                setDrawableRightTint(i4);
            }
            int i5 = this.g;
            if (i5 != 0) {
                setDrawableBottomTint(i5);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final Drawable[] getDrawablesRelative() {
        Drawable drawable;
        Drawable drawable2;
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        if (compoundDrawablesRelative[0] == null && (drawable2 = compoundDrawables[0]) != null) {
            compoundDrawablesRelative[0] = drawable2;
        }
        if (compoundDrawablesRelative[2] == null && (drawable = compoundDrawables[2]) != null) {
            compoundDrawablesRelative[2] = drawable;
        }
        return compoundDrawablesRelative;
    }

    private final void setDrawableBottomTint(int i) {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], b(compoundDrawablesRelative[3], i));
    }

    private final void setDrawableEndTint(int i) {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], b(compoundDrawablesRelative[2], i), compoundDrawablesRelative[3]);
    }

    private final void setDrawableLeftTint(int i) {
        setDrawableStartTint(i);
    }

    private final void setDrawableRightTint(int i) {
        setDrawableEndTint(i);
    }

    private final void setDrawableStartTint(int i) {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(b(compoundDrawablesRelative[0], i), compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void setDrawableTint(int i) {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(b(compoundDrawablesRelative[0], i), b(compoundDrawablesRelative[1], i), b(compoundDrawablesRelative[2], i), b(compoundDrawablesRelative[3], i));
    }

    private final void setDrawableTopTint(int i) {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], b(compoundDrawablesRelative[1], i), compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final Drawable b(Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        sjo.b(drawable, i, this.h);
        return drawable;
    }
}
