package com.giphyreactnativesdk;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerDelegate;
import com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyVideoViewManagerSpec;", "T", "Landroid/view/View;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/viewmanagers/RTNGiphyVideoViewManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RTNGiphyVideoViewManagerSpec<T extends View> extends SimpleViewManager<T> implements RTNGiphyVideoViewManagerInterface<T> {

    @NotNull
    private final ViewManagerDelegate<T> mDelegate = new RTNGiphyVideoViewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public ViewManagerDelegate<T> getDelegate() {
        return this.mDelegate;
    }
}
