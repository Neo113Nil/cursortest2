package io.agora.rtc2.video;

import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface IVideoCapture {

    public interface Events {
        void onAvailable(int i10);

        void onError(int i10, String str);

        void onFrameCaptured(VideoFrame videoFrame);

        void onFrameDropped(int i10);

        void onI420FrameAvailable(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, long j10, VideoFrameMetaInfo videoFrameMetaInfo);

        void onStarted();
    }

    @CalledByNative
    boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat);

    @CalledByNative
    void deallocate();

    @CalledByNative
    void dispose();

    @CalledByNative
    VideoCaptureFormat getCaptureFormat();

    void setEventsCallback(Events events);

    @CalledByNative
    boolean startCaptureMaybeAsync();

    @CalledByNative
    void stopCaptureAndBlockUntilStopped();
}
