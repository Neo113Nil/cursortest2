package com.google.common.collect;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class B {
    public static Object a(Iterable iterable, String str) {
        AbstractC5858b abstractC5858b = (AbstractC5858b) ((a0) iterable).iterator();
        return abstractC5858b.hasNext() ? abstractC5858b.next() : str;
    }

    public static <T> T b(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static void c(Set set, O7.i iVar) {
        if (!(set instanceof RandomAccess) || !(set instanceof List)) {
            Iterator it = set.iterator();
            iVar.getClass();
            while (it.hasNext()) {
                if (iVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        iVar.getClass();
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Object obj = list.get(i12);
            if (!iVar.apply(obj)) {
                if (i12 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        d(list, iVar, i11, i12);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        d(list, iVar, i11, i12);
                        return;
                    }
                }
                i11++;
            }
        }
        list.subList(i11, list.size()).clear();
    }

    private static <T> void d(List<T> list, O7.i<? super T> iVar, int i11, int i12) {
        for (int size = list.size() - 1; size > i12; size--) {
            if (iVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            list.remove(i13);
        }
    }
}
