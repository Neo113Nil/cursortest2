package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bsh {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public bsh(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsh)) {
            return false;
        }
        bsh bshVar = (bsh) obj;
        return this.a.equals(bshVar.a) && this.b == bshVar.b && this.c == bshVar.c && this.d == bshVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return me4.i(mz1.q(this.b, "SofaNotificationChannel(id=", this.a, ", nameRes=", ", importance="), this.c, ", soundRes=", this.d, ")");
    }
}
