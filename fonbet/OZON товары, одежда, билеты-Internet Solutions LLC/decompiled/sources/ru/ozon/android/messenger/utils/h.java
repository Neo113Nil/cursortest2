package ru.ozon.android.messenger.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$attr;

/* loaded from: classes10.dex */
public final class h {
    public static final int a(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimensionPixelSize(i11);
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R$attr.round_corners_flag, typedValue, true)) {
            return typedValue.resourceId != 0 ? context.getResources().getBoolean(typedValue.resourceId) : typedValue.data != 0;
        }
        return false;
    }

    public static final int c(int i11) {
        return C6915b.c(d(i11));
    }

    public static final float d(int i11) {
        return TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }
}
