package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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
public interface zzo extends IInterface {
    @Deprecated
    Location zzd();

    @Deprecated
    InterfaceC3185i zze(CurrentLocationRequest currentLocationRequest, zzq zzqVar);

    @Deprecated
    LocationAvailability zzf(String str);

    void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzm zzmVar);

    void zzh(LocationSettingsRequest locationSettingsRequest, zzs zzsVar, String str);

    void zzi(zzk zzkVar);

    @Deprecated
    void zzj(LastLocationRequest lastLocationRequest, zzq zzqVar);

    void zzk(zzdb zzdbVar, LocationRequest locationRequest, InterfaceC3132h interfaceC3132h);

    void zzl(PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h);

    void zzm(PendingIntent pendingIntent);

    void zzn(PendingIntent pendingIntent, zzm zzmVar, String str);

    void zzo(String[] strArr, zzm zzmVar, String str);

    void zzp(PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h);

    void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h);

    void zzr(long j10, boolean z10, PendingIntent pendingIntent);

    void zzs(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, InterfaceC3132h interfaceC3132h);

    void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, InterfaceC3132h interfaceC3132h);

    @Deprecated
    void zzu(Location location);

    void zzv(Location location, InterfaceC3132h interfaceC3132h);

    @Deprecated
    void zzw(boolean z10);

    void zzx(boolean z10, InterfaceC3132h interfaceC3132h);

    void zzy(zzdb zzdbVar, InterfaceC3132h interfaceC3132h);

    @Deprecated
    void zzz(zzdf zzdfVar);
}
