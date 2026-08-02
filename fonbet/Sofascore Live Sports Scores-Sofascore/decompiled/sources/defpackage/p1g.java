package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p1g {
    public final int a;
    public final wg8 b;
    public final ug8 c;

    public p1g(int i, wg8 wg8Var, ug8 ug8Var) {
        this.a = i;
        this.b = wg8Var;
        this.c = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1g)) {
            return false;
        }
        p1g p1gVar = (p1g) obj;
        return this.a == p1gVar.a && Intrinsics.c(this.b, p1gVar.b) && this.c.equals(p1gVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + wv8.a(0, wv8.a(0, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
