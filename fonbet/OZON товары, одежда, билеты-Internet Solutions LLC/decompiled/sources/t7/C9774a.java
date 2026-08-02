package t7;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.core.graphics.f;
import c3.C5740b;
import ru.ozon.app.android.R;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9774a {
    private static float a(String[] strArr, int i11) {
        float parseFloat = Float.parseFloat(strArr[i11]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    @NonNull
    public static TimeInterpolator c(@NonNull Context context, @NonNull C5740b c5740b) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            return c5740b;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (b(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return androidx.core.view.animation.a.a(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!b(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            f.a.e(f.c(substring), path);
            return androidx.core.view.animation.a.b(path);
        } catch (RuntimeException e11) {
            throw new RuntimeException("Error in parsing ".concat(substring), e11);
        }
    }
}
