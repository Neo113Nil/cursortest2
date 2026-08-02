package org.bouncycastle.asn1.x509;

import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

/* loaded from: classes5.dex */
public class KeyUsage extends ASN1Object {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private DERBitString bitString;

    public KeyUsage(int i10) {
        this.bitString = new DERBitString(i10);
    }

    public static KeyUsage fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.keyUsage));
    }

    public static KeyUsage getInstance(Object obj) {
        if (obj instanceof KeyUsage) {
            return (KeyUsage) obj;
        }
        if (obj != null) {
            return new KeyUsage(DERBitString.getInstance(obj));
        }
        return null;
    }

    public byte[] getBytes() {
        return this.bitString.getBytes();
    }

    public int getPadBits() {
        return this.bitString.getPadBits();
    }

    public boolean hasUsages(int i10) {
        return (this.bitString.intValue() & i10) == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.bitString;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        byte[] bytes = this.bitString.getBytes();
        if (bytes.length == 1) {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i10 = bytes[0] & UByte.MAX_VALUE;
        } else {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i10 = (bytes[0] & UByte.MAX_VALUE) | ((bytes[1] & UByte.MAX_VALUE) << 8);
        }
        sb2.append(Integer.toHexString(i10));
        return sb2.toString();
    }

    private KeyUsage(DERBitString dERBitString) {
        this.bitString = dERBitString;
    }
}
