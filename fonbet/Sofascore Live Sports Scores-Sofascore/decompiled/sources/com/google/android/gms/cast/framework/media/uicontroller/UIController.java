package com.google.android.gms.cast.framework.media.uicontroller;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class UIController {
    public RemoteMediaClient a;

    public void d(CastSession castSession) {
        this.a = castSession != null ? castSession.k() : null;
    }

    public void e() {
        this.a = null;
    }

    public void a() {
    }

    public void c() {
    }
}
