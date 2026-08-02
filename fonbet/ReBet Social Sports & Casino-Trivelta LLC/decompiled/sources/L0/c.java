package L0;

import L0.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6741a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6742b;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f6743d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? ArraysKt.joinToString$default((byte[]) value, (CharSequence) ", ", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // L0.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f6741a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return L0.a.b(linkedHashMap);
    }

    @Override // L0.f
    public boolean b(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6741a.containsKey(key);
    }

    @Override // L0.f
    public Object c(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f6741a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002e->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f6741a;
        if (map == this.f6741a) {
            return true;
        }
        if (map.size() != this.f6741a.size()) {
            return false;
        }
        Map map2 = cVar.f6741a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f6741a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    z10 = Intrinsics.areEqual(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return true;
    }

    public final void f() {
        if (this.f6742b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        f();
        this.f6741a.clear();
    }

    public final void h() {
        this.f6742b.b(true);
    }

    public int hashCode() {
        Iterator it = this.f6741a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i10 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i10;
    }

    public final void i(f.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        f();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object j(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        return this.f6741a.remove(key);
    }

    public final void k(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        l(key, obj);
    }

    public final void l(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        if (obj == null) {
            j(key);
            return;
        }
        if (obj instanceof Set) {
            this.f6741a.put(key, L0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f6741a.put(key, obj);
            return;
        }
        Map map = this.f6741a;
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f6741a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f6743d, 24, null);
    }

    public c(Map preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f6741a = preferencesMap;
        this.f6742b = new b(z10);
    }
}
