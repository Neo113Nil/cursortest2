package X9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzm;
import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

/* loaded from: classes2.dex */
public final class p extends zza implements b {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // X9.b
    public final void B0(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(22, zza);
    }

    @Override // X9.b
    public final void C(N9.b bVar) {
        Parcel zza = zza();
        zzc.zzg(zza, bVar);
        zzc(4, zza);
    }

    @Override // X9.b
    public final zzaj U(MarkerOptions markerOptions) {
        Parcel zza = zza();
        zzc.zze(zza, markerOptions);
        Parcel zzJ = zzJ(11, zza);
        zzaj zzb = zzai.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // X9.b
    public final void clear() {
        zzc(14, zza());
    }

    @Override // X9.b
    public final void k0(g gVar) {
        Parcel zza = zza();
        zzc.zzg(zza, gVar);
        zzc(28, zza);
    }

    @Override // X9.b
    public final void n(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zze(zza, latLngBounds);
        zzc(95, zza);
    }

    @Override // X9.b
    public final zzn p(CircleOptions circleOptions) {
        Parcel zza = zza();
        zzc.zze(zza, circleOptions);
        Parcel zzJ = zzJ(35, zza);
        zzn zzb = zzm.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // X9.b
    public final d q0() {
        d kVar;
        Parcel zzJ = zzJ(25, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            kVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new k(readStrongBinder);
        }
        zzJ.recycle();
        return kVar;
    }
}
