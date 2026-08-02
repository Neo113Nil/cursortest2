package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import xsna.au80;
import xsna.auu;
import xsna.cgn;
import xsna.cl3;
import xsna.glp0;
import xsna.ht80;
import xsna.nr2;
import xsna.odj;
import xsna.rzl;
import xsna.s2r0;
import xsna.tc7;
import xsna.w000;
import xsna.wc7;

/* compiled from: Downsampler.java */
/* loaded from: classes12.dex */
public final class a {
    public static final ht80<DecodeFormat> f = ht80.a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final ht80<PreferredColorSpace> g = new ht80<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ht80.e);
    public static final ht80<Boolean> h;
    public static final ht80<Boolean> i;
    public static final Set<String> j;
    public static final C0100a k;
    public static final Set<ImageHeaderParser.ImageType> l;
    public static final ArrayDeque m;
    public final tc7 a;
    public final DisplayMetrics b;
    public final cl3 c;
    public final ArrayList d;
    public final auu e = auu.a();

    /* compiled from: Downsampler.java */
    public interface b {
        void a(Bitmap bitmap, tc7 tc7Var) throws IOException;

        void b();
    }

    static {
        DownsampleStrategy.e eVar = DownsampleStrategy.a;
        Boolean bool = Boolean.FALSE;
        h = ht80.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = ht80.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new C0100a();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = s2r0.a;
        m = new ArrayDeque(0);
    }

    public a(ArrayList arrayList, DisplayMetrics displayMetrics, tc7 tc7Var, cl3 cl3Var) {
        this.d = arrayList;
        nr2.r(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        nr2.r(tc7Var, "Argument must not be null");
        this.a = tc7Var;
        nr2.r(cl3Var, "Argument must not be null");
        this.c = cl3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, tc7 tc7Var) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar2.b();
            bVar.a();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = glp0.b;
        lock.lock();
        try {
            try {
                Bitmap b2 = bVar.b(options);
                lock.unlock();
                return b2;
            } catch (IllegalArgumentException e) {
                StringBuilder a = odj.a(i2, i3, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                a.append(str);
                a.append(", inBitmap: ");
                a.append(d(options.inBitmap));
                IOException iOException = new IOException(a.toString(), e);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    tc7Var.c(bitmap);
                    options.inBitmap = null;
                    Bitmap c = c(bVar, options, bVar2, tc7Var);
                    glp0.b.unlock();
                    return c;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            glp0.b.unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return X3.j.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final wc7 a(com.bumptech.glide.load.resource.bitmap.b bVar, int i2, int i3, au80 au80Var, b bVar2) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (a.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) au80Var.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) au80Var.c(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) au80Var.c(DownsampleStrategy.d);
        boolean booleanValue = ((Boolean) au80Var.c(h)).booleanValue();
        ht80<Boolean> ht80Var = i;
        try {
            wc7 c = wc7.c(b(bVar, options, downsampleStrategy, decodeFormat, preferredColorSpace, au80Var.c(ht80Var) != null && ((Boolean) au80Var.c(ht80Var)).booleanValue(), i2, i3, booleanValue, bVar2), this.a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.put(bArr);
            return c;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        char c;
        boolean z3;
        int i4;
        boolean z4;
        float f2;
        String str;
        int i5;
        a aVar;
        boolean c2;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        Bitmap c3;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i7;
        int i8;
        int floor;
        int floor2;
        int i9 = w000.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        tc7 tc7Var = this.a;
        c(bVar, options, bVar2, tc7Var);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i10 = iArr[0];
        int i11 = iArr[1];
        boolean z8 = (i10 == -1 || i11 == -1) ? false : z;
        int c4 = bVar.c();
        switch (c4) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (c4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i12 = i2;
        if (i12 != Integer.MIN_VALUE) {
            i4 = i3;
        } else if (c == 'Z' || c == 270) {
            i4 = i3;
            i12 = i11;
        } else {
            i4 = i3;
            i12 = i10;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = (c == 'Z' || c == 270) ? i10 : i11;
        }
        ImageHeaderParser.ImageType d = bVar.d();
        if (i10 <= 0) {
            z4 = z8;
            f2 = 1.0f;
            str = "Downsampler";
            i5 = 3;
        } else {
            if (i11 > 0) {
                f2 = 1.0f;
                if (c == 'Z' || c == 270) {
                    i7 = i11;
                    i8 = i10;
                } else {
                    i8 = i11;
                    i7 = i10;
                }
                float b2 = downsampleStrategy.b(i7, i8, i12, i4);
                if (b2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                    sb.append(b2);
                    sb.append(" from: ");
                    sb.append(downsampleStrategy);
                    sb.append(", source: [");
                    cgn.a(i10, i11, "x", "], target: [", sb);
                    throw new IllegalArgumentException(rzl.a(i12, i4, "x", X3.j.e, sb));
                }
                z4 = z8;
                DownsampleStrategy.SampleSizeRounding a = downsampleStrategy.a(i7, i8, i12, i4);
                if (a == null) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f3 = i7;
                int i13 = i7;
                float f4 = i8;
                int i14 = i13 / ((int) ((b2 * f3) + 0.5d));
                int i15 = i8 / ((int) ((b2 * f4) + 0.5d));
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                int max = Math.max(1, Integer.highestOneBit(a == sampleSizeRounding ? Math.max(i14, i15) : Math.min(i14, i15)));
                if (a == sampleSizeRounding && max < 1.0f / b2) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (d == ImageHeaderParser.ImageType.JPEG) {
                    float min = Math.min(max, 8);
                    floor = (int) Math.ceil(f3 / min);
                    floor2 = (int) Math.ceil(f4 / min);
                    int i16 = max / 8;
                    if (i16 > 0) {
                        floor /= i16;
                        floor2 /= i16;
                    }
                } else if (d == ImageHeaderParser.ImageType.PNG || d == ImageHeaderParser.ImageType.PNG_A) {
                    float f5 = max;
                    floor = (int) Math.floor(f3 / f5);
                    floor2 = (int) Math.floor(f4 / f5);
                } else if (d.isWebp()) {
                    float f6 = max;
                    floor = Math.round(f3 / f6);
                    floor2 = Math.round(f4 / f6);
                } else if (i13 % max == 0 && i8 % max == 0) {
                    floor = i13 / max;
                    floor2 = i8 / max;
                } else {
                    options.inJustDecodeBounds = true;
                    c(bVar, options, bVar2, tc7Var);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    floor = iArr2[0];
                    floor2 = iArr2[1];
                }
                double b3 = downsampleStrategy.b(floor, floor2, i12, i4);
                options.inTargetDensity = (int) (((b3 / (r11 / r8)) * ((int) ((((int) Math.round((b3 <= 1.0d ? b3 : 1.0d / b3) * 2.147483647E9d)) * b3) + 0.5d))) + 0.5d);
                int round = (int) Math.round((b3 <= 1.0d ? b3 : 1.0d / b3) * 2.147483647E9d);
                options.inDensity = round;
                int i17 = options.inTargetDensity;
                if (i17 <= 0 || round <= 0 || i17 == round) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                aVar = this;
                str = "Downsampler";
                c2 = aVar.e.c(i12, i4, z4, z3);
                if (c2) {
                    z5 = false;
                } else {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z5 = false;
                    options.inMutable = false;
                }
                if (!c2) {
                    if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                        try {
                            z6 = bVar.d().hasAlpha();
                        } catch (IOException unused) {
                            if (Log.isLoggable(str, 3)) {
                                Objects.toString(decodeFormat);
                            }
                            z6 = z5;
                        }
                        Bitmap.Config config3 = z6 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                        options.inPreferredConfig = config3;
                        if (config3 == Bitmap.Config.RGB_565) {
                            z7 = true;
                            options.inDither = true;
                        }
                    } else {
                        z7 = true;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (i10 >= 0 || i11 < 0 || !z2) {
                        int i18 = options.inTargetDensity;
                        float f7 = (i18 > 0 || (i6 = options.inDensity) <= 0 || i18 == i6) ? z5 : z7 ? i18 / options.inDensity : f2;
                        float f8 = options.inSampleSize;
                        int ceil = (int) Math.ceil(i10 / f8);
                        int ceil2 = (int) Math.ceil(i11 / f8);
                        int round2 = Math.round(ceil * f7);
                        i4 = Math.round(ceil2 * f7);
                        i12 = round2;
                    }
                    if (i12 > 0 && i4 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                        config2 = options.outConfig;
                        if (config2 != null) {
                            config = config2;
                        }
                        options.inBitmap = tc7Var.d(i12, i4, config);
                    }
                    if (preferredColorSpace != null) {
                        options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace != PreferredColorSpace.DISPLAY_P3 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) ? z5 : z7 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    }
                    c3 = c(bVar, options, bVar2, tc7Var);
                    bVar2.a(c3, tc7Var);
                    if (Log.isLoggable(str, 2)) {
                        d(c3);
                        d(options.inBitmap);
                        Thread.currentThread().getName();
                        SystemClock.elapsedRealtimeNanos();
                    }
                    Bitmap bitmap = null;
                    if (c3 != null) {
                        c3.setDensity(aVar.b.densityDpi);
                        switch (c4) {
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                Matrix matrix = new Matrix();
                                switch (c4) {
                                    case 2:
                                        matrix.setScale(-1.0f, f2);
                                        break;
                                    case 3:
                                        matrix.setRotate(180.0f);
                                        break;
                                    case 4:
                                        matrix.setRotate(180.0f);
                                        matrix.postScale(-1.0f, f2);
                                        break;
                                    case 5:
                                        matrix.setRotate(90.0f);
                                        matrix.postScale(-1.0f, f2);
                                        break;
                                    case 6:
                                        matrix.setRotate(90.0f);
                                        break;
                                    case 7:
                                        matrix.setRotate(-90.0f);
                                        matrix.postScale(-1.0f, f2);
                                        break;
                                    case 8:
                                        matrix.setRotate(-90.0f);
                                        break;
                                }
                                RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c3.getWidth(), c3.getHeight());
                                matrix.mapRect(rectF);
                                Bitmap e = tc7Var.e(Math.round(rectF.width()), Math.round(rectF.height()), c3.getConfig() != null ? c3.getConfig() : Bitmap.Config.ARGB_8888);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                e.setHasAlpha(c3.hasAlpha());
                                Lock lock = glp0.b;
                                lock.lock();
                                try {
                                    Canvas canvas = new Canvas(e);
                                    canvas.drawBitmap(c3, matrix, glp0.a);
                                    canvas.setBitmap(null);
                                    lock.unlock();
                                    bitmap = e;
                                    break;
                                } catch (Throwable th) {
                                    lock.unlock();
                                    throw th;
                                }
                            default:
                                bitmap = c3;
                                break;
                        }
                        if (!c3.equals(bitmap)) {
                            tc7Var.c(c3);
                        }
                    }
                    return bitmap;
                }
                z7 = true;
                if (i10 >= 0) {
                }
                int i182 = options.inTargetDensity;
                if ((i182 > 0 || (i6 = options.inDensity) <= 0 || i182 == i6) ? z5 : z7) {
                }
                float f82 = options.inSampleSize;
                int ceil3 = (int) Math.ceil(i10 / f82);
                int ceil22 = (int) Math.ceil(i11 / f82);
                int round22 = Math.round(ceil3 * f7);
                i4 = Math.round(ceil22 * f7);
                i12 = round22;
                if (i12 > 0) {
                    config2 = options.outConfig;
                    if (config2 != null) {
                    }
                    options.inBitmap = tc7Var.d(i12, i4, config);
                }
                if (preferredColorSpace != null) {
                }
                c3 = c(bVar, options, bVar2, tc7Var);
                bVar2.a(c3, tc7Var);
                if (Log.isLoggable(str, 2)) {
                }
                Bitmap bitmap2 = null;
                if (c3 != null) {
                }
                return bitmap2;
            }
            z4 = z8;
            str = "Downsampler";
            i5 = 3;
            f2 = 1.0f;
        }
        if (Log.isLoggable(str, i5)) {
            Objects.toString(d);
        }
        aVar = this;
        c2 = aVar.e.c(i12, i4, z4, z3);
        if (c2) {
        }
        if (!c2) {
        }
        z7 = true;
        if (i10 >= 0) {
        }
        int i1822 = options.inTargetDensity;
        if ((i1822 > 0 || (i6 = options.inDensity) <= 0 || i1822 == i6) ? z5 : z7) {
        }
        float f822 = options.inSampleSize;
        int ceil32 = (int) Math.ceil(i10 / f822);
        int ceil222 = (int) Math.ceil(i11 / f822);
        int round222 = Math.round(ceil32 * f7);
        i4 = Math.round(ceil222 * f7);
        i12 = round222;
        if (i12 > 0) {
        }
        if (preferredColorSpace != null) {
        }
        c3 = c(bVar, options, bVar2, tc7Var);
        bVar2.a(c3, tc7Var);
        if (Log.isLoggable(str, 2)) {
        }
        Bitmap bitmap22 = null;
        if (c3 != null) {
        }
        return bitmap22;
    }

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    public class C0100a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a(Bitmap bitmap, tc7 tc7Var) {
        }
    }
}
