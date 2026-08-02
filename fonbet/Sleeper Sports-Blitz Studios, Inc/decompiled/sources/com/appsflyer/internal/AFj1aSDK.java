package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class AFj1aSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private byte[] component1;
    private int component2;
    private byte[] component3;
    private byte[] component4;
    private int copy;
    private int copydefault;
    private int equals;
    private int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private AFj1fSDK getRevenue;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFj1aSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        this(inputStream, iArr, bArr, i, false, i2, (byte) 0);
    }

    private AFj1aSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getCurrencyIso4217Code = 1;
        this.copy = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.getMonetizationNetwork = min;
        this.component1 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component3 = bArr2;
        this.component4 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component2 = 8;
        this.copydefault = 8;
        this.equals = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getRevenue = new AFj1fSDK(iArr, min, true, false);
        this.getMediationNetwork = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i = this.component2;
        if (i >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component2 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMonetizationNetwork();
            int i5 = this.component2;
            if (i5 >= this.copydefault) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component1;
            this.component2 = i5 + 1;
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
        getMonetizationNetwork();
        return this.copydefault - this.component2;
    }

    private void AFAdRevenueData() {
        if (this.equals == 2) {
            byte[] bArr = this.component1;
            System.arraycopy(bArr, 0, this.component4, 0, bArr.length);
        }
        byte[] bArr2 = this.component1;
        AFk1wSDK.getMonetizationNetwork(((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.getMonetizationNetwork, this.getRevenue.getCurrencyIso4217Code, this.getRevenue.getMediationNetwork, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.component1;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.equals == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.component1;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.component3[i3]);
            }
            byte[] bArr5 = this.component4;
            System.arraycopy(bArr5, 0, this.component3, 0, bArr5.length);
        }
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.copy == Integer.MAX_VALUE) {
            this.copy = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == 8) {
            byte[] bArr = this.component1;
            int i = this.copy;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = this.getMediationNetwork;
            if (i3 == this.AFAdRevenueData) {
                AFAdRevenueData();
            } else {
                if (this.getCurrencyIso4217Code <= i3) {
                    AFAdRevenueData();
                }
                int i4 = this.getCurrencyIso4217Code;
                if (i4 < this.AFAdRevenueData) {
                    this.getCurrencyIso4217Code = i4 + 1;
                } else {
                    this.getCurrencyIso4217Code = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.copy = read2;
            this.component2 = 0;
            this.copydefault = read2 < 0 ? 8 - (this.component1[7] & 255) : 8;
        }
        return this.copydefault;
    }
}
