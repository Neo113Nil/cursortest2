package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gx extends gie implements dq3 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public gx() {
        List x = ph0.x(new poh[]{Build.VERSION.SDK_INT >= 29 ? new hx() : null, new fv4(l30.e), new fv4(zk3.a), new fv4(p02.a)});
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
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        yx yxVar = x509TrustManagerExtensions != null ? new yx(x509TrustManager, x509TrustManagerExtensions) : null;
        if (yxVar != null) {
            return yxVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new un1(new tp1((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
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
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // defpackage.gie
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.gie
    public final void i(int i, String str) {
        if (i == 5) {
            boolean z = g20.e;
        } else {
            boolean z2 = g20.e;
        }
    }

    @Override // defpackage.gie
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(obj, str);
        } else {
            obj.getClass();
            hc5.b(obj).warnIfOpen();
        }
    }

    @Override // defpackage.gie
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
