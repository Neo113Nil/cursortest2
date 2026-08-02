package wg;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10553a {
    @NotNull
    public static final PackageInfo a(@NotNull PackageManager packageManager, @NotNull String packageName) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(packageName, flags)");
            return packageInfo2;
        }
        of2 = PackageManager.PackageInfoFlags.of(0);
        packageInfo = packageManager.getPackageInfo(packageName, of2);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(packageNa…er.PackageInfoFlags::of))");
        return packageInfo;
    }
}
