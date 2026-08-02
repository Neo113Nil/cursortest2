package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mxe {
    public final int a;
    public final int b;
    public final q9k c;

    public mxe(int i, int i2, q9k q9kVar) {
        this.a = i;
        this.b = i2;
        this.c = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxe)) {
            return false;
        }
        mxe mxeVar = (mxe) obj;
        return this.a == mxeVar.a && this.b == mxeVar.b && this.c.equals(mxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "PlayerUpdateStatus(iconRes=", ", tint=", ", text=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
