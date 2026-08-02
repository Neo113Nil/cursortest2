package org.bouncycastle.asn1;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes5.dex */
public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    public ASN1ApplicationSpecific(boolean z10, int i10, byte[] bArr) {
        this.isConstructed = z10;
        this.tag = i10;
        this.octets = Arrays.clone(bArr);
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to construct object from byte[]: " + e10.getMessage());
        }
    }

    public static int getLengthOfHeader(byte[] bArr) {
        byte b10 = bArr[1];
        int i10 = b10 & UByte.MAX_VALUE;
        if (i10 == 128 || i10 <= 127) {
            return 2;
        }
        int i11 = b10 & ByteCompanionObject.MAX_VALUE;
        if (i11 <= 4) {
            return i11 + 2;
        }
        throw new IllegalStateException("DER length more than 4 bytes: " + i11);
    }

    private byte[] replaceTagNumber(int i10, byte[] bArr) {
        int i11;
        if ((bArr[0] & 31) == 31) {
            byte b10 = bArr[1];
            int i12 = b10 & UByte.MAX_VALUE;
            if ((b10 & ByteCompanionObject.MAX_VALUE) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            i11 = 2;
            while ((i12 & 128) != 0) {
                i12 = bArr[i11] & UByte.MAX_VALUE;
                i11++;
            }
        } else {
            i11 = 1;
        }
        int length = bArr.length - i11;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i11, bArr2, 1, length);
        bArr2[0] = (byte) i10;
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
            return false;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = (ASN1ApplicationSpecific) aSN1Primitive;
        return this.isConstructed == aSN1ApplicationSpecific.isConstructed && this.tag == aSN1ApplicationSpecific.tag && Arrays.areEqual(this.octets, aSN1ApplicationSpecific.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncoded(z10, this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return Arrays.clone(this.octets);
    }

    public ASN1Primitive getObject() {
        return ASN1Primitive.fromByteArray(getContents());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z10 = this.isConstructed;
        return ((z10 ? 1 : 0) ^ this.tag) ^ Arrays.hashCode(this.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (isConstructed()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(getApplicationTag()));
        stringBuffer.append("]");
        if (this.octets != null) {
            stringBuffer.append(" #");
            str = Hex.toHexString(this.octets);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public ASN1Primitive getObject(int i10) {
        if (i10 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] encoded = getEncoded();
        byte[] replaceTagNumber = replaceTagNumber(i10, encoded);
        if ((encoded[0] & 32) != 0) {
            replaceTagNumber[0] = (byte) (replaceTagNumber[0] | 32);
        }
        return ASN1Primitive.fromByteArray(replaceTagNumber);
    }
}
