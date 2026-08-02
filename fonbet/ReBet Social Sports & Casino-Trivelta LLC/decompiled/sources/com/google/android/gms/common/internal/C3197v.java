package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import n0.AbstractC5597a;

/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197v extends Button {
    public C3197v(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    public static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = C9.b.f1516b;
        int i14 = C9.b.f1517c;
        int b10 = b(i11, i13, i14, i14);
        int i15 = C9.b.f1518d;
        int i16 = C9.b.f1519e;
        int b11 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            b10 = b11;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable r10 = AbstractC5597a.r(resources.getDrawable(b10));
        AbstractC5597a.o(r10, resources.getColorStateList(C9.a.f1514c));
        AbstractC5597a.p(r10, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r10);
        int i17 = C9.a.f1512a;
        int i18 = C9.a.f1513b;
        setTextColor((ColorStateList) AbstractC3191o.m(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(C9.c.f1535p));
        } else if (i10 == 1) {
            setText(resources.getString(C9.c.f1536q));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown button size: " + i10);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (K9.i.c(getContext())) {
            setGravity(19);
        }
    }
}
