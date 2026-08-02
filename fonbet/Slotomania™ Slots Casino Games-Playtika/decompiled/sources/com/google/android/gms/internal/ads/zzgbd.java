package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzgbd extends ContinuationImpl {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgbo zzd;
    int zze;
    String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbd(zzgbo zzgboVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzgboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzt;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzt = this.zzd.zzt(null, this);
        return zzt;
    }
}
