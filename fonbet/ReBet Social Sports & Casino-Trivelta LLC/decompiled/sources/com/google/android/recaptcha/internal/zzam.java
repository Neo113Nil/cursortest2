package com.google.android.recaptcha.internal;

import Ph.InterfaceC1484x;
import Ph.P;
import Ph.h1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
final class zzam extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzam(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Exception e10;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            objectRef = (Ref.ObjectRef) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e11) {
                e10 = e11;
                InterfaceC1484x zzf = this.zzc.zzf();
                th2 = (Throwable) objectRef.element;
                if (th2 == null) {
                    th2 = e10;
                }
                zzf.k(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e10.getMessage()));
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, objectRef2, null);
                this.zza = objectRef2;
                this.zzb = 1;
                if (h1.c(60000L, zzalVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e12) {
                objectRef = objectRef2;
                e10 = e12;
                InterfaceC1484x zzf2 = this.zzc.zzf();
                th2 = (Throwable) objectRef.element;
                if (th2 == null) {
                }
                zzf2.k(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e10.getMessage()));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
