package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l4c {
    public final String a;
    public final String b;

    public l4c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c)) {
            return false;
        }
        l4c l4cVar = (l4c) obj;
        return this.a.equals(l4cVar.a) && this.b.equals(l4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("MediaCtaItem(thumbnailUrl=", this.a, ", mediaType=", this.b, ")");
    }
}
