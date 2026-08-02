package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface LottieAnimationViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void pause(T t10);

    void play(T t10, int i10, int i11);

    void reset(T t10);

    void resume(T t10);

    void setAutoPlay(T t10, boolean z10);

    void setCacheComposition(T t10, boolean z10);

    void setColorFilters(T t10, ReadableArray readableArray);

    void setDummy(T t10, ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(T t10, boolean z10);

    void setEnableSafeModeAndroid(T t10, boolean z10);

    void setHardwareAccelerationAndroid(T t10, boolean z10);

    void setImageAssetsFolder(T t10, String str);

    void setLoop(T t10, boolean z10);

    void setProgress(T t10, float f10);

    void setRenderMode(T t10, String str);

    void setResizeMode(T t10, String str);

    void setSourceDotLottieURI(T t10, String str);

    void setSourceJson(T t10, String str);

    void setSourceName(T t10, String str);

    void setSourceURL(T t10, String str);

    void setSpeed(T t10, double d10);

    void setTextFiltersAndroid(T t10, ReadableArray readableArray);

    void setTextFiltersIOS(T t10, ReadableArray readableArray);
}
