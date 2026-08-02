package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private short component1;
    private int component2;
    private int component3;
    private long[] component4;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;
    private int toString;

    public AFk1tSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) {
        this(inputStream, i10, i11, s10, i12, i13, (byte) 0);
    }

    private int getCurrencyIso4217Code() {
        int i10;
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i11 = this.component3;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i12, this.getMonetizationNetwork - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < this.getMonetizationNetwork);
            if (i12 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.AFAdRevenueData;
            if (i13 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i13) {
                    getMonetizationNetwork();
                }
                int i14 = this.getRevenue;
                if (i14 < this.getMediationNetwork) {
                    this.getRevenue = i14 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component3 = read2;
            this.component2 = 0;
            if (read2 < 0) {
                int i15 = this.getMonetizationNetwork;
                i10 = i15 - (this.areAllFieldsValid[i15 - 1] & UByte.MAX_VALUE);
            } else {
                i10 = this.getMonetizationNetwork;
            }
            this.toString = i10;
        }
        return this.toString;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component4;
        short s10 = this.component1;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        int i10 = (s10 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.getMonetizationNetwork; i11++) {
            this.areAllFieldsValid[i11] = (byte) (r1[i11] ^ ((this.getCurrencyIso4217Code[this.component1] >> (i11 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getCurrencyIso4217Code();
        return this.toString - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getCurrencyIso4217Code();
        int i10 = this.component2;
        if (i10 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component2 = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1tSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component3 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s10, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.getCurrencyIso4217Code = new long[4];
        this.component4 = new long[4];
        this.component2 = min;
        this.toString = min;
        this.getCurrencyIso4217Code = AFk1sSDK.getCurrencyIso4217Code(i10 ^ i13, min ^ i13);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i11 ^ i13, i12 ^ i13);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getCurrencyIso4217Code();
            int i14 = this.component2;
            if (i14 >= this.toString) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component2 = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
