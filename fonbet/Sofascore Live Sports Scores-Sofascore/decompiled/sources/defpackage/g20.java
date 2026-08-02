package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class g20 extends gie implements dq3 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public g20() {
        j9i j9iVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            j9iVar = new j9i(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = j10.a;
            j10.a(e2, 5, jod.class.getName(), "unable to load android socket classes");
            j9iVar = null;
        }
        List x = ph0.x(new poh[]{j9iVar, new fv4(l30.e), new fv4(zk3.a), new fv4(p02.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) x).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((poh) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.dq3
    public final Context a() {
        return this.c;
    }

    @Override // defpackage.dq3
    public final void b(Context context) {
        this.c = context;
    }

    @Override // defpackage.gie
    public final ok3 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        t1k tp1Var;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        yx yxVar = x509TrustManagerExtensions != null ? new yx(x509TrustManager, x509TrustManagerExtensions) : null;
        if (yxVar != null) {
            return yxVar;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            tp1Var = new f20(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            tp1Var = new tp1((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new un1(tp1Var);
    }

    @Override // defpackage.gie
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((poh) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        poh pohVar = (poh) obj;
        if (pohVar != null) {
            pohVar.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.gie
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            cp4.i("Exception in connect", e2);
        }
    }

    @Override // defpackage.gie
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((poh) obj).a(sSLSocket)) {
                break;
            }
        }
        poh pohVar = (poh) obj;
        if (pohVar != null) {
            return pohVar.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.gie
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.gie
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // defpackage.gie
    public final void i(int i, String str) {
    }
}
