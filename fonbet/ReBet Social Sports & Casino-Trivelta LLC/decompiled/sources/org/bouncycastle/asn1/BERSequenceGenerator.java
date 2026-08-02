package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public class BERSequenceGenerator extends BERGenerator {
    public BERSequenceGenerator(OutputStream outputStream) {
        super(outputStream);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable aSN1Encodable) {
        aSN1Encodable.toASN1Primitive().encodeTo(this._out);
    }

    public void close() {
        writeBEREnd();
    }

    public BERSequenceGenerator(OutputStream outputStream, int i10, boolean z10) {
        super(outputStream, i10, z10);
        writeBERHeader(48);
    }
}
