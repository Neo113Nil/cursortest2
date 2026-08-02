package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n3g extends cy2 {
    public final r3g b;
    public long c;
    public final /* synthetic */ grb d;

    public n3g(grb grbVar, r3g r3gVar) {
        this.d = grbVar;
        this.b = r3gVar;
    }

    @Override // defpackage.cy2
    public final void l(long j) {
        if (this.d.o.f != null) {
            return;
        }
        synchronized (this.d.i) {
            try {
                if (this.d.o.f == null) {
                    r3g r3gVar = this.b;
                    if (!r3gVar.b) {
                        long j2 = this.c + j;
                        this.c = j2;
                        grb grbVar = this.d;
                        long j3 = grbVar.t;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > grbVar.k) {
                            r3gVar.c = true;
                        } else {
                            long addAndGet = ((AtomicLong) grbVar.j.b).addAndGet(j2 - j3);
                            grb grbVar2 = this.d;
                            grbVar2.t = this.c;
                            if (addAndGet > grbVar2.l) {
                                this.b.c = true;
                            }
                            grbVar = grbVar2;
                        }
                        r3g r3gVar2 = this.b;
                        g3g a = r3gVar2.c ? grbVar.a(r3gVar2) : null;
                        if (a != null) {
                            a.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
