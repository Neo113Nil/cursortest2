package io.opentelemetry.internal.shaded.jctools.queues;

import io.opentelemetry.internal.shaded.jctools.queues.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xh.AbstractC6826a;

/* loaded from: classes3.dex */
public abstract class a extends b implements d, c.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f49543a;
    protected final Object[] buffer;

    /* renamed from: io.opentelemetry.internal.shaded.jctools.queues.a$a, reason: collision with other inner class name */
    public static class C0735a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final long f49544a;

        /* renamed from: b, reason: collision with root package name */
        public final long f49545b;
        private final Object[] buffer;

        /* renamed from: c, reason: collision with root package name */
        public long f49546c;

        /* renamed from: d, reason: collision with root package name */
        public Object f49547d = a();

        public C0735a(long j10, long j11, long j12, Object[] objArr) {
            this.f49546c = j10;
            this.f49544a = j11;
            this.f49545b = j12;
            this.buffer = objArr;
        }

        public final Object a() {
            Object c10;
            do {
                long j10 = this.f49546c;
                if (j10 >= this.f49544a) {
                    return null;
                }
                this.f49546c = 1 + j10;
                c10 = xh.c.c(this.buffer, xh.c.b(j10, this.f49545b));
            } while (c10 == null);
            return c10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49547d != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f49547d;
            if (obj == null) {
                throw new NoSuchElementException();
            }
            this.f49547d = a();
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public a(int i10) {
        int a10 = AbstractC6826a.a(i10);
        this.f49543a = a10 - 1;
        this.buffer = xh.c.a(a10);
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.c.a
    public int a() {
        return (int) (this.f49543a + 1);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (poll() != null) {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return c.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0735a(c(), b(), this.f49543a, this.buffer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return c.c(this, 1);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }
}
