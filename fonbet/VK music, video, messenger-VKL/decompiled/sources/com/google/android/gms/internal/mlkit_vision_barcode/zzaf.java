package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzaf extends zza implements IInterface {
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() throws RemoteException {
        zzc(3, zza());
    }

    public final zzq[] zze(vnv vnvVar, zzaj zzajVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, vnvVar);
        zzc.zza(zza, zzajVar);
        Parcel zzb = zzb(1, zza);
        zzq[] zzqVarArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqVarArr;
    }

    public final zzq[] zzf(vnv vnvVar, zzaj zzajVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, vnvVar);
        zzc.zza(zza, zzajVar);
        Parcel zzb = zzb(2, zza);
        zzq[] zzqVarArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqVarArr;
    }
}
