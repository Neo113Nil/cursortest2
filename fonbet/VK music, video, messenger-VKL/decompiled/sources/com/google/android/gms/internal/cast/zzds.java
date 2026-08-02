package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import xsna.exc0;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzds extends twp0 {
    private final View zza;
    private final int zzb;

    public zzds(View view, int i) {
        this.zza = view;
        this.zzb = i;
    }

    private final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            this.zza.setVisibility(this.zzb);
            return;
        }
        MediaStatus h = remoteMediaClient.h();
        exc0.i(h);
        if (h.n == 0) {
            this.zza.setVisibility(this.zzb);
        } else {
            this.zza.setVisibility(0);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zza.setVisibility(this.zzb);
        super.onSessionEnded();
    }
}
