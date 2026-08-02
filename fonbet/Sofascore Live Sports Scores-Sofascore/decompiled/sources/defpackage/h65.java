package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h65 extends i65 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h65)) {
            return false;
        }
        h65 h65Var = (h65) obj;
        return this.a == h65Var.a && this.b == h65Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
