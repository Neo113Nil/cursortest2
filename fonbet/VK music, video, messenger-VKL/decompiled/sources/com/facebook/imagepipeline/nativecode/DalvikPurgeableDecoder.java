package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.soloader.DoNotOptimize;
import java.util.Locale;
import xsna.id7;
import xsna.ita0;
import xsna.odj;
import xsna.qb7;
import xsna.rb7;
import xsna.rip;
import xsna.s200;
import xsna.uvf;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements ita0 {
    protected static final byte[] EOI;
    private final qb7 mUnpooledBitmapsCounter = rb7.a();

    @DoNotOptimize
    /* loaded from: classes12.dex */
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        public static void setColorSpace(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        ImagePipelineNativeLoader.load();
        EOI = new byte[]{-1, -39};
    }

    public static boolean endsWithEOI(uvf<PooledByteBuffer> uvfVar, int i) {
        PooledByteBuffer r = uvfVar.r();
        return i >= 2 && r.F(i + (-2)) == -1 && r.F(i - 1) == -39;
    }

    public static BitmapFactory.Options getBitmapFactoryOptions(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @zsn
    private static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, BitmapFactory.Options options);

    public uvf<Bitmap> decodeFromEncodedImage(rip ripVar, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(ripVar, config, rect, null);
    }

    @Override // xsna.ita0
    public uvf<Bitmap> decodeFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(ripVar.q(), config);
        OreoUtils.setColorSpace(bitmapFactoryOptions, colorSpace);
        uvf<PooledByteBuffer> m = ripVar.m();
        m.getClass();
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(m, bitmapFactoryOptions));
        } finally {
            uvf.q(m);
        }
    }

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, int i, BitmapFactory.Options options);

    public uvf<Bitmap> decodeJPEGFromEncodedImage(rip ripVar, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(ripVar, config, rect, i, null);
    }

    @Override // xsna.ita0
    public uvf<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(ripVar.q(), config);
        OreoUtils.setColorSpace(bitmapFactoryOptions, colorSpace);
        uvf<PooledByteBuffer> m = ripVar.m();
        m.getClass();
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(m, i, bitmapFactoryOptions));
        } finally {
            uvf.q(m);
        }
    }

    public uvf<Bitmap> pinBitmap(Bitmap bitmap) {
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.g(bitmap)) {
                return uvf.w(bitmap, this.mUnpooledBitmapsCounter.e());
            }
            int d = id7.d(bitmap);
            bitmap.recycle();
            Locale locale = Locale.US;
            int b = this.mUnpooledBitmapsCounter.b();
            long f = this.mUnpooledBitmapsCounter.f();
            int c = this.mUnpooledBitmapsCounter.c();
            int d2 = this.mUnpooledBitmapsCounter.d();
            StringBuilder a = odj.a(d, b, "Attempted to pin a bitmap of size ", " bytes. The current pool count is ", ", the current pool size is ");
            a.append(f);
            a.append(" bytes. The current pool max count is ");
            a.append(c);
            a.append(", the current pool max size is ");
            a.append(d2);
            a.append(" bytes.");
            throw new TooManyBitmapsException(a.toString());
        } catch (Exception e) {
            bitmap.recycle();
            s200.J(e);
            throw null;
        }
    }
}
