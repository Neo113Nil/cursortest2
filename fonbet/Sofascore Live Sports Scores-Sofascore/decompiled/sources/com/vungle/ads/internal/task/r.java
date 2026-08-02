package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r implements Runnable {
    public WeakReference a;

    public r(WeakReference weakReference) {
        weakReference.getClass();
        this.a = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = (s) this.a.get();
        if (sVar != null) {
            sVar.a();
        }
    }
}
