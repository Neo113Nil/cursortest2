package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bv8 implements og3 {
    public final lg3 a;

    public bv8(lg3 lg3Var) {
        this.a = lg3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bv8) {
            return this.a.equals(((bv8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
