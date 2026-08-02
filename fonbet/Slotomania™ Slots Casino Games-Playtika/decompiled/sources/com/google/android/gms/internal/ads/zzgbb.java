package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzgbb extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbb(zzgad zzgadVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgadVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgbb zzgbbVar = new zzgbb(this.zzb, continuation);
        zzgbbVar.zza = obj;
        return zzgbbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbb) create((zzgah) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzgaj zza = zzgai.zza((zzgaf) ((zzgah) this.zza).zzcc());
        zzigx zzb = zza.zzb();
        zzgad zzgadVar = this.zzb;
        String zza2 = zzgadVar.zza();
        Intrinsics.checkNotNullExpressionValue(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzgadVar);
        return zza.zza();
    }
}
