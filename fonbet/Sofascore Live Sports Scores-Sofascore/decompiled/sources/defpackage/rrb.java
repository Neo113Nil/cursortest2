package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rrb extends kda {
    public static final Method F;
    public final e3c b;
    public final e3c c;
    public final ArrayList d;
    public final m3d e;
    public final ArrayList f;
    public final String g;
    public final String h;
    public final om4 i;
    public final gh3 j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final long o;
    public final boolean p;
    public final b8a q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final d4a x;
    public final bka y;
    public static final Logger z = Logger.getLogger(rrb.class.getName());
    public static final long A = 1800000;
    public static final long B = 1000;
    public static final e3c C = new e3c(n49.p, 12);
    public static final om4 D = om4.d;
    public static final gh3 E = gh3.b;

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            z.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            method = null;
            F = method;
        } catch (NoSuchMethodException e2) {
            z.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            method = null;
            F = method;
        }
        F = method;
    }

    public rrb(String str, d4a d4aVar, bka bkaVar) {
        m3d m3dVar;
        e3c e3cVar = C;
        this.b = e3cVar;
        this.c = e3cVar;
        this.d = new ArrayList();
        Logger logger = m3d.d;
        synchronized (m3d.class) {
            try {
                if (m3d.e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z2 = p65.a;
                        arrayList.add(p65.class);
                    } catch (ClassNotFoundException e) {
                        m3d.d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<l3d> L = b0a.L(l3d.class, Collections.unmodifiableList(arrayList), l3d.class.getClassLoader(), new wib(28));
                    if (L.isEmpty()) {
                        m3d.d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    m3d.e = new m3d();
                    for (l3d l3dVar : L) {
                        m3d.d.fine("Service loader found " + l3dVar);
                        m3d m3dVar2 = m3d.e;
                        synchronized (m3dVar2) {
                            l3dVar.getClass();
                            m3dVar2.b.add(l3dVar);
                        }
                    }
                    m3d.e.a();
                }
                m3dVar = m3d.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = m3dVar;
        this.f = new ArrayList();
        this.h = "pick_first";
        this.i = D;
        this.j = E;
        this.k = A;
        this.l = 5;
        this.m = 5;
        this.n = 16777216L;
        this.o = 1048576L;
        this.p = true;
        this.q = b8a.e;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        z1a.y(str, "target");
        this.g = str;
        this.x = d4aVar;
        this.y = bkaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final drb a0() {
        SSLSocketFactory sSLSocketFactory;
        fjc fjcVar;
        fjc fjcVar2;
        god godVar = (god) this.x.b;
        boolean z2 = godVar.i != Long.MAX_VALUE;
        e3c e3cVar = godVar.d;
        e3c e3cVar2 = godVar.e;
        int i = godVar.h;
        int C2 = wt3.C(i);
        if (C2 == 0) {
            try {
                SSLSocketFactory sSLSocketFactory2 = godVar.f;
                if (sSLSocketFactory2 == null) {
                    sSLSocketFactory2 = SSLContext.getInstance("Default", fie.d.a).getSocketFactory();
                    godVar.f = sSLSocketFactory2;
                }
                sSLSocketFactory = sSLSocketFactory2;
            } catch (GeneralSecurityException e) {
                vp2.e("TLS Provider failure", e);
                return null;
            }
        } else {
            if (C2 != 1) {
                cp4.h("Unknown negotiation type: ".concat(lnb.z(i)));
                return null;
            }
            sSLSocketFactory = null;
        }
        fod fodVar = new fod(e3cVar, e3cVar2, sSLSocketFactory, godVar.g, godVar.l, z2, godVar.i, godVar.j, godVar.k, godVar.m, godVar.c);
        ccd ccdVar = new ccd();
        e3c e3cVar3 = new e3c(n49.p, 12);
        l49 l49Var = n49.r;
        ArrayList arrayList = new ArrayList(this.d);
        synchronized (rz8.class) {
        }
        if (this.s) {
            Method method = F;
            if (method != null) {
                try {
                    fjcVar2 = (fjc) method.invoke(null, Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.FALSE, Boolean.valueOf(this.v));
                } catch (IllegalAccessException e2) {
                    z.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                } catch (InvocationTargetException e3) {
                    z.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
                }
                if (fjcVar2 != null) {
                    arrayList.add(0, fjcVar2);
                }
            }
            fjcVar2 = null;
            if (fjcVar2 != null) {
            }
        }
        if (this.w) {
            try {
                fjcVar = (fjc) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e4) {
                z.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
                fjcVar = null;
                if (fjcVar != null) {
                }
                return new trb(new qrb(this, fodVar, ccdVar, e3cVar3, l49Var, arrayList));
            } catch (IllegalAccessException e5) {
                z.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
                fjcVar = null;
                if (fjcVar != null) {
                }
                return new trb(new qrb(this, fodVar, ccdVar, e3cVar3, l49Var, arrayList));
            } catch (NoSuchMethodException e6) {
                z.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
                fjcVar = null;
                if (fjcVar != null) {
                }
                return new trb(new qrb(this, fodVar, ccdVar, e3cVar3, l49Var, arrayList));
            } catch (InvocationTargetException e7) {
                z.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
                fjcVar = null;
                if (fjcVar != null) {
                }
                return new trb(new qrb(this, fodVar, ccdVar, e3cVar3, l49Var, arrayList));
            }
            if (fjcVar != null) {
                arrayList.add(0, fjcVar);
            }
        }
        return new trb(new qrb(this, fodVar, ccdVar, e3cVar3, l49Var, arrayList));
    }
}
