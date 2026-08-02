package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdo extends UIController {
    public final TextView b;

    public zzdo(TextView textView) {
        this.b = textView;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        MediaInfo f;
        MediaMetadata mediaMetadata;
        String a;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || (f = remoteMediaClient.f()) == null || (mediaMetadata = f.d) == null || (a = com.google.android.gms.cast.framework.media.internal.zzt.a(mediaMetadata)) == null) {
            return;
        }
        this.b.setText(a);
    }
}
