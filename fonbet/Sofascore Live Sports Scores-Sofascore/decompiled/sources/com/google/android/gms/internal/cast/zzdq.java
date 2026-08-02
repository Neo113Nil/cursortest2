package com.google.android.gms.internal.cast;

import android.text.format.DateUtils;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdq extends zzdr implements RemoteMediaClient.ProgressListener {
    public boolean c;

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void b(long j, long j2) {
        if (this.c) {
            if (j == -1000) {
                j = j2;
            }
            DateUtils.formatElapsedTime(j / 1000);
            throw null;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient != null) {
            remoteMediaClient.b(this, 0L);
            if (!remoteMediaClient.k()) {
                throw null;
            }
            DateUtils.formatElapsedTime(remoteMediaClient.d() / 1000);
            throw null;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void f(long j) {
        DateUtils.formatElapsedTime(j / 1000);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzdr
    public final void g(boolean z) {
        this.c = z;
    }
}
