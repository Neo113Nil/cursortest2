package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
@TargetApi(16)
/* loaded from: classes12.dex */
final class zzgv extends zzgw {
    private final Choreographer zza = Choreographer.getInstance();

    @Override // com.google.android.gms.internal.cast.zzgw
    public final void zza(zzgt zzgtVar) {
        this.zza.postFrameCallback(zzgtVar.zzb());
    }
}
