package com.yandex.runtime.view.internal;

import android.view.MotionEvent;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.internal.ArchiveWriter;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class PlatformViewBinding {
    private static final String LOG_TAG = "PlatformViewBinding";
    private NativeObject nativeObject;
    private boolean noninteractive = false;
    private ArchiveWriter touchEventWriter = new ArchiveWriter();

    public PlatformViewBinding(PlatformGLRenderer platformGLRenderer, int i11, int i12) {
        this.nativeObject = createGLNative(platformGLRenderer, i11, i12);
    }

    private static native NativeObject createGLNative(PlatformGLRenderer platformGLRenderer, int i11, int i12);

    private static native NativeObject createVulkanNative(PlatformVulkanRenderer platformVulkanRenderer, int i11, int i12);

    private native void onSerializedTouchEventNative(ByteBuffer byteBuffer, int i11);

    public void destroyNative() {
        this.nativeObject.reset();
    }

    public NativeObject getNative() {
        return this.nativeObject;
    }

    public native void onContextCreated();

    public native void onMemoryWarning();

    public native void onPause();

    public native void onResume();

    public native void onSizeChanged(int i11, int i12);

    public native void onStart(int i11, int i12);

    public native void onStop();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.noninteractive || !TouchEvent.isTouchEvent(motionEvent) || this.nativeObject.isEmpty()) {
            return false;
        }
        TouchEvent.serialize(motionEvent, this.touchEventWriter);
        ByteBuffer data = this.touchEventWriter.data();
        onSerializedTouchEventNative(data, data.position());
        data.clear();
        return true;
    }

    public native void requestRenderNative();

    public void setNoninteractive(boolean z11) {
        this.noninteractive = z11;
    }

    public native void setOffscreenBufferEnabled(boolean z11);

    public PlatformViewBinding(PlatformVulkanRenderer platformVulkanRenderer, int i11, int i12) {
        this.nativeObject = createVulkanNative(platformVulkanRenderer, i11, i12);
    }
}
