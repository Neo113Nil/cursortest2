package com.google.android.recaptcha.internal;

import Wh.a;
import Wh.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzcb {
    private Object zza;

    @NotNull
    private final a zzb = g.b(false, 1, null);

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, @NotNull Continuation continuation) {
        zzby zzbyVar;
        int i10;
        a aVar;
        zzcb zzcbVar;
        try {
            if (continuation instanceof zzby) {
                zzbyVar = (zzby) continuation;
                int i11 = zzbyVar.zzd;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzbyVar.zzd = i11 - Integer.MIN_VALUE;
                    Object obj2 = zzbyVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzbyVar.zzd;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        aVar = this.zzb;
                        zzbyVar.zze = this;
                        zzbyVar.zzf = (zzje) obj;
                        zzbyVar.zza = aVar;
                        zzbyVar.zzd = 1;
                        if (aVar.f(null, zzbyVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzcbVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar2 = (a) zzbyVar.zza;
                        zzje zzjeVar = zzbyVar.zzf;
                        zzcbVar = zzbyVar.zze;
                        ResultKt.throwOnFailure(obj2);
                        aVar = aVar2;
                        obj = zzjeVar;
                    }
                    return Boxing.boxBoolean(Intrinsics.areEqual(zzcbVar.zza, obj));
                }
            }
            return Boxing.boxBoolean(Intrinsics.areEqual(zzcbVar.zza, obj));
        } finally {
            aVar.g(null);
        }
        zzbyVar = new zzby(this, continuation);
        Object obj22 = zzbyVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzbyVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(@NotNull Object[] objArr, @NotNull Continuation continuation) {
        zzbz zzbzVar;
        int i10;
        a aVar;
        zzcb zzcbVar;
        try {
            if (continuation instanceof zzbz) {
                zzbzVar = (zzbz) continuation;
                int i11 = zzbzVar.zzd;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzbzVar.zzd = i11 - Integer.MIN_VALUE;
                    Object obj = zzbzVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzbzVar.zzd;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = this.zzb;
                        zzbzVar.zze = this;
                        zzbzVar.zzf = (zzje[]) objArr;
                        zzbzVar.zza = aVar;
                        zzbzVar.zzd = 1;
                        if (aVar.f(null, zzbzVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzcbVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar2 = (a) zzbzVar.zza;
                        zzje[] zzjeVarArr = zzbzVar.zzf;
                        zzcbVar = zzbzVar.zze;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar2;
                        objArr = zzjeVarArr;
                    }
                    return Boxing.boxBoolean(ArraysKt.contains(objArr, zzcbVar.zza));
                }
            }
            return Boxing.boxBoolean(ArraysKt.contains(objArr, zzcbVar.zza));
        } finally {
            aVar.g(null);
        }
        zzbzVar = new zzbz(this, continuation);
        Object obj2 = zzbzVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzbzVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, @NotNull Continuation continuation) {
        zzca zzcaVar;
        int i10;
        a aVar;
        zzcb zzcbVar;
        try {
            if (continuation instanceof zzca) {
                zzcaVar = (zzca) continuation;
                int i11 = zzcaVar.zzd;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzcaVar.zzd = i11 - Integer.MIN_VALUE;
                    Object obj2 = zzcaVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzcaVar.zzd;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        aVar = this.zzb;
                        zzcaVar.zze = this;
                        zzcaVar.zzf = (zzje) obj;
                        zzcaVar.zza = aVar;
                        zzcaVar.zzd = 1;
                        if (aVar.f(null, zzcaVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzcbVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar2 = (a) zzcaVar.zza;
                        zzje zzjeVar = zzcaVar.zzf;
                        zzcbVar = zzcaVar.zze;
                        ResultKt.throwOnFailure(obj2);
                        aVar = aVar2;
                        obj = zzjeVar;
                    }
                    zzcbVar.zza = obj;
                    Unit unit = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
            }
            zzcbVar.zza = obj;
            Unit unit2 = Unit.INSTANCE;
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
        zzcaVar = new zzca(this, continuation);
        Object obj22 = zzcaVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcaVar.zzd;
        if (i10 != 0) {
        }
    }
}
