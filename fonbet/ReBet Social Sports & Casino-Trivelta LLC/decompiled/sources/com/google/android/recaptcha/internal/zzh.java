package com.google.android.recaptcha.internal;

import Ph.AbstractC1449f;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
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
final class zzh extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j10, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, continuation);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        Object a10;
        zzen zzenVar2;
        X b10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            ResultKt.throwOnFailure(obj);
            a10 = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    b10 = AbstractC1459k.b(p10, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null);
                    arrayList.add(b10);
                }
            }
            X[] xArr = (X[]) arrayList.toArray(new X[0]);
            X[] xArr2 = (X[]) Arrays.copyOf(xArr, xArr.length);
            this.zze = zzenVar;
            this.zza = 1;
            a10 = AbstractC1449f.a(xArr2, this);
            if (a10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzenVar2 = zzenVar;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) a10).iterator();
        while (it.hasNext()) {
            Object value = ((Result) it.next()).getValue();
            if (Result.m154isSuccessimpl(value)) {
                zzf.zzh((zzsi) value);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
