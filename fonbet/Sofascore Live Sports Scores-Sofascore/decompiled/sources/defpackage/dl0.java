package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dl0 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3c b;

    public /* synthetic */ dl0(r2c r2cVar, z3c z3cVar, int i) {
        this.a = i;
        this.b = z3cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        z3c z3cVar = this.b;
        switch (i) {
            case 0:
                Handler handler = z3cVar.b;
                if (Build.VERSION.SDK_INT >= 30) {
                    z3cVar.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = z3cVar.b;
                if (Build.VERSION.SDK_INT >= 30) {
                    z3cVar.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
