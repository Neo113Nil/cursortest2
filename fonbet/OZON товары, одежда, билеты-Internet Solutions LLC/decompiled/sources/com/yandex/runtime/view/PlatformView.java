package com.yandex.runtime.view;

import android.view.View;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public interface PlatformView {
    void destroyNativePlatformView();

    NativeObject getNativePlatformView();

    View getView();

    boolean isDebugModeEnabled();

    void onMemoryWarning();

    void pause();

    void resume();

    void setNoninteractive(boolean z11);

    void setOffscreenBufferEnabled(boolean z11);

    void start();

    void stop();
}
