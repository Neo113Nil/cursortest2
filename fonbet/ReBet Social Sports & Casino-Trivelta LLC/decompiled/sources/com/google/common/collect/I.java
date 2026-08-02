package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class I {

    public class a extends AbstractC3438s {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f36710b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ra.o f36711c;

        public a(Iterable iterable, Ra.o oVar) {
            this.f36710b = iterable;
            this.f36711c = oVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return J.j(this.f36710b.iterator(), this.f36711c);
        }
    }

    public static boolean a(Iterable iterable, Ra.o oVar) {
        return J.b(iterable.iterator(), oVar);
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : L.i(iterable.iterator());
    }

    public static Iterable c(Iterable iterable, Iterable iterable2) {
        return AbstractC3438s.a(iterable, iterable2);
    }

    public static Iterable d(Iterable iterable, Ra.o oVar) {
        Ra.n.k(iterable);
        Ra.n.k(oVar);
        return new a(iterable, oVar);
    }

    public static Object e(Iterable iterable, Object obj) {
        return J.n(iterable.iterator(), obj);
    }

    public static Object f(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return J.l(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return h(list);
    }

    public static Object g(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return h(L.a(iterable));
            }
        }
        return J.m(iterable.iterator(), obj);
    }

    public static Object h(List list) {
        return list.get(list.size() - 1);
    }

    public static Object i(Iterable iterable) {
        return J.o(iterable.iterator());
    }

    public static boolean j(Iterable iterable, Ra.o oVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? k((List) iterable, (Ra.o) Ra.n.k(oVar)) : J.s(iterable.iterator(), oVar);
    }

    public static boolean k(List list, Ra.o oVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!oVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        m(list, oVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m(list, oVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static int l(Iterable iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : J.u(iterable.iterator());
    }

    public static void m(List list, Ra.o oVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static Object[] n(Iterable iterable) {
        return b(iterable).toArray();
    }

    public static Object[] o(Iterable iterable, Object[] objArr) {
        return b(iterable).toArray(objArr);
    }

    public static String p(Iterable iterable) {
        return J.v(iterable.iterator());
    }
}
