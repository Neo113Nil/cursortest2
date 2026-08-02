package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class fie {
    public static final Logger b;
    public static final String[] c;
    public static final fie d;
    public final Provider a;

    static {
        Object obj;
        Provider provider;
        fie fieVar;
        int i;
        Logger logger = Logger.getLogger(fie.class.getName());
        b = logger;
        c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            obj = null;
            if (i2 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            for (String str : c) {
                if (str.equals(provider2.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            int i3 = 14;
            ejg ejgVar = new ejg(i3, obj, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            ejg ejgVar2 = new ejg(i3, obj, "setHostname", new Class[]{String.class});
            ejg ejgVar3 = new ejg(i3, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            ejg ejgVar4 = new ejg(i3, obj, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    fie.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        fie.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        i = 3;
                    }
                }
            }
            i = 1;
            fieVar = new bie(ejgVar, ejgVar2, ejgVar3, ejgVar4, provider, i);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new d4(1))).invoke(sSLContext.createSSLEngine(), null);
                        fieVar = new cie(provider3, (Method) AccessController.doPrivileged(new d4(2)), (Method) AccessController.doPrivileged(new d4(3)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        fieVar = new fie(provider3);
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    fieVar = new die(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                }
            } catch (NoSuchAlgorithmException e3) {
                is8.h(e3);
                return;
            }
        }
        d = fieVar;
    }

    public fie(Provider provider) {
        this.a = provider;
    }

    public static byte[] b(List list) {
        x52 x52Var = new x52();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rff rffVar = (rff) list.get(i);
            if (rffVar != rff.HTTP_1_0) {
                x52Var.Y0(rffVar.a.length());
                x52Var.g1(rffVar.a);
            }
        }
        return x52Var.j0(x52Var.b);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
