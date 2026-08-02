package com.google.android.recaptcha.internal;

import Ph.P;
import android.app.Application;
import android.os.Build;
import com.google.android.gms.common.C3171d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzdh extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdh(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i10 != 0) {
            return obj;
        }
        zzbs zzbsVar = new zzbs(C3171d.h());
        zzr = this.zzb.zzr();
        int zza = zzbsVar.zza(zzr);
        zzdt zzdtVar = this.zzb;
        str = zzdtVar.zza;
        zzr2 = zzdtVar.zzr();
        String packageName = zzr2.getPackageName();
        zzekVar = this.zzb.zzb;
        String zzd = zzekVar.zzd();
        zzt = this.zzb.zzt();
        int i11 = Build.VERSION.SDK_INT;
        String zza2 = zzt.zza();
        zztn zzf = zzto.zzf();
        zzf.zzt(str);
        zzf.zzq(packageName);
        zzf.zzu(zza);
        zzf.zzr("18.6.1");
        zzf.zzs(zzd);
        zzf.zzf(String.valueOf(i11));
        zzf.zze(zza2);
        zzto zztoVar = (zzto) zzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzg = zzdt.zzg(zzdtVar2);
        String zzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object zzc = zzg.zzc(zzb, zztoVar, this);
        return zzc == coroutine_suspended ? coroutine_suspended : zzc;
    }
}
