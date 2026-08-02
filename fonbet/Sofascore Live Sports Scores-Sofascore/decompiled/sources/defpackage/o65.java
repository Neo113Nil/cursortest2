package defpackage;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o65 extends z1a {
    public static final Logger A;
    public static final Set B;
    public static final boolean C;
    public static final boolean D;
    public static final boolean E;
    public static String F;
    public final jgf i;
    public final String l;
    public final String m;
    public final int n;
    public final meh o;
    public final long p;
    public final xx3 q;
    public final jfi r;
    public boolean s;
    public boolean t;
    public Executor u;
    public final boolean v;
    public final b59 w;
    public boolean x;
    public w1a y;
    public final Random j = new Random();
    public volatile int z = 1;
    public final AtomicReference k = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(o65.class.getName());
        A = logger;
        B = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        C = Boolean.parseBoolean(property);
        D = Boolean.parseBoolean(property2);
        E = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("xda", true, o65.class.getClassLoader()).asSubclass(xda.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public o65(String str, i3d i3dVar, meh mehVar, jfi jfiVar, boolean z) {
        z1a.y(i3dVar, "args");
        this.o = mehVar;
        URI create = URI.create("//".concat(str));
        z1a.q(str, "Invalid DNS name: %s", create.getHost() != null);
        String authority = create.getAuthority();
        z1a.x(authority, create, "nameUri (%s) doesn't have an authority");
        this.l = authority;
        this.m = create.getHost();
        if (create.getPort() == -1) {
            this.n = i3dVar.b;
        } else {
            this.n = create.getPort();
        }
        this.i = (jgf) i3dVar.c;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    A.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.p = j;
        this.r = jfiVar;
        this.q = (xx3) i3dVar.d;
        this.u = (irb) i3dVar.h;
        this.v = false;
        this.w = (b59) i3dVar.e;
    }

    public static Map c0(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            uaa.A(entry, "Bad key: %s", B.contains(entry.getKey()));
        }
        List M = aik.M("clientLanguage", map);
        if (M != null && !M.isEmpty()) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double N = aik.N("percentage", map);
        if (N != null) {
            int intValue = N.intValue();
            uaa.A(N, "Bad percentage: %s", intValue >= 0 && intValue <= 100);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List M2 = aik.M("clientHostname", map);
        if (M2 != null && !M2.isEmpty()) {
            Iterator it2 = M2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map P = aik.P("serviceConfig", map);
        if (P != null) {
            return P;
        }
        throw new fb3(String.format("key '%s' missing in '%s'", map, "serviceConfig"), 14);
    }

    public static ArrayList d0() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String substring = str.substring(12);
                Logger logger = qga.a;
                JsonReader jsonReader = new JsonReader(new StringReader(substring));
                try {
                    Object a = qga.a(jsonReader);
                    if (!(a instanceof List)) {
                        throw new ClassCastException(mz1.m(a, "wrong type "));
                    }
                    List list2 = (List) a;
                    aik.B(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                }
            } else {
                A.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // defpackage.z1a
    public final String K() {
        return this.l;
    }

    @Override // defpackage.z1a
    public final void W() {
        z1a.D("not started", this.y != null);
        e0();
    }

    @Override // defpackage.z1a
    public final void X() {
        if (this.t) {
            return;
        }
        this.t = true;
        Executor executor = this.u;
        if (executor == null || !this.v) {
            return;
        }
        neh.b(this.o, executor);
        this.u = null;
    }

    @Override // defpackage.z1a
    public final void Y(w1a w1aVar) {
        z1a.D("already started", this.y == null);
        if (this.v) {
            this.u = (Executor) neh.a(this.o);
        }
        this.y = w1aVar;
        e0();
    }

    public final x6k b0() {
        j3d j3dVar;
        j3d j3dVar2;
        List X;
        j3d j3dVar3;
        String str = this.m;
        boolean z = false;
        x6k x6kVar = new x6k(7, z);
        try {
            x6kVar.c = f0();
            if (!E) {
                return x6kVar;
            }
            List list = Collections.EMPTY_LIST;
            if (C) {
                if ("localhost".equalsIgnoreCase(str)) {
                    z = D;
                } else if (!str.contains(":")) {
                    boolean z2 = true;
                    for (int i = 0; i < str.length(); i++) {
                        char charAt = str.charAt(i);
                        if (charAt != '.') {
                            z2 &= charAt >= '0' && charAt <= '9';
                        }
                    }
                    z = !z2;
                }
            }
            Object obj = null;
            if (z && this.k.get() != null) {
                pvd.j();
                return null;
            }
            if (list.isEmpty()) {
                A.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.j;
                String str2 = F;
                if (str2 == null) {
                    try {
                        str2 = InetAddress.getLocalHost().getHostName();
                        F = str2;
                    } catch (UnknownHostException e) {
                        is8.h(e);
                        return null;
                    }
                }
                try {
                    Iterator it = d0().iterator();
                    Map map = null;
                    while (it.hasNext()) {
                        try {
                            map = c0((Map) it.next(), random, str2);
                            if (map != null) {
                                break;
                            }
                        } catch (RuntimeException e2) {
                            j3dVar = new j3d(xei.g.h("failed to pick service config choice").g(e2));
                        }
                    }
                    j3dVar = map == null ? null : new j3d(map);
                } catch (IOException | RuntimeException e3) {
                    j3dVar = new j3d(xei.g.h("failed to parse TXT records").g(e3));
                }
                if (j3dVar != null) {
                    xei xeiVar = j3dVar.a;
                    if (xeiVar != null) {
                        obj = new j3d(xeiVar);
                    } else {
                        Map map2 = (Map) j3dVar.b;
                        b59 b59Var = this.w;
                        b59Var.getClass();
                        try {
                            f4a f4aVar = (f4a) b59Var.e;
                            if (map2 != null) {
                                try {
                                    X = u6h.X(u6h.M(map2));
                                } catch (RuntimeException e4) {
                                    j3dVar3 = new j3d(xei.g.h("can't parse load balancer configuration").g(e4));
                                }
                            } else {
                                X = null;
                            }
                            j3dVar3 = (X == null || X.isEmpty()) ? null : u6h.R(X, (hfb) f4aVar.b);
                            if (j3dVar3 != null) {
                                xei xeiVar2 = j3dVar3.a;
                                if (xeiVar2 != null) {
                                    obj = new j3d(xeiVar2);
                                } else {
                                    obj = j3dVar3.b;
                                }
                            }
                            j3dVar2 = new j3d(yrb.a(map2, b59Var.b, b59Var.c, b59Var.d, obj));
                        } catch (RuntimeException e5) {
                            j3dVar2 = new j3d(xei.g.h("failed to parse service config").g(e5));
                        }
                        obj = j3dVar2;
                    }
                }
            }
            x6kVar.d = obj;
            return x6kVar;
        } catch (Exception e6) {
            x6kVar.b = xei.m.h("Unable to resolve host " + str).g(e6);
            return x6kVar;
        }
    }

    public final void e0() {
        if (this.x || this.t) {
            return;
        }
        if (this.s) {
            long j = this.p;
            if (j != 0 && (j <= 0 || this.r.a() <= j)) {
                return;
            }
        }
        this.x = true;
        this.u.execute(new pyn(this, this.y));
    }

    public final List f0() {
        try {
            try {
                int i = this.z;
                String str = this.m;
                if (i == 0) {
                    throw null;
                }
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new sp5(new InetSocketAddress((InetAddress) it.next(), this.n)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Object obj = mgj.a;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                A.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
