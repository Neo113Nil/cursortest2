package com.facebook.imageutils;

import W9.d;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.imageutils.BitmapUtil;
import com.google.crypto.tink.integration.android.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.C6776e;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0010J'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\f\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001fH\u0007¢\u0006\u0004\b%\u0010#J-\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020,H\u0002¢\u0006\u0004\b2\u0010.R!\u00108\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010>\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010:R\u0014\u0010?\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010:R\u0014\u0010A\u001a\u00020@8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010D¨\u0006E"}, d2 = {"Lcom/facebook/imageutils/BitmapUtil;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "getSizeInBytes", "(Landroid/graphics/Bitmap;)I", "", "bytes", "Landroid/util/Pair;", "decodeDimensions", "([B)Landroid/util/Pair;", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)Landroid/util/Pair;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Landroid/util/Pair;", "Lcom/facebook/imageutils/ImageMetaData;", "decodeDimensionsAndColorSpace", "(Ljava/io/InputStream;)Lcom/facebook/imageutils/ImageMetaData;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "getPixelSizeForBitmapConfig", "(Landroid/graphics/Bitmap$Config;)I", "width", "height", "getSizeInByteForBitmap", "(IILandroid/graphics/Bitmap$Config;)I", "", "useDecodeBufferHelper", "", "setUseDecodeBufferHelper", "(Z)V", "fixDecodeDrmImageCrash", "setFixDecodeDrmImageCrash", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", "options", "decodeStreamInternal", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "byteBuffer", "f", "(Ljava/nio/ByteBuffer;)V", e.f29601m, "Lx0/e;", "a", "Lkotlin/Lazy;", d.f13160a, "()Lx0/e;", "DECODE_BUFFERS", "ALPHA_8_BYTES_PER_PIXEL", "I", "ARGB_4444_BYTES_PER_PIXEL", "ARGB_8888_BYTES_PER_PIXEL", "RGB_565_BYTES_PER_PIXEL", "RGBA_F16_BYTES_PER_PIXEL", "RGBA_1010102_BYTES_PER_PIXEL", "", "MAX_BITMAP_DIMENSION", "F", b.f37029b, "Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/facebook/imageutils/BitmapUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
/* loaded from: classes2.dex */
public final class BitmapUtil {
    public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
    public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
    public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final float MAX_BITMAP_DIMENSION = 2048.0f;
    public static final int RGBA_1010102_BYTES_PER_PIXEL = 4;
    public static final int RGBA_F16_BYTES_PER_PIXEL = 8;
    public static final int RGB_565_BYTES_PER_PIXEL = 2;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean useDecodeBufferHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean fixDecodeDrmImageCrash;

    @NotNull
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Lazy DECODE_BUFFERS = LazyKt.lazy(new Function0() { // from class: R7.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C6776e b10;
            b10 = BitmapUtil.b();
            return b10;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Bitmap.Config config;
            Bitmap.Config config2;
            Bitmap.Config config3;
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                config3 = Bitmap.Config.RGBA_F16;
                iArr[config3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                config2 = Bitmap.Config.RGBA_1010102;
                iArr[config2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                config = Bitmap.Config.HARDWARE;
                iArr[config.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final C6776e b() {
        return new C6776e(12);
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@Nullable byte[] bytes) {
        return decodeDimensions(new ByteArrayInputStream(bytes));
    }

    @JvmStatic
    @NotNull
    public static final ImageMetaData decodeDimensionsAndColorSpace(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BitmapUtil bitmapUtil = INSTANCE;
        ByteBuffer e10 = bitmapUtil.e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = e10.array();
            bitmapUtil.decodeStreamInternal(inputStream, null, options);
            ImageMetaData imageMetaData = new ImageMetaData(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            bitmapUtil.f(e10);
            return imageMetaData;
        } catch (Throwable th2) {
            INSTANCE.f(e10);
            throw th2;
        }
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final int getPixelSizeForBitmapConfig(@Nullable Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    @JvmStatic
    public static final int getSizeInByteForBitmap(int width, int height, @Nullable Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + width).toString());
        }
        if (height <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + height).toString());
        }
        int pixelSizeForBitmapConfig = getPixelSizeForBitmapConfig(bitmapConfig);
        int i10 = width * height * pixelSizeForBitmapConfig;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i10 + ", width: " + width + ", height: " + height + ", pixelSize: " + pixelSizeForBitmapConfig).toString());
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final int getSizeInBytes(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    @JvmStatic
    public static final void setFixDecodeDrmImageCrash(boolean fixDecodeDrmImageCrash2) {
        fixDecodeDrmImageCrash = fixDecodeDrmImageCrash2;
    }

    @JvmStatic
    public static final void setUseDecodeBufferHelper(boolean useDecodeBufferHelper2) {
        useDecodeBufferHelper = useDecodeBufferHelper2;
    }

    public final ByteBuffer c() {
        return useDecodeBufferHelper ? G6.b.f3898a.acquire() : (ByteBuffer) d().acquire();
    }

    public final C6776e d() {
        return (C6776e) DECODE_BUFFERS.getValue();
    }

    @Nullable
    public final Bitmap decodeStreamInternal(@Nullable InputStream inputStream, @Nullable Rect outPadding, @Nullable BitmapFactory.Options options) {
        if (!fixDecodeDrmImageCrash) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final ByteBuffer e() {
        ByteBuffer c10 = c();
        if (c10 != null) {
            return c10;
        }
        ByteBuffer allocate = ByteBuffer.allocate(G6.b.c());
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        return allocate;
    }

    public final void f(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        d().release(byteBuffer);
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@Nullable InputStream inputStream) {
        if (inputStream != null) {
            BitmapUtil bitmapUtil = INSTANCE;
            ByteBuffer e10 = bitmapUtil.e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = e10.array();
                Pair<Integer, Integer> pair = null;
                bitmapUtil.decodeStreamInternal(inputStream, null, options);
                if (options.outWidth != -1 && options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
                bitmapUtil.f(e10);
                return pair;
            } catch (Throwable th2) {
                INSTANCE.f(e10);
                throw th2;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}
