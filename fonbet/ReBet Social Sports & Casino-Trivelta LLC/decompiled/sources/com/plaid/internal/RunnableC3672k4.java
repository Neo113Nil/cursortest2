package com.plaid.internal;

import android.net.ConnectivityManager;
import com.plaid.internal.C3681l4;

/* renamed from: com.plaid.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3672k4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f40729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3681l4.b f40730b;

    public RunnableC3672k4(ConnectivityManager connectivityManager, C3681l4.b bVar) {
        this.f40729a = connectivityManager;
        this.f40730b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40729a.unregisterNetworkCallback(this.f40730b);
    }
}
