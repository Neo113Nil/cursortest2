package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bc5 {
    public final int a;
    public final rcc b;
    public final CopyOnWriteArrayList c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bc5(int i) {
        this(new CopyOnWriteArrayList(), 0, null);
        switch (i) {
            case 1:
                this(new CopyOnWriteArrayList(), 0, null);
                break;
            default:
                break;
        }
    }

    public long a(long j) {
        long F = lik.F(j);
        return F == C.TIME_UNSET ? C.TIME_UNSET : F;
    }

    public void b(l6c l6cVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            lik.B(bdcVar.a, new p3(29, this, bdcVar.b, l6cVar));
        }
    }

    public void c(kfb kfbVar, l6c l6cVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            lik.B(bdcVar.a, new wcc(this, bdcVar.b, kfbVar, l6cVar, 1));
        }
    }

    public void d(kfb kfbVar, l6c l6cVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            lik.B(bdcVar.a, new wcc(this, bdcVar.b, kfbVar, l6cVar, 0));
        }
    }

    public void e(kfb kfbVar, l6c l6cVar, IOException iOException, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            lik.B(bdcVar.a, new xcc(this, bdcVar.b, kfbVar, l6cVar, iOException, z, 0));
        }
    }

    public void f(kfb kfbVar, l6c l6cVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bdc bdcVar = (bdc) it.next();
            lik.B(bdcVar.a, new wcc(this, bdcVar.b, kfbVar, l6cVar, 2));
        }
    }

    public /* synthetic */ bc5(CopyOnWriteArrayList copyOnWriteArrayList, int i, rcc rccVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = rccVar;
    }
}
