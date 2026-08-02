package z;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6906g implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f68452a;

    /* renamed from: b, reason: collision with root package name */
    public int f68453b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68454c;

    public AbstractC6906g(int i10) {
        this.f68452a = i10;
    }

    public abstract Object a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68453b < this.f68452a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a10 = a(this.f68453b);
        this.f68453b++;
        this.f68454c = true;
        return a10;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f68454c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f68453b - 1;
        this.f68453b = i10;
        b(i10);
        this.f68452a--;
        this.f68454c = false;
    }
}
