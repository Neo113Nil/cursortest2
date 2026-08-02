package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzht extends zzhl {
    private final zzhv zza;

    public zzht(zzhv zzhvVar, int i) {
        super(zzhvVar.size(), i);
        this.zza = zzhvVar;
    }

    @Override // com.google.android.gms.internal.cast.zzhl
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
