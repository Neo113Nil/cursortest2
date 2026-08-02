package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pqj {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;

    public pqj(int i, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqj)) {
            return false;
        }
        pqj pqjVar = (pqj) obj;
        return this.a.equals(pqjVar.a) && this.b.equals(pqjVar.b) && this.c == pqjVar.c && this.d.equals(pqjVar.d) && this.e.equals(pqjVar.e) && this.f == pqjVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dmi.c(dmi.c(wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = mz1.s("TotrChatPreviewMessage(name=", this.a, ", alpha2=", this.b, ", drawableRes=");
        vxd.p(this.c, ", message=", this.d, ", time=", s);
        s.append(this.e);
        s.append(", myMessage=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
