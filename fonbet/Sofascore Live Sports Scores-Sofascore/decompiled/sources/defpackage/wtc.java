package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wtc implements xv4 {
    public ad2 b;
    public int c;
    public wtc e;
    public wtc f;
    public ukd g;
    public wdd h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public z07 m;
    public boolean n;
    public wtc a = this;
    public int d = -1;

    public final ku3 Y0() {
        ad2 ad2Var = this.b;
        if (ad2Var != null) {
            return ad2Var;
        }
        ad2 c = s9a.c(((xy) c6o.d0(this)).getCoroutineContext().plus(new aea((yda) ((xy) c6o.d0(this)).getCoroutineContext().get(uic.g))));
        this.b = c;
        return c;
    }

    public boolean Z0() {
        return !(this instanceof hy0);
    }

    public void a1() {
        if (this.n) {
            r3a.b("node attached multiple times");
        }
        if (this.h == null) {
            r3a.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void b1() {
        if (!this.n) {
            r3a.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            r3a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            r3a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        ad2 ad2Var = this.b;
        if (ad2Var != null) {
            s9a.o(ad2Var, new auc("The Modifier.Node was detached", 2));
            this.b = null;
        }
    }

    public void f1() {
        if (!this.n) {
            r3a.b("reset() called on an unattached node");
        }
        e1();
    }

    public void g1() {
        if (!this.n) {
            r3a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            r3a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        c1();
        this.l = true;
    }

    public void h1() {
        if (!this.n) {
            r3a.b("node detached multiple times");
        }
        if (this.h == null) {
            r3a.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            r3a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        z07 z07Var = this.m;
        if (z07Var != null) {
            z07Var.invoke();
        }
        d1();
    }

    public void i1(wtc wtcVar) {
        this.a = wtcVar;
    }

    public void j1(wdd wddVar) {
        this.h = wddVar;
    }

    public void c1() {
    }

    public void d1() {
    }

    public void e1() {
    }
}
