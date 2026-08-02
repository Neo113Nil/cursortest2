package com.google.android.recaptcha.internal;

import Ph.P;
import Ph.Q;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzae implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzan zzc;
    private boolean zzd = true;

    @NotNull
    private String zze = "";

    @NotNull
    private final zzbs zzf;

    public zzae(@NotNull zzek zzekVar, @NotNull Context context, @NotNull P p10, @NotNull zzan zzanVar, @NotNull zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull Continuation continuation) {
        return Q.g(new zzac(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r12.zze(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(@NotNull zzse zzseVar, @NotNull Continuation continuation) {
        zzad zzadVar;
        int i10;
        zzae zzaeVar;
        zzen zzenVar;
        if (continuation instanceof zzad) {
            zzadVar = (zzad) continuation;
            int i11 = zzadVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i11 - Integer.MIN_VALUE;
                Object obj = zzadVar.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzadVar.zzd;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzc = zzz.zzc(this);
                    if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
                        this.zzd = false;
                        zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
                        return Unit.INSTANCE;
                    }
                    this.zze = zzi(zzseVar.zzg());
                    zzan zzanVar = this.zzc;
                    long zzf = zzseVar.zzf();
                    zzadVar.zza = this;
                    zzadVar.zze = zzc;
                    zzadVar.zzd = 1;
                    if (zzanVar.zzd(zzf, zzadVar) != coroutine_suspended) {
                        zzaeVar = this;
                        zzenVar = zzc;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = (zzen) zzadVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzenVar.zza();
                    return Unit.INSTANCE;
                }
                zzenVar = zzadVar.zze;
                zzaeVar = (zzae) zzadVar.zza;
                ResultKt.throwOnFailure(obj);
                zzan zzanVar2 = zzaeVar.zzc;
                zzadVar.zza = zzenVar;
                zzadVar.zze = null;
                zzadVar.zzd = 2;
            }
        }
        zzadVar = new zzad(this, continuation);
        Object obj2 = zzadVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzadVar.zzd;
        if (i10 != 0) {
        }
        zzan zzanVar22 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
