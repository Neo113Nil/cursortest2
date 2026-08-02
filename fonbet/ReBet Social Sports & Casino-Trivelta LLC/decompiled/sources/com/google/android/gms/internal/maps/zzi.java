package com.google.android.gms.internal.maps;

import N9.b;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.PinConfig;

/* loaded from: classes2.dex */
public final class zzi extends zza implements zzk {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzd() {
        Parcel zzJ = zzJ(4, zza());
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zze(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(2, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzg(Bitmap bitmap) {
        Parcel zza = zza();
        zzc.zze(zza, bitmap);
        Parcel zzJ = zzJ(6, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(3, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzJ = zzJ(7, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzj(PinConfig pinConfig) {
        Parcel zza = zza();
        zzc.zze(zza, pinConfig);
        Parcel zzJ = zzJ(8, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final b zzk(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        Parcel zzJ = zzJ(1, zza);
        b c10 = b.a.c(zzJ.readStrongBinder());
        zzJ.recycle();
        return c10;
    }
}
