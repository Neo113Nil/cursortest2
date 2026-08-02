package Uj;

import Dj.h;
import Dj.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import n.AbstractC5596a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12312a = new b();

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(b(context));
    }

    public final Drawable b(Context context) {
        int roundToInt = MathKt.roundToInt(Xj.c.a(context, 1.0f));
        ColorStateList a10 = AbstractC5596a.a(context, h.f2832a);
        ColorStateList a11 = AbstractC5596a.a(context, h.f2834c);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(i.f2835a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        gradientDrawable.setStroke(roundToInt, a10);
        gradientDrawable.setColor(a11);
        return gradientDrawable;
    }
}
