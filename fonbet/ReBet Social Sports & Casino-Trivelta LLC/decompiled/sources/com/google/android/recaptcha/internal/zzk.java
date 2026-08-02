package com.google.android.recaptcha.internal;

import Ph.AbstractC1449f;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
final class zzk extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j10, zzsc zzscVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j10;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, continuation);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a10;
        zzen zzenVar;
        X b10;
        Object m147constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            ResultKt.throwOnFailure(obj);
            a10 = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                b10 = AbstractC1459k.b(p10, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null);
                arrayList.add(b10);
            }
            X[] xArr = (X[]) arrayList.toArray(new X[0]);
            X[] xArr2 = (X[]) Arrays.copyOf(xArr, xArr.length);
            this.zzf = zzf;
            this.zza = 1;
            a10 = AbstractC1449f.a(xArr2, this);
            if (a10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzenVar = zzf;
        }
        List list = (List) a10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Result.m153isFailureimpl(((Result) it2.next()).getValue())) {
                    zzenVar.zza();
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        Result.Companion companion = Result.INSTANCE;
        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(zzbdVar));
        return Result.m146boximpl(m147constructorimpl);
    }
}
