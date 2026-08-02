package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzewa implements zzfbw {
    private final boolean zza;

    public zzewa(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putBoolean("ibrr", this.zza);
    }
}
