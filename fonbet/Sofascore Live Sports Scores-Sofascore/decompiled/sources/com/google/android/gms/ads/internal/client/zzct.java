package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzct extends zzbeu implements zzcv {
    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbvu getAdapterCreator() throws RemoteException {
        Parcel S1 = S1(J(), 2);
        zzbvu E4 = zzbvt.E4(S1.readStrongBinder());
        S1.recycle();
        return E4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel S1 = S1(J(), 1);
        zzez zzezVar = (zzez) zzbew.b(S1, zzez.CREATOR);
        S1.recycle();
        return zzezVar;
    }
}
