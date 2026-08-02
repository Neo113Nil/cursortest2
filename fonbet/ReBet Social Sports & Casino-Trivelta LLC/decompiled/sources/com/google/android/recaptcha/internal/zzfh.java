package com.google.android.recaptcha.internal;

import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzfh extends SuspendLambda implements Function2 {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfh(this.zza, this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVar.zzc();
                    zzewVar.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVar.zza(zzsr.zzi());
                    zzewVar.zzd();
                    return zzsrVar;
                } catch (zzbd e10) {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e11.getMessage());
            }
        } catch (Throwable th2) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th2;
        }
    }
}
