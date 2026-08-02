package k5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class f3 extends D0<Boolean> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70738e;

    f3(@NonNull Context context) {
        super(Mm0.e.VpnConnection);
        this.f70738e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Boolean s() throws D1 {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f70738e.getSystemService("connectivity");
        boolean z11 = false;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasTransport(4)) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
