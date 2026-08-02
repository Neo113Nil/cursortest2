package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface DebuggingOverlayManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void clearElementsHighlights(T t10);

    void highlightElements(T t10, ReadableArray readableArray);

    void highlightTraceUpdates(T t10, ReadableArray readableArray);
}
