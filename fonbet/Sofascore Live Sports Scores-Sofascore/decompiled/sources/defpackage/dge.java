package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dge extends dfb {
    public final /* synthetic */ int a = 0;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Object c;
    public final /* synthetic */ ffb d;

    public dge(ige igeVar, o6a o6aVar) {
        this.d = igeVar;
        z1a.y(o6aVar, "subchannel");
        this.c = o6aVar;
    }

    @Override // defpackage.dfb
    public final bfb a(kge kgeVar) {
        int i = this.a;
        ffb ffbVar = this.d;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((fge) ffbVar).g.r().execute(new yp8((fge) this.c, 25));
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((ige) ffbVar).g.r().execute(new kac(this, 6));
                }
                break;
        }
        return bfb.e;
    }

    public dge(fge fgeVar, fge fgeVar2) {
        this.d = fgeVar;
        this.c = fgeVar2;
    }
}
