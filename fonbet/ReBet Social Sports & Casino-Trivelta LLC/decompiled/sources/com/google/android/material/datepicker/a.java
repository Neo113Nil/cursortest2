package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f35288a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f35289b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f35290c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f35291d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35292e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.shape.n f35293f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, com.google.android.material.shape.n nVar, Rect rect) {
        x0.f.d(rect.left);
        x0.f.d(rect.top);
        x0.f.d(rect.right);
        x0.f.d(rect.bottom);
        this.f35288a = rect;
        this.f35289b = colorStateList2;
        this.f35290c = colorStateList;
        this.f35291d = colorStateList3;
        this.f35292e = i10;
        this.f35293f = nVar;
    }

    public static a a(Context context, int i10) {
        x0.f.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, ia.m.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ia.m.f48722N3, 0), obtainStyledAttributes.getDimensionPixelOffset(ia.m.f48742P3, 0), obtainStyledAttributes.getDimensionPixelOffset(ia.m.f48732O3, 0), obtainStyledAttributes.getDimensionPixelOffset(ia.m.f48752Q3, 0));
        ColorStateList a10 = Ca.c.a(context, obtainStyledAttributes, ia.m.f48762R3);
        ColorStateList a11 = Ca.c.a(context, obtainStyledAttributes, ia.m.f48808W3);
        ColorStateList a12 = Ca.c.a(context, obtainStyledAttributes, ia.m.f48790U3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ia.m.f48799V3, 0);
        com.google.android.material.shape.n m10 = com.google.android.material.shape.n.b(context, obtainStyledAttributes.getResourceId(ia.m.f48772S3, 0), obtainStyledAttributes.getResourceId(ia.m.f48781T3, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    public int b() {
        return this.f35288a.bottom;
    }

    public int c() {
        return this.f35288a.top;
    }

    public void d(TextView textView) {
        e(textView, null, null);
    }

    public void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i();
        com.google.android.material.shape.i iVar2 = new com.google.android.material.shape.i();
        iVar.setShapeAppearanceModel(this.f35293f);
        iVar2.setShapeAppearanceModel(this.f35293f);
        if (colorStateList == null) {
            colorStateList = this.f35290c;
        }
        iVar.f0(colorStateList);
        iVar.n0(this.f35292e, this.f35291d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f35289b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f35289b.withAlpha(30), iVar, iVar2);
        Rect rect = this.f35288a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
