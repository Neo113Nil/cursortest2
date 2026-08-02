package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSScrollViewMarkerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBottomScrollEdgeEffect(T t10, String str);

    void setLeftScrollEdgeEffect(T t10, String str);

    void setRightScrollEdgeEffect(T t10, String str);

    void setTopScrollEdgeEffect(T t10, String str);
}
