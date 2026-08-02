package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oif {
    public final Class a;
    public final Class b;

    public oif(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static oif a(Class cls) {
        return new oif(nif.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oif.class != obj.getClass()) {
            return false;
        }
        oif oifVar = (oif) obj;
        if (this.b.equals(oifVar.b)) {
            return this.a.equals(oifVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == nif.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
