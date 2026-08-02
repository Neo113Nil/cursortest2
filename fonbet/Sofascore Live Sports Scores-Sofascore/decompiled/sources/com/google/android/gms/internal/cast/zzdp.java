package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdp extends UIController implements RemoteMediaClient.ProgressListener {
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f(true);
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        f(false);
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        f(true);
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        throw null;
    }

    public final void f(boolean z) {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null) {
            throw null;
        }
        if (!remoteMediaClient.k()) {
            throw null;
        }
        if (remoteMediaClient.m()) {
            throw null;
        }
        if (!z) {
            throw null;
        }
        remoteMediaClient.j();
        throw null;
    }
}
