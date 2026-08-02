package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qx4 {
    public final oif a;
    public final int b;
    public final int c;

    public qx4(oif oifVar, int i, int i2) {
        d2a.r(oifVar, "Null dependency anInterface.");
        this.a = oifVar;
        this.b = i;
        this.c = i2;
    }

    public static qx4 a(Class cls) {
        return new qx4(0, 1, cls);
    }

    public static qx4 b(oif oifVar) {
        return new qx4(oifVar, 1, 0);
    }

    public static qx4 c(Class cls) {
        return new qx4(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx4)) {
            return false;
        }
        qx4 qx4Var = (qx4) obj;
        return this.a.equals(qx4Var.a) && this.b == qx4Var.b && this.c == qx4Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i2 != 2) {
                a70.j(ljg.j(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return mz1.o(sb, str, "}");
    }

    public qx4(int i, int i2, Class cls) {
        this(oif.a(cls), i, i2);
    }
}
