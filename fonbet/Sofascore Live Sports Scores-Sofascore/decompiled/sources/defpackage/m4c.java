package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m4c {
    public final String a;
    public final gv9 b;
    public final k4c c;
    public final Integer d;

    public m4c(String str, gv9 gv9Var, k4c k4cVar, Integer num) {
        str.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = k4cVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4c)) {
            return false;
        }
        m4c m4cVar = (m4c) obj;
        return Intrinsics.c(this.a, m4cVar.a) && Intrinsics.c(this.b, m4cVar.b) && Intrinsics.c(this.c, m4cVar.c) && Intrinsics.c(this.d, m4cVar.d);
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        k4c k4cVar = this.c;
        int hashCode = (d + (k4cVar == null ? 0 : k4cVar.hashCode())) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MediaCtaState(title=" + this.a + ", ctaItems=" + this.b + ", mediaEntity=" + this.c + ", itemCount=" + this.d + ")";
    }
}
