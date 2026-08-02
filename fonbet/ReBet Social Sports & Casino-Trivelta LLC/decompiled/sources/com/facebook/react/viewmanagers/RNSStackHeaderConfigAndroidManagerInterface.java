package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSStackHeaderConfigAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBackButtonDrawableIconResourceName(T t10, String str);

    void setBackButtonHidden(T t10, boolean z10);

    void setBackButtonImageIconResource(T t10, ReadableMap readableMap);

    void setBackButtonTintColor(T t10, Integer num);

    void setHidden(T t10, boolean z10);

    void setScrollFlagEnterAlways(T t10, boolean z10);

    void setScrollFlagEnterAlwaysCollapsed(T t10, boolean z10);

    void setScrollFlagExitUntilCollapsed(T t10, boolean z10);

    void setScrollFlagScroll(T t10, boolean z10);

    void setScrollFlagSnap(T t10, boolean z10);

    void setTitle(T t10, String str);

    void setTransparent(T t10, boolean z10);

    void setType(T t10, String str);
}
