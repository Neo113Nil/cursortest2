package com.google.android.gms.internal.cast;

import android.view.View;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdn extends twp0 {
    private final View zza;
    private final int zzb;

    public zzdn(View view, int i) {
        this.zza = view;
        this.zzb = i;
        view.setEnabled(false);
    }

    private final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.E() || remoteMediaClient.q()) {
            View view = this.zza;
            view.setVisibility(this.zzb);
            view.setEnabled(false);
        } else {
            View view2 = this.zza;
            view2.setVisibility(0);
            view2.setEnabled(true);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
