package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o9b {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public o9b(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9b)) {
            return false;
        }
        o9b o9bVar = (o9b) obj;
        return this.a.equals(o9bVar.a) && this.b.equals(o9bVar.b) && this.c == o9bVar.c && this.d == o9bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return w1l.i(", injury=", ")", mz1.s("LineupsListPlayerSubstitutionData(minute=", this.a, ", substitutedPlayerName=", this.b, ", substitutedIn="), this.c, this.d);
    }
}
