package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kh2 implements q7a {
    public static final kh2 b = new kh2(0);
    public static final kh2 c = new kh2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ kh2(int i) {
        this.a = i;
    }

    public static qzf a(d2g d2gVar, ge6 ge6Var, epf epfVar) {
        il9 il9Var;
        yzf yzfVar;
        d2g d2gVar2;
        v7g v7gVar = ge6Var != null ? ge6Var.c().c : null;
        int i = d2gVar.d;
        qzf qzfVar = d2gVar.a;
        String str = qzfVar.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return epfVar.i.m(v7gVar, d2gVar);
            }
            if (i == 421) {
                yzf yzfVar2 = qzfVar.d;
                if ((yzfVar2 == null || !yzfVar2.isOneShot()) && ge6Var != null && !Intrinsics.c(((je6) ge6Var.d).d().j.h.d, ((ie6) ge6Var.e).j().f().a.h.d)) {
                    qof c2 = ge6Var.c();
                    synchronized (c2) {
                        c2.l = true;
                        Unit unit = Unit.a;
                    }
                    return d2gVar.a;
                }
            } else if (i == 503) {
                d2g d2gVar3 = d2gVar.k;
                if ((d2gVar3 == null || d2gVar3.d != 503) && d(d2gVar, Integer.MAX_VALUE) == 0) {
                    return d2gVar.a;
                }
            } else {
                if (i == 407) {
                    v7gVar.getClass();
                    if (v7gVar.b.type() == Proxy.Type.HTTP) {
                        return epfVar.p.m(v7gVar, d2gVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (epfVar.r && (((yzfVar = qzfVar.d) == null || !yzfVar.isOneShot()) && (((d2gVar2 = d2gVar.k) == null || d2gVar2.d != 408) && d(d2gVar, 0) <= 0))) {
                    return d2gVar.a;
                }
            }
            return null;
        }
        if (epfVar.a.a.h) {
            String a = d2gVar.f.a("Location");
            if (a == null) {
                a = null;
            }
            qzf qzfVar2 = d2gVar.a;
            if (a != null) {
                jl9 jl9Var = qzfVar2.a;
                jl9Var.getClass();
                try {
                    il9Var = new il9(0);
                    il9Var.h(jl9Var, a);
                } catch (IllegalArgumentException unused) {
                    il9Var = null;
                }
                jl9 c3 = il9Var != null ? il9Var.c() : null;
                if (c3 != null && (Intrinsics.c(c3.a, qzfVar2.a.a) || epfVar.a.a.i)) {
                    pzf b2 = qzfVar2.b();
                    if (td4.o0(str)) {
                        int i2 = d2gVar.d;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            b2.e(str, z ? qzfVar2.d : null);
                        } else {
                            b2.e(C4094gc.a, null);
                        }
                        if (!z) {
                            b2.c.m("Transfer-Encoding");
                            b2.c.m("Content-Length");
                            b2.c.m("Content-Type");
                        }
                    }
                    if (!yol.a(qzfVar2.a, c3)) {
                        b2.c.m("Authorization");
                    }
                    b2.a = c3;
                    return new qzf(b2);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03ee  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [fe2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [en0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [en0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [en0] */
    /* JADX WARN: Type inference failed for: r4v19, types: [en0] */
    /* JADX WARN: Type inference failed for: r5v18, types: [n72] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, n72] */
    /* JADX WARN: Type inference failed for: r6v25, types: [fe2] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final d2g b(p7a p7aVar) {
        d2g d2gVar;
        d2g d2gVar2;
        ?? r17;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        int i;
        long j;
        long j2;
        ?? r16;
        int i2;
        d2g d2gVar3;
        z41 z41Var;
        String str;
        String str2;
        long j3;
        long j4;
        long j5;
        long j6;
        String sb;
        int i3;
        long j7;
        long j8;
        Date date5;
        String str3;
        ?? r2;
        int i4;
        qzf qzfVar;
        ?? r5;
        ?? r3;
        ?? r4;
        d45 k;
        String str4;
        q89 q89Var;
        jl9 jl9Var;
        qzf qzfVar2;
        igf igfVar;
        qff qffVar;
        int i5;
        String str5;
        ef0 k2;
        ee2 ee2Var;
        w69 w69Var;
        long j9;
        long j10;
        epf epfVar = (epf) p7aVar;
        ie2 ie2Var = epfVar.j;
        if (ie2Var != null) {
            qzf qzfVar3 = epfVar.e;
            qzfVar3.getClass();
            try {
                k = ie2Var.a.k(ktm.B(qzfVar3.a));
            } catch (IOException unused) {
            }
            if (k != null) {
                try {
                    fe2 fe2Var = new fe2((cwh) k.c.get(0));
                    str4 = fe2Var.c;
                    q89Var = fe2Var.b;
                    jl9Var = fe2Var.a;
                    q89 q89Var2 = fe2Var.g;
                    String a = q89Var2.a("Content-Type");
                    String a2 = q89Var2.a("Content-Length");
                    jl9Var.getClass();
                    q89Var.getClass();
                    str4.getClass();
                    pzf pzfVar = new pzf();
                    pzfVar.a = jl9Var;
                    pzfVar.c = vha.k(q89Var);
                    pzfVar.e(!str4.equals("\u0000") ? str4 : C4094gc.a, null);
                    qzfVar2 = new qzf(pzfVar);
                    h2g h2gVar = i2g.Companion;
                    igfVar = vuj.C7;
                    new ef0(1);
                    qffVar = fe2Var.d;
                    qffVar.getClass();
                    i5 = fe2Var.e;
                    str5 = fe2Var.f;
                    str5.getClass();
                    k2 = vha.k(q89Var2);
                    d2gVar = null;
                    ee2Var = new ee2(k, a, a2);
                    w69Var = fe2Var.h;
                    j9 = fe2Var.i;
                    j10 = fe2Var.j;
                } catch (IOException unused2) {
                    d2gVar = null;
                    wol.b(k);
                }
                if (i5 < 0) {
                    hc5.f(ljg.j(i5, "code < 0: "));
                    return null;
                }
                d2gVar2 = new d2g(qzfVar2, qffVar, str5, i5, w69Var, vha.i(k2), ee2Var, null, null, null, null, j9, j10, null, igfVar);
                if (jl9Var.equals(qzfVar3.a) && str4.equals(qzfVar3.b)) {
                    Set<String> L = ktm.L(d2gVar2.f);
                    if (!(L instanceof Collection) || !L.isEmpty()) {
                        for (String str6 : L) {
                            if (!Intrinsics.c(q89Var.d(str6), qzfVar3.c.d(str6))) {
                            }
                        }
                    }
                }
                wol.b(d2gVar2.g);
                d2gVar2 = d2gVar;
                break;
            }
            d2gVar2 = null;
            d2gVar = null;
            long currentTimeMillis = System.currentTimeMillis();
            qzf qzfVar4 = epfVar.e;
            qzfVar4.getClass();
            if (d2gVar2 == null) {
                j = d2gVar2.l;
                j2 = d2gVar2.m;
                q89 q89Var3 = d2gVar2.f;
                int size = q89Var3.size();
                Object obj = d2gVar;
                r17 = obj;
                date = r17;
                date2 = date;
                date3 = date2;
                date4 = date3;
                int i6 = 0;
                int i7 = -1;
                Object obj2 = obj;
                while (i6 < size) {
                    String j11 = vha.j(q89Var3, i6);
                    ?? l = vha.l(q89Var3, i6);
                    if (j11.equalsIgnoreCase("Date")) {
                        date = pg4.a(l);
                        date4 = l;
                    } else if (j11.equalsIgnoreCase("Expires")) {
                        obj2 = pg4.a(l);
                    } else if (j11.equalsIgnoreCase("Last-Modified")) {
                        r17 = pg4.a(l);
                        date3 = l;
                    } else if (j11.equalsIgnoreCase(Command.HTTP_HEADER_ETAG)) {
                        date2 = l;
                    } else if (j11.equalsIgnoreCase("Age")) {
                        i7 = wol.o(-1, l);
                    }
                    i6++;
                    obj2 = obj2;
                }
                i = i7;
                r16 = obj2;
            } else {
                d2g d2gVar4 = d2gVar;
                r17 = d2gVar4;
                date = r17;
                date2 = date;
                date3 = date2;
                date4 = date3;
                i = -1;
                j = 0;
                j2 = 0;
                r16 = d2gVar4;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i2 = 3;
            if (d2gVar2 != null) {
                d2g d2gVar5 = d2gVar;
                z41Var = new z41(i2, qzfVar4, d2gVar5);
                d2gVar3 = d2gVar5;
            } else {
                jl9 jl9Var2 = qzfVar4.a;
                q89 q89Var4 = qzfVar4.c;
                if (jl9Var2.f() && d2gVar2.e == null) {
                    i2 = 3;
                    z41Var = new z41(i2, qzfVar4, null);
                    d2gVar3 = null;
                } else {
                    Object obj3 = null;
                    i2 = 3;
                    if (n4o.I(d2gVar2, qzfVar4)) {
                        je2 a3 = qzfVar4.a();
                        if (!a3.a && q89Var4.a("If-Modified-Since") == null && q89Var4.a("If-None-Match") == null) {
                            je2 h = d2gVar2.h();
                            if (date != null) {
                                str = "If-None-Match";
                                str2 = "If-Modified-Since";
                                j3 = j;
                                j4 = Math.max(0L, j2 - date.getTime());
                            } else {
                                str = "If-None-Match";
                                str2 = "If-Modified-Since";
                                j3 = j;
                                j4 = 0;
                            }
                            if (i != -1) {
                                j4 = Math.max(j4, timeUnit.toMillis(i));
                            }
                            long max = j4 + Math.max(0L, j2 - j3) + Math.max(0L, currentTimeMillis - j2);
                            int i8 = d2gVar2.h().c;
                            if (i8 != -1) {
                                j6 = timeUnit.toMillis(i8);
                            } else if (r16 != 0) {
                                if (date != null) {
                                    j2 = date.getTime();
                                }
                                j6 = r16.getTime() - j2;
                                if (j6 <= 0) {
                                    j6 = 0;
                                }
                            } else {
                                if (r17 != null) {
                                    List list = d2gVar2.a.a.g;
                                    if (list == null) {
                                        sb = null;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        l98.k0(list, sb2);
                                        sb = sb2.toString();
                                    }
                                    if (sb == null) {
                                        long time = (date != null ? date.getTime() : j3) - r17.getTime();
                                        j5 = 0;
                                        if (time > 0) {
                                            j6 = time / 10;
                                            i3 = a3.c;
                                            if (i3 != -1) {
                                                j6 = Math.min(j6, timeUnit.toMillis(i3));
                                            }
                                            int i9 = a3.i;
                                            long millis = i9 == -1 ? timeUnit.toMillis(i9) : j5;
                                            if (!h.g || (i4 = a3.h) == -1) {
                                                j7 = max;
                                                j8 = j5;
                                            } else {
                                                j7 = max;
                                                j8 = timeUnit.toMillis(i4);
                                            }
                                            if (!h.a) {
                                                long j12 = j7 + millis;
                                                if (j12 < j8 + j6) {
                                                    b2g k3 = d2gVar2.k();
                                                    if (j12 >= j6) {
                                                        k3.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                    }
                                                    if (j7 > 86400000 && d2gVar2.h().c == -1 && r16 == 0) {
                                                        k3.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                    }
                                                    i2 = 3;
                                                    d2gVar3 = null;
                                                    z41Var = new z41(i2, false ? 1 : 0, k3.a());
                                                }
                                            }
                                            if (date2 == null) {
                                                str3 = str;
                                                r2 = date2;
                                            } else {
                                                if (r17 != null) {
                                                    date5 = date3;
                                                } else if (date != null) {
                                                    date5 = date4;
                                                } else {
                                                    i2 = 3;
                                                    d2gVar3 = null;
                                                    z41Var = new z41(i2, qzfVar4, false ? 1 : 0);
                                                }
                                                str3 = str2;
                                                r2 = date5;
                                            }
                                            ef0 k4 = vha.k(q89Var4);
                                            r2.getClass();
                                            vha.h(k4, str3, r2);
                                            pzf b2 = qzfVar4.b();
                                            b2.c = vha.k(vha.i(k4));
                                            i2 = 3;
                                            z41Var = new z41(i2, new qzf(b2), d2gVar2);
                                            d2gVar3 = null;
                                        }
                                        j6 = j5;
                                        i3 = a3.c;
                                        if (i3 != -1) {
                                        }
                                        int i92 = a3.i;
                                        if (i92 == -1) {
                                        }
                                        if (h.g) {
                                        }
                                        j7 = max;
                                        j8 = j5;
                                        if (!h.a) {
                                        }
                                        if (date2 == null) {
                                        }
                                        ef0 k42 = vha.k(q89Var4);
                                        r2.getClass();
                                        vha.h(k42, str3, r2);
                                        pzf b22 = qzfVar4.b();
                                        b22.c = vha.k(vha.i(k42));
                                        i2 = 3;
                                        z41Var = new z41(i2, new qzf(b22), d2gVar2);
                                        d2gVar3 = null;
                                    }
                                }
                                j5 = 0;
                                j6 = j5;
                                i3 = a3.c;
                                if (i3 != -1) {
                                }
                                int i922 = a3.i;
                                if (i922 == -1) {
                                }
                                if (h.g) {
                                }
                                j7 = max;
                                j8 = j5;
                                if (!h.a) {
                                }
                                if (date2 == null) {
                                }
                                ef0 k422 = vha.k(q89Var4);
                                r2.getClass();
                                vha.h(k422, str3, r2);
                                pzf b222 = qzfVar4.b();
                                b222.c = vha.k(vha.i(k422));
                                i2 = 3;
                                z41Var = new z41(i2, new qzf(b222), d2gVar2);
                                d2gVar3 = null;
                            }
                            j5 = 0;
                            i3 = a3.c;
                            if (i3 != -1) {
                            }
                            int i9222 = a3.i;
                            if (i9222 == -1) {
                            }
                            if (h.g) {
                            }
                            j7 = max;
                            j8 = j5;
                            if (!h.a) {
                            }
                            if (date2 == null) {
                            }
                            ef0 k4222 = vha.k(q89Var4);
                            r2.getClass();
                            vha.h(k4222, str3, r2);
                            pzf b2222 = qzfVar4.b();
                            b2222.c = vha.k(vha.i(k4222));
                            i2 = 3;
                            z41Var = new z41(i2, new qzf(b2222), d2gVar2);
                            d2gVar3 = null;
                        } else {
                            i2 = 3;
                            d2gVar3 = null;
                            z41Var = new z41(i2, qzfVar4, false ? 1 : 0);
                        }
                    } else {
                        d2gVar3 = null;
                        z41Var = new z41(i2, qzfVar4, obj3);
                    }
                }
            }
            if (((qzf) z41Var.b) != null && qzfVar4.a().j) {
                z41Var = new z41(i2, d2gVar3, d2gVar3);
            }
            qzfVar = (qzf) z41Var.b;
            d2g d2gVar6 = (d2g) z41Var.c;
            if (ie2Var != null) {
                synchronized (ie2Var) {
                }
            }
            if (d2gVar2 != null && d2gVar6 == null) {
                wol.b(d2gVar2.g);
            }
            if (qzfVar != null && d2gVar6 == null) {
                i2g i2gVar = i2g.EMPTY;
                igf igfVar2 = vuj.C7;
                ArrayList arrayList = new ArrayList(20);
                qzf qzfVar5 = epfVar.e;
                qzfVar5.getClass();
                d2g d2gVar7 = new d2g(qzfVar5, qff.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", PglCryptUtils.BASE64_FAILED, null, new q89((String[]) arrayList.toArray(new String[0])), i2gVar, null, null, null, null, -1L, System.currentTimeMillis(), null, igfVar2);
                epfVar.a.d.getClass();
                return d2gVar7;
            }
            if (qzfVar != null) {
                d2gVar6.getClass();
                b2g k5 = d2gVar6.k();
                d2g I = v8a.I(d2gVar6);
                b2g.b("cacheResponse", I);
                k5.j = I;
                d2g a4 = k5.a();
                epfVar.a.d.getClass();
                return a4;
            }
            if (d2gVar6 != null) {
                epfVar.a.d.getClass();
            } else if (ie2Var != null) {
                epfVar.a.d.getClass();
            }
            try {
                d2g b3 = ((epf) p7aVar).b(qzfVar);
                if (d2gVar6 != null) {
                    if (b3.d == 304) {
                        b2g k6 = d2gVar6.k();
                        q89 q89Var5 = d2gVar6.f;
                        q89 q89Var6 = b3.f;
                        ArrayList arrayList2 = new ArrayList(20);
                        int size2 = q89Var5.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            String j13 = vha.j(q89Var5, i10);
                            String l2 = vha.l(q89Var5, i10);
                            if ((!"Warning".equalsIgnoreCase(j13) || !c.v(l2, "1", false)) && ("Content-Length".equalsIgnoreCase(j13) || "Content-Encoding".equalsIgnoreCase(j13) || "Content-Type".equalsIgnoreCase(j13) || !wnn.I(j13) || q89Var6.a(j13) == null)) {
                                arrayList2.add(j13);
                                arrayList2.add(StringsKt.l0(l2).toString());
                            }
                        }
                        int size3 = q89Var6.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            String j14 = vha.j(q89Var6, i11);
                            if (!"Content-Length".equalsIgnoreCase(j14) && !"Content-Encoding".equalsIgnoreCase(j14) && !"Content-Type".equalsIgnoreCase(j14) && wnn.I(j14)) {
                                String l3 = vha.l(q89Var6, i11);
                                arrayList2.add(j14);
                                arrayList2.add(StringsKt.l0(l3).toString());
                            }
                        }
                        k6.f = vha.k(new q89((String[]) arrayList2.toArray(new String[0])));
                        k6.l = b3.l;
                        k6.m = b3.m;
                        d2g I2 = v8a.I(d2gVar6);
                        b2g.b("cacheResponse", I2);
                        k6.j = I2;
                        d2g I3 = v8a.I(b3);
                        b2g.b("networkResponse", I3);
                        k6.i = I3;
                        d2g a5 = k6.a();
                        b3.g.close();
                        ie2Var.getClass();
                        synchronized (ie2Var) {
                        }
                        ?? fe2Var2 = new fe2(a5);
                        i2g i2gVar2 = d2gVar6.g;
                        i2gVar2.getClass();
                        d45 d45Var = ((ee2) i2gVar2).d;
                        try {
                            r4 = d45Var.d.j(d45Var.b, d45Var.a);
                            if (r4 != null) {
                                try {
                                    fe2Var2.c(r4);
                                    r4.i();
                                } catch (IOException unused3) {
                                    if (r4 != null) {
                                        try {
                                            r4.b();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    epfVar.a.d.getClass();
                                    return a5;
                                }
                            }
                        } catch (IOException unused5) {
                            r4 = d2gVar3;
                        }
                        epfVar.a.d.getClass();
                        return a5;
                    }
                    wol.b(d2gVar6.g);
                }
                b2g k7 = b3.k();
                d2g I4 = d2gVar6 != null ? v8a.I(d2gVar6) : d2gVar3;
                b2g.b("cacheResponse", I4);
                k7.j = I4;
                d2g I5 = v8a.I(b3);
                b2g.b("networkResponse", I5);
                k7.i = I5;
                d2g a6 = k7.a();
                if (ie2Var != null) {
                    if (yi9.a(a6) && n4o.I(a6, qzfVar)) {
                        b2g k8 = a6.k();
                        k8.a = qzfVar;
                        d2g a7 = k8.a();
                        qzf qzfVar6 = a7.a;
                        String str7 = qzfVar6.b;
                        if (!td4.g0(str7)) {
                            if (str7.equals(C4094gc.a) && !ktm.L(a7.f).contains("*")) {
                                ?? fe2Var3 = new fe2(a7);
                                try {
                                    l45 l45Var = ie2Var.a;
                                    String B = ktm.B(qzfVar6.a);
                                    Regex regex = l45.t;
                                    r3 = l45Var.j(-1L, B);
                                } catch (IOException unused6) {
                                    r3 = d2gVar3;
                                }
                                if (r3 != null) {
                                    try {
                                        fe2Var3.c(r3);
                                        r5 = new n72();
                                        r5.e = ie2Var;
                                        r5.b = r3;
                                        ejh t = r3.t(1);
                                        r5.c = t;
                                        r5.d = new ge2(ie2Var, r5, t);
                                    } catch (IOException unused7) {
                                        if (r3 != null) {
                                            r3.b();
                                        }
                                        r5 = d2gVar3;
                                        if (r5 != null) {
                                        }
                                        if (d2gVar6 != null) {
                                        }
                                        return a6;
                                    }
                                    if (r5 != null) {
                                        xe2 xe2Var = new xe2(a6.g.source(), r5, o6a.n((ge2) r5.d));
                                        String a8 = a6.f.a("Content-Type");
                                        ?? r15 = d2gVar3;
                                        if (a8 != null) {
                                            r15 = a8;
                                        }
                                        long contentLength = a6.g.contentLength();
                                        b2g k9 = a6.k();
                                        k9.g = new hpf(r15, contentLength, new lof(xe2Var));
                                        a6 = k9.a();
                                    }
                                    if (d2gVar6 != null) {
                                        epfVar.a.d.getClass();
                                    }
                                    return a6;
                                }
                            }
                            r5 = d2gVar3;
                            if (r5 != null) {
                            }
                            if (d2gVar6 != null) {
                            }
                            return a6;
                        }
                        ie2Var.e(qzfVar6);
                        r5 = d2gVar3;
                        if (r5 != null) {
                        }
                        if (d2gVar6 != null) {
                        }
                        return a6;
                    }
                    if (td4.g0(qzfVar.b)) {
                        try {
                            ie2Var.e(qzfVar);
                        } catch (IOException unused8) {
                        }
                    }
                }
                return a6;
            } catch (Throwable th) {
                if (d2gVar2 != null) {
                    wol.b(d2gVar2.g);
                }
                throw th;
            }
        }
        d2gVar = null;
        d2gVar2 = d2gVar;
        long currentTimeMillis2 = System.currentTimeMillis();
        qzf qzfVar42 = epfVar.e;
        qzfVar42.getClass();
        if (d2gVar2 == null) {
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        i2 = 3;
        if (d2gVar2 != null) {
        }
        if (((qzf) z41Var.b) != null) {
            z41Var = new z41(i2, d2gVar3, d2gVar3);
        }
        qzfVar = (qzf) z41Var.b;
        d2g d2gVar62 = (d2g) z41Var.c;
        if (ie2Var != null) {
        }
        if (d2gVar2 != null) {
            wol.b(d2gVar2.g);
        }
        if (qzfVar != null) {
        }
        if (qzfVar != null) {
        }
    }

    public static boolean c(IOException iOException, pof pofVar, epf epfVar, qzf qzfVar) {
        yzf yzfVar;
        boolean z = iOException instanceof ek3;
        if (!epfVar.r) {
            return false;
        }
        if ((!z && (((yzfVar = qzfVar.d) != null && yzfVar.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        ge6 ge6Var = pofVar.r;
        if (ge6Var == null || !ge6Var.b) {
            return false;
        }
        je6 je6Var = pofVar.h;
        je6Var.getClass();
        ipf d = je6Var.d();
        ge6 ge6Var2 = pofVar.r;
        return d.a(ge6Var2 != null ? ge6Var2.c() : null);
    }

    public static int d(d2g d2gVar, int i) {
        String a = d2gVar.f.a(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        if (!new Regex("\\d+").f(a)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v80 ipf, still in use, count: 2, list:
          (r0v80 ipf) from 0x00dc: MOVE (r36v2 ipf) = (r0v80 ipf) (LINE:221)
          (r0v80 ipf) from 0x00d1: MOVE (r36v4 ipf) = (r0v80 ipf) (LINE:210)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27, types: [ie6] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    @Override // defpackage.q7a
    public final defpackage.d2g intercept(defpackage.p7a r37) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh2.intercept(p7a):d2g");
    }
}
