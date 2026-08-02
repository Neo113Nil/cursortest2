package r;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class y {

    private static class a {
        static boolean a(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || !a.a(context.getPackageManager())) ? false : true;
    }
}
