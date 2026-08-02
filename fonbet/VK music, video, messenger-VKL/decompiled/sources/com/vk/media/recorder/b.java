package com.vk.media.recorder;

import com.vk.media.recorder.RecorderBase;

/* compiled from: RecorderBase.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;

    public b(d dVar, boolean z) {
        this.c = dVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecorderBase.c cVar = this.c.b;
        if (this.b) {
            cVar.onInfo(null, -1003, 0);
        } else {
            cVar.onError(null, -1003, 1002);
        }
    }
}
