package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class iod {
    public int A;
    public int B;
    public int C;
    public long D;
    public cqa E;
    public cui F;
    public t9d b;
    public yhk e;
    public boolean f;
    public boolean g;
    public qp0 h;
    public boolean i;
    public boolean j;
    public ss3 k;
    public ie2 l;
    public tnf m;
    public ProxySelector n;
    public a99 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public xm2 v;
    public ok3 w;
    public int x;
    public int y;
    public int z;
    public w45 a = new w45();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public iod() {
        TimeZone timeZone = yol.a;
        this.e = new yhk();
        this.f = true;
        this.g = true;
        a99 a99Var = qp0.g7;
        this.h = a99Var;
        this.i = true;
        this.j = true;
        this.k = ss3.m7;
        this.m = tnf.c;
        this.o = a99Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = jod.H;
        this.t = jod.G;
        this.u = znd.a;
        this.v = xm2.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.C = 60000;
        this.D = 1024L;
    }

    public final void a(q7a q7aVar) {
        q7aVar.getClass();
        this.c.add(q7aVar);
    }

    public final void b(q7a q7aVar) {
        q7aVar.getClass();
        this.d.add(q7aVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.y = yol.b("timeout", j, timeUnit);
    }

    public final void d(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.z = yol.b("timeout", j, timeUnit);
    }
}
