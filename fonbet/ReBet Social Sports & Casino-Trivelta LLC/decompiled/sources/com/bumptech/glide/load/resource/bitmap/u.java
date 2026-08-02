package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30052f = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.f29659c);

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30053g = com.bumptech.glide.load.i.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30054h = p.f30048h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30055i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30056j;

    /* renamed from: k, reason: collision with root package name */
    public static final Set f30057k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f30058l;

    /* renamed from: m, reason: collision with root package name */
    public static final Set f30059m;

    /* renamed from: n, reason: collision with root package name */
    public static final Queue f30060n;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f30061a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f30062b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f30063c;

    /* renamed from: d, reason: collision with root package name */
    public final List f30064d;

    /* renamed from: e, reason: collision with root package name */
    public final A f30065e = A.b();

    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b() {
        }
    }

    public interface b {
        void a(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f30055i = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f30056j = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f30057k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f30058l = new a();
        f30059m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f30060n = com.bumptech.glide.util.l.g(0);
    }

    public u(List list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f30064d = list;
        this.f30062b = (DisplayMetrics) com.bumptech.glide.util.k.d(displayMetrics);
        this.f30061a = (com.bumptech.glide.load.engine.bitmap_recycle.d) com.bumptech.glide.util.k.d(dVar);
        this.f30063c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
    }

    public static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    public static void c(ImageHeaderParser.ImageType imageType, B b10, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, p pVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int floor;
        int floor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float b11 = pVar.b(i15, i16, i13, i14);
        if (b11 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b11 + " from: " + pVar + ", source: [" + i11 + C5444x.f55808b + i12 + "], target: [" + i13 + C5444x.f55808b + i14 + "]");
        }
        p.g a10 = pVar.a(i15, i16, i13, i14);
        if (a10 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int x10 = i15 / x(b11 * f10);
        int x11 = i16 / x(b11 * f11);
        p.g gVar = p.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a10 == gVar ? Math.max(x10, x11) : Math.min(x10, x11)));
        if (a10 == gVar && max < 1.0f / b11) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f10 / min);
            floor2 = (int) Math.ceil(f11 / min);
            int i17 = max / 8;
            if (i17 > 0) {
                floor /= i17;
                floor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = max;
            floor = (int) Math.floor(f10 / f12);
            floor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = max;
            floor = Math.round(f10 / f13);
            floor2 = Math.round(f11 / f13);
        } else if (i15 % max == 0 && i16 % max == 0) {
            floor = i15 / max;
            floor2 = i16 / max;
        } else {
            int[] m10 = m(b10, options, bVar, dVar);
            floor = m10[0];
            floor2 = m10[1];
        }
        double b12 = pVar.b(floor, floor2, i13, i14);
        options.inTargetDensity = a(b12);
        options.inDensity = l(b12);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable("Downsampler", 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap i(B b10, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        Bitmap i10;
        if (!options.inJustDecodeBounds) {
            bVar.b();
            b10.b();
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        J.i().lock();
        try {
            try {
                i10 = b10.a(options);
            } catch (IllegalArgumentException e10) {
                IOException u10 = u(e10, i11, i12, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw u10;
                }
                try {
                    dVar.c(bitmap);
                    options.inBitmap = null;
                    i10 = i(b10, options, bVar, dVar);
                } catch (IOException unused) {
                    throw u10;
                }
            }
            return i10;
        } finally {
            J.i().unlock();
        }
    }

    public static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + C5444x.f55808b + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (u.class) {
            Queue queue = f30060n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    public static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] m(B b10, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        options.inJustDecodeBounds = true;
        i(b10, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    public static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    public static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        j(bitmap);
        n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        com.bumptech.glide.util.g.a(j10);
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f30060n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    public static void y(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, int i10, int i11) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            } else {
                config = options.outConfig;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    public final void b(B b10, com.bumptech.glide.load.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        if (this.f30065e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z12 = b10.d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(bVar);
            }
            z12 = false;
        }
        Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    public com.bumptech.glide.load.engine.v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return e(new B.c(parcelFileDescriptor, this.f30064d, this.f30063c), i10, i11, jVar, f30058l);
    }

    public final com.bumptech.glide.load.engine.v e(B b10, int i10, int i11, com.bumptech.glide.load.j jVar, b bVar) {
        byte[] bArr = (byte[]) this.f30063c.c(PKIFailureInfo.notAuthorized, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) jVar.c(f30052f);
        com.bumptech.glide.load.k kVar = (com.bumptech.glide.load.k) jVar.c(f30053g);
        p pVar = (p) jVar.c(p.f30048h);
        boolean booleanValue = ((Boolean) jVar.c(f30055i)).booleanValue();
        com.bumptech.glide.load.i iVar = f30056j;
        try {
            return C3003g.c(h(b10, k10, pVar, bVar2, kVar, jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f30061a);
        } finally {
            v(k10);
            this.f30063c.put(bArr);
        }
    }

    public com.bumptech.glide.load.engine.v f(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar, b bVar) {
        return e(new B.b(inputStream, this.f30064d, this.f30063c), i10, i11, jVar, bVar);
    }

    public com.bumptech.glide.load.engine.v g(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return e(new B.a(byteBuffer, this.f30064d, this.f30063c), i10, i11, jVar, f30058l);
    }

    public final Bitmap h(B b10, BitmapFactory.Options options, p pVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.k kVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int round;
        long b11 = com.bumptech.glide.util.g.b();
        int[] m10 = m(b10, options, bVar2, this.f30061a);
        int i13 = m10[0];
        int i14 = m10[1];
        String str2 = options.outMimeType;
        boolean z12 = (i13 == -1 || i14 == -1) ? false : z10;
        int c10 = b10.c();
        int j10 = J.j(c10);
        boolean m11 = J.m(c10);
        int i15 = i10;
        if (i15 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (r(j10)) {
            i12 = i11;
            i15 = i14;
        } else {
            i12 = i11;
            i15 = i13;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = r(j10) ? i13 : i14;
        }
        ImageHeaderParser.ImageType d10 = b10.d();
        c(d10, b10, bVar2, this.f30061a, pVar, j10, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        b(b10, bVar, z12, m11, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (z(d10)) {
            if (i13 < 0 || i14 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f11 = options.inSampleSize;
                int ceil = (int) Math.ceil(i13 / f11);
                int ceil2 = (int) Math.ceil(i14 / f11);
                round = Math.round(ceil * f10);
                int round2 = Math.round(ceil2 * f10);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i17 = round2;
            } else {
                round = i16;
                str = "Downsampler";
            }
            if (round > 0 && i17 > 0) {
                y(options, this.f30061a, round, i17);
            }
        } else {
            str = "Downsampler";
        }
        if (kVar != null) {
            if (i18 >= 28) {
                if (kVar == com.bumptech.glide.load.k.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i18 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap i19 = i(b10, options, bVar2, this.f30061a);
        bVar2.a(this.f30061a, i19);
        if (Log.isLoggable(str, 2)) {
            t(i13, i14, str2, options, i19, i10, i11, b11);
        }
        if (i19 == null) {
            return null;
        }
        i19.setDensity(this.f30062b.densityDpi);
        Bitmap n10 = J.n(this.f30061a, i19, c10);
        if (!i19.equals(n10)) {
            this.f30061a.c(i19);
        }
        return n10;
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
