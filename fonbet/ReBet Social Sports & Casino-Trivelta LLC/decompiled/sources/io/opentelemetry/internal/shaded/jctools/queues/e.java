package io.opentelemetry.internal.shaded.jctools.queues;

import io.opentelemetry.internal.shaded.jctools.queues.d;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class e extends i {
    public e(int i10) {
        super(i10);
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, io.opentelemetry.internal.shaded.jctools.queues.c.a
    public /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.d
    public int e(d.a aVar, int i10) {
        if (aVar == null) {
            throw new IllegalArgumentException("c is null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("limit is negative: " + i10);
        }
        if (i10 == 0) {
            return 0;
        }
        Object[] objArr = this.buffer;
        long j10 = this.f49543a;
        long i11 = i();
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = i12 + i11;
            long b10 = xh.c.b(j11, j10);
            Object c10 = xh.c.c(objArr, b10);
            if (c10 == null) {
                return i12;
            }
            xh.c.e(objArr, b10, null);
            j(j11 + 1);
            aVar.accept(c10);
        }
        return i10;
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        long b10;
        if (obj == null) {
            throw null;
        }
        long j10 = this.f49543a;
        long g10 = g();
        do {
            b10 = b();
            if (b10 >= g10) {
                g10 = c() + j10 + 1;
                if (b10 >= g10) {
                    return false;
                }
                h(g10);
            }
        } while (!f(b10, 1 + b10));
        xh.c.d(this.buffer, xh.c.b(b10, j10), obj);
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        Object c10;
        Object[] objArr = this.buffer;
        long i10 = i();
        long b10 = xh.c.b(i10, this.f49543a);
        Object c11 = xh.c.c(objArr, b10);
        if (c11 != null) {
            return c11;
        }
        if (i10 == b()) {
            return null;
        }
        do {
            c10 = xh.c.c(objArr, b10);
        } while (c10 == null);
        return c10;
    }

    @Override // java.util.Queue, io.opentelemetry.internal.shaded.jctools.queues.d
    public Object poll() {
        long i10 = i();
        long b10 = xh.c.b(i10, this.f49543a);
        Object[] objArr = this.buffer;
        Object c10 = xh.c.c(objArr, b10);
        if (c10 == null) {
            if (i10 == b()) {
                return null;
            }
            do {
                c10 = xh.c.c(objArr, b10);
            } while (c10 == null);
        }
        xh.c.e(objArr, b10, null);
        j(i10 + 1);
        return c10;
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.a, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
