package ru.ozon.uni.android.uikitsdk.ext;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001¨\u0006\n"}, d2 = {"toPx", "", "", "context", "Landroid/content/Context;", "toPxF", "toDp", "toDpF", "toSpF", "toSp", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UiExtKt {
    public static final int toDp(int i11) {
        return (int) Math.ceil(i11 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float toDpF(float f7) {
        return f7 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int toPx(float f7, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C6915b.c(TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics()));
    }

    public static final float toPxF(float f7) {
        return TypedValue.applyDimension(1, f7, Resources.getSystem().getDisplayMetrics());
    }

    public static final int toSp(int i11) {
        return C6915b.c(toSpF(i11));
    }

    public static final float toSpF(float f7) {
        return TypedValue.applyDimension(2, f7, Resources.getSystem().getDisplayMetrics());
    }

    public static final float toPxF(int i11) {
        return toPxF(i11);
    }

    public static final float toSpF(int i11) {
        return toSpF(i11);
    }

    public static final int toPx(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return toPx(i11, context);
    }

    public static final int toPx(float f7) {
        return C6915b.c(toPxF(f7));
    }

    public static final int toPx(int i11) {
        return C6915b.c(toPxF(i11));
    }
}
