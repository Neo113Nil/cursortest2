package dd;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4055b {
    public static final int a(Context context, int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue.data;
        }
        Log.w("ColorUtils", "[RNScreens] Failed to resolve color attribute. Falling back to " + i11 + ".");
        return i11;
    }

    public static /* synthetic */ int b(Context context, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return a(context, i10, i11);
    }
}
