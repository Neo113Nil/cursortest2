package com.rnlineargradient;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNLinearGradientManagerInterface;

/* loaded from: classes8.dex */
public abstract class LinearGradientManagerSpec<T extends View> extends SimpleViewManager<T> implements RNLinearGradientManagerInterface<T> {
    private final ViewManagerDelegate<T> mDelegate = new RNLinearGradientManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<T> getDelegate() {
        return this.mDelegate;
    }
}
