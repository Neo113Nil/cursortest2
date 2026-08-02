package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.X;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzcq {

    @Nullable
    private static zzcv zza;

    @NotNull
    public static final zzcv zza(@NotNull Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    @Nullable
    public static final Object zzb(@NotNull Application application, @NotNull String str, long j10, @NotNull Continuation continuation) {
        return zzcv.zzh(zza(application), str, j10, null, null, null, continuation, 28, null);
    }

    @NotNull
    public static final Task zzc(@NotNull Application application, @NotNull String str, long j10) {
        X b10;
        b10 = AbstractC1459k.b(zza(application).zzd().zza(), null, null, new zzco(application, str, j10, null), 3, null);
        return zzas.zza(b10);
    }

    @Nullable
    public static final Object zzd(@NotNull Application application, @NotNull String str, @NotNull Continuation continuation) {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, continuation, 2, null);
        return zzh;
    }

    @NotNull
    public static final Task zze(@NotNull Application application, @NotNull String str) {
        X b10;
        b10 = AbstractC1459k.b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null);
        return zzas.zza(b10);
    }
}
