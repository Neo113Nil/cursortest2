package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfat implements zzfbw {
    private zzgbq zza;
    private zzgbq zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzfat(zzgbq zzgbqVar, zzgbq zzgbqVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzgbqVar;
        this.zzb = zzgbqVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzfat(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdX)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (r6.zzb.zzc() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r1.putString("paidv2_id_android", r6.zzb.zza());
        r1.putLong("paidv2_creation_time_android", r6.zzb.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r6.zzc);
        r1.putBoolean("paidv2_user_option_android", r6.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdZ)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdY)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzdW)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r6.zza.zzc() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r1.putString("paidv1_id_android", r6.zza.zza());
        r1.putLong("paidv1_creation_time_android", r6.zza.zzb());
     */
    @Override // com.google.android.gms.internal.ads.zzfbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zze) {
            return;
        }
        Bundle zza = zzflb.zza(bundle, "pii");
        boolean z = this.zzf;
        if (!z) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (z) {
        }
        if (zza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", zza);
    }
}
