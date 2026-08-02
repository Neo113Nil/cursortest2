package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o6f {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public o6f(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6f)) {
            return false;
        }
        o6f o6fVar = (o6f) obj;
        return this.a == o6fVar.a && this.b.equals(o6fVar.b) && this.c.equals(o6fVar.c) && this.d.equals(o6fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return fc6.o(dmi.t(this.a, "PreviewPlayer(id=", ", fullName=", this.b, ", shortName="), this.c, ", countryCode=", this.d, ")");
    }
}
