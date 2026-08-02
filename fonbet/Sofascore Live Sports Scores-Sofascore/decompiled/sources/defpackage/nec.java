package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nec {
    public final String a;
    public final Map b;

    public nec(String str, Map map) {
        this.a = str;
        this.b = fcp.o0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nec)) {
            return false;
        }
        nec necVar = (nec) obj;
        return Intrinsics.c(this.a, necVar.a) && Intrinsics.c(this.b, necVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
