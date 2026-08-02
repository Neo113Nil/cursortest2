package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qvd {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public String c = null;
    public SSLContext d = null;
    public int e = 60;
    public final Duration f = vvd.y;
    public final Duration g = vvd.z;
    public final Duration h = vvd.A;
    public Duration i = vvd.B;
    public final Duration j = vvd.C;
    public final Duration k = vvd.D;
    public final Duration l = vvd.E;
    public final Duration m = vvd.F;
    public final svd n = new svd();
    public boolean o = false;
    public yp5 p = null;
    public bij q = null;
    public i1 r = null;
    public final String s = vvd.H;
    public boolean t;
    public boolean u;

    public final vvd a() {
        boolean z;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            b("nats://localhost:4222");
            z = false;
        } else {
            z = true;
        }
        if (this.d == null) {
            if (!this.t && !this.u && z) {
                for (int i = 0; this.d == null && i < arrayList.size(); i++) {
                    String scheme = ((v5d) arrayList.get(i)).a.getScheme();
                    scheme.getClass();
                    switch (scheme) {
                        case "opentls":
                            this.u = true;
                            break;
                        case "tls":
                        case "wss":
                            this.t = true;
                            break;
                    }
                }
            }
            if (this.u) {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                    sSLContext.init(null, yqo.f, ilf.a);
                    this.d = sSLContext;
                } catch (GeneralSecurityException e) {
                    sw9.m("Unable to create SSL context", e);
                    return null;
                }
            } else if (this.t) {
                try {
                    this.d = SSLContext.getDefault();
                } catch (NoSuchAlgorithmException e2) {
                    sw9.m("Unable to create default SSL context", e2);
                    return null;
                }
            }
        }
        Duration duration = this.j;
        if (duration != null && duration.toNanos() < 100) {
            a70.p("Socket Write Timeout cannot be less than 100 nanoseconds.");
            return null;
        }
        if (this.p == null) {
            this.p = new yp5();
        }
        if (this.q != null) {
            this.o = true;
        } else if (this.o) {
            this.q = new i3c(29);
        } else {
            this.q = new pvd(0);
        }
        return new vvd(this);
    }

    public final void b(String str) {
        String[] split = str.trim().split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        ArrayList arrayList = this.a;
        for (String str2 : split) {
            if (str2 != null && !str2.isEmpty()) {
                try {
                    String trim = str2.trim();
                    v5d v5dVar = new v5d(trim, null);
                    if (!arrayList.contains(v5dVar)) {
                        arrayList.add(v5dVar);
                        this.b.add(trim);
                    }
                } catch (URISyntaxException e) {
                    ilg.k(e);
                    return;
                }
            }
        }
    }
}
