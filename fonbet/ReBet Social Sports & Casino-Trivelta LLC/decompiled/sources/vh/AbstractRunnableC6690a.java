package vh;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;

/* renamed from: vh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC6690a extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f67168a;

    /* renamed from: vh.a$b */
    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f67169a;

        /* renamed from: b, reason: collision with root package name */
        public Map.Entry f67170b;

        /* renamed from: c, reason: collision with root package name */
        public Object f67171c;

        public final void a() {
            while (this.f67169a.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f67169a.next();
                this.f67170b = entry;
                T t10 = ((d) entry.getKey()).get();
                this.f67171c = t10;
                if (t10 != 0) {
                    return;
                }
            }
            this.f67170b = null;
            this.f67171c = null;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = this.f67171c;
            if (obj == null) {
                throw new NoSuchElementException();
            }
            try {
                return new c(obj, this.f67170b);
            } finally {
                a();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67171c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b(Iterator it) {
            this.f67169a = it;
            a();
        }
    }

    /* renamed from: vh.a$c */
    public class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f67173a;

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry f67174b;

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f67173a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f67174b.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            return this.f67174b.setValue(obj);
        }

        public c(Object obj, Map.Entry entry) {
            this.f67173a = obj;
            this.f67174b = entry;
        }
    }

    /* renamed from: vh.a$d */
    public static final class d extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final int f67176a;

        public d(Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f67176a = System.identityHashCode(obj);
        }

        public boolean equals(Object obj) {
            return obj instanceof d ? ((d) obj).get() == get() : obj.equals(this);
        }

        public int hashCode() {
            return this.f67176a;
        }

        public String toString() {
            return String.valueOf(get());
        }
    }

    public AbstractRunnableC6690a(ConcurrentMap concurrentMap) {
        this.f67168a = concurrentMap;
    }

    public void a() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return;
            } else {
                this.f67168a.remove(poll);
            }
        }
    }

    public abstract Object b(Object obj);

    public Object c(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return this.f67168a.put(new d(obj, this), obj2);
    }

    public Object e(Object obj) {
        obj.getClass();
        Object b10 = b(obj);
        try {
            return this.f67168a.remove(b10);
        } finally {
            f(b10);
        }
    }

    public abstract void f(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(this.f67168a.entrySet().iterator());
    }

    public String toString() {
        return this.f67168a.toString();
    }
}
