package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsx extends zza implements zzsz {
    public zzsx(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsz
    public final zzsw zzd(vnv vnvVar, zzso zzsoVar) throws RemoteException {
        zzsw zzswVar;
        Parcel zza = zza();
        zzc.zzb(zza, vnvVar);
        zzc.zza(zza, zzsoVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzswVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzswVar = queryLocalInterface instanceof zzsw ? (zzsw) queryLocalInterface : new zzsw(readStrongBinder);
        }
        zzb.recycle();
        return zzswVar;
    }
}
