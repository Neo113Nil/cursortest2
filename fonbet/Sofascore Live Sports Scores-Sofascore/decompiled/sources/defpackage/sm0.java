package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sm0 {
    public static final sm0 b = new sm0(new IdentityHashMap());
    public final IdentityHashMap a;

    public sm0(IdentityHashMap identityHashMap) {
        this.a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sm0.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((sm0) obj).a;
        IdentityHashMap identityHashMap2 = this.a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !sha.r(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
