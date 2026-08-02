package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static Bitmap pcc(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0 && i2 > 0) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (i < width && i2 < height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(i / width, i2 / height);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                }
            } catch (Throwable th) {
                th.getMessage();
                return null;
            }
        }
        return bitmap;
    }

    public static byte[] pcc(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
