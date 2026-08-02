package mZ;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9067a f74691a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f74692b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f74693c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f74694d;

    /* renamed from: e, reason: collision with root package name */
    private final ConnectivityManager f74695e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f74696f;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            f fVar = f.this;
            if (fVar.h()) {
                return;
            }
            if (f.c(fVar) != f.a(fVar)) {
                f.d(fVar, f.c(fVar));
            }
            fVar.f74693c.tryEmit(Boolean.valueOf(f.c(fVar)));
        }
    }

    public f(@NotNull Context context, @NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f74691a = networkInfoProvider;
        this.f74692b = context.getSharedPreferences("vpn_connection_preference_file", 0);
        C0 b11 = E0.b(0, 1, null, 4);
        this.f74693c = b11;
        this.f74694d = C2399j.a(b11);
        Object systemService = context.getSystemService("connectivity");
        this.f74695e = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f74696f = new a();
    }

    public static final boolean a(f fVar) {
        return fVar.f74692b.getBoolean("was_vpn_enabled_key", false);
    }

    public static final boolean c(f fVar) {
        return fVar.f74691a.m();
    }

    public static final void d(f fVar, boolean z11) {
        fVar.f74692b.edit().putBoolean("was_vpn_enabled_key", z11).apply();
    }

    @NotNull
    public final InterfaceC2395h<Boolean> e() {
        return this.f74694d;
    }

    public final void f() {
        try {
            ConnectivityManager connectivityManager = this.f74695e;
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(this.f74696f);
            }
        } catch (RuntimeException e11) {
            C8116a.f74679a.c("Error start VPN monitoring", e11);
        }
    }

    public final void g() {
        try {
            ConnectivityManager connectivityManager = this.f74695e;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.f74696f);
            }
        } catch (RuntimeException e11) {
            C8116a.f74679a.c("Error stop VPN monitoring", e11);
        }
    }

    public final boolean h() {
        return (this.f74691a.m() || this.f74692b.getBoolean("was_vpn_enabled_key", false)) ? false : true;
    }
}
