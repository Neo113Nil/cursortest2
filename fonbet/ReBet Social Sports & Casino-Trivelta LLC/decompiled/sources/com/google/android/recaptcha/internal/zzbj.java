package com.google.android.recaptcha.internal;

import kotlin.comparisons.ComparisonsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return "avgExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, (Object) null) + " us| maxExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzc), 10, (char) 0, 2, (Object) null) + " us| totalTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb), 10, (char) 0, 2, (Object) null) + " us| #Usages: " + StringsKt.padEnd$default(String.valueOf(this.zza), 5, (char) 0, 2, (Object) null);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        return ComparisonsKt.compareValues(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
