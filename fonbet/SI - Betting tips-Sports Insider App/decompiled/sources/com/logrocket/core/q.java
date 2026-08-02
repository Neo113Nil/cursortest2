package com.logrocket.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6634a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.credentials.playservices.controllers.CreateRestoreCredential.a f6635b;

    public q(androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar) {
        this.f6635b = aVar;
    }

    public final void a() {
        boolean z5 = !this.f6634a.isEmpty();
        e eVar = (e) this.f6635b.f1514b;
        y9.m mVar = (y9.m) eVar.f6422c;
        AtomicReference atomicReference = mVar.f25768i;
        AtomicBoolean atomicBoolean = mVar.f25765f;
        if (atomicBoolean.get() != z5) {
            atomicBoolean.set(z5);
            LogRocketCore logRocketCore = (LogRocketCore) eVar.f6421b;
            xg.f q = xg.g.q();
            q.d();
            xg.g.p((xg.g) q.f6816b, z5);
            logRocketCore.a(10, q);
        }
        a0 a0Var = mVar.f25766g;
        a0 a0Var2 = a0.f6404a;
        if (a0Var == a0Var2) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) eVar.f6420a).getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            a0Var2 = a0.f6405b;
        }
        if (((a0) atomicReference.get()) != a0Var2) {
            atomicReference.set(a0Var2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f6634a.add(network);
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f6634a.remove(network);
        a();
    }
}
