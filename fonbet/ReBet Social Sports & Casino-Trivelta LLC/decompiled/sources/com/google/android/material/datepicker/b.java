package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f35294a;

    /* renamed from: b, reason: collision with root package name */
    public final a f35295b;

    /* renamed from: c, reason: collision with root package name */
    public final a f35296c;

    /* renamed from: d, reason: collision with root package name */
    public final a f35297d;

    /* renamed from: e, reason: collision with root package name */
    public final a f35298e;

    /* renamed from: f, reason: collision with root package name */
    public final a f35299f;

    /* renamed from: g, reason: collision with root package name */
    public final a f35300g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f35301h;

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Ca.b.f(context, ia.c.f48205J, j.class.getCanonicalName()), ia.m.MaterialCalendar);
        this.f35294a = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48662H3, 0));
        this.f35300g = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48642F3, 0));
        this.f35295b = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48652G3, 0));
        this.f35296c = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48672I3, 0));
        ColorStateList a10 = Ca.c.a(context, obtainStyledAttributes, ia.m.f48682J3);
        this.f35297d = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48702L3, 0));
        this.f35298e = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48692K3, 0));
        this.f35299f = a.a(context, obtainStyledAttributes.getResourceId(ia.m.f48712M3, 0));
        Paint paint = new Paint();
        this.f35301h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
