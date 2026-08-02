package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class zzbm extends zzb implements zzbn {
    public zzbm() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzd();
            parcel2.writeNoException();
        } else if (i11 == 2) {
            zzf();
            parcel2.writeNoException();
        } else if (i11 == 3) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzcc zzccVar = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
            zzc.zzb(parcel);
            List zzb = zzb(asInterface, zzccVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(zzb);
        } else if (i11 == 4) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzcc zzccVar2 = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
            zzbc zzbcVar = (zzbc) zzc.zza(parcel, zzbc.CREATOR);
            zzc.zzb(parcel);
            List zzc = zzc(asInterface2, zzccVar2, zzbcVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(zzc);
        } else {
            if (i11 != 5) {
                return false;
            }
            zzbe zzbeVar = (zzbe) zzc.zza(parcel, zzbe.CREATOR);
            zzc.zzb(parcel);
            zze(zzbeVar);
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public void zze(zzbe zzbeVar) {
        zzd();
    }
}
