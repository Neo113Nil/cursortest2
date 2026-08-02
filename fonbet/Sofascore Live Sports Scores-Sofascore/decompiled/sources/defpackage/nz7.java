package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nz7 {
    public final String a;
    public final Map b;

    public nz7(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static nz7 a(String str) {
        return new nz7(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz7)) {
            return false;
        }
        nz7 nz7Var = (nz7) obj;
        return this.a.equals(nz7Var.a) && this.b.equals(nz7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
