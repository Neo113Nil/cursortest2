package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.nativecode.StaticWebpNativeLoader;
import java.nio.ByteBuffer;
import xsna.liw;
import xsna.pk2;
import xsna.sex0;
import xsna.sk2;
import xsna.vk2;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class WebPImage implements pk2, sk2 {
    public Bitmap.Config a = null;

    @zsn
    private long mNativeContext;

    @zsn
    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // xsna.sk2
    public final pk2 a(ByteBuffer byteBuffer, liw liwVar) {
        StaticWebpNativeLoader.ensure();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (liwVar != null) {
            nativeCreateFromDirectByteBuffer.a = liwVar.c;
        }
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // xsna.sk2
    public final pk2 b(long j, int i, liw liwVar) {
        StaticWebpNativeLoader.ensure();
        sex0.a(Boolean.valueOf(j != 0));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (liwVar != null) {
            nativeCreateFromNativeMemory.a = liwVar.c;
        }
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
        return nativeGetLoopCount();
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
        return true;
    }

    @Override // xsna.pk2
    public final AnimatedDrawableFrameInfo y(int i) {
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        try {
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo = new AnimatedDrawableFrameInfo(nativeGetFrame.b(), nativeGetFrame.c(), nativeGetFrame.getWidth(), nativeGetFrame.getHeight(), nativeGetFrame.d() ? AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS : AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND, nativeGetFrame.e() ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
            nativeGetFrame.dispose();
            return animatedDrawableFrameInfo;
        } catch (Throwable th) {
            nativeGetFrame.dispose();
            throw th;
        }
    }

    @Override // xsna.pk2
    public final Bitmap.Config z() {
        return this.a;
    }

    @zsn
    public WebPImage(long j) {
        this.mNativeContext = j;
    }
}
