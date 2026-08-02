package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f32711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32712b;

    public f0(AbstractC3179c abstractC3179c, int i10) {
        Objects.requireNonNull(abstractC3179c);
        this.f32712b = abstractC3179c;
        this.f32711a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3179c abstractC3179c = this.f32712b;
        if (iBinder == null) {
            abstractC3179c.zzf(16);
            return;
        }
        synchronized (abstractC3179c.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3179c.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3187k)) ? new U(iBinder) : (InterfaceC3187k) queryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32712b.zzb(0, null, this.f32711a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3179c abstractC3179c = this.f32712b;
        synchronized (abstractC3179c.zzh()) {
            abstractC3179c.zzi(null);
        }
        AbstractC3179c abstractC3179c2 = this.f32712b;
        int i10 = this.f32711a;
        Handler handler = abstractC3179c2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
