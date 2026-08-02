package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class eq4 implements ds9 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(C.UTF8_NAME));
    public static final byte[] b = "MPF".getBytes(Charset.forName(C.UTF8_NAME));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(dq4 dq4Var, kn4 kn4Var) {
        int k;
        try {
            int d = dq4Var.d();
            if ((d & 65496) != 65496 && d != 19789 && d != 18761) {
                return -1;
            }
            k = k(dq4Var, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        } catch (cq4 unused) {
        }
        if (k == -1) {
            return -1;
        }
        byte[] bArr = (byte[]) kn4Var.d(k, byte[].class);
        try {
            return l(dq4Var, bArr, k);
        } finally {
            kn4Var.j(bArr);
        }
    }

    public static ImageHeaderParser$ImageType h(dq4 dq4Var) {
        try {
            int d = dq4Var.d();
            if (d == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int j = (d << 8) | dq4Var.j();
            if (j == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int j2 = (j << 8) | dq4Var.j();
            if (j2 == -1991225785) {
                dq4Var.skip(21L);
                try {
                    return dq4Var.j() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (cq4 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (j2 == 1380533830) {
                dq4Var.skip(4L);
                if (((dq4Var.d() << 16) | dq4Var.d()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int d2 = (dq4Var.d() << 16) | dq4Var.d();
                if ((d2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = d2 & 255;
                if (i == 88) {
                    dq4Var.skip(4L);
                    short j3 = dq4Var.j();
                    return (j3 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (j3 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                dq4Var.skip(4L);
                return (dq4Var.j() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((dq4Var.d() << 16) | dq4Var.d()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int d3 = (dq4Var.d() << 16) | dq4Var.d();
            if (d3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = d3 == 1635150182;
            dq4Var.skip(4L);
            int i3 = j2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int d4 = (dq4Var.d() << 16) | dq4Var.d();
                    if (d4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (d4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (cq4 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(dq4 dq4Var, kn4 kn4Var) {
        if (h(dq4Var) == ImageHeaderParser$ImageType.JPEG) {
            int k = k(dq4Var, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
            while (k > 0) {
                byte[] bArr = (byte[]) kn4Var.d(k, byte[].class);
                try {
                    if (dq4Var.i(k, bArr) != k ? false : j(bArr, k, b)) {
                        kn4Var.j(bArr);
                        return true;
                    }
                    kn4Var.j(bArr);
                    k = k(dq4Var, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
                } catch (Throwable th) {
                    kn4Var.j(bArr);
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int k(dq4 dq4Var, int i) {
        short j;
        while (dq4Var.j() == 255 && (j = dq4Var.j()) != 218 && j != 217) {
            int d = dq4Var.d() - 2;
            if (j == i) {
                return d;
            }
            long j2 = d;
            if (dq4Var.skip(j2) != j2) {
                return -1;
            }
        }
        return -1;
    }

    public static int l(dq4 dq4Var, byte[] bArr, int i) {
        int i2;
        int i3;
        if (dq4Var.i(i, bArr) == i && j(bArr, i, a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            byteBuffer.order(s != 18761 ? s != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s2 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            for (int i6 = 0; i6 < s2; i6++) {
                int i7 = (i6 * 12) + i4 + 8;
                if ((byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1) == 274) {
                    int i8 = i7 + 2;
                    short s3 = byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1;
                    if (s3 >= 1 && s3 <= 12) {
                        int i9 = i7 + 4;
                        int i10 = byteBuffer.remaining() - i9 >= 4 ? byteBuffer.getInt(i9) : -1;
                        if (i10 >= 0 && (i2 = i10 + c[s3]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                            if (byteBuffer.remaining() - i3 >= 2) {
                                return byteBuffer.getShort(i3);
                            }
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ds9
    public final boolean a(ByteBuffer byteBuffer, kn4 kn4Var) {
        bq4 bq4Var = new bq4(byteBuffer);
        w1a.m(kn4Var, "Argument must not be null");
        return i(bq4Var, kn4Var);
    }

    @Override // defpackage.ds9
    public final int b(InputStream inputStream, kn4 kn4Var) {
        de0 de0Var = new de0(inputStream, 15);
        w1a.m(kn4Var, "Argument must not be null");
        return g(de0Var, kn4Var);
    }

    @Override // defpackage.ds9
    public final int c(ByteBuffer byteBuffer, kn4 kn4Var) {
        bq4 bq4Var = new bq4(byteBuffer);
        w1a.m(kn4Var, "Argument must not be null");
        return g(bq4Var, kn4Var);
    }

    @Override // defpackage.ds9
    public final boolean d(InputStream inputStream, kn4 kn4Var) {
        de0 de0Var = new de0(inputStream, 15);
        w1a.m(kn4Var, "Argument must not be null");
        return i(de0Var, kn4Var);
    }

    @Override // defpackage.ds9
    public final ImageHeaderParser$ImageType e(ByteBuffer byteBuffer) {
        w1a.m(byteBuffer, "Argument must not be null");
        return h(new bq4(byteBuffer));
    }

    @Override // defpackage.ds9
    public final ImageHeaderParser$ImageType f(InputStream inputStream) {
        return h(new de0(inputStream, 15));
    }
}
