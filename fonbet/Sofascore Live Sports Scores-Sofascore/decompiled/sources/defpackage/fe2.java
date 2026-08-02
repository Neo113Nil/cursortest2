package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fe2 {
    public static final String k;
    public static final String l;
    public final jl9 a;
    public final q89 b;
    public final String c;
    public final qff d;
    public final int e;
    public final String f;
    public final q89 g;
    public final w69 h;
    public final long i;
    public final long j;

    static {
        gie gieVar = gie.a;
        gie.a.getClass();
        k = "OkHttp-Sent-Millis";
        gie.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public fe2(cwh cwhVar) {
        jl9 jl9Var;
        ljj ljjVar;
        cwhVar.getClass();
        try {
            lof lofVar = new lof(cwhVar);
            String n = lofVar.n(Long.MAX_VALUE);
            try {
                il9 il9Var = new il9(0);
                il9Var.h(null, n);
                jl9Var = il9Var.c();
            } catch (IllegalArgumentException unused) {
                jl9Var = null;
            }
            if (jl9Var == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(n));
                gie gieVar = gie.a;
                gie.a.i(5, "cache corruption");
                throw iOException;
            }
            this.a = jl9Var;
            this.c = lofVar.n(Long.MAX_VALUE);
            ef0 ef0Var = new ef0(1);
            int J = ktm.J(lofVar);
            for (int i = 0; i < J; i++) {
                ef0Var.c(lofVar.n(Long.MAX_VALUE));
            }
            this.b = vha.i(ef0Var);
            b10 D = aba.D(lofVar.n(Long.MAX_VALUE));
            this.d = (qff) D.c;
            this.e = D.b;
            this.f = (String) D.d;
            ef0 ef0Var2 = new ef0(1);
            int J2 = ktm.J(lofVar);
            for (int i2 = 0; i2 < J2; i2++) {
                ef0Var2.c(lofVar.n(Long.MAX_VALUE));
            }
            String str = k;
            String h = ef0Var2.h(str);
            String str2 = l;
            String h2 = ef0Var2.h(str2);
            ef0Var2.m(str);
            ef0Var2.m(str2);
            this.i = h != null ? Long.parseLong(h) : 0L;
            this.j = h2 != null ? Long.parseLong(h2) : 0L;
            this.g = vha.i(ef0Var2);
            if (this.a.f()) {
                String n2 = lofVar.n(Long.MAX_VALUE);
                if (n2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + n2 + '\"');
                }
                tu2 s = tu2.b.s(lofVar.n(Long.MAX_VALUE));
                List a = a(lofVar);
                List a2 = a(lofVar);
                if (lofVar.w()) {
                    ljjVar = ljj.SSL_3_0;
                } else {
                    ubf ubfVar = ljj.b;
                    String n3 = lofVar.n(Long.MAX_VALUE);
                    ubfVar.getClass();
                    ljjVar = ubf.a(n3);
                }
                a.getClass();
                a2.getClass();
                this.h = new w69(ljjVar, s, yol.j(a2), new el2(yol.j(a), 2));
            } else {
                this.h = null;
            }
            Unit unit = Unit.a;
            cwhVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4o.x(cwhVar, th);
                throw th2;
            }
        }
    }

    public static List a(lof lofVar) {
        int J = ktm.J(lofVar);
        if (J == -1) {
            return km5.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            ArrayList arrayList = new ArrayList(J);
            for (int i = 0; i < J; i++) {
                String n = lofVar.n(Long.MAX_VALUE);
                x52 x52Var = new x52();
                gc2 gc2Var = gc2.d;
                gc2 j = q1f.j(n);
                if (j == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                x52Var.X0(j);
                arrayList.add(certificateFactory.generateCertificate(new oy1(x52Var, 1)));
            }
            return arrayList;
        } catch (CertificateException e) {
            is8.e(e.getMessage());
            return null;
        }
    }

    public static void b(kof kofVar, List list) {
        try {
            kofVar.m(list.size());
            kofVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                gc2 gc2Var = gc2.d;
                encoded.getClass();
                kofVar.S(q1f.s(encoded).d());
                kofVar.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            is8.e(e.getMessage());
        }
    }

    public final void c(en0 en0Var) {
        w69 w69Var;
        jl9 jl9Var = this.a;
        q89 q89Var = this.g;
        q89 q89Var2 = this.b;
        kof kofVar = new kof(en0Var.t(0));
        try {
            kofVar.S(jl9Var.i);
            kofVar.writeByte(10);
            kofVar.S(this.c);
            kofVar.writeByte(10);
            kofVar.m(q89Var2.size());
            kofVar.writeByte(10);
            int size = q89Var2.size();
            for (int i = 0; i < size; i++) {
                kofVar.S(vha.j(q89Var2, i));
                kofVar.S(": ");
                kofVar.S(vha.l(q89Var2, i));
                kofVar.writeByte(10);
            }
            qff qffVar = this.d;
            int i2 = this.e;
            String str = this.f;
            qffVar.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (qffVar == qff.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            kofVar.S(sb.toString());
            kofVar.writeByte(10);
            kofVar.m(q89Var.size() + 2);
            kofVar.writeByte(10);
            int size2 = q89Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                kofVar.S(vha.j(q89Var, i3));
                kofVar.S(": ");
                kofVar.S(vha.l(q89Var, i3));
                kofVar.writeByte(10);
            }
            kofVar.S(k);
            kofVar.S(": ");
            kofVar.m(this.i);
            kofVar.writeByte(10);
            kofVar.S(l);
            kofVar.S(": ");
            kofVar.m(this.j);
            kofVar.writeByte(10);
            if (jl9Var.f() && (w69Var = this.h) != null) {
                kofVar.writeByte(10);
                kofVar.S(w69Var.b.a);
                kofVar.writeByte(10);
                b(kofVar, w69Var.a());
                b(kofVar, w69Var.c);
                kofVar.S(w69Var.a.a);
                kofVar.writeByte(10);
            }
            Unit unit = Unit.a;
            kofVar.close();
        } finally {
        }
    }

    public fe2(d2g d2gVar) {
        q89 i;
        qzf qzfVar = d2gVar.a;
        this.a = qzfVar.a;
        d2g d2gVar2 = d2gVar.i;
        d2gVar2.getClass();
        q89 q89Var = d2gVar2.a.c;
        q89 q89Var2 = d2gVar.f;
        Set L = ktm.L(q89Var2);
        if (L.isEmpty()) {
            i = q89.b;
        } else {
            ef0 ef0Var = new ef0(1);
            int size = q89Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String j = vha.j(q89Var, i2);
                if (L.contains(j)) {
                    ef0Var.b(j, vha.l(q89Var, i2));
                }
            }
            i = vha.i(ef0Var);
        }
        this.b = i;
        this.c = qzfVar.b;
        this.d = d2gVar.b;
        this.e = d2gVar.d;
        this.f = d2gVar.c;
        this.g = q89Var2;
        this.h = d2gVar.e;
        this.i = d2gVar.l;
        this.j = d2gVar.m;
    }
}
