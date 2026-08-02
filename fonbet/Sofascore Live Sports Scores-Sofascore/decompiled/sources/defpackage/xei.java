package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xei {
    public static final List d;
    public static final xei e;
    public static final xei f;
    public static final xei g;
    public static final xei h;
    public static final xei i;
    public static final xei j;
    public static final xei k;
    public static final xei l;
    public static final xei m;
    public static final nic n;
    public static final nic o;
    public final vei a;
    public final String b;
    public final Throwable c;

    static {
        TreeMap treeMap = new TreeMap();
        for (vei veiVar : vei.values()) {
            xei xeiVar = (xei) treeMap.put(Integer.valueOf(veiVar.a), new xei(veiVar, null, null));
            if (xeiVar != null) {
                ilg.j("Code value duplication between ", xeiVar.a.name(), " & ", veiVar.name());
                return;
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        e = vei.OK.d();
        f = vei.CANCELLED.d();
        g = vei.UNKNOWN.d();
        vei.INVALID_ARGUMENT.d();
        h = vei.DEADLINE_EXCEEDED.d();
        vei.NOT_FOUND.d();
        vei.ALREADY_EXISTS.d();
        i = vei.PERMISSION_DENIED.d();
        vei.UNAUTHENTICATED.d();
        j = vei.RESOURCE_EXHAUSTED.d();
        k = vei.FAILED_PRECONDITION.d();
        vei.ABORTED.d();
        vei.OUT_OF_RANGE.d();
        vei.UNIMPLEMENTED.d();
        l = vei.INTERNAL.d();
        m = vei.UNAVAILABLE.d();
        vei.DATA_LOSS.d();
        wje wjeVar = new wje(3);
        BitSet bitSet = mic.d;
        n = new nic("grpc-status", false, wjeVar);
        o = new nic("grpc-message", false, new a99(7));
    }

    public xei(vei veiVar, String str, Throwable th) {
        this.a = veiVar;
        this.b = str;
        this.c = th;
    }

    public static String c(xei xeiVar) {
        String str = xeiVar.b;
        vei veiVar = xeiVar.a;
        if (str == null) {
            return veiVar.toString();
        }
        return veiVar + ": " + xeiVar.b;
    }

    public static xei d(int i2) {
        if (i2 >= 0) {
            List list = d;
            if (i2 < list.size()) {
                return (xei) list.get(i2);
            }
        }
        return g.h("Unknown code " + i2);
    }

    public static xei e(Throwable th) {
        z1a.y(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof zei) {
                return ((zei) th2).a;
            }
            if (th2 instanceof dfi) {
                return ((dfi) th2).a;
            }
        }
        return g.g(th);
    }

    public final dfi a() {
        return new dfi(this, null);
    }

    public final xei b(String str) {
        Throwable th = this.c;
        String str2 = this.b;
        vei veiVar = this.a;
        return str2 == null ? new xei(veiVar, str, th) : new xei(veiVar, lnb.o(str2, "\n", str), th);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final boolean f() {
        return vei.OK == this.a;
    }

    public final xei g(Throwable th) {
        return sha.r(this.c, th) ? this : new xei(this.a, this.b, th);
    }

    public final xei h(String str) {
        return sha.r(this.b, str) ? this : new xei(this.a, str, this.c);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a.name(), "code");
        I.e(this.b, "description");
        Throwable th = this.c;
        Object obj = th;
        if (th != null) {
            Object obj2 = mgj.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        I.e(obj, "cause");
        return I.toString();
    }
}
