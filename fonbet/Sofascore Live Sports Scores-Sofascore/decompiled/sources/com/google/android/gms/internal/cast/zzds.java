package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzds extends UIController {
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null) {
            throw null;
        }
        if (!remoteMediaClient.k()) {
            throw null;
        }
        MediaStatus h = remoteMediaClient.h();
        Preconditions.i(h);
        if (h.m != 0) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null) {
            throw null;
        }
        if (!remoteMediaClient.k()) {
            throw null;
        }
        MediaStatus h = remoteMediaClient.h();
        Preconditions.i(h);
        if (h.m != 0) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        throw null;
    }
}
