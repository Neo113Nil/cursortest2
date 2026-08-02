package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzce extends Exception {

    @Nullable
    private final Throwable zza;

    @NotNull
    private final zztd zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzce(@NotNull int i10, @NotNull int i11, @Nullable Throwable th2) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th2;
        zztd zzf = zzte.zzf();
        zzf.zzq(i11);
        zzf.zzr(i10);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zztd zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }
}
