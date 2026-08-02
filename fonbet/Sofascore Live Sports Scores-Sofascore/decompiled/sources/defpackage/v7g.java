package defpackage;

import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class v7g {
    public final lk a;
    public final Proxy b;
    public final InetSocketAddress c;

    public v7g(lk lkVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = lkVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v7g)) {
            return false;
        }
        v7g v7gVar = (v7g) obj;
        return v7gVar.a.equals(this.a) && v7gVar.b.equals(this.b) && Intrinsics.c(v7gVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        jl9 jl9Var = this.a.h;
        String str = jl9Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : uol.b(hostAddress);
        if (StringsKt.K(str, ':')) {
            wt3.A(U3.j.d, str, sb, U3.j.e);
        } else {
            sb.append(str);
        }
        if (jl9Var.e != inetSocketAddress.getPort() || str.equals(b)) {
            sb.append(":");
            sb.append(jl9Var.e);
        }
        if (!str.equals(b)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.K(b, ':')) {
                wt3.A(U3.j.d, b, sb, U3.j.e);
            } else {
                sb.append(b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
