package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.provider.Settings;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.plaid.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3681l4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40756a;

    /* renamed from: b, reason: collision with root package name */
    public final C3784x0 f40757b;

    /* renamed from: com.plaid.internal.l4$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40758a;

        static {
            int[] iArr = new int[EnumC3663j4.values().length];
            f40758a = iArr;
            try {
                iArr[EnumC3663j4.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40758a[EnumC3663j4.WIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.plaid.internal.l4$b */
    public static class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final C3784x0 f40759a;

        /* renamed from: b, reason: collision with root package name */
        public final CountDownLatch f40760b;

        /* renamed from: c, reason: collision with root package name */
        public volatile C3636g4 f40761c;

        /* renamed from: d, reason: collision with root package name */
        public volatile RunnableC3672k4 f40762d;

        /* renamed from: e, reason: collision with root package name */
        public final ConnectivityManager f40763e;

        public b(ConnectivityManager connectivityManager) {
            W3 w32 = Z3.f39803a;
            this.f40759a = new C3784x0("network-callback");
            this.f40760b = new CountDownLatch(1);
            this.f40763e = connectivityManager;
        }

        public final void a(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            if (this.f40762d == null) {
                this.f40759a.a(W3.ERROR, "network callback already unregistered", new Object[0]);
                return;
            }
            try {
                C3627f4 c3627f4 = new C3627f4(networkCapabilities);
                EnumC3801z enumC3801z = c3627f4.f40605c == EnumC3801z.YES ? c3627f4.f40606d : EnumC3801z.NO;
                if (this.f40761c != null && this.f40761c.f40625a.equals(network)) {
                    this.f40759a.a(W3.INFO, "update validated network %s %s", network, c3627f4);
                    this.f40761c.f40627c = enumC3801z;
                } else {
                    if (this.f40761c != null || enumC3801z == EnumC3801z.NO) {
                        this.f40759a.a(W3.INFO, "update network %s %s", network, c3627f4);
                        return;
                    }
                    this.f40759a.a(W3.INFO, "found validated network %s %s", network, c3627f4);
                    this.f40761c = new C3636g4(network, this.f40762d);
                    this.f40761c.f40627c = enumC3801z;
                    this.f40760b.countDown();
                }
            } catch (RuntimeException e10) {
                this.f40759a.a(e10, "fatal network callback error");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NonNull Network network) {
            NetworkCapabilities networkCapabilities = this.f40763e.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.f40759a.a(W3.INFO, "available network %s", network);
                a(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            a(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            if (this.f40761c == null || !this.f40761c.f40625a.equals(network)) {
                return;
            }
            this.f40759a.a(W3.INFO, "lost network %s", network);
            C3636g4 c3636g4 = this.f40761c;
            if (c3636g4.f40628d) {
                return;
            }
            c3636g4.f40628d = true;
            c3636g4.f40626b.run();
        }
    }

    public C3681l4(Context context) {
        W3 w32 = Z3.f39803a;
        this.f40757b = new C3784x0("network-utils");
        this.f40756a = context;
    }

    public final boolean a() {
        W3 w32 = W3.DEBUG;
        this.f40757b.a(w32, "isAirplaneMode: Checking if device is in airplane mode.", new Object[0]);
        boolean z10 = Settings.Global.getInt(this.f40756a.getContentResolver(), "airplane_mode_on", 0) != 0;
        C3784x0 c3784x0 = this.f40757b;
        StringBuilder sb2 = new StringBuilder("isAirplaneMode: Airplane mode ");
        sb2.append(z10 ? "IS" : "IS NOT");
        sb2.append(" active.");
        c3784x0.a(w32, sb2.toString(), new Object[0]);
        return z10;
    }

    public final C3636g4 a(EnumC3663j4 enumC3663j4) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f40756a.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            int i11 = a.f40758a[enumC3663j4.ordinal()];
            if (i11 == 1) {
                i10 = 1;
            } else if (i11 == 2) {
                i10 = 3;
            }
            NetworkRequest build = addCapability.addTransportType(i10).build();
            b bVar = new b(connectivityManager);
            this.f40757b.a(W3.DEBUG, "Network %s requested, waiting (%d)ms for result (%s)", enumC3663j4, 10000, Thread.currentThread());
            bVar.f40762d = new RunnableC3672k4(connectivityManager, bVar);
            connectivityManager.requestNetwork(build, bVar);
            try {
                bVar.f40760b.await(10000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (bVar.f40761c == null) {
                RunnableC3672k4 runnableC3672k4 = bVar.f40762d;
                runnableC3672k4.f40729a.unregisterNetworkCallback(runnableC3672k4.f40730b);
            }
            return bVar.f40761c;
        }
        this.f40757b.a(W3.ERROR, "ConnectivityManager is null!", new Object[0]);
        throw new IllegalStateException("ConnectivityManager not available!");
    }
}
