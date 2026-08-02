package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionReadResult;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public abstract class zzcp extends zzb implements zzcq {
    public zzcp() {
        super("com.google.android.gms.fitness.internal.ISessionReadCallback");
    }

    public static zzcq zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
        return queryLocalInterface instanceof zzcq ? (zzcq) queryLocalInterface : new zzco(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        SessionReadResult sessionReadResult = (SessionReadResult) zzc.zza(parcel, SessionReadResult.CREATOR);
        zzc.zzb(parcel);
        zzd(sessionReadResult);
        return true;
    }
}
