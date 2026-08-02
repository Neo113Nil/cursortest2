package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class ParSet extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* renamed from: h, reason: collision with root package name */
    private int[] f62027h;

    /* renamed from: k, reason: collision with root package name */
    private int[] f62028k;

    /* renamed from: t, reason: collision with root package name */
    private int f62029t;

    /* renamed from: w, reason: collision with root package name */
    private int[] f62030w;

    public ParSet(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f62029t = i10;
        this.f62027h = iArr;
        this.f62030w = iArr2;
        this.f62028k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int intValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (intValueExact > 0) {
            return intValueExact;
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + intValueExact);
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f62027h);
    }

    public int[] getK() {
        return Arrays.clone(this.f62028k);
    }

    public int getT() {
        return this.f62029t;
    }

    public int[] getW() {
        return Arrays.clone(this.f62030w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i10 = 0;
        while (true) {
            if (i10 >= this.f62027h.length) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new ASN1Integer(this.f62029t));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
            aSN1EncodableVector.add(new ASN1Integer(r4[i10]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f62030w[i10]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f62028k[i10]));
            i10++;
        }
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException("sie of seqOfParams = " + aSN1Sequence.size());
        }
        this.f62029t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f62029t || aSN1Sequence3.size() != this.f62029t || aSN1Sequence4.size() != this.f62029t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f62027h = new int[aSN1Sequence2.size()];
        this.f62030w = new int[aSN1Sequence3.size()];
        this.f62028k = new int[aSN1Sequence4.size()];
        for (int i10 = 0; i10 < this.f62029t; i10++) {
            this.f62027h[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i10));
            this.f62030w[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i10));
            this.f62028k[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i10));
        }
    }
}
