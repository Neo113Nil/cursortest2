package com.google.android.gms.internal.mlkit_common;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzz {
    private final String zza;
    private final zzx zzb;
    private zzx zzc;

    public /* synthetic */ zzz(String str, zzy zzyVar) {
        zzx zzxVar = new zzx(null);
        this.zzb = zzxVar;
        this.zzc = zzxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzx zzxVar = this.zzb.zzc;
        String str = "";
        while (zzxVar != null) {
            Object obj = zzxVar.zzb;
            sb.append(str);
            String str2 = zzxVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append(B5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzxVar = zzxVar.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzz zza(String str, Object obj) {
        zzx zzxVar = new zzx(null);
        this.zzc.zzc = zzxVar;
        this.zzc = zzxVar;
        zzxVar.zzb = obj;
        zzxVar.zza = str;
        return this;
    }

    public final zzz zzb(String str, boolean z) {
        String valueOf = String.valueOf(z);
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = valueOf;
        zzvVar.zza = "isManifestFile";
        return this;
    }
}
