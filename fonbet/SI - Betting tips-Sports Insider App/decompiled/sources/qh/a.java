package qh;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import rh.h;
import rh.k;
import rh.m;
import rh.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22182e;

    /* renamed from: c, reason: collision with root package name */
    public Context f22183c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22184d;

    static {
        f22182e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        n[] elements = {Build.VERSION.SDK_INT >= 29 ? new rh.a() : null, new m(rh.e.f22521f), new m(k.f22534a), new m(h.f22532a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList q = p.q(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f22184d = arrayList;
    }

    @Override // qh.d
    public final void a(Context context) {
        this.f22183c = context;
    }

    @Override // qh.d
    public final Context b() {
        return this.f22183c;
    }

    @Override // qh.e
    public final y4.a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        rh.b bVar = x509TrustManagerExtensions != null ? new rh.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // qh.e
    public final uh.d d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // qh.e
    public final void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f22184d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n) obj).b(sslSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.c(sslSocket, str, protocols);
        }
    }

    @Override // qh.e
    public final String g(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f22184d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n) obj).b(sslSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.a(sslSocket);
        }
        return null;
    }

    @Override // qh.e
    public final Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // qh.e
    public final boolean i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // qh.e
    public final void j(int i5, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i5 == 5) {
            boolean z5 = c.f22187e;
            w0.n("OkHttp", message, th2);
        } else {
            boolean z7 = c.f22187e;
            Log.i("OkHttp", message, th2);
        }
    }

    @Override // qh.e
    public final void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // qh.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
