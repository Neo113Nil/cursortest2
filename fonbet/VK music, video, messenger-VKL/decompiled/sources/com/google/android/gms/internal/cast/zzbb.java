package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;
import xsna.d001;
import xsna.ewz0;
import xsna.gxz0;
import xsna.gzz0;
import xsna.kc01;
import xsna.mwz0;
import xsna.mxz0;
import xsna.mzz0;
import xsna.oxz0;
import xsna.ra01;
import xsna.ryz0;
import xsna.tf01;
import xsna.uzz0;
import xsna.vnv;
import xsna.vwz0;
import xsna.xyz0;
import xsna.y201;
import xsna.z801;
import xsna.zwz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbb extends zza implements zzbc {
    public zzbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final int zze() throws RemoteException {
        Parcel zzb = zzb(8, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final zwz0 zzf(vnv vnvVar, CastOptions castOptions, zzbe zzbeVar, Map map) throws RemoteException {
        zwz0 mwz0Var;
        Parcel zza = zza();
        zzc.zze(zza, vnvVar);
        zzc.zzc(zza, castOptions);
        zzc.zze(zza, zzbeVar);
        zza.writeMap(map);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i = vwz0.a;
        if (readStrongBinder == null) {
            mwz0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            mwz0Var = queryLocalInterface instanceof zwz0 ? (zwz0) queryLocalInterface : new mwz0(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext");
        }
        zzb.recycle();
        return mwz0Var;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final d001 zzg(String str, String str2, y201 y201Var) throws RemoteException {
        d001 mzz0Var;
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zze(zza, y201Var);
        Parcel zzb = zzb(2, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i = uzz0.a;
        if (readStrongBinder == null) {
            mzz0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            mzz0Var = queryLocalInterface instanceof d001 ? (d001) queryLocalInterface : new mzz0(readStrongBinder, "com.google.android.gms.cast.framework.ISession");
        }
        zzb.recycle();
        return mzz0Var;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final oxz0 zzh(CastOptions castOptions, vnv vnvVar, ewz0 ewz0Var) throws RemoteException {
        oxz0 gxz0Var;
        Parcel zza = zza();
        zzc.zzc(zza, castOptions);
        zzc.zze(zza, vnvVar);
        zzc.zze(zza, ewz0Var);
        Parcel zzb = zzb(3, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i = mxz0.a;
        if (readStrongBinder == null) {
            gxz0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            gxz0Var = queryLocalInterface instanceof oxz0 ? (oxz0) queryLocalInterface : new gxz0(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession");
        }
        zzb.recycle();
        return gxz0Var;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final gzz0 zzi(vnv vnvVar, vnv vnvVar2, vnv vnvVar3) throws RemoteException {
        gzz0 ryz0Var;
        Parcel zza = zza();
        zzc.zze(zza, vnvVar);
        zzc.zze(zza, vnvVar2);
        zzc.zze(zza, vnvVar3);
        Parcel zzb = zzb(5, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i = xyz0.a;
        if (readStrongBinder == null) {
            ryz0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            ryz0Var = queryLocalInterface instanceof gzz0 ? (gzz0) queryLocalInterface : new ryz0(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService");
        }
        zzb.recycle();
        return ryz0Var;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final kc01 zzj(vnv vnvVar, tf01 tf01Var, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException {
        kc01 z801Var;
        Parcel zza = zza();
        zzc.zze(zza, vnvVar);
        zzc.zze(zza, tf01Var);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(0);
        zza.writeLong(2097152L);
        zza.writeInt(5);
        zza.writeInt(333);
        zza.writeInt(10000);
        Parcel zzb = zzb(6, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i6 = ra01.a;
        if (readStrongBinder == null) {
            z801Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            z801Var = queryLocalInterface instanceof kc01 ? (kc01) queryLocalInterface : new z801(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        }
        zzb.recycle();
        return z801Var;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final kc01 zzk(vnv vnvVar, vnv vnvVar2, tf01 tf01Var, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException {
        kc01 z801Var;
        Parcel zza = zza();
        zzc.zze(zza, vnvVar);
        zzc.zze(zza, vnvVar2);
        zzc.zze(zza, tf01Var);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(0);
        zza.writeLong(2097152L);
        zza.writeInt(5);
        zza.writeInt(333);
        zza.writeInt(10000);
        Parcel zzb = zzb(7, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i6 = ra01.a;
        if (readStrongBinder == null) {
            z801Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            z801Var = queryLocalInterface instanceof kc01 ? (kc01) queryLocalInterface : new z801(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        }
        zzb.recycle();
        return z801Var;
    }
}
