package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.b5;
import io.sentry.l4;
import io.sentry.y3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15901b;

    /* renamed from: e, reason: collision with root package name */
    public final l4 f15904e;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f15902c = null;

    /* renamed from: d, reason: collision with root package name */
    public long f15903d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y3 f15900a = y3.f17255a;

    public z0(n0 n0Var, l4 l4Var) {
        y4.a.C(n0Var, "BuildInfoProvider is required");
        this.f15901b = n0Var;
        y4.a.C(l4Var, "SentryDateProvider is required");
        this.f15904e = l4Var;
    }

    public static io.sentry.e a(String str) {
        io.sentry.e eVar = new io.sentry.e();
        eVar.f16334e = "system";
        eVar.f16336g = "network.event";
        eVar.c(str, "action");
        eVar.f16338i = b5.INFO;
        return eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f15900a.c(a("NETWORK_AVAILABLE"));
        this.f15902c = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        y0 y0Var;
        long d10 = this.f15904e.a().d();
        NetworkCapabilities networkCapabilities2 = this.f15902c;
        long j = this.f15903d;
        n0 n0Var = this.f15901b;
        if (networkCapabilities2 == null) {
            y0Var = new y0(networkCapabilities, n0Var, d10);
        } else {
            y0 y0Var2 = new y0(networkCapabilities2, n0Var, j);
            y0Var = new y0(networkCapabilities, n0Var, d10);
            int abs = Math.abs(y0Var2.f15893c - y0Var.f15893c);
            int i5 = y0Var.f15891a;
            int i10 = y0Var2.f15891a;
            int abs2 = Math.abs(i10 - i5);
            int i11 = y0Var.f15892b;
            int i12 = y0Var2.f15892b;
            int abs3 = Math.abs(i12 - i11);
            boolean z5 = ((double) Math.abs(y0Var2.f15894d - y0Var.f15894d)) / 1000000.0d < 5000.0d;
            boolean z7 = z5 || abs <= 5;
            boolean z10 = z5 || ((double) abs2) <= Math.max(1000.0d, ((double) Math.abs(i10)) * 0.1d);
            boolean z11 = z5 || ((double) abs3) <= Math.max(1000.0d, ((double) Math.abs(i12)) * 0.1d);
            if (y0Var2.f15895e == y0Var.f15895e && y0Var2.f15896f.equals(y0Var.f15896f) && z7 && z10 && z11) {
                y0Var = null;
            }
        }
        if (y0Var == null) {
            return;
        }
        this.f15902c = networkCapabilities;
        this.f15903d = d10;
        io.sentry.e a7 = a("NETWORK_CAPABILITIES_CHANGED");
        a7.c(Integer.valueOf(y0Var.f15891a), "download_bandwidth");
        a7.c(Integer.valueOf(y0Var.f15892b), "upload_bandwidth");
        a7.c(Boolean.valueOf(y0Var.f15895e), "vpn_active");
        a7.c(y0Var.f15896f, "network_type");
        int i13 = y0Var.f15893c;
        if (i13 != 0) {
            a7.c(Integer.valueOf(i13), "signal_strength");
        }
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(y0Var, "android:networkCapabilities");
        this.f15900a.h(a7, h0Var);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f15900a.c(a("NETWORK_LOST"));
        this.f15902c = null;
    }
}
