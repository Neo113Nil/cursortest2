package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sq6 implements uq6 {
    public final cm7 a;

    public sq6(cm7 cm7Var) {
        this.a = cm7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq6) && this.a == ((sq6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSeeAllTopPlayersClick(category=" + this.a + ")";
    }
}
