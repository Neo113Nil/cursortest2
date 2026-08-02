package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vs6 implements at6 {
    public final tl7 a;
    public final boolean b;

    public vs6(tl7 tl7Var, boolean z) {
        this.a = tl7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs6)) {
            return false;
        }
        vs6 vs6Var = (vs6) obj;
        return this.a == vs6Var.a && this.b == vs6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTokenActivation(token=" + this.a + ", activation=" + this.b + ")";
    }
}
