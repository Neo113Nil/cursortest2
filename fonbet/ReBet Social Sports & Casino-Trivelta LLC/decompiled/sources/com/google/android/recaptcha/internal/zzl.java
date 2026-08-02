package com.google.android.recaptcha.internal;

import Ph.Q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzl {

    @NotNull
    private final List zza;

    @Nullable
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        CollectionsKt.addAll(this.zza, zzeVarArr);
    }

    @Nullable
    public final Object zzb(@NotNull String str, long j10, @NotNull Continuation continuation) {
        return Q.g(new zzh(this, str, j10, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j10, @NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull Continuation continuation) {
        zzi zziVar;
        int i10;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i11 = zziVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zziVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzk zzkVar = new zzk(this, zzekVar, j10, zzscVar, null);
                    zziVar.zzc = 1;
                    obj = Q.g(zzkVar, zziVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zziVar = new zzi(this, continuation);
        Object obj2 = zziVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zziVar.zzc;
        if (i10 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @NotNull
    public final List zzd() {
        return this.zza;
    }

    public final void zzf(@NotNull zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(@NotNull zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List emptyList = CollectionsKt.emptyList();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) emptyList.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
