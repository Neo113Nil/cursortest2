package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
public abstract class zzei extends zzeg implements zzeu {
    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd().zzb(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public /* bridge */ /* synthetic */ Future zzc() {
        throw null;
    }

    public abstract zzeu zzd();
}
