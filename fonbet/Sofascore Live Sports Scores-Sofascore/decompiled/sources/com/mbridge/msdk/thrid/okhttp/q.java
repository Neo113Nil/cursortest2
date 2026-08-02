package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.is8;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q {
    private final d0 a;
    private final g b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = d0Var;
        this.b = gVar;
        this.c = list;
        this.d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        String cipherSuite = sSLSession.getCipherSuite();
        Certificate[] certificateArr = null;
        if (cipherSuite == null) {
            a70.r("cipherSuite == null");
            return null;
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            is8.e("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        g a = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            a70.r("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            is8.e("tlsVersion == NONE");
            return null;
        }
        d0 a2 = d0.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List a3 = certificateArr != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(certificateArr) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(a2, a, a3, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.c;
    }

    public d0 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.d.equals(qVar.d);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public g a() {
        return this.b;
    }
}
