package com.google.android.gms.internal.cast;

import java.util.Objects;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzdf extends dz9.c {
    final /* synthetic */ zzdg zza;

    public zzdf(zzdg zzdgVar) {
        Objects.requireNonNull(zzdgVar);
        this.zza = zzdgVar;
    }

    @Override // xsna.dz9.c
    public final void onVolumeChanged() {
        this.zza.zza();
    }
}
