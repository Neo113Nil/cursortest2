package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfas implements zzfby {
    private final Context zza;
    private final zzhbs zzb;
    private final zzfkm zzc;
    private final VersionInfoParcel zzd;

    zzfas(Context context, zzhbs zzhbsVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhbsVar;
        this.zzc = zzfkmVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfas.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdW)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgbu.zzh(r0).zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdX)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgbv.zzh(r0);
        r0 = com.google.android.gms.internal.ads.zzgbr.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzed)).intValue()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r2 = r4.zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
        r3 = r0.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0112, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdZ)).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdY)).booleanValue() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfat zzc() {
        try {
            Context context = this.zza;
            boolean zza = this.zzc.zza();
            zzgbq zzgbqVar = new zzgbq();
            zzgbq zzgbqVar2 = new zzgbq();
            boolean z = true;
            if (zza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzea)).booleanValue()) {
                    return new zzfat(true);
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzee)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzed)).intValue()) {
                    zzgbv.zzh(context).zzj();
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            zzgbq zzgbqVar3 = zzgbqVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzfat(zzgbqVar, zzgbqVar3, z2, z3, zza);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PerAppIdSignal");
            return new zzfat(this.zzc.zza());
        }
    }
}
