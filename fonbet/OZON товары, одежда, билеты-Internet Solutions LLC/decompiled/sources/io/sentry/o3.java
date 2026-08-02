package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
final class o3<E> implements Queue<E>, Collection<Object>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f68124a;

    /* renamed from: b, reason: collision with root package name */
    final io.sentry.util.a f68125b = new io.sentry.util.a();

    private o3(Queue<E> queue) {
        this.f68124a = queue;
    }

    static <E> o3<E> a(Queue<E> queue) {
        return new o3<>(queue);
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean add = this.f68124a.add(obj);
            a11.close();
            return add;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean addAll = this.f68124a.addAll(collection);
            a11.close();
            return addAll;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            this.f68124a.clear();
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean contains = this.f68124a.contains(obj);
            a11.close();
            return contains;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean containsAll = this.f68124a.containsAll(collection);
            a11.close();
            return containsAll;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final E element() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            E e11 = (E) this.f68124a.element();
            a11.close();
            return e11;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean equals = this.f68124a.equals(obj);
            a11.close();
            return equals;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            int hashCode = this.f68124a.hashCode();
            a11.close();
            return hashCode;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean isEmpty = this.f68124a.isEmpty();
            a11.close();
            return isEmpty;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f68124a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(E e11) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean offer = this.f68124a.offer(e11);
            a11.close();
            return offer;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            E e11 = (E) this.f68124a.peek();
            a11.close();
            return e11;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final E poll() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            E e11 = (E) this.f68124a.poll();
            a11.close();
            return e11;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final E remove() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            E e11 = (E) this.f68124a.remove();
            a11.close();
            return e11;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean removeAll = this.f68124a.removeAll(collection);
            a11.close();
            return removeAll;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean retainAll = this.f68124a.retainAll(collection);
            a11.close();
            return retainAll;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            int size = this.f68124a.size();
            a11.close();
            return size;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            Object[] array = this.f68124a.toArray();
            a11.close();
            return array;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String toString() {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            String obj = this.f68124a.toString();
            a11.close();
            return obj;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            boolean remove = this.f68124a.remove(obj);
            a11.close();
            return remove;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        InterfaceC7097a0 a11 = this.f68125b.a();
        try {
            T[] tArr2 = (T[]) this.f68124a.toArray(tArr);
            a11.close();
            return tArr2;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
