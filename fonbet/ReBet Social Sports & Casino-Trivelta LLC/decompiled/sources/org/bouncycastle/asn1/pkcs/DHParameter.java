package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class DHParameter extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    ASN1Integer f61343g;

    /* renamed from: l, reason: collision with root package name */
    ASN1Integer f61344l;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f61345p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f61345p = new ASN1Integer(bigInteger);
        this.f61343g = new ASN1Integer(bigInteger2);
        this.f61344l = i10 != 0 ? new ASN1Integer(i10) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f61343g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f61344l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f61345p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f61345p);
        aSN1EncodableVector.add(this.f61343g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f61344l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f61345p = ASN1Integer.getInstance(objects.nextElement());
        this.f61343g = ASN1Integer.getInstance(objects.nextElement());
        this.f61344l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}
