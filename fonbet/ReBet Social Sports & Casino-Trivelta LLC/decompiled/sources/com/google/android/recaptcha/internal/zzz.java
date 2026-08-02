package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzz {
    @NotNull
    public static final zzaa zza(@NotNull zzy zzyVar, @NotNull zzti zztiVar) {
        zztf zztfVar = (zztf) zztiVar.zzr();
        zztfVar.zzq(zzyVar.zza());
        return new zzx(zzyVar.zza(), (zzti) zztfVar.zzk());
    }

    @NotNull
    public static final zzen zzb(@NotNull zzy zzyVar, @NotNull String str) {
        zzek zzb = zzyVar.zzb();
        zzb.zzc(str);
        zzb.zzb(zzyVar.zza());
        return zzb.zzf(37);
    }

    @NotNull
    public static final zzen zzc(@NotNull zzy zzyVar) {
        zzek zzb = zzyVar.zzb();
        zzb.zzc(zzyVar.zzb().zzd());
        zzb.zzb(zzyVar.zza());
        return zzb.zzf(36);
    }
}
