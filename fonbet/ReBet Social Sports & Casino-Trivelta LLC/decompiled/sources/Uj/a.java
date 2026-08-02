package Uj;

import Dj.g;
import Dj.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import n.AbstractC5596a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12311a = new a();

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(b(context));
    }

    public final Drawable b(Context context) {
        int k10 = Xj.c.k(context, g.f2830b);
        int k11 = Xj.c.k(context, g.f2831c);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(k10);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(k11), shapeDrawable, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ColorStateList.valueOf(0));
        gradientDrawable.setStroke(MathKt.roundToInt(Xj.c.a(context, 1.0f)), AbstractC5596a.a(context, h.f2832a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_activated}, rippleDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable);
        ColorStateList valueOf = ColorStateList.valueOf(k10);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(valueOf, stateListDrawable, shapeDrawable2);
    }
}
