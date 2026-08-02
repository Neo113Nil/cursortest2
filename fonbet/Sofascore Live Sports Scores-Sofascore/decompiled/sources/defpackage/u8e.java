package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u8e implements Iterable, eia {
    public static final u8e b;
    public final Map a;

    static {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        b = new u8e(lm5Var);
    }

    public u8e(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u8e) {
            return Intrinsics.c(this.a, ((u8e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                pvd.j();
                return null;
            }
            arrayList.add(new Pair(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return dmi.s(new StringBuilder("Parameters(entries="), this.a, ')');
    }
}
