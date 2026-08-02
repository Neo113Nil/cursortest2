package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vv4 implements ay2, im9 {
    public volatile boolean a;
    public final Object b;
    public Collection c;

    public vv4() {
        this.a = false;
        this.b = new ConcurrentHashMap();
        this.c = new LinkedBlockingQueue();
    }

    @Override // defpackage.ay2
    public void B() {
        if (this.a) {
            ((ay2) this.b).B();
        } else {
            a(new b8(this, 10));
        }
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.a) {
                    runnable.run();
                } else {
                    ((List) this.c).add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.im9
    public synchronized bjb c(String str) {
        hli hliVar;
        hliVar = (hli) ((ConcurrentHashMap) this.b).get(str);
        if (hliVar == null) {
            hliVar = new hli(str, (LinkedBlockingQueue) this.c, this.a);
            ((ConcurrentHashMap) this.b).put(str, hliVar);
        }
        return hliVar;
    }

    @Override // defpackage.ay2
    public void q(qic qicVar) {
        a(new vlo(this, qicVar, false, 10));
    }

    @Override // defpackage.ay2
    public void v(cqa cqaVar) {
        if (this.a) {
            ((ay2) this.b).v(cqaVar);
        } else {
            a(new pyn(this, cqaVar, false, 8));
        }
    }

    @Override // defpackage.ay2
    public void z(xei xeiVar, zx2 zx2Var, qic qicVar) {
        a(new n2(this, xeiVar, zx2Var, qicVar, 2));
    }

    public vv4(ay2 ay2Var) {
        this.c = new ArrayList();
        this.b = ay2Var;
    }
}
