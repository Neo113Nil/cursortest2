package n7;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import v7.b;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8448a {
    public static int a(int i11, int i12, @NonNull Context context) {
        TypedValue a11 = b.a(i11, context);
        return a11 != null ? a11.data : i12;
    }

    public static int b(int i11, @NonNull View view) {
        return b.b(view.getContext(), i11, view.getClass().getCanonicalName());
    }

    public static boolean c(int i11) {
        return i11 != 0 && c.c(i11) > 0.5d;
    }

    public static int d(float f7, int i11, int i12) {
        return c.d(c.f(i12, Math.round(Color.alpha(i12) * f7)), i11);
    }
}
