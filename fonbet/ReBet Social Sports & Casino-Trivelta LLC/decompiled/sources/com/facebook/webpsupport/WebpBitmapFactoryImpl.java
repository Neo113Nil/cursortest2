package com.facebook.webpsupport;

import D6.d;
import L6.a;
import L6.b;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.facebook.imagepipeline.nativecode.e;
import com.plaid.internal.EnumC3631g;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@d
/* loaded from: classes2.dex */
public class WebpBitmapFactoryImpl implements b {

    /* renamed from: a, reason: collision with root package name */
    public static a f31631a;

    public static byte[] c(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @d
    private static Bitmap createBitmap(int i10, int i11, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? f31631a.a(i10, i11, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    public static void d(String str) {
    }

    public static InputStream e(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    @d
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @d
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options != null) {
            int i10 = options.inSampleSize;
            r0 = i10 > 1 ? 1.0f / i10 : 1.0f;
            if (options.inScaled) {
                int i11 = options.inDensity;
                int i12 = options.inTargetDensity;
                int i13 = options.inScreenDensity;
                if (i11 != 0 && i12 != 0 && i11 != i13) {
                    return i12 / i11;
                }
            }
        }
        return r0;
    }

    @d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options) {
        e.a();
        Bitmap originalDecodeByteArray = originalDecodeByteArray(bArr, i10, i11, options);
        if (originalDecodeByteArray == null) {
            d("webp_direct_decode_array_failed_on_no_webp");
        }
        return originalDecodeByteArray;
    }

    @d
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception unused) {
            return bitmap;
        }
    }

    @d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        e.a();
        long nativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (nativeSeek == -1) {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        InputStream e10 = e(new FileInputStream(fileDescriptor));
        try {
            c(e10, options);
            nativeSeek(fileDescriptor, nativeSeek, true);
            Bitmap originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            if (originalDecodeFileDescriptor == null) {
                d("webp_direct_decode_fd_failed_on_no_webp");
            }
            return originalDecodeFileDescriptor;
        } finally {
            try {
                e10.close();
            } catch (Throwable unused) {
            }
        }
    }

    @d
    public static Bitmap hookDecodeResource(Resources resources, int i10, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i10, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @d
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i10 = typedValue.density;
            if (i10 == 0) {
                options.inDensity = EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            } else if (i10 != 65535) {
                options.inDensity = i10;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @d
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        e.a();
        Bitmap originalDecodeStream = originalDecodeStream(e(inputStream), rect, options);
        if (originalDecodeStream == null) {
            d("webp_direct_decode_stream_failed_on_no_webp");
        }
        return originalDecodeStream;
    }

    @d
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options, float f10, byte[] bArr2);

    @d
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f10, byte[] bArr);

    @d
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j10, boolean z10);

    @d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i10, i11, options);
    }

    @d
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @d
    private static Bitmap originalDecodeResource(Resources resources, int i10, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i10, options);
    }

    @d
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @d
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @d
    private static void setBitmapSize(BitmapFactory.Options options, int i10, int i11) {
        if (options != null) {
            options.outWidth = i10;
            options.outHeight = i11;
        }
    }

    @d
    private static boolean setOutDimensions(BitmapFactory.Options options, int i10, int i11) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i10;
        options.outHeight = i11;
        return true;
    }

    @d
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @d
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // L6.b
    public void a(a aVar) {
        f31631a = aVar;
    }

    @Override // L6.b
    public Bitmap b(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i10, int i11) {
        return BitmapFactory.decodeByteArray(bArr, i10, i11);
    }

    @d
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @d
    private static Bitmap originalDecodeResource(Resources resources, int i10) {
        return BitmapFactory.decodeResource(resources, i10);
    }

    @d
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i10, int i11) {
        return hookDecodeByteArray(bArr, i10, i11, null);
    }

    @d
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @d
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @d
    public static Bitmap hookDecodeResource(Resources resources, int i10) {
        return hookDecodeResource(resources, i10, null);
    }

    @d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
