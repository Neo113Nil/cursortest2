package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m1l {
    public byte a;
    public boolean b;
    public long c;
    public int d;
    public int e = 0;

    public static int c(byte[] bArr) {
        byte b = bArr[1];
        int i = (b & 128) != 0 ? 6 : 2;
        int i2 = b & Byte.MAX_VALUE;
        return i2 != 126 ? i2 != 127 ? i : i + 8 : i + 2;
    }

    public final int a(int i, int i2, byte[] bArr) {
        long j = this.c;
        int min = Math.min(i2, j > 2147483647L ? Integer.MAX_VALUE : (int) j);
        this.c -= min;
        if (this.b) {
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = this.d;
                int i5 = this.e;
                int i6 = i + i3;
                bArr[i6] = (byte) (((i4 >> ((3 - i5) * 8)) & 255) ^ bArr[i6]);
                this.e = (i5 + 1) % 4;
            }
        }
        return min;
    }

    public final int b(int i, byte[] bArr) {
        long j = this.c;
        int i2 = 10;
        int i3 = j > 65535 ? 10 : j > 125 ? 4 : 2;
        boolean z = this.b;
        if (z) {
            i3 += 4;
        }
        if (i < i3) {
            return 0;
        }
        bArr[0] = this.a;
        if (j > 65535) {
            bArr[1] = (byte) ((z ? 128 : 0) | Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            bArr[2] = (byte) ((j >> 56) & 255);
            bArr[3] = (byte) ((j >> 48) & 255);
            bArr[4] = (byte) ((j >> 40) & 255);
            bArr[5] = (byte) ((j >> 32) & 255);
            bArr[6] = (byte) ((j >> 24) & 255);
            bArr[7] = (byte) ((j >> 16) & 255);
            bArr[8] = (byte) ((j >> 8) & 255);
            bArr[9] = (byte) (j & 255);
        } else if (j > 125) {
            bArr[1] = (byte) ((z ? 128 : 0) | Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            bArr[2] = (byte) (j >> 8);
            bArr[3] = (byte) (j & 255);
            i2 = 4;
        } else {
            bArr[1] = (byte) (j | (z ? 128 : 0));
            i2 = 2;
        }
        if (!z) {
            return i2;
        }
        int i4 = this.d;
        bArr[i2] = (byte) ((i4 >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i4 >> 16) & 255);
        int i5 = i2 + 3;
        bArr[i2 + 2] = (byte) ((i4 >> 8) & 255);
        int i6 = i2 + 4;
        bArr[i5] = (byte) (i4 & 255);
        return i6;
    }
}
