package com.google.android.gms.internal.cast;

import android.view.View;
import xsna.g0a;
import xsna.lvf0;
import xsna.twp0;
import xsna.utz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzdj extends twp0 implements lvf0.d {
    private final View zza;
    private final utz0 zzb;

    public zzdj(View view, utz0 utz0Var) {
        this.zza = view;
        this.zzb = utz0Var;
        view.setEnabled(false);
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
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        zza();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        this.zza.setEnabled(false);
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        lvf0 remoteMediaClient = getRemoteMediaClient();
        boolean z = false;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.q()) {
            this.zza.setEnabled(false);
            return;
        }
        if (!remoteMediaClient.m()) {
            this.zza.setEnabled(true);
            return;
        }
        View view = this.zza;
        if (remoteMediaClient.C()) {
            utz0 utz0Var = this.zzb;
            if ((utz0Var.f() + utz0Var.b()) - (utz0Var.f() + utz0Var.d()) >= 10000) {
                z = true;
            }
        }
        view.setEnabled(z);
    }
}
