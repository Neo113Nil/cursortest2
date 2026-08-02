package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import java.util.Objects;
import xsna.ehz;
import xsna.o100;
import xsna.t6m;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzak implements ehz.b {
    final /* synthetic */ DeviceSuggestionResult zza;

    public zzak(zzam zzamVar, DeviceSuggestionResult deviceSuggestionResult) {
        this.zza = deviceSuggestionResult;
        Objects.requireNonNull(zzamVar);
    }

    @Override // xsna.ehz.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((t6m) obj).b();
    }

    @Override // xsna.ehz.b
    public final void onNotifyListenerFailed() {
        o100 o100Var;
        o100Var = zzav.zzd;
        o100Var.c("Failed to notify listener for onDeviceSuggestionReceived", new Object[0]);
    }
}
