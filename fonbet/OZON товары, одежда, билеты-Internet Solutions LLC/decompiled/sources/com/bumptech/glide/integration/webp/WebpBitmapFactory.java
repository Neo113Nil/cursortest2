package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.bumptech.glide.integration.webp.c;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Keep
/* loaded from: classes8.dex */
public class WebpBitmapFactory {
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static final int MAX_WEBP_HEADER_SIZE = 21;
    public static boolean sUseSystemDecoder = true;

    static {
        System.loadLibrary("glide-webp");
    }

    @Keep
    private static Bitmap createBitmap(int i11, int i12, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            Bitmap bitmap2 = options.inBitmap;
            if (bitmap2.getWidth() == i11 && bitmap2.getHeight() == i12 && bitmap2.getConfig() == options.inPreferredConfig) {
                bitmap2.setHasAlpha(true);
                bitmap2.eraseColor(0);
                return bitmap2;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        createBitmap.setHasAlpha(true);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i11, int i12) {
        return decodeByteArray(bArr, i11, i12, null);
    }

    public static Bitmap decodeFile(String str) {
        return decodeFile(str, null);
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        return decodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap decodeResource(Resources resources, int i11) {
        return decodeResource(resources, i11, null);
    }

    public static Bitmap decodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i11 = typedValue.density;
            if (i11 == 0) {
                options.inDensity = 160;
            } else if (i11 != 65535) {
                options.inDensity = i11;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return decodeStream(inputStream, rect, options);
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        return decodeStream(inputStream, null, null);
    }

    private static byte[] getImageHeader(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 21);
        }
        inputStream.mark(21);
        byte[] bArr = new byte[21];
        try {
            inputStream.read(bArr, 0, 21);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[IN_TEMP_BUFFER_SIZE] : bArr;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options != null) {
            int i11 = options.inSampleSize;
            r0 = i11 > 1 ? 1.0f / i11 : 1.0f;
            if (options.inScaled) {
                int i12 = options.inDensity;
                int i13 = options.inTargetDensity;
                int i14 = options.inScreenDensity;
                if (i12 != 0 && i13 != 0 && i12 != i14) {
                    return (i13 / i12) * r0;
                }
            }
        }
        return r0;
    }

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i11, int i12, BitmapFactory.Options options, float f7, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f7, byte[] bArr);

    private static void setDefaultPadding(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || options == null) {
            return;
        }
        int i11 = options.inDensity;
        if (i11 == 0) {
            if (options.inBitmap != null) {
                bitmap.setDensity(160);
                return;
            }
            return;
        }
        bitmap.setDensity(i11);
        int i12 = options.inTargetDensity;
        if (i12 == 0 || i11 == i12 || i11 == options.inScreenDensity || !options.inScaled) {
            return;
        }
        bitmap.setDensity(i12);
    }

    @Keep
    private static boolean setOutDimensions(BitmapFactory.Options options, int i11, int i12) {
        if (options == null) {
            return false;
        }
        options.outWidth = i11;
        options.outHeight = i12;
        return options.inJustDecodeBounds;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    public static boolean webpSupportRequired(byte[] bArr, int i11, int i12) {
        c.e eVar;
        try {
            eVar = c.a(i11, i12, bArr);
        } catch (IOException unused) {
            eVar = c.e.NONE_WEBP;
        }
        if (sUseSystemDecoder) {
            return false;
        }
        return c.e(eVar);
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, IN_TEMP_BUFFER_SIZE) : inputStream;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i11, int i12, BitmapFactory.Options options) {
        if ((i11 | i12) < 0 || bArr.length < i11 + i12) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (!webpSupportRequired(bArr, i11, i12)) {
            return BitmapFactory.decodeByteArray(bArr, i11, i12, options);
        }
        Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i11, i12, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeByteArray, options);
        return nativeDecodeByteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeFile(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        r1 = null;
        Bitmap bitmap = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    bitmap = decodeStream(fileInputStream, null, options);
                } catch (Exception e11) {
                    e = e11;
                    Log.e("WebpBitmapFactory", "Unable to decode stream: " + e);
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused2) {
        }
        return bitmap;
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap decodeFileDescriptor;
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
        try {
            if (webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, 21)) {
                decodeFileDescriptor = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                setWebpBitmapOptions(decodeFileDescriptor, options);
                setDefaultPadding(rect);
            } else {
                decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            }
            try {
                wrapToMarkSupportedStream.close();
            } catch (Throwable unused) {
            }
            return decodeFileDescriptor;
        } catch (Throwable th2) {
            try {
                wrapToMarkSupportedStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0010, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r3 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeResource(Resources resources, int i11, BitmapFactory.Options options) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        r0 = null;
        Bitmap bitmap = null;
        try {
            TypedValue typedValue = new TypedValue();
            inputStream = resources.openRawResource(i11, typedValue);
            try {
                bitmap = decodeResourceStream(resources, typedValue, inputStream, null, options);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    public static Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (inputStream == null) {
            return null;
        }
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        if (!webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, 21)) {
            return BitmapFactory.decodeStream(wrapToMarkSupportedStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeStream, options);
        setDefaultPadding(rect);
        return nativeDecodeStream;
    }
}
