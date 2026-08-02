package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RTNGiphyGridViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCellPadding(T t10, int i10);

    void setClipsPreviewRenditionType(T t10, String str);

    void setContent(T t10, String str);

    void setDisableEmojiVariations(T t10, boolean z10);

    void setFixedSizeCells(T t10, boolean z10);

    void setOrientation(T t10, String str);

    void setRenditionType(T t10, String str);

    void setShowCheckeredBackground(T t10, boolean z10);

    void setSpanCount(T t10, int i10);

    void setTheme(T t10, String str);
}
