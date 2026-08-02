package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSTabsHostAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColorScheme(T t10, String str);

    void setNativeContainerBackgroundColor(T t10, Integer num);

    void setNavStateRequest(T t10, ReadableMap readableMap);

    void setRejectStaleNavStateUpdates(T t10, boolean z10);

    void setTabBarHidden(T t10, boolean z10);

    void setTabBarRespectsIMEInsets(T t10, boolean z10);
}
