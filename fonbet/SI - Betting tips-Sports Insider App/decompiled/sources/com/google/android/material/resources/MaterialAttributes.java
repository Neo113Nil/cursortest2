package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialAttributes {
    public static TypedValue resolve(@NonNull Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Context context, int i5, boolean z5) {
        TypedValue resolve = resolve(context, i5);
        return (resolve == null || resolve.type != 18) ? z5 : resolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, int i5, @NonNull String str) {
        return resolveOrThrow(context, i5, str) != 0;
    }

    public static int resolveDimension(@NonNull Context context, int i5, int i10) {
        TypedValue resolve = resolve(context, i5);
        return (int) ((resolve == null || resolve.type != 5) ? context.getResources().getDimension(i10) : resolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(@NonNull Context context, int i5, int i10) {
        TypedValue resolve = resolve(context, i5);
        return (resolve == null || resolve.type != 16) ? i10 : resolve.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, int i5, @NonNull String str) {
        return resolveTypedValueOrThrow(context, i5, str).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull View view, int i5) {
        return resolveTypedValueOrThrow(view.getContext(), i5, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(@NonNull View view, int i5) {
        return resolveTypedValueOrThrow(view, i5).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull Context context, int i5, @NonNull String str) {
        TypedValue resolve = resolve(context, i5);
        if (resolve != null) {
            return resolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i5)));
    }
}
