package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1qSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private AFj1tSDK AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private int f57496d;

    /* renamed from: e, reason: collision with root package name */
    private int f57497e;
    private int[] registerClient;
    private int unregisterClient;
    private final int valueOf;
    private byte[] values;

    public AFj1qSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f57496d = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i11, 3), 16);
        this.valueOf = min;
        this.AFKeystoreWrapper = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventParameterName = bArr2;
        this.values = new byte[8];
        this.registerClient = new int[2];
        this.unregisterClient = 8;
        this.f57497e = 8;
        this.AFLogger = i12;
        if (i12 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFInAppEventType = new AFj1tSDK(iArr, min, true, false);
    }

    private void AFInAppEventType() {
        if (this.AFLogger == 2) {
            byte[] bArr = this.AFKeystoreWrapper;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.AFKeystoreWrapper;
        int i11 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = this.valueOf;
        AFj1tSDK aFj1tSDK = this.AFInAppEventType;
        AFj1sSDK.valueOf(i11, i12, false, i13, aFj1tSDK.AFInAppEventParameterName, aFj1tSDK.AFKeystoreWrapper, this.registerClient);
        int[] iArr = this.registerClient;
        int i14 = iArr[0];
        int i15 = iArr[1];
        byte[] bArr3 = this.AFKeystoreWrapper;
        bArr3[0] = (byte) (i14 >> 24);
        bArr3[1] = (byte) (i14 >> 16);
        bArr3[2] = (byte) (i14 >> 8);
        bArr3[3] = (byte) i14;
        bArr3[4] = (byte) (i15 >> 24);
        bArr3[5] = (byte) (i15 >> 16);
        bArr3[6] = (byte) (i15 >> 8);
        bArr3[7] = (byte) i15;
        if (this.AFLogger == 2) {
            for (int i16 = 0; i16 < 8; i16++) {
                byte[] bArr4 = this.AFKeystoreWrapper;
                bArr4[i16] = (byte) (bArr4[i16] ^ this.AFInAppEventParameterName[i16]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.f57496d == Integer.MAX_VALUE) {
            this.f57496d = ((FilterInputStream) this).in.read();
        }
        if (this.unregisterClient == 8) {
            byte[] bArr = this.AFKeystoreWrapper;
            int i11 = this.f57496d;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFKeystoreWrapper, i12, 8 - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventType();
            int read2 = ((FilterInputStream) this).in.read();
            this.f57496d = read2;
            this.unregisterClient = 0;
            this.f57497e = read2 < 0 ? 8 - (this.AFKeystoreWrapper[7] & 255) : 8;
        }
        return this.f57497e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.f57497e - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i11 = this.unregisterClient;
        if (i11 >= this.f57497e) {
            return -1;
        }
        byte[] bArr = this.AFKeystoreWrapper;
        this.unregisterClient = i11 + 1;
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
            AFKeystoreWrapper();
            int i15 = this.unregisterClient;
            if (i15 >= this.f57497e) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.AFKeystoreWrapper;
            this.unregisterClient = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
