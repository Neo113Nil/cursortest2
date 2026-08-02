package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSVGFeMergeManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setHeight(T t10, Dynamic dynamic);

    void setNodes(T t10, ReadableArray readableArray);

    void setResult(T t10, String str);

    void setWidth(T t10, Dynamic dynamic);

    void setX(T t10, Dynamic dynamic);

    void setY(T t10, Dynamic dynamic);
}
