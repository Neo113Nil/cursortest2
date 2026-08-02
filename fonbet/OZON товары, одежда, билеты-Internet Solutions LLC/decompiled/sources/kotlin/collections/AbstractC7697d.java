package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b'\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/collections/d;", "K", "V", "", "<init>", "()V", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7697d<K, V> implements Map<K, V>, InterfaceC6712a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private volatile b f71723a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C1186d f71724b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/d$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: kotlin.collections.d$b */
    /* loaded from: classes10.dex */
    public static final class b extends AbstractC7702i<K> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7697d<K, V> f71725b;

        /* renamed from: kotlin.collections.d$b$a */
        public static final class a implements Iterator<K>, InterfaceC6712a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f71726a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f71726a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f71726a.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return this.f71726a.next().getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(AbstractC7697d<K, ? extends V> abstractC7697d) {
            this.f71725b = abstractC7697d;
        }

        @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f71725b.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return this.f71725b.h();
        }

        @Override // kotlin.collections.AbstractC7702i, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(((X0.n) this.f71725b.c()).iterator());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "", "it", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.collections.d$c */
    /* loaded from: classes10.dex */
    static final class c extends AbstractC7737t implements Function1<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7697d<K, V> f71727b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractC7697d<K, ? extends V> abstractC7697d) {
            super(1);
            this.f71727b = abstractC7697d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<? extends K, ? extends V> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC7697d<K, V> abstractC7697d = this.f71727b;
            Companion companion = AbstractC7697d.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            K key = it.getKey();
            sb2.append(key == abstractC7697d ? "(this Map)" : String.valueOf(key));
            sb2.append('=');
            V value = it.getValue();
            sb2.append(value != abstractC7697d ? String.valueOf(value) : "(this Map)");
            return sb2.toString();
        }
    }

    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C1186d extends AbstractC7694a<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7697d<K, V> f71728a;

        /* renamed from: kotlin.collections.d$d$a */
        public static final class a implements Iterator<V>, InterfaceC6712a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f71729a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f71729a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f71729a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.f71729a.next().getValue();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C1186d(AbstractC7697d<K, ? extends V> abstractC7697d) {
            this.f71728a = abstractC7697d;
        }

        @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f71728a.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return this.f71728a.h();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(((X0.n) this.f71728a.c()).iterator());
        }
    }

    protected AbstractC7697d() {
    }

    private final Map.Entry<K, V> k(K k11) {
        Object obj;
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((Map.Entry) obj).getKey(), k11)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public abstract Set c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return k(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set c11 = c();
        if (c11.isEmpty()) {
            return false;
        }
        Iterator it = c11.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public Set<K> e() {
        if (this.f71723a == null) {
            this.f71723a = new b(this);
        }
        b bVar = this.f71723a;
        Intrinsics.f(bVar);
        return bVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (h() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v11 = get(key);
                if (Intrinsics.d(value, v11) && (v11 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> k11 = k(obj);
        if (k11 != null) {
            return k11.getValue();
        }
        return null;
    }

    public int h() {
        return ((AbstractC7694a) c()).getSize();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c().hashCode();
    }

    @NotNull
    public Collection<V> i() {
        if (this.f71724b == null) {
            this.f71724b = new C1186d(this);
        }
        C1186d c1186d = this.f71724b;
        Intrinsics.f(c1186d);
        return c1186d;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return h() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // java.util.Map
    public final V put(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @NotNull
    public final String toString() {
        return C7714v.V(c(), ", ", "{", "}", new c(this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
