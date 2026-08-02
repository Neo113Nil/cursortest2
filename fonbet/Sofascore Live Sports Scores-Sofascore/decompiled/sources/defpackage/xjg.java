package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xjg {
    public final Map a;
    public final Map b;

    public xjg(Map map, Map map2) {
        map2.getClass();
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjg)) {
            return false;
        }
        xjg xjgVar = (xjg) obj;
        return this.a.equals(xjgVar.a) && Intrinsics.c(this.b, xjgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdCallParameters(getParameters=" + this.a + ", postParameters=" + this.b + ")";
    }
}
