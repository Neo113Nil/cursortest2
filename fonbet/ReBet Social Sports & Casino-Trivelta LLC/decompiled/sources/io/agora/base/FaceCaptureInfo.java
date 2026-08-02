package io.agora.base;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public final class FaceCaptureInfo implements IMetaInfo {
    public static final String TAG = "FaceCaptureInfo";
    private String mInfoStr;

    @CalledByNative
    public FaceCaptureInfo(String str) {
        this.mInfoStr = str;
    }

    @CalledByNative
    public static void addFaceCapInfoToFrame(FaceCaptureInfo faceCaptureInfo, VideoFrame videoFrame) {
        videoFrame.getMetaInfo().setCustomMetaInfo(new IMetaInfo[]{faceCaptureInfo});
    }

    @CalledByNative
    public static FaceCaptureInfo extractFaceCaptureInfoFromVideoFrame(VideoFrame videoFrame, int i10) {
        return (FaceCaptureInfo) videoFrame.getMetaInfo().getCustomMetaInfoAt(TAG, i10);
    }

    @Override // io.agora.base.IMetaInfo
    @CalledByNative
    public int getId() {
        return 0;
    }

    @CalledByNative
    public String getInfoStr() {
        return this.mInfoStr;
    }

    @Override // io.agora.base.IMetaInfo
    @CalledByNative
    public String getTag() {
        return TAG;
    }

    public String toString() {
        return this.mInfoStr;
    }
}
