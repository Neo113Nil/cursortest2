package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes6.dex */
public interface RNLinearGradientManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAngle(T t, float f);

    void setAngleCenter(T t, ReadableMap readableMap);

    void setBorderRadii(T t, ReadableArray readableArray);

    void setColors(T t, ReadableArray readableArray);

    void setEndPoint(T t, ReadableMap readableMap);

    void setLocations(T t, ReadableArray readableArray);

    void setStartPoint(T t, ReadableMap readableMap);

    void setUseAngle(T t, boolean z);
}
