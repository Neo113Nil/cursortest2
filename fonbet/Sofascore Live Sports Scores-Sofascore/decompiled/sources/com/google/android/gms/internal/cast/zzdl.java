package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdl extends UIController implements RemoteMediaClient.ProgressListener {
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 0L);
        }
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        this.a = null;
        f();
    }

    public final void f() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            throw null;
        }
    }
}
