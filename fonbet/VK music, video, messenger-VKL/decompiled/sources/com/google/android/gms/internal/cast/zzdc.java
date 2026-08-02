package com.google.android.gms.internal.cast;

import android.view.View;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdc extends twp0 {
    private final View zza;

    public zzdc(View view) {
        this.zza = view;
    }

    private final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.l()) {
            this.zza.setVisibility(0);
        } else {
            this.zza.setVisibility(8);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSendingRemoteMediaRequest() {
        this.zza.setVisibility(0);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setVisibility(8);
        super.onSessionEnded();
    }
}
