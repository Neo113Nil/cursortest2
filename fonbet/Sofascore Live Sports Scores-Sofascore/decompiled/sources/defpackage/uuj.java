package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uuj {
    public static final uuj b;
    public final hv9 a;

    static {
        av9 av9Var = hv9.b;
        b = new uuj(vvf.e);
        nik.N(0);
    }

    public uuj(vvf vvfVar) {
        this.a = hv9.v(vvfVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            hv9 hv9Var = this.a;
            if (i2 >= hv9Var.size()) {
                return false;
            }
            suj sujVar = (suj) hv9Var.get(i2);
            boolean[] zArr = sujVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (sujVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uuj.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((uuj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
