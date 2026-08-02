package com.facebook.imagepipeline.nativecode;

import xsna.fmw;
import xsna.gmw;
import xsna.hgl;
import xsna.siw;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class NativeJpegTranscoderFactory implements gmw {
    private final boolean mEnsureTranscoderLibraryLoaded;
    private final int mMaxBitmapSize;
    private final boolean mUseDownSamplingRatio;

    @zsn
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.mMaxBitmapSize = i;
        this.mUseDownSamplingRatio = z;
        this.mEnsureTranscoderLibraryLoaded = z2;
    }

    @Override // xsna.gmw
    @zsn
    public fmw createImageTranscoder(siw siwVar, boolean z) {
        if (siwVar != hgl.a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.mMaxBitmapSize, this.mUseDownSamplingRatio, this.mEnsureTranscoderLibraryLoaded);
    }
}
