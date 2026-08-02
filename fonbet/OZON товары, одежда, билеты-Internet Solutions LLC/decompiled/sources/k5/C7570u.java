package k5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;

/* renamed from: k5.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7570u extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private final ConnectivityManager f70868e;

    C7570u(ConnectivityManager connectivityManager) {
        super(Mm0.e.AgentConnectionType);
        this.f70868e = connectivityManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        ConnectivityManager connectivityManager = this.f70868e;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "Not connected";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            throw new C7571u0("info.getType() != ConnectivityManager.TYPE_MOBILE");
        }
        int subtype = activeNetworkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 16:
            default:
                throw new C7571u0(Ej.b.a(subtype, "no case for networkType: "));
            case 20:
                return "5G";
        }
    }
}
