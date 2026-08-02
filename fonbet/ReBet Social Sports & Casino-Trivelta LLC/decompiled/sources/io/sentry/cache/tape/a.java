package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class a extends c {

    public static final class b implements Iterator {
        public b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    @Override // io.sentry.cache.tape.c
    public void k(Object obj) {
    }

    @Override // io.sentry.cache.tape.c
    public void m1(int i10) {
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }
}
