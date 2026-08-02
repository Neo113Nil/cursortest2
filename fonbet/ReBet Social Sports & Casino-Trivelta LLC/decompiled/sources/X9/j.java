package X9;

import N9.b;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class j extends zza implements a {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // X9.a
    public final N9.b R(LatLng latLng, float f10) {
        Parcel zza = zza();
        zzc.zze(zza, latLng);
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(9, zza);
        N9.b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // X9.a
    public final N9.b e(LatLngBounds latLngBounds, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, latLngBounds);
        zza.writeInt(i10);
        Parcel zzJ = zzJ(10, zza);
        N9.b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }
}
