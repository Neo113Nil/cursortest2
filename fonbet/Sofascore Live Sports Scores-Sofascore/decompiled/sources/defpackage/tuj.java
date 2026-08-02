package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tuj implements i72 {
    public static final tuj b;
    public final hv9 a;

    static {
        av9 av9Var = hv9.b;
        b = new tuj(vvf.e);
    }

    public tuj(hv9 hv9Var) {
        this.a = hv9.v(hv9Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            hv9 hv9Var = this.a;
            if (i2 >= hv9Var.size()) {
                return false;
            }
            ruj rujVar = (ruj) hv9Var.get(i2);
            boolean[] zArr = rujVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (rujVar.b.c == i) {
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
        if (obj == null || tuj.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tuj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
