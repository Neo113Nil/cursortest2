package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int DEFAULT_CHUNK_SIZE = 1000;
    private final int chunkSize;
    private final ASN1OctetString[] octs;

    public BEROctetString(byte[] bArr) {
        this(bArr, 1000);
    }

    public static BEROctetString fromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i10 = 0; i10 < size; i10++) {
            aSN1OctetStringArr[i10] = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    private static byte[] toBytes(ASN1OctetString[] aSN1OctetStringArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != aSN1OctetStringArr.length; i10++) {
            try {
                byteArrayOutputStream.write(aSN1OctetStringArr[i10].getOctets());
            } catch (IOException e10) {
                throw new IllegalArgumentException("exception converting octets " + e10.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncodedIndef(z10, 36, getObjects());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        Enumeration objects = getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            i10 += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().encodedLength();
        }
        return i10 + 4;
    }

    public Enumeration getObjects() {
        return this.octs == null ? new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.1
            int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < BEROctetString.this.string.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i10 = this.pos;
                BEROctetString bEROctetString = BEROctetString.this;
                byte[] bArr = bEROctetString.string;
                if (i10 >= bArr.length) {
                    throw new NoSuchElementException();
                }
                int min = Math.min(bArr.length - i10, bEROctetString.chunkSize);
                byte[] bArr2 = new byte[min];
                System.arraycopy(BEROctetString.this.string, this.pos, bArr2, 0, min);
                this.pos += min;
                return new DEROctetString(bArr2);
            }
        } : new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.2
            int counter = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.counter < BEROctetString.this.octs.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                if (this.counter >= BEROctetString.this.octs.length) {
                    throw new NoSuchElementException();
                }
                ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.octs;
                int i10 = this.counter;
                this.counter = i10 + 1;
                return aSN1OctetStringArr[i10];
            }
        };
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return true;
    }

    public BEROctetString(byte[] bArr, int i10) {
        this(bArr, null, i10);
    }

    private BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i10) {
        super(bArr);
        this.octs = aSN1OctetStringArr;
        this.chunkSize = i10;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, 1000);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i10) {
        this(toBytes(aSN1OctetStringArr), aSN1OctetStringArr, i10);
    }
}
