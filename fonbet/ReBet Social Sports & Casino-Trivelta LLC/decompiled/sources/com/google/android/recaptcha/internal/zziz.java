package com.google.android.recaptcha.internal;

import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zziz extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziz(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (Ph.h1.c(ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r6.zzx(r5) != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.zzb;
        try {
        } catch (Exception e10) {
            e10.getMessage();
            zzbd zza = zzf.zza(e10, new zzbd(zzbb.zzb, zzba.zzV, e10.getMessage()));
            zzcb zzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzm.zzc(zzjeVar, this) != coroutine_suspended) {
                zzbdVar = zza;
            }
            return coroutine_suspended;
        }
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                zzbdVar = (zzbd) this.zza;
                ResultKt.throwOnFailure(obj);
                this.zzd.zzb(zzbdVar);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
