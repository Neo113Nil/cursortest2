package u5;

import A5.t;
import android.content.Context;
import android.net.ConnectivityManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {
    @NotNull
    public static final f a(@NotNull Context context, @NotNull t tVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new H5.h();
        }
        try {
            return new i(connectivityManager, tVar);
        } catch (Exception unused) {
            return new H5.h();
        }
    }
}
