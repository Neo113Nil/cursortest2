package io.agora.rtc.ng.react;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.AgoraRtcSurfaceViewManagerDelegate;
import com.facebook.react.viewmanagers.AgoraRtcSurfaceViewManagerInterface;

/* loaded from: classes3.dex */
public abstract class AgoraRtcSurfaceViewManagerSpec<T extends View> extends SimpleViewManager<T> implements AgoraRtcSurfaceViewManagerInterface<T> {
    private final ViewManagerDelegate<T> mDelegate = new AgoraRtcSurfaceViewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<T> getDelegate() {
        return this.mDelegate;
    }
}
