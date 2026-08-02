package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qrb extends drb implements e8a {
    public static final Logger c0 = Logger.getLogger(qrb.class.getName());
    public static final Pattern d0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final xei e0;
    public static final xei f0;
    public static final yrb g0;
    public static final erb h0;
    public static final nv4 i0;
    public final HashSet A;
    public LinkedHashSet B;
    public final Object C;
    public final HashSet D;
    public final sv4 E;
    public final ujg F;
    public final AtomicBoolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final ug5 K;
    public final x6k L;
    public final jo2 M;
    public final bo2 N;
    public final b8a O;
    public final nrb P;
    public yrb Q;
    public boolean R;
    public final boolean S;
    public final yia T;
    public final long U;
    public final long V;
    public final boolean W;
    public final ccd X;
    public final m8a Y;
    public final ggf Z;
    public final f8a a;
    public final v0g a0;
    public final String b;
    public int b0;
    public final m3d c;
    public final i3d d;
    public final f4a e;
    public final eh2 f;
    public final orb g;
    public final Executor h;
    public final e3c i;
    public final irb j;
    public final irb k;
    public final f7a l;
    public final xx3 m;
    public final om4 n;
    public final gh3 o;
    public final tmi p;
    public final long q;
    public final ggf r;
    public final ccd s;
    public final mn2 t;
    public final ArrayList u;
    public c4g v;
    public boolean w;
    public jrb x;
    public volatile dfb y;
    public boolean z;

    static {
        xei xeiVar = xei.m;
        xeiVar.h("Channel shutdownNow invoked");
        e0 = xeiVar.h("Channel shutdown invoked");
        f0 = xeiVar.h("Subchannel shutdown invoked");
        g0 = new yrb(null, new HashMap(), new HashMap(), null, null, null);
        h0 = new erb();
        i0 = new nv4(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [px2] */
    public qrb(rrb rrbVar, fod fodVar, ccd ccdVar, e3c e3cVar, tmi tmiVar, ArrayList arrayList) {
        int i;
        f7a f7aVar = f7a.m;
        int i2 = 1;
        xx3 xx3Var = new xx3(new bw3(this, i2));
        this.m = xx3Var;
        ggf ggfVar = new ggf();
        ggfVar.a = new ArrayList();
        ggfVar.b = rk3.d;
        this.r = ggfVar;
        this.A = new HashSet(16, 0.75f);
        this.C = new Object();
        this.D = new HashSet(1, 0.75f);
        this.F = new ujg(this);
        this.G = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.b0 = 1;
        this.Q = g0;
        this.R = false;
        this.T = new yia((byte) 0, 13);
        this.X = hl4.c;
        d4a d4aVar = new d4a(this, 4);
        this.Y = new m8a(this, i2);
        this.Z = new ggf(this);
        String str = rrbVar.g;
        z1a.y(str, "target");
        this.b = str;
        f8a f8aVar = new f8a("Channel", str, f8a.d.incrementAndGet());
        this.a = f8aVar;
        this.l = f7aVar;
        e3c e3cVar2 = rrbVar.b;
        z1a.y(e3cVar2, "executorPool");
        this.i = e3cVar2;
        Executor executor = (Executor) neh.a((meh) e3cVar2.b);
        z1a.y(executor, "executor");
        this.h = executor;
        e3c e3cVar3 = rrbVar.c;
        z1a.y(e3cVar3, "offloadExecutorPool");
        irb irbVar = new irb(e3cVar3);
        this.k = irbVar;
        eh2 eh2Var = new eh2(fodVar, irbVar);
        this.f = eh2Var;
        orb orbVar = new orb(fodVar.d);
        this.g = orbVar;
        jo2 jo2Var = new jo2(f8aVar, f7aVar.l(), lnb.o("Channel for '", str, "'"));
        this.M = jo2Var;
        bo2 bo2Var = new bo2(jo2Var, f7aVar);
        this.N = bo2Var;
        jgf jgfVar = n49.m;
        boolean z = rrbVar.p;
        this.W = z;
        f4a f4aVar = new f4a(rrbVar.h);
        this.e = f4aVar;
        m3d m3dVar = rrbVar.e;
        this.c = m3dVar;
        b59 b59Var = new b59(z, rrbVar.l, rrbVar.m, f4aVar);
        int i3 = ((god) rrbVar.y.b).h;
        int C = wt3.C(i3);
        if (C == 0) {
            i = 443;
        } else if (C == 1) {
            i = 80;
        } else {
            a70.j(lnb.z(i3).concat(" not handled"));
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        jgfVar.getClass();
        i3d i3dVar = new i3d(valueOf, jgfVar, xx3Var, b59Var, orbVar, bo2Var, irbVar);
        this.d = i3dVar;
        this.v = h(str, m3dVar, i3dVar, Collections.singleton(InetSocketAddress.class));
        this.j = new irb(e3cVar);
        sv4 sv4Var = new sv4(executor, xx3Var);
        this.E = sv4Var;
        sv4Var.c(d4aVar);
        this.s = ccdVar;
        boolean z2 = rrbVar.r;
        this.S = z2;
        nrb nrbVar = new nrb(this, this.v.K());
        this.P = nrbVar;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nrbVar = new px2(nrbVar, (fjc) it.next());
        }
        this.t = nrbVar;
        this.u = new ArrayList(rrbVar.f);
        z1a.y(tmiVar, "stopwatchSupplier");
        this.p = tmiVar;
        long j = rrbVar.k;
        if (j == -1) {
            this.q = j;
        } else {
            z1a.p(j, j >= rrb.B, "invalid idleTimeoutMillis %s");
            this.q = rrbVar.k;
        }
        this.a0 = new v0g(new b8(this, 25), xx3Var, eh2Var.a.d, (jfi) tmiVar.get());
        om4 om4Var = rrbVar.i;
        z1a.y(om4Var, "decompressorRegistry");
        this.n = om4Var;
        gh3 gh3Var = rrbVar.j;
        z1a.y(gh3Var, "compressorRegistry");
        this.o = gh3Var;
        this.V = rrbVar.n;
        this.U = rrbVar.o;
        this.K = new ug5();
        this.L = new x6k(4);
        b8a b8aVar = rrbVar.q;
        b8aVar.getClass();
        this.O = b8aVar;
        if (z2) {
            return;
        }
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c4g h(String str, m3d m3dVar, i3d i3dVar, Collection collection) {
        URI uri;
        l3d l3dVar;
        i3d i3dVar2;
        String str2;
        String str3;
        String str4;
        lv9 lv9Var;
        lv9 lv9Var2;
        StringBuilder sb = new StringBuilder();
        o65 o65Var = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                synchronized (m3dVar) {
                    lv9Var2 = m3dVar.c;
                }
                l3dVar = (l3d) ((awf) lv9Var2).get(scheme.toLowerCase(Locale.US));
                if (l3dVar == null && !d0.matcher(str).matches()) {
                    try {
                        synchronized (m3dVar) {
                            str4 = m3dVar.a;
                        }
                        uri = new URI(str4, "", "/" + str, null);
                        String scheme2 = uri.getScheme();
                        if (scheme2 == null) {
                            l3dVar = null;
                        } else {
                            synchronized (m3dVar) {
                                lv9Var = m3dVar.c;
                            }
                            l3dVar = (l3d) ((awf) lv9Var).get(scheme2.toLowerCase(Locale.US));
                        }
                    } catch (URISyntaxException e2) {
                        ilg.k(e2);
                        return null;
                    }
                }
                if (l3dVar != null) {
                    if (sb.length() > 0) {
                        str3 = " (" + ((Object) sb) + ")";
                    } else {
                        str3 = "";
                    }
                    throw new IllegalArgumentException(lnb.o("Could not find a NameResolverProvider for ", str, str3));
                }
                if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
                    a70.p(bf3.k("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
                    return null;
                }
                if ("dns".equals(uri.getScheme())) {
                    String path = uri.getPath();
                    z1a.y(path, "targetPath");
                    z1a.u(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
                    String substring = path.substring(1);
                    uri.getAuthority();
                    i3dVar2 = i3dVar;
                    o65Var = new o65(substring, i3dVar2, n49.p, new jfi(), p65.a);
                } else {
                    i3dVar2 = i3dVar;
                }
                if (o65Var != null) {
                    ccd ccdVar = new ccd();
                    orb orbVar = (orb) i3dVar2.f;
                    xx3 xx3Var = (xx3) i3dVar2.d;
                    return new c4g(o65Var, new az0(ccdVar, orbVar, xx3Var), xx3Var);
                }
                if (sb.length() > 0) {
                    str2 = " (" + ((Object) sb) + ")";
                } else {
                    str2 = "";
                }
                throw new IllegalArgumentException(lnb.o("cannot create a NameResolver for ", str, str2));
            }
            m3dVar.getClass();
        }
        l3dVar = null;
        if (l3dVar == null) {
            synchronized (m3dVar) {
            }
        }
        if (l3dVar != null) {
        }
    }

    @Override // defpackage.e8a
    public final f8a b() {
        return this.a;
    }

    @Override // defpackage.mn2
    public final String e() {
        return this.t.e();
    }

    @Override // defpackage.mn2
    public final wkn f(ujg ujgVar, jh2 jh2Var) {
        return this.t.f(ujgVar, jh2Var);
    }

    public final void g() {
        this.m.i();
        if (this.G.get() || this.z) {
            return;
        }
        if (((Set) this.Y.b).isEmpty()) {
            j();
        } else {
            this.a0.f = false;
        }
        if (this.x != null) {
            return;
        }
        this.N.D(2, "Exiting idle mode");
        jrb jrbVar = new jrb(this);
        f4a f4aVar = this.e;
        f4aVar.getClass();
        jrbVar.h = new g7h(f4aVar, jrbVar);
        this.x = jrbVar;
        this.v.Y(new krb(this, jrbVar, this.v));
        this.w = true;
    }

    public final void i() {
        if (!this.I && this.G.get() && this.A.isEmpty() && this.D.isEmpty()) {
            this.N.D(2, "Terminated");
            e3c e3cVar = this.i;
            neh.b((meh) e3cVar.b, this.h);
            irb irbVar = this.j;
            synchronized (irbVar) {
                Executor executor = irbVar.b;
                if (executor != null) {
                    neh.b((meh) ((e3c) irbVar.c).b, executor);
                    irbVar.b = null;
                }
            }
            irb irbVar2 = this.k;
            synchronized (irbVar2) {
                Executor executor2 = irbVar2.b;
                if (executor2 != null) {
                    neh.b((meh) ((e3c) irbVar2.c).b, executor2);
                    irbVar2.b = null;
                }
            }
            this.f.close();
            this.I = true;
            this.J.countDown();
        }
    }

    public final void j() {
        long j = this.q;
        if (j == -1) {
            return;
        }
        v0g v0gVar = this.a0;
        v0gVar.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a = v0gVar.d.a() + nanos;
        int i = 1;
        v0gVar.f = true;
        if (a - v0gVar.e < 0 || v0gVar.g == null) {
            ScheduledFuture scheduledFuture = v0gVar.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            v0gVar.g = v0gVar.a.schedule(new u0g(v0gVar, i), nanos, TimeUnit.NANOSECONDS);
        }
        v0gVar.e = a;
    }

    public final void k(boolean z) {
        this.m.i();
        if (z) {
            z1a.D("nameResolver is not started", this.w);
            z1a.D("lbHelper is null", this.x != null);
        }
        c4g c4gVar = this.v;
        if (c4gVar != null) {
            c4gVar.X();
            this.w = false;
            if (z) {
                String str = this.b;
                m3d m3dVar = this.c;
                i3d i3dVar = this.d;
                fod fodVar = this.f.a;
                this.v = h(str, m3dVar, i3dVar, Collections.singleton(InetSocketAddress.class));
            } else {
                this.v = null;
            }
        }
        jrb jrbVar = this.x;
        if (jrbVar != null) {
            g7h g7hVar = jrbVar.h;
            ((ffb) g7hVar.c).z();
            g7hVar.c = null;
            this.x = null;
        }
        this.y = null;
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.c(this.a.c, "logId");
        I.e(this.b, "target");
        return I.toString();
    }
}
