package com.vk.media.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vkontakte.android.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class QRCodeGenerate {
    public static boolean a = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static Bitmap a(Context context, String str, int i, Bitmap bitmap, boolean z) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        String str2;
        int sqrt;
        ?? createBitmap;
        BufferedInputStream bufferedInputStream2 = null;
        if (bitmap != null) {
            str2 = "";
        } else {
            if (z) {
                try {
                    bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(R.raw.vklogo), 131072);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        int i2 = 0;
                        while (true) {
                            int length = bArr.length - i2;
                            if (length == 0) {
                                int length2 = bArr.length * 2;
                                byte[] bArr2 = new byte[length2];
                                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                                length = length2 - i2;
                                bArr = bArr2;
                            }
                            int read = bufferedInputStream.read(bArr, i2, length);
                            if (read <= 0) {
                                break;
                            }
                            i2 += read;
                        }
                        String str3 = new String(bArr, 0, i2, StandardCharsets.UTF_8);
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused) {
                        }
                        str2 = str3;
                    } catch (IOException unused2) {
                    }
                } catch (IOException unused3) {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 == null) {
                        throw th;
                    }
                    try {
                        bufferedInputStream2.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            }
            str2 = null;
        }
        int[] iArr = new int[4];
        int[] nativeGenerateQR = nativeGenerateQR(str, str2, i, iArr);
        if (nativeGenerateQR != null) {
            try {
                sqrt = (int) Math.sqrt(nativeGenerateQR.length);
                createBitmap = Bitmap.createBitmap(sqrt, sqrt, Bitmap.Config.ARGB_8888);
            } catch (Throwable unused5) {
                return bufferedInputStream2;
            }
            try {
                createBitmap.setPixels(nativeGenerateQR, 0, sqrt, 0, 0, sqrt, sqrt);
                i = sqrt;
                createBitmap = createBitmap;
            } catch (Throwable unused6) {
                bufferedInputStream2 = createBitmap;
                return bufferedInputStream2;
            }
        } else {
            createBitmap = 0;
        }
        if (bitmap == null) {
            return createBitmap;
        }
        Paint paint = new Paint(2);
        paint.setAntiAlias(true);
        Rect rect = new Rect();
        int i3 = iArr[0];
        rect.left = i3;
        int i4 = iArr[1];
        rect.top = i4;
        rect.bottom = i4 + iArr[2];
        rect.right = i3 + iArr[3];
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i, createBitmap.getConfig());
        ?? canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        canvas.drawBitmap(bitmap, null, rect, paint);
        createBitmap.recycle();
        return createBitmap2;
    }

    public static boolean b() {
        boolean z;
        if (!a) {
            try {
                NativeLibLoader nativeLibLoader = NativeLibLoader.a;
                NativeLib nativeLib = NativeLib.VK_QR_CODE;
                nativeLibLoader.getClass();
                z = NativeLibLoader.j(nativeLibLoader, nativeLib);
            } catch (UnsatisfiedLinkError unused) {
                z = false;
            }
            a = z;
        }
        return a;
    }

    public static native int[] nativeGenerateQR(String str, String str2, int i, int[] iArr);

    public static native int[] nativeRenderSvg(String str, int i, int i2);
}
