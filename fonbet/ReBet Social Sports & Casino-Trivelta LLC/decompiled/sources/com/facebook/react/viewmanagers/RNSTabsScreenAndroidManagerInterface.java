package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSTabsScreenAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBadgeValue(T t10, String str);

    void setDrawableIconResourceName(T t10, String str);

    void setImageIconResource(T t10, ReadableMap readableMap);

    void setPreventNativeSelection(T t10, boolean z10);

    void setScreenKey(T t10, String str);

    void setSelectedDrawableIconResourceName(T t10, String str);

    void setSelectedImageIconResource(T t10, ReadableMap readableMap);

    void setSpecialEffects(T t10, ReadableMap readableMap);

    void setStandardAppearance(T t10, ReadableMap readableMap);

    void setTabBarItemAccessibilityLabel(T t10, String str);

    void setTabBarItemTestID(T t10, String str);

    void setTitle(T t10, String str);
}
