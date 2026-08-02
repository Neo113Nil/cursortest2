package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xwd extends cy2 {
    public final /* synthetic */ ywd b;

    public xwd(ywd ywdVar) {
        this.b = ywdVar;
    }

    @Override // defpackage.cy2
    public final void m(xei xeiVar) {
        twd twdVar = this.b.a;
        boolean f = xeiVar.f();
        vwd vwdVar = twdVar.a;
        if (vwdVar.e == null && vwdVar.f == null) {
            return;
        }
        k1d k1dVar = twdVar.b;
        if (f) {
            ((AtomicLong) k1dVar.b).getAndIncrement();
        } else {
            ((AtomicLong) k1dVar.c).getAndIncrement();
        }
    }
}
