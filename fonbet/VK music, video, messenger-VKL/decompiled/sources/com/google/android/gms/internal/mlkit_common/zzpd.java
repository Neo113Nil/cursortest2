package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
import xsna.gsi0;
import xsna.h5s;
import xsna.n6j;
import xsna.xe9;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zzpd extends zzpp {
    private final zzlc zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzli zzf;
    private final int zzg;

    public /* synthetic */ zzpd(zzlc zzlcVar, String str, boolean z, boolean z2, ModelType modelType, zzli zzliVar, int i, zzpc zzpcVar) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = modelType;
        this.zzf = zzliVar;
        this.zzg = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpp) {
            zzpp zzppVar = (zzpp) obj;
            if (this.zza.equals(zzppVar.zzc()) && this.zzb.equals(zzppVar.zze()) && this.zzc == zzppVar.zzg() && this.zzd == zzppVar.zzf() && this.zze.equals(zzppVar.zzb()) && this.zzf.equals(zzppVar.zzd()) && this.zzg == zzppVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        return (((((((((hashCode * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        boolean z = this.zzc;
        boolean z2 = this.zzd;
        String obj2 = this.zze.toString();
        String obj3 = this.zzf.toString();
        int i = this.zzg;
        StringBuilder a = xe9.a("RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=", str, ", shouldLogRoughDownloadTime=");
        gsi0.c(a, z, ", shouldLogExactDownloadTime=", z2, ", modelType=");
        n6j.b(a, obj2, ", downloadStatus=", obj3, ", failureStatusCode=");
        return h5s.c(i, "}", a);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final zzlc zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final zzli zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final boolean zzg() {
        return this.zzc;
    }
}
