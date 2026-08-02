package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface VirtualViewExperimentalManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialHidden(T t10, boolean z10);

    void setRemoveClippedSubviews(T t10, boolean z10);

    void setRenderState(T t10, int i10);
}
