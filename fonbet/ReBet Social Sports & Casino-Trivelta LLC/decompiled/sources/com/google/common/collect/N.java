package com.google.common.collect;

import com.google.common.collect.g0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class N {

    public class a extends k0 {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.k0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements Ra.f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36728a = new a("KEY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f36729b = new C0509b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = a();

        public enum a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ra.f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.google.common.collect.N$b$b, reason: collision with other inner class name */
        public enum C0509b extends b {
            public C0509b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Ra.f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i10) {
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f36728a, f36729b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public /* synthetic */ b(String str, int i10, M m10) {
            this(str, i10);
        }
    }

    public static abstract class c extends g0.e {
        public abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.google.common.collect.g0.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Ra.n.k(collection));
            } catch (UnsupportedOperationException unused) {
                return g0.j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.g0.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Ra.n.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = g0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g10.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(g10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public static class d extends g0.e {

        /* renamed from: a, reason: collision with root package name */
        public final Map f36730a;

        public d(Map map) {
            this.f36730a = (Map) Ra.n.k(map);
        }

        public Map a() {
            return this.f36730a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public static class e extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        public final Map f36731a;

        public e(Map map) {
            this.f36731a = (Map) Ra.n.k(map);
        }

        public final Map a() {
            return this.f36731a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return N.n(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (Ra.j.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Ra.n.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = g0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Ra.n.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = g0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static abstract class f extends AbstractMap {

        /* renamed from: a, reason: collision with root package name */
        public transient Set f36732a;

        /* renamed from: b, reason: collision with root package name */
        public transient Collection f36733b;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f36732a;
            if (set != null) {
                return set;
            }
            Set a10 = a();
            this.f36732a = a10;
            return a10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f36733b;
            if (collection != null) {
                return collection;
            }
            Collection b10 = b();
            this.f36733b = b10;
            return b10;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            AbstractC3431k.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(i10 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        return J.e(n(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C3444y(obj, obj2);
    }

    public static Ra.f e() {
        return b.f36728a;
    }

    public static Object f(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap g(int i10) {
        return new HashMap(a(i10));
    }

    public static IdentityHashMap h() {
        return new IdentityHashMap();
    }

    public static boolean i(Map map, Object obj) {
        Ra.n.k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object j(Map map, Object obj) {
        Ra.n.k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object k(Map map, Object obj) {
        Ra.n.k(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String l(Map map) {
        StringBuilder b10 = AbstractC3432l.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            b10.append(entry.getKey());
            b10.append('=');
            b10.append(entry.getValue());
            z10 = false;
        }
        b10.append('}');
        return b10.toString();
    }

    public static Ra.f m() {
        return b.f36729b;
    }

    public static Iterator n(Iterator it) {
        return new a(it);
    }
}
