package com.yandex.runtime.view.internal;

import android.view.Surface;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PlatformVulkanRenderer {
    private NativeObject nativeObject;

    public PlatformVulkanRenderer(boolean z11) {
        this.nativeObject = null;
        this.nativeObject = createNative(z11);
    }

    private static native NativeObject createNative(boolean z11);

    public native boolean isDebugModeEnabled();

    public native void surfaceChanged(Surface surface, int i11, int i12);

    public native void surfaceCreated(Surface surface, int i11, int i12);

    public native void surfaceDestroyed(Surface surface);
}
