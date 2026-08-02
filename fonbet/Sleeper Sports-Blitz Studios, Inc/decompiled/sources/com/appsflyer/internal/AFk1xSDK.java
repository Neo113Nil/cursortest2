package com.appsflyer.internal;

import androidx.collection.SieveCacheKt;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class AFk1xSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private long[] areAllFieldsValid;
    private int component1;
    private byte[] component2;
    private short component3;
    private int component4;
    private long[] getCurrencyIso4217Code;
    private int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFk1xSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private AFk1xSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getRevenue = min;
        this.component2 = new byte[min];
        this.getCurrencyIso4217Code = new long[4];
        this.areAllFieldsValid = new long[4];
        this.component4 = min;
        this.hashCode = min;
        this.getCurrencyIso4217Code = AFk1zSDK.getCurrencyIso4217Code(i ^ i4, min ^ i4);
        this.areAllFieldsValid = AFk1zSDK.getCurrencyIso4217Code(i2 ^ i4, i3 ^ i4);
        this.getMonetizationNetwork = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i = this.component4;
        if (i >= this.hashCode) {
            return -1;
        }
        byte[] bArr = this.component2;
        this.component4 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMediationNetwork();
            int i5 = this.component4;
            if (i5 >= this.hashCode) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component2;
            this.component4 = i5 + 1;
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
        return this.hashCode - this.component4;
    }

    private void AFAdRevenueData() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.areAllFieldsValid;
        short s = this.component3;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        long j3 = (j + j2) % SieveCacheKt.NodeLinkMask;
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / SieveCacheKt.NodeLinkMask;
        jArr[i] = j3;
        for (int i2 = 0; i2 < this.getRevenue; i2++) {
            this.component2[i2] = (byte) (r1[i2] ^ ((this.getCurrencyIso4217Code[this.component3] >> (i2 << 3)) & 255));
        }
        this.component3 = (short) ((this.component3 + 1) % 4);
    }

    private int getMediationNetwork() throws IOException {
        int i;
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == this.getRevenue) {
            byte[] bArr = this.component2;
            int i2 = this.component1;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component2, i3, this.getRevenue - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.getRevenue);
            if (i3 < this.getRevenue) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.getMonetizationNetwork;
            if (i4 == this.AFAdRevenueData) {
                AFAdRevenueData();
            } else {
                if (this.getMediationNetwork <= i4) {
                    AFAdRevenueData();
                }
                int i5 = this.getMediationNetwork;
                if (i5 < this.AFAdRevenueData) {
                    this.getMediationNetwork = i5 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.component4 = 0;
            if (read2 < 0) {
                int i6 = this.getRevenue;
                i = i6 - (this.component2[i6 - 1] & 255);
            } else {
                i = this.getRevenue;
            }
            this.hashCode = i;
        }
        return this.hashCode;
    }
}
