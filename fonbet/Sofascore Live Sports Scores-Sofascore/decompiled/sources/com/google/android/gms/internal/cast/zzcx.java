package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcx extends UIController {
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        MediaInfo mediaInfo;
        MediaMetadata mediaMetadata;
        List list;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null) {
            throw null;
        }
        if (!remoteMediaClient.k()) {
            throw null;
        }
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = remoteMediaClient.h();
        MediaQueueItem Z0 = h == null ? null : h.Z0(h.m);
        ((Z0 == null || (mediaInfo = Z0.a) == null || (mediaMetadata = mediaInfo.d) == null || (list = mediaMetadata.a) == null || list.size() <= 0) ? null : ((WebImage) list.get(0)).b).getClass();
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        throw null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        throw null;
    }
}
