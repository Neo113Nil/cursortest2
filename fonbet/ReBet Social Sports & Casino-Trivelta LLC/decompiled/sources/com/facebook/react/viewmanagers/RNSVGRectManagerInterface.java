package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSVGRectManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setClipPath(T t10, String str);

    void setClipRule(T t10, int i10);

    void setColor(T t10, Integer num);

    void setDisplay(T t10, String str);

    void setFill(T t10, Dynamic dynamic);

    void setFillOpacity(T t10, float f10);

    void setFillRule(T t10, int i10);

    void setFilter(T t10, String str);

    void setHeight(T t10, Dynamic dynamic);

    void setMarkerEnd(T t10, String str);

    void setMarkerMid(T t10, String str);

    void setMarkerStart(T t10, String str);

    void setMask(T t10, String str);

    void setMatrix(T t10, ReadableArray readableArray);

    void setName(T t10, String str);

    void setOpacity(T t10, float f10);

    void setPointerEvents(T t10, String str);

    void setPropList(T t10, ReadableArray readableArray);

    void setResponsible(T t10, boolean z10);

    void setRx(T t10, Dynamic dynamic);

    void setRy(T t10, Dynamic dynamic);

    void setStroke(T t10, Dynamic dynamic);

    void setStrokeDasharray(T t10, Dynamic dynamic);

    void setStrokeDashoffset(T t10, float f10);

    void setStrokeLinecap(T t10, int i10);

    void setStrokeLinejoin(T t10, int i10);

    void setStrokeMiterlimit(T t10, float f10);

    void setStrokeOpacity(T t10, float f10);

    void setStrokeWidth(T t10, Dynamic dynamic);

    void setVectorEffect(T t10, int i10);

    void setWidth(T t10, Dynamic dynamic);

    void setX(T t10, Dynamic dynamic);

    void setY(T t10, Dynamic dynamic);
}
