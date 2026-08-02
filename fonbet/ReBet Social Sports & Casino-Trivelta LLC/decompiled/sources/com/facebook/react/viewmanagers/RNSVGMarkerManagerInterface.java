package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSVGMarkerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAlign(T t10, String str);

    void setClipPath(T t10, String str);

    void setClipRule(T t10, int i10);

    void setColor(T t10, Integer num);

    void setDisplay(T t10, String str);

    void setFill(T t10, Dynamic dynamic);

    void setFillOpacity(T t10, float f10);

    void setFillRule(T t10, int i10);

    void setFilter(T t10, String str);

    void setFont(T t10, Dynamic dynamic);

    void setFontSize(T t10, Dynamic dynamic);

    void setFontWeight(T t10, Dynamic dynamic);

    void setMarkerEnd(T t10, String str);

    void setMarkerHeight(T t10, Dynamic dynamic);

    void setMarkerMid(T t10, String str);

    void setMarkerStart(T t10, String str);

    void setMarkerUnits(T t10, String str);

    void setMarkerWidth(T t10, Dynamic dynamic);

    void setMask(T t10, String str);

    void setMatrix(T t10, ReadableArray readableArray);

    void setMeetOrSlice(T t10, int i10);

    void setMinX(T t10, float f10);

    void setMinY(T t10, float f10);

    void setName(T t10, String str);

    void setOpacity(T t10, float f10);

    void setOrient(T t10, String str);

    void setPointerEvents(T t10, String str);

    void setPropList(T t10, ReadableArray readableArray);

    void setRefX(T t10, Dynamic dynamic);

    void setRefY(T t10, Dynamic dynamic);

    void setResponsible(T t10, boolean z10);

    void setStroke(T t10, Dynamic dynamic);

    void setStrokeDasharray(T t10, Dynamic dynamic);

    void setStrokeDashoffset(T t10, float f10);

    void setStrokeLinecap(T t10, int i10);

    void setStrokeLinejoin(T t10, int i10);

    void setStrokeMiterlimit(T t10, float f10);

    void setStrokeOpacity(T t10, float f10);

    void setStrokeWidth(T t10, Dynamic dynamic);

    void setVbHeight(T t10, float f10);

    void setVbWidth(T t10, float f10);

    void setVectorEffect(T t10, int i10);
}
