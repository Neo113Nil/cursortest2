package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sc5 implements Iterator, eia {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public sc5(tc5 tc5Var, byte b) {
        this.c = tc5Var.c;
        this.b = tc5Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new IndexedValue(i2, it.next());
                }
                b.q();
                throw null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    this.c = i3 - 1;
                    return it.next();
                }
                yhk.d();
                return null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
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

    public sc5(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public sc5(tc5 tc5Var) {
        this.b = tc5Var.b.iterator();
        this.c = tc5Var.c;
    }
}
