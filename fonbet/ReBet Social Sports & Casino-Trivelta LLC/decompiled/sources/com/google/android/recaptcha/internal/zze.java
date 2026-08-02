package com.google.android.recaptcha.internal;

import Ph.h1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class zze {
    private boolean zza;

    @Nullable
    public zzen zza(@NotNull String str) {
        throw null;
    }

    @Nullable
    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(4:22|23|24|25))(5:46|47|48|(1:50)|21)|26|27|(1:29)|30|31))|54|6|7|(0)(0)|26|27|(0)|30|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        if (r0 != r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r4.zzb(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        r3 = r6;
        r2 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:27:0x0088, B:29:0x0095, B:30:0x009b), top: B:26:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(@NotNull String str, long j10, @NotNull Continuation continuation) {
        zza zzaVar;
        int i10;
        zzen zza;
        Exception exc;
        long j11;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        String str3 = str;
        long j12 = j10;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i11 = zzaVar.zze;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i11 - Integer.MIN_VALUE;
                zza zzaVar2 = zzaVar;
                Object obj = zzaVar2.zzc;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzaVar2.zze;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str3, null);
                        zzaVar2.zza = this;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = zza;
                        zzaVar2.zzb = j12;
                        zzaVar2.zze = 1;
                        obj = h1.c(j12, zzbVar, zzaVar2);
                        if (obj != coroutine_suspended) {
                            zzeVar2 = this;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        j11 = j12;
                        zzenVar = zza;
                        zzeVar = this;
                        zzbd zza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str3;
                        if (zzeVar.zzi(str2, j11, exc, zzaVar2) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    long j13 = zzaVar2.zzb;
                    zzenVar = zzaVar2.zzg;
                    String str4 = zzaVar2.zzf;
                    zzeVar2 = (zze) zzaVar2.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        zza = zzenVar;
                        j12 = j13;
                        str3 = str4;
                    } catch (Exception e11) {
                        Exception e12 = e11;
                        long j14 = j13;
                        str3 = str4;
                        zzeVar = zzeVar2;
                        j11 = j14;
                        exc = e12;
                        zzbd zza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str3;
                        if (zzeVar.zzi(str2, j11, exc, zzaVar2) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Result.m147constructorimpl(obj);
                    }
                    String str5 = zzaVar2.zzf;
                    zze zzeVar3 = (zze) zzaVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    zzaVar2.zza = null;
                    zzaVar2.zzf = null;
                    zzaVar2.zze = 3;
                    obj = zzeVar3.zzd(str5, zzaVar2);
                }
                Object value = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value);
                zzsi zzsiVar = (zzsi) value;
                if (zza != null) {
                    zza.zza();
                }
                return Result.m147constructorimpl(zzsiVar);
            }
        }
        zzaVar = new zza(this, continuation);
        zza zzaVar22 = zzaVar;
        Object obj2 = zzaVar22.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzaVar22.zze;
        if (i10 != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        ResultKt.throwOnFailure(value2);
        zzsi zzsiVar2 = (zzsi) value2;
        if (zza != null) {
        }
        return Result.m147constructorimpl(zzsiVar2);
    }

    @Nullable
    public abstract Object zzd(@NotNull String str, @NotNull Continuation continuation);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:27:0x004d, B:28:0x007f, B:30:0x008e, B:31:0x0091), top: B:26:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j10, @NotNull zzsc zzscVar, @NotNull Continuation continuation) {
        zzc zzcVar;
        int i10;
        Exception e10;
        zze zzeVar;
        zzen zzenVar;
        Object obj;
        Object obj2;
        zzbd zzbdVar;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i11 = zzcVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i11 - Integer.MIN_VALUE;
                Object obj3 = zzcVar.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzcVar.zzd;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    zzen zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m147constructorimpl(Unit.INSTANCE);
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzscVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        Object c10 = h1.c(j10, zzdVar, zzcVar);
                        if (c10 != coroutine_suspended) {
                            obj = c10;
                            zzenVar = zzb;
                            zzeVar = this;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        zzeVar = this;
                        zzenVar = zzb;
                        zzeVar.zza = false;
                        zzcVar.zza = zzeVar;
                        zzcVar.zze = zzenVar;
                        zzcVar.zzd = 2;
                        Object zzj = zzeVar.zzj(e10, zzcVar);
                        obj2 = zzj;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbdVar = (zzbd) zzcVar.zza;
                        ResultKt.throwOnFailure(obj3);
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    zzenVar = zzcVar.zze;
                    zzeVar = (zze) zzcVar.zza;
                    ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    zzbd zzbdVar2 = (zzbd) obj2;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar2);
                    }
                    zzcVar.zza = zzbdVar2;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar2, zzcVar) != coroutine_suspended) {
                        zzbdVar = zzbdVar2;
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    return coroutine_suspended;
                }
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                try {
                    ResultKt.throwOnFailure(obj3);
                    obj = obj3;
                } catch (Exception e12) {
                    e10 = e12;
                    zzeVar.zza = false;
                    zzcVar.zza = zzeVar;
                    zzcVar.zze = zzenVar;
                    zzcVar.zzd = 2;
                    Object zzj2 = zzeVar.zzj(e10, zzcVar);
                    obj2 = zzj2;
                }
                ResultKt.throwOnFailure(((Result) obj).getValue());
                Unit unit = Unit.INSTANCE;
                zzeVar.zza = true;
                if (zzenVar != null) {
                    zzenVar.zza();
                }
                return Result.m147constructorimpl(unit);
            }
        }
        zzcVar = new zzc(this, continuation);
        Object obj32 = zzcVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcVar.zzd;
        if (i10 != 0) {
        }
        ResultKt.throwOnFailure(((Result) obj).getValue());
        Unit unit2 = Unit.INSTANCE;
        zzeVar.zza = true;
        if (zzenVar != null) {
        }
        return Result.m147constructorimpl(unit2);
    }

    @Nullable
    public abstract Object zzf(@NotNull String str, @NotNull Continuation continuation);

    @Nullable
    public Object zzg(@NotNull zzbd zzbdVar, @NotNull Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Nullable
    public abstract Object zzh(@NotNull zzsc zzscVar, @NotNull Continuation continuation);

    @Nullable
    public Object zzi(@NotNull String str, long j10, @NotNull Exception exc, @NotNull Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Nullable
    public Object zzj(@NotNull Exception exc, @NotNull Continuation continuation) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(@NotNull zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
