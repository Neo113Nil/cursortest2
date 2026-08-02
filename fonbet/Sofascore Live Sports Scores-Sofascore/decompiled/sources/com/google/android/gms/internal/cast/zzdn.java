package com.google.android.gms.internal.cast;

import android.widget.ImageView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdn extends UIController {
    public final ImageView b;

    public zzdn(ImageView imageView) {
        this.b = imageView;
        imageView.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void c() {
        this.b.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setEnabled(false);
        this.a = null;
    }

    public final void f() {
        RemoteMediaClient remoteMediaClient = this.a;
        ImageView imageView = this.b;
        if (remoteMediaClient == null || !remoteMediaClient.D() || remoteMediaClient.q()) {
            imageView.setVisibility(0);
            imageView.setEnabled(false);
        } else {
            imageView.setVisibility(0);
            imageView.setEnabled(true);
        }
    }
}
