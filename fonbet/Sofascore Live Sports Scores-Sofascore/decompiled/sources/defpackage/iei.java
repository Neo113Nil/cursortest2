package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iei implements Serializable {
    public final String a;
    public final List b;

    public iei(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iei)) {
            return false;
        }
        iei ieiVar = (iei) obj;
        return Intrinsics.c(this.a, ieiVar.a) && Intrinsics.c(this.b, ieiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticCategory(name=" + this.a + ", detailedStatistics=" + this.b + ")";
    }
}
