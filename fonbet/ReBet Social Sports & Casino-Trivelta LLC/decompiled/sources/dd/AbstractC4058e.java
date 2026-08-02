package dd;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4058e {
    public static final int a(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        throw new IllegalArgumentException("[RNScreens] Unable to resolve Material theme dimension.");
    }
}
