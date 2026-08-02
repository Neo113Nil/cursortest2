package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface AndroidSwitchManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setDisabled(T t10, boolean z10);

    void setEnabled(T t10, boolean z10);

    void setNativeValue(T t10, boolean z10);

    void setOn(T t10, boolean z10);

    void setThumbColor(T t10, Integer num);

    void setThumbTintColor(T t10, Integer num);

    void setTrackColorForFalse(T t10, Integer num);

    void setTrackColorForTrue(T t10, Integer num);

    void setTrackTintColor(T t10, Integer num);

    void setValue(T t10, boolean z10);
}
