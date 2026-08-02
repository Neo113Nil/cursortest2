package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface IVideoEncodedFrameObserver {
    @CalledByNative
    boolean onEncodedVideoFrameReceived(String str, int i10, ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo);
}
