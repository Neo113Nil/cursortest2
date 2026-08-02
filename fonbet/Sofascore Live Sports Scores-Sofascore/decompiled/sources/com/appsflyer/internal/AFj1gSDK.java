package com.appsflyer.internal;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1gSDK extends FilterInputStream {
    private final int AFKeystoreWrapper;
    private final int AFLogger;
    private int afDebugLog;
    private long[] d;
    private long[] e;
    private byte[] force;
    private int i;
    private final int registerClient;
    private int unregisterClient;
    private int v;
    private short w;

    private AFj1gSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.unregisterClient = 1;
        this.v = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.registerClient = min;
        this.force = new byte[min];
        this.d = new long[4];
        this.e = new long[4];
        this.i = min;
        this.afDebugLog = min;
        this.d = AFj1jSDK.unregisterClient(i ^ i4, min ^ i4);
        this.e = AFj1jSDK.unregisterClient(i2 ^ i4, i3 ^ i4);
        this.AFKeystoreWrapper = 100;
        this.AFLogger = 100;
    }

    private int AFKeystoreWrapper() throws IOException {
        int i = this.v;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.v = i;
        }
        if (this.i == this.registerClient) {
            this.force[0] = (byte) i;
            if (i < 0) {
                a70.r("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.force, i2, this.registerClient - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < this.registerClient);
            if (i2 < this.registerClient) {
                a70.r("unexpected block size");
                return 0;
            }
            int i3 = this.AFKeystoreWrapper;
            if (i3 == this.AFLogger) {
                registerClient();
            } else {
                if (this.unregisterClient <= i3) {
                    registerClient();
                }
                int i4 = this.unregisterClient;
                if (i4 < this.AFLogger) {
                    this.unregisterClient = i4 + 1;
                } else {
                    this.unregisterClient = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.v = read2;
            this.i = 0;
            int i5 = this.registerClient;
            if (read2 < 0) {
                i5 -= this.force[i5 - 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            this.afDebugLog = i5;
        }
        return this.afDebugLog;
    }

    private void registerClient() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        short s = this.w;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.registerClient; i2++) {
            this.force[i2] = (byte) (r1[i2] ^ ((this.d[this.w] >> (i2 << 3)) & 255));
        }
        this.w = (short) ((this.w + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.afDebugLog - this.i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.i;
            if (i5 >= this.afDebugLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.force;
            this.i = i5 + 1;
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
        AFKeystoreWrapper();
        int i = this.i;
        if (i >= this.afDebugLog) {
            return -1;
        }
        byte[] bArr = this.force;
        this.i = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public AFj1gSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }
}
