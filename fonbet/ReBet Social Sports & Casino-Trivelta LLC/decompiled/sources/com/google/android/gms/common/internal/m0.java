package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class m0 implements ServiceConnection, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32728a;

    /* renamed from: b, reason: collision with root package name */
    public int f32729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32730c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f32731d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f32732e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f32733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f32734g;

    public m0(o0 o0Var, l0 l0Var) {
        Objects.requireNonNull(o0Var);
        this.f32734g = o0Var;
        this.f32732e = l0Var;
        this.f32728a = new HashMap();
        this.f32729b = 2;
    }

    public final void a(String str) {
        l0 l0Var = this.f32732e;
        o0 o0Var = this.f32734g;
        o0Var.j().removeMessages(1, l0Var);
        o0Var.k().c(o0Var.i(), this);
        this.f32730c = false;
        this.f32729b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f32728a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f32728a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f32730c;
    }

    public final int e() {
        return this.f32729b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f32728a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f32728a.isEmpty();
    }

    public final IBinder h() {
        return this.f32731d;
    }

    public final ComponentName i() {
        return this.f32733f;
    }

    public final /* synthetic */ ConnectionResult j(String str, Executor executor) {
        o0 o0Var;
        J9.b k10;
        Context i10;
        l0 l0Var;
        try {
            Intent a10 = b0.a(this.f32734g.i(), this.f32732e);
            this.f32729b = 3;
            StrictMode.VmPolicy a11 = K9.x.a();
            try {
                o0Var = this.f32734g;
                k10 = o0Var.k();
                i10 = o0Var.i();
                l0Var = this.f32732e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean d10 = k10.d(i10, str, a10, this, 4225, executor);
                this.f32730c = d10;
                if (d10) {
                    o0Var.j().sendMessageDelayed(o0Var.j().obtainMessage(1, l0Var), o0Var.l());
                    ConnectionResult connectionResult = ConnectionResult.f32216f;
                    StrictMode.setVmPolicy(a11);
                    return connectionResult;
                }
                this.f32729b = 2;
                try {
                    o0Var.k().c(o0Var.i(), this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(a11);
                return connectionResult2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                StrictMode.setVmPolicy(a11);
                throw th4;
            }
        } catch (Z e10) {
            return e10.f32681a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0 o0Var = this.f32734g;
        synchronized (o0Var.h()) {
            try {
                o0Var.j().removeMessages(1, this.f32732e);
                this.f32731d = iBinder;
                this.f32733f = componentName;
                Iterator it = this.f32728a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f32729b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0 o0Var = this.f32734g;
        synchronized (o0Var.h()) {
            try {
                o0Var.j().removeMessages(1, this.f32732e);
                this.f32731d = null;
                this.f32733f = componentName;
                Iterator it = this.f32728a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f32729b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
