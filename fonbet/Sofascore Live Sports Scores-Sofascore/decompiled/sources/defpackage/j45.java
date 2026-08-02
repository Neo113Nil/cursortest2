package defpackage;

import com.ironsource.U3;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j45 implements AutoCloseable {
    public static final Regex r = new Regex("[a-z0-9_-]{1,120}");
    public final uae a;
    public final long b;
    public final uae c;
    public final uae d;
    public final uae e;
    public final LinkedHashMap f;
    public final ad2 g;
    public final Object h;
    public long i;
    public int j;
    public kof k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final g45 q;

    public j45(s18 s18Var, uae uaeVar, CoroutineContext coroutineContext, long j) {
        this.a = uaeVar;
        this.b = j;
        if (j <= 0) {
            a70.p("maxSize <= 0");
            throw null;
        }
        this.c = uaeVar.e("journal");
        this.d = uaeVar.e("journal.tmp");
        this.e = uaeVar.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext plus = coroutineContext.plus(tz9.o());
        CoroutineContext.Element element = coroutineContext.get(d.Q7);
        au3 au3Var = element instanceof au3 ? (au3) element : null;
        if (au3Var == null) {
            hs4 hs4Var = z45.a;
            au3Var = hq4.c;
        }
        zt3 zt3Var = au3.b;
        this.g = s9a.c(plus.plus(au3Var.f0(1)));
        this.h = new Object();
        this.q = new g45(s18Var);
    }

    public static void H(String str) {
        if (r.f(str)) {
            return;
        }
        ogj.h(lnb.o("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        t(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        while (this.i > this.b) {
            for (y35 y35Var : this.f.values()) {
                if (!y35Var.f) {
                    break;
                }
            }
            return;
        }
        this.o = false;
    }

    public final void M() {
        Throwable th;
        synchronized (this.h) {
            try {
                kof kofVar = this.k;
                if (kofVar != null) {
                    kofVar.close();
                }
                kof n = o6a.n(this.q.H(this.d, false));
                try {
                    n.S("libcore.io.DiskLruCache");
                    n.writeByte(10);
                    n.S("1");
                    n.writeByte(10);
                    n.m(3L);
                    n.writeByte(10);
                    n.m(2L);
                    n.writeByte(10);
                    n.writeByte(10);
                    for (y35 y35Var : this.f.values()) {
                        if (y35Var.g != null) {
                            n.S("DIRTY");
                            n.writeByte(32);
                            n.S(y35Var.a);
                            n.writeByte(10);
                        } else {
                            n.S("CLEAN");
                            n.writeByte(32);
                            n.S(y35Var.a);
                            for (long j : y35Var.b) {
                                n.writeByte(32);
                                n.m(j);
                            }
                            n.writeByte(10);
                        }
                    }
                    Unit unit = Unit.a;
                    try {
                        n.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        n.close();
                    } catch (Throwable th4) {
                        de6.a(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean k = this.q.k(this.c);
                g45 g45Var = this.q;
                if (k) {
                    g45Var.f(this.c, this.e);
                    this.q.f(this.d, this.c);
                    this.q.i(this.e);
                } else {
                    g45Var.f(this.d, this.c);
                }
                this.k = new kof(new hv4(this.q.e(this.c), new kz3(this, 11), 1));
                this.j = 0;
                this.l = false;
                this.p = false;
                Unit unit2 = Unit.a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.m && !this.n) {
                    for (y35 y35Var : (y35[]) this.f.values().toArray(new y35[0])) {
                        en0 en0Var = y35Var.g;
                        if (en0Var != null) {
                            y35 y35Var2 = (y35) en0Var.c;
                            if (Intrinsics.c(y35Var2.g, en0Var)) {
                                y35Var2.f = true;
                            }
                        }
                    }
                    C();
                    s9a.o(this.g, null);
                    kof kofVar = this.k;
                    kofVar.getClass();
                    kofVar.close();
                    this.k = null;
                    this.n = true;
                    Unit unit = Unit.a;
                    return;
                }
                this.n = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        if ((r10.j >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:30:0x005a, B:31:0x0069, B:33:0x0079, B:35:0x0080, B:38:0x005e, B:40:0x00a0, B:42:0x00a7, B:45:0x00ac, B:47:0x00bd, B:50:0x00c2, B:51:0x00fd, B:53:0x0108, B:57:0x0114, B:60:0x0111, B:61:0x00da, B:63:0x00ef, B:65:0x00fa, B:68:0x0090, B:70:0x0118, B:71:0x011f), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(en0 en0Var, boolean z) {
        synchronized (this.h) {
            y35 y35Var = (y35) en0Var.c;
            if (!Intrinsics.c(y35Var.g, en0Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || y35Var.f) {
                for (int i = 0; i < 2; i++) {
                    this.q.j((uae) y35Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) en0Var.d)[i2] && !this.q.k((uae) y35Var.d.get(i2))) {
                        en0Var.j(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    uae uaeVar = (uae) y35Var.d.get(i3);
                    uae uaeVar2 = (uae) y35Var.c.get(i3);
                    boolean k = this.q.k(uaeVar);
                    g45 g45Var = this.q;
                    if (k) {
                        g45Var.f(uaeVar, uaeVar2);
                    } else {
                        v9g.A(g45Var, (uae) y35Var.c.get(i3));
                    }
                    long j = y35Var.b[i3];
                    Long l = (Long) this.q.n(uaeVar2).e;
                    long longValue = l != null ? l.longValue() : 0L;
                    y35Var.b[i3] = longValue;
                    this.i = (this.i - j) + longValue;
                }
            }
            y35Var.g = null;
            if (y35Var.f) {
                t(y35Var);
                return;
            }
            this.j++;
            kof kofVar = this.k;
            kofVar.getClass();
            if (!z && !y35Var.e) {
                this.f.remove(y35Var.a);
                kofVar.S("REMOVE");
                kofVar.writeByte(32);
                kofVar.S(y35Var.a);
                kofVar.writeByte(10);
                kofVar.flush();
                if (this.i <= this.b) {
                }
                k();
                Unit unit = Unit.a;
            }
            y35Var.e = true;
            kofVar.S("CLEAN");
            kofVar.writeByte(32);
            kofVar.S(y35Var.a);
            for (long j2 : y35Var.b) {
                kofVar.writeByte(32);
                kofVar.m(j2);
            }
            kofVar.writeByte(10);
            kofVar.flush();
            if (this.i <= this.b) {
            }
            k();
            Unit unit2 = Unit.a;
        }
    }

    public final en0 f(String str) {
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            H(str);
            h();
            y35 y35Var = (y35) this.f.get(str);
            if ((y35Var != null ? y35Var.g : null) != null) {
                return null;
            }
            if (y35Var != null && y35Var.h != 0) {
                return null;
            }
            if (!this.o && !this.p) {
                kof kofVar = this.k;
                kofVar.getClass();
                kofVar.S("DIRTY");
                kofVar.writeByte(32);
                kofVar.S(str);
                kofVar.writeByte(10);
                kofVar.flush();
                if (this.l) {
                    return null;
                }
                if (y35Var == null) {
                    y35Var = new y35(this, str);
                    this.f.put(str, y35Var);
                }
                en0 en0Var = new en0(this, y35Var);
                y35Var.g = en0Var;
                return en0Var;
            }
            k();
            return null;
        }
    }

    public final c45 g(String str) {
        c45 a;
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            H(str);
            h();
            y35 y35Var = (y35) this.f.get(str);
            if (y35Var != null && (a = y35Var.a()) != null) {
                boolean z = true;
                this.j++;
                kof kofVar = this.k;
                kofVar.getClass();
                kofVar.S("READ");
                kofVar.writeByte(32);
                kofVar.S(str);
                kofVar.writeByte(10);
                kofVar.flush();
                if (this.j < 2000) {
                    z = false;
                }
                if (z) {
                    k();
                }
                return a;
            }
            return null;
        }
    }

    public final void h() {
        synchronized (this.h) {
            try {
                if (this.m) {
                    return;
                }
                this.q.i(this.d);
                if (this.q.k(this.e)) {
                    boolean k = this.q.k(this.c);
                    g45 g45Var = this.q;
                    uae uaeVar = this.e;
                    if (k) {
                        g45Var.i(uaeVar);
                    } else {
                        g45Var.f(uaeVar, this.c);
                    }
                }
                if (this.q.k(this.c)) {
                    try {
                        n();
                        m();
                        this.m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            v9g.B(this.q, this.a);
                            this.n = false;
                        } catch (Throwable th) {
                            this.n = false;
                            throw th;
                        }
                    }
                }
                M();
                this.m = true;
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        xw3.L(this.g, null, null, new ip1(this, null, 10), 3);
    }

    public final void m() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            y35 y35Var = (y35) it.next();
            int i = 0;
            if (y35Var.g == null) {
                while (i < 2) {
                    j += y35Var.b[i];
                    i++;
                }
            } else {
                y35Var.g = null;
                while (i < 2) {
                    uae uaeVar = (uae) y35Var.c.get(i);
                    g45 g45Var = this.q;
                    g45Var.j(uaeVar);
                    g45Var.j((uae) y35Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.i = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        g45 g45Var = this.q;
        s18 s18Var = g45Var.c;
        uae uaeVar = this.c;
        lof o = o6a.o(s18Var.M(uaeVar));
        try {
            String n = o.n(Long.MAX_VALUE);
            String n2 = o.n(Long.MAX_VALUE);
            String n3 = o.n(Long.MAX_VALUE);
            String n4 = o.n(Long.MAX_VALUE);
            String n5 = o.n(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(n) || !"1".equals(n2) || !Intrinsics.c(String.valueOf(3), n3) || !Intrinsics.c(String.valueOf(2), n4) || n5.length() > 0) {
                throw new IOException("unexpected journal header: [" + n + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + U3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    p(o.n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.f.size();
                    if (o.w()) {
                        this.k = new kof(new hv4(g45Var.e(uaeVar), new kz3(this, 11), 1));
                    } else {
                        M();
                    }
                    Unit unit = Unit.a;
                    try {
                        o.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                o.close();
            } catch (Throwable th3) {
                de6.a(th, th3);
            }
            if (th == null) {
            }
        }
    }

    public final void p(String str) {
        String substring;
        int O = StringsKt.O(str, ' ', 0, 6);
        if (O == -1) {
            is8.e("unexpected journal line: ".concat(str));
            return;
        }
        int i = O + 1;
        int O2 = StringsKt.O(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (O2 == -1) {
            substring = str.substring(i);
            if (O == 6 && c.v(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, O2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new y35(this, substring);
            linkedHashMap.put(substring, obj);
        }
        y35 y35Var = (y35) obj;
        if (O2 == -1 || O != 5 || !c.v(str, "CLEAN", false)) {
            if (O2 == -1 && O == 5 && c.v(str, "DIRTY", false)) {
                y35Var.g = new en0(this, y35Var);
                return;
            } else {
                if (O2 == -1 && O == 4 && c.v(str, "READ", false)) {
                    return;
                }
                is8.e("unexpected journal line: ".concat(str));
                return;
            }
        }
        List Y = StringsKt.Y(str.substring(O2 + 1), new char[]{' '});
        y35Var.e = true;
        y35Var.g = null;
        if (Y.size() != 2) {
            yhk.u(Y, "unexpected journal line: ");
            return;
        }
        try {
            int size = Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                y35Var.b[i2] = Long.parseLong((String) Y.get(i2));
            }
        } catch (NumberFormatException unused) {
            yhk.u(Y, "unexpected journal line: ");
        }
    }

    public final void t(y35 y35Var) {
        kof kofVar;
        int i = y35Var.h;
        String str = y35Var.a;
        if (i > 0 && (kofVar = this.k) != null) {
            kofVar.S("DIRTY");
            kofVar.writeByte(32);
            kofVar.S(str);
            kofVar.writeByte(10);
            kofVar.flush();
        }
        if (y35Var.h > 0 || y35Var.g != null) {
            y35Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.q.j((uae) y35Var.c.get(i2));
            long j = this.i;
            long[] jArr = y35Var.b;
            this.i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.j++;
        kof kofVar2 = this.k;
        if (kofVar2 != null) {
            kofVar2.S("REMOVE");
            kofVar2.writeByte(32);
            kofVar2.S(str);
            kofVar2.writeByte(10);
            kofVar2.flush();
        }
        this.f.remove(str);
        if (this.j >= 2000) {
            k();
        }
    }
}
