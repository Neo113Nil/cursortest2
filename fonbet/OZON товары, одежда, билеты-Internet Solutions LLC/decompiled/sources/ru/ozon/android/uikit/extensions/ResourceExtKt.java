package ru.ozon.android.uikit.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Landroid/content/Context;", "context", "", "toPxF", "(ILandroid/content/Context;)F", "(I)F", "toPx", "(I)I", "design-system_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResourceExtKt {
    public static final int toPx(int i11) {
        return (int) toPxF(i11);
    }

    public static final float toPxF(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static final float toPxF(int i11) {
        return TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }
}
