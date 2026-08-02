package defpackage;

import android.os.HandlerThread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class el0 implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ el0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.tmi
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(nbd.a(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(fl0.E(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 2:
                return new HandlerThread(nbd.a(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(fl0.E(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
