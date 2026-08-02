package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class zzdp extends Lambda implements Function0 {
    public static final zzdp zza = new zzdp();

    public zzdp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzfj.class.getName().hashCode());
        if (zzb != null) {
            return (zzfj) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
