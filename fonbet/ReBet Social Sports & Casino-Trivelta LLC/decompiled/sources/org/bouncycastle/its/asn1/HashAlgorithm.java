package org.bouncycastle.its.asn1;

import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes5.dex */
public class HashAlgorithm {
    public static final HashAlgorithm sha256 = new HashAlgorithm(0);
    public static final HashAlgorithm sha384 = new HashAlgorithm(1);
    private final ASN1Enumerated enumerated;

    public HashAlgorithm(int i10) {
        this.enumerated = new ASN1Enumerated(i10);
    }

    public HashAlgorithm getInstance(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof HashAlgorithm ? (HashAlgorithm) obj : new HashAlgorithm(ASN1Enumerated.getInstance(obj));
    }

    public ASN1Primitive toASN1Primitive() {
        return this.enumerated;
    }

    private HashAlgorithm(ASN1Enumerated aSN1Enumerated) {
        this.enumerated = aSN1Enumerated;
    }
}
