package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ki9 extends SocketAddress {
    public static final /* synthetic */ int e = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public ki9(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        z1a.y(inetSocketAddress, "proxyAddress");
        z1a.C(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.a = inetSocketAddress;
        this.b = inetSocketAddress2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ki9)) {
            return false;
        }
        ki9 ki9Var = (ki9) obj;
        return sha.r(this.a, ki9Var.a) && sha.r(this.b, ki9Var.b) && sha.r(this.c, ki9Var.c) && sha.r(this.d, ki9Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "proxyAddr");
        I.e(this.b, "targetAddr");
        I.e(this.c, "username");
        I.d("hasPassword", this.d != null);
        return I.toString();
    }
}
