package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.X;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {

    @NotNull
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");

    @NotNull
    private final zzcn zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final zzek zzd;

    @NotNull
    private final zzbi zze;

    public zzdc(@NotNull zzcn zzcnVar, @NotNull String str, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j10, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar = !zza.matches(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j10 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j10, Continuation continuation) {
        zzcy zzcyVar;
        int i10;
        String uuid;
        zzbd zzbdVar;
        if (continuation instanceof zzcy) {
            zzcyVar = (zzcy) continuation;
            int i11 = zzcyVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzcyVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzcyVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        uuid = UUID.randomUUID().toString();
                    } catch (zzbd e10) {
                        e = e10;
                        zzbdVar = e;
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                    try {
                        Function2 zzczVar = new zzcz(this, j10, recaptchaAction, uuid, null);
                        zzcyVar.zzc = 1;
                        obj = zzg(uuid, zzczVar, zzcyVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (zzbd e11) {
                        e = e11;
                        zzbdVar = e;
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e12) {
                        zzbdVar = e12;
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                }
                return ((Result) obj).getValue();
            }
        }
        zzcyVar = new zzcy(this, continuation);
        Object obj2 = zzcyVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcyVar.zzc;
        if (i10 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Function2 function2, Continuation continuation) {
        zzdb zzdbVar;
        int i10;
        try {
            if (continuation instanceof zzdb) {
                zzdbVar = (zzdb) continuation;
                int i11 = zzdbVar.zzc;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzdbVar.zzc = i11 - Integer.MIN_VALUE;
                    Object obj = zzdbVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzdbVar.zzc;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzek zza2 = this.zzd.zza();
                        zza2.zzc(str);
                        zzen zzf = zza2.zzf(9);
                        zzdbVar.zzd = zzf;
                        zzdbVar.zzc = 1;
                        obj = function2.invoke(zza2, zzdbVar);
                        str = zzf;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzen zzenVar = zzdbVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        str = zzenVar;
                    }
                    str.zza();
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            str.zza();
            return obj;
        } catch (zzbd e10) {
            str.zzb(e10);
            throw e10;
        } catch (Exception e11) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e11.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
        zzdbVar = new zzdb(this, continuation);
        Object obj2 = zzdbVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzdbVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @Nullable
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo79execute0E7RQCE(@NotNull RecaptchaAction recaptchaAction, long j10, @NotNull Continuation<? super Result<String>> continuation) {
        zzcw zzcwVar;
        int i10;
        if (continuation instanceof zzcw) {
            zzcwVar = (zzcw) continuation;
            int i11 = zzcwVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzcwVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzcwVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcwVar.zzc = 1;
                Object zzf = zzf(recaptchaAction, j10, zzcwVar);
                return zzf == coroutine_suspended ? coroutine_suspended : zzf;
            }
        }
        zzcwVar = new zzcw(this, continuation);
        Object obj2 = zzcwVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcwVar.zzc;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @Nullable
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo80executegIAlus(@NotNull RecaptchaAction recaptchaAction, @NotNull Continuation<? super Result<String>> continuation) {
        zzcx zzcxVar;
        int i10;
        if (continuation instanceof zzcx) {
            zzcxVar = (zzcx) continuation;
            int i11 = zzcxVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzcxVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzcxVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcxVar.zzc = 1;
                Object mo79execute0E7RQCE = mo79execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
                return mo79execute0E7RQCE == coroutine_suspended ? coroutine_suspended : mo79execute0E7RQCE;
            }
        }
        zzcxVar = new zzcx(this, continuation);
        Object obj2 = zzcxVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcxVar.zzc;
        if (i10 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        X b10;
        b10 = AbstractC1459k.b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null);
        return zzas.zza(b10);
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction, long j10) {
        X b10;
        b10 = AbstractC1459k.b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j10, null), 3, null);
        return zzas.zza(b10);
    }
}
