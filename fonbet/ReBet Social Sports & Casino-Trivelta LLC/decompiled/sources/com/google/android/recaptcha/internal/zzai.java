package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.P;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        P p10;
        zzan zzanVar = this.zza;
        p10 = zzanVar.zzb;
        AbstractC1459k.d(p10, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
