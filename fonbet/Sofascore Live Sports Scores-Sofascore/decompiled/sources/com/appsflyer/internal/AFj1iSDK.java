package com.appsflyer.internal;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1iSDK extends FilterInputStream {
    private static final short AFLogger = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFKeystoreWrapper;
    private final int AFLoggerLogLevel;
    private int AppsFlyerLib;
    private final int afDebugLog;
    private int afErrorLog;
    private int afInfoLog;
    private int afWarnLog;
    private byte[] d;
    private int e;
    private int force;
    private int i;
    private byte[] registerClient;
    private int unregisterClient;
    private int v;
    private int w;

    private AFj1iSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.e = Integer.MAX_VALUE;
        this.AppsFlyerLib = 1;
        this.registerClient = new byte[8];
        this.d = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.unregisterClient = 8;
        this.v = 8;
        this.force = Math.min(Math.max(i2, 5), 16);
        this.w = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.d, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i == 0) {
            this.i = (int) j;
            long j2 = j >> 3;
            short s = AFLogger;
            this.afWarnLog = (int) ((s * j2) >> 32);
            this.afErrorLog = (int) (j >> 32);
            this.afInfoLog = (int) (j2 + s);
        } else {
            int i4 = (int) j;
            this.i = i4;
            this.afWarnLog = i4 * i;
            this.afErrorLog = i ^ i4;
            this.afInfoLog = (int) (j >> 32);
        }
        this.AFLoggerLogLevel = 100;
        this.afDebugLog = 100;
    }

    private void AFKeystoreWrapper() {
        if (this.w == 3) {
            byte[] bArr = this.registerClient;
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, bArr.length);
        }
        byte[] bArr2 = this.registerClient;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i3 = 0;
        while (true) {
            int i4 = this.force;
            if (i3 >= i4) {
                break;
            }
            short s = AFLogger;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.afErrorLog)) ^ ((i >>> 5) + this.afInfoLog);
            i -= (((i2 << 4) + this.i) ^ (((i4 - i3) * s) + i2)) ^ ((i2 >>> 5) + this.afWarnLog);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.registerClient;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.w == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.registerClient;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.d[i5]);
            }
            byte[] bArr5 = this.AFKeystoreWrapper;
            System.arraycopy(bArr5, 0, this.d, 0, bArr5.length);
        }
    }

    private int AFLogger() throws IOException {
        int i = this.e;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.e = i;
        }
        if (this.unregisterClient == 8) {
            this.registerClient[0] = (byte) i;
            if (i < 0) {
                a70.r("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.registerClient, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                a70.r("unexpected block size");
                return 0;
            }
            int i3 = this.AFLoggerLogLevel;
            if (i3 == this.afDebugLog) {
                AFKeystoreWrapper();
            } else {
                if (this.AppsFlyerLib <= i3) {
                    AFKeystoreWrapper();
                }
                int i4 = this.AppsFlyerLib;
                if (i4 < this.afDebugLog) {
                    this.AppsFlyerLib = i4 + 1;
                } else {
                    this.AppsFlyerLib = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.e = read2;
            this.unregisterClient = 0;
            this.v = read2 < 0 ? 8 - (this.registerClient[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : 8;
        }
        return this.v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFLogger();
        return this.v - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFLogger();
            int i5 = this.unregisterClient;
            if (i5 >= this.v) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.registerClient;
            this.unregisterClient = i5 + 1;
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
    public final int read() throws IOException {
        AFLogger();
        int i = this.unregisterClient;
        if (i >= this.v) {
            return -1;
        }
        byte[] bArr = this.registerClient;
        this.unregisterClient = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public AFj1iSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }
}
