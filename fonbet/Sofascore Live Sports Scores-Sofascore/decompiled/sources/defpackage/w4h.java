package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w4h extends x4h implements Iterator, rq3, eia {
    public int a;
    public Object b;
    public Iterator c;
    public rq3 d;

    @Override // defpackage.x4h
    public final void d(rq3 rq3Var, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = rq3Var;
        lu3 lu3Var = lu3.a;
        rq3Var.getClass();
    }

    @Override // defpackage.x4h
    public final Object e(Iterator it, ftk ftkVar) {
        if (!it.hasNext()) {
            return Unit.a;
        }
        this.c = it;
        this.a = 2;
        this.d = ftkVar;
        return lu3.a;
    }

    public final RuntimeException f() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return g.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            rq3 rq3Var = this.d;
            rq3Var.getClass();
            this.d = null;
            Unit unit = Unit.a;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            yhk.d();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw f();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        y6a.M(obj);
        this.a = 4;
    }
}
