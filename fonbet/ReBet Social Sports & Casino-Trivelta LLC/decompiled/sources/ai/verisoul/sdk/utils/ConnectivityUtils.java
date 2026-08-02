package ai.verisoul.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lai/verisoul/sdk/utils/ConnectivityUtils;", "", "()V", "hasNetworkStatePermission", "", "context", "Landroid/content/Context;", "isNetworkAvailable", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectivityUtils {

    @NotNull
    public static final ConnectivityUtils INSTANCE = new ConnectivityUtils();

    private ConnectivityUtils() {
    }

    public final boolean hasNetworkStatePermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isNetworkAvailable(@NotNull Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        if (hasNetworkStatePermission(context)) {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3)) {
                return false;
            }
        }
        return true;
    }
}
