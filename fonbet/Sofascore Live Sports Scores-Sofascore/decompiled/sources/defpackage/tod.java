package defpackage;

import com.ironsource.L6;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class tod {
    public static final Logger b;
    public static final tod c;
    public final fie a;

    static {
        tod todVar;
        Logger logger = Logger.getLogger(tod.class.getName());
        b = logger;
        fie fieVar = fie.d;
        ClassLoader classLoader = tod.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                todVar = new tod(fieVar);
            }
        }
        todVar = new sod(fieVar);
        c = todVar;
    }

    public tod(fie fieVar) {
        z1a.y(fieVar, L6.H);
        this.a = fieVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            z1a.q(str, "Userinfo must not be present on authority: '%s'", n49.a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        fie fieVar = this.a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b2 = b(sSLSocket);
            if (b2 != null) {
                return b2;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            fieVar.a(sSLSocket);
        }
    }
}
