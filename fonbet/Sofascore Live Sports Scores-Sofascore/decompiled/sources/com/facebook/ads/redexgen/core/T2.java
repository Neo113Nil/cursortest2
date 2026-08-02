package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T2 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, 12, 14};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        C1873Lo c1873Lo = new C1873Lo(inputStream);
        c1873Lo.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1873Lo, null, options);
        c1873Lo.reset();
        if (!c1873Lo.A00()) {
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c1873Lo, null, options);
        }
        return BitmapFactory.decodeStream(c1873Lo);
    }

    public static Bitmap A02(String str, int i, int i2, T8 t8) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t) {
            t8.A08().ABC(A03(0, 5, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE), AbstractC2064Td.A1h, new C2065Te(t));
            return null;
        }
    }
}
