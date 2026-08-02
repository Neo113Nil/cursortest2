package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeb extends zzbeu implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() throws RemoteException {
        Z1(J(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() throws RemoteException {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi(boolean z) throws RemoteException {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 5);
    }
}
