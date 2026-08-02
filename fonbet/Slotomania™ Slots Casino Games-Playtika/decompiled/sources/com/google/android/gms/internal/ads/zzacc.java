package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzacc implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    zzacc(zzace zzaceVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzaceVar);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }
}
