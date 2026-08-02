package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzcib extends zzaue {
    static final zzcib zzb = new zzcib();

    zzcib() {
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final zzaui zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzauk() : "mvhd".equals(str) ? new zzaul() : new zzaum(str);
    }
}
