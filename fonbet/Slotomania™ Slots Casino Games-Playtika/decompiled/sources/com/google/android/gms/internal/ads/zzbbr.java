package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbbr extends BroadcastReceiver {
    final /* synthetic */ zzbbs zza;

    zzbbr(zzbbs zzbbsVar) {
        Objects.requireNonNull(zzbbsVar);
        this.zza = zzbbsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
