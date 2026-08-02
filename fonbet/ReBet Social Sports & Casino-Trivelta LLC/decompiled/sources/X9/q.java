package X9;

import N9.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public final class q extends zza implements c {
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // X9.c
    public final void B(i iVar) {
        Parcel zza = zza();
        zzc.zzg(zza, iVar);
        zzc(9, zza);
    }

    @Override // X9.c
    public final void a() {
        zzc(5, zza());
    }

    @Override // X9.c
    public final void f(Bundle bundle) {
        Parcel zza = zza();
        zzc.zze(zza, bundle);
        zzc(2, zza);
    }

    @Override // X9.c
    public final N9.b getView() {
        Parcel zzJ = zzJ(8, zza());
        N9.b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // X9.c
    public final void h() {
        zzc(4, zza());
    }

    @Override // X9.c
    public final void onLowMemory() {
        zzc(6, zza());
    }

    @Override // X9.c
    public final void onResume() {
        zzc(3, zza());
    }
}
