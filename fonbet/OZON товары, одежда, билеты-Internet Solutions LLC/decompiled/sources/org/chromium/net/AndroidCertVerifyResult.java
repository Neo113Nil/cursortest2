package org.chromium.net;

import internal.org.jni_zero.CalledByNative;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class AndroidCertVerifyResult {

    /* renamed from: a, reason: collision with root package name */
    private final int f78594a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78595b;

    /* renamed from: c, reason: collision with root package name */
    private final List<X509Certificate> f78596c;

    public AndroidCertVerifyResult(boolean z11, List list) {
        this.f78594a = 0;
        this.f78595b = z11;
        this.f78596c = new ArrayList(list);
    }

    @CalledByNative
    public final byte[][] getCertificateChainEncoded() {
        List<X509Certificate> list = this.f78596c;
        byte[][] bArr = new byte[list.size()][];
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                bArr[i11] = list.get(i11).getEncoded();
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }

    @CalledByNative
    public final int getStatus() {
        return this.f78594a;
    }

    @CalledByNative
    public final boolean isIssuedByKnownRoot() {
        return this.f78595b;
    }

    public AndroidCertVerifyResult(int i11) {
        this.f78594a = i11;
        this.f78595b = false;
        this.f78596c = Collections.EMPTY_LIST;
    }
}
