package com.google.android.recaptcha.internal;

import Ph.Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzfj {

    @NotNull
    private final Lazy zza;

    public zzfj() {
        int i10 = zzav.zza;
        this.zza = LazyKt.lazy(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        zzfg zzfgVar;
        int i10;
        if (continuation instanceof zzfg) {
            zzfgVar = (zzfg) continuation;
            int i11 = zzfgVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzfgVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzfgVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
                zzfgVar.zzc = 1;
                Object g10 = Q.g(zzfhVar, zzfgVar);
                return g10 == coroutine_suspended ? coroutine_suspended : g10;
            }
        }
        zzfgVar = new zzfg(zzfjVar, continuation);
        Object obj2 = zzfgVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzfgVar.zzc;
        if (i10 == 0) {
        }
    }

    @Nullable
    public final Object zzb(@NotNull zzbr zzbrVar, @NotNull zzsp zzspVar, @NotNull Continuation continuation) {
        return zzc(this, zzbrVar, zzspVar, continuation);
    }
}
