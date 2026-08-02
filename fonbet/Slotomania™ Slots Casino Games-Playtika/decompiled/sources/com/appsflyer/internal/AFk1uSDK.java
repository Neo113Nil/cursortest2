package com.appsflyer.internal;

import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class AFk1uSDK extends FilterInputStream {
    private int AFLogger;
    private final byte[] areAllFieldsValid;
    private final int[] component1;
    private final byte[][] component2;
    private final int[] component3;
    private final int component4;
    private final byte[] copy;
    private int copydefault;
    private int equals;
    private final int hashCode;
    private int registerClient;
    private final int toString;
    private static final byte[] getCurrencyIso4217Code = AFk1zSDK.getMonetizationNetwork;
    private static final int[] getMonetizationNetwork = AFk1zSDK.AFAdRevenueData;
    private static final int[] getRevenue = AFk1zSDK.getMediationNetwork;
    private static final int[] AFAdRevenueData = AFk1zSDK.getCurrencyIso4217Code;
    private static final int[] getMediationNetwork = AFk1zSDK.getRevenue;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFk1uSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private AFk1uSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component1 = new int[4];
        this.areAllFieldsValid = new byte[16];
        this.copy = new byte[16];
        this.copydefault = 1;
        this.equals = Integer.MAX_VALUE;
        this.AFLogger = 16;
        this.registerClient = 16;
        this.component4 = i;
        this.component3 = AFk1zSDK.getMonetizationNetwork(bArr, i);
        this.component2 = getRevenue(bArr2);
        this.hashCode = 100;
        this.toString = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i = this.AFLogger;
        if (i >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.copy;
        this.AFLogger = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getCurrencyIso4217Code();
            int i5 = this.AFLogger;
            if (i5 >= this.registerClient) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.copy;
            this.AFLogger = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.registerClient - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.equals == Integer.MAX_VALUE) {
            this.equals = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 16) {
            byte[] bArr = this.areAllFieldsValid;
            int i = this.equals;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = this.hashCode;
            if (i3 == this.toString) {
                getMonetizationNetwork(this.areAllFieldsValid, this.copy);
            } else {
                if (this.copydefault <= i3) {
                    getMonetizationNetwork(this.areAllFieldsValid, this.copy);
                } else {
                    byte[] bArr2 = this.areAllFieldsValid;
                    System.arraycopy(bArr2, 0, this.copy, 0, bArr2.length);
                }
                int i4 = this.copydefault;
                if (i4 < this.toString) {
                    this.copydefault = i4 + 1;
                } else {
                    this.copydefault = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.equals = read2;
            this.AFLogger = 0;
            this.registerClient = read2 < 0 ? 16 - (this.copy[15] & 255) : 16;
        }
        return this.registerClient;
    }

    private void getMonetizationNetwork(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component1;
        boolean z = true;
        char c = 2;
        char c2 = '\b';
        char c3 = 3;
        int i = (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component3;
        iArr[0] = i ^ iArr2[0];
        char c4 = 5;
        char c5 = 6;
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << Ascii.CAN) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c6 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << Ascii.CAN)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.component4) {
            int[] iArr3 = getMonetizationNetwork;
            int[] iArr4 = this.component1;
            boolean z2 = z;
            byte[][] bArr3 = this.component2;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getRevenue;
            byte[] bArr5 = bArr3[z2 ? 1 : 0];
            char c7 = c;
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFAdRevenueData;
            byte[] bArr6 = bArr3[c7];
            char c8 = c3;
            int i6 = i5 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getMediationNetwork;
            byte[] bArr7 = bArr3[c8];
            char c9 = c2;
            int i7 = i6 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component3;
            int i8 = i7 ^ iArr8[i3];
            char c10 = c6;
            char c11 = c4;
            int i9 = (((iArr3[iArr4[bArr4[z2 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z2 ? 1 : 0]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[z2 ? 1 : 0]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[z2 ? 1 : 0]] & 255]) ^ iArr8[i3 + 1];
            int i10 = (((iArr3[iArr4[bArr4[c7]] >>> 24] ^ iArr5[(iArr4[bArr5[c7]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c7]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c7]] & 255]) ^ iArr8[i3 + 2];
            int i11 = (((iArr3[iArr4[bArr4[c8]] >>> 24] ^ iArr5[(iArr4[bArr5[c8]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c8]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c8]] & 255]) ^ iArr8[i3 + 3];
            iArr4[0] = i8;
            iArr4[z2 ? 1 : 0] = i9;
            iArr4[c7] = i10;
            iArr4[c8] = i11;
            i2++;
            i3 += 4;
            z = z2 ? 1 : 0;
            c = c7;
            c3 = c8;
            c2 = c9;
            c4 = c11;
            c6 = c10;
            c5 = c5;
        }
        boolean z3 = z;
        char c12 = c;
        char c13 = c3;
        char c14 = c2;
        char c15 = c6;
        int[] iArr9 = this.component3;
        int i12 = iArr9[i3];
        byte[] bArr8 = getCurrencyIso4217Code;
        int[] iArr10 = this.component1;
        byte[][] bArr9 = this.component2;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[z3 ? 1 : 0];
        bArr2[z3 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[c12];
        bArr2[c12] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[c13];
        bArr2[c13] = (byte) (i12 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i13 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z3 ? 1 : 0]] >>> 24] ^ (i13 >>> 24));
        bArr2[c4] = (byte) (bArr8[(iArr10[bArr11[z3 ? 1 : 0]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[c5] = (byte) (bArr8[(iArr10[bArr12[z3 ? 1 : 0]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[z3 ? 1 : 0]] & 255]);
        int i14 = iArr9[i3 + 2];
        bArr2[c14] = (byte) (bArr8[iArr10[bArr10[c12]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c12]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c12]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[c12]] & 255]);
        int i15 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c13]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c13]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr12[c13]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr8[iArr10[bArr13[c13]] & 255]);
    }
}
