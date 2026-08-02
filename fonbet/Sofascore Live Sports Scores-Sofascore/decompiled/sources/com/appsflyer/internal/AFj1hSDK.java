package com.appsflyer.internal;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1hSDK extends FilterInputStream {
    private final int AFLoggerLogLevel;
    private int AppsFlyerLib;
    private final int afDebugLog;
    private final byte[] afErrorLog;
    private int afInfoLog;
    private int afWarnLog;
    private final byte[] e;
    private final byte[][] force;
    private final int i;
    private final int[] v;
    private int valueOf;
    private final int[] w;
    private static final byte[] AFLogger = AFj1kSDK.AFLogger;
    private static final int[] registerClient = AFj1kSDK.registerClient;
    private static final int[] d = AFj1kSDK.unregisterClient;
    private static final int[] AFKeystoreWrapper = AFj1kSDK.AFKeystoreWrapper;
    private static final int[] unregisterClient = AFj1kSDK.d;

    private AFj1hSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.w = new int[4];
        this.e = new byte[16];
        this.afErrorLog = new byte[16];
        this.afWarnLog = 1;
        this.afInfoLog = Integer.MAX_VALUE;
        this.AppsFlyerLib = 16;
        this.valueOf = 16;
        this.i = i;
        this.v = AFj1kSDK.AFLogger(bArr, i);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = new byte[bArr2[i2].length];
            int i3 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i2];
                if (i3 < bArr4.length) {
                    bArr3[i2][bArr4[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        this.force = bArr3;
        this.afDebugLog = 100;
        this.AFLoggerLogLevel = 100;
    }

    private void unregisterClient(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.w;
        boolean z = true;
        char c = 2;
        char c2 = '\b';
        char c3 = 3;
        int i = (bArr[0] << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int[] iArr2 = this.v;
        iArr[0] = i ^ iArr2[0];
        char c4 = 5;
        char c5 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16)) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (((bArr[8] << 24) | ((bArr[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16)) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8))) ^ iArr2[2];
        char c6 = 14;
        iArr[3] = (((((bArr[13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[12] << 24)) | ((bArr[14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) ^ iArr2[3];
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.i) {
            int[] iArr3 = registerClient;
            int[] iArr4 = this.w;
            boolean z2 = z;
            byte[][] bArr3 = this.force;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = d;
            byte[] bArr5 = bArr3[z2 ? 1 : 0];
            char c7 = c;
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[c7];
            char c8 = c3;
            int i6 = i5 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = unregisterClient;
            byte[] bArr7 = bArr3[c8];
            char c9 = c2;
            int i7 = i6 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.v;
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
        int[] iArr9 = this.v;
        int i12 = iArr9[i3];
        byte[] bArr8 = AFLogger;
        int[] iArr10 = this.w;
        byte[][] bArr9 = this.force;
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
        bArr2[c6] = (byte) (bArr8[(iArr10[bArr12[c13]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[c13]] & 255] ^ i15);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterClient();
        return this.valueOf - this.AppsFlyerLib;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            unregisterClient();
            int i5 = this.AppsFlyerLib;
            if (i5 >= this.valueOf) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.afErrorLog;
            this.AppsFlyerLib = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
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
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        unregisterClient();
        int i = this.AppsFlyerLib;
        if (i >= this.valueOf) {
            return -1;
        }
        byte[] bArr = this.afErrorLog;
        this.AppsFlyerLib = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public AFj1hSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private int unregisterClient() throws IOException {
        int i = this.afInfoLog;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.afInfoLog = i;
        }
        if (this.AppsFlyerLib == 16) {
            this.e[0] = (byte) i;
            if (i < 0) {
                a70.r("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.e, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 >= 16) {
                int i3 = this.afDebugLog;
                if (i3 == this.AFLoggerLogLevel) {
                    unregisterClient(this.e, this.afErrorLog);
                } else {
                    int i4 = this.afWarnLog;
                    byte[] bArr = this.e;
                    if (i4 <= i3) {
                        unregisterClient(bArr, this.afErrorLog);
                    } else {
                        System.arraycopy(bArr, 0, this.afErrorLog, 0, bArr.length);
                    }
                    int i5 = this.afWarnLog;
                    if (i5 < this.AFLoggerLogLevel) {
                        this.afWarnLog = i5 + 1;
                    } else {
                        this.afWarnLog = 1;
                    }
                }
                int read2 = ((FilterInputStream) this).in.read();
                this.afInfoLog = read2;
                this.AppsFlyerLib = 0;
                this.valueOf = read2 < 0 ? 16 - (this.afErrorLog[15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : 16;
            } else {
                a70.r("unexpected block size");
                return 0;
            }
        }
        return this.valueOf;
    }
}
