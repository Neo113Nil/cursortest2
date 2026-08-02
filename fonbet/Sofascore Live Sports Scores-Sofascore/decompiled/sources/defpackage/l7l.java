package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l7l {
    public final String a;
    public final String b;

    public l7l(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7l)) {
            return false;
        }
        l7l l7lVar = (l7l) obj;
        return this.a.equals(l7lVar.a) && this.b.equals(l7lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("LogoRef(cacheKey=", this.a, ", url=", this.b, ")");
    }
}
