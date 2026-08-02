package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.P;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        P p10;
        zzes zzesVar = this.zza;
        p10 = zzesVar.zzd;
        AbstractC1459k.d(p10, null, null, new zzeq(zzesVar, null), 3, null);
    }
}
