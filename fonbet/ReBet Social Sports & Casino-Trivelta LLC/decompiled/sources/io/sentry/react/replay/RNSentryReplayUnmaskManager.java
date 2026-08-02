package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerInterface;

@ReactModule(name = "RNSentryReplayUnmask")
/* loaded from: classes3.dex */
public class RNSentryReplayUnmaskManager extends ViewGroupManager<b> implements RNSentryReplayUnmaskManagerInterface<b> {
    private final RNSentryReplayUnmaskManagerDelegate<b, RNSentryReplayUnmaskManager> delegate = new RNSentryReplayUnmaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<b> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSentryReplayUnmask";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public b createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new b(themedReactContext);
    }
}
