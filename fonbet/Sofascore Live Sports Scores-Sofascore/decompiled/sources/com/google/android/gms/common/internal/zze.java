package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze implements ServiceConnection {
    public final int a;
    public final /* synthetic */ BaseGmsClient b;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.b = baseGmsClient;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        BaseGmsClient baseGmsClient = this.b;
        if (iBinder == null) {
            synchronized (baseGmsClient.m) {
                i = baseGmsClient.t;
            }
            if (i == 3) {
                baseGmsClient.B = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            f fVar = baseGmsClient.l;
            fVar.sendMessage(fVar.obtainMessage(i2, baseGmsClient.D.get(), 16));
            return;
        }
        synchronized (baseGmsClient.n) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient.o = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new e(iBinder) : (IGmsServiceBroker) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        BaseGmsClient baseGmsClient2 = this.b;
        int i3 = this.a;
        zzg zzgVar = new zzg(baseGmsClient2, 0, null);
        f fVar2 = baseGmsClient2.l;
        fVar2.sendMessage(fVar2.obtainMessage(7, i3, -1, zzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.b;
        synchronized (baseGmsClient.n) {
            baseGmsClient.o = null;
        }
        BaseGmsClient baseGmsClient2 = this.b;
        int i = this.a;
        f fVar = baseGmsClient2.l;
        fVar.sendMessage(fVar.obtainMessage(6, i, 1));
    }
}
