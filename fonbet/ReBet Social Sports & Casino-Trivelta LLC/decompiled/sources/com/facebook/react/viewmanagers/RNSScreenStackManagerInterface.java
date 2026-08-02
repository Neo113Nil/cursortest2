package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSScreenStackManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setIosPreventReattachmentOfDismissedModals(T t10, boolean z10);

    void setIosPreventReattachmentOfDismissedScreens(T t10, boolean z10);

    void setNativeContainerBackgroundColor(T t10, Integer num);
}
