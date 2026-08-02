package e3;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f8531b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8532a;

    static {
        j jVar = new j(new LinkedHashMap());
        rh.g.L(jVar);
        f8531b = jVar;
    }

    public j(j other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f8532a = new HashMap(other.f8532a);
    }

    public final int a(String key, int i5) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Integer.valueOf(i5);
        Object obj = this.f8532a.get(key);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final String b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f8532a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(String.class, "klass");
        Object obj = this.f8532a.get(key);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this != obj) {
            if (obj != null && Intrinsics.areEqual(j.class, obj.getClass())) {
                HashMap hashMap = ((j) obj).f8532a;
                HashMap hashMap2 = this.f8532a;
                Set<String> keySet = hashMap2.keySet();
                if (Intrinsics.areEqual(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z5 = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z5 = kotlin.collections.n.b(objArr, (Object[]) obj3);
                                }
                            }
                            z5 = Intrinsics.areEqual(obj2, obj3);
                        }
                        if (!z5) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i5 = 0;
        for (Map.Entry entry : this.f8532a.entrySet()) {
            Object value = entry.getValue();
            i5 += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i5 * 31;
    }

    public final String toString() {
        return d9.e.l(new StringBuilder("Data {"), CollectionsKt.J(this.f8532a.entrySet(), null, null, null, new a2.j(18), 31), "}");
    }

    public j(LinkedHashMap values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f8532a = new HashMap(values);
    }
}
