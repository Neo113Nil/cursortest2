package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ijh {
    public static final ijh c = new ijh(-1, -1);
    public final int a;
    public final int b;

    static {
        new ijh(0, 0);
        nik.N(0);
        nik.N(1);
    }

    public ijh(int i, int i2) {
        z1a.s((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ijh) {
            ijh ijhVar = (ijh) obj;
            if (this.a == ijhVar.a && this.b == ijhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
