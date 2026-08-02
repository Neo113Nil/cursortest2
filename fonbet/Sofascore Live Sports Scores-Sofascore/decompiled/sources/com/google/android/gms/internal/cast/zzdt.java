package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdt extends UIController {
    public final View b;
    public final int c = 8;

    public zzdt(View view) {
        this.b = view;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        RemoteMediaClient remoteMediaClient = this.a;
        View view = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            view.setVisibility(this.c);
        } else {
            view.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        View view = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            view.setVisibility(this.c);
        } else {
            view.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setVisibility(this.c);
        this.a = null;
    }
}
