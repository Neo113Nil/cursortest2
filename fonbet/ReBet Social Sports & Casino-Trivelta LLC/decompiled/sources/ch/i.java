package ch;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes3.dex */
public final class i implements Map, KMutableMap {

    /* renamed from: a, reason: collision with root package name */
    public final Map f27822a = new LinkedHashMap();

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f27823d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return new q(((j) $receiver.getKey()).a(), $receiver.getValue());
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f27824d = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return new q(AbstractC2923C.a((String) $receiver.getKey()), $receiver.getValue());
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f27825d = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(j $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return $receiver.a();
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f27826d = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke(String $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return AbstractC2923C.a($receiver);
        }
    }

    public boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f27822a.containsKey(new j(key));
    }

    public Object b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f27822a.get(AbstractC2923C.a(key));
    }

    public Set c() {
        return new p(this.f27822a.entrySet(), a.f27823d, b.f27824d);
    }

    @Override // java.util.Map
    public void clear() {
        this.f27822a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f27822a.containsValue(obj);
    }

    public Set d() {
        return new p(this.f27822a.keySet(), c.f27825d, d.f27826d);
    }

    public int e() {
        return this.f27822a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        return Intrinsics.areEqual(((i) obj).f27822a, this.f27822a);
    }

    public Collection f() {
        return this.f27822a.values();
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f27822a.put(AbstractC2923C.a(key), value);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    public Object h(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f27822a.remove(AbstractC2923C.a(key));
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f27822a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f27822a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return d();
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return h((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
