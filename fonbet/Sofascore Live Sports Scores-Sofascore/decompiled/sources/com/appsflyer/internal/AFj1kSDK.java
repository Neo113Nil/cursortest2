package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1kSDK {
    private static byte[] w = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    static final byte[] AFLogger = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] registerClient = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] unregisterClient = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] AFKeystoreWrapper = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    static final int[] d = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    private static int[] e = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = w;
            i = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i2 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = w[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            AFLogger[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = ((i5 ^ (i6 ^ i7)) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            registerClient[i4] = i9;
            unregisterClient[i4] = (i9 >>> 8) | (i9 << 24);
            AFKeystoreWrapper[i4] = (i9 >>> 16) | (i9 << 16);
            d[i4] = (i9 << 8) | (i9 >>> 24);
        }
        e[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            e[i11] = i10 << 24;
        }
    }

    public static int[] AFLogger(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            ilg.c();
            return null;
        }
        int i2 = 4;
        int i3 = (i + 1) * 4;
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i4 + 3;
            int i7 = ((bArr[i4 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i4] << 24) | ((bArr[i4 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            i4 += 4;
            iArr[i5] = i7 | (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int i8 = 4;
        int i9 = 0;
        int i10 = 0;
        while (i8 < i3) {
            int i11 = iArr[i8 - 1];
            if (i9 == 0) {
                byte[] bArr2 = w;
                i11 = ((bArr2[i11 >>> 24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (((bArr2[(i11 >>> 16) & 255] << 24) | ((bArr2[(i11 >>> 8) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16)) | ((bArr2[i11 & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8))) ^ e[i10];
                i9 = 4;
                i10++;
            }
            iArr[i8] = i11 ^ iArr[i8 - 4];
            i8++;
            i9--;
        }
        if (bArr.length != 16) {
            ilg.c();
            return null;
        }
        int[] iArr2 = new int[i3];
        int i12 = i * 4;
        iArr2[0] = iArr[i12];
        int i13 = 1;
        iArr2[1] = iArr[i12 + 1];
        iArr2[2] = iArr[i12 + 2];
        char c = 3;
        iArr2[3] = iArr[i12 + 3];
        int i14 = i12 - 4;
        while (i13 < i) {
            int i15 = iArr[i14];
            int[] iArr3 = registerClient;
            byte[] bArr3 = w;
            int i16 = iArr3[bArr3[i15 >>> 24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            int[] iArr4 = unregisterClient;
            int i17 = i16 ^ iArr4[bArr3[(i15 >>> 16) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            int[] iArr5 = AFKeystoreWrapper;
            int i18 = i17 ^ iArr5[bArr3[(i15 >>> 8) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            int[] iArr6 = d;
            iArr2[i2] = iArr6[bArr3[i15 & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ i18;
            int i19 = iArr[i14 + 1];
            char c2 = c;
            int[] iArr7 = iArr2;
            iArr7[i2 + 1] = ((iArr4[bArr3[(i19 >>> 16) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ iArr3[bArr3[i19 >>> 24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) ^ iArr5[bArr3[(i19 >>> 8) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) ^ iArr6[bArr3[i19 & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            int i20 = iArr[i14 + 2];
            int i21 = i2 + 3;
            iArr7[i2 + 2] = iArr6[bArr3[i20 & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ ((iArr3[bArr3[i20 >>> 24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ iArr4[bArr3[(i20 >>> 16) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) ^ iArr5[bArr3[(i20 >>> 8) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]);
            int i22 = iArr[i14 + 3];
            i2 += 4;
            iArr7[i21] = iArr6[bArr3[i22 & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ ((iArr3[bArr3[i22 >>> 24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] ^ iArr4[bArr3[(i22 >>> 16) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) ^ iArr5[bArr3[(i22 >>> 8) & 255] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]);
            i14 -= 4;
            i13++;
            c = c2;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i2] = iArr[i14];
        iArr8[i2 + 1] = iArr[i14 + 1];
        iArr8[i2 + 2] = iArr[i14 + 2];
        iArr8[i2 + 3] = iArr[i14 + 3];
        return iArr8;
    }

    public static byte[][] d(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }
}
