package ru.ozon.app.android.network.networkhandler;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/network/networkhandler/InternetConnectionHandler;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "hasInternetConnection", "", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternetConnectionHandler implements ConnectionHandler {

    @NotNull
    private final Context appContext;

    public InternetConnectionHandler(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // ru.ozon.app.android.network.networkhandler.ConnectionHandler
    public boolean hasInternetConnection() {
        Network[] networkArr;
        ConnectivityManager connectivityManager = (ConnectivityManager) a.getSystemService(this.appContext, ConnectivityManager.class);
        if (Build.VERSION.SDK_INT < 29) {
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        if (connectivityManager == null || (networkArr = connectivityManager.getAllNetworks()) == null) {
            networkArr = new Network[0];
        }
        if (networkArr.length == 0) {
            return false;
        }
        boolean z11 = false;
        for (Network network : networkArr) {
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                z11 = true;
            }
        }
        return z11;
    }
}
