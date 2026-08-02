package zl0;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zl0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11151b {
    public static final boolean a(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void b(@NotNull Context context, ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable th2) {
                Log.e("ServiceExt", "unbindServiceSafely", th2);
            }
        }
    }
}
