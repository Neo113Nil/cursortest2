package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oec {
    public final nr9 a;
    public final Map b;

    public oec(nr9 nr9Var, Map map) {
        this.a = nr9Var;
        this.b = fcp.o0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oec)) {
            return false;
        }
        oec oecVar = (oec) obj;
        return Intrinsics.c(this.a, oecVar.a) && Intrinsics.c(this.b, oecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
