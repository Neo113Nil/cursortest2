package k3;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import e3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18805a;

    static {
        String g10 = x.g("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f18805a = g10;
    }

    public static final i3.f a(ConnectivityManager connectivityManager) {
        boolean z5;
        NetworkCapabilities networkCapabilities;
        String str = f18805a;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z7 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e7) {
                x.e().d(str, "Unable to validate active network", e7);
            }
            if (networkCapabilities != null) {
                z5 = networkCapabilities.hasCapability(16);
                return new i3.f(z7, z5, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
            z5 = false;
            return new i3.f(z7, z5, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        } catch (SecurityException e9) {
            x.e().d(str, "Unable to get active network state", e9);
            return new i3.f(false, false, false, true);
        }
    }
}
