package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q1h implements t1h {
    public final Object a;
    public final tc3 b;
    public final tc3 c;
    public final String d = "+";

    public q1h(Object obj, tc3 tc3Var, tc3 tc3Var2) {
        this.a = obj;
        this.b = tc3Var;
        this.c = tc3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1h) {
            q1h q1hVar = (q1h) obj;
            if (Intrinsics.c(this.a, q1hVar.a) && this.b == q1hVar.b && this.c == q1hVar.c && this.d.equals(q1hVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t1h
    public final Object getItem() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(true) + dmi.c((this.c.hashCode() + ((this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.t1h
    public final boolean isEnabled() {
        return true;
    }

    public final String toString() {
        return "CombinedIcons(item=" + this.a + ", firstIcon=" + this.b + ", secondIcon=" + this.c + ", connector=" + this.d + ", isEnabled=true)";
    }
}
