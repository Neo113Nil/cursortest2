package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.a70;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements ServiceConnection {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final LinkedBlockingDeque b = new LinkedBlockingDeque();

    public final IBinder l() {
        if (!this.a.compareAndSet(false, true)) {
            a70.r("Binder already consumed");
            return null;
        }
        Object take = this.b.take();
        take.getClass();
        return (IBinder) take;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
