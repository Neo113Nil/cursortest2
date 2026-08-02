package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC3116a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32254a = false;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f32255b = new LinkedBlockingQueue();

    public IBinder a() {
        AbstractC3191o.l("BlockingServiceConnection.getService() called on main thread");
        if (this.f32254a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f32254a = true;
        return (IBinder) this.f32255b.take();
    }

    public IBinder b(long j10, TimeUnit timeUnit) {
        AbstractC3191o.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f32254a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f32254a = true;
        IBinder iBinder = (IBinder) this.f32255b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f32255b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
