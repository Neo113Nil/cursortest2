package defpackage;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ead implements dz7 {
    public final String a;
    public final tvd b;
    public final mqi c;
    public final mqi d;
    public final mqi e;
    public final j3a f;
    public final mqi g;

    public ead(String str, tvd tvdVar, mqi mqiVar, mqi mqiVar2, mqi mqiVar3, j3a j3aVar, mqi mqiVar4) {
        this.a = str;
        this.b = tvdVar;
        this.c = mqiVar;
        this.d = mqiVar2;
        this.e = mqiVar3;
        this.f = j3aVar;
        this.g = mqiVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str, String str2) {
        String str3;
        if (str2 == null || c.v(str2, "text/plain", false)) {
            if (!StringsKt.R(str)) {
                String i0 = StringsKt.i0(StringsKt.i0(str, '#'), '?');
                String e0 = StringsKt.e0('.', StringsKt.e0('/', i0, i0), "");
                if (!StringsKt.R(e0)) {
                    String lowerCase = e0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str3 = (String) tjc.a.get(lowerCase);
                    if (str3 == null) {
                        str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        if (str2 != null) {
            return StringsKt.g0(str2, ';');
        }
        return null;
    }

    @Override // defpackage.dz7
    public final Object a(zn5 zn5Var) {
        w9k w9kVar = (w9k) this.g.getValue();
        String str = this.b.e;
        v9b v9bVar = new v9b(1, this, ead.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19);
        w9kVar.getClass();
        return v9bVar.invoke(zn5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01c6, code lost:
    
        if (r0 == r8) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
    
        r0 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        if (r0 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a9 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:15:0x01c9, B:21:0x0050, B:22:0x01a5, B:24:0x01a9, B:32:0x0119, B:34:0x011f, B:39:0x012e, B:43:0x014c, B:44:0x0151, B:46:0x015e, B:48:0x0164, B:51:0x0173, B:52:0x0178, B:54:0x017b, B:58:0x0187, B:61:0x0182, B:85:0x00a1, B:87:0x00a8, B:89:0x00b6, B:92:0x00ea, B:94:0x00f6, B:98:0x00cc, B:100:0x00d6, B:102:0x0154, B:103:0x015b), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:15:0x01c9, B:21:0x0050, B:22:0x01a5, B:24:0x01a9, B:32:0x0119, B:34:0x011f, B:39:0x012e, B:43:0x014c, B:44:0x0151, B:46:0x015e, B:48:0x0164, B:51:0x0173, B:52:0x0178, B:54:0x017b, B:58:0x0187, B:61:0x0182, B:85:0x00a1, B:87:0x00a8, B:89:0x00b6, B:92:0x00ea, B:94:0x00f6, B:98:0x00cc, B:100:0x00d6, B:102:0x0154, B:103:0x015b), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:15:0x01c9, B:21:0x0050, B:22:0x01a5, B:24:0x01a9, B:32:0x0119, B:34:0x011f, B:39:0x012e, B:43:0x014c, B:44:0x0151, B:46:0x015e, B:48:0x0164, B:51:0x0173, B:52:0x0178, B:54:0x017b, B:58:0x0187, B:61:0x0182, B:85:0x00a1, B:87:0x00a8, B:89:0x00b6, B:92:0x00ea, B:94:0x00f6, B:98:0x00cc, B:100:0x00d6, B:102:0x0154, B:103:0x015b), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a8 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:15:0x01c9, B:21:0x0050, B:22:0x01a5, B:24:0x01a9, B:32:0x0119, B:34:0x011f, B:39:0x012e, B:43:0x014c, B:44:0x0151, B:46:0x015e, B:48:0x0164, B:51:0x0173, B:52:0x0178, B:54:0x017b, B:58:0x0187, B:61:0x0182, B:85:0x00a1, B:87:0x00a8, B:89:0x00b6, B:92:0x00ea, B:94:0x00f6, B:98:0x00cc, B:100:0x00d6, B:102:0x0154, B:103:0x015b), top: B:8:0x002e }] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rq3 rq3Var) {
        aad aadVar;
        fsf fsfVar;
        fsf g;
        rof rofVar;
        fsf fsfVar2;
        df2 df2Var;
        fsf fsfVar3;
        sof sofVar;
        zad zadVar;
        fwh fwhVar;
        try {
            if (rq3Var instanceof aad) {
                aadVar = (aad) rq3Var;
                int i = aadVar.v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aadVar.v = i - Integer.MIN_VALUE;
                    aad aadVar2 = aadVar;
                    Object obj = aadVar2.t;
                    lu3 lu3Var = lu3.a;
                    fsfVar = aadVar2.v;
                    mqi mqiVar = this.c;
                    String str = this.a;
                    tvd tvdVar = this.b;
                    rq3 rq3Var2 = null;
                    if (fsfVar != 0) {
                        g = lnb.g(obj);
                        if (tvdVar.h.a && (sofVar = (sof) this.d.getValue()) != null) {
                            String str2 = tvdVar.e;
                            if (str2 == null) {
                                str2 = str;
                            }
                            j45 j45Var = sofVar.b;
                            gc2 gc2Var = gc2.d;
                            c45 g2 = j45Var.g(q1f.o(str2).g("SHA-256").i());
                            if (g2 != null) {
                                rofVar = new rof(g2);
                                g.a = rofVar;
                                fsf fsfVar4 = new fsf();
                                if (rofVar != null) {
                                    s18 c = c();
                                    c45 c45Var = ((rof) g.a).a;
                                    if (c45Var.b) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l = (Long) c.n((uae) c45Var.a.c.get(0)).e;
                                    if (l != null && l.longValue() == 0) {
                                        return new fwh(f((rof) g.a), d(str, null), pe4.c);
                                    }
                                    zad h = h((rof) g.a);
                                    fsfVar4.a = h;
                                    if (h != null) {
                                        ff2 ff2Var = (ff2) this.e.getValue();
                                        zad zadVar2 = (zad) fsfVar4.a;
                                        mad e = e();
                                        aadVar2.r = g;
                                        aadVar2.s = fsfVar4;
                                        aadVar2.v = 1;
                                        df2 b = ff2Var.b(zadVar2, e, tvdVar, aadVar2);
                                        if (b == lu3Var) {
                                            return lu3Var;
                                        }
                                        fsfVar3 = fsfVar4;
                                        obj = b;
                                    }
                                }
                                fsfVar2 = fsfVar4;
                                df2Var = null;
                                if (tvdVar.i.a && Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                                    throw new NetworkOnMainThreadException();
                                }
                                mad e2 = e();
                                mad madVar = e2;
                                gh2 gh2Var = (gh2) mqiVar.getValue();
                                jk jkVar = new jk(g, this, fsfVar2, madVar, null, 18);
                                aadVar2.r = g;
                                aadVar2.s = null;
                                aadVar2.v = 2;
                                obj = gh2.a(gh2Var.a, madVar, jkVar, aadVar2);
                                if (obj == lu3Var) {
                                    return lu3Var;
                                }
                                fwhVar = (fwh) obj;
                                if (fwhVar == null) {
                                }
                            }
                        }
                        rofVar = null;
                        g.a = rofVar;
                        fsf fsfVar42 = new fsf();
                        if (rofVar != null) {
                        }
                        fsfVar2 = fsfVar42;
                        df2Var = null;
                        if (tvdVar.i.a) {
                            throw new NetworkOnMainThreadException();
                        }
                        mad e22 = e();
                        mad madVar2 = e22;
                        gh2 gh2Var2 = (gh2) mqiVar.getValue();
                        jk jkVar2 = new jk(g, this, fsfVar2, madVar2, null, 18);
                        aadVar2.r = g;
                        aadVar2.s = null;
                        aadVar2.v = 2;
                        obj = gh2.a(gh2Var2.a, madVar2, jkVar2, aadVar2);
                        if (obj == lu3Var) {
                        }
                        fwhVar = (fwh) obj;
                        if (fwhVar == null) {
                        }
                    } else if (fsfVar == 1) {
                        fsf fsfVar5 = aadVar2.s;
                        fsf fsfVar6 = aadVar2.r;
                        try {
                            y6a.M(obj);
                            fsfVar3 = fsfVar5;
                            g = fsfVar6;
                        } catch (Exception e3) {
                            e = e3;
                            fsfVar = fsfVar6;
                            rof rofVar2 = (rof) fsfVar.a;
                            if (rofVar2 != null) {
                                try {
                                    dmi.z(rofVar2);
                                } catch (RuntimeException e4) {
                                    throw e4;
                                } catch (Exception unused) {
                                }
                            }
                            throw e;
                        }
                    } else {
                        if (fsfVar != 2) {
                            if (fsfVar != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fsf fsfVar7 = aadVar2.r;
                            y6a.M(obj);
                            return (fwh) obj;
                        }
                        g = aadVar2.r;
                        y6a.M(obj);
                        fwhVar = (fwh) obj;
                        if (fwhVar == null) {
                            return fwhVar;
                        }
                        gh2 gh2Var3 = (gh2) mqiVar.getValue();
                        mad e5 = e();
                        gjb gjbVar = new gjb(this, rq3Var2, 14);
                        aadVar2.r = g;
                        aadVar2.s = null;
                        aadVar2.v = 3;
                        obj = gh2.a(gh2Var3.a, e5, gjbVar, aadVar2);
                    }
                    df2Var = (df2) obj;
                    zadVar = df2Var.b;
                    if (zadVar == null) {
                        int i2 = zadVar.a;
                        if ((200 > i2 || i2 >= 300) && i2 != 304) {
                            throw new ui9(zadVar);
                        }
                        return new fwh(f((rof) g.a), d(str, df2Var.b.d.a("Content-Type")), pe4.c);
                    }
                    fsfVar2 = fsfVar3;
                    if (tvdVar.i.a) {
                    }
                    mad e222 = e();
                    mad madVar22 = e222;
                    gh2 gh2Var22 = (gh2) mqiVar.getValue();
                    jk jkVar22 = new jk(g, this, fsfVar2, madVar22, null, 18);
                    aadVar2.r = g;
                    aadVar2.s = null;
                    aadVar2.v = 2;
                    obj = gh2.a(gh2Var22.a, madVar22, jkVar22, aadVar2);
                    if (obj == lu3Var) {
                    }
                    fwhVar = (fwh) obj;
                    if (fwhVar == null) {
                    }
                }
            }
            if (fsfVar != 0) {
            }
            df2Var = (df2) obj;
            zadVar = df2Var.b;
            if (zadVar == null) {
            }
        } catch (Exception e6) {
            e = e6;
        }
        aadVar = new aad(this, rq3Var);
        aad aadVar22 = aadVar;
        Object obj2 = aadVar22.t;
        lu3 lu3Var2 = lu3.a;
        fsfVar = aadVar22.v;
        mqi mqiVar2 = this.c;
        String str3 = this.a;
        tvd tvdVar2 = this.b;
        rq3 rq3Var22 = null;
    }

    public final s18 c() {
        s18 s18Var;
        sof sofVar = (sof) this.d.getValue();
        return (sofVar == null || (s18Var = sofVar.a) == null) ? this.b.f : s18Var;
    }

    public final mad e() {
        sl6 sl6Var = rt9.b;
        tvd tvdVar = this.b;
        fad fadVar = (fad) fqj.x(tvdVar, sl6Var);
        fadVar.getClass();
        l3a l3aVar = new l3a(fadVar);
        ze2 ze2Var = tvdVar.h;
        boolean z = ze2Var.a;
        boolean z2 = tvdVar.i.a && ((mk3) this.f.a).c();
        if (!z2 && z) {
            l3aVar.d("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                l3aVar.d("no-cache, only-if-cached");
            }
        } else if (ze2Var.b) {
            l3aVar.d("no-cache");
        } else {
            l3aVar.d("no-cache, no-store");
        }
        String str = (String) fqj.x(tvdVar, rt9.a);
        fad fadVar2 = new fad(tub.p(l3aVar.a));
        if (fqj.x(tvdVar, rt9.c) == null) {
            return new mad(this.a, str, fadVar2, tvdVar.j);
        }
        pvd.j();
        return null;
    }

    public final b18 f(rof rofVar) {
        c45 c45Var = rofVar.a;
        if (c45Var.b) {
            a70.r("snapshot is closed");
            return null;
        }
        uae uaeVar = (uae) c45Var.a.c.get(1);
        s18 c = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return c6o.h(uaeVar, c, str, rofVar, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(mwh mwhVar, sq3 sq3Var) {
        bad badVar;
        int i;
        x52 x52Var;
        if (sq3Var instanceof bad) {
            badVar = (bad) sq3Var;
            int i2 = badVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badVar.u = i2 - Integer.MIN_VALUE;
                Object obj = badVar.s;
                lu3 lu3Var = lu3.a;
                i = badVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    x52 x52Var2 = new x52();
                    badVar.r = x52Var2;
                    badVar.u = 1;
                    mwhVar.a.y0(x52Var2);
                    if (Unit.a == lu3Var) {
                        return lu3Var;
                    }
                    x52Var = x52Var2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x52Var = badVar.r;
                    y6a.M(obj);
                }
                return c6o.i(x52Var, c());
            }
        }
        badVar = new bad(this, sq3Var);
        Object obj2 = badVar.s;
        lu3 lu3Var2 = lu3.a;
        i = badVar.u;
        if (i != 0) {
        }
        return c6o.i(x52Var, c());
    }

    public final zad h(rof rofVar) {
        Throwable th;
        zad zadVar;
        try {
            s18 c = c();
            c45 c45Var = rofVar.a;
            if (c45Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            lof o = o6a.o(c.M((uae) c45Var.a.c.get(0)));
            try {
                zadVar = oyn.N(o);
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
                zadVar = null;
            }
            if (th == null) {
                return zadVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(rof rofVar, zad zadVar, mad madVar, zad zadVar2, sq3 sq3Var) {
        cad cadVar;
        int i;
        rof rofVar2;
        Object obj;
        zad zadVar3;
        zad zadVar4;
        cqa cqaVar;
        zad zadVar5;
        cqa cqaVar2;
        zad zadVar6;
        Exception exc;
        Throwable th;
        Throwable th2;
        en0 f;
        mwh mwhVar;
        mwh mwhVar2;
        j45 j45Var;
        c45 g;
        if (sq3Var instanceof cad) {
            cadVar = (cad) sq3Var;
            int i2 = cadVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cadVar.x = i2 - Integer.MIN_VALUE;
                cad cadVar2 = cadVar;
                Object obj2 = cadVar2.v;
                lu3 lu3Var = lu3.a;
                i = cadVar2.x;
                if (i != 0) {
                    y6a.M(obj2);
                    if (!this.b.h.b) {
                        if (rofVar != null) {
                            try {
                                dmi.z(rofVar);
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    ff2 ff2Var = (ff2) this.e.getValue();
                    tvd tvdVar = this.b;
                    cadVar2.r = rofVar;
                    cadVar2.s = zadVar2;
                    cadVar2.x = 1;
                    Object a = ff2Var.a(zadVar, madVar, zadVar2, tvdVar, cadVar2);
                    if (a != lu3Var) {
                        rofVar2 = rofVar;
                        obj = a;
                        zadVar3 = zadVar2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cqaVar2 = cadVar2.u;
                    zadVar5 = cadVar2.t;
                    zadVar6 = cadVar2.s;
                    try {
                        y6a.M(obj2);
                        en0 en0Var = (en0) cqaVar2.a;
                        j45Var = (j45) en0Var.e;
                        synchronized (j45Var.h) {
                            en0Var.j(true);
                            g = j45Var.g(((y35) en0Var.c).a);
                        }
                        if (g != null) {
                            return new rof(g);
                        }
                        return null;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            ((en0) cqaVar2.a).j(false);
                        } catch (Exception unused2) {
                        }
                        mwhVar = zadVar6.e;
                        if (mwhVar != null) {
                            try {
                                dmi.z(mwhVar);
                            } catch (RuntimeException e3) {
                                throw e3;
                            } catch (Exception unused3) {
                            }
                        }
                        mwhVar2 = zadVar5.e;
                        if (mwhVar2 != null) {
                            throw e;
                        }
                        try {
                            dmi.z(mwhVar2);
                            throw e;
                        } catch (RuntimeException e4) {
                            throw e4;
                        } catch (Exception unused4) {
                            throw e;
                        }
                    }
                }
                zad zadVar7 = cadVar2.s;
                rof rofVar3 = cadVar2.r;
                y6a.M(obj2);
                zadVar3 = zadVar7;
                rofVar2 = rofVar3;
                obj = obj2;
                zadVar4 = ((ef2) obj).a;
                if (zadVar4 != null) {
                    if (rofVar2 != null) {
                        c45 c45Var = rofVar2.a;
                        j45 j45Var2 = c45Var.c;
                        synchronized (j45Var2.h) {
                            c45Var.close();
                            f = j45Var2.f(c45Var.a.a);
                        }
                        if (f != null) {
                            cqaVar = new cqa(f);
                            if (cqaVar != null) {
                                try {
                                    try {
                                    } catch (Exception e5) {
                                        exc = e5;
                                    }
                                    try {
                                        kof n = o6a.n(c().H(((en0) cqaVar.a).p(0), false));
                                        try {
                                            oyn.V(zadVar4, n);
                                            Unit unit = Unit.a;
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
                                        }
                                        if (th != null) {
                                            throw th;
                                        }
                                        mwh mwhVar3 = zadVar4.e;
                                        if (mwhVar3 != null) {
                                            s18 c = c();
                                            try {
                                                uae p = ((en0) cqaVar.a).p(1);
                                                cadVar2.r = null;
                                                cadVar2.s = zadVar3;
                                                cadVar2.t = zadVar4;
                                                cadVar2.u = cqaVar;
                                                cadVar2.x = 2;
                                                l62 l62Var = mwhVar3.a;
                                                try {
                                                    kof n2 = o6a.n(c.H(p, false));
                                                    try {
                                                        o02.L(l62Var.y0(n2));
                                                        try {
                                                            n2.close();
                                                            th2 = null;
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
                                                    }
                                                    if (th2 != null) {
                                                        throw th2;
                                                    }
                                                    Unit unit2 = Unit.a;
                                                    if (unit2 != lu3Var) {
                                                        zadVar5 = zadVar4;
                                                        zadVar6 = zadVar3;
                                                        obj2 = unit2;
                                                        cqaVar2 = cqaVar;
                                                        en0 en0Var2 = (en0) cqaVar2.a;
                                                        j45Var = (j45) en0Var2.e;
                                                        synchronized (j45Var.h) {
                                                        }
                                                    }
                                                    return lu3Var;
                                                } catch (Exception e6) {
                                                    exc = e6;
                                                    e = exc;
                                                    zadVar5 = zadVar4;
                                                    cqaVar2 = cqaVar;
                                                    zadVar6 = zadVar3;
                                                    ((en0) cqaVar2.a).j(false);
                                                    mwhVar = zadVar6.e;
                                                    if (mwhVar != null) {
                                                    }
                                                    mwhVar2 = zadVar5.e;
                                                    if (mwhVar2 != null) {
                                                    }
                                                }
                                            } catch (Exception e7) {
                                                exc = e7;
                                            }
                                        } else {
                                            zadVar5 = zadVar4;
                                            cqaVar2 = cqaVar;
                                            zadVar6 = zadVar3;
                                            en0 en0Var22 = (en0) cqaVar2.a;
                                            j45Var = (j45) en0Var22.e;
                                            synchronized (j45Var.h) {
                                            }
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        zadVar5 = zadVar4;
                                        cqaVar2 = cqaVar;
                                        zadVar6 = zadVar3;
                                        ((en0) cqaVar2.a).j(false);
                                        mwhVar = zadVar6.e;
                                        if (mwhVar != null) {
                                        }
                                        mwhVar2 = zadVar5.e;
                                        if (mwhVar2 != null) {
                                        }
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    zadVar5 = zadVar4;
                                    cqaVar2 = cqaVar;
                                    zadVar6 = zadVar3;
                                    ((en0) cqaVar2.a).j(false);
                                    mwhVar = zadVar6.e;
                                    if (mwhVar != null) {
                                    }
                                    mwhVar2 = zadVar5.e;
                                    if (mwhVar2 != null) {
                                    }
                                }
                            }
                        }
                        cqaVar = null;
                        if (cqaVar != null) {
                        }
                    } else {
                        sof sofVar = (sof) this.d.getValue();
                        if (sofVar != null) {
                            String str = this.b.e;
                            if (str == null) {
                                str = this.a;
                            }
                            j45 j45Var3 = sofVar.b;
                            gc2 gc2Var = gc2.d;
                            en0 f2 = j45Var3.f(q1f.o(str).g("SHA-256").i());
                            if (f2 != null) {
                                cqaVar = new cqa(f2);
                                if (cqaVar != null) {
                                }
                            }
                        }
                        cqaVar = null;
                        if (cqaVar != null) {
                        }
                    }
                }
                return null;
            }
        }
        cadVar = new cad(this, sq3Var);
        cad cadVar22 = cadVar;
        Object obj22 = cadVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = cadVar22.x;
        if (i != 0) {
        }
        zadVar4 = ((ef2) obj).a;
        if (zadVar4 != null) {
        }
        return null;
    }
}
