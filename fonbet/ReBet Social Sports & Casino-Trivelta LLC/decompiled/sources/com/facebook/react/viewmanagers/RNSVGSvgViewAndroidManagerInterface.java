package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSVGSvgViewAndroidManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAccessible(T t10, boolean z10);

    void setAlign(T t10, String str);

    void setBackfaceVisibility(T t10, String str);

    void setBbHeight(T t10, Dynamic dynamic);

    void setBbWidth(T t10, Dynamic dynamic);

    void setBorderBlockColor(T t10, Integer num);

    void setBorderBlockEndColor(T t10, Integer num);

    void setBorderBlockStartColor(T t10, Integer num);

    void setBorderBottomColor(T t10, Integer num);

    void setBorderBottomEndRadius(T t10, Dynamic dynamic);

    void setBorderBottomLeftRadius(T t10, Dynamic dynamic);

    void setBorderBottomRightRadius(T t10, Dynamic dynamic);

    void setBorderBottomStartRadius(T t10, Dynamic dynamic);

    void setBorderColor(T t10, Integer num);

    void setBorderEndColor(T t10, Integer num);

    void setBorderEndEndRadius(T t10, Dynamic dynamic);

    void setBorderEndStartRadius(T t10, Dynamic dynamic);

    void setBorderLeftColor(T t10, Integer num);

    void setBorderRadius(T t10, Dynamic dynamic);

    void setBorderRightColor(T t10, Integer num);

    void setBorderStartColor(T t10, Integer num);

    void setBorderStartEndRadius(T t10, Dynamic dynamic);

    void setBorderStartStartRadius(T t10, Dynamic dynamic);

    void setBorderStyle(T t10, String str);

    void setBorderTopColor(T t10, Integer num);

    void setBorderTopEndRadius(T t10, Dynamic dynamic);

    void setBorderTopLeftRadius(T t10, Dynamic dynamic);

    void setBorderTopRightRadius(T t10, Dynamic dynamic);

    void setBorderTopStartRadius(T t10, Dynamic dynamic);

    void setColor(T t10, Integer num);

    void setFocusable(T t10, boolean z10);

    void setHasTVPreferredFocus(T t10, boolean z10);

    void setHitSlop(T t10, Dynamic dynamic);

    void setMeetOrSlice(T t10, int i10);

    void setMinX(T t10, float f10);

    void setMinY(T t10, float f10);

    void setNativeBackgroundAndroid(T t10, ReadableMap readableMap);

    void setNativeForegroundAndroid(T t10, ReadableMap readableMap);

    void setNeedsOffscreenAlphaCompositing(T t10, boolean z10);

    void setNextFocusDown(T t10, int i10);

    void setNextFocusForward(T t10, int i10);

    void setNextFocusLeft(T t10, int i10);

    void setNextFocusRight(T t10, int i10);

    void setNextFocusUp(T t10, int i10);

    void setPointerEvents(T t10, String str);

    void setRemoveClippedSubviews(T t10, boolean z10);

    void setVbHeight(T t10, float f10);

    void setVbWidth(T t10, float f10);
}
