package f5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6432j extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6433k f62743a;

    C6432j(C6433k c6433k) {
        this.f62743a = c6433k;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities capabilities) {
        String str;
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        androidx.work.o e11 = androidx.work.o.e();
        str = C6434l.f62746a;
        e11.a(str, "Network capabilities changed: " + capabilities);
        C6433k c6433k = this.f62743a;
        connectivityManager = c6433k.f62744f;
        c6433k.f(C6434l.b(connectivityManager));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NotNull Network network) {
        String str;
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(network, "network");
        androidx.work.o e11 = androidx.work.o.e();
        str = C6434l.f62746a;
        e11.a(str, "Network connection lost");
        C6433k c6433k = this.f62743a;
        connectivityManager = c6433k.f62744f;
        c6433k.f(C6434l.b(connectivityManager));
    }
}
