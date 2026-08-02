package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityState(T t10, float f10);

    void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(T t10, boolean z10);

    void setBottomScrollEdgeEffect(T t10, String str);

    void setCustomAnimationOnSwipe(T t10, boolean z10);

    void setFullScreenSwipeEnabled(T t10, String str);

    void setFullScreenSwipeShadowEnabled(T t10, boolean z10);

    void setGestureEnabled(T t10, boolean z10);

    void setGestureResponseDistance(T t10, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t10, boolean z10);

    void setHomeIndicatorHidden(T t10, boolean z10);

    void setIos26AllowInteractionsDuringTransition(T t10, boolean z10);

    void setLeftScrollEdgeEffect(T t10, String str);

    void setNativeBackButtonDismissalEnabled(T t10, boolean z10);

    void setNavigationBarColor(T t10, Integer num);

    void setNavigationBarHidden(T t10, boolean z10);

    void setNavigationBarTranslucent(T t10, boolean z10);

    void setPreventNativeDismiss(T t10, boolean z10);

    void setReplaceAnimation(T t10, String str);

    void setRightScrollEdgeEffect(T t10, String str);

    void setScreenId(T t10, String str);

    void setScreenOrientation(T t10, String str);

    void setSheetAllowedDetents(T t10, ReadableArray readableArray);

    void setSheetCornerRadius(T t10, float f10);

    void setSheetDefaultResizeAnimationEnabled(T t10, boolean z10);

    void setSheetElevation(T t10, int i10);

    void setSheetExpandsWhenScrolledToEdge(T t10, boolean z10);

    void setSheetGrabberVisible(T t10, boolean z10);

    void setSheetInitialDetent(T t10, int i10);

    void setSheetLargestUndimmedDetent(T t10, int i10);

    void setSheetShouldOverflowTopInset(T t10, boolean z10);

    void setStackAnimation(T t10, String str);

    void setStackPresentation(T t10, String str);

    void setStatusBarAnimation(T t10, String str);

    void setStatusBarColor(T t10, Integer num);

    void setStatusBarHidden(T t10, boolean z10);

    void setStatusBarStyle(T t10, String str);

    void setStatusBarTranslucent(T t10, boolean z10);

    void setSwipeDirection(T t10, String str);

    void setSynchronousShadowStateUpdatesEnabled(T t10, boolean z10);

    void setTopScrollEdgeEffect(T t10, String str);

    void setTransitionDuration(T t10, int i10);
}
