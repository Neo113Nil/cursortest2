package X9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzj;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes2.dex */
public final class n extends zza implements o {
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // X9.o
    public final void A(N9.b bVar, int i10) {
        Parcel zza = zza();
        zzc.zzg(zza, bVar);
        zza.writeInt(19020000);
        zzc(6, zza);
    }

    @Override // X9.o
    public final c L(N9.b bVar, GoogleMapOptions googleMapOptions) {
        c qVar;
        Parcel zza = zza();
        zzc.zzg(zza, bVar);
        zzc.zze(zza, googleMapOptions);
        Parcel zzJ = zzJ(3, zza);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            qVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            qVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new q(readStrongBinder);
        }
        zzJ.recycle();
        return qVar;
    }

    @Override // X9.o
    public final void X(N9.b bVar) {
        Parcel zza = zza();
        zzc.zzg(zza, bVar);
        zzc(11, zza);
    }

    @Override // X9.o
    public final void v(N9.b bVar, int i10) {
        Parcel zza = zza();
        zzc.zzg(zza, bVar);
        zza.writeInt(i10);
        zzc(10, zza);
    }

    @Override // X9.o
    public final int zzd() {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // X9.o
    public final a zze() {
        a jVar;
        Parcel zzJ = zzJ(4, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            jVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            jVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new j(readStrongBinder);
        }
        zzJ.recycle();
        return jVar;
    }

    @Override // X9.o
    public final zzk zzj() {
        Parcel zzJ = zzJ(5, zza());
        zzk zzb = zzj.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }
}
