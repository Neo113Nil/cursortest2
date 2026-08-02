package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c3j {
    public final h3j a;
    public final boolean b;

    public c3j(h3j h3jVar, boolean z) {
        h3jVar.getClass();
        this.a = h3jVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3j)) {
            return false;
        }
        c3j c3jVar = (c3j) obj;
        return this.a == c3jVar.a && this.b == c3jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamTopPlayersFilterItem(type=" + this.a + ", isNba=" + this.b + ")";
    }
}
