package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class BERApplicationSpecific extends ASN1ApplicationSpecific {
    public BERApplicationSpecific(int i10, ASN1Encodable aSN1Encodable) {
        this(true, i10, aSN1Encodable);
    }

    private static byte[] getEncodedVector(ASN1EncodableVector aSN1EncodableVector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != aSN1EncodableVector.size(); i10++) {
            try {
                byteArrayOutputStream.write(((ASN1Object) aSN1EncodableVector.get(i10)).getEncoded(ASN1Encoding.BER));
            } catch (IOException e10) {
                throw new ASN1ParsingException("malformed object: " + e10, e10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] getEncoding(boolean z10, ASN1Encodable aSN1Encodable) {
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.BER);
        if (z10) {
            return encoded;
        }
        int lengthOfHeader = ASN1ApplicationSpecific.getLengthOfHeader(encoded);
        int length = encoded.length - lengthOfHeader;
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, lengthOfHeader, bArr, 0, length);
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncodedIndef(z10, this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    public BERApplicationSpecific(int i10, ASN1EncodableVector aSN1EncodableVector) {
        super(true, i10, getEncodedVector(aSN1EncodableVector));
    }

    public BERApplicationSpecific(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10 || aSN1Encodable.toASN1Primitive().isConstructed(), i10, getEncoding(z10, aSN1Encodable));
    }

    public BERApplicationSpecific(boolean z10, int i10, byte[] bArr) {
        super(z10, i10, bArr);
    }
}
