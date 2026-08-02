package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u3j implements w3j {
    public final boolean a;
    public final int b;

    public u3j(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3j)) {
            return false;
        }
        u3j u3jVar = (u3j) obj;
        return this.a == u3jVar.a && this.b == u3jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TeamSelected(first=" + this.a + ", teamId=" + this.b + ")";
    }
}
