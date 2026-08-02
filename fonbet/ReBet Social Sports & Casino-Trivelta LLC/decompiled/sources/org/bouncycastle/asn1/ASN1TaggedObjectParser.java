package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i10, boolean z10);

    int getTagNo();
}
