package defpackage;

import com.ironsource.U3;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xod {
    public static final List a = Collections.unmodifiableList(Arrays.asList(rff.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, hk3 hk3Var) {
        rff rffVar;
        z1a.y(sSLSocketFactory, "sslSocketFactory");
        z1a.y(socket, "socket");
        z1a.y(hk3Var, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = hk3Var.b;
        String[] strArr2 = strArr != null ? (String[]) mik.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) mik.a(hk3Var.c, sSLSocket.getEnabledProtocols());
        fk3 fk3Var = new fk3(hk3Var);
        boolean z = fk3Var.a;
        if (!z) {
            a70.r("no cipher suites for cleartext connections");
            return null;
        }
        if (strArr2 == null) {
            fk3Var.b = null;
        } else {
            fk3Var.b = (String[]) strArr2.clone();
        }
        if (!z) {
            a70.r("no TLS versions for cleartext connections");
            return null;
        }
        if (strArr3 == null) {
            fk3Var.c = null;
        } else {
            fk3Var.c = (String[]) strArr3.clone();
        }
        hk3 hk3Var2 = new hk3(fk3Var);
        sSLSocket.setEnabledProtocols(hk3Var2.c);
        String[] strArr4 = hk3Var2.b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        tod todVar = tod.c;
        boolean z2 = hk3Var.d;
        List list = a;
        String d = todVar.d(sSLSocket, str, z2 ? list : null);
        if (d.equals("http/1.0")) {
            rffVar = rff.HTTP_1_0;
        } else if (d.equals("http/1.1")) {
            rffVar = rff.HTTP_1_1;
        } else if (d.equals("h2")) {
            rffVar = rff.HTTP_2;
        } else {
            if (!d.equals("spdy/3.1")) {
                is8.e("Unexpected protocol: ".concat(d));
                return null;
            }
            rffVar = rff.SPDY_3;
        }
        z1a.C(d, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(rffVar));
        if (aod.a.verify((str.startsWith(U3.j.d) && str.endsWith(U3.j.e)) ? wv8.h(1, 1, str) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
