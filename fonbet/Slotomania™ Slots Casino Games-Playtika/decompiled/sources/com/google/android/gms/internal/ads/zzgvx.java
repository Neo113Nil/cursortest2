package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgvx extends zzgtw {
    private final zzgvz zza;

    zzgvx(zzgvz zzgvzVar, int i) {
        super(zzgvzVar.size(), i);
        this.zza = zzgvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
