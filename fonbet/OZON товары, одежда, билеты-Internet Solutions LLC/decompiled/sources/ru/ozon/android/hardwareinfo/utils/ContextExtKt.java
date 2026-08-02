package ru.ozon.android.hardwareinfo.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"pxToDp", "", "Landroid/content/Context;", "px", "hardware-info_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextExtKt {
    public static final int pxToDp(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (i11 / context.getResources().getDisplayMetrics().density);
    }
}
