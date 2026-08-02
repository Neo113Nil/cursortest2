package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t57 implements w57 {
    public final String a;
    public final String b;

    public t57(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t57)) {
            return false;
        }
        t57 t57Var = (t57) obj;
        return this.a.equals(t57Var.a) && this.b.equals(t57Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("KickUser(userId=", this.a, ", teamName=", this.b, ")");
    }
}
