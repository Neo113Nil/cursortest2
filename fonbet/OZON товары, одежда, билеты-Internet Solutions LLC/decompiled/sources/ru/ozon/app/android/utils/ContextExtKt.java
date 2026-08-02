package ru.ozon.app.android.utils;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "", "isDestroyed", "(Landroid/content/Context;)Z", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextExtKt {
    public static final boolean isDestroyed(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        return activity != null && activity.isDestroyed();
    }
}
