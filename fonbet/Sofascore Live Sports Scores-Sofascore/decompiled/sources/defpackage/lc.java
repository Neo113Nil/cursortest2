package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lc {
    public final kc a;
    public final Object b;

    public lc(kc kcVar, Object obj) {
        this.a = kcVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return this.a.equals(lcVar.a) && this.b.equals(lcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a.a);
        sb.append(", ");
        return lnb.p(sb, this.b, ')');
    }
}
