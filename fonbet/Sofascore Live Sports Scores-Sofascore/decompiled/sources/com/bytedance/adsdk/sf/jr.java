package com.bytedance.adsdk.sf;

import defpackage.yhk;
import defpackage.zzl;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
abstract class jr<K, V> {
    jr<K, V>.sf sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class pcc<T> implements Iterator<T> {
        int gm;
        boolean oo = false;
        final int pcc;
        int sf;

        public pcc(int i) {
            this.pcc = i;
            this.sf = jr.this.pcc();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.gm < this.sf;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                yhk.d();
                return null;
            }
            T t = (T) jr.this.pcc(this.gm, this.pcc);
            this.gm++;
            this.oo = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.oo) {
                zzl.s();
                return;
            }
            int i = this.gm - 1;
            this.gm = i;
            this.sf--;
            this.oo = false;
            jr.this.pcc(i);
        }
    }

    public static <K, V> boolean gm(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean sf(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public abstract void gm();

    public Set<K> oo() {
        jr<K, V>.sf sfVar = this.sf;
        if (sfVar != null) {
            return sfVar;
        }
        jr<K, V>.sf sfVar2 = new sf();
        this.sf = sfVar2;
        return sfVar2;
    }

    public abstract int pcc();

    public abstract int pcc(Object obj);

    public abstract Object pcc(int i, int i2);

    public abstract void pcc(int i);

    public <T> T[] pcc(T[] tArr, int i) {
        int pcc2 = pcc();
        if (tArr.length < pcc2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), pcc2));
        }
        for (int i2 = 0; i2 < pcc2; i2++) {
            tArr[i2] = pcc(i2, i);
        }
        if (tArr.length > pcc2) {
            tArr[pcc2] = null;
        }
        return tArr;
    }

    public abstract Map<K, V> sf();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class sf implements Set<K> {
        public sf() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            jr.this.gm();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return jr.this.pcc(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return jr.pcc(jr.this.sf(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return jr.pcc(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int pcc = jr.this.pcc() - 1; pcc >= 0; pcc--) {
                Object pcc2 = jr.this.pcc(pcc, 0);
                i += pcc2 == null ? 0 : pcc2.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return jr.this.pcc() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new pcc(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int pcc = jr.this.pcc(obj);
            if (pcc < 0) {
                return false;
            }
            jr.this.pcc(pcc);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return jr.sf(jr.this.sf(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return jr.gm(jr.this.sf(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return jr.this.pcc();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return jr.this.sf(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) jr.this.pcc(tArr, 0);
        }
    }

    public Object[] sf(int i) {
        int pcc2 = pcc();
        Object[] objArr = new Object[pcc2];
        for (int i2 = 0; i2 < pcc2; i2++) {
            objArr[i2] = pcc(i2, i);
        }
        return objArr;
    }

    public static <K, V> boolean pcc(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean pcc(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
