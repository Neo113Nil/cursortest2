package com.google.android.recaptcha.internal;

import Ph.P;
import Ph.f1;
import Ph.h1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzdg extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j10, zzsp zzspVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e10;
        zzbd e11;
        f1 e12;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (f1 e13) {
                e12 = e13;
                zzs3 = this.zzc.zzs(e12, new zzbd(zzbb.zzc, zzba.zzb, e12.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e14) {
                e11 = e14;
                zzs2 = this.zzc.zzs(e11, e11);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e15) {
                e10 = e15;
                zzs = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j10 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object c10 = h1.c(j10, zzdfVar, this);
                if (c10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzenVar = zzf;
                obj = c10;
            } catch (f1 e16) {
                zzenVar = zzf;
                e12 = e16;
                zzs3 = this.zzc.zzs(e12, new zzbd(zzbb.zzc, zzba.zzb, e12.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e17) {
                zzenVar = zzf;
                e11 = e17;
                zzs2 = this.zzc.zzs(e11, e11);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e18) {
                zzenVar = zzf;
                e10 = e18;
                zzs = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
