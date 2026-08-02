package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class c38 implements Iterator, eia {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ Sequence e;

    public c38(a65 a65Var) {
        this.a = 2;
        this.e = a65Var;
        this.b = ((Sequence) a65Var.b).iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        d38 d38Var = (d38) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) d38Var.c.invoke(next)).booleanValue() != d38Var.b);
        this.d = next;
        this.c = 1;
    }

    public void c() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) ((a65) this.e).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            n78 n78Var = (n78) this.e;
            it = (Iterator) n78Var.c.invoke(n78Var.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return d();
            default:
                if (this.c == -1) {
                    c();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    yhk.d();
                    break;
                } else {
                    Object obj = this.d;
                    this.d = null;
                    this.c = -1;
                    break;
                }
            case 1:
                int i = this.c;
                if (i == 2) {
                    yhk.d();
                    break;
                } else if (i == 0 && !d()) {
                    yhk.d();
                    break;
                } else {
                    this.c = 0;
                    Iterator it = (Iterator) this.d;
                    it.getClass();
                    break;
                }
                break;
            default:
                if (this.c == -1) {
                    c();
                }
                if (this.c == 0) {
                    yhk.d();
                    break;
                } else {
                    Object obj2 = this.d;
                    this.d = null;
                    this.c = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c38(n78 n78Var) {
        this.a = 1;
        this.e = n78Var;
        this.b = n78Var.a.iterator();
    }

    public c38(d38 d38Var) {
        this.a = 0;
        this.e = d38Var;
        this.b = d38Var.a.iterator();
        this.c = -1;
    }
}
