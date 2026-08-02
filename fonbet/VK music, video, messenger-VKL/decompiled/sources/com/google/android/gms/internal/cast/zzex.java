package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzex extends zzb implements zzey {
    public zzex() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Surface surface = (Surface) zzc.zzb(parcel, Surface.CREATOR);
            ApiMetadata apiMetadata = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
            zzc.zzf(parcel);
            zzb(readInt, readInt2, surface, apiMetadata);
        } else if (i == 2) {
            int readInt3 = parcel.readInt();
            ApiMetadata apiMetadata2 = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
            zzc.zzf(parcel);
            zzd(readInt3, apiMetadata2);
        } else if (i == 3) {
            ApiMetadata apiMetadata3 = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
            zzc.zzf(parcel);
            zzf(apiMetadata3);
        } else if (i == 4) {
            ApiMetadata apiMetadata4 = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
            zzc.zzf(parcel);
            zzc(apiMetadata4);
        } else {
            if (i != 5) {
                return false;
            }
            boolean zza = zzc.zza(parcel);
            ApiMetadata apiMetadata5 = (ApiMetadata) zzc.zzb(parcel, ApiMetadata.CREATOR);
            zzc.zzf(parcel);
            zze(zza, apiMetadata5);
        }
        parcel2.writeNoException();
        return true;
    }
}
