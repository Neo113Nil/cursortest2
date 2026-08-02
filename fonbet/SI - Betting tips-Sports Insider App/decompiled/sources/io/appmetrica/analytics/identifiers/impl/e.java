package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f11809a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f11810b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11811c = new Object();

    public e(Intent intent, String str) {
        this.f11809a = intent;
    }

    public final void a(Context context) {
        synchronized (this.f11811c) {
            this.f11810b = null;
            this.f11811c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f11811c) {
            this.f11810b = null;
            this.f11811c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f11811c) {
            this.f11811c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11811c) {
            this.f11810b = iBinder;
            this.f11811c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11811c) {
            this.f11810b = null;
            this.f11811c.notifyAll();
        }
    }
}
