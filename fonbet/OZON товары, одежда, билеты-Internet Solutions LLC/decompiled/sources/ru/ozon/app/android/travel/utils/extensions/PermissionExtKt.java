package ru.ozon.app.android.travel.utils.extensions;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"openAppNotificationSettings", "", "Landroid/content/Context;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionExtKt {
    public static final void openAppNotificationSettings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
    }
}
