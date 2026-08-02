package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.soloader.nativeloader.NativeLoader;
import java.nio.ByteBuffer;
import xsna.liw;
import xsna.pk2;
import xsna.sk2;
import xsna.vk2;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class GifImage implements pk2, sk2 {
    public static volatile boolean b;
    public Bitmap.Config a = null;

    @zsn
    private long mNativeContext;

    @zsn
    public GifImage() {
    }

    public static synchronized void c() {
        synchronized (GifImage.class) {
            if (!b) {
                b = true;
                NativeLoader.loadLibrary("gifimage");
            }
        }
    }

    @zsn
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @zsn
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @zsn
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @zsn
    private native void nativeDispose();

    @zsn
    private native void nativeFinalize();

    @zsn
    private native int nativeGetDuration();

    @zsn
    private native GifFrame nativeGetFrame(int i);

    @zsn
    private native int nativeGetFrameCount();

    @zsn
    private native int[] nativeGetFrameDurations();

    @zsn
    private native int nativeGetHeight();

    @zsn
    private native int nativeGetLoopCount();

    @zsn
    private native int nativeGetSizeInBytes();

    @zsn
    private native int nativeGetWidth();

    @zsn
    private native boolean nativeIsAnimated();

    @Override // xsna.sk2
    public final pk2 a(ByteBuffer byteBuffer, liw liwVar) {
        c();
        byteBuffer.rewind();
        liwVar.getClass();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, liwVar.a);
        nativeCreateFromDirectByteBuffer.a = liwVar.c;
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // xsna.sk2
    public final pk2 b(long j, int i, liw liwVar) {
        c();
        if (!(j != 0)) {
            throw new IllegalArgumentException();
        }
        liwVar.getClass();
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, liwVar.a);
        nativeCreateFromNativeMemory.a = liwVar.c;
        return nativeCreateFromNativeMemory;
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // xsna.pk2
    public final int getDuration() {
        return nativeGetDuration();
    }

    @Override // xsna.pk2
    public final int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // xsna.pk2
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // xsna.pk2
    public final int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // xsna.pk2
    public final int getWidth() {
        return nativeGetWidth();
    }

    @Override // xsna.pk2
    public final int u() {
        return nativeGetSizeInBytes();
    }

    @Override // xsna.pk2
    public final vk2 v(int i) {
        return nativeGetFrame(i);
    }

    @Override // xsna.pk2
    public final int[] w() {
        return nativeGetFrameDurations();
    }

    @Override // xsna.pk2
    public final boolean x() {
        return false;
    }

    @Override // xsna.pk2
    public final AnimatedDrawableFrameInfo y(int i) {
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int b2 = nativeGetFrame.b();
            int c = nativeGetFrame.c();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            AnimatedDrawableFrameInfo.BlendOperation blendOperation = AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS;
            int d = nativeGetFrame.d();
            return new AnimatedDrawableFrameInfo(b2, c, width, height, blendOperation, d == 0 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT : d == 1 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT : d == 2 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : d == 3 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    @Override // xsna.pk2
    public final Bitmap.Config z() {
        return this.a;
    }

    @zsn
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
