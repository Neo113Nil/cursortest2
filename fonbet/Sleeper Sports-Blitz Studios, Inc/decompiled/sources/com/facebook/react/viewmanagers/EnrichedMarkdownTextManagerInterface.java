package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes6.dex */
public interface EnrichedMarkdownTextManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setIsSelectable(T t, boolean z);

    void setMarkdown(T t, String str);

    void setMarkdownStyle(T t, ReadableMap readableMap);
}
