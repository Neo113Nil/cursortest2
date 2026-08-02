package com.google.android.recaptcha.internal;

import Ph.f1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzf {
    @NotNull
    public static final zzbd zza(@NotNull Exception exc, @NotNull zzbd zzbdVar) {
        return exc instanceof f1 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
