package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p0d {
    public final LinkedHashMap a;
    public final j0l b;

    public p0d(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new j0l(z);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int c = sub.c(k13.r(entrySet, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.a, pair.b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            a70.r("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e5f e5fVar) {
        e5fVar.getClass();
        Object obj = this.a.get(e5fVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(e5f e5fVar) {
        e5fVar.getClass();
        b();
        this.a.remove(e5fVar);
    }

    public final void e(e5f e5fVar, Object obj) {
        e5fVar.getClass();
        f(e5fVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof p0d) {
            LinkedHashMap linkedHashMap = ((p0d) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = Intrinsics.c(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(e5f e5fVar, Object obj) {
        e5fVar.getClass();
        b();
        if (obj == null) {
            d(e5fVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.W0((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(e5fVar, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(e5fVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(e5fVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final p0d g() {
        return new p0d(new LinkedHashMap(a()), false);
    }

    public final p0d h() {
        return new p0d(new LinkedHashMap(a()), true);
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return CollectionsKt.f0(this.a.entrySet(), ",\n", "{\n", "\n}", new clc(12), 24);
    }

    public /* synthetic */ p0d(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
