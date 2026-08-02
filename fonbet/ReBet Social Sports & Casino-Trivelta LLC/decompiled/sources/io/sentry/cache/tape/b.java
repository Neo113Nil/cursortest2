package io.sentry.cache.tape;

import io.sentry.cache.tape.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final d f51958a;

    /* renamed from: b, reason: collision with root package name */
    public final a f51959b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final c.a f51960c;

    public static final class a extends ByteArrayOutputStream {
        public byte[] d() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    public final class C0764b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f51961a;

        public C0764b(Iterator it) {
            this.f51961a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51961a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                return b.this.f51960c.b((byte[]) this.f51961a.next());
            } catch (IOException e10) {
                throw ((Error) d.D0(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f51961a.remove();
        }
    }

    public b(d dVar, c.a aVar) {
        this.f51958a = dVar;
        this.f51960c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void clear() {
        this.f51958a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51958a.close();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0764b(this.f51958a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public void k(Object obj) {
        this.f51959b.reset();
        this.f51960c.a(obj, this.f51959b);
        this.f51958a.B(this.f51959b.d(), 0, this.f51959b.size());
    }

    @Override // io.sentry.cache.tape.c
    public void m1(int i10) {
        this.f51958a.d2(i10);
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f51958a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f51958a + '}';
    }
}
