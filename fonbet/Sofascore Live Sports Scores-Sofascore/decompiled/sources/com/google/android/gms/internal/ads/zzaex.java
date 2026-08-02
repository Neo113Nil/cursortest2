package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.a8p;
import defpackage.auo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaex {
    public final Handler a;
    public final zzaey b;

    public zzaex(Handler handler, auo auoVar) {
        if (auoVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = auoVar;
    }

    public final void a(zzbv zzbvVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new a8p(28, this, zzbvVar));
        }
    }
}
