package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ws6 implements at6 {
    public final vl7 a;

    public ws6(vl7 vl7Var) {
        this.a = vl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws6) && this.a.equals(((ws6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnTokenClick(tokenData=" + this.a + ")";
    }
}
