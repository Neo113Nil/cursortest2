package i6;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import i6.InterfaceC7015b;

/* loaded from: classes.dex */
public final class e implements c {
    @NonNull
    public final InterfaceC7015b a(@NonNull Context context, @NonNull InterfaceC7015b.a aVar) {
        boolean z11 = androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z11 ? new d(context, aVar) : new o();
    }
}
