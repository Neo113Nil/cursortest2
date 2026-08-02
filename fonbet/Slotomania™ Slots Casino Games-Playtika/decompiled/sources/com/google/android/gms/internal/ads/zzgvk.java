package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgvk extends zzgvm {
    zzgvk() {
        super(null);
    }

    static final zzgvm zzf(int i) {
        zzgvm zzgvmVar;
        zzgvm zzgvmVar2;
        zzgvm zzgvmVar3;
        if (i < 0) {
            zzgvmVar3 = zzgvm.zzb;
            return zzgvmVar3;
        }
        if (i > 0) {
            zzgvmVar2 = zzgvm.zzc;
            return zzgvmVar2;
        }
        zzgvmVar = zzgvm.zza;
        return zzgvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zze() {
        return 0;
    }
}
