package com.google.android.gms.internal.cast;

import android.widget.ProgressBar;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdi extends twp0 implements lvf0.d {
    private final ProgressBar zza;
    private final long zzb;

    public zzdi(ProgressBar progressBar, long j) {
        this.zza = progressBar;
        this.zzb = j;
        progressBar.setMax(1);
        progressBar.setProgress(0);
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // xsna.lvf0.d
    public final void onProgressUpdated(long j, long j2) {
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, this.zzb);
        }
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.m()) {
            ProgressBar progressBar = this.zza;
            progressBar.setMax(1);
            progressBar.setProgress(0);
        } else {
            ProgressBar progressBar2 = this.zza;
            progressBar2.setMax((int) remoteMediaClient.j());
            progressBar2.setProgress((int) remoteMediaClient.d());
        }
    }
}
