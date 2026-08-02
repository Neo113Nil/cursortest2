package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzghz extends zzgik {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzghz(zzaxf zzaxfVar, zzghg zzghgVar, zzgpu zzgpuVar) {
        super("gq7wVzpH4PA7QYqAIJHaD8z8vNhLTT1MWlA6dHiOlNZFVbInjfwqq07T3Yaw95dW", "MjrNeq7DqxoL90oV2N4Wjq8mKFeExL5fhG0EADlH1Ok=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    Long l = (Long) method.invoke("", new Object[0]);
                    if (l == null) {
                        throw null;
                    }
                    Long l2 = l;
                    zza = l;
                }
            }
        }
        synchronized (zzaxfVar) {
            if (zza != null) {
                zzaxfVar.zzm(zza.longValue());
            }
        }
    }
}
