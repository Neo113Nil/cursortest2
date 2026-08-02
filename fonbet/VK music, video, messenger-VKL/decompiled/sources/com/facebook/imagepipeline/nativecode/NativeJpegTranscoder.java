package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import com.facebook.common.internal.ImmutableList;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import xsna.emw;
import xsna.eng0;
import xsna.fmw;
import xsna.hgl;
import xsna.k15;
import xsna.rip;
import xsna.sex0;
import xsna.siw;
import xsna.x9g0;
import xsna.y0y;
import xsna.yvf;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class NativeJpegTranscoder implements fmw {
    public static final String TAG = "NativeJpegTranscoder";
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
        if (z3) {
            NativeJpegTranscoderSoLoader.ensure();
        }
    }

    @zsn
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @zsn
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        NativeJpegTranscoderSoLoader.ensure();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        ImmutableList<Integer> immutableList = y0y.a;
        if (!(i >= 0 && i <= 270 && i % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        sex0.b("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        NativeJpegTranscoderSoLoader.ensure();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        ImmutableList<Integer> immutableList = y0y.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        sex0.b("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @Override // xsna.fmw
    public boolean canResize(rip ripVar, eng0 eng0Var, x9g0 x9g0Var) {
        if (eng0Var == null) {
            eng0Var = eng0.c;
        }
        return y0y.c(eng0Var, x9g0Var, ripVar, this.mResizingEnabled) < 8;
    }

    @Override // xsna.fmw
    public boolean canTranscode(siw siwVar) {
        return siwVar == hgl.a;
    }

    @Override // xsna.fmw
    public String getIdentifier() {
        return TAG;
    }

    @Override // xsna.fmw
    public emw transcode(rip ripVar, OutputStream outputStream, eng0 eng0Var, x9g0 x9g0Var, siw siwVar, Integer num, ColorSpace colorSpace) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (eng0Var == null) {
            eng0Var = eng0.c;
        }
        int p = k15.p(eng0Var, x9g0Var, ripVar, this.mMaxBitmapSize);
        try {
            int c = y0y.c(eng0Var, x9g0Var, ripVar, this.mResizingEnabled);
            int max = Math.max(1, 8 / p);
            if (this.mUseDownsamplingRatio) {
                c = max;
            }
            InputStream p2 = ripVar.p();
            ImmutableList<Integer> immutableList = y0y.a;
            ripVar.y();
            if (immutableList.contains(Integer.valueOf(ripVar.e))) {
                int a = y0y.a(eng0Var, ripVar);
                sex0.e(p2, "Cannot transcode from null input stream!");
                transcodeJpegWithExifOrientation(p2, outputStream, a, c, num.intValue());
            } else {
                int b = y0y.b(eng0Var, ripVar);
                sex0.e(p2, "Cannot transcode from null input stream!");
                transcodeJpeg(p2, outputStream, b, c, num.intValue());
            }
            yvf.b(p2);
            return new emw(p != 1 ? 0 : 1);
        } catch (Throwable th) {
            yvf.b(null);
            throw th;
        }
    }
}
