package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgip extends zzgik {
    private final DisplayMetrics zza;
    private final View zzb;

    zzgip(zzaxf zzaxfVar, zzghg zzghgVar, DisplayMetrics displayMetrics, View view, zzgpu zzgpuVar) {
        super("m32trfefsHf6wWx1xdEw1mUC1D9AoGGYGQTzPIk/NmCEVKjWhdoUc1wLYHPz/Hjg", "ee17EF8QfsLpUNArPEzfX1HuyyKq/mGCnHh3OtrInIw=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke("", this.zza, view);
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        zzayd zza = zzaye.zza();
        zza.zzb(lArr[2].longValue());
        zza.zzc(lArr[1].longValue());
        zza.zzd(lArr[0].longValue());
        zza.zza(lArr[3].longValue());
        zza.zze(lArr[4].longValue());
        zzaxfVar.zzM((zzaye) zza.zzbu());
    }
}
