package W5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public abstract class e {
    public static final double a(byte[] a10, byte[] b10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i13 = i10 * i10;
        if (a10.length != i13 || b10.length != i13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int max = Math.max(1, i10 / i11);
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = 0;
                for (int i18 = 0; i18 < max; i18++) {
                    int i19 = (((i15 * max) + i18) * i10) + (i16 * max);
                    for (int i20 = 0; i20 < max; i20++) {
                        int i21 = i19 + i20;
                        i17 += Math.abs((a10[i21] & UByte.MAX_VALUE) - (b10[i21] & UByte.MAX_VALUE));
                    }
                }
                if (i17 / (max * max) >= i12) {
                    i14++;
                }
            }
        }
        int i22 = i11 * i11;
        if (i22 == 0) {
            return 1.0d;
        }
        return i14 / i22;
    }

    public static final long b(Bitmap src, int i10, int i11) {
        Intrinsics.checkNotNullParameter(src, "src");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(src, new Rect(0, 0, src.getWidth(), src.getHeight()), new Rect(0, 0, i10, i11), new Paint(2));
        int i12 = i10 * i11;
        int[] iArr = new int[i12];
        createBitmap.getPixels(iArr, 0, i10, 0, 0, i10, i11);
        createBitmap.recycle();
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            iArr2[i13] = (int) ((((i14 >>> 16) & 255) * 0.299d) + (((i14 >>> 8) & 255) * 0.587d) + ((i14 & 255) * 0.114d));
        }
        long j10 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            for (int i17 = 0; i17 < i10 - 1 && i15 < 64; i17++) {
                int i18 = (i16 * i10) + i17;
                if (iArr2[i18] > iArr2[i18 + 1]) {
                    j10 |= 1 << (63 - i15);
                }
                i15++;
            }
        }
        return j10;
    }

    public static final byte[] c(Bitmap src, int i10) {
        Intrinsics.checkNotNullParameter(src, "src");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(2);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(src, new Rect(0, 0, src.getWidth(), src.getHeight()), new Rect(0, 0, i10, i10), paint);
        int i11 = i10 * i10;
        int[] iArr = new int[i11];
        createBitmap.getPixels(iArr, 0, i10, 0, 0, i10, i10);
        createBitmap.recycle();
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            bArr[i12] = (byte) ((((i13 >>> 16) & 255) * 0.299d) + (((i13 >>> 8) & 255) * 0.587d) + ((i13 & 255) * 0.114d));
        }
        return bArr;
    }

    public static final double d(byte[] bArr, byte[] b10) {
        byte[] a10 = bArr;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10.length != b10.length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = a10.length;
        int i10 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        for (int i11 = 0; i11 < length; i11++) {
            d11 += a10[i11] & UByte.MAX_VALUE;
            d12 += b10[i11] & UByte.MAX_VALUE;
        }
        double d13 = length;
        double d14 = d11 / d13;
        double d15 = d12 / d13;
        double d16 = 0.0d;
        double d17 = 0.0d;
        while (i10 < length) {
            double d18 = (a10[i10] & UByte.MAX_VALUE) - d14;
            double d19 = (b10[i10] & UByte.MAX_VALUE) - d15;
            d10 += d18 * d18;
            d16 += d19 * d19;
            d17 += d19 * d18;
            i10++;
            a10 = bArr;
        }
        double d20 = length - 1;
        double d21 = d10 / d20;
        double d22 = d16 / d20;
        double d23 = d17 / d20;
        double d24 = 2;
        return RangesKt.coerceIn(((((d24 * d14) * d15) + 6.502500000000001d) * ((d24 * d23) + 58.522499999999994d)) / ((((d14 * d14) + (d15 * d15)) + 6.502500000000001d) * ((d21 + d22) + 58.522499999999994d)), -1.0d, 1.0d);
    }
}
