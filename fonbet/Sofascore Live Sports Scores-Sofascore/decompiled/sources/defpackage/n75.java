package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n75 {
    public static final ivd f = ivd.a(rl4.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final ivd g = new ivd("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ivd.e);
    public static final ivd h;
    public static final ivd i;
    public static final wib j;
    public static final ArrayDeque k;
    public final dx1 a;
    public final DisplayMetrics b;
    public final kn4 c;
    public final ArrayList d;
    public final e79 e = e79.a();

    static {
        j75 j75Var = l75.a;
        Boolean bool = Boolean.FALSE;
        h = ivd.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = ivd.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new wib(21);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public n75(ArrayList arrayList, DisplayMetrics displayMetrics, dx1 dx1Var, kn4 kn4Var) {
        this.d = arrayList;
        w1a.m(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        w1a.m(dx1Var, "Argument must not be null");
        this.a = dx1Var;
        w1a.m(kn4Var, "Argument must not be null");
        this.c = kn4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(et9 et9Var, BitmapFactory.Options options, m75 m75Var, dx1 dx1Var) {
        if (!options.inJustDecodeBounds) {
            m75Var.p();
            et9Var.g();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = ewj.a;
        lock.lock();
        try {
            try {
                Bitmap e = et9Var.e(options);
                lock.unlock();
                return e;
            } catch (IllegalArgumentException e2) {
                StringBuilder s = lnb.s(i2, i3, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                s.append(str);
                s.append(", inBitmap: ");
                s.append(d(options.inBitmap));
                IOException iOException = new IOException(s.toString(), e2);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    dx1Var.i(bitmap);
                    options.inBitmap = null;
                    Bitmap c = c(et9Var, options, m75Var, dx1Var);
                    ewj.a.unlock();
                    return c;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            ewj.a.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return U3.j.d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
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

    public final ex1 a(et9 et9Var, int i2, int i3, uvd uvdVar, m75 m75Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.d(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        synchronized (n75.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        rl4 rl4Var = (rl4) uvdVar.c(f);
        p5f p5fVar = (p5f) uvdVar.c(g);
        l75 l75Var = (l75) uvdVar.c(l75.c);
        boolean booleanValue = ((Boolean) uvdVar.c(h)).booleanValue();
        ivd ivdVar = i;
        try {
            Bitmap b = b(et9Var, options, l75Var, rl4Var, p5fVar, uvdVar.c(ivdVar) != null && ((Boolean) uvdVar.c(ivdVar)).booleanValue(), i2, i3, booleanValue, m75Var);
            ex1 ex1Var = b == null ? null : new ex1(this.a, b);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.j(bArr);
            return ex1Var;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.j(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(et9 et9Var, BitmapFactory.Options options, l75 l75Var, rl4 rl4Var, p5f p5fVar, boolean z, int i2, int i3, boolean z2, m75 m75Var) {
        char c;
        boolean z3;
        int i4;
        boolean z4;
        float f2;
        String str;
        n75 n75Var;
        boolean c2;
        boolean z5;
        int i5;
        Bitmap c3;
        Bitmap createBitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i6;
        int i7;
        int floor;
        int floor2;
        int i8 = vib.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        dx1 dx1Var = this.a;
        c(et9Var, options, m75Var, dx1Var);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i9 = iArr[0];
        int i10 = iArr[1];
        boolean z6 = (i9 == -1 || i10 == -1) ? false : z;
        int h2 = et9Var.h();
        switch (h2) {
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
        switch (h2) {
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
        int i11 = i2;
        if (i11 != Integer.MIN_VALUE) {
            i4 = i3;
        } else if (c == 'Z' || c == 270) {
            i4 = i3;
            i11 = i10;
        } else {
            i4 = i3;
            i11 = i9;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = (c == 'Z' || c == 270) ? i9 : i10;
        }
        ImageHeaderParser$ImageType p = et9Var.p();
        if (i9 <= 0) {
            z4 = z6;
            f2 = 1.0f;
            str = "Downsampler";
        } else {
            if (i10 > 0) {
                f2 = 1.0f;
                if (c == 'Z' || c == 270) {
                    i6 = i10;
                    i7 = i9;
                } else {
                    i7 = i10;
                    i6 = i9;
                }
                float b = l75Var.b(i6, i7, i11, i4);
                if (b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                    sb.append(b);
                    sb.append(" from: ");
                    sb.append(l75Var);
                    sb.append(", source: [");
                    me4.q(sb, i9, "x", i10, "], target: [");
                    a70.p(me4.i(sb, i11, "x", i4, U3.j.e));
                    return null;
                }
                z4 = z6;
                int a = l75Var.a(i6, i7, i11, i4);
                if (a == 0) {
                    a70.p("Cannot round with null rounding");
                    return null;
                }
                float f3 = i6;
                int i12 = i6;
                float f4 = i7;
                int i13 = i12 / ((int) ((b * f3) + 0.5d));
                int i14 = i7 / ((int) ((b * f4) + 0.5d));
                int max = Math.max(1, Integer.highestOneBit(a == 1 ? Math.max(i13, i14) : Math.min(i13, i14)));
                if (a == 1 && max < 1.0f / b) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (p == ImageHeaderParser$ImageType.JPEG) {
                    float min = Math.min(max, 8);
                    floor = (int) Math.ceil(f3 / min);
                    floor2 = (int) Math.ceil(f4 / min);
                    int i15 = max / 8;
                    if (i15 > 0) {
                        floor /= i15;
                        floor2 /= i15;
                    }
                } else if (p == ImageHeaderParser$ImageType.PNG || p == ImageHeaderParser$ImageType.PNG_A) {
                    float f5 = max;
                    floor = (int) Math.floor(f3 / f5);
                    floor2 = (int) Math.floor(f4 / f5);
                } else if (p.isWebp()) {
                    float f6 = max;
                    floor = Math.round(f3 / f6);
                    floor2 = Math.round(f4 / f6);
                } else if (i12 % max == 0 && i7 % max == 0) {
                    floor = i12 / max;
                    floor2 = i7 / max;
                } else {
                    options.inJustDecodeBounds = true;
                    c(et9Var, options, m75Var, dx1Var);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    floor = iArr2[0];
                    floor2 = iArr2[1];
                }
                double b2 = l75Var.b(floor, floor2, i11, i4);
                options.inTargetDensity = (int) (((b2 / (r11 / r8)) * ((int) ((((int) Math.round((b2 <= 1.0d ? b2 : 1.0d / b2) * 2.147483647E9d)) * b2) + 0.5d))) + 0.5d);
                int round = (int) Math.round((b2 <= 1.0d ? b2 : 1.0d / b2) * 2.147483647E9d);
                options.inDensity = round;
                int i16 = options.inTargetDensity;
                if (i16 <= 0 || round <= 0 || i16 == round) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                n75Var = this;
                str = "Downsampler";
                c2 = n75Var.e.c(i11, i4, z4, z3);
                if (c2) {
                    z5 = false;
                } else {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z5 = false;
                    options.inMutable = false;
                }
                if (!c2) {
                    if (rl4Var != rl4.a) {
                        try {
                            z5 = et9Var.p().hasAlpha();
                        } catch (IOException unused) {
                            if (Log.isLoggable(str, 3)) {
                                Objects.toString(rl4Var);
                            }
                        }
                        Bitmap.Config config3 = z5 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                        options.inPreferredConfig = config3;
                        if (config3 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i9 >= 0 || i10 < 0 || !z2) {
                    int i17 = options.inTargetDensity;
                    float f7 = (i17 > 0 || (i5 = options.inDensity) <= 0 || i17 == i5) ? f2 : i17 / i5;
                    float f8 = options.inSampleSize;
                    int ceil = (int) Math.ceil(i9 / f8);
                    int ceil2 = (int) Math.ceil(i10 / f8);
                    int round2 = Math.round(ceil * f7);
                    i4 = Math.round(ceil2 * f7);
                    i11 = round2;
                }
                if (i11 > 0 && i4 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                    config2 = options.outConfig;
                    if (config2 != null) {
                        config = config2;
                    }
                    options.inBitmap = dx1Var.h(i11, i4, config);
                }
                if (p5fVar != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        options.inPreferredColorSpace = ColorSpace.get((p5fVar == p5f.a && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    } else {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                c3 = c(et9Var, options, m75Var, dx1Var);
                m75Var.r(dx1Var, c3);
                if (Log.isLoggable(str, 2)) {
                    d(c3);
                    d(options.inBitmap);
                    Thread.currentThread().getName();
                    SystemClock.elapsedRealtimeNanos();
                }
                if (c3 != null) {
                    return null;
                }
                c3.setDensity(n75Var.b.densityDpi);
                switch (h2) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix = new Matrix();
                        switch (h2) {
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
                        createBitmap = Bitmap.createBitmap(c3, 0, 0, c3.getWidth(), c3.getHeight(), matrix, true);
                        break;
                    default:
                        createBitmap = c3;
                        break;
                }
                if (!c3.equals(createBitmap)) {
                    dx1Var.i(c3);
                }
                return createBitmap;
            }
            z4 = z6;
            str = "Downsampler";
            f2 = 1.0f;
        }
        if (Log.isLoggable(str, 3)) {
            Objects.toString(p);
        }
        n75Var = this;
        c2 = n75Var.e.c(i11, i4, z4, z3);
        if (c2) {
        }
        if (!c2) {
        }
        if (i9 >= 0) {
        }
        int i172 = options.inTargetDensity;
        if (i172 > 0) {
        }
        float f82 = options.inSampleSize;
        int ceil3 = (int) Math.ceil(i9 / f82);
        int ceil22 = (int) Math.ceil(i10 / f82);
        int round22 = Math.round(ceil3 * f7);
        i4 = Math.round(ceil22 * f7);
        i11 = round22;
        if (i11 > 0) {
            config2 = options.outConfig;
            if (config2 != null) {
            }
            options.inBitmap = dx1Var.h(i11, i4, config);
        }
        if (p5fVar != null) {
        }
        c3 = c(et9Var, options, m75Var, dx1Var);
        m75Var.r(dx1Var, c3);
        if (Log.isLoggable(str, 2)) {
        }
        if (c3 != null) {
        }
    }
}
