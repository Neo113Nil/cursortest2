package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public ASN1OutputStream getDLSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z10) {
        aSN1Primitive.toDLObject().encode(this, z10);
    }
}
