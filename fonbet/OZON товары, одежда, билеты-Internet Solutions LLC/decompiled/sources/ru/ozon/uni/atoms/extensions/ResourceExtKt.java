package ru.ozon.uni.atoms.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\b\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"", "Landroid/content/Context;", "context", "toPx", "(ILandroid/content/Context;)I", "", "toPxF", "(ILandroid/content/Context;)F", "(I)F", "(I)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceExtKt {
    public static final int toPx(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) toPxF(i11, context);
    }

    public static final float toPxF(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static final int toPx(int i11) {
        return (int) toPxF(i11);
    }

    public static final float toPxF(int i11) {
        return TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }
}
