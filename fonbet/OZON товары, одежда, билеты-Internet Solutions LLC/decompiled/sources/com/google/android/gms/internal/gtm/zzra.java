package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzra extends zzqw<zzqw<?>> {
    public static final zzra zzb = new zzra("BREAK");
    public static final zzra zzc = new zzra("CONTINUE");
    public static final zzra zzd = new zzra("NULL");
    public static final zzra zze = new zzra("UNDEFINED");
    private final String zzf;
    private final boolean zzg;
    private final zzqw<?> zzh;

    private zzra(String str) {
        this.zzf = str;
        this.zzg = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    /* renamed from: toString */
    public final String zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ zzqw<?> zzc() {
        return this.zzh;
    }

    public final zzqw zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public zzra(zzqw<?> zzqwVar) {
        Preconditions.checkNotNull(zzqwVar);
        this.zzf = "RETURN";
        this.zzg = true;
        this.zzh = zzqwVar;
    }
}
