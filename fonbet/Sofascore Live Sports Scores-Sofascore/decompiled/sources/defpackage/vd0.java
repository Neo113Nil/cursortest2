package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vd0 {
    public final String a;
    public final String b;
    public final String c;

    public vd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0)) {
            return false;
        }
        vd0 vd0Var = (vd0) obj;
        return this.a.equals(vd0Var.a) && this.b.equals(vd0Var.b) && this.c.equals(vd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return lnb.q(sb, this.c, ')');
    }
}
