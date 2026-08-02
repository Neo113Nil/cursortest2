package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m79 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public final /* synthetic */ AbstractSet f;

    public m79(n79 n79Var, byte b) {
        this.f = n79Var;
        h3p h3pVar = (h3p) n79Var.b;
        this.b = h3pVar.i;
        this.c = -1;
        this.d = h3pVar.d;
        this.e = h3pVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractSet abstractSet = this.f;
        switch (i) {
            case 0:
                if (((o79) ((n79) abstractSet).b).d != this.d) {
                    a70.o();
                } else if (this.b != -2 && this.e > 0) {
                }
                break;
            default:
                if (((h3p) ((n79) abstractSet).b).d != this.d) {
                    a70.o();
                } else if (this.b != -2 && this.e > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractSet abstractSet = this.f;
        switch (i) {
            case 0:
                n79 n79Var = (n79) abstractSet;
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    Object c = n79Var.c(this.b);
                    int i2 = this.b;
                    this.c = i2;
                    this.b = ((o79) n79Var.b).l[i2];
                    this.e--;
                    break;
                }
            default:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    n79 n79Var2 = (n79) abstractSet;
                    Object d = n79Var2.d(this.b);
                    int i3 = this.b;
                    this.c = i3;
                    this.b = ((h3p) n79Var2.b).l[i3];
                    this.e--;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractSet abstractSet = this.f;
        switch (i) {
            case 0:
                n79 n79Var = (n79) abstractSet;
                o79 o79Var = (o79) n79Var.b;
                if (((o79) n79Var.b).d != this.d) {
                    a70.o();
                    break;
                } else {
                    z1a.D("no calls to next() since the last call to remove()", this.c != -1);
                    int i2 = this.c;
                    o79Var.q(i2, tol.B(o79Var.a[i2]));
                    if (this.b == o79Var.c) {
                        this.b = this.c;
                    }
                    this.c = -1;
                    this.d = o79Var.d;
                    break;
                }
            default:
                h3p h3pVar = (h3p) ((n79) abstractSet).b;
                if (h3pVar.d != this.d) {
                    a70.o();
                    break;
                } else {
                    int i3 = this.c;
                    if (!(i3 != -1)) {
                        a70.r("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        h3pVar.j(i3, bea.T(h3pVar.a[i3]), bea.T(h3pVar.b[i3]));
                        if (this.b == h3pVar.c) {
                            this.b = this.c;
                        }
                        this.c = -1;
                        this.d = h3pVar.d;
                        break;
                    }
                }
        }
    }

    public m79(n79 n79Var) {
        this.f = n79Var;
        o79 o79Var = (o79) n79Var.b;
        this.b = o79Var.i;
        this.c = -1;
        this.d = o79Var.d;
        this.e = o79Var.c;
    }
}
