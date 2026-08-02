package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import xsna.urd0;

/* compiled from: CertificatePinner.java */
/* loaded from: classes14.dex */
public final class f {
    public static final f c = new a().a();
    private final Set<b> a;
    private final com.mbridge.msdk.thrid.okhttp.internal.tls.c b;

    /* compiled from: CertificatePinner.java */
    public static final class a {
        private final List<b> a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.a), null);
        }
    }

    /* compiled from: CertificatePinner.java */
    public static final class b {
        final String a;
        final String b;
        final String c;
        final com.mbridge.msdk.thrid.okio.f d;

        public boolean a(String str) {
            if (!this.a.startsWith("*.")) {
                return str.equals(this.b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.b.length()) {
                return false;
            }
            String str2 = this.b;
            return str.regionMatches(false, indexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        public int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.c);
        }

        public String toString() {
            return this.c + this.d.d();
        }
    }

    public f(Set<b> set, com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        this.a = set;
        this.b = cVar;
    }

    public static com.mbridge.msdk.thrid.okio.f b(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).i();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> a2 = a(str);
        if (a2.isEmpty()) {
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = a2.size();
            com.mbridge.msdk.thrid.okio.f fVar = null;
            com.mbridge.msdk.thrid.okio.f fVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = a2.get(i2);
                if (bVar.c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = b(x509Certificate);
                    }
                    if (bVar.d.equals(fVar)) {
                        return;
                    }
                } else {
                    if (!bVar.c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                    }
                    if (fVar2 == null) {
                        fVar2 = a(x509Certificate);
                    }
                    if (bVar.d.equals(fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int size4 = a2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = a2.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b, fVar.b) && this.a.equals(fVar.a);
    }

    public int hashCode() {
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.b;
        return this.a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public List<b> a(String str) {
        List<b> list = Collections.EMPTY_LIST;
        for (b bVar : this.a) {
            if (bVar.a(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                list.add(bVar);
            }
        }
        return list;
    }

    public f a(com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b, cVar) ? this : new f(this.a, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).d();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static com.mbridge.msdk.thrid.okio.f a(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).h();
    }
}
