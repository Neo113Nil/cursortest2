package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class AFj1aSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private long[] component2;
    private short component3;
    private int component4;
    private int copydefault;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFj1aSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private AFj1aSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component4 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getMonetizationNetwork = min;
        this.component1 = new byte[min];
        this.getCurrencyIso4217Code = new long[4];
        this.component2 = new long[4];
        this.areAllFieldsValid = min;
        this.copydefault = min;
        this.getCurrencyIso4217Code = AFk1xSDK.getRevenue(i ^ i4, min ^ i4);
        this.component2 = AFk1xSDK.getRevenue(i2 ^ i4, i3 ^ i4);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i = this.areAllFieldsValid;
        if (i >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.areAllFieldsValid = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMediationNetwork();
            int i5 = this.areAllFieldsValid;
            if (i5 >= this.copydefault) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component1;
            this.areAllFieldsValid = i5 + 1;
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
        getMediationNetwork();
        return this.copydefault - this.areAllFieldsValid;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component2;
        short s = this.component3;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.getMonetizationNetwork; i2++) {
            this.component1[i2] = (byte) (r1[i2] ^ ((this.getCurrencyIso4217Code[this.component3] >> (i2 << 3)) & 255));
        }
        this.component3 = (short) ((this.component3 + 1) % 4);
    }

    private int getMediationNetwork() throws IOException {
        int i;
        if (this.component4 == Integer.MAX_VALUE) {
            this.component4 = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == this.getMonetizationNetwork) {
            byte[] bArr = this.component1;
            int i2 = this.component4;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i3, this.getMonetizationNetwork - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.getMonetizationNetwork);
            if (i3 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.AFAdRevenueData;
            if (i4 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i4) {
                    getMonetizationNetwork();
                }
                int i5 = this.getRevenue;
                if (i5 < this.getMediationNetwork) {
                    this.getRevenue = i5 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component4 = read2;
            this.areAllFieldsValid = 0;
            if (read2 < 0) {
                int i6 = this.getMonetizationNetwork;
                i = i6 - (this.component1[i6 - 1] & 255);
            } else {
                i = this.getMonetizationNetwork;
            }
            this.copydefault = i;
        }
        return this.copydefault;
    }
}
