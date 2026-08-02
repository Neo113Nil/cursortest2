package com.mbridge.msdk.thrid.okhttp.internal.tls;

import defpackage.mz1;
import defpackage.yhk;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends c {
    private final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.c
    public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) mz1.h(arrayList, 1);
            X509Certificate a = this.a.a(x509Certificate);
            if (a == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    yhk.v(x509Certificate, "Failed to find a trusted cert that signed ");
                    return null;
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                arrayList.add(a);
            }
            if (a(a, a)) {
                return arrayList;
            }
            z = true;
        }
        yhk.v(arrayList, "Certificate chain too long: ");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && ((a) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    private boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
