package io.sentry.react.replay;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerInterface;

@ReactModule(name = RNSentryReplayMaskManagerImpl.REACT_CLASS)
/* loaded from: classes9.dex */
public class RNSentryReplayMaskManager extends ViewGroupManager<RNSentryReplayMask> implements RNSentryReplayMaskManagerInterface<RNSentryReplayMask> {
    private final RNSentryReplayMaskManagerDelegate<RNSentryReplayMask, RNSentryReplayMaskManager> delegate = new RNSentryReplayMaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<RNSentryReplayMask> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNSentryReplayMaskManagerImpl.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RNSentryReplayMask createViewInstance(ThemedReactContext themedReactContext) {
        return new RNSentryReplayMask(themedReactContext);
    }
}
