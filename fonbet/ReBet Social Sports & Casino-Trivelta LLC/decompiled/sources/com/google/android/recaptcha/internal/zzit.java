package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class zzit extends Lambda implements Function0 {
    public static final zzit zza = new zzit();

    public zzit() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzbr.class.getName().hashCode());
        if (zzb != null) {
            return (zzbr) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
