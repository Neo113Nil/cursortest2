package v7;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b {
    public static TypedValue a(int i11, @NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int b(@NonNull Context context, int i11, @NonNull String str) {
        TypedValue a11 = a(i11, context);
        if (a11 != null) {
            return a11.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }
}
