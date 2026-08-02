package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a, reason: collision with root package name */
    ASN1Integer f61322a;

    /* renamed from: b, reason: collision with root package name */
    ASN1Integer f61323b;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f61324p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f61325q;

    /* renamed from: x, reason: collision with root package name */
    ASN1Integer f61326x;

    /* renamed from: y, reason: collision with root package name */
    ASN1Integer f61327y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, BigInteger bigInteger5) {
        this.f61322a = new ASN1Integer(bigInteger);
        this.f61323b = new ASN1Integer(bigInteger2);
        this.f61324p = new ASN1Integer(bigInteger3);
        this.f61325q = new ASN1Integer(bigInteger4);
        this.f61326x = new ASN1Integer(i10);
        this.f61327y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public BigInteger getA() {
        return this.f61322a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f61324p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f61325q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f61322a);
        aSN1EncodableVector.add(this.f61323b);
        aSN1EncodableVector.add(this.f61324p);
        aSN1EncodableVector.add(this.f61325q);
        aSN1EncodableVector.add(this.f61326x);
        aSN1EncodableVector.add(this.f61327y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f61322a = (ASN1Integer) objects.nextElement();
        this.f61323b = (ASN1Integer) objects.nextElement();
        this.f61324p = (ASN1Integer) objects.nextElement();
        this.f61325q = (ASN1Integer) objects.nextElement();
        this.f61326x = (ASN1Integer) objects.nextElement();
        this.f61327y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
