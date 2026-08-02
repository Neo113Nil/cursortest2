package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzhb implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ Map zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ zzhc zzg;
    final /* synthetic */ zzhc zzh;

    zzhb(zzhc zzhcVar, zzhc zzhcVar2, long j11, String str, String str2, String str3, Map map, String str4, byte[] bArr) {
        this.zzg = zzhcVar;
        this.zzh = zzhcVar2;
        this.zza = j11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = map;
        this.zzf = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhd zzhdVar;
        zzhd zzhdVar2;
        Context context;
        zzhdVar = this.zzg.zze;
        if (zzhdVar == null) {
            zzik zzf = zzik.zzf();
            context = this.zzg.zzf;
            zzf.zzm(context, this.zzh);
            this.zzg.zze = zzf.zze();
        }
        zzhdVar2 = this.zzg.zze;
        zzhdVar2.zzb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
