package m4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20371b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f20372c;

    public /* synthetic */ f(ConnectivityManager connectivityManager, int i5) {
        this.f20371b = i5;
        this.f20372c = connectivityManager;
    }

    @Override // m4.e
    public final boolean a() {
        switch (this.f20371b) {
            case 0:
                NetworkInfo activeNetworkInfo = this.f20372c.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                }
                break;
            default:
                ConnectivityManager connectivityManager = this.f20372c;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                }
                break;
        }
        return false;
    }
}
