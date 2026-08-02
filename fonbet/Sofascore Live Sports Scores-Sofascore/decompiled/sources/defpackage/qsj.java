package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qsj {
    public static final qsj d = new qsj(new osj[0]);
    public final int a;
    public final vvf b;
    public int c;

    static {
        nik.N(0);
    }

    public qsj(osj... osjVarArr) {
        vvf w = hv9.w(osjVarArr);
        this.b = w;
        this.a = osjVarArr.length;
        int i = 0;
        while (i < w.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < w.d; i3++) {
                if (((osj) w.get(i)).equals(w.get(i3))) {
                    tgj.A("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final osj a(int i) {
        return (osj) this.b.get(i);
    }

    public final int b(osj osjVar) {
        int indexOf = this.b.indexOf(osjVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qsj.class != obj.getClass()) {
            return false;
        }
        qsj qsjVar = (qsj) obj;
        return this.a == qsjVar.a && this.b.equals(qsjVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
