package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdd extends UIController {
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            return;
        }
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = remoteMediaClient.h();
        MediaQueueItem Z0 = h == null ? null : h.Z0(h.m);
        if (Z0 != null && (mediaInfo = Z0.a) != null && mediaInfo.d != null) {
            throw null;
        }
    }
}
