package gh;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f10302a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f10303b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f10304c;

    public s0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f10302a = address;
        this.f10303b = proxy;
        this.f10304c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(s0Var.f10302a, this.f10302a) && Intrinsics.areEqual(s0Var.f10303b, this.f10303b) && Intrinsics.areEqual(s0Var.f10304c, this.f10304c);
    }

    public final int hashCode() {
        return this.f10304c.hashCode() + ((this.f10303b.hashCode() + ((this.f10302a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        y yVar = this.f10302a.f10114h;
        String str = yVar.f10332d;
        InetSocketAddress inetSocketAddress = this.f10304c;
        InetAddress address = inetSocketAddress.getAddress();
        String b10 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : hh.d.b(hostAddress);
        if (StringsKt.B(str, ':')) {
            sb2.append("[");
            sb2.append(str);
            sb2.append("]");
        } else {
            sb2.append(str);
        }
        if (yVar.f10333e != inetSocketAddress.getPort() || Intrinsics.areEqual(str, b10)) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(yVar.f10333e);
        }
        if (!Intrinsics.areEqual(str, b10)) {
            if (Intrinsics.areEqual(this.f10303b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (b10 == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.B(b10, ':')) {
                sb2.append("[");
                sb2.append(b10);
                sb2.append("]");
            } else {
                sb2.append(b10);
            }
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
