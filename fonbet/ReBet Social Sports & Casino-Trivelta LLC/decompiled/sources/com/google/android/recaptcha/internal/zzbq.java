package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzbq {

    @NotNull
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (Ph.AbstractC1440a0.a(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ae -> B:11:0x003f). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(@NotNull Function1 function1, long j10, long j11, double d10, @NotNull Function1 function12, @NotNull Continuation continuation) {
        zzbp zzbpVar;
        int i10;
        long j12;
        long j13;
        double d11;
        Function1 function13;
        zzbp zzbpVar2;
        Function1 function14;
        Function1 function15;
        long j14;
        double d12;
        Exception e10;
        if (continuation instanceof zzbp) {
            zzbpVar = (zzbp) continuation;
            int i11 = zzbpVar.zzh;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i11 - Integer.MIN_VALUE;
                Object obj = zzbpVar.zzf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzbpVar.zzh;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    j12 = j10;
                    j13 = j11;
                    d11 = d10;
                    function13 = function12;
                    zzbpVar2 = zzbpVar;
                    function14 = function1;
                    zzbpVar2.zza = function14;
                    zzbpVar2.zzb = function13;
                    zzbpVar2.zzc = j13;
                    zzbpVar2.zze = d11;
                    zzbpVar2.zzd = j12;
                    zzbpVar2.zzh = 1;
                    Object invoke = function13.invoke(zzbpVar2);
                    if (invoke != coroutine_suspended) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = zzbpVar.zzd;
                        d12 = zzbpVar.zze;
                        j14 = zzbpVar.zzc;
                        function13 = (Function1) zzbpVar.zzb;
                        function15 = (Function1) zzbpVar.zza;
                        ResultKt.throwOnFailure(obj);
                        Function1 function16 = function15;
                        zzbpVar2 = zzbpVar;
                        function14 = function16;
                        long j15 = j14;
                        d11 = d12;
                        j13 = j15;
                        try {
                        } catch (Exception e11) {
                            e10 = e11;
                            zzbp zzbpVar3 = zzbpVar2;
                            function15 = function14;
                            zzbpVar = zzbpVar3;
                            double d13 = d11;
                            j14 = j13;
                            d12 = d13;
                            if (((Boolean) function15.invoke(e10)).booleanValue()) {
                            }
                        }
                        zzbpVar2.zza = function14;
                        zzbpVar2.zzb = function13;
                        zzbpVar2.zzc = j13;
                        zzbpVar2.zze = d11;
                        zzbpVar2.zzd = j12;
                        zzbpVar2.zzh = 1;
                        Object invoke2 = function13.invoke(zzbpVar2);
                        return invoke2 != coroutine_suspended ? coroutine_suspended : invoke2;
                    }
                    j12 = zzbpVar.zzd;
                    d12 = zzbpVar.zze;
                    j14 = zzbpVar.zzc;
                    function13 = (Function1) zzbpVar.zzb;
                    function15 = (Function1) zzbpVar.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Exception e12) {
                        e10 = e12;
                        if (((Boolean) function15.invoke(e10)).booleanValue()) {
                            throw e10;
                        }
                        j12 = RangesKt.coerceAtMost((long) (j12 * d12), j14);
                        zzbpVar.zza = function15;
                        zzbpVar.zzb = function13;
                        zzbpVar.zzc = j14;
                        zzbpVar.zze = d12;
                        zzbpVar.zzd = j12;
                        zzbpVar.zzh = 2;
                    }
                }
            }
        }
        zzbpVar = new zzbp(this, continuation);
        Object obj2 = zzbpVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzbpVar.zzh;
        if (i10 != 0) {
        }
    }
}
