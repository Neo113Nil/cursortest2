package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdv extends zzbeu implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() throws RemoteException {
        Parcel S1 = S1(J(), 1);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() throws RemoteException {
        Parcel S1 = S1(J(), 2);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() throws RemoteException {
        Parcel S1 = S1(J(), 3);
        ArrayList createTypedArrayList = S1.createTypedArrayList(zzv.CREATOR);
        S1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() throws RemoteException {
        Parcel S1 = S1(J(), 4);
        zzv zzvVar = (zzv) zzbew.b(S1, zzv.CREATOR);
        S1.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() throws RemoteException {
        Parcel S1 = S1(J(), 5);
        Bundle bundle = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() throws RemoteException {
        Parcel S1 = S1(J(), 6);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }
}
