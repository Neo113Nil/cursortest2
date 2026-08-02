package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1rSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private short AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AFLogger;

    /* renamed from: e, reason: collision with root package name */
    private int f57498e;
    private int unregisterClient;
    private long[] valueOf;
    private final int values;

    public AFj1rSDK(InputStream inputStream, int i11, int i12, short s11, int i13, int i14) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFLogger = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s11, 4), 8);
        this.values = min;
        this.AFInAppEventParameterName = new byte[min];
        this.AFKeystoreWrapper = new long[4];
        this.valueOf = new long[4];
        this.unregisterClient = min;
        this.f57498e = min;
        this.AFKeystoreWrapper = AFj1uSDK.valueOf(i11 ^ i14, min ^ i14);
        this.valueOf = AFj1uSDK.valueOf(i12 ^ i14, i13 ^ i14);
    }

    private void AFInAppEventType() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.valueOf;
        short s11 = this.AFInAppEventType;
        long j11 = jArr[s11 % 4] * 2147483085;
        long j12 = jArr2[(s11 + 2) % 4];
        int i11 = (s11 + 3) % 4;
        jArr2[i11] = ((jArr[i11] * 2147483085) + j12) / 2147483647L;
        jArr[i11] = (j11 + j12) % 2147483647L;
        for (int i12 = 0; i12 < this.values; i12++) {
            this.AFInAppEventParameterName[i12] = (byte) (r1[i12] ^ ((this.AFKeystoreWrapper[this.AFInAppEventType] >> (i12 << 3)) & 255));
        }
        this.AFInAppEventType = (short) ((this.AFInAppEventType + 1) % 4);
    }

    private int values() throws IOException {
        int i11;
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        if (this.unregisterClient == this.values) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i12 = this.AFLogger;
            bArr[0] = (byte) i12;
            if (i12 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventParameterName, i13, this.values - i13);
                if (read <= 0) {
                    break;
                }
                i13 += read;
            } while (i13 < this.values);
            if (i13 < this.values) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventType();
            int read2 = ((FilterInputStream) this).in.read();
            this.AFLogger = read2;
            this.unregisterClient = 0;
            if (read2 < 0) {
                int i14 = this.values;
                i11 = i14 - (this.AFInAppEventParameterName[i14 - 1] & 255);
            } else {
                i11 = this.values;
            }
            this.f57498e = i11;
        }
        return this.f57498e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.f57498e - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i11 = this.unregisterClient;
        if (i11 >= this.f57498e) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
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
            values();
            int i15 = this.unregisterClient;
            if (i15 >= this.f57498e) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.unregisterClient = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
