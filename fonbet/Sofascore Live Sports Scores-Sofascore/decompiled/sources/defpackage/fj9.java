package defpackage;

import com.appsflyer.internal.i;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fj9 implements q7a {
    public volatile rm5 a;
    public volatile rm5 b;
    public volatile ej9 c;

    public final void a(q89 q89Var, int i) {
        rm5 rm5Var = this.a;
        vha.j(q89Var, i);
        rm5Var.getClass();
        String o = mz1.o(new StringBuilder(vha.j(q89Var, i)), ": ", vha.l(q89Var, i));
        gie gieVar = gie.a;
        gie.a.i(4, o);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb A[LOOP:0: B:38:0x00f9->B:39:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
    @Override // defpackage.q7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d2g intercept(p7a p7aVar) {
        boolean z;
        boolean z2;
        String str;
        long nanoTime;
        d2g b;
        boolean z3;
        Long l;
        Charset charset;
        z49 z49Var;
        boolean z4;
        int size;
        int i;
        String str2;
        Long l2;
        Charset charset2;
        ej9 ej9Var = this.c;
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        if (ej9Var == ej9.a) {
            return epfVar.b(qzfVar);
        }
        boolean z5 = true;
        boolean z6 = ej9Var == ej9.d;
        if (!z6 && ej9Var != ej9.c) {
            z5 = false;
        }
        yzf yzfVar = qzfVar.d;
        ge6 ge6Var = epfVar.d;
        qof c = ge6Var != null ? ge6Var.c() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(qzfVar.b);
        sb.append(' ');
        jl9 jl9Var = qzfVar.a;
        jl9Var.getClass();
        this.b.getClass();
        sb.append(jl9Var.i);
        sb.append(c != null ? " " + c.g : "");
        String sb2 = sb.toString();
        if (!z5 && yzfVar != null) {
            StringBuilder r = mz1.r(sb2, " (");
            r.append(yzfVar.contentLength());
            r.append("-byte body)");
            sb2 = r.toString();
        }
        gie gieVar = gie.a;
        gie.a.i(4, sb2);
        try {
            if (z5) {
                q89 q89Var = qzfVar.c;
                if (yzfVar != null) {
                    zdc contentType = yzfVar.contentType();
                    if (contentType == null || q89Var.a("Content-Type") != null) {
                        z = z6;
                    } else {
                        z = z6;
                        gie.a.i(4, "Content-Type: " + contentType);
                    }
                    if (yzfVar.contentLength() != -1 && q89Var.a("Content-Length") == null) {
                        StringBuilder sb3 = new StringBuilder("Content-Length: ");
                        z4 = z5;
                        sb3.append(yzfVar.contentLength());
                        gie.a.i(4, sb3.toString());
                        size = q89Var.size();
                        for (i = 0; i < size; i++) {
                            a(q89Var, i);
                        }
                        if (z || yzfVar == null) {
                            z2 = z4;
                            str = "Content-Encoding";
                            String str3 = "--> END " + qzfVar.b;
                            gie gieVar2 = gie.a;
                            gie.a.i(4, str3);
                        } else {
                            String a = qzfVar.c.a("Content-Encoding");
                            if (a != null && !a.equalsIgnoreCase("identity") && !a.equalsIgnoreCase("gzip")) {
                                String o = mz1.o(new StringBuilder("--> END "), qzfVar.b, " (encoded body omitted)");
                                gie gieVar3 = gie.a;
                                gie.a.i(4, o);
                            } else if (yzfVar.isDuplex()) {
                                String o2 = mz1.o(new StringBuilder("--> END "), qzfVar.b, " (duplex request body omitted)");
                                gie gieVar4 = gie.a;
                                gie.a.i(4, o2);
                            } else if (yzfVar.isOneShot()) {
                                String o3 = mz1.o(new StringBuilder("--> END "), qzfVar.b, " (one-shot body omitted)");
                                gie gieVar5 = gie.a;
                                gie.a.i(4, o3);
                            } else {
                                x52 x52Var = new x52();
                                yzfVar.writeTo(x52Var);
                                z2 = z4;
                                if ("gzip".equalsIgnoreCase(q89Var.a("Content-Encoding"))) {
                                    str2 = "Content-Encoding";
                                    l2 = Long.valueOf(x52Var.b);
                                    z49Var = new z49(x52Var);
                                    try {
                                        x52Var = new x52();
                                        x52Var.M0(z49Var);
                                        z49Var.close();
                                    } finally {
                                    }
                                } else {
                                    str2 = "Content-Encoding";
                                    l2 = null;
                                }
                                zdc contentType2 = yzfVar.contentType();
                                if (contentType2 == null || (charset2 = zdc.a(contentType2)) == null) {
                                    charset2 = Charsets.UTF_8;
                                }
                                gie gieVar6 = gie.a;
                                str = str2;
                                gie.a.i(4, "");
                                if (!tba.G(x52Var)) {
                                    gie.a.i(4, "--> END " + qzfVar.b + " (binary " + yzfVar.contentLength() + "-byte body omitted)");
                                } else if (l2 != null) {
                                    gie.a.i(4, "--> END " + qzfVar.b + " (" + x52Var.b + "-byte, " + l2.longValue() + "-gzipped-byte body)");
                                } else {
                                    gie.a.i(4, x52Var.C0(charset2));
                                    gie.a.i(4, "--> END " + qzfVar.b + " (" + yzfVar.contentLength() + "-byte body)");
                                }
                            }
                            z2 = z4;
                        }
                        nanoTime = System.nanoTime();
                        b = ((epf) p7aVar).b(qzfVar);
                        long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                        i2g i2gVar = b.g;
                        i2gVar.getClass();
                        long contentLength = i2gVar.contentLength();
                        String str4 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
                        z3 = z2;
                        StringBuilder sb4 = new StringBuilder("<-- " + b.d);
                        if (b.c.length() > 0) {
                            sb4.append(" " + b.c);
                        }
                        StringBuilder sb5 = new StringBuilder(" ");
                        jl9 jl9Var2 = b.a.a;
                        jl9Var2.getClass();
                        this.b.getClass();
                        i.n(nanoTime2, jl9Var2.i, " (", sb5);
                        sb5.append("ms");
                        sb4.append(sb5.toString());
                        if (!z3) {
                            sb4.append(", " + str4 + " body");
                        }
                        sb4.append(")");
                        gie.a.i(4, sb4.toString());
                        if (z3) {
                            q89 q89Var2 = b.f;
                            int size2 = q89Var2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                a(q89Var2, i2);
                            }
                            if (z && yi9.a(b)) {
                                String str5 = str;
                                String a2 = b.f.a(str5);
                                if (a2 != null && !a2.equalsIgnoreCase("identity") && !a2.equalsIgnoreCase("gzip")) {
                                    gie gieVar7 = gie.a;
                                    gie.a.i(4, "<-- END HTTP (encoded body omitted)");
                                    return b;
                                }
                                zdc contentType3 = b.g.contentType();
                                if (contentType3 != null && Intrinsics.c(contentType3.b, "text") && Intrinsics.c(contentType3.c, "event-stream")) {
                                    gie gieVar8 = gie.a;
                                    gie.a.i(4, "<-- END HTTP (streaming)");
                                    return b;
                                }
                                if (i2gVar instanceof hck) {
                                    gie gieVar9 = gie.a;
                                    gie.a.i(4, "<-- END HTTP (unreadable body)");
                                    return b;
                                }
                                l62 source = i2gVar.source();
                                source.request(Long.MAX_VALUE);
                                long nanoTime3 = (System.nanoTime() - nanoTime) / 1000000;
                                x52 u = source.u();
                                if ("gzip".equalsIgnoreCase(q89Var2.a(str5))) {
                                    l = Long.valueOf(u.b);
                                    z49Var = new z49(u.n());
                                    try {
                                        u = new x52();
                                        u.M0(z49Var);
                                        z49Var.close();
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    l = null;
                                }
                                zdc contentType4 = i2gVar.contentType();
                                if (contentType4 == null || (charset = zdc.a(contentType4)) == null) {
                                    charset = Charsets.UTF_8;
                                }
                                if (!tba.G(u)) {
                                    gie gieVar10 = gie.a;
                                    gie.a.i(4, "");
                                    StringBuilder sb6 = new StringBuilder("<-- END HTTP (");
                                    sb6.append(nanoTime3);
                                    sb6.append("ms, binary ");
                                    gie.a.i(4, lnb.l(u.b, "-byte body omitted)", sb6));
                                    return b;
                                }
                                if (contentLength != 0) {
                                    gie gieVar11 = gie.a;
                                    gie.a.i(4, "");
                                    gie.a.i(4, u.n().C0(charset));
                                }
                                StringBuilder sb7 = new StringBuilder(lnb.l(u.b, "-byte", ljg.o("<-- END HTTP (", nanoTime3, "ms, ")));
                                if (l != null) {
                                    sb7.append(", " + l.longValue() + "-gzipped-byte");
                                }
                                sb7.append(" body)");
                                String sb8 = sb7.toString();
                                gie gieVar12 = gie.a;
                                gie.a.i(4, sb8);
                                return b;
                            }
                            gie gieVar13 = gie.a;
                            gie.a.i(4, "<-- END HTTP");
                        }
                        return b;
                    }
                } else {
                    z = z6;
                }
                z4 = z5;
                size = q89Var.size();
                while (i < size) {
                }
                if (z) {
                }
                z2 = z4;
                str = "Content-Encoding";
                String str32 = "--> END " + qzfVar.b;
                gie gieVar22 = gie.a;
                gie.a.i(4, str32);
                nanoTime = System.nanoTime();
                b = ((epf) p7aVar).b(qzfVar);
                long nanoTime22 = (System.nanoTime() - nanoTime) / 1000000;
                i2g i2gVar2 = b.g;
                i2gVar2.getClass();
                long contentLength2 = i2gVar2.contentLength();
                if (contentLength2 != -1) {
                }
                z3 = z2;
                StringBuilder sb42 = new StringBuilder("<-- " + b.d);
                if (b.c.length() > 0) {
                }
                StringBuilder sb52 = new StringBuilder(" ");
                jl9 jl9Var22 = b.a.a;
                jl9Var22.getClass();
                this.b.getClass();
                i.n(nanoTime22, jl9Var22.i, " (", sb52);
                sb52.append("ms");
                sb42.append(sb52.toString());
                if (!z3) {
                }
                sb42.append(")");
                gie.a.i(4, sb42.toString());
                if (z3) {
                }
                return b;
            }
            z = z6;
            z2 = z5;
            b = ((epf) p7aVar).b(qzfVar);
            long nanoTime222 = (System.nanoTime() - nanoTime) / 1000000;
            i2g i2gVar22 = b.g;
            i2gVar22.getClass();
            long contentLength22 = i2gVar22.contentLength();
            if (contentLength22 != -1) {
            }
            z3 = z2;
            StringBuilder sb422 = new StringBuilder("<-- " + b.d);
            if (b.c.length() > 0) {
            }
            StringBuilder sb522 = new StringBuilder(" ");
            jl9 jl9Var222 = b.a.a;
            jl9Var222.getClass();
            this.b.getClass();
            i.n(nanoTime222, jl9Var222.i, " (", sb522);
            sb522.append("ms");
            sb422.append(sb522.toString());
            if (!z3) {
            }
            sb422.append(")");
            gie.a.i(4, sb422.toString());
            if (z3) {
            }
            return b;
        } catch (Exception e) {
            long nanoTime4 = (System.nanoTime() - nanoTime) / 1000000;
            StringBuilder sb9 = new StringBuilder(" ");
            jl9 jl9Var3 = qzfVar.a;
            jl9Var3.getClass();
            this.b.getClass();
            i.n(nanoTime4, jl9Var3.i, " (", sb9);
            sb9.append("ms)");
            String concat = ("<-- HTTP FAILED: " + e + '.').concat(sb9.toString());
            gie gieVar14 = gie.a;
            gie.a.i(4, concat);
            throw e;
        }
        str = "Content-Encoding";
        nanoTime = System.nanoTime();
    }
}
