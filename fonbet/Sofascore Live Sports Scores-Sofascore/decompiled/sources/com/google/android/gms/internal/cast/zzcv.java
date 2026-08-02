package com.google.android.gms.internal.cast;

import android.widget.ImageView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcv extends UIController implements RemoteMediaClient.ProgressListener {
    public final ImageView b;
    public final com.google.android.gms.cast.framework.media.uicontroller.zza c;

    public zzcv(ImageView imageView, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.b = imageView;
        this.c = zzaVar;
        imageView.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void c() {
        this.b.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 1000L);
        }
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.u(this);
        }
        this.b.setEnabled(false);
        this.a = null;
        f();
    }

    public final void f() {
        RemoteMediaClient remoteMediaClient = this.a;
        ImageView imageView = this.b;
        boolean z = false;
        if (remoteMediaClient == null || !remoteMediaClient.k() || remoteMediaClient.q()) {
            imageView.setEnabled(false);
            return;
        }
        if (!remoteMediaClient.m()) {
            imageView.setEnabled(true);
            return;
        }
        if (remoteMediaClient.B()) {
            com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.c;
            if (!zzaVar.d(zzaVar.g() + zzaVar.c())) {
                z = true;
            }
        }
        imageView.setEnabled(z);
    }
}
