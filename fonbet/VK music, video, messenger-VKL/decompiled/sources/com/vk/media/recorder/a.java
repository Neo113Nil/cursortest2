package com.vk.media.recorder;

/* compiled from: RecorderBase.java */
/* loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ RecorderBase b;

    public a(RecorderBase recorderBase) {
        this.b = recorderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecorderBase recorderBase = this.b;
        recorderBase.b.onInfo(null, 800, recorderBase.s);
    }
}
