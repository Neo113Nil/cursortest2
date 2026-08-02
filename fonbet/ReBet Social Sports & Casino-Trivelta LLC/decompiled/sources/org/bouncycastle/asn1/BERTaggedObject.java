package org.bouncycastle.asn1;

import com.plaid.internal.EnumC3631g;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i10) {
        super(false, i10, new BERSequence());
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        Enumeration objects;
        aSN1OutputStream.writeTag(z10, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, this.tagNo);
        aSN1OutputStream.write(128);
        if (this.explicit) {
            aSN1OutputStream.writePrimitive(this.obj.toASN1Primitive(), true);
        } else {
            ASN1Encodable aSN1Encodable = this.obj;
            if (aSN1Encodable instanceof ASN1OctetString) {
                objects = aSN1Encodable instanceof BEROctetString ? ((BEROctetString) aSN1Encodable).getObjects() : new BEROctetString(((ASN1OctetString) aSN1Encodable).getOctets()).getObjects();
            } else if (aSN1Encodable instanceof ASN1Sequence) {
                objects = ((ASN1Sequence) aSN1Encodable).getObjects();
            } else {
                if (!(aSN1Encodable instanceof ASN1Set)) {
                    throw new ASN1Exception("not implemented: " + this.obj.getClass().getName());
                }
                objects = ((ASN1Set) aSN1Encodable).getObjects();
            }
            aSN1OutputStream.writeElements(objects);
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int calculateTagLength;
        int encodedLength = this.obj.toASN1Primitive().encodedLength();
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
        return this.explicit || this.obj.toASN1Primitive().isConstructed();
    }

    public BERTaggedObject(int i10, ASN1Encodable aSN1Encodable) {
        super(true, i10, aSN1Encodable);
    }

    public BERTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }
}
