package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final /* synthetic */ class zzgsa extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public static final zzgsa zza = new zzgsa();

    zzgsa() {
        super(2, zzgsc.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object zzd;
        zzd = zzgsc.zzd((Mutex) obj, (Continuation) obj2);
        return zzd;
    }
}
