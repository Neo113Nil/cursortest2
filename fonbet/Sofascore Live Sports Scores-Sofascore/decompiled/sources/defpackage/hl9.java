package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hl9 implements ez7 {
    public static final je2 f = new je2(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final je2 g = new je2(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final xvd b;
    public final mqi c;
    public final mqi d;
    public final boolean e;

    public hl9(String str, xvd xvdVar, mqi mqiVar, mqi mqiVar2, boolean z) {
        this.a = str;
        this.b = xvdVar;
        this.c = mqiVar;
        this.d = mqiVar2;
        this.e = z;
    }

    public static String d(String str, zdc zdcVar) {
        String b;
        String str2 = zdcVar != null ? zdcVar.a : null;
        if ((str2 == null || c.v(str2, "text/plain", false)) && (b = l.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 != null) {
            return StringsKt.g0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:30:0x0208, B:31:0x020b, B:36:0x0051, B:38:0x0150, B:40:0x020c, B:41:0x0211, B:74:0x009b, B:76:0x00a9, B:79:0x00d4, B:81:0x00d8, B:84:0x00f1, B:86:0x013b, B:89:0x0107, B:91:0x0113, B:92:0x011c, B:94:0x00be, B:96:0x00c6, B:98:0x0124, B:99:0x012b, B:100:0x012c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d4 A[Catch: Exception -> 0x01ff, TryCatch #1 {Exception -> 0x01ff, blocks: (B:17:0x01ce, B:19:0x01d4, B:22:0x01fb, B:26:0x0202, B:27:0x0207), top: B:16:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0202 A[Catch: Exception -> 0x01ff, TryCatch #1 {Exception -> 0x01ff, blocks: (B:17:0x01ce, B:19:0x01d4, B:22:0x01fb, B:26:0x0202, B:27:0x0207), top: B:16:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:30:0x0208, B:31:0x020b, B:36:0x0051, B:38:0x0150, B:40:0x020c, B:41:0x0211, B:74:0x009b, B:76:0x00a9, B:79:0x00d4, B:81:0x00d8, B:84:0x00f1, B:86:0x013b, B:89:0x0107, B:91:0x0113, B:92:0x011c, B:94:0x00be, B:96:0x00c6, B:98:0x0124, B:99:0x012b, B:100:0x012c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b A[Catch: Exception -> 0x005b, TRY_ENTER, TryCatch #2 {Exception -> 0x005b, blocks: (B:30:0x0208, B:31:0x020b, B:36:0x0051, B:38:0x0150, B:40:0x020c, B:41:0x0211, B:74:0x009b, B:76:0x00a9, B:79:0x00d4, B:81:0x00d8, B:84:0x00f1, B:86:0x013b, B:89:0x0107, B:91:0x0113, B:92:0x011c, B:94:0x00be, B:96:0x00c6, B:98:0x0124, B:99:0x012b, B:100:0x012c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // defpackage.ez7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        gl9 gl9Var;
        ?? r4;
        zq4 zq4Var;
        long j;
        gf2 a;
        Object b;
        tof tofVar;
        i2g i2gVar;
        d2g d2gVar;
        d2g d2gVar2;
        i2g i2gVar2;
        hl9 hl9Var = this;
        try {
            if (rq3Var instanceof gl9) {
                gl9Var = (gl9) rq3Var;
                int i = gl9Var.w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    gl9Var.w = i - Integer.MIN_VALUE;
                    Object obj = gl9Var.u;
                    lu3 lu3Var = lu3.a;
                    r4 = gl9Var.w;
                    int i2 = 4;
                    if (r4 != 0) {
                        y6a.M(obj);
                        xvd xvdVar = hl9Var.b;
                        boolean a2 = mz1.a(xvdVar.k);
                        String str = hl9Var.a;
                        if (a2 && (tofVar = (tof) hl9Var.d.getValue()) != null) {
                            xvdVar.getClass();
                            m45 m45Var = tofVar.b;
                            gc2 gc2Var = gc2.d;
                            e45 g2 = m45Var.g(q1f.o(str).g("SHA-256").i());
                            if (g2 != null) {
                                zq4Var = new zq4(g2, 1);
                                if (zq4Var == null) {
                                    s18 c = hl9Var.c();
                                    e45 e45Var = (e45) zq4Var.b;
                                    j = 0;
                                    if (e45Var.b) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l = (Long) c.n((uae) e45Var.a.c.get(0)).e;
                                    if (l != null && l.longValue() == 0) {
                                        return new nwh(hl9Var.g(zq4Var), d(str, null), 3);
                                    }
                                    if (!hl9Var.e) {
                                        c18 g3 = hl9Var.g(zq4Var);
                                        bf2 f2 = hl9Var.f(zq4Var);
                                        return new nwh(g3, d(str, f2 != null ? (zdc) f2.b.getValue() : null), 3);
                                    }
                                    a = new cf2(hl9Var.e(), hl9Var.f(zq4Var)).a();
                                    bf2 bf2Var = a.b;
                                    if (a.a == null && bf2Var != null) {
                                        return new nwh(hl9Var.g(zq4Var), d(str, (zdc) bf2Var.b.getValue()), 3);
                                    }
                                } else {
                                    j = 0;
                                    a = new cf2(hl9Var.e(), null).a();
                                }
                                qzf qzfVar = a.a;
                                qzfVar.getClass();
                                gl9Var.r = hl9Var;
                                gl9Var.s = zq4Var;
                                gl9Var.t = a;
                                gl9Var.w = 1;
                                b = hl9Var.b(qzfVar, gl9Var);
                                if (b == lu3Var) {
                                    return lu3Var;
                                }
                            }
                        }
                        zq4Var = null;
                        if (zq4Var == null) {
                        }
                        qzf qzfVar2 = a.a;
                        qzfVar2.getClass();
                        gl9Var.r = hl9Var;
                        gl9Var.s = zq4Var;
                        gl9Var.t = a;
                        gl9Var.w = 1;
                        b = hl9Var.b(qzfVar2, gl9Var);
                        if (b == lu3Var) {
                        }
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d2gVar = (d2g) gl9Var.t;
                            zq4 zq4Var2 = gl9Var.s;
                            hl9Var = gl9Var.r;
                            try {
                                y6a.M(obj);
                                d2gVar2 = (d2g) obj;
                            } catch (Exception e) {
                                e = e;
                                l.a(d2gVar);
                                throw e;
                            }
                            try {
                                Bitmap.Config[] configArr = l.a;
                                i2gVar2 = d2gVar2.g;
                                if (i2gVar2 != null) {
                                    throw new IllegalStateException("response body == null");
                                }
                                hl9Var.getClass();
                                iwh iwhVar = new iwh(i2gVar2.source(), new au9(hl9Var.b.a, 0), null);
                                String d = d(hl9Var.a, i2gVar2.contentType());
                                if (d2gVar2.i == null) {
                                    i2 = 3;
                                }
                                return new nwh(iwhVar, d, i2);
                            } catch (Exception e2) {
                                e = e2;
                                d2gVar = d2gVar2;
                                l.a(d2gVar);
                                throw e;
                            }
                        }
                        gf2 gf2Var = (gf2) gl9Var.t;
                        zq4Var = gl9Var.s;
                        hl9 hl9Var2 = gl9Var.r;
                        y6a.M(obj);
                        b = obj;
                        j = 0;
                        a = gf2Var;
                        hl9Var = hl9Var2;
                    }
                    d2g d2gVar3 = (d2g) b;
                    Bitmap.Config[] configArr2 = l.a;
                    i2gVar = d2gVar3.g;
                    if (i2gVar != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        zq4 h = hl9Var.h(zq4Var, a.a, d2gVar3, a.b);
                        String str2 = hl9Var.a;
                        if (h != null) {
                            c18 g4 = hl9Var.g(h);
                            bf2 f3 = hl9Var.f(h);
                            return new nwh(g4, d(str2, f3 != null ? (zdc) f3.b.getValue() : null), 4);
                        }
                        if (i2gVar.contentLength() > j) {
                            iwh iwhVar2 = new iwh(i2gVar.source(), new au9(hl9Var.b.a, 0), null);
                            String d2 = d(str2, i2gVar.contentType());
                            if (d2gVar3.i == null) {
                                i2 = 3;
                            }
                            return new nwh(iwhVar2, d2, i2);
                        }
                        l.a(d2gVar3);
                        qzf e3 = hl9Var.e();
                        gl9Var.r = hl9Var;
                        gl9Var.s = h;
                        gl9Var.t = d2gVar3;
                        gl9Var.w = 2;
                        obj = hl9Var.b(e3, gl9Var);
                        if (obj != lu3Var) {
                            d2gVar = d2gVar3;
                            d2gVar2 = (d2g) obj;
                            Bitmap.Config[] configArr3 = l.a;
                            i2gVar2 = d2gVar2.g;
                            if (i2gVar2 != null) {
                            }
                        }
                        return lu3Var;
                    } catch (Exception e4) {
                        e = e4;
                        d2gVar = d2gVar3;
                        l.a(d2gVar);
                        throw e;
                    }
                }
            }
            if (r4 != 0) {
            }
            d2g d2gVar32 = (d2g) b;
            Bitmap.Config[] configArr22 = l.a;
            i2gVar = d2gVar32.g;
            if (i2gVar != null) {
            }
        } catch (Exception e5) {
            if (r4 != 0) {
                l.a(r4);
            }
            throw e5;
        }
        gl9Var = new gl9(hl9Var, (sq3) rq3Var);
        Object obj2 = gl9Var.u;
        lu3 lu3Var2 = lu3.a;
        r4 = gl9Var.w;
        int i22 = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(qzf qzfVar, sq3 sq3Var) {
        fl9 fl9Var;
        int i;
        d2g execute;
        boolean z;
        if (sq3Var instanceof fl9) {
            fl9Var = (fl9) sq3Var;
            int i2 = fl9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fl9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = fl9Var.r;
                lu3 lu3Var = lu3.a;
                i = fl9Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Bitmap.Config[] configArr = l.a;
                    boolean c = Intrinsics.c(Looper.myLooper(), Looper.getMainLooper());
                    mqi mqiVar = this.c;
                    if (c) {
                        if (mz1.a(this.b.l)) {
                            throw new NetworkOnMainThreadException();
                        }
                        execute = FirebasePerfOkHttpClient.execute(((jod) ((yg2) mqiVar.getValue())).b(qzfVar));
                        z = execute.q;
                        int i3 = execute.d;
                        if (!z || i3 == 304) {
                            return execute;
                        }
                        i2g i2gVar = execute.g;
                        if (i2gVar != null) {
                            l.a(i2gVar);
                        }
                        StringBuilder t = lnb.t(i3, "HTTP ", ": ");
                        t.append(execute.c);
                        throw new fb3(t.toString(), 7);
                    }
                    pof b = ((jod) ((yg2) mqiVar.getValue())).b(qzfVar);
                    fl9Var.t = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(fl9Var));
                    lj2Var.t();
                    zi ziVar = new zi(8, b, lj2Var);
                    FirebasePerfOkHttpClient.enqueue(b, ziVar);
                    lj2Var.v(ziVar);
                    obj = lj2Var.q();
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                execute = (d2g) obj;
                z = execute.q;
                int i32 = execute.d;
                if (z) {
                }
                return execute;
            }
        }
        fl9Var = new fl9(this, sq3Var);
        Object obj2 = fl9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = fl9Var.t;
        if (i != 0) {
        }
        execute = (d2g) obj2;
        z = execute.q;
        int i322 = execute.d;
        if (z) {
        }
        return execute;
    }

    public final s18 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((tof) value).a;
    }

    public final qzf e() {
        pzf pzfVar = new pzf();
        pzfVar.f(this.a);
        xvd xvdVar = this.b;
        pzfVar.d(xvdVar.g);
        for (Map.Entry entry : xvdVar.h.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass((Class) key);
            orCreateKotlinClass.getClass();
            pzfVar.e = pzfVar.e.H(orCreateKotlinClass, value);
        }
        int i = xvdVar.k;
        boolean a = mz1.a(i);
        boolean a2 = mz1.a(xvdVar.l);
        if (!a2 && a) {
            pzfVar.b(je2.o);
        } else if (!a2 || a) {
            if (!a2 && !a) {
                pzfVar.b(g);
            }
        } else if (mz1.b(i)) {
            pzfVar.b(je2.n);
        } else {
            pzfVar.b(f);
        }
        return new qzf(pzfVar);
    }

    public final bf2 f(zq4 zq4Var) {
        Throwable th;
        bf2 bf2Var;
        try {
            s18 c = c();
            e45 e45Var = (e45) zq4Var.b;
            if (e45Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            lof o = o6a.o(c.M((uae) e45Var.a.c.get(0)));
            try {
                bf2Var = new bf2(o);
                try {
                    o.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    o.close();
                } catch (Throwable th4) {
                    de6.a(th3, th4);
                }
                th = th3;
                bf2Var = null;
            }
            if (th != null) {
                throw th;
            }
            bf2Var.getClass();
            return bf2Var;
        } catch (IOException unused) {
            return null;
        }
    }

    public final c18 g(zq4 zq4Var) {
        e45 e45Var = (e45) zq4Var.b;
        if (e45Var.b) {
            a70.r("snapshot is closed");
            return null;
        }
        uae uaeVar = (uae) e45Var.a.c.get(1);
        s18 c = c();
        this.b.getClass();
        return new c18(uaeVar, c, this.a, zq4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zq4 h(zq4 zq4Var, qzf qzfVar, d2g d2gVar, bf2 bf2Var) {
        yia yiaVar;
        Throwable th;
        Unit unit;
        Long l;
        Unit unit2;
        en0 f2;
        Throwable th2 = null;
        if (!mz1.b(this.b.k) || (this.e && (qzfVar.a().b || d2gVar.h().b || Intrinsics.c(d2gVar.f.a("Vary"), "*")))) {
            if (zq4Var != null) {
                l.a(zq4Var);
            }
        } else if (zq4Var != null) {
            e45 e45Var = (e45) zq4Var.b;
            m45 m45Var = e45Var.c;
            synchronized (m45Var) {
                e45Var.close();
                f2 = m45Var.f(e45Var.a.a);
            }
            if (f2 != null) {
                yiaVar = new yia(f2, 12);
                if (yiaVar != null) {
                    try {
                        try {
                            if (d2gVar.d != 304 || bf2Var == null) {
                                kof n = o6a.n(c().H(((en0) yiaVar.b).p(0), false));
                                try {
                                    new bf2(d2gVar).a(n);
                                    unit = Unit.a;
                                    try {
                                        n.close();
                                        th = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        n.close();
                                    } catch (Throwable th5) {
                                        de6.a(th4, th5);
                                    }
                                    th = th4;
                                    unit = null;
                                }
                                if (th != null) {
                                    throw th;
                                }
                                unit.getClass();
                                kof n2 = o6a.n(c().H(((en0) yiaVar.b).p(1), false));
                                try {
                                    i2g i2gVar = d2gVar.g;
                                    i2gVar.getClass();
                                    l = Long.valueOf(i2gVar.source().y0(n2));
                                    try {
                                        n2.close();
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        n2.close();
                                    } catch (Throwable th8) {
                                        de6.a(th7, th8);
                                    }
                                    th2 = th7;
                                    l = null;
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                                l.getClass();
                            } else {
                                b2g k = d2gVar.k();
                                k.f = vha.k(c6o.E(bf2Var.f, d2gVar.f));
                                d2g a = k.a();
                                kof n3 = o6a.n(c().H(((en0) yiaVar.b).p(0), false));
                                try {
                                    new bf2(a).a(n3);
                                    unit2 = Unit.a;
                                    try {
                                        n3.close();
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                } catch (Throwable th10) {
                                    try {
                                        n3.close();
                                    } catch (Throwable th11) {
                                        de6.a(th10, th11);
                                    }
                                    th2 = th10;
                                    unit2 = null;
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                                unit2.getClass();
                            }
                            zq4 f3 = yiaVar.f();
                            l.a(d2gVar);
                            return f3;
                        } catch (Exception e) {
                            Bitmap.Config[] configArr = l.a;
                            try {
                                ((en0) yiaVar.b).j(false);
                            } catch (Exception unused) {
                            }
                            throw e;
                        }
                    } catch (Throwable th12) {
                        l.a(d2gVar);
                        throw th12;
                    }
                }
            }
            yiaVar = null;
            if (yiaVar != null) {
            }
        } else {
            tof tofVar = (tof) this.d.getValue();
            if (tofVar != null) {
                this.b.getClass();
                String str = this.a;
                m45 m45Var2 = tofVar.b;
                gc2 gc2Var = gc2.d;
                en0 f4 = m45Var2.f(q1f.o(str).g("SHA-256").i());
                if (f4 != null) {
                    yiaVar = new yia(f4, 12);
                    if (yiaVar != null) {
                    }
                }
            }
            yiaVar = null;
            if (yiaVar != null) {
            }
        }
        return null;
    }
}
