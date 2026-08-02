package ru.ozon.app.android.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/app/Activity;", "", "openAppSettings", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/m;", "(Landroidx/fragment/app/m;)V", "openAppNotificationsSettings", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionExtKt {
    public static final void openAppNotificationsSettings(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        activity.startActivity(intent);
    }

    public static final void openAppSettings(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity.getPackageName(), null));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public static final void openAppSettings(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        r activity = componentCallbacksC5392m.getActivity();
        if (activity != null) {
            openAppSettings(activity);
        }
    }
}
