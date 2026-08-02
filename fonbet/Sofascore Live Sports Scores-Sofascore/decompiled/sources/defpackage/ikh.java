package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ikh {
    public final int a;
    public final int b;

    public ikh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikh)) {
            return false;
        }
        ikh ikhVar = (ikh) obj;
        return this.a == ikhVar.a && this.b == ikhVar.b;
    }

    public final int hashCode() {
        return wt3.C(this.b) + (wt3.C(this.a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + wv8.z(this.a) + ", height=" + wv8.z(this.b) + ')';
    }
}
