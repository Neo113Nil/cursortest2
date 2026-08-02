package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import i7.C7017a;
import y7.C10856g;

/* renamed from: com.google.android.material.datepicker.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5844b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Rect f58227a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f58228b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f58229c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f58230d;

    /* renamed from: e, reason: collision with root package name */
    private final int f58231e;

    /* renamed from: f, reason: collision with root package name */
    private final y7.k f58232f;

    private C5844b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i11, y7.k kVar, @NonNull Rect rect) {
        x2.i.d(rect.left);
        x2.i.d(rect.top);
        x2.i.d(rect.right);
        x2.i.d(rect.bottom);
        this.f58227a = rect;
        this.f58228b = colorStateList2;
        this.f58229c = colorStateList;
        this.f58230d = colorStateList3;
        this.f58231e = i11;
        this.f58232f = kVar;
    }

    @NonNull
    static C5844b a(int i11, @NonNull Context context) {
        x2.i.a("Cannot create a CalendarItemStyle with a styleResId of 0", i11 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, C7017a.f65957w);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a11 = v7.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a12 = v7.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a13 = v7.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        y7.k a14 = y7.k.a(obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), context).a();
        obtainStyledAttributes.recycle();
        return new C5844b(a11, a12, a13, dimensionPixelSize, a14, rect);
    }

    final int b() {
        return this.f58227a.bottom;
    }

    final int c() {
        return this.f58227a.top;
    }

    final void d(@NonNull TextView textView) {
        C10856g c10856g = new C10856g();
        C10856g c10856g2 = new C10856g();
        y7.k kVar = this.f58232f;
        c10856g.setShapeAppearanceModel(kVar);
        c10856g2.setShapeAppearanceModel(kVar);
        c10856g.B(this.f58229c);
        c10856g.K(this.f58231e);
        c10856g.J(this.f58230d);
        ColorStateList colorStateList = this.f58228b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), c10856g, c10856g2);
        Rect rect = this.f58227a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int i11 = Y.f42258g;
        textView.setBackground(insetDrawable);
    }
}
