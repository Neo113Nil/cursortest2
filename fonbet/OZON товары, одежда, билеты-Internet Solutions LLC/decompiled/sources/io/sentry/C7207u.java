package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7207u<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: io.sentry.u$a */
    /* loaded from: classes10.dex */
    final class a implements Iterator<E> {
        a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(@NotNull E e11) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // java.util.Queue
    public final E element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public final boolean offer(@NotNull E e11) {
        return false;
    }

    @Override // java.util.Queue
    public final E peek() {
        return null;
    }

    @Override // java.util.Queue
    public final E poll() {
        return null;
    }

    @Override // java.util.Queue
    @NotNull
    public final E remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }
}
