package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class l45 implements Closeable, Flushable {
    public static final Regex t = new Regex("[a-z0-9_-]{1,120}");
    public static final String u = "CLEAN";
    public static final String v = "DIRTY";
    public static final String w = "REMOVE";
    public static final String x = "READ";
    public final uae a;
    public final h45 b;
    public final long c;
    public final uae d;
    public final uae e;
    public final uae f;
    public long g;
    public kof h;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public final bui r;
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public final f45 s = new f45(0, this, mz1.o(new StringBuilder(), yol.b, " Cache"));

    public l45(s18 s18Var, uae uaeVar, long j, cui cuiVar) {
        this.a = uaeVar;
        this.b = new h45(s18Var);
        this.c = j;
        this.r = cuiVar.d();
        if (j <= 0) {
            a70.p("maxSize <= 0");
            throw null;
        }
        this.d = uaeVar.e("journal");
        this.e = uaeVar.e("journal.tmp");
        this.f = uaeVar.e("journal.bkp");
    }

    public static void Z(String str) {
        if (t.f(str)) {
            return;
        }
        ogj.h(dmi.j('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void C(String str) {
        String substring;
        int O = StringsKt.O(str, ' ', 0, 6);
        if (O == -1) {
            is8.e("unexpected journal line: ".concat(str));
            return;
        }
        int i = O + 1;
        int O2 = StringsKt.O(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.i;
        if (O2 == -1) {
            substring = str.substring(i);
            String str2 = w;
            if (O == str2.length() && c.v(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, O2);
        }
        a45 a45Var = (a45) linkedHashMap.get(substring);
        if (a45Var == null) {
            a45Var = new a45(this, substring);
            linkedHashMap.put(substring, a45Var);
        }
        if (O2 != -1) {
            String str3 = u;
            if (O == str3.length() && c.v(str, str3, false)) {
                List Y = StringsKt.Y(str.substring(O2 + 1), new char[]{' '});
                a45Var.e = true;
                a45Var.g = null;
                Y.getClass();
                int size = Y.size();
                a45Var.j.getClass();
                if (size != 2) {
                    yhk.u(Y, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = Y.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a45Var.b[i2] = Long.parseLong((String) Y.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    yhk.u(Y, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (O2 == -1) {
            String str4 = v;
            if (O == str4.length() && c.v(str, str4, false)) {
                a45Var.g = new en0(this, a45Var);
                return;
            }
        }
        if (O2 == -1) {
            String str5 = x;
            if (O == str5.length() && c.v(str, str5, false)) {
                return;
            }
        }
        is8.e("unexpected journal line: ".concat(str));
    }

    public final synchronized void H() {
        Throwable th;
        try {
            kof kofVar = this.h;
            if (kofVar != null) {
                kofVar.close();
            }
            kof n = o6a.n(this.b.H(this.e, false));
            int i = 10;
            try {
                n.S("libcore.io.DiskLruCache");
                n.writeByte(10);
                n.S("1");
                n.writeByte(10);
                n.m(201105L);
                n.writeByte(10);
                n.m(2L);
                n.writeByte(10);
                n.writeByte(10);
                for (Object obj : this.i.values()) {
                    obj.getClass();
                    a45 a45Var = (a45) obj;
                    if (a45Var.g != null) {
                        n.S(v);
                        n.writeByte(32);
                        n.S(a45Var.a);
                        n.writeByte(10);
                    } else {
                        n.S(u);
                        n.writeByte(32);
                        n.S(a45Var.a);
                        for (long j : a45Var.b) {
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
            boolean k = this.b.k(this.d);
            h45 h45Var = this.b;
            if (k) {
                h45Var.f(this.d, this.f);
                this.b.f(this.e, this.d);
                wol.d(this.b, this.f);
            } else {
                h45Var.f(this.e, this.d);
            }
            kof kofVar2 = this.h;
            if (kofVar2 != null) {
                wol.b(kofVar2);
            }
            h45 h45Var2 = this.b;
            uae uaeVar = this.d;
            h45Var2.getClass();
            uaeVar.getClass();
            this.h = new kof(new sq7(h45Var2.e(uaeVar), new kz3(this, i)));
            this.k = false;
            this.p = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void M(a45 a45Var) {
        kof kofVar;
        String str = a45Var.a;
        if (!this.l) {
            if (a45Var.h > 0 && (kofVar = this.h) != null) {
                kofVar.S(v);
                kofVar.writeByte(32);
                kofVar.S(str);
                kofVar.writeByte(10);
                kofVar.flush();
            }
            if (a45Var.h > 0 || a45Var.g != null) {
                a45Var.f = true;
                return;
            }
        }
        en0 en0Var = a45Var.g;
        if (en0Var != null) {
            en0Var.n();
        }
        for (int i = 0; i < 2; i++) {
            wol.d(this.b, (uae) a45Var.c.get(i));
            long j = this.g;
            long[] jArr = a45Var.b;
            this.g = j - jArr[i];
            jArr[i] = 0;
        }
        this.j++;
        kof kofVar2 = this.h;
        if (kofVar2 != null) {
            kofVar2.S(w);
            kofVar2.writeByte(32);
            kofVar2.S(str);
            kofVar2.writeByte(10);
        }
        this.i.remove(str);
        if (n()) {
            this.r.d(this.s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        M(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        while (this.g > this.c) {
            for (Object obj : this.i.values()) {
                obj.getClass();
                a45 a45Var = (a45) obj;
                if (!a45Var.f) {
                    break;
                }
            }
            return;
        }
        this.o = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.m && !this.n) {
                Collection values = this.i.values();
                values.getClass();
                for (a45 a45Var : (a45[]) values.toArray(new a45[0])) {
                    a45Var.getClass();
                    en0 en0Var = a45Var.g;
                    if (en0Var != null) {
                        en0Var.n();
                    }
                }
                T();
                kof kofVar = this.h;
                if (kofVar != null) {
                    wol.b(kofVar);
                }
                this.h = null;
                this.n = true;
                return;
            }
            this.n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.m) {
            h();
            T();
            kof kofVar = this.h;
            kofVar.getClass();
            kofVar.flush();
        }
    }

    public final synchronized void h() {
        if (this.n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void i(en0 en0Var, boolean z) {
        a45 a45Var = (a45) en0Var.c;
        if (!Intrinsics.c(a45Var.g, en0Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !a45Var.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) en0Var.d;
                zArr.getClass();
                if (!zArr[i]) {
                    en0Var.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.b.k((uae) a45Var.d.get(i))) {
                    en0Var.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            uae uaeVar = (uae) a45Var.d.get(i2);
            if (!z || a45Var.f) {
                wol.d(this.b, uaeVar);
            } else if (this.b.k(uaeVar)) {
                uae uaeVar2 = (uae) a45Var.c.get(i2);
                this.b.f(uaeVar, uaeVar2);
                long j = a45Var.b[i2];
                Long l = (Long) this.b.n(uaeVar2).e;
                long longValue = l != null ? l.longValue() : 0L;
                a45Var.b[i2] = longValue;
                this.g = (this.g - j) + longValue;
            }
        }
        a45Var.g = null;
        if (a45Var.f) {
            M(a45Var);
            return;
        }
        this.j++;
        kof kofVar = this.h;
        kofVar.getClass();
        if (!a45Var.e && !z) {
            this.i.remove(a45Var.a);
            kofVar.S(w);
            kofVar.writeByte(32);
            kofVar.S(a45Var.a);
            kofVar.writeByte(10);
            kofVar.flush();
            if (this.g <= this.c || n()) {
                this.r.d(this.s, 0L);
            }
        }
        a45Var.e = true;
        kofVar.S(u);
        kofVar.writeByte(32);
        kofVar.S(a45Var.a);
        for (long j2 : a45Var.b) {
            kofVar.writeByte(32);
            kofVar.m(j2);
        }
        kofVar.writeByte(10);
        if (z) {
            long j3 = this.q;
            this.q = 1 + j3;
            a45Var.i = j3;
        }
        kofVar.flush();
        if (this.g <= this.c) {
        }
        this.r.d(this.s, 0L);
    }

    public final synchronized en0 j(long j, String str) {
        str.getClass();
        m();
        h();
        Z(str);
        a45 a45Var = (a45) this.i.get(str);
        if (j != -1 && (a45Var == null || a45Var.i != j)) {
            return null;
        }
        if ((a45Var != null ? a45Var.g : null) != null) {
            return null;
        }
        if (a45Var != null && a45Var.h != 0) {
            return null;
        }
        if (!this.o && !this.p) {
            kof kofVar = this.h;
            kofVar.getClass();
            kofVar.S(v);
            kofVar.writeByte(32);
            kofVar.S(str);
            kofVar.writeByte(10);
            kofVar.flush();
            if (this.k) {
                return null;
            }
            if (a45Var == null) {
                a45Var = new a45(this, str);
                this.i.put(str, a45Var);
            }
            en0 en0Var = new en0(this, a45Var);
            a45Var.g = en0Var;
            return en0Var;
        }
        this.r.d(this.s, 0L);
        return null;
    }

    public final synchronized d45 k(String str) {
        str.getClass();
        m();
        h();
        Z(str);
        a45 a45Var = (a45) this.i.get(str);
        if (a45Var == null) {
            return null;
        }
        d45 a = a45Var.a();
        if (a == null) {
            return null;
        }
        this.j++;
        kof kofVar = this.h;
        kofVar.getClass();
        kofVar.S(x);
        kofVar.writeByte(32);
        kofVar.S(str);
        kofVar.writeByte(10);
        if (n()) {
            this.r.d(this.s, 0L);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067 A[Catch: all -> 0x0027, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x006d, B:28:0x0079, B:24:0x00bc, B:33:0x0084, B:36:0x00b5, B:39:0x00b9, B:40:0x00bb, B:50:0x0067, B:51:0x00c3, B:56:0x0061, B:53:0x005c, B:35:0x00ab, B:19:0x0041, B:57:0x004d), top: B:3:0x0003, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x006d, B:28:0x0079, B:24:0x00bc, B:33:0x0084, B:36:0x00b5, B:39:0x00b9, B:40:0x00bb, B:50:0x0067, B:51:0x00c3, B:56:0x0061, B:53:0x005c, B:35:0x00ab, B:19:0x0041, B:57:0x004d), top: B:3:0x0003, inners: #0, #2, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m() {
        boolean z;
        try {
            TimeZone timeZone = yol.a;
            if (this.m) {
                return;
            }
            if (this.b.k(this.f)) {
                boolean k = this.b.k(this.d);
                h45 h45Var = this.b;
                uae uaeVar = this.f;
                if (k) {
                    h45Var.j(uaeVar);
                } else {
                    h45Var.f(uaeVar, this.d);
                }
            }
            h45 h45Var2 = this.b;
            uae uaeVar2 = this.f;
            byte[] bArr = wol.a;
            h45Var2.getClass();
            uaeVar2.getClass();
            ejh H = h45Var2.H(uaeVar2, false);
            try {
                try {
                    h45Var2.c.i(uaeVar2);
                    if (H != null) {
                        try {
                            H.close();
                        } catch (Throwable unused) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (H != null) {
                        try {
                            H.close();
                        } catch (Throwable th2) {
                            de6.a(th, th2);
                        }
                    }
                    th = th;
                    if (th != null) {
                    }
                }
            } catch (IOException unused2) {
                Unit unit = Unit.a;
                if (H != null) {
                    try {
                        H.close();
                    } catch (Throwable th3) {
                        th = th3;
                        if (th != null) {
                            throw th;
                        }
                        h45Var2.c.i(uaeVar2);
                        z = false;
                        this.l = z;
                        if (this.b.k(this.d)) {
                        }
                        H();
                        this.m = true;
                    }
                }
                th = null;
                if (th != null) {
                }
            }
            this.l = z;
            if (this.b.k(this.d)) {
                try {
                    t();
                    p();
                    this.m = true;
                    return;
                } catch (IOException e) {
                    gie gieVar = gie.a;
                    gie.a.i(5, "DiskLruCache " + this.a + " is corrupt: " + e.getMessage() + ", removing");
                    try {
                        close();
                        wol.c(this.b, this.a);
                        this.n = false;
                    } catch (Throwable th4) {
                        this.n = false;
                        throw th4;
                    }
                }
            }
            H();
            this.m = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean n() {
        int i = this.j;
        return i >= 2000 && i >= this.i.size();
    }

    public final void p() {
        uae uaeVar = this.e;
        h45 h45Var = this.b;
        wol.d(h45Var, uaeVar);
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            a45 a45Var = (a45) next;
            int i = 0;
            if (a45Var.g == null) {
                while (i < 2) {
                    this.g += a45Var.b[i];
                    i++;
                }
            } else {
                a45Var.g = null;
                while (i < 2) {
                    wol.d(h45Var, (uae) a45Var.c.get(i));
                    wol.d(h45Var, (uae) a45Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        h45 h45Var = this.b;
        uae uaeVar = this.d;
        lof o = o6a.o(h45Var.M(uaeVar));
        try {
            String n = o.n(Long.MAX_VALUE);
            String n2 = o.n(Long.MAX_VALUE);
            String n3 = o.n(Long.MAX_VALUE);
            String n4 = o.n(Long.MAX_VALUE);
            String n5 = o.n(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(n) || !"1".equals(n2) || !Intrinsics.c(String.valueOf(201105), n3) || !Intrinsics.c(String.valueOf(2), n4) || n5.length() > 0) {
                throw new IOException("unexpected journal header: [" + n + ", " + n2 + ", " + n4 + ", " + n5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    C(o.n(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.i.size();
                    if (o.w()) {
                        kof kofVar = this.h;
                        if (kofVar != null) {
                            wol.b(kofVar);
                        }
                        h45Var.getClass();
                        uaeVar.getClass();
                        this.h = new kof(new sq7(h45Var.e(uaeVar), new kz3(this, 10)));
                    } else {
                        H();
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
}
