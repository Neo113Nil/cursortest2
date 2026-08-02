package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xqc {
    public final String a;
    public final brc b;
    public final arc c;
    public final arc d;
    public final boolean e;

    public xqc(String str, brc brcVar, arc arcVar, arc arcVar2, boolean z) {
        this.a = str;
        this.b = brcVar;
        this.c = arcVar;
        this.d = arcVar2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc)) {
            return false;
        }
        xqc xqcVar = (xqc) obj;
        return this.a.equals(xqcVar.a) && this.b == xqcVar.b && this.c.equals(xqcVar.c) && this.d.equals(xqcVar.d) && this.e == xqcVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MmaStatDataWrapper(tag=");
        sb.append(this.a);
        sb.append(", secondaryTag=null, viewType=");
        sb.append(this.b);
        sb.append(", primaryValues=");
        sb.append(this.c);
        sb.append(", secondaryValues=");
        sb.append(this.d);
        sb.append(", isTime=");
        return wt3.p(sb, this.e, ")");
    }
}
