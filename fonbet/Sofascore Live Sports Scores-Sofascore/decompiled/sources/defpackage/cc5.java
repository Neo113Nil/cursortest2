package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cc5 {
    public final int a;
    public final scc b;
    public final CopyOnWriteArrayList c;

    public cc5(CopyOnWriteArrayList copyOnWriteArrayList, int i, scc sccVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = sccVar;
    }

    public final void a(eja ejaVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            nik.X(ac5Var.a, new p3(18, this, ac5Var.b, ejaVar));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            nik.X(ac5Var.a, new yb5(this, ac5Var.b, 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            nik.X(ac5Var.a, new uu1(this, ac5Var.b, i, 5));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            nik.X(ac5Var.a, new p3(17, this, ac5Var.b, exc));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ac5 ac5Var = (ac5) it.next();
            nik.X(ac5Var.a, new yb5(this, ac5Var.b, 0));
        }
    }
}
