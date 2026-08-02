package com.google.android.gms.internal.cast;

import android.widget.ProgressBar;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdc extends UIController {
    public final ProgressBar b;

    public zzdc(ProgressBar progressBar) {
        this.b = progressBar;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        RemoteMediaClient remoteMediaClient = this.a;
        ProgressBar progressBar = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.l()) {
            progressBar.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void c() {
        this.b.setVisibility(0);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        ProgressBar progressBar = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.l()) {
            progressBar.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setVisibility(8);
        this.a = null;
    }
}
