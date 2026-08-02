package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cl0 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3c b;

    public /* synthetic */ cl0(q2c q2cVar, z3c z3cVar, int i) {
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
                if (lik.a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    a4c a4cVar = (a4c) z3cVar.c;
                    if (z3cVar == a4cVar.l1) {
                        if (j == Long.MAX_VALUE) {
                            a4cVar.x0 = true;
                            break;
                        } else {
                            try {
                                a4cVar.k0(j);
                                a4cVar.s0();
                                a4cVar.z0.f++;
                                a4cVar.r0();
                                a4cVar.T(j);
                                break;
                            } catch (sf6 e) {
                                a4cVar.y0 = e;
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                Handler handler2 = z3cVar.b;
                if (lik.a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    a4c a4cVar2 = (a4c) z3cVar.c;
                    if (z3cVar == a4cVar2.l1) {
                        if (j == Long.MAX_VALUE) {
                            a4cVar2.x0 = true;
                            break;
                        } else {
                            try {
                                a4cVar2.k0(j);
                                a4cVar2.s0();
                                a4cVar2.z0.f++;
                                a4cVar2.r0();
                                a4cVar2.T(j);
                                break;
                            } catch (sf6 e2) {
                                a4cVar2.y0 = e2;
                            }
                        }
                    }
                }
                break;
        }
    }
}
