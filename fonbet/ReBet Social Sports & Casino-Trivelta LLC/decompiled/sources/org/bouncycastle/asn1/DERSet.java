package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class DERSet extends ASN1Set {
    private int bodyLength;

    public DERSet() {
        this.bodyLength = -1;
    }

    private static boolean checkSorted(boolean z10) {
        if (z10) {
            return z10;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    public static DERSet convert(ASN1Set aSN1Set) {
        return (DERSet) aSN1Set.toDERObject();
    }

    private int getBodyLength() {
        if (this.bodyLength < 0) {
            int length = this.elements.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.elements[i11].toASN1Primitive().toDERObject().encodedLength();
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
        DEROutputStream dERSubStream = aSN1OutputStream.getDERSubStream();
        int length = this.elements.length;
        int i10 = 0;
        if (this.bodyLength >= 0 || length > 16) {
            aSN1OutputStream.writeLength(getBodyLength());
            while (i10 < length) {
                this.elements[i10].toASN1Primitive().toDERObject().encode(dERSubStream, true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            ASN1Primitive dERObject = this.elements[i12].toASN1Primitive().toDERObject();
            aSN1PrimitiveArr[i12] = dERObject;
            i11 += dERObject.encodedLength();
        }
        this.bodyLength = i11;
        aSN1OutputStream.writeLength(i11);
        while (i10 < length) {
            aSN1PrimitiveArr[i10].encode(dERSubStream, true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int bodyLength = getBodyLength();
        return StreamUtil.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this.isSorted ? this : super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.bodyLength = -1;
    }

    public DERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.bodyLength = -1;
    }

    public DERSet(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        super(checkSorted(z10), aSN1EncodableArr);
        this.bodyLength = -1;
    }

    public DERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, true);
        this.bodyLength = -1;
    }
}
