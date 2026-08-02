package com.google.android.gms.internal.mlkit_common;

import K00.b;
import c8.C5766e;
import com.google.mlkit.common.sdkinternal.k;
import g.C6594f;

/* loaded from: classes9.dex */
final class zzrx extends zzsj {
    private final zzmu zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final k zze;
    private final zzna zzf;
    private final int zzg;

    /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z11, boolean z12, k kVar, zzna zznaVar, int i11, zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z11;
        this.zzd = z12;
        this.zze = kVar;
        this.zzf = zznaVar;
        this.zzg = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        zzna zznaVar = this.zzf;
        k kVar = this.zze;
        String obj = this.zza.toString();
        String obj2 = kVar.toString();
        String obj3 = zznaVar.toString();
        StringBuilder b11 = C6594f.b("RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=");
        b11.append(this.zzb);
        b11.append(", shouldLogRoughDownloadTime=");
        b11.append(this.zzc);
        b11.append(", shouldLogExactDownloadTime=");
        C5766e.a(", modelType=", obj2, ", downloadStatus=", b11, this.zzd);
        b11.append(obj3);
        b11.append(", failureStatusCode=");
        return b.e(this.zzg, "}", b11);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final k zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }
}
