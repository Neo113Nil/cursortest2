package m0;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5487a {

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    public static class C0808a {
        public static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0808a.a(packageInfo) : packageInfo.versionCode;
    }
}
