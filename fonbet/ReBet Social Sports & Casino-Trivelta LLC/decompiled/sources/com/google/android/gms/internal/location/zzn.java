package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC3132h;
import com.google.android.gms.common.internal.InterfaceC3185i;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* loaded from: classes2.dex */
public final class zzn extends zza implements zzo {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final Location zzd() {
        Parcel zzb = zzb(7, zza());
        Location location = (Location) zzc.zza(zzb, Location.CREATOR);
        zzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final InterfaceC3185i zze(CurrentLocationRequest currentLocationRequest, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, currentLocationRequest);
        zzc.zze(zza, zzqVar);
        Parcel zzb = zzb(87, zza);
        InterfaceC3185i c10 = InterfaceC3185i.a.c(zzb.readStrongBinder());
        zzb.recycle();
        return c10;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final LocationAvailability zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzb, LocationAvailability.CREATOR);
        zzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzm zzmVar) {
        Parcel zza = zza();
        zzc.zzd(zza, geofencingRequest);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzh(LocationSettingsRequest locationSettingsRequest, zzs zzsVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, locationSettingsRequest);
        zzc.zze(zza, zzsVar);
        zza.writeString(null);
        zzc(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzi(zzk zzkVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzkVar);
        zzc(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzj(LastLocationRequest lastLocationRequest, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, lastLocationRequest);
        zzc.zze(zza, zzqVar);
        zzc(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zzd(zza, locationRequest);
        zzc.zze(zza, interfaceC3132h);
        zzc(88, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzl(PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC3132h);
        zzc(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzm(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzn(PendingIntent pendingIntent, zzm zzmVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzo(String[] strArr, zzm zzmVar, String str) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzp(PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC3132h);
        zzc(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, activityTransitionRequest);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC3132h);
        zzc(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzr(long j10, boolean z10, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zzc.zzc(zza, true);
        zzc.zzd(zza, pendingIntent);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzs(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbVar);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, interfaceC3132h);
        zzc(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zzd(zza, sleepSegmentRequest);
        zzc.zze(zza, interfaceC3132h);
        zzc(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzu(Location location) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzv(Location location, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc.zze(zza, interfaceC3132h);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzw(boolean z10) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzx(boolean z10, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc.zze(zza, interfaceC3132h);
        zzc(84, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzy(zzdb zzdbVar, InterfaceC3132h interfaceC3132h) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zze(zza, interfaceC3132h);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzz(zzdf zzdfVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdfVar);
        zzc(59, zza);
    }
}
