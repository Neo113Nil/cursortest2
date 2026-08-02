package Ra;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public a f10127a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public Object f10128b;

    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object a();

    public final Object b() {
        this.f10127a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f10127a = a.FAILED;
        this.f10128b = a();
        if (this.f10127a == a.DONE) {
            return false;
        }
        this.f10127a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.p(this.f10127a != a.FAILED);
        int ordinal = this.f10127a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10127a = a.NOT_READY;
        Object a10 = i.a(this.f10128b);
        this.f10128b = null;
        return a10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
