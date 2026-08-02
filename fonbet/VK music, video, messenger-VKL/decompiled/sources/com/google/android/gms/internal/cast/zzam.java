package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import java.util.Objects;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzam extends zzag {
    final /* synthetic */ ehz zza;

    public zzam(zzav zzavVar, ehz ehzVar) {
        this.zza = ehzVar;
        Objects.requireNonNull(zzavVar);
    }

    @Override // com.google.android.gms.internal.cast.zzah
    public final void zzb(DeviceSuggestionResult deviceSuggestionResult) {
        this.zza.c(new zzak(this, deviceSuggestionResult));
    }

    @Override // com.google.android.gms.internal.cast.zzah
    public final void zzc(DeviceSuggestionResult deviceSuggestionResult) {
        this.zza.c(new zzal(this, deviceSuggestionResult));
    }
}
