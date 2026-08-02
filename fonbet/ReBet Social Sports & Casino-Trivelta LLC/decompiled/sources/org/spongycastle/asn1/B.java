package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class B extends AbstractC5923a {
    public B(int i10, C5928f c5928f) {
        super(true, i10, k(c5928f));
    }

    public static byte[] k(C5928f c5928f) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != c5928f.c(); i10++) {
            try {
                byteArrayOutputStream.write(((AbstractC5935m) c5928f.b(i10)).b(ASN1Encoding.BER));
            } catch (IOException e10) {
                throw new r("malformed object: " + e10, e10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.k(this.f62245a ? 96 : 64, this.f62246b);
        c5939q.c(128);
        c5939q.d(this.octets);
        c5939q.c(0);
        c5939q.c(0);
    }
}
