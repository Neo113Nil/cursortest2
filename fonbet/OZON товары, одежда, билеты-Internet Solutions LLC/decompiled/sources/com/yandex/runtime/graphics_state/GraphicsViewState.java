package com.yandex.runtime.graphics_state;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class GraphicsViewState {
    public static native void logViewCreateAttempt(@NonNull GraphicsViewType graphicsViewType);

    public static native boolean viewCreateAttempted(@NonNull GraphicsViewType graphicsViewType);
}
