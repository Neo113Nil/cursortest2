package p002if;

import We.F;
import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jf.C7418c;
import jf.C7419d;
import jf.g;
import jf.h;
import jf.i;
import jf.k;
import jf.l;
import jf.m;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* renamed from: if.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7067a extends j {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f66369e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1097a f66370f = new C1097a();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f66371d;

    /* renamed from: if.a$a, reason: collision with other inner class name */
    public static final class C1097a {
    }

    static {
        boolean z11 = false;
        j.f66400c.getClass();
        if (j.a.c() && Build.VERSION.SDK_INT >= 29) {
            z11 = true;
        }
        f66369e = z11;
    }

    public C7067a() {
        g gVar;
        k.a aVar;
        i.a aVar2;
        C7418c.f69979a.getClass();
        j.f66400c.getClass();
        C7418c c7418c = (!j.a.c() || Build.VERSION.SDK_INT < 29) ? null : new C7418c();
        gVar = h.f69986f;
        l lVar = new l(gVar);
        aVar = k.f69997a;
        l lVar2 = new l(aVar);
        aVar2 = i.f69993a;
        m[] elements = {c7418c, lVar, lVar2, new l(aVar2)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = B11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f66371d = arrayList;
    }

    @Override // p002if.j
    @NotNull
    public final AbstractC7947c c(@NotNull X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C7419d c7419d = x509TrustManagerExtensions != null ? new C7419d(trustManager, x509TrustManagerExtensions) : null;
        return c7419d != null ? c7419d : super.c(trustManager);
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f66371d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f66371d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sslSocket);
        }
        return null;
    }

    @Override // p002if.j
    @SuppressLint({"NewApi"})
    public final boolean i(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
