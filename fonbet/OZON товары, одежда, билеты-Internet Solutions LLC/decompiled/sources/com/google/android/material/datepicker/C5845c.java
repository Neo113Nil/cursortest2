package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import i7.C7017a;
import ru.ozon.app.android.R;

/* renamed from: com.google.android.material.datepicker.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5845c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final C5844b f58233a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final C5844b f58234b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final C5844b f58235c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    final C5844b f58236d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    final C5844b f58237e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    final C5844b f58238f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    final C5844b f58239g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    final Paint f58240h;

    C5845c(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v7.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), C7017a.f65956v);
        this.f58233a = C5844b.a(obtainStyledAttributes.getResourceId(3, 0), context);
        this.f58239g = C5844b.a(obtainStyledAttributes.getResourceId(1, 0), context);
        this.f58234b = C5844b.a(obtainStyledAttributes.getResourceId(2, 0), context);
        this.f58235c = C5844b.a(obtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList a11 = v7.c.a(context, obtainStyledAttributes, 6);
        this.f58236d = C5844b.a(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f58237e = C5844b.a(obtainStyledAttributes.getResourceId(7, 0), context);
        this.f58238f = C5844b.a(obtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.f58240h = paint;
        paint.setColor(a11.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
