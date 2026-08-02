package com.google.android.gms.internal.cast;

import android.view.View;
import xsna.g0a;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdb extends twp0 {
    private final View zza;

    public zzdb(View view) {
        this.zza = view;
        view.setEnabled(false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        this.zza.setEnabled(true);
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
