package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1mSDK extends FilterInputStream {
    private static final short values = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private int f57493d;

    /* renamed from: e, reason: collision with root package name */
    private int f57494e;
    private int force;

    /* renamed from: i, reason: collision with root package name */
    private int f57495i;
    private int registerClient;
    private int unregisterClient;
    private byte[] valueOf;

    public AFj1mSDK(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f57493d = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.AFInAppEventType = new byte[8];
        this.AFInAppEventParameterName = new byte[8];
        this.AFKeystoreWrapper = 8;
        this.registerClient = 8;
        this.AFLogger = Math.min(Math.max(i12, 5), 16);
        this.unregisterClient = i13;
        if (i13 == 3) {
            System.arraycopy(bArr, 0, this.AFInAppEventType, 0, 8);
        }
        long j11 = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i11 != 0) {
            int i14 = (int) j11;
            this.f57494e = i14;
            this.f57495i = i14 * i11;
            this.afInfoLog = i14 ^ i11;
            this.force = (int) (j11 >> 32);
            return;
        }
        this.f57494e = (int) j11;
        long j12 = j11 >> 3;
        short s11 = values;
        this.f57495i = (int) ((s11 * j12) >> 32);
        this.afInfoLog = (int) (j11 >> 32);
        this.force = (int) (j12 + s11);
    }

    private int AFInAppEventType() throws IOException {
        if (this.f57493d == Integer.MAX_VALUE) {
            this.f57493d = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 8) {
            byte[] bArr = this.valueOf;
            int i11 = this.f57493d;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i12, 8 - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int read2 = ((FilterInputStream) this).in.read();
            this.f57493d = read2;
            this.AFKeystoreWrapper = 0;
            this.registerClient = read2 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
        }
        return this.registerClient;
    }

    private void values() {
        if (this.unregisterClient == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        boolean z11 = true;
        char c11 = 2;
        int i11 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = 0;
        while (true) {
            int i14 = this.AFLogger;
            if (i13 >= i14) {
                break;
            }
            short s11 = values;
            i12 -= ((((i14 - i13) * s11) + i11) ^ ((i11 << 4) + this.afInfoLog)) ^ ((i11 >>> 5) + this.force);
            i11 -= (((i12 << 4) + this.f57494e) ^ (((i14 - i13) * s11) + i12)) ^ ((i12 >>> 5) + this.f57495i);
            i13++;
            c11 = c11;
            z11 = z11;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i11 >> 24);
        bArr3[z11 ? 1 : 0] = (byte) (i11 >> 16);
        bArr3[c11] = (byte) (i11 >> 8);
        bArr3[3] = (byte) i11;
        bArr3[4] = (byte) (i12 >> 24);
        bArr3[5] = (byte) (i12 >> 16);
        bArr3[6] = (byte) (i12 >> 8);
        bArr3[7] = (byte) i12;
        if (this.unregisterClient == 3) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.valueOf;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.AFInAppEventType[i15]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.AFInAppEventType, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.registerClient - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i11 = this.AFKeystoreWrapper;
        if (i11 >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.AFKeystoreWrapper = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long j12 = 0;
        while (j12 < j11 && read() != -1) {
            j12++;
        }
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFInAppEventType();
            int i15 = this.AFKeystoreWrapper;
            if (i15 >= this.registerClient) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.valueOf;
            this.AFKeystoreWrapper = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
