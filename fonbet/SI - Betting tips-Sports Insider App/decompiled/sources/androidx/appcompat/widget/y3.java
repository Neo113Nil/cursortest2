package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1011a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1012b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1013c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1014d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1015e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1016f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1017g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i.a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                io.sentry.android.core.w0.d("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i5) {
        ColorStateList d10 = d(context, i5);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f1012b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f1011a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return g0.c.e(c(context, i5), Math.round(Color.alpha(r4) * f6));
    }

    public static int c(Context context, int i5) {
        int[] iArr = f1017g;
        iArr[0] = i5;
        c4 e7 = c4.e(context, null, iArr);
        try {
            return e7.f722b.getColor(0, 0);
        } finally {
            e7.g();
        }
    }

    public static ColorStateList d(Context context, int i5) {
        int[] iArr = f1017g;
        iArr[0] = i5;
        c4 e7 = c4.e(context, null, iArr);
        try {
            return e7.a(0);
        } finally {
            e7.g();
        }
    }
}
