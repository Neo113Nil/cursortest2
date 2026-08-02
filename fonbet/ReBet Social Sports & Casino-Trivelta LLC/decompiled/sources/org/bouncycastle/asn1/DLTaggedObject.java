package org.bouncycastle.asn1;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes5.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    public DLTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        aSN1OutputStream.writeTag(z10, (this.explicit || dLObject.isConstructed()) ? EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE : 128, this.tagNo);
        if (this.explicit) {
            aSN1OutputStream.writeLength(dLObject.encodedLength());
        }
        aSN1OutputStream.getDLSubStream().writePrimitive(dLObject, this.explicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int calculateTagLength;
        int encodedLength = this.obj.toASN1Primitive().toDLObject().encodedLength();
        if (this.explicit) {
            calculateTagLength = StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(encodedLength);
        } else {
            encodedLength--;
            calculateTagLength = StreamUtil.calculateTagLength(this.tagNo);
        }
        return calculateTagLength + encodedLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.explicit || this.obj.toASN1Primitive().toDLObject().isConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
