package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jgf {
    public static final Logger c = Logger.getLogger(jgf.class.getName());
    public static final igf d = new igf(0);
    public static final l49 e = new l49(1);
    public final tmi a;
    public final InetSocketAddress b;

    public jgf() {
        String str = System.getenv("GRPC_PROXY_EXP");
        l49 l49Var = e;
        l49Var.getClass();
        this.a = l49Var;
        d.getClass();
        if (str == null) {
            this.b = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        c.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.b = new InetSocketAddress(split[0], parseInt);
    }

    public final ki9 a(InetSocketAddress inetSocketAddress) {
        URL url;
        ki9 ki9Var;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.b;
            if (inetSocketAddress2 != null) {
                return new ki9(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = c;
            try {
                try {
                    URI uri = new URI(HttpRequest.DEFAULT_SCHEME, null, n49.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> select = proxySelector.select(uri);
                    if (select.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String d2 = n49.d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        try {
                            url = new URL(HttpRequest.DEFAULT_SCHEME, d2, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{HttpRequest.DEFAULT_SCHEME, d2});
                            url = null;
                        }
                        PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(d2, address, port, HttpRequest.DEFAULT_SCHEME, "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i = ki9.e;
                        if (requestPasswordAuthentication == null) {
                            ki9Var = new ki9(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            ki9Var = new ki9(inetSocketAddress3, inetSocketAddress, requestPasswordAuthentication.getUserName(), requestPasswordAuthentication.getPassword() != null ? new String(requestPasswordAuthentication.getPassword()) : null);
                        }
                        return ki9Var;
                    }
                } catch (URISyntaxException e2) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
