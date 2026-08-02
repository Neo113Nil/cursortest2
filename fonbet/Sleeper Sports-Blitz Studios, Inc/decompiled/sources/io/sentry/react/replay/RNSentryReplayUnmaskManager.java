package io.sentry.react.replay;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerInterface;

@ReactModule(name = RNSentryReplayUnmaskManagerImpl.REACT_CLASS)
/* loaded from: classes9.dex */
public class RNSentryReplayUnmaskManager extends ViewGroupManager<RNSentryReplayUnmask> implements RNSentryReplayUnmaskManagerInterface<RNSentryReplayUnmask> {
    private final RNSentryReplayUnmaskManagerDelegate<RNSentryReplayUnmask, RNSentryReplayUnmaskManager> delegate = new RNSentryReplayUnmaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<RNSentryReplayUnmask> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNSentryReplayUnmaskManagerImpl.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RNSentryReplayUnmask createViewInstance(ThemedReactContext themedReactContext) {
        return new RNSentryReplayUnmask(themedReactContext);
    }
}
