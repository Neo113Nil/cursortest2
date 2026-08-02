package org.chromium.net;

import internal.org.jni_zero.JNINamespace;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JNINamespace("net::android")
/* loaded from: classes10.dex */
public class AndroidCertVerifyResult {
    private final List<X509Certificate> mCertificateChain;
    private final boolean mIsIssuedByKnownRoot;
    private final int mStatus;

    public AndroidCertVerifyResult(int status, boolean isIssuedByKnownRoot, List<X509Certificate> certificateChain) {
        this.mStatus = status;
        this.mIsIssuedByKnownRoot = isIssuedByKnownRoot;
        this.mCertificateChain = new ArrayList(certificateChain);
    }

    public AndroidCertVerifyResult(int status) {
        this.mStatus = status;
        this.mIsIssuedByKnownRoot = false;
        this.mCertificateChain = Collections.EMPTY_LIST;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public boolean isIssuedByKnownRoot() {
        return this.mIsIssuedByKnownRoot;
    }

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.mCertificateChain.size()][];
        for (int i = 0; i < this.mCertificateChain.size(); i++) {
            try {
                bArr[i] = this.mCertificateChain.get(i).getEncoded();
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }
}
