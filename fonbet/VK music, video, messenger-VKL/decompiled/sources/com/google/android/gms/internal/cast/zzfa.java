package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzfa extends zzb implements zzfb {
    public zzfa() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        ApiMetadata apiMetadata = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
        zzc.zzf(parcel);
        zzb(readInt, apiMetadata);
        return true;
    }
}
