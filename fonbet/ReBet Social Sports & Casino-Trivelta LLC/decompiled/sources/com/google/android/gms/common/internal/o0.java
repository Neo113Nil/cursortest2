package com.google.android.gms.common.internal;

import ai.verisoul.sdk.Core;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o0 extends AbstractC3182f {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f32737g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Context f32738h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Handler f32739i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f32740j;

    /* renamed from: k, reason: collision with root package name */
    public final J9.b f32741k;

    /* renamed from: l, reason: collision with root package name */
    public final long f32742l;

    /* renamed from: m, reason: collision with root package name */
    public final long f32743m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Executor f32744n;

    public o0(Context context, Looper looper, Executor executor) {
        n0 n0Var = new n0(this, null);
        this.f32740j = n0Var;
        this.f32738h = context.getApplicationContext();
        this.f32739i = new zzg(looper, n0Var);
        this.f32741k = J9.b.b();
        this.f32742l = 5000L;
        this.f32743m = Core.sensorDataTimeout;
        this.f32744n = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3182f
    public final ConnectionResult e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResult;
        AbstractC3191o.n(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f32737g;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (executor == null) {
                    executor = this.f32744n;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.b(serviceConnection, serviceConnection, str);
                    connectionResult = m0Var.j(str, executor);
                    hashMap.put(l0Var, m0Var);
                } else {
                    this.f32739i.removeMessages(0, l0Var);
                    if (m0Var.f(serviceConnection)) {
                        String obj = l0Var.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(obj);
                        throw new IllegalStateException(sb2.toString());
                    }
                    m0Var.b(serviceConnection, serviceConnection, str);
                    int e10 = m0Var.e();
                    if (e10 == 1) {
                        serviceConnection.onServiceConnected(m0Var.i(), m0Var.h());
                    } else if (e10 == 2) {
                        connectionResult = m0Var.j(str, executor);
                    }
                    connectionResult = null;
                }
                if (m0Var.d()) {
                    return ConnectionResult.f32216f;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3182f
    public final void g(l0 l0Var, ServiceConnection serviceConnection, String str) {
        AbstractC3191o.n(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f32737g;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (m0Var == null) {
                    String obj = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!m0Var.f(serviceConnection)) {
                    String obj2 = l0Var.toString();
                    StringBuilder sb3 = new StringBuilder(obj2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(obj2);
                    throw new IllegalStateException(sb3.toString());
                }
                m0Var.c(serviceConnection, str);
                if (m0Var.g()) {
                    this.f32739i.sendMessageDelayed(this.f32739i.obtainMessage(0, l0Var), this.f32742l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ HashMap h() {
        return this.f32737g;
    }

    public final /* synthetic */ Context i() {
        return this.f32738h;
    }

    public final /* synthetic */ Handler j() {
        return this.f32739i;
    }

    public final /* synthetic */ J9.b k() {
        return this.f32741k;
    }

    public final /* synthetic */ long l() {
        return this.f32743m;
    }
}
