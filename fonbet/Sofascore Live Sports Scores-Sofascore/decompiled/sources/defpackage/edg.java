package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class edg {
    public final String a;
    public final List b;

    public edg(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edg)) {
            return false;
        }
        edg edgVar = (edg) obj;
        return Intrinsics.c(this.a, edgVar.a) && Intrinsics.c(this.b, edgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SASDigitalServiceActConfigTransparency(domain=" + this.a + ", dsaParams=" + this.b + ")";
    }
}
