package com.google.android.gms.internal.mlkit_common;

import xsna.h5s;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zzpa extends zzph {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzpa(String str, boolean z, int i, zzoz zzozVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzph) {
            zzph zzphVar = (zzph) obj;
            if (this.zza.equals(zzphVar.zzb()) && this.zzb == zzphVar.zzc() && this.zzc == zzphVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        int i = this.zzc;
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        return h5s.c(i, "}", sb);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final boolean zzc() {
        return this.zzb;
    }
}
