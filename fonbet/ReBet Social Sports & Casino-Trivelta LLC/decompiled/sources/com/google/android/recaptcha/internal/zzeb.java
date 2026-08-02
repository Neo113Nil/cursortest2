package com.google.android.recaptcha.internal;

import Ph.InterfaceC1484x;
import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzeb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC1484x zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC1484x interfaceC1484x, long j10, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
        this.zzc = interfaceC1484x;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzeb(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzci zzciVar;
        zzbd e10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            try {
                ResultKt.throwOnFailure(obj);
                zzebVar = this;
            } catch (zzbd e11) {
                zzbdVar = e11;
                zzebVar = this;
                zzec zzecVar = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar.zzf = zzciVar;
                zzebVar.zzc.k(zzbdVar);
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (zzbd e12) {
                    e10 = e12;
                    zzbdVar = e10;
                    zzec zzecVar2 = zzebVar.zzb;
                    zzciVar = zzcm.zzd;
                    zzecVar2.zzf = zzciVar;
                    zzebVar.zzc.k(zzbdVar);
                    return Unit.INSTANCE;
                }
            } catch (zzbd e13) {
                e10 = e13;
                zzebVar = this;
                zzbdVar = e10;
                zzec zzecVar22 = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar22.zzf = zzciVar;
                zzebVar.zzc.k(zzbdVar);
                return Unit.INSTANCE;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.INSTANCE;
    }
}
