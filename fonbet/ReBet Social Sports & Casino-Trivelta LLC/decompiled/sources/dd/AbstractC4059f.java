package dd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC5596a;

/* renamed from: dd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4059f {
    public static final Drawable a(Context context, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true) && (i11 = typedValue.resourceId) != 0) {
            return AbstractC5596a.b(context, i11);
        }
        Log.w("DrawableUtils", "[RNScreens] Failed to resolve drawable attribute.");
        return null;
    }
}
