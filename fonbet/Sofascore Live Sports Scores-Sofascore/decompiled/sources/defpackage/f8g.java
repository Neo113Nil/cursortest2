package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f8g {
    public final foa a;
    public final boolean b;
    public final boolean c;

    public f8g(foa foaVar, boolean z, boolean z2) {
        this.a = foaVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8g)) {
            return false;
        }
        f8g f8gVar = (f8g) obj;
        return this.a == f8gVar.a && this.b == f8gVar.b && this.c == f8gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.a);
        sb.append(", expandWidth=");
        sb.append(this.b);
        sb.append(", expandHeight=");
        return lnb.r(sb, this.c, ')');
    }
}
