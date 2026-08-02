package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface AndroidBlurViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAutoUpdate(T t10, boolean z10);

    void setBlurAmount(T t10, int i10);

    void setBlurRadius(T t10, int i10);

    void setBlurType(T t10, String str);

    void setDownsampleFactor(T t10, int i10);

    void setEnabled(T t10, boolean z10);

    void setOverlayColor(T t10, Integer num);
}
