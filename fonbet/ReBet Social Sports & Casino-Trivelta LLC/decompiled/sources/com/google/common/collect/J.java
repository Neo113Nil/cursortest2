package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public abstract class J {

    public class a extends AbstractC3422b {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f36712c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ra.o f36713d;

        public a(Iterator it, Ra.o oVar) {
            this.f36712c = it;
            this.f36713d = oVar;
        }

        @Override // com.google.common.collect.AbstractC3422b
        public Object a() {
            while (this.f36712c.hasNext()) {
                Object next = this.f36712c.next();
                if (this.f36713d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    public static final class b extends AbstractC3421a {

        /* renamed from: c, reason: collision with root package name */
        public static final n0 f36714c = new b(new Object[0], 0);
        private final Object[] array;

        public b(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.array = objArr;
        }

        @Override // com.google.common.collect.AbstractC3421a
        public Object a(int i10) {
            return this.array[i10];
        }
    }

    public static class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public Iterator f36715a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f36716b = J.g();

        /* renamed from: c, reason: collision with root package name */
        public Iterator f36717c;

        /* renamed from: d, reason: collision with root package name */
        public Deque f36718d;

        public c(Iterator it) {
            this.f36717c = (Iterator) Ra.n.k(it);
        }

        public final Iterator a() {
            while (true) {
                Iterator it = this.f36717c;
                if (it != null && it.hasNext()) {
                    return this.f36717c;
                }
                Deque deque = this.f36718d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f36717c = (Iterator) this.f36718d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Ra.n.k(this.f36716b)).hasNext()) {
                Iterator a10 = a();
                this.f36717c = a10;
                if (a10 == null) {
                    return false;
                }
                Iterator it = (Iterator) a10.next();
                this.f36716b = it;
                if (it instanceof c) {
                    c cVar = (c) it;
                    this.f36716b = cVar.f36716b;
                    if (this.f36718d == null) {
                        this.f36718d = new ArrayDeque();
                    }
                    this.f36718d.addFirst(this.f36717c);
                    if (cVar.f36718d != null) {
                        while (!cVar.f36718d.isEmpty()) {
                            this.f36718d.addFirst((Iterator) cVar.f36718d.removeLast());
                        }
                    }
                    this.f36717c = cVar.f36717c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f36716b;
            this.f36715a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.f36715a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f36715a = null;
        }
    }

    public enum d implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC3431k.c(false);
        }
    }

    public static final class e extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f36720a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f36721b;

        public e(Object obj) {
            this.f36720a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f36721b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f36721b) {
                throw new NoSuchElementException();
            }
            this.f36721b = true;
            return this.f36720a;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        Ra.n.k(collection);
        Ra.n.k(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static boolean b(Iterator it, Ra.o oVar) {
        return p(it, oVar) != -1;
    }

    public static void c(Iterator it) {
        Ra.n.k(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator d(Iterator it) {
        return new c(it);
    }

    public static boolean e(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Ra.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static m0 g() {
        return h();
    }

    public static n0 h() {
        return b.f36714c;
    }

    public static Iterator i() {
        return d.INSTANCE;
    }

    public static m0 j(Iterator it, Ra.o oVar) {
        Ra.n.k(it);
        Ra.n.k(oVar);
        return new a(it, oVar);
    }

    public static Object k(Iterator it, Ra.o oVar) {
        Ra.n.k(it);
        Ra.n.k(oVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object l(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object m(Iterator it, Object obj) {
        return it.hasNext() ? l(it) : obj;
    }

    public static Object n(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object o(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append(Typography.greater);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int p(Iterator it, Ra.o oVar) {
        Ra.n.l(oVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Object q(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean r(Iterator it, Collection collection) {
        Ra.n.k(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean s(Iterator it, Ra.o oVar) {
        Ra.n.k(oVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static m0 t(Object obj) {
        return new e(obj);
    }

    public static int u(Iterator it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return com.google.common.primitives.f.n(j10);
    }

    public static String v(Iterator it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
