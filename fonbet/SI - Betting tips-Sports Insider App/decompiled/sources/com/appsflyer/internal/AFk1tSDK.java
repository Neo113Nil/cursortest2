package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private int component1;
    private short component2;
    private int component3;
    private long[] component4;
    private int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;

    public AFk1tSDK(InputStream inputStream, int i5, int i10, short s8, int i11, int i12) throws IOException {
        this(inputStream, i5, i10, s8, i11, i12, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        int i5;
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.component3 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i10 = this.component1;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i11, this.getMonetizationNetwork - i11);
                if (read <= 0) {
                    break;
                }
                i11 += read;
            } while (i11 < this.getMonetizationNetwork);
            if (i11 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.getRevenue;
            if (i12 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getCurrencyIso4217Code <= i12) {
                    getMonetizationNetwork();
                }
                int i13 = this.getCurrencyIso4217Code;
                if (i13 < this.getMediationNetwork) {
                    this.getCurrencyIso4217Code = i13 + 1;
                } else {
                    this.getCurrencyIso4217Code = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.component3 = 0;
            if (read2 < 0) {
                int i14 = this.getMonetizationNetwork;
                i5 = i14 - (this.areAllFieldsValid[i14 - 1] & 255);
            } else {
                i5 = this.getMonetizationNetwork;
            }
            this.hashCode = i5;
        }
        return this.hashCode;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component4;
        short s8 = this.component2;
        long j = jArr[s8 % 4] * 2147483085;
        long j6 = jArr2[(s8 + 2) % 4];
        int i5 = (s8 + 3) % 4;
        jArr2[i5] = ((jArr[i5] * 2147483085) + j6) / 2147483647L;
        jArr[i5] = (j + j6) % 2147483647L;
        for (int i10 = 0; i10 < this.getMonetizationNetwork; i10++) {
            this.areAllFieldsValid[i10] = (byte) (r1[i10] ^ ((this.AFAdRevenueData[this.component2] >> (i10 << 3)) & 255));
        }
        this.component2 = (short) ((this.component2 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.hashCode - this.component3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i5 = this.component3;
        if (i5 >= this.hashCode) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component3 = i5 + 1;
        return bArr[i5] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j6 = 0;
        while (j6 < j && read() != -1) {
            j6++;
        }
        return j6;
    }

    private AFk1tSDK(InputStream inputStream, int i5, int i10, short s8, int i11, int i12, byte b10) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getCurrencyIso4217Code = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s8, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component4 = new long[4];
        this.component3 = min;
        this.hashCode = min;
        this.AFAdRevenueData = AFk1sSDK.getCurrencyIso4217Code(i5 ^ i12, min ^ i12);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i10 ^ i12, i11 ^ i12);
        this.getRevenue = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = i5 + i10;
        for (int i12 = i5; i12 < i11; i12++) {
            AFAdRevenueData();
            int i13 = this.component3;
            if (i13 >= this.hashCode) {
                if (i12 == i5) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component3 = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
