package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class md4 {
    public static final md4 b;
    public final HashMap a;

    static {
        md4 md4Var = new md4(new LinkedHashMap());
        ww9.I(md4Var);
        b = md4Var;
    }

    public md4(md4 md4Var) {
        md4Var.getClass();
        this.a = new HashMap(md4Var.a);
    }

    public final int a(String str, int i) {
        Object valueOf = Integer.valueOf(i);
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final int[] b(String str) {
        Object obj = this.a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        Object[] objArr = (Object[]) obj;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                yhk.s("null cannot be cast to non-null type kotlin.Int");
                return null;
            }
            iArr[i] = ((Integer) obj2).intValue();
        }
        return iArr;
    }

    public final long c(String str, long j) {
        Object valueOf = Long.valueOf(j);
        Object obj = this.a.get(str);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final long[] d(String str) {
        Object obj = this.a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        Object[] objArr = (Object[]) obj;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                yhk.s("null cannot be cast to non-null type kotlin.Long");
                return null;
            }
            jArr[i] = ((Long) obj2).longValue();
        }
        return jArr;
    }

    public final String e(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && md4.class.equals(obj.getClass())) {
                HashMap hashMap = ((md4) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (Intrinsics.c(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = kh0.b(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return mz1.o(new StringBuilder("Data {"), CollectionsKt.f0(this.a.entrySet(), null, null, null, new q73(21), 31), "}");
    }

    public md4(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
