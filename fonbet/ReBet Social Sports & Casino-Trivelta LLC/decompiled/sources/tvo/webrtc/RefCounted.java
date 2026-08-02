package tvo.webrtc;

/* loaded from: classes5.dex */
public interface RefCounted {
    @CalledByNative
    void release();

    @CalledByNative
    void retain();
}
