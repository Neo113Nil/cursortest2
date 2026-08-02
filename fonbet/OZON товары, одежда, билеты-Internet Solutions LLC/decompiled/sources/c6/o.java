package c6;

import Am.C2438a;
import J0.P;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import c6.n;
import c6.u;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final T5.h<T5.b> f56570f = T5.h.c(T5.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final T5.h<T5.j> f56571g = T5.h.d("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final T5.h<n> f56572h = n.f56568h;

    /* renamed from: i, reason: collision with root package name */
    public static final T5.h<Boolean> f56573i;

    /* renamed from: j, reason: collision with root package name */
    public static final T5.h<Boolean> f56574j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<String> f56575k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f56576l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f56577m;

    /* renamed from: n, reason: collision with root package name */
    private static final ArrayDeque f56578n;

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f56579a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f56580b;

    /* renamed from: c, reason: collision with root package name */
    private final W5.b f56581c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f56582d;

    /* renamed from: e, reason: collision with root package name */
    private final t f56583e = t.a();

    final class a implements b {
        @Override // c6.o.b
        public final void a() {
        }

        @Override // c6.o.b
        public final void b(W5.d dVar, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(W5.d dVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f56573i = T5.h.c(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f56574j = T5.h.c(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f56575k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f56576l = new a();
        f56577m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        int i11 = p6.l.f80283d;
        f56578n = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, W5.d dVar, W5.b bVar) {
        this.f56582d = arrayList;
        p6.k.c(displayMetrics, "Argument must not be null");
        this.f56580b = displayMetrics;
        p6.k.c(dVar, "Argument must not be null");
        this.f56579a = dVar;
        p6.k.c(bVar, "Argument must not be null");
        this.f56581c = bVar;
    }

    private C5753e b(u uVar, int i11, int i12, T5.i iVar, b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f56581c.b(65536, byte[].class);
        synchronized (o.class) {
            arrayDeque = f56578n;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                h(options);
            }
        }
        options.inTempStorage = bArr;
        T5.b bVar2 = (T5.b) iVar.a(f56570f);
        T5.j jVar = (T5.j) iVar.a(f56571g);
        n nVar = (n) iVar.a(n.f56568h);
        boolean booleanValue = ((Boolean) iVar.a(f56573i)).booleanValue();
        T5.h<Boolean> hVar = f56574j;
        try {
            C5753e c11 = C5753e.c(this.f56579a, e(uVar, options, nVar, bVar2, jVar, iVar.a(hVar) != null && ((Boolean) iVar.a(hVar)).booleanValue(), i11, i12, booleanValue, bVar));
            h(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f56581c.a(bArr);
            return c11;
        } catch (Throwable th2) {
            h(options);
            ArrayDeque arrayDeque2 = f56578n;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f56581c.a(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0450 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap e(u uVar, BitmapFactory.Options options, n nVar, T5.b bVar, T5.j jVar, boolean z11, int i11, int i12, boolean z12, b bVar2) throws IOException {
        int i13;
        int i14;
        boolean z13;
        String str;
        W5.d dVar;
        int i15;
        boolean z14;
        boolean z15;
        String str2;
        int i16;
        W5.d dVar2;
        Bitmap f7;
        ColorSpace colorSpace;
        Bitmap.Config config;
        String str3;
        int i17;
        int i18;
        int floor;
        int floor2;
        int i19 = i11;
        int i21 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        W5.d dVar3 = this.f56579a;
        f(uVar, options, bVar2, dVar3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i22 = iArr[0];
        int i23 = iArr[1];
        String str4 = options.outMimeType;
        boolean z16 = (i22 == -1 || i23 == -1) ? false : z11;
        int b11 = uVar.b();
        switch (b11) {
            case 3:
            case 4:
                i13 = 180;
                break;
            case 5:
            case 6:
                i13 = 90;
                break;
            case 7:
            case 8:
                i13 = 270;
                break;
            default:
                i13 = 0;
                break;
        }
        switch (b11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i14 = b11;
                z13 = true;
                break;
            default:
                i14 = b11;
                z13 = false;
                break;
        }
        int i24 = LinearLayoutManager.INVALID_OFFSET;
        if (i19 == Integer.MIN_VALUE) {
            if (i13 != 90 && i13 != 270) {
                i19 = i22;
                i24 = LinearLayoutManager.INVALID_OFFSET;
            }
            i19 = i23;
            i24 = LinearLayoutManager.INVALID_OFFSET;
        }
        int i25 = i12 == i24 ? (i13 == 90 || i13 == 270) ? i22 : i23 : i12;
        ImageHeaderParser.ImageType d11 = uVar.d();
        String str5 = ", density: ";
        boolean z17 = z16;
        boolean z18 = z13;
        if (i22 <= 0 || i23 <= 0) {
            str = ", target density: ";
            dVar = dVar3;
            i15 = i22;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + d11 + " with target [" + i19 + "x" + i25 + "]");
            }
        } else {
            if (i13 == 90 || i13 == 270) {
                str3 = ", density: ";
                i17 = i23;
                i18 = i22;
            } else {
                str3 = ", density: ";
                i18 = i23;
                i17 = i22;
            }
            float b12 = nVar.b(i17, i18, i19, i25);
            if (b12 <= 0.0f) {
                StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
                sb2.append(b12);
                sb2.append(" from: ");
                sb2.append(nVar);
                sb2.append(", source: [");
                Ek.a.f(i22, i23, "x", "], target: [", sb2);
                throw new IllegalArgumentException(P.a(i19, i25, "x", "]", sb2));
            }
            n.g a11 = nVar.a(i17, i18, i19, i25);
            if (a11 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i26 = i13;
            float f11 = i17;
            int i27 = i17;
            float f12 = i18;
            int i28 = i27 / ((int) ((b12 * f11) + 0.5d));
            int i29 = i18 / ((int) ((b12 * f12) + 0.5d));
            n.g gVar = n.g.MEMORY;
            int max = Math.max(1, Integer.highestOneBit(a11 == gVar ? Math.max(i28, i29) : Math.min(i28, i29)));
            if (a11 == gVar && max < 1.0f / b12) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (d11 == ImageHeaderParser.ImageType.JPEG) {
                float min = Math.min(max, 8);
                floor = (int) Math.ceil(f11 / min);
                floor2 = (int) Math.ceil(f12 / min);
                int i31 = max / 8;
                if (i31 > 0) {
                    floor /= i31;
                    floor2 /= i31;
                }
            } else if (d11 == ImageHeaderParser.ImageType.PNG || d11 == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = max;
                floor = (int) Math.floor(f11 / f13);
                floor2 = (int) Math.floor(f12 / f13);
            } else if (d11.isWebp()) {
                float f14 = max;
                floor = Math.round(f11 / f14);
                floor2 = Math.round(f12 / f14);
            } else if (i27 % max == 0 && i18 % max == 0) {
                floor = i27 / max;
                floor2 = i18 / max;
            } else {
                options.inJustDecodeBounds = true;
                f(uVar, options, bVar2, dVar3);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                floor = iArr2[0];
                floor2 = iArr2[1];
            }
            double b13 = nVar.b(floor, floor2, i19, i25);
            options.inTargetDensity = (int) (((b13 / (r13 / r12)) * ((int) ((((int) Math.round((b13 <= 1.0d ? b13 : 1.0d / b13) * 2.147483647E9d)) * b13) + 0.5d))) + 0.5d);
            int round = (int) Math.round((b13 <= 1.0d ? b13 : 1.0d / b13) * 2.147483647E9d);
            options.inDensity = round;
            int i32 = options.inTargetDensity;
            if (i32 <= 0 || round <= 0 || i32 == round) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                i15 = i22;
                i23 = i23;
                StringBuilder a12 = C2438a.a("Calculate scaling, source: [", i15, "x", "], degreesToRotate: ", i23);
                Ek.a.f(i26, i19, ", target: [", "x", a12);
                Ek.a.f(i25, floor, "], power of two scaled: [", "x", a12);
                a12.append(floor2);
                a12.append("], exact scale factor: ");
                a12.append(b12);
                a12.append(", power of 2 sample size: ");
                a12.append(max);
                a12.append(", adjusted scale factor: ");
                dVar = dVar3;
                a12.append(b13);
                str = ", target density: ";
                a12.append(str);
                a12.append(options.inTargetDensity);
                str5 = str3;
                a12.append(str5);
                a12.append(options.inDensity);
                Log.v("Downsampler", a12.toString());
            } else {
                dVar = dVar3;
                str5 = str3;
                str = ", target density: ";
                i15 = i22;
                i23 = i23;
            }
        }
        boolean c11 = this.f56583e.c(i19, i25, z17, z18);
        if (c11) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!c11) {
            if (bVar != T5.b.PREFER_ARGB_8888) {
                try {
                    z14 = uVar.d().hasAlpha();
                } catch (IOException e11) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e11);
                    }
                    z14 = false;
                }
                Bitmap.Config config2 = z14 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    z15 = true;
                    options.inDither = true;
                }
            } else {
                z15 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            int i33 = Build.VERSION.SDK_INT;
            if (i15 >= 0 || i23 < 0 || !z12) {
                int i34 = options.inTargetDensity;
                float f15 = (i34 > 0 || (i16 = options.inDensity) <= 0 || i34 == i16) ? false : z15 ? i34 / options.inDensity : 1.0f;
                int i35 = options.inSampleSize;
                float f16 = i35;
                int ceil = (int) Math.ceil(i15 / f16);
                str2 = str;
                int ceil2 = (int) Math.ceil(i23 / f16);
                int round2 = Math.round(ceil * f15);
                int round3 = Math.round(ceil2 * f15);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder a13 = C2438a.a("Calculated target [", round2, "x", "] for source [", round3);
                    Ek.a.f(i15, i23, "x", "], sampleSize: ", a13);
                    a13.append(i35);
                    a13.append(", targetDensity: ");
                    a13.append(options.inTargetDensity);
                    a13.append(str5);
                    a13.append(options.inDensity);
                    a13.append(", density multiplier: ");
                    a13.append(f15);
                    Log.v("Downsampler", a13.toString());
                }
                i25 = round3;
                i19 = round2;
            } else {
                str2 = str;
            }
            if (i19 > 0 || i25 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
                dVar2 = dVar;
            } else {
                Bitmap.Config config3 = options.outConfig;
                if (config3 != null) {
                    config = config3;
                }
                dVar2 = dVar;
                options.inBitmap = dVar2.d(i19, i25, config);
            }
            if (jVar != null) {
                if (i33 >= 28) {
                    options.inPreferredColorSpace = ColorSpace.get(jVar == T5.j.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                } else {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            f7 = f(uVar, options, bVar2, dVar2);
            bVar2.b(dVar2, f7);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sb3 = new StringBuilder("Decoded ");
                Pk0.g.d(i15, g(f7), " from [", "x", sb3);
                Pk0.i.c(i23, "] ", str4, " with inBitmap ", sb3);
                Pk0.g.d(i11, g(options.inBitmap), " for [", "x", sb3);
                sb3.append(i12);
                sb3.append("], sample size: ");
                sb3.append(options.inSampleSize);
                sb3.append(str5);
                sb3.append(options.inDensity);
                sb3.append(str2);
                sb3.append(options.inTargetDensity);
                sb3.append(", thread: ");
                sb3.append(Thread.currentThread().getName());
                sb3.append(", duration: ");
                sb3.append(p6.g.a(elapsedRealtimeNanos));
                Log.v("Downsampler", sb3.toString());
            }
            if (f7 != null) {
                return null;
            }
            f7.setDensity(this.f56580b.densityDpi);
            Bitmap g10 = C.g(dVar2, f7, i14);
            if (f7.equals(g10)) {
                return g10;
            }
            dVar2.c(f7);
            return g10;
        }
        z15 = true;
        int i332 = Build.VERSION.SDK_INT;
        if (i15 >= 0) {
        }
        int i342 = options.inTargetDensity;
        float f152 = (i342 > 0 || (i16 = options.inDensity) <= 0 || i342 == i16) ? false : z15 ? i342 / options.inDensity : 1.0f;
        int i352 = options.inSampleSize;
        float f162 = i352;
        int ceil3 = (int) Math.ceil(i15 / f162);
        str2 = str;
        int ceil22 = (int) Math.ceil(i23 / f162);
        int round22 = Math.round(ceil3 * f152);
        int round32 = Math.round(ceil22 * f152);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        i25 = round32;
        i19 = round22;
        if (i19 > 0) {
        }
        dVar2 = dVar;
        if (jVar != null) {
        }
        f7 = f(uVar, options, bVar2, dVar2);
        bVar2.b(dVar2, f7);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (f7 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap f(u uVar, BitmapFactory.Options options, b bVar, W5.d dVar) throws IOException {
        Bitmap f7;
        if (!options.inJustDecodeBounds) {
            bVar.a();
            uVar.a();
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        C.f().lock();
        try {
            try {
                f7 = uVar.c(options);
            } catch (IllegalArgumentException e11) {
                StringBuilder a11 = C2438a.a("Exception decoding bitmap, outWidth: ", i11, ", outHeight: ", ", outMimeType: ", i12);
                a11.append(str);
                a11.append(", inBitmap: ");
                a11.append(g(options.inBitmap));
                IOException iOException = new IOException(a11.toString(), e11);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    dVar.c(bitmap);
                    options.inBitmap = null;
                    f7 = f(uVar, options, bVar, dVar);
                } catch (IOException unused) {
                    throw iOException;
                }
            }
            return f7;
        } finally {
            C.f().unlock();
        }
    }

    @TargetApi(19)
    private static String g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static void h(BitmapFactory.Options options) {
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

    public final C5753e a(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, T5.i iVar) throws IOException {
        return b(new u.c(parcelFileDescriptor, this.f56582d, this.f56581c), i11, i12, iVar, f56576l);
    }

    public final C5753e c(ByteBuffer byteBuffer, int i11, int i12, T5.i iVar) throws IOException {
        return b(new u.a(byteBuffer, this.f56582d, this.f56581c), i11, i12, iVar, f56576l);
    }

    public final C5753e d(p6.i iVar, int i11, int i12, T5.i iVar2, b bVar) throws IOException {
        return b(new u.b(iVar, this.f56582d, this.f56581c), i11, i12, iVar2, bVar);
    }
}
