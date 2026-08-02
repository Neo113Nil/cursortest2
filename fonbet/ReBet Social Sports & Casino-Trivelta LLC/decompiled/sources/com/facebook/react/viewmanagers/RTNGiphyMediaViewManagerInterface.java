package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RTNGiphyMediaViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void pause(T t10);

    void resume(T t10);

    void setAutoPlay(T t10, boolean z10);

    void setMediaId(T t10, String str);

    void setRenditionType(T t10, String str);

    void setResizeMode(T t10, String str);

    void setShowCheckeredBackground(T t10, boolean z10);
}
