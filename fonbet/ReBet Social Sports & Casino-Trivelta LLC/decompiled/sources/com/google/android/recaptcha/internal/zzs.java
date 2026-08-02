package com.google.android.recaptcha.internal;

import Ph.AbstractC1449f;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzs extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, continuation);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        C0 d10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i10 == 0) {
            P p10 = (P) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                d10 = AbstractC1459k.d(p10, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, null);
                arrayList2.add(d10);
            }
            C0[] c0Arr = (C0[]) arrayList2.toArray(new C0[0]);
            C0[] c0Arr2 = (C0[]) Arrays.copyOf(c0Arr, c0Arr.length);
            this.zza = 1;
            if (AbstractC1449f.c(c0Arr2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Result.Companion companion = Result.INSTANCE;
        zzq = this.zzb.zzq(this.zzc);
        return Result.m146boximpl(Result.m147constructorimpl(zzq));
    }
}
