package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public interface IMediaRecorderCallback {
    @CalledByNative
    void onRecorderInfoUpdated(String str, int i10, RecorderInfo recorderInfo);

    @CalledByNative
    void onRecorderStateChanged(String str, int i10, int i11, int i12);
}
