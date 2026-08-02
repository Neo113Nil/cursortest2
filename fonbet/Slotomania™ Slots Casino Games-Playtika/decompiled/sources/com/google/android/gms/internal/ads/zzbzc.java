package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbzc extends zzbds implements zzbze {
    zzbzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zze(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }
}
