package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oac {
    public final Bundle a;
    public ibc b;

    public oac(ibc ibcVar, boolean z) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = ibcVar;
        bundle.putBundle("selector", ibcVar.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            ibc b = ibc.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = ibc.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oac) {
            oac oacVar = (oac) obj;
            a();
            ibc ibcVar = this.b;
            oacVar.a();
            if (ibcVar.equals(oacVar.b) && b() == oacVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (b() ? 1 : 0) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return wt3.p(sb, !r2.b.contains(null), " }");
    }
}
