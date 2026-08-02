package com.google.android.recaptcha.internal;

import Ph.P;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzac extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzac(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i10 = 2;
            this.zzb = 2;
            if (e10 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                if (errorCode == -100) {
                    i10 = 44;
                } else if (errorCode == -12) {
                    i10 = 39;
                } else if (errorCode == -3) {
                    i10 = 30;
                } else if (errorCode == -2) {
                    i10 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i10 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i10 = 53;
                            break;
                        case -17:
                            i10 = 52;
                            break;
                        case -16:
                            i10 = 43;
                            break;
                        case -15:
                            i10 = 42;
                            break;
                        case -14:
                            i10 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i10 = 36;
                                    break;
                                case -8:
                                    i10 = 35;
                                    break;
                                case -7:
                                    i10 = 34;
                                    break;
                                case -6:
                                    i10 = 33;
                                    break;
                                case -5:
                                    i10 = 32;
                                    break;
                            }
                    }
                } else {
                    i10 = 28;
                }
            } else {
                i10 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i10);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj != coroutine_suspended) {
                zzyVar = zzaeVar;
            }
            return coroutine_suspended;
        }
        if (zzenVar == 0) {
            ResultKt.throwOnFailure(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                ResultKt.throwOnFailure(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            ResultKt.throwOnFailure(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}
