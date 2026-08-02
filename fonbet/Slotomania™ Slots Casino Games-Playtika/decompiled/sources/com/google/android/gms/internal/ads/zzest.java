package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzest implements zzdew {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfgz.zza(this.zza, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
