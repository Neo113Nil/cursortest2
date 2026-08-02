package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class DLSet extends ASN1Set {
    private int bodyLength;

    public DLSet() {
        this.bodyLength = -1;
    }

    private int getBodyLength() {
        if (this.bodyLength < 0) {
            int length = this.elements.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.elements[i11].toASN1Primitive().toDLObject().encodedLength();
            }
            this.bodyLength = i10;
        }
        return this.bodyLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        if (z10) {
            aSN1OutputStream.write(49);
        }
        ASN1OutputStream dLSubStream = aSN1OutputStream.getDLSubStream();
        int length = this.elements.length;
        int i10 = 0;
        if (this.bodyLength >= 0 || length > 16) {
            aSN1OutputStream.writeLength(getBodyLength());
            while (i10 < length) {
                dLSubStream.writePrimitive(this.elements[i10].toASN1Primitive(), true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            ASN1Primitive dLObject = this.elements[i12].toASN1Primitive().toDLObject();
            aSN1PrimitiveArr[i12] = dLObject;
            i11 += dLObject.encodedLength();
        }
        this.bodyLength = i11;
        aSN1OutputStream.writeLength(i11);
        while (i10 < length) {
            dLSubStream.writePrimitive(aSN1PrimitiveArr[i10], true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int bodyLength = getBodyLength();
        return StreamUtil.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.bodyLength = -1;
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.bodyLength = -1;
    }

    public DLSet(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        super(z10, aSN1EncodableArr);
        this.bodyLength = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
        this.bodyLength = -1;
    }
}
