package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfao implements zzfby {
    private final Bundle zza;

    zzfao(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzfap(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 30;
    }
}
