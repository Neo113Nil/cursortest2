package io.sentry.cache.tape;

import io.sentry.C7141f;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class a<T> extends c<T> {

    /* renamed from: io.sentry.cache.tape.a$a, reason: collision with other inner class name */
    private static final class C1111a<T> implements Iterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    a() {
    }

    @Override // io.sentry.cache.tape.c
    public final void c(C7141f c7141f) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new C1111a();
    }

    @Override // io.sentry.cache.tape.c
    public final void o(int i11) throws IOException {
    }

    @Override // io.sentry.cache.tape.c
    public final int size() {
        return 0;
    }
}
