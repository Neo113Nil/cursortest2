package com.google.common.collect;

import com.google.common.collect.AbstractC5878w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import ru.ozon.app.android.account.orders.emptyscreen.BarcodeFullScreenOfflineFactory;
import ru.ozon.app.android.composer.emptyscreenfactory.DefaultEmptyScreenFactory;
import ru.ozon.app.android.composer.initialwidgets.DefaultInitialWidgetsProvider;
import ru.ozon.app.android.composer.initialwidgets.EmptyInitialWidgetProvider;
import ru.ozon.app.android.pdp.offline.PdpOfflineScreenFactory;

/* renamed from: com.google.common.collect.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5881z<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient A<Map.Entry<K, V>> f59148a;

    /* renamed from: b, reason: collision with root package name */
    private transient A<K> f59149b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC5878w<V> f59150c;

    /* renamed from: com.google.common.collect.z$a */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f59151a;

        /* renamed from: b, reason: collision with root package name */
        int f59152b;

        /* renamed from: c, reason: collision with root package name */
        C0901a f59153c;

        /* renamed from: com.google.common.collect.z$a$a, reason: collision with other inner class name */
        static final class C0901a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f59154a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f59155b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f59156c;

            C0901a(Object obj, Object obj2, Object obj3) {
                this.f59154a = obj;
                this.f59155b = obj2;
                this.f59156c = obj3;
            }

            final IllegalArgumentException a() {
                StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f59154a;
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f59155b);
                sb2.append(" and ");
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f59156c);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        public final AbstractC5881z<K, V> a() {
            C0901a c0901a = this.f59153c;
            if (c0901a != null) {
                throw c0901a.a();
            }
            V y11 = V.y(this.f59152b, this.f59151a, this);
            C0901a c0901a2 = this.f59153c;
            if (c0901a2 == null) {
                return y11;
            }
            throw c0901a2.a();
        }

        public final void b(Object obj, Object obj2) {
            int i11 = (this.f59152b + 1) * 2;
            Object[] objArr = this.f59151a;
            if (i11 > objArr.length) {
                this.f59151a = Arrays.copyOf(objArr, AbstractC5878w.b.b(objArr.length, i11));
            }
            C5866j.a(obj, obj2);
            Object[] objArr2 = this.f59151a;
            int i12 = this.f59152b;
            int i13 = i12 * 2;
            objArr2[i13] = obj;
            objArr2[i13 + 1] = obj2;
            this.f59152b = i12 + 1;
        }

        a(int i11) {
            this.f59151a = new Object[i11 * 2];
            this.f59152b = 0;
        }
    }

    /* renamed from: com.google.common.collect.z$b */
    /* loaded from: classes9.dex */
    static class b<K, V> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f59157a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f59158b;

        b(AbstractC5881z<K, V> abstractC5881z) {
            Object[] objArr = new Object[abstractC5881z.size()];
            Object[] objArr2 = new Object[abstractC5881z.size()];
            f0<Map.Entry<K, V>> it = abstractC5881z.entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i11] = next.getKey();
                objArr2[i11] = next.getValue();
                i11++;
            }
            this.f59157a = objArr;
            this.f59158b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object readResolve() {
            Object[] objArr = this.f59157a;
            boolean z11 = objArr instanceof A;
            Object[] objArr2 = this.f59158b;
            if (!z11) {
                a aVar = new a(objArr.length);
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    aVar.b(objArr[i11], objArr2[i11]);
                }
                return aVar.a();
            }
            A a11 = (A) objArr;
            a aVar2 = new a(a11.size());
            Iterator it = a11.iterator();
            f0 it2 = ((AbstractC5878w) objArr2).iterator();
            while (it.hasNext()) {
                aVar2.b(it.next(), it2.next());
            }
            return aVar2.a();
        }
    }

    AbstractC5881z() {
    }

    public static <K, V> a<K, V> b() {
        return new a<>(4);
    }

    public static <K, V> a<K, V> e(int i11) {
        C5866j.b(i11, "expectedSize");
        return new a<>(i11);
    }

    public static <K, V> AbstractC5881z<K, V> h(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC5881z) && !(map instanceof SortedMap)) {
            AbstractC5881z<K, V> abstractC5881z = (AbstractC5881z) map;
            abstractC5881z.getClass();
            return abstractC5881z;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        Set<Map.Entry<? extends K, ? extends V>> set = entrySet;
        if (set instanceof Collection) {
            int size = set.size() * 2;
            Object[] objArr = aVar.f59151a;
            if (size > objArr.length) {
                aVar.f59151a = Arrays.copyOf(objArr, AbstractC5878w.b.b(objArr.length, size));
            }
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public static <K, V> AbstractC5881z<K, V> p() {
        return (AbstractC5881z<K, V>) V.f59033g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static AbstractC5881z s(Object obj, Object obj2) {
        C5866j.a(DefaultInitialWidgetsProvider.class, obj);
        C5866j.a(EmptyInitialWidgetProvider.class, obj2);
        return V.y(2, new Object[]{DefaultInitialWidgetsProvider.class, obj, EmptyInitialWidgetProvider.class, obj2}, null);
    }

    public static AbstractC5881z u(Object obj, Object obj2, Object obj3) {
        C5866j.a(PdpOfflineScreenFactory.class, obj);
        C5866j.a(BarcodeFullScreenOfflineFactory.class, obj2);
        C5866j.a(DefaultEmptyScreenFactory.class, obj3);
        return V.y(3, new Object[]{PdpOfflineScreenFactory.class, obj, BarcodeFullScreenOfflineFactory.class, obj2, DefaultEmptyScreenFactory.class, obj3}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return I.a(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        return v12 != null ? v12 : v11;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b0.c(entrySet());
    }

    abstract A<Map.Entry<K, V>> i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract A<K> j();

    abstract AbstractC5878w<V> l();

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final A<Map.Entry<K, V>> entrySet() {
        A<Map.Entry<K, V>> a11 = this.f59148a;
        if (a11 != null) {
            return a11;
        }
        A<Map.Entry<K, V>> i11 = i();
        this.f59148a = i11;
        return i11;
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final A<K> keySet() {
        A<K> a11 = this.f59149b;
        if (a11 != null) {
            return a11;
        }
        A<K> j11 = j();
        this.f59149b = j11;
        return j11;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return I.c(this);
    }

    @Override // java.util.Map
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC5878w<V> values() {
        AbstractC5878w<V> abstractC5878w = this.f59150c;
        if (abstractC5878w != null) {
            return abstractC5878w;
        }
        AbstractC5878w<V> l11 = l();
        this.f59150c = l11;
        return l11;
    }

    Object writeReplace() {
        return new b(this);
    }
}
