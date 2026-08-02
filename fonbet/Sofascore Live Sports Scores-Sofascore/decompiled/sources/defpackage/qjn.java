package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qjn extends X509Certificate {
    public final /* synthetic */ int a;
    public final X509Certificate b;
    public final byte[] c;

    public /* synthetic */ qjn(X509Certificate x509Certificate, byte[] bArr, int i) {
        this.a = i;
        this.b = x509Certificate;
        this.c = bArr;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() {
        switch (this.a) {
            case 0:
                this.b.checkValidity();
                break;
            default:
                this.b.checkValidity();
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        switch (this.a) {
        }
        return this.b.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        switch (this.a) {
        }
        return this.b.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        int i = this.a;
        return this.c;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        switch (this.a) {
        }
        return this.b.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        switch (this.a) {
        }
        return this.b.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        switch (this.a) {
        }
        return this.b.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        switch (this.a) {
        }
        return this.b.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        switch (this.a) {
        }
        return this.b.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        switch (this.a) {
        }
        return this.b.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        switch (this.a) {
        }
        return this.b.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        switch (this.a) {
        }
        return this.b.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        switch (this.a) {
        }
        return this.b.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        switch (this.a) {
        }
        return this.b.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        switch (this.a) {
        }
        return this.b.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        switch (this.a) {
        }
        return this.b.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        switch (this.a) {
        }
        return this.b.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        switch (this.a) {
        }
        return this.b.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        switch (this.a) {
        }
        return this.b.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        switch (this.a) {
        }
        return this.b.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        switch (this.a) {
        }
        return this.b.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        switch (this.a) {
        }
        return this.b.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        switch (this.a) {
        }
        return this.b.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        switch (this.a) {
            case 0:
                this.b.verify(publicKey);
                break;
            default:
                this.b.verify(publicKey);
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) {
        switch (this.a) {
            case 0:
                this.b.checkValidity(date);
                break;
            default:
                this.b.checkValidity(date);
                break;
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        switch (this.a) {
            case 0:
                this.b.verify(publicKey, str);
                break;
            default:
                this.b.verify(publicKey, str);
                break;
        }
    }
}
