package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSVGDefsManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setClipPath(T t10, String str);

    void setClipRule(T t10, int i10);

    void setDisplay(T t10, String str);

    void setMarkerEnd(T t10, String str);

    void setMarkerMid(T t10, String str);

    void setMarkerStart(T t10, String str);

    void setMask(T t10, String str);

    void setMatrix(T t10, ReadableArray readableArray);

    void setName(T t10, String str);

    void setOpacity(T t10, float f10);

    void setPointerEvents(T t10, String str);

    void setResponsible(T t10, boolean z10);
}
