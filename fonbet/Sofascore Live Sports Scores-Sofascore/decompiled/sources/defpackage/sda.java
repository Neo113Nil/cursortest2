package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sda {
    public final String a;
    public final String b;

    public sda(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sda)) {
            return false;
        }
        sda sdaVar = (sda) obj;
        return this.a.equals(sdaVar.a) && this.b.equals(sdaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("JerseyData(url=", this.a, ", cacheKey=", this.b, ")");
    }
}
