package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzfr extends com.google.android.gms.internal.measurement.zzbu implements zzfp {
    @Override // com.google.android.gms.measurement.internal.zzfp
    public final zzal zza(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        Parcel zza = zza(21, a_);
        zzal zzalVar = (zzal) com.google.android.gms.internal.measurement.zzbw.zza(zza, zzal.CREATOR);
        zza.recycle();
        return zzalVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final String zzb(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzmu> zza(zzn zznVar, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, bundle);
        Parcel zza = zza(24, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzmu.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzno> zza(zzn zznVar, boolean z) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        Parcel zza = zza(7, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzac> zza(String str, String str2, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        Parcel zza = zza(16, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzac.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzac> zza(String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzac.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzno> zza(String str, String str2, boolean z, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        Parcel zza = zza(14, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final List<zzno> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        Parcel zza = zza(15, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    zzfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zzc(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(zzbf zzbfVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbfVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(zzbf zzbfVar, String str, String str2) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbfVar);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zzd(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(zzac zzacVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzacVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(zzac zzacVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzacVar);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zze(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(Bundle bundle, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zzf(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zzg(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zzh(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final void zza(zzno zznoVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zznVar);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfp
    public final byte[] zza(zzbf zzbfVar, String str) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbfVar);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }
}
