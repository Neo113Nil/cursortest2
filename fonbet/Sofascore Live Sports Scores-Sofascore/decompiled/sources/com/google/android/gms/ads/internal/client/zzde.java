package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzde extends zzbeu implements zzdg {
    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zze() throws RemoteException {
        Parcel S1 = S1(J(), 1);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zzf() throws RemoteException {
        Parcel S1 = S1(J(), 2);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }
}
