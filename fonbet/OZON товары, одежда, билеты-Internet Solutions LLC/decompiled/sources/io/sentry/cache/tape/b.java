package io.sentry.cache.tape;

import io.sentry.C7141f;
import io.sentry.cache.tape.c;
import io.sentry.cache.tape.d;
import io.sentry.cache.tape.d.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class b<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d f67801a;

    /* renamed from: b, reason: collision with root package name */
    private final a f67802b = new a();

    /* renamed from: c, reason: collision with root package name */
    final c.a<T> f67803c;

    private static final class a extends ByteArrayOutputStream {
        final byte[] c() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    private final class C1112b implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<byte[]> f67804a;

        C1112b(Iterator<byte[]> it) {
            this.f67804a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f67804a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) b.this.f67803c.a((byte[]) ((d.c) this.f67804a).next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f67804a.remove();
        }
    }

    b(d dVar, c.a<T> aVar) {
        this.f67801a = dVar;
        this.f67803c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public final void c(C7141f c7141f) throws IOException {
        a aVar = this.f67802b;
        aVar.reset();
        this.f67803c.b(c7141f, aVar);
        byte[] c11 = aVar.c();
        this.f67801a.m(aVar.size(), c11);
    }

    @Override // io.sentry.cache.tape.c
    public final void clear() throws IOException {
        this.f67801a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67801a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        d dVar = this.f67801a;
        dVar.getClass();
        return new C1112b(dVar.new c());
    }

    @Override // io.sentry.cache.tape.c
    public final void o(int i11) throws IOException {
        this.f67801a.v(i11);
    }

    @Override // io.sentry.cache.tape.c
    public final int size() {
        return this.f67801a.f67810d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.f67801a + '}';
    }
}
