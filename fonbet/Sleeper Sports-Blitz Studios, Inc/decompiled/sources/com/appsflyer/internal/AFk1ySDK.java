package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class AFk1ySDK extends FilterInputStream {
    private static final short getRevenue = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private int getMonetizationNetwork;
    private int hashCode;
    private final int toString;
    private int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFk1ySDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private AFk1ySDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = Integer.MAX_VALUE;
        this.values = 1;
        this.getCurrencyIso4217Code = new byte[8];
        this.getMediationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getMonetizationNetwork = 8;
        this.component1 = 8;
        this.component3 = Math.min(Math.max(i2, 5), 16);
        this.component2 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.getMediationNetwork, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i != 0) {
            int i4 = (int) j;
            this.component4 = i4;
            this.copy = i4 * i;
            this.hashCode = i ^ i4;
            this.copydefault = (int) (j >> 32);
        } else {
            this.component4 = (int) j;
            long j2 = j >> 3;
            short s = getRevenue;
            this.copy = (int) ((s * j2) >> 32);
            this.hashCode = (int) (j >> 32);
            this.copydefault = (int) (j2 + s);
        }
        this.toString = 100;
        this.equals = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i = this.getMonetizationNetwork;
        if (i >= this.component1) {
            return -1;
        }
        byte[] bArr = this.getCurrencyIso4217Code;
        this.getMonetizationNetwork = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFAdRevenueData();
            int i5 = this.getMonetizationNetwork;
            if (i5 >= this.component1) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getCurrencyIso4217Code;
            this.getMonetizationNetwork = i5 + 1;
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
        AFAdRevenueData();
        return this.component1 - this.getMonetizationNetwork;
    }

    private void getCurrencyIso4217Code() {
        if (this.component2 == 3) {
            byte[] bArr = this.getCurrencyIso4217Code;
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, bArr.length);
        }
        byte[] bArr2 = this.getCurrencyIso4217Code;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.component3;
            if (i3 >= i4) {
                break;
            }
            short s = getRevenue;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.hashCode)) ^ ((i >>> 5) + this.copydefault);
            i -= (((i2 << 4) + this.component4) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.copy);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.getCurrencyIso4217Code;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.component2 == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.getCurrencyIso4217Code;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.getMediationNetwork[i5]);
            }
            byte[] bArr5 = this.AFAdRevenueData;
            System.arraycopy(bArr5, 0, this.getMediationNetwork, 0, bArr5.length);
        }
    }

    private int AFAdRevenueData() throws IOException {
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.getMonetizationNetwork == 8) {
            byte[] bArr = this.getCurrencyIso4217Code;
            int i = this.areAllFieldsValid;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getCurrencyIso4217Code, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = this.toString;
            if (i3 == this.equals) {
                getCurrencyIso4217Code();
            } else {
                if (this.values <= i3) {
                    getCurrencyIso4217Code();
                }
                int i4 = this.values;
                if (i4 < this.equals) {
                    this.values = i4 + 1;
                } else {
                    this.values = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = read2;
            this.getMonetizationNetwork = 0;
            this.component1 = read2 < 0 ? 8 - (this.getCurrencyIso4217Code[7] & 255) : 8;
        }
        return this.component1;
    }
}
