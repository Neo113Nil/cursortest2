package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class ASN1OutputStream {
    private OutputStream os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public void close() {
        this.os.close();
    }

    public void flush() {
        this.os.flush();
    }

    public void flushInternal() {
    }

    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    public ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    public final void write(int i10) {
        this.os.write(i10);
    }

    public final void writeElements(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            writePrimitive(((ASN1Encodable) enumeration.nextElement()).toASN1Primitive(), true);
        }
    }

    public final void writeEncoded(boolean z10, int i10, byte b10) {
        if (z10) {
            write(i10);
        }
        writeLength(1);
        write(b10);
    }

    public final void writeEncodedIndef(boolean z10, int i10, int i11, byte[] bArr) {
        writeTag(z10, i10, i11);
        write(128);
        write(bArr, 0, bArr.length);
        write(0);
        write(0);
    }

    public final void writeLength(int i10) {
        if (i10 <= 127) {
            write((byte) i10);
            return;
        }
        int i11 = i10;
        int i12 = 1;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                break;
            } else {
                i12++;
            }
        }
        write((byte) (i12 | 128));
        for (int i13 = (i12 - 1) * 8; i13 >= 0; i13 -= 8) {
            write((byte) (i10 >> i13));
        }
    }

    public void writeObject(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z10) {
        aSN1Primitive.encode(this, z10);
    }

    public final void writeTag(boolean z10, int i10, int i11) {
        if (z10) {
            if (i11 < 31) {
                write(i10 | i11);
                return;
            }
            write(31 | i10);
            if (i11 < 128) {
                write(i11);
                return;
            }
            byte[] bArr = new byte[5];
            int i12 = 4;
            bArr[4] = (byte) (i11 & 127);
            do {
                i11 >>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            } while (i11 > 127);
            write(bArr, i12, 5 - i12);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals(ASN1Encoding.DER) ? new DEROutputStream(outputStream) : str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        this.os.write(bArr, i10, i11);
    }

    public final void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        }
    }

    public final void writeEncoded(boolean z10, int i10, byte b10, byte[] bArr) {
        if (z10) {
            write(i10);
        }
        writeLength(bArr.length + 1);
        write(b10);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodedIndef(boolean z10, int i10, Enumeration enumeration) {
        if (z10) {
            write(i10);
        }
        write(128);
        writeElements(enumeration);
        write(0);
        write(0);
    }

    public void writeObject(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    public final void writeEncoded(boolean z10, int i10, byte b10, byte[] bArr, int i11, int i12, byte b11) {
        if (z10) {
            write(i10);
        }
        writeLength(i12 + 2);
        write(b10);
        write(bArr, i11, i12);
        write(b11);
    }

    public final void writeEncodedIndef(boolean z10, int i10, ASN1Encodable[] aSN1EncodableArr) {
        if (z10) {
            write(i10);
        }
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    public final void writeEncoded(boolean z10, int i10, int i11, byte[] bArr) {
        writeTag(z10, i10, i11);
        writeLength(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncoded(boolean z10, int i10, byte[] bArr) {
        if (z10) {
            write(i10);
        }
        writeLength(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncoded(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        if (z10) {
            write(i10);
        }
        writeLength(i12);
        write(bArr, i11, i12);
    }
}
