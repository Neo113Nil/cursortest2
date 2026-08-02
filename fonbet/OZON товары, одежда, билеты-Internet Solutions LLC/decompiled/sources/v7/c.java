package v7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b0;
import j.C7232a;

/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateList = androidx.core.content.a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateList;
    }

    public static ColorStateList b(@NonNull Context context, @NonNull b0 b0Var, int i11) {
        int n11;
        ColorStateList colorStateList;
        return (!b0Var.s(i11) || (n11 = b0Var.n(i11, 0)) == 0 || (colorStateList = androidx.core.content.a.getColorStateList(context, n11)) == null) ? b0Var.c(i11) : colorStateList;
    }

    public static Drawable c(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        Drawable a11;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (a11 = C7232a.a(context, resourceId)) == null) ? typedArray.getDrawable(i11) : a11;
    }

    public static boolean d(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
