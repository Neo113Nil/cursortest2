package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBackButtonDisplayMode(T t10, String str);

    void setBackButtonInCustomView(T t10, boolean z10);

    void setBackTitle(T t10, String str);

    void setBackTitleFontFamily(T t10, String str);

    void setBackTitleFontSize(T t10, int i10);

    void setBackTitleVisible(T t10, boolean z10);

    void setBackgroundColor(T t10, Integer num);

    void setBlurEffect(T t10, String str);

    void setColor(T t10, Integer num);

    void setConsumeTopInset(T t10, boolean z10);

    void setDirection(T t10, String str);

    void setDisableBackButtonMenu(T t10, boolean z10);

    void setHeaderLeftBarButtonItems(T t10, ReadableArray readableArray);

    void setHeaderRightBarButtonItems(T t10, ReadableArray readableArray);

    void setHidden(T t10, boolean z10);

    void setHideBackButton(T t10, boolean z10);

    void setHideShadow(T t10, boolean z10);

    void setLargeTitle(T t10, boolean z10);

    void setLargeTitleBackgroundColor(T t10, Integer num);

    void setLargeTitleColor(T t10, Integer num);

    void setLargeTitleFontFamily(T t10, String str);

    void setLargeTitleFontSize(T t10, int i10);

    void setLargeTitleFontWeight(T t10, String str);

    void setLargeTitleHideShadow(T t10, boolean z10);

    void setLegacyTopInsetBehavior(T t10, boolean z10);

    void setSynchronousShadowStateUpdatesEnabled(T t10, boolean z10);

    void setTitle(T t10, String str);

    void setTitleColor(T t10, Integer num);

    void setTitleFontFamily(T t10, String str);

    void setTitleFontSize(T t10, int i10);

    void setTitleFontWeight(T t10, String str);

    void setTopInsetEnabled(T t10, boolean z10);

    void setTranslucent(T t10, boolean z10);

    void setUserInterfaceStyle(T t10, String str);
}
