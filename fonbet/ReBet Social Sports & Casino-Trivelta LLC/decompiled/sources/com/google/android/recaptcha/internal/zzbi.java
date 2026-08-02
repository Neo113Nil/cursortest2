package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.AbstractC1481v0;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbi {

    @NotNull
    private final P zza = Q.b();

    @NotNull
    private final P zzb;

    @NotNull
    private final P zzc;

    @NotNull
    private final P zzd;

    public zzbi() {
        P a10 = Q.a(AbstractC1481v0.c(Executors.newSingleThreadExecutor()));
        AbstractC1459k.d(a10, null, null, new zzbh(null), 3, null);
        this.zzb = a10;
        this.zzc = Q.a(C1452g0.b());
        P a11 = Q.a(AbstractC1481v0.c(Executors.newSingleThreadExecutor()));
        AbstractC1459k.d(a11, null, null, new zzbg(null), 3, null);
        this.zzd = a11;
    }

    @NotNull
    public final P zza() {
        return this.zzc;
    }

    @NotNull
    public final P zzb() {
        return this.zza;
    }

    @NotNull
    public final P zzc() {
        return this.zzd;
    }

    @NotNull
    public final P zzd() {
        return this.zzb;
    }
}
