package com.facebook.imagepipeline.nativecode;

import B7.i;
import D6.p;
import G6.h;
import H7.k;
import K7.C1367h;
import K7.C1368i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.soloader.InterfaceC3115g;
import java.util.Locale;

@D6.d
/* loaded from: classes2.dex */
public abstract class DalvikPurgeableDecoder implements L7.d {
    protected static final byte[] EOI;

    /* renamed from: a, reason: collision with root package name */
    public final C1367h f30585a = C1368i.a();

    @InterfaceC3115g
    public static class OreoUtils {
        private OreoUtils() {
        }

        public static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            ColorSpace.Named named;
            if (colorSpace == null) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        EOI = new byte[]{-1, -39};
    }

    public static boolean e(H6.a aVar, int i10) {
        h hVar = (h) aVar.z0();
        return i10 >= 2 && hVar.s(i10 + (-2)) == -1 && hVar.s(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    @D6.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // L7.d
    public H6.a a(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(kVar.n1(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        H6.a J10 = kVar.J();
        D6.k.g(J10);
        try {
            return g(c(J10, f10));
        } finally {
            H6.a.U(J10);
        }
    }

    @Override // L7.d
    public H6.a b(k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(kVar.n1(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        H6.a J10 = kVar.J();
        D6.k.g(J10);
        try {
            return g(d(J10, i10, f10));
        } finally {
            H6.a.U(J10);
        }
    }

    public abstract Bitmap c(H6.a aVar, BitmapFactory.Options options);

    public abstract Bitmap d(H6.a aVar, int i10, BitmapFactory.Options options);

    public H6.a g(Bitmap bitmap) {
        D6.k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f30585a.g(bitmap)) {
                return H6.a.n1(bitmap, this.f30585a.e());
            }
            int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(sizeInBytes), Integer.valueOf(this.f30585a.b()), Long.valueOf(this.f30585a.f()), Integer.valueOf(this.f30585a.c()), Integer.valueOf(this.f30585a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}
