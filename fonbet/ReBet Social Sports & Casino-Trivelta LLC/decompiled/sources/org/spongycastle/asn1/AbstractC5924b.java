package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.spongycastle.asn1.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5924b extends AbstractC5940s implements InterfaceC5946y {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final int f62248a;
    protected final byte[] data;

    public AbstractC5924b(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = Aj.a.d(bArr);
        this.f62248a = i10;
    }

    public static byte[] k(byte[] bArr, int i10) {
        byte[] d10 = Aj.a.d(bArr);
        if (i10 > 0) {
            int length = bArr.length - 1;
            d10[length] = (byte) ((255 << i10) & d10[length]);
        }
        return d10;
    }

    public static AbstractC5924b l(int i10, InputStream inputStream) {
        if (i10 < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int read = inputStream.read();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        if (i11 != 0) {
            if (Bj.a.c(inputStream, bArr) != i11) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (read > 0 && read < 8) {
                byte b10 = bArr[i10 - 2];
                if (b10 != ((byte) ((255 << read) & b10))) {
                    return new n0(bArr, read);
                }
            }
        }
        return new P(bArr, read);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof AbstractC5924b)) {
            return false;
        }
        AbstractC5924b abstractC5924b = (AbstractC5924b) abstractC5940s;
        return this.f62248a == abstractC5924b.f62248a && Aj.a.a(m(), abstractC5924b.m());
    }

    @Override // org.spongycastle.asn1.InterfaceC5946y
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C5939q(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i10 = 0; i10 != byteArray.length; i10++) {
                char[] cArr = table;
                stringBuffer.append(cArr[(byteArray[i10] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i10] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new r("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return this.f62248a ^ Aj.a.q(m());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        return new P(this.data, this.f62248a);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        return new n0(this.data, this.f62248a);
    }

    public byte[] m() {
        return k(this.data, this.f62248a);
    }

    public byte[] n() {
        if (this.f62248a == 0) {
            return Aj.a.d(this.data);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int o() {
        return this.f62248a;
    }

    public String toString() {
        return getString();
    }
}
