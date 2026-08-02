package g1;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9701a;

    /* renamed from: b, reason: collision with root package name */
    public final h9.c f9702b;

    public a(LinkedHashMap preferencesMap, boolean z5) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f9701a = preferencesMap;
        this.f9702b = new h9.c(z5);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f9701a.entrySet();
        int a7 = m0.a(v.k(entrySet, 10));
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap map = new LinkedHashMap(a7);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.f19192a, pair.f19193b);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f9702b.f10430b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f9701a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final void d(c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        this.f9701a.remove(key);
    }

    public final void e(c key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z5;
        if (obj instanceof a) {
            LinkedHashMap linkedHashMap = ((a) obj).f9701a;
            LinkedHashMap linkedHashMap2 = this.f9701a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z5 = Intrinsics.areEqual(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z5 = true;
                                }
                                if (z5) {
                                }
                            }
                            z5 = false;
                            if (z5) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(c key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z5 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f9701a;
        if (z5) {
            Set set = (Set) obj;
            Intrinsics.checkNotNullParameter(set, "set");
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(CollectionsKt.Z(set));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(key, unmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        linkedHashMap.put(key, copyOf);
    }

    public final int hashCode() {
        Iterator it = this.f9701a.entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i5 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i5;
    }

    public final String toString() {
        return CollectionsKt.J(this.f9701a.entrySet(), ",\n", "{\n", "\n}", new f1.a(16), 24);
    }

    public /* synthetic */ a(boolean z5) {
        this(new LinkedHashMap(), z5);
    }
}
