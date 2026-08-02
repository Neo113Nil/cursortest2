package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m45 implements Closeable, Flushable {
    public static final Regex q = new Regex("[a-z0-9_-]{1,120}");
    public final uae a;
    public final long b;
    public final uae c;
    public final uae d;
    public final uae e;
    public final LinkedHashMap f;
    public final ad2 g;
    public long h;
    public int i;
    public kof j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final i45 p;

    public m45(long j, au3 au3Var, s18 s18Var, uae uaeVar) {
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
        this.g = s9a.c(e.d(tz9.o(), au3Var.f0(1)));
        this.p = new i45(s18Var);
    }

    public static void H(String str) {
        if (q.f(str)) {
            return;
        }
        ogj.h(dmi.j('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        t(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        while (this.h > this.b) {
            for (b45 b45Var : this.f.values()) {
                if (!b45Var.f) {
                    break;
                }
            }
            return;
        }
        this.n = false;
    }

    public final synchronized void M() {
        Unit unit;
        try {
            kof kofVar = this.j;
            if (kofVar != null) {
                kofVar.close();
            }
            kof n = o6a.n(this.p.H(this.d, false));
            Throwable th = null;
            try {
                n.S("libcore.io.DiskLruCache");
                n.writeByte(10);
                n.S("1");
                n.writeByte(10);
                n.m(1L);
                n.writeByte(10);
                n.m(2L);
                n.writeByte(10);
                n.writeByte(10);
                for (b45 b45Var : this.f.values()) {
                    if (b45Var.g != null) {
                        n.S("DIRTY");
                        n.writeByte(32);
                        n.S(b45Var.a);
                        n.writeByte(10);
                    } else {
                        n.S("CLEAN");
                        n.writeByte(32);
                        n.S(b45Var.a);
                        for (long j : b45Var.b) {
                            n.writeByte(32);
                            n.m(j);
                        }
                        n.writeByte(10);
                    }
                }
                unit = Unit.a;
                try {
                    n.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    n.close();
                } catch (Throwable th4) {
                    de6.a(th3, th4);
                }
                unit = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            unit.getClass();
            boolean k = this.p.k(this.c);
            i45 i45Var = this.p;
            if (k) {
                i45Var.f(this.c, this.e);
                this.p.f(this.d, this.c);
                this.p.i(this.e);
            } else {
                i45Var.f(this.d, this.c);
            }
            this.j = new kof(new sq7(this.p.e(this.c), new oo(this, 16)));
            this.i = 0;
            this.k = false;
            this.o = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l && !this.m) {
                for (b45 b45Var : (b45[]) this.f.values().toArray(new b45[0])) {
                    en0 en0Var = b45Var.g;
                    if (en0Var != null) {
                        b45 b45Var2 = (b45) en0Var.c;
                        if (Intrinsics.c(b45Var2.g, en0Var)) {
                            b45Var2.f = true;
                        }
                    }
                }
                C();
                s9a.o(this.g, null);
                kof kofVar = this.j;
                kofVar.getClass();
                kofVar.close();
                this.j = null;
                this.m = true;
                return;
            }
            this.m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if ((r9.i >= 2000) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:29:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:37:0x005c, B:39:0x006a, B:41:0x00a8, B:43:0x00af, B:46:0x00b4, B:48:0x00c5, B:51:0x00ca, B:52:0x0105, B:54:0x0110, B:60:0x0119, B:61:0x00e2, B:63:0x00f7, B:65:0x0102, B:68:0x0098, B:70:0x011e, B:71:0x0125), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(en0 en0Var, boolean z) {
        b45 b45Var = (b45) en0Var.c;
        if (!Intrinsics.c(b45Var.g, en0Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!z || b45Var.f) {
            for (int i = 0; i < 2; i++) {
                this.p.j((uae) b45Var.d.get(i));
            }
        } else {
            for (int i2 = 0; i2 < 2; i2++) {
                if (((boolean[]) en0Var.d)[i2] && !this.p.k((uae) b45Var.d.get(i2))) {
                    en0Var.j(false);
                    return;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                uae uaeVar = (uae) b45Var.d.get(i3);
                uae uaeVar2 = (uae) b45Var.c.get(i3);
                boolean k = this.p.k(uaeVar);
                i45 i45Var = this.p;
                if (k) {
                    i45Var.f(uaeVar, uaeVar2);
                } else {
                    uae uaeVar3 = (uae) b45Var.c.get(i3);
                    if (!i45Var.k(uaeVar3)) {
                        l.a(i45Var.H(uaeVar3, false));
                    }
                }
                long j = b45Var.b[i3];
                Long l = (Long) this.p.n(uaeVar2).e;
                long longValue = l != null ? l.longValue() : 0L;
                b45Var.b[i3] = longValue;
                this.h = (this.h - j) + longValue;
            }
        }
        b45Var.g = null;
        if (b45Var.f) {
            t(b45Var);
            return;
        }
        this.i++;
        kof kofVar = this.j;
        kofVar.getClass();
        if (!z && !b45Var.e) {
            this.f.remove(b45Var.a);
            kofVar.S("REMOVE");
            kofVar.writeByte(32);
            kofVar.S(b45Var.a);
            kofVar.writeByte(10);
            kofVar.flush();
            if (this.h <= this.b) {
            }
            k();
        }
        b45Var.e = true;
        kofVar.S("CLEAN");
        kofVar.writeByte(32);
        kofVar.S(b45Var.a);
        for (long j2 : b45Var.b) {
            kofVar.writeByte(32);
            kofVar.m(j2);
        }
        kofVar.writeByte(10);
        kofVar.flush();
        if (this.h <= this.b) {
        }
        k();
    }

    public final synchronized en0 f(String str) {
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        h();
        b45 b45Var = (b45) this.f.get(str);
        if ((b45Var != null ? b45Var.g : null) != null) {
            return null;
        }
        if (b45Var != null && b45Var.h != 0) {
            return null;
        }
        if (!this.n && !this.o) {
            kof kofVar = this.j;
            kofVar.getClass();
            kofVar.S("DIRTY");
            kofVar.writeByte(32);
            kofVar.S(str);
            kofVar.writeByte(10);
            kofVar.flush();
            if (this.k) {
                return null;
            }
            if (b45Var == null) {
                b45Var = new b45(this, str);
                this.f.put(str, b45Var);
            }
            en0 en0Var = new en0(this, b45Var);
            b45Var.g = en0Var;
            return en0Var;
        }
        k();
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.l) {
            if (this.m) {
                throw new IllegalStateException("cache is closed");
            }
            C();
            kof kofVar = this.j;
            kofVar.getClass();
            kofVar.flush();
        }
    }

    public final synchronized e45 g(String str) {
        e45 a;
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        h();
        b45 b45Var = (b45) this.f.get(str);
        if (b45Var != null && (a = b45Var.a()) != null) {
            boolean z = true;
            this.i++;
            kof kofVar = this.j;
            kofVar.getClass();
            kofVar.S("READ");
            kofVar.writeByte(32);
            kofVar.S(str);
            kofVar.writeByte(10);
            if (this.i < 2000) {
                z = false;
            }
            if (z) {
                k();
            }
            return a;
        }
        return null;
    }

    public final synchronized void h() {
        try {
            if (this.l) {
                return;
            }
            this.p.i(this.d);
            if (this.p.k(this.e)) {
                boolean k = this.p.k(this.c);
                i45 i45Var = this.p;
                uae uaeVar = this.e;
                if (k) {
                    i45Var.i(uaeVar);
                } else {
                    i45Var.f(uaeVar, this.c);
                }
            }
            if (this.p.k(this.c)) {
                try {
                    n();
                    m();
                    this.l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        n4o.A(this.p, this.a);
                        this.m = false;
                    } catch (Throwable th) {
                        this.m = false;
                        throw th;
                    }
                }
            }
            M();
            this.l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void k() {
        xw3.L(this.g, null, null, new ip1(this, null, 11), 3);
    }

    public final void m() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b45 b45Var = (b45) it.next();
            int i = 0;
            if (b45Var.g == null) {
                while (i < 2) {
                    j += b45Var.b[i];
                    i++;
                }
            } else {
                b45Var.g = null;
                while (i < 2) {
                    uae uaeVar = (uae) b45Var.c.get(i);
                    i45 i45Var = this.p;
                    i45Var.j(uaeVar);
                    i45Var.j((uae) b45Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.h = j;
    }

    public final void n() {
        Unit unit;
        i45 i45Var = this.p;
        s18 s18Var = i45Var.c;
        uae uaeVar = this.c;
        lof o = o6a.o(s18Var.M(uaeVar));
        Throwable th = null;
        try {
            String n = o.n(Long.MAX_VALUE);
            String n2 = o.n(Long.MAX_VALUE);
            String n3 = o.n(Long.MAX_VALUE);
            String n4 = o.n(Long.MAX_VALUE);
            String n5 = o.n(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(n) || !"1".equals(n2) || !Intrinsics.c(String.valueOf(1), n3) || !Intrinsics.c(String.valueOf(2), n4) || n5.length() > 0) {
                throw new IOException("unexpected journal header: [" + n + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    p(o.n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.i = i - this.f.size();
                    if (o.w()) {
                        this.j = new kof(new sq7(i45Var.e(uaeVar), new oo(this, 16)));
                    } else {
                        M();
                    }
                    unit = Unit.a;
                    try {
                        o.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th != null) {
                        throw th;
                    }
                    unit.getClass();
                    return;
                }
            }
        } catch (Throwable th3) {
            try {
                o.close();
            } catch (Throwable th4) {
                de6.a(th3, th4);
            }
            th = th3;
            unit = null;
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
            obj = new b45(this, substring);
            linkedHashMap.put(substring, obj);
        }
        b45 b45Var = (b45) obj;
        if (O2 == -1 || O != 5 || !c.v(str, "CLEAN", false)) {
            if (O2 == -1 && O == 5 && c.v(str, "DIRTY", false)) {
                b45Var.g = new en0(this, b45Var);
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
        b45Var.e = true;
        b45Var.g = null;
        if (Y.size() != 2) {
            yhk.u(Y, "unexpected journal line: ");
            return;
        }
        try {
            int size = Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                b45Var.b[i2] = Long.parseLong((String) Y.get(i2));
            }
        } catch (NumberFormatException unused) {
            yhk.u(Y, "unexpected journal line: ");
        }
    }

    public final void t(b45 b45Var) {
        kof kofVar;
        int i = b45Var.h;
        String str = b45Var.a;
        if (i > 0 && (kofVar = this.j) != null) {
            kofVar.S("DIRTY");
            kofVar.writeByte(32);
            kofVar.S(str);
            kofVar.writeByte(10);
            kofVar.flush();
        }
        if (b45Var.h > 0 || b45Var.g != null) {
            b45Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.p.j((uae) b45Var.c.get(i2));
            long j = this.h;
            long[] jArr = b45Var.b;
            this.h = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.i++;
        kof kofVar2 = this.j;
        if (kofVar2 != null) {
            kofVar2.S("REMOVE");
            kofVar2.writeByte(32);
            kofVar2.S(str);
            kofVar2.writeByte(10);
        }
        this.f.remove(str);
        if (this.i >= 2000) {
            k();
        }
    }
}
