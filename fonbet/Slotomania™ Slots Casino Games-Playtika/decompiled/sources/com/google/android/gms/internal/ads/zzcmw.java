package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.M6;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcmw implements zzbad {
    private final Context zza;
    private final zzgck zzb;

    zzcmw(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdD)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        zzgdf zze = zzgdg.zze();
        zze.zza(((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdJ)).floatValue());
        zzgdg zzgdgVar = (zzgdg) zze.zzbu();
        zzgdh zzi = zzgdi.zzi();
        zzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdK)).booleanValue());
        zzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdM)).longValue());
        zzgdi zzgdiVar = (zzgdi) zzi.zzbu();
        zzgcn zzw = zzgco.zzw();
        zzw.zzi(i);
        zzw.zzb(versionInfoParcel.afmaVersion);
        zzw.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdk)).booleanValue());
        zzw.zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdA)).intValue() == -1);
        zzw.zzg(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdC)).intValue());
        zzw.zze(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdL)).longValue());
        zzw.zzd(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdB)).intValue());
        zzw.zzc(zzgdgVar);
        zzw.zzf(zzgdiVar);
        zzgck zza = zzgck.zza(context, zzcff.zza, (zzgco) zzw.zzbu());
        this.zzb = zza;
        zza.zzb();
    }

    public final String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? zzh != 3 ? "uns" : "3.0" : M6.k0 : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.zza;
        float zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2);
        zzgck zzgckVar = this.zzb;
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, zzE, zzE2, 0);
        zzgckVar.zzg(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgckVar.zzg(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgckVar.zzg(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
