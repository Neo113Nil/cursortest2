package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class psj implements i72 {
    public static final psj d = new psj(new nsj[0]);
    public final int a;
    public final vvf b;
    public int c;

    public psj(nsj... nsjVarArr) {
        vvf w = hv9.w(nsjVarArr);
        this.b = w;
        this.a = nsjVarArr.length;
        int i = 0;
        while (i < w.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < w.d; i3++) {
                if (((nsj) w.get(i)).equals(w.get(i3))) {
                    m6k.C("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final nsj a(int i) {
        return (nsj) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || psj.class != obj.getClass()) {
            return false;
        }
        psj psjVar = (psj) obj;
        return this.a == psjVar.a && this.b.equals(psjVar.b);
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
}
